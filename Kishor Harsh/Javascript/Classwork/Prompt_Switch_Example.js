alert("1:add 2:sub");
var ch=parent(prompt("Enter your choice:",""))
var a=parseInt(prompt("Enter First Number:",""))
var b=parseInt(prompt("Enter Second Number:",""))

switch(ch)
{
    case 1:
        alert("addition is:"+a+b)
    break;

    case 2:
        alert("Sub is:"+a-b)
    
}