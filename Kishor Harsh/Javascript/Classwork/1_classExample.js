class Book
{
    // constructor()   //default constructor   //when passing parameter it is called as parametrized constructor
    // {
    //     console.log("Default constructor");
    // }


    constructor(bn,an,p)
    {
        console.log("parametrized constructor");
        this.bookname=bn;
        this.authorname=an;
        this.price=p;
    }

    show()
    {
        console.log("Class method");
    }

    show1()
    {
        console.log(this.bookname," ",this.authorname," ",this.price);
    }
}

var obj1=new Book();    //object creation

obj1.show();        // function call


var obj2=new Book("C prog","Ajay Mittal",700);

obj2.show1()
