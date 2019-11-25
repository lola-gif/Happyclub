package clappy;


public class Member {
    private Address address;
    private String firstName;
    private String lastName;
    private String DOB;
    private String nationality;
    private String memberRole;
    private String gender;

    public Member(){}
    public Member(Address address, String firstName, String lastName, String DOB,String gender, String nationality,
                  String memberRole) {
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DOB = DOB;
        this.nationality = nationality;
        this.memberRole = memberRole;
    }
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.gender + "\n" + this.memberRole + "\n" + this.DOB + "\n" + this.nationality + "\n"
                + this.address.toString();
    }
}
