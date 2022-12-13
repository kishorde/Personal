// var book={
//     bookName:"C Programming",
//     authorName:"Harsh Shahu",
//     price:5000,
//     show:function() 
//     {
//         console.log(this.bookName+"   "+this.authorName);
//     }
// };

// book.show()
// // console.log(book.price);
// console.log(book['price']);

//Assignment

var Movie={
    movieName:"KGF10",
    movieDirector:"Kishor Deshmukh",
    releaseDate:"29/08/2029",

    Display:function()
    {
        console.log(this.movieName);
        console.log(this.movieDirector);
        console.log(this.releaseDate);
    }
};

Movie.Display()