package AllAssiignment;

import java.util.Formatter;

public class QuadraticEquation_2012547 {
  
  private double a;
  private double b;
  
  public double getA() {
    return a;
  }
  
  public void setA(double a) {
    this.a = a;
  }
  
  public double getB() {
    return b;
  }
  
  public void setB(double b) {
    this.b = b;
  }
  
  public double getC() {
    return c;
  }
  
  public void setC(double c) {
    this.c = c;
  }
  
  private double c;
  
  public QuadraticEquation_2012547(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  private double getDiscriminant(){
    double discriminant;
    discriminant=(this.b*this.b)-(4*this.a*this.c);
    return discriminant;
  }
  public void evaluateDiscriminant(){
    if (getDiscriminant()>0){
      System.out.println("Two distinct solutions ");
    }
    else if(getDiscriminant()==0) {
      System.out.println("One unique solution");
    }
    else if(getDiscriminant()<0){
        System.out.println("No solution");
      }
    }
    public double getRoot1(){
    double root1;
    if (getDiscriminant()>=0){
      return ((-this.b)+(Math.sqrt((this.b*this.b) - (4*this.a*this.c)))) / (2*this.a);
    }
    else
      return root1=-1;
    }
  public double getRoot2(){
    double root2;
    if (getDiscriminant()>=0){
      return ((-this.b)-(Math.sqrt((this.b*this.b) - (4*this.a*this.c)))) / (2*this.a);
    }
    else {
      System.out.println("Not possible to calculate solutions since discriminant is negative");
      return -1;
    }
  }
  
  @Override
  public String toString() {
    
    return String.format("""
      Coefficient | Value
      ----------------
      a           |%5.3f
      ----------------
      b           |%5.3f
      ----------------
      c           |%5.3f
      ----------------
      """, a, b, c);
                           
    
    
    
  }
}

  
  
  

