package com.cybage.pms;

import java.sql.Connection;
import java.util.List;

import com.cybage.jdbc.JDBCUtility;
import com.cybage.model.Product;
import com.cybage.service.ProductService;
import com.cybage.service.ProductServiceImp;

public class ProductManagement {

	public static void main(String[] args) {
		
		ProductService productService=new ProductServiceImp();
		List<Product> productList=productService.getAllProduct();
//		use switch case
		
		
	}

}
