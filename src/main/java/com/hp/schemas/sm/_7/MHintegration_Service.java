package com.hp.schemas.sm._7;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.2
 * 2021-03-02T19:09:45.545+03:00
 * Generated source version: 3.4.2
 *
 */
@WebServiceClient(name = "MHintegration",
                  wsdlLocation = "file:/D:/JavaProjects/soapWS/src/main/resources/MHintegration.wsdl",
                  targetNamespace = "http://schemas.hp.com/SM/7")
public class MHintegration_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.hp.com/SM/7", "MHintegration");
    public final static QName MHintegration = new QName("http://schemas.hp.com/SM/7", "MHintegration");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/JavaProjects/soapWS/src/main/resources/MHintegration.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MHintegration_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/JavaProjects/soapWS/src/main/resources/MHintegration.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MHintegration_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MHintegration_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MHintegration_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MHintegration_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MHintegration_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MHintegration_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns MHintegration
     */
    @WebEndpoint(name = "MHintegration")
    public MHintegration getMHintegration() {
        return super.getPort(MHintegration, MHintegration.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MHintegration
     */
    @WebEndpoint(name = "MHintegration")
    public MHintegration getMHintegration(WebServiceFeature... features) {
        return super.getPort(MHintegration, MHintegration.class, features);
    }

}
