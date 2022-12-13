$(document).ready(function () {
  var check = false;
  $("#Password").on('keyup', function () {
    check = true;
    $("#pwd").html("");
  });
  $("#confirmPass").on('keyup', function () {
    let Password = $('#Password').val();
    let ConfirmPassword = $('#confirmPass').val()
    if (Password != ConfirmPassword) {
      $("#cpwd").html("Password does not match !").css("color", "red");
      check = false;
    }
    else {
      $("#cpwd").html("Password match !!").css("color", "green");
      check = true;
    }
  });

  $("#button").click(function () {

    var FirstName = $('#FirstName').val();
    var LastName = $('#LastName').val();
    var Email = $('#Email').val();
    var Number = $('#Number').val();
    var UserName = $('#UserName').val();
    var Photo = $('#Photo').val();
    var Password = $('#Password').val();
    var ConfirmPassword = $('#confirmPass').val();

    var open = true;

    /////

    var usernamecheck = /^[A-Za-z._@][A_za-z]{3,30}/;

    var firstnamecheck = /[A-za-z]{3,10}$/;
    var lastnamecheck = /[A-za-z]{3,10}$/;
    var emailcheck = /^[A-Za-z.@]{3,30}$/;
    var numbercheck = /^[789][0-9]{9}$/;
    var passwordcheck = /^[a-zA-Z]{5,16}(?=.*[0-9])(?=.*[!@#$])/;
    var confirmpassword = /^[a-zA-Z]{5,16}(?=.*[0-9])(?=.*[!@#$])/;

    if (firstnamecheck.test(FirstName)) {
      document.getElementById('fname').innerHTML = " ";

    }
    else {
      document.getElementById('fname').innerHTML = "First name is invalid";
      document.getElementById("fname").style.color = "red";

      return false;
    }
    if (lastnamecheck.test(LastName)) {
      document.getElementById('lname').innerHTML = " ";


    } else {
      document.getElementById('lname').innerHTML = "last name is invalid";
      document.getElementById("lname").style.color = "red";
      return false;
    }
    if (emailcheck.test(Email)) {
      document.getElementById('email').innerHTML = " ";
    }

    else {
      document.getElementById('email').innerHTML = "email is invalid";
      document.getElementById("email").style.color = "red";
      return false;
    }

    if (numbercheck.test(Number)) {
      document.getElementById('number').innerHTML = " ";


    } else {
      document.getElementById('number').innerHTML = "number is invalid";
      document.getElementById("number").style.color = "red";
      return false;
    }

    if (usernamecheck.test(UserName)) {
      document.getElementById('uname').innerHTML = " ";


    } else {
      document.getElementById('uname').innerHTML = "User name is invalid";
      document.getElementById("uname").style.color = "red";
      return false;
    }

    const details = { FirstName, LastName, Email, UserName, Password, Number, Photo, Password }
    console.log(details);
    if (check) {
      $.ajax({

        type: "post",
        dataType: "json",
        url: "http://localhost:3000/users",
        data: details,
        success: function (data) {

          $("#form1").submit();
          alert("Registration has been done");

          console.log(data);
        }
      });
    }



  })
});