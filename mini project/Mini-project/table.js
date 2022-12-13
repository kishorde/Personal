$(document).ready(function () {
    // $('#adminPage').hide();
    // if(sessionStorage.getItem("name")=="Admin"){
    //     $('#adminPage').show();
    // }

    fetchData();
    // FETCHING DATA FROM JSON FILE
    function fetchData() {
        k = 0;
        $.getJSON("http://localhost:3000/cartdetails",
            function (data) {
                var user = '';
                // console.log(JSON.parse(data[0].cartdetails[0].item_price));

                // ITERATING THROUGH OBJECTS
                $.each(data, function (key, value) {
                    console.log(key);
                    //CONSTRUCTION OF ROWS HAVING
                    // DATA FROM JSON OBJECT
                    user += '<tr>';
                    user += '<td >' +
                        // console.log(value.cartdetails[key].item_name[key])
                        value.name + '</td>';

                    user += '<td >' +
                        value.category + '</td>';

                    user += '<td >' +
                        value.price + '</td>';


                    user += '<td >' +
                        value.quantity + '</td>';
                    k = k + parseInt(value.quantity) * parseInt(value.price);
                    console.log(k);



                    // console.log(value.user[1].name) ;

                    //user += '<td> <buttton><a href="#" aid=' + value.id + ' onclick="acceptQuestion(this)">Accept</a></button></td>';
                    user += '<td> <buttton><a href="#" aid=' + value.id + ' onclick="deleteQuestion(this)">Delete</a></button></td>';


                    // user += '<td >' +
                    //     value.avl_quantity + '</td>';

                    user += '</tr>';

                });
                // console.log(value.avl_quantity);

                //INSERTING ROWS INTO TABLE
                $('#table').append(user);
                $('#tot').k;

            });
    }
    fetch('http://localhost:3000/itemdetails')
        .then(function (response) {
            return response.json();
        })
        .then(function (data) {
            appendData(data);
        })
        .catch(function (err) {
            console.log('error: ' + err);
        });
    //to print a particular value
    function appendData(data) {
        var mainContainer = document.getElementById("pretotal");
        var div = document.createElement("div");
        div.innerHTML = k;
        // console.log(data[1].item_order[1]);
        mainContainer.appendChild(div);

        var mainContainer = document.getElementById("ship");
        var div = document.createElement("div");
        s = 40;
        div.innerHTML = s;
        // console.log(data[1].item_order[1]);
        mainContainer.appendChild(div);

        var mainContainer = document.getElementById("tax");
        var div = document.createElement("div");
        tx = 18;
        div.innerHTML = tx + "%";
        // console.log(data[1].item_order[1]);
        mainContainer.appendChild(div);

        var mainContainer = document.getElementById("finaltotal");
        var div = document.createElement("div");
        div.innerHTML = k + s + (k * 0.18);
        // console.log(data[1].item_order[1]);
        mainContainer.appendChild(div);
    }

});




function deleteQuestion(id) {
    var key;
    if (confirm('Are you sure?')) {
        key = $(id).attr('aid');
    }

    $.ajax({
        url: " http://localhost:3000/cartdetails/" + key,
        type: "delete",
        dataType: 'JSON',
        success: function () {
            console.log("done")
        },
        error: function () {
            console.log("done")
        }

    });

}




//--------------------------------------------------------------------------------------------------------------------------------------------
//FOR FAVOURITE

$(document).ready(function () {
    
    fetchData();
    // FETCHING DATA FROM JSON FILE
    function fetchData() {
        $.getJSON("http://localhost:3000/addToFav",
        // $.getJSON("http://localhost:3000/1/addToFav",

            function (data) {
                var user = '';
                

                // ITERATING THROUGH OBJECTS
                $.each(data, function (key, value) {
                    console.log(key);
                    //CONSTRUCTION OF ROWS HAVING
                    // DATA FROM JSON OBJECT
                    user += '<tr>';
                    user += '<td >' +
                        // console.log(value.cartdetails[key].item_name[key])
                        value.name + '</td>';
                    user += '<td >' +
                        value.category + '</td>';        
                    user += '<td >' +
                        value.price + '</td>';              
                    user += '<td> <buttton><a href="#" aid=' + value.id + ' onclick="delete1(this)">Delete</a></button></td>';
                    user += '</tr>';
                });

                //INSERTING ROWS INTO TABLE
                $('#table1').append(user);

            });
    }
});
function delete1(id) {
    var key;
    if (confirm('Are you sure?')) {
        key = $(id).attr('aid');
    }

    $.ajax({
        url: " http://localhost:3000/addToFav/" + key,
        // url: " http://localhost:3000/users/"+ key+"/addToFav",

        
        type: "delete",
        dataType: 'JSON',
        success: function () {
            console.log("done")
        },
        error: function () {
            console.log("done")
        }

    });

}


$(document).ready(function () {
    $('button').click(function(){
    $.ajax({
        type: "PUT",
        url: "http://localhost:3000/cartdetails/",
        data:{},
        dataType: "JSON",
    });
});
});
