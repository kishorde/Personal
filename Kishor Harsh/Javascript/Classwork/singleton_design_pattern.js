// //Function Expression
// const f=(function()
// {
//     function book()
//     {
//         //constructor function

//         this.bn="book1"
//         this.an="Author1"
//     }
//     let object;
//     function createBookObject() 
//     {
//         object=new book()
//         return object
//     }
//     return{
//         getObject:()=>
//         {
//             if(!object)
//                 object=createBookObject()
//             return object
//         }
//     }
// })()

// const b1=f.getObject()
// const b2=f.getObject()

// console.log(b1===b2);






class Book
{
    constructor()
    {
        this.bn="book1";
        this.an="author1";
    }

    createbookobject()
    {
        this.obj=new Book();       
    }

    getobject()
    {
        if(!obj)
            this.createbookobject()
        return this.obj;
    }
}

// var b1=getobject()

