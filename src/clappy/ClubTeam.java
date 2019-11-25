package clappy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ClubTeam {

    public static void main(String[] args)
    {
        System.out.println("Club Creation Program Starting....");
        Address addressA = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");

        Member memberPlayer = new Member(addressA,"Tony", "Adams", "12/12/1990","Male" ,"British", "Player");

        Member memberCoach = new Member(addressA,"Jose", "Mourinho", "12/12/1980","Male" ,"Portugese", "Coach");

        List<Member> memberList = new ArrayList<Member>();
        memberList.add(memberPlayer);
        memberList.add(memberPlayer);
        memberList.add(memberPlayer);
        memberList.add(memberPlayer);
        memberList.add(memberPlayer);
        memberList.add(memberCoach);
        try
        {
            System.out.println("Creating the first club....");

            int clubSize = 5;
            Clubhappy club = new Clubhappy("Male", 15,19,clubSize, memberList);
            club.printOutClubDetails();
            System.out.println(" First Club Created successfully....");

        }catch (Exception ex)
        {
            System.out.println("There is a problem ::" + ex.getMessage());
        }

        try
        {
            System.out.println("Creating second Club....\n");

            //This one will create a club with membership less than the required size
            int clubSize = 8;
            Clubhappy club = new Clubhappy("Male",15,19,clubSize,memberList);
            club.printOutClubDetails();
            System.out.println(" Second Club Created successfully....");
        }catch (Exception ex)
        {
            System.out.println("Failed to create the second club....\n");
            System.out.println("There is a problem ::" + ex.getMessage());


        }
        Address address1 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");
        Address address2 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");
        Address address3 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");
        Address address4 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");
        Address address5 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");
        Address address6 = new Address("streetName", "streetAddress", "City A", "State A", "PostCode A", "CountryA");

        Member memberPlayer1 = new Member(addressA,"Tony", "Adams", "12/12/1990","Male" ,"Irish", "Player");
        Member memberPlayer2 = new Member(addressA,"Fred", "Adams", "12/11/1990","Male" ,"British", "Player");
        Member memberPlayer3 = new Member(addressA,"Peter", "Adams", "12/02/1990","Male" ,"Irish", "Player");
        Member memberPlayer4 = new Member(addressA,"Andy", "Adams", "13/12/1990","Male" ,"British", "Player");
        Member memberPlayer5 = new Member(addressA,"Gab", "Adams", "14/12/1990","Male" ,"Irish", "Player");
        Member memberPlayer6 = new Member(addressA,"John", "Adams", "15/12/1990","Male" ,"British", "Player");


        Member memberCoach1 = new Member(addressA,"Jose", "Mourinho", "12/12/1980","Male" ,"Portugese", "Coach");

        List<Member> memberList2 = new ArrayList<Member>();
        memberList2.add(memberPlayer1);
        memberList2.add(memberPlayer2);
        memberList2.add(memberPlayer3);
        memberList2.add(memberPlayer4);
        memberList2.add(memberPlayer5);
        memberList2.add(memberPlayer6);
        memberList2.add(memberCoach1);
        try
        {
            System.out.println("Creating the third club....");

            int clubSize = 6;
            Clubhappy club3 = new Clubhappy("Male", 20, 25,clubSize,memberList2);
            club3.printOutClubDetails();
            System.out.println(" Third Club Created successfully....");

        }catch (Exception ex)
        {
            System.out.println("There is a problem ::" + ex.getMessage());
        }
        System.out.println(" Program ends....");
    }

    private void printOutClubDetails() {
    }

}
