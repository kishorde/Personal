"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var classDemo_1 = require("./classDemo");
var classDemo_2 = require("./classDemo");
var classDemo_3 = require("./classDemo"); // can use any name for default method:
//import { Employee, Test, sayHello } from "./classDemo";
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    // empSalary:number;
    function Manager(empId, name, department, empSalary) {
        var _this = _super.call(this, empId, name, department) || this;
        _this.empId = empId;
        _this.name = name;
        _this.department = department;
        _this.empSalary = empSalary;
        return _this;
        // this.empSalary = empSalary;
    }
    Manager.prototype.getEmpInfo = function () {
        return this.empId + " " + this.name + " " + this.department + " " + this.empSalary;
    };
    return Manager;
}(classDemo_1.Employee));
// let emp:Employee = new Employee(101,"Kishor","Training");
// console.log(emp.getEmpInfo());
// let manager:Manager = new Manager(101,"Ujjwal","Training",95000);
// console.log(manager.getEmpInfo());
// let test:Test = new Test();
console.log((0, classDemo_2.sayHello)());
(0, classDemo_3["default"])();
