function add(n1,n2)
{
    return n1+n2;
}

console.log(add(20,140));


console.log("-----");


// Annonymous Function

let display=function(){
    console.log("displaying things");
}

display();
console.log("-----");


// arrow function

let display1=()=>console.log("displaying arrow function");


display1();


let f1=a=>a*a;


console.log(f1(100));

// arrow funt for add

let add1=(a,b)=> a+b;


console.log(add1(4,5));


// default value     

function add2(n1,n2=200)
{
    return n1+n2;
}

console.log(add2(10,30));

// default value using arrow

let add3=(a,b=100)=> a+b;

console.log(add3(10,33));
