package jaxws.giro;

import javax.jws.WebService;
import java.math.BigInteger;

@WebService
public interface GiroService {

    BigInteger getRandomNumber(String customerName, String street, String streetNumber, String postalCode, String city, String country, double payment);

}
