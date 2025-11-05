
package library.members;
public class Member {
    private String name; private int memberId;
    public Member(String name, int memberId){ this.name=name; this.memberId=memberId; }
    public void display(){ System.out.println("Member: " + name + ", ID: " + memberId); }
}
