package com.yodobashi.esa.customer.createordertool;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2012-04-24T17:03:43.253+09:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://esa.yodobashi.com/Customer/CreateOrderTool", name = "CreateOrderTool")
@XmlSeeAlso({ObjectFactory.class, com.yodobashi.esa.customer.structure.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreateOrderTool {

    @WebResult(name = "CreateOrderTool_Response", targetNamespace = "http://esa.yodobashi.com/Customer/CreateOrderTool", partName = "CreateOrderTool_Response")
    @WebMethod(operationName = "CreateOrderTool", action = "http://sap.com/xi/WebService/soap1.1")
    public CreateOrderToolResponse createOrderTool(
        @WebParam(partName = "CreateOrderTool_Req", name = "CreateOrderTool_Req", targetNamespace = "http://esa.yodobashi.com/Customer/CreateOrderTool")
        CreateOrderToolReq createOrderToolReq
    );
}