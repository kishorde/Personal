
function evenAndOddcheck()
{
    console.log("In function")

    var n=document.getElementById("n1").value;
    console.log(n);
    if(n%2==0)
    {
        document.write(n+" is even Number")
    }
    else{
        document.write(n+" is odd Number");
    }
}

