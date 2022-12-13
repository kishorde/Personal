var arr=[10,20,30,2,1,4,5,8]

console.log(arr);

console.log(arr.push(20));
console.log("Array after push : ",arr);

console.log("pop method",arr.pop());
console.log("Array after pop : ",arr);

console.log("Join method:",arr.join());

console.log("Shift method:",arr.shift());
console.log("Array after shift: ",arr);

console.log("Unshift method:",arr.unshift(22));
console.log("Array after shift: ",arr);

console.log("Concat method :", arr.concat([78,79,80]));
console.log("Array after concat :",arr);

var arr1= arr.concat([1,2,3,4]);
console.log("Array  1 :",arr1);


console.log("Revers Method:",arr.reverse());
console.log("Array after reverse:",arr);


var names=["abc","def","ghi","jkl","mno"]

console.log("Splice method remove",names.splice(2,2));
console.log("after splice:",names);


console.log("Splice method add",names.splice(0,0,"gfdf","xyz"));
console.log("after splice:",names);


console.log("slice method ",);