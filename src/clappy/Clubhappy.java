package clappy;

import java.util.List;

public class Clubhappy {

    private int ageGroupMin;
    private int ageGroupMax;
    private  int clubSize;
    private List<Member> memberList;
    private String gender;

    public Clubhappy(String gender, int ageGroupMin, int ageGroupMax, int clubSize, List<Member> memberList)throws Exception
        {
            this.ageGroupMin = ageGroupMin;
            this.ageGroupMax = ageGroupMax;
            this.clubSize = clubSize;
            this.memberList = memberList;
            this.gender = gender;
            if (memberList.size() < clubSize)
            {
                throw new Exception("Club cannot be accepted because member size is below the permissible number");
            }
        }

        public void printOutClubDetails()
        {
            System.out.println("Club Age Group is between " +  ageGroupMin + " and " + ageGroupMax);
            System.out.println("Club Gender is " + gender);
            System.out.println("Club Size is " + clubSize);
            System.out.println("Club Members are ");
            int index = 1;
            for (Member member : memberList)
            {

                System.out.println("Club Member "+ index +"\n" + member.toString());
                index = index + 1;
                System.out.println("\n");
            }
        }

        public List<Member> getClubMembers()
        {
            return this.memberList;
        }

    }







