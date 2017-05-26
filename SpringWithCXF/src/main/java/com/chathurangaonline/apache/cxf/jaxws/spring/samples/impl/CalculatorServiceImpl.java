package com.chathurangaonline.apache.cxf.jaxws.spring.samples.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.chathurangaonline.apache.cxf.jaxws.spring.samples.CalculatorService;
import com.cxf.model.Product;
import com.cxf.model.ShoppingCart;

/**
 * <p>
 *     SIB for {@link com.chathurangaonline.apache.cxf.jaxws.spring.samples.CalculatorService}
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */
@WebService(endpointInterface="com.chathurangaonline.apache.cxf.jaxws.spring.samples.CalculatorService")

public class CalculatorServiceImpl implements CalculatorService {

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

   
	public ShoppingCart getAllProducts() throws Exception {
		// TODO Auto-generated method stub
		ShoppingCart cart;
		List<Product> list=new ArrayList<Product>();
		
		for(int i=0;i<10;i++)
		{
			list.add(new Product(i+2, "product"+i));
		}
		cart =new ShoppingCart();
		cart.setProduct(list);
		
		return cart;
	}
}

