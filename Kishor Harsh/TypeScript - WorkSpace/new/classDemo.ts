export class Employee
{
    //parameterized constructor:
    constructor (public empId:number, public name:string, public department:string)
    {
       
    }
    getEmpInfo()
    {
        return this.empId + " "+ this.name + " "+ this.department;
    }
}

export class Test
{

}

export function sayHello()
{
    return "Hello from Ujjwal";
}

//any number of name export:
//only one default export:
export default function display()
{
    console.log("display method..");
}
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






