
let sess_id = sessionStorage.getItem("session_id");
$(document).ready(function () {
    $('button').click(function () {

        // if validate then execute this ajax query


        // id=$('#id').val();

        $.ajax({
            type: "GET",
            dataType: "json",
            url: "http://localhost:3000/users/" + sess_id,
            success: function (data) {
                alert("got what u wanted")
                console.log(data);

                let record = {
                    FirstName: data.FirstName,
                    LastName: data.LastName,
                    Email: data.Email,
                    UserName: data.UserName,
                    Number: data.Number,
                    Password: $('#Password').val(),
                    Photo: $('#Photo').val()
                }
                $.ajax({

                    type: "PUT",
                    dataType: "json",
                    url: "http://localhost:3000/users/" + id,
                    data: record,
                    success: function (data) {
                        alert("Updated...")
                    }

                });

            }
        });


    })
});



$.getJSON('http://localhost:3000/users/' + sess_id, function (data) {
    var display = `Profile Picture<br><img src="${data.Photo}" id="profimage" class="profile_image"><br> <br>
    First Name:<h2 id="fname">${data.FirstName}</h2>
    Last Name:<h2 id="lname">${data.LastName}</h2>
    User Name:<h2 id="uname">${data.UserName}</h2>
    Email Address:<h2 id="email">${data.Email}</h2>
    Mobile Number:<h2 id="mobno">${data.Number}</h2>
                    `

    $(".Profileinfo").html(display);
});