function getProductInfo() {
    let productInfo = {
        id: cartItemId,
        imgSrc: product.querySelector('.product-img').src,
        name: product.querySelector('.item-name').textContent,
        category: product.querySelector('.item_category').textContent,
        price: product.querySelector('.item_price').textContent,
    }

    cartItemId++;
    addToCartList(productInfo);
    console.log(productInfo);
}


function checkout() {
    var name = document.getElementById("item1_name")
    console.log("name is", name);
}

let products = [];
function toShow(x) {
    $('#menu').empty();
    x.map((menu) => {
        //var item = menu;
        $('#menu').append(`
                                    <div id="product" class="items card border-start"><br>
                                        <img class="product-img rounded" id="item_img" src="${menu.item_img}" alt="" height="35%" width="100%">
                                        <center>
                                                <h4 class="item_name" id="item1_name">${menu.item_name}</h4>
                                        </center>
                                    
                                         <h6 class="item_category" id="item1_category">Category : ${menu.item_category}</h6>
                                    
                                    <h3 class="item_price text-center" id="item1_price">₹ ${menu.item_price}</h3>
                                    <div>
                                        <center><label for=""><h5>Select Quantity:</h5></label>
                                            <select name="" id="qty" >
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                                <option value="4">4</option>
                                            </select>
                                        </center><br>
                                    </div>
                                    <div class="text-center">
                                        <button id="prod1" class="btn px-5 mb-3 btn-outline-primary" onClick="checkout('${encodeURIComponent(JSON.stringify(menu))}',getOption)">Add to Cart</button>
                                    </div>

                                    <div class="text-center">
                                        <img src="/Images/like.png" style="height:2rem ;width:2rem;">
                                        <a href="#" onClick="addToFav('${encodeURIComponent(JSON.stringify(menu))}')">Add to fav</a>
                                        <a id="rgt2" href="#">Rate/Comment</a>
                                    </div>
                                    </div>
                                    

                                


                                `);
    });

}


function addToFav(menu) {
    favObj = JSON.parse(decodeURIComponent(menu));

    console.log(favObj.id + ' ' + favObj.item_name);
    $(document).ready(function () {
        $.ajax({
            type: "GET",
            url: "http://localhost:3000/itemdetails/",
            dataType: "JSON",
            success: function (data) {
                products = data;
                toShow(products);
                //console.log(products);
            }
        });

        let favrec = {
            id: favObj.id,
            name: favObj.item_name,
            category: favObj.item_category,
            price: favObj.item_price,

        }


        $.ajax({
            type: "POST",
            dataType: "JSON",
            url: "http://localhost:3000/addToFav",
            data: favrec,
            success: function (data) {
                console.log(data);
            }
        });
    });
}
function getOption(userSelectedElement) {
    selectElement = userSelectedElement.querySelector('#qty');
    output = selectElement.value;
    console.log(output);
    return output;
}


function checkout(menu, getOption) {
    menuObj = JSON.parse(decodeURIComponent(menu));
    const products = document.getElementsByClassName('col-3 border-start');
    var product;
    for (var j = 0; j < products.length; j++) {
        product = products[j];
        var itemNameElement;
        var itemName;
        for (var i = 0; i < product.children.length; i++) {
            var child = product.children[i];
            //console.log(child);
            //console.log(child.className);
            itemNameElement = child.getElementsByTagName('h4');
            if (itemNameElement.length > 0) {
                break;
            }

        }
        if (itemNameElement.length > 0) {
            //console.log(itemName[0]);
            console.log(itemNameElement);
            itemName = itemNameElement[0].childNodes[0].data;
            if (itemName == menuObj.item_name) {
                break;
            }
        }
    }

    var qty = getOption(product);
    console.log(menu, qty);

    //console.log(menuObj);
    //console.log(menuObj.id+' '+menuObj.item_name);
    // console.log(qty);

    let ordrec = {
        id: menuObj.id,
        name: menuObj.item_name,
        category: menuObj.item_category,
        price: menuObj.item_price,
        quantity: qty

    }
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url: "http://localhost:3000/cartdetails",
        data: ordrec,
        success: function (data) {
            console.log(data);
        }
    });
}
$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "http://localhost:3000/itemdetails/",
        dataType: "JSON",
        success: function (data) {
            products = data;
            toShow(products);
            //console.log(products);
        }
    });



})