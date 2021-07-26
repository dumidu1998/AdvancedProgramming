
public class CorporateCustomer extends Customer {

    private String contactName;
    private int creditLimit;

    public CorporateCustomer(String name, String address, String contactName, int creditLimit) {
        super(name, address);
        this.contactName = contactName;
        this.creditLimit = creditLimit;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
