class Employee
{
    id
    name
    salary

    constructor(i,n)
    {
        this.id=i;
        this.name=n;

    }

    show()
    {
        console.log(this.id,"  ",this.name,"  ",this.salary);
    }
}

class partTimeEmployee extends Employee
{
    no_hrs
    hrs_salary

    constructor(i,n,nh,hs)
    {
        super(i,n)
        this.no_hrs=nh;
        this.hrs_salary=hs;
    }
    
    cal_sal()
    {
        this.salary=this.no_hrs*this.hrs_salary;
    }
}

var obj=new partTimeEmployee(22,"kishor",30,700);

obj.cal_sal();
obj.show();