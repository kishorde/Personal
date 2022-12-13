class student
{
   id
   name
   per

   constructor(i,n,p)
   {
        this.id=i
        this.name=n
        this.per=p
   }
   show()
   {
       console.log(this.id,this.name,this.per);
   }
}
var obj=new student(1,"amit",99.78);
obj.show();