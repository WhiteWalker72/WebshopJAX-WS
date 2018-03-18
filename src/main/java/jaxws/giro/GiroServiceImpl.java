package jaxws.giro;

import javax.jws.WebService;
import java.math.BigInteger;
import java.util.Random;

@WebService
public class GiroServiceImpl implements GiroService {

    private final Random random = new Random();

    public GiroServiceImpl() {

    }

    @Override
    public BigInteger getRandomNumber(String customerName, String street, int streetNumber, String postalCode, String city, String country, double payment) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < getRandom(20, 30); i++) {
            builder.append(getRandom(0, 9));
        }
        return new BigInteger(builder.toString());
    }

    private int getRandom(int lower, int upper) {
        return random.nextInt((upper - lower) + 1) + lower;
    }

}
