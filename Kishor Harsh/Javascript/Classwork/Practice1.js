function Division() {
    
    var n1=document.getElementById("n1").value;
    var n2=document.getElementById("n2").value;
    var result=n1/n2;

    document.getElementById("result").value=result.toFixed(2);
    document.getElementById("output").innerHTML="<h1> division is "+result.toFixed()+"</h1><br>"
    // document.getElementById("output").innerText=result;

}