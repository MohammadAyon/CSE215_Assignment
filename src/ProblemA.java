import java.util.Scanner;

public class ProblemA {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.next();
    String s2 = in.next();
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    int result = s1.compareTo(s2);
    System.out.println(result);
    if (result > 0) {
      result = 1;
    } else if (result < 0) {
      result = -1;
    }
    System.out.println(result);
  
    }
  }
