package autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
    @Autowired
    private Address address;

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
            " address='" + getAddress() + "'" +
            "}";
    }

}
