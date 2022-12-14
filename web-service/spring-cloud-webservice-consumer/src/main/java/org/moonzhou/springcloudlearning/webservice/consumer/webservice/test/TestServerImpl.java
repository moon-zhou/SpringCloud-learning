package org.moonzhou.springcloudlearning.webservice.consumer.webservice.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-09-18T16:55:47.334+08:00
 * Generated source version: 3.5.3
 *
 */
@WebService(targetNamespace = "http://impl.service.provider.webservice.springcloudlearning.moonzhou.org/", name = "TestServerImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface TestServerImpl {

    @WebMethod
    @RequestWrapper(localName = "getTest", targetNamespace = "http://impl.service.provider.webservice.springcloudlearning.moonzhou.org/", className = "org.moonzhou.springcloudlearning.webservice.consumer.webservice.test.GetTest")
    @ResponseWrapper(localName = "getTestResponse", targetNamespace = "http://impl.service.provider.webservice.springcloudlearning.moonzhou.org/", className = "org.moonzhou.springcloudlearning.webservice.consumer.webservice.test.GetTestResponse")
    @WebResult(name = "return", targetNamespace = "")
    public org.moonzhou.springcloudlearning.webservice.consumer.webservice.test.TestDto getTest(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
