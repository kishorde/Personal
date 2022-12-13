var lang=['HTML','JAVA','CSS','JS','PYTHON']


// for(var i=0;i<lang.length;i++)
// {
//     document.getElementById("for_output").innerHTML+=lang[i]+"<br>"
// }


// for(var i=0;i<lang.length;i++)
// {
//     document.getElementById("order_list_lang").innerHTML+="<li>"+lang[i]+"</li>"
// }

// for-in
// for(var x in lang)
// {
//     document.getElementById("order_list_lang").innerHTML+="<li>"+x +" :- "+lang[x]+"</li>";
// }

// for-of
// for(var x of lang)
// {
//     document.getElementById("order_list_lang").innerHTML+="<li>"+x+"</li>";
// }


//while loop

// var i=0;
// while(i<lang.length)
// {
//     document.getElementById("order_list_lang").innerHTML+="<li>"+lang[i]+"</li>";
//     i++;
// }


// // break

// var j=0;
// while(j<=5)
// {
//     if(j==2)
//         break;
//     console.log(j);
//     j++;
// }
// console.log("value of j : ",j);


//continue

// var j=0;
// while(j<=5)
// {
//     if(j==2)
//     {
//         continue;
//         j++;
//     }
//     console.log(j);
    
// }
// console.log("value of j : ",j);
// -------------------------------------

for(var j=0;j<=5;j++)
{
    if(j==2)
        continue;
    console.log(j);
}
