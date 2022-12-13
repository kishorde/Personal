$(document).ready(function () {

    // use keyup event on email field 
    $("#email").keyup(function () {
        if (validateEmail()) {
            // if the email is validated 
            // set input email border green 
            $("#email").css("border", "2px solid green");
            // and set label 
            $("#emailMsg").html("<p class='text-success'>Validated</p>");
        } else {
            // if the email is not validated 
            // set border red 
            $("#email").css("border", "2px solid red");
            $("#emailMsg").html("<p class='text-danger'>Un-validated (Please make sure it contains @ and .)</p>");
        }
        // buttonState(); 
    });

    // // use keyup event on password 
    // $("#pass").keyup(function () {
    //     // check 
    //     if (validatePassword()) {
    //         // set input password border green 
    //         $("#pass").css("border", "2px solid green");
    //         //set passMsg 
    //         $("#passMsg").html("<p class='text-success'>Password validated</p>");
    //     } else {
    //         // set input password border red 
    //         $("#pass").css("border", "2px solid red");
    //         //set passMsg 
    //         $("#passMsg").html("<p class='text-danger'>Password not valid</p>");
    //     }
    //     //  buttonState(); 
    // });


    // function buttonState(){
    //     if(validateEmail() && validatePassword()){ 
    //         // if the both email and password are validate 
    //         // then button should show visible 
    //         $("#btn").show(); 
    //     }else{ 
    //         // if both email and pasword are not validated 
    //         // button state should hidden 
    //         $("#btn").hide(); 
    //     } 
    // }

    function validateEmail() {
        // get value of input email 
        var email = $("#email").val();
        // use reular expression 
        var reg = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
        if (reg.test(email)) {
            return true;
        } else {
            return false;
        }
    }

    // function validatePassword() {
    //     //get input password value 
    //     var pass = $("#pass").val();
    //     // check it s length 
    //     if (pass.length > 7) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // post('http://localhost:3000/details',loginDetails)
    //     .then(function (response) {
    //         return response.json();
    //     })
    //     .then(function (data) {
    //         appendData(data);
    //     })
    //     .catch(function (err) {
    //         console.log('error: ' + err);
    //     });
    //to print a particular value
    //function appendData(data) {
    //  let m = console.log(data[0].emailid);
    //  let n = console.log(data[0].passwordid);
    // let j = 7687;

    // if(email==m){
    //     console.log("Hyder");
    // }else{
    //     console.log('email id is : '+email);

    // }
    // if (m==j)
    // {
    //     console.log("Hyder");

    // }
    // else{
    //     console.log("Kunal");
    // }

    //     var jsonString = JSON.stringify(loginDataList);
    //     console.log(jsonString);
    //     if(jsonString.indexOf('username') && jsonString.indexOf('password')){
    //         alert("Present");
    //     }
    //     else{
    //         alert("Not");
    //     }
    // }

    // if (sessionStorage.length > 1) {
    //     window.location.href = "../index.html";
    // }

    function respond() {
        window.location.href = "index.html";
    }
    $("#button").click(function (e) {

        var email = $('#email').val();
        var password = $('#pass').val();

        $.getJSON("http://localhost:3000/users",
            function (data) {
                $.each(data, function (key, value) {
                    console.log("efdyf");
                    if (value.Email === email && value.Password === password) {
                        sessionStorage.setItem("uname", value.UserName);
                        sessionStorage.setItem("session_id",value.id);
                        $('form').submit();
                        // location.replace("https://www.w3schools.com");

                        window.location.replace("index.html");
                        
                        // window.open("../index.html");


                        // } else if (userName === "admin@cybage.com" && password === "admin@123") {
                        //     sessionStorage.setItem("admin", "Admin");
                        //     window.location.href = "admin.html";
                        //     // window.open("admin.html");

                        //     // $('form').submit();
                    } else {
                        $('#msg').html("<b>Incorrect Email or Password .</b><br><br>").css("color", "red");
                        // setTimeout(() => {

                        // }, 1000)

                    }

                });
            });
    });
});
