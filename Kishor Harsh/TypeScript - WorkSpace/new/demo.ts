let msg:string="hello";
console.log(msg);

let num1:number=20;
console.log(num1);

let num2:any;
num2=10;
num2="hello";
num2=true;

// let num3=10;
// num3="Hello"; //cannot assign another type to num3:

//union type
let a: number | string;
a=20;
a="Hello";
//a=true; cannot take boolean as it is restricted to number and string:


let namee:string="Kishor";

let msg1:string=`welcome ${namee}`;
console.log(msg1);


//array
// two ways of declaring array

var list1:number[]=[1,2,3,4,5,6];
let list2:Array<number>=[10,20,30,40];

console.log(list1);
console.log(list2);

enum colors{Red,Green,Blue};

let c:colors=colors.Green;
console.log(c);

//function in typescript:
function add(n1:number, n2:number):number
{
    return n1+n2;

}
var sum = add(5,10);
console.log(sum);


//optional parameter
function add1(n1:number, n2?:number, n3?:number,n4?:number):number
{
    if(n4)
        return n1+n2+n3+n4;
    else if(n3)
        return n1+n2+n3;
    else if(n2)
        return n1+n2;
    else
        return n1;
}

console.log("Optional Parameter:");
 var sum1 = add1(5);
var sum2 = add1(5,10);
var sum3 = add1(5,10,30);
var sum4 = add1(5,10,30,50);
 console.log(sum1);
console.log(sum2);
console.log(sum3);
console.log(sum4);
console.log("-------------");


//default parameter
function add3(n1:number,n2:number=20):number{
    return n1+n2;
}

var sum3=add3(5);
console.log(sum3);

