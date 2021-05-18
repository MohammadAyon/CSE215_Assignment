import AllAssiignment.QuadraticEquation_2012547;

import java.util.Scanner;

public class LabAssignment5_2012547 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    System.out.println("Enter the coefficients of equation1 ax^2+bx+c");
    double a=  in.nextDouble();
    double b=  in.nextDouble();
    double c=  in.nextDouble();
    QuadraticEquation_2012547 Equation1 = new QuadraticEquation_2012547(a,b,c);
   Equation1.evaluateDiscriminant();
    double r1 = Equation1.getRoot1();
   double r2 = Equation1.getRoot2();
    String s1=Equation1.toString();
    System.out.println(s1);
    getRoot(r1,r2);
    System.out.println("Enter the coefficients of equation2 ax^2+bx+c");
    double a2=  in.nextDouble();
    double b2=  in.nextDouble();
    double c2=  in.nextDouble();
    QuadraticEquation_2012547 Equation2 = new QuadraticEquation_2012547(a2,b2,c2);
    Equation2.evaluateDiscriminant();
    double Eq2r1 = Equation2.getRoot1();
    double Eq2r2 = Equation2.getRoot2();
    String s2=Equation2.toString();
    System.out.println(s2);
    getRoot(Eq2r1,Eq2r2);
    
    System.out.println("Enter the coefficients of equation3 ax^2+bx+c");
    double a3=  in.nextDouble();
    double b3=  in.nextDouble();
    double c3=  in.nextDouble();
    QuadraticEquation_2012547 Equation3 = new QuadraticEquation_2012547(a3,b3,c3);
    Equation3.evaluateDiscriminant();
    double Eq3r1 = Equation3.getRoot1();
    double Eq3r2 = Equation3.getRoot2();
    String s3=Equation3.toString();
    System.out.println(s3);
    getRoot(Eq3r1,Eq3r2);
    
  }
  public static void getRoot(double r1, double r2){
    if ( (r1+r2)==-2) {
      System.out.println(  "\n" );
    }
    else {
      System.out.println("root1= "+r1+"\n root2"+r1);
    }
  }
}
