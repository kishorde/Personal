import { Employee } from "./classDemo";
import { Test } from "./classDemo";
import { sayHello} from "./classDemo";
import d from "./classDemo"; // can use any name for default method:
import { sayHello as hello} from "./classDemo"; // alias name
//import { Employee, Test, sayHello } from "./classDemo";
class Manager extends Employee
{
    // empSalary:number;
   
    constructor(public empId:number, public name:string, public department:string,public empSalary:number)
    {
        super(empId,name,department)
        // this.empSalary = empSalary;
    }

    getEmpInfo()
    {
        return this.empId + " "+ this.name + " "+ this.department+ " "+ this.empSalary;      
    }
    

}
// let emp:Employee = new Employee(101,"Kishor","Training");
// console.log(emp.getEmpInfo());

// let manager:Manager = new Manager(101,"Ujjwal","Training",95000);
// console.log(manager.getEmpInfo());

// let test:Test = new Test();
console.log(sayHello());
d();
