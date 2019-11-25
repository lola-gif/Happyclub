package clappy;

public class Address {
    private String streetName;
    private String streetAddress;
    private String city;
    private String state;
    private String postcode;
    private String country;

    public Address (String streetName, String streetAddress, String city, String state, String postCode, String country)
    {
        this. streetName = streetName;
        this. streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postcode = postCode;
        this.country = country;

    }
    public String toString()
    {
        return this. streetName + "\n" + this. streetAddress + "\n" + this.city+ "\n" + this.state+ "\n" + this.postcode+ "\n" + this.country;
    }



}

