package com.cybage.pms;

import java.util.List;
import java.util.Scanner;

import com.cybage.model.Product;
import com.cybage.service.ProductService;
import com.cybage.service.ProductServiceImp;

public class ProductManagement {

	public static void main(String[] args) {

		// save method of service

		ProductService productService = new ProductServiceImp();

		int ch;

		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(
					"1.Add Product \n2.Search Product \n3.Get all Product \n4.Update Product \n5.Delete Product \n6.EXIT");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:

				System.out.println("------ Add new Product ------");
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				System.out.println("Enter Product Name :");
				String name = sc.next();
				System.out.println("Enter Price :");
				int price = sc.nextInt();

				Product product = new Product(id, price, name);
				productService.addProduct(product);
				System.out.println("---------------------");
				break;
			case 2:
				System.out.println("------ Search Product ------");
				System.out.println("Enter Id :");
				int proId = sc.nextInt();

				productService.getProductbyId(proId);
				System.out.println("---------------------");
				break;
			case 3:
				System.out.println("------ All Products ------");
				List<Product> productList = productService.getAllProduct();
				System.out.println("---------------------");
				break;

			case 4:
				System.out.println("------ Update Product ------");
				System.out.println("Enter product ID you want to update : ");
				int updateId=sc.nextInt();
				System.out.println("Enter Product Name :");
				String newName = sc.next();
				System.out.println("Enter Price :");
				int newPrice = sc.nextInt();
				productService.updateProduct(updateId, newName, newPrice);
				System.out.println("---------------------");
				break;
			case 5:
				System.out.println("------ Delete Product ------");
				System.out.println("Enter Id :");
				int deleteId = sc.nextInt();
				productService.deleteProduct(deleteId);
				System.out.println("---------------------");
				break;
				
			case 6:
				System.out.println("Thank You....!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice....");
				break;
			}
		} while (ch != 0);

	}

}
