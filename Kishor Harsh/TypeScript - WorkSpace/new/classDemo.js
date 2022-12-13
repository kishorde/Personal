"use strict";
exports.__esModule = true;
exports.sayHello = exports.Test = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    //parameterized constructor:
    function Employee(empId, name, department) {
        this.empId = empId;
        this.name = name;
        this.department = department;
    }
    Employee.prototype.getEmpInfo = function () {
        return this.empId + " " + this.name + " " + this.department;
    };
    return Employee;
}());
exports.Employee = Employee;
var Test = /** @class */ (function () {
    function Test() {
    }
    return Test;
}());
exports.Test = Test;
function sayHello() {
    return "Hello from Ujjwal";
}
exports.sayHello = sayHello;
//any number of name export:
//only one default export:
function display() {
    console.log("display method..");
}
exports["default"] = display;
// class Manager extends Employee
// {
//     // empSalary:number;
//     constructor(public empId:number, public name:string, public department:string,public empSalary:number)
//     {
//         super(empId,name,department)
//         // this.empSalary = empSalary;
//     }
//     getEmpInfo()
//     {
//         return this.empId + " "+ this.name + " "+ this.department+ " "+ this.empSalary;      
//     }
// }
// // let emp:Employee = new Employee(101,"Kishor","Training");
// // console.log(emp.getEmpInfo());
// let manager:Manager = new Manager(101,"Ujjwal","Training",95000);
// console.log(manager.getEmpInfo());
