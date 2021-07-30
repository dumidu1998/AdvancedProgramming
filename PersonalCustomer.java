
public class PersonalCustomer extends Customer {

    private String creditCardNumber;

    public PersonalCustomer(String id, String name, String address, String creditCardNumber) {
        super(id, name, address);
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}