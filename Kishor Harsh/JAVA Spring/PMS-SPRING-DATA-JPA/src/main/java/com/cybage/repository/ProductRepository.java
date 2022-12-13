package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	List<Product> findByProductPrice(int price);
	List<Product> findByProductName(String name);
	
	List<Product> findByProductPriceLessThan(int price);
	List<Product> findByProductPriceGreaterThan(int price);
	
	List<Product> findByProductPriceBetween(int start,int end);
	
	@Query("From Product where productName= ?1")
	List<Product> getByName(String productName);
	
	@Query("From Product where productName= ?1 And productPrice=?2")
	List<Product> getProductByNameAndPrice(String name,int price);
	
//	@Query("From Product where productName= :name And productPrice=:pr")
//	List<Product> getProductByNameAndPriceUsingParam(@Param("name")String productName, @Param("pr") int price);
	
	@Query(value="select * from Product_Info where product_name = :name And product_Price=:pr",nativeQuery=true)
	List<Product> getProductByNameAndPriceUsingParam(@Param("name")String productName, @Param("pr") int price);		
}