package jaxws;

import jaxws.giro.GiroServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9090/giro", new GiroServiceImpl());
        System.out.println("test");
    }

}
