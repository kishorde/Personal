var msg = "hello";
console.log(msg);
var num1 = 20;
console.log(num1);
var num2;
num2 = 10;
num2 = "hello";
num2 = true;
// let num3=10;
// num3="Hello"; //cannot assign another type to num3:
//union type
var a;
a = 20;
a = "Hello";
//a=true; cannot take boolean as it is restricted to number and string:
var namee = "Kishor";
var msg1 = "welcome ".concat(namee);
console.log(msg1);
//array
// two ways of declaring array
var list1 = [1, 2, 3, 4, 5, 6];
var list2 = [10, 20, 30, 40];
console.log(list1);
console.log(list2);
var colors;
(function (colors) {
    colors[colors["Red"] = 0] = "Red";
    colors[colors["Green"] = 1] = "Green";
    colors[colors["Blue"] = 2] = "Blue";
})(colors || (colors = {}));
;
var c = colors.Green;
console.log(c);
//function in typescript:
function add(n1, n2) {
    return n1 + n2;
}
var sum = add(5, 10);
console.log(sum);
//optional parameter
function add1(n1, n2, n3, n4) {
    if (n4)
        return n1 + n2 + n3 + n4;
    else if (n3)
        return n1 + n2 + n3;
    else if (n2)
        return n1 + n2;
    else
        return n1;
}
console.log("Optional Parameter:");
var sum1 = add1(5);
var sum2 = add1(5, 10);
var sum3 = add1(5, 10, 30);
var sum4 = add1(5, 10, 30, 50);
console.log(sum1);
console.log(sum2);
console.log(sum3);
console.log(sum4);
console.log("-------------");
//default parameter
function add3(n1, n2) {
    if (n2 === void 0) { n2 = 20; }
    return n1 + n2;
}
var sum3 = add3(5);
console.log(sum3);
