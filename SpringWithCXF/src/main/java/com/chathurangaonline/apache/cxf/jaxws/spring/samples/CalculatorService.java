package com.chathurangaonline.apache.cxf.jaxws.spring.samples;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.cxf.model.ShoppingCart;

/**
 * <p>
 *     SIB
 * </p>
 * @author Chathuranga Tennakoon / www.chathurangaonline.com
 */

@WebService
@SOAPBinding(style = Style.DOCUMENT,use=Use.LITERAL)
public interface CalculatorService {

	@WebResult(name="multiplyResult")
    double multiply(@WebParam(name="firstNum")double num1,@WebParam(name="secondNum")double num2);
    
    @WebResult(name="shoppingCart")
    ShoppingCart getAllProducts() throws Exception;
}
