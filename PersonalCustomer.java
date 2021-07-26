
public class PersonalCustomer extends Customer {

    private String creditCardNumber;

    public PersonalCustomer(String name, String address, String creditCardNumber) {
        super(name, address);
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}