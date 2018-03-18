package jaxws.domain;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AddressAdapter extends XmlAdapter<AdaptedAddress, Address> {

    @Override
    public Address unmarshal(AdaptedAddress ad) throws Exception {
        return new Address(ad.getId(), ad.getStreet(), ad.getNumber(), ad.getPostalCode(), ad.getCity(), ad.getCountry());
    }

    @Override
    public AdaptedAddress marshal(Address address) throws Exception {
        AdaptedAddress ad = new AdaptedAddress();
        ad.setId(address.getId());
        ad.setCity(address.getCity());
        ad.setCountry(address.getCountry());
        ad.setNumber(address.getNumber());
        ad.setPostalCode(address.getPostalCode());
        ad.setStreet(address.getStreet());
        return ad;
    }

}
