import java.util.Scanner;
class   almostequal
{
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter  first String=");
        String s1 = sn.nextLine();
        System.out.print("Enter second string=");
        String s2 = sn.nextLine();
        int extra = 0;
        if (s1.length() > s2.length()) {
            if (s1.contains(s2)) {
                extra = s1.length() - s2.length();
            } else System.out.print("Not AlmostEqual");
        } else if (s2.length() > s1.length()) {
            if (s2.contains(s1)) {
                extra = s2.length() - s1.length();
            } else System.out.print("Not AlmostEqual");
        } else if (s1.equals(s2))
            System.out.print("Same");
        else System.out.print("Not qual ");
        System.out.println("Extras= "+extra);
    }
    }