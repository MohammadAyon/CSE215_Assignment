package AllAssiignment;

import java.util.Arrays;
import java.util.Random;

public class PassportInfo {
  private String FirstName;
  private String LastName;
  private String PassportNumber;
  private String NidNumber;
  private DateOfBirth DateOfBirth;
  public static String[] AllPassportNumber = new String[15];
  public static  String[] AllNidNumber = new String[15];
  
 
  
  private PassportInfo() {
  }
  
  public static PassportInfo Builder(){    /*Here we use static method  */
    return new PassportInfo();
  }
  
  
  public String getPassportNumber() {
    int startPoint = 65;
    int endpoint = 90;
  
    Random random = new Random();
    
    StringBuilder Store = new StringBuilder(9);
    for (int i = 0; i < 2; i++) {
      int randomCharacter = startPoint  + (int) (random.nextFloat() * (endpoint - startPoint  + 1));
      Store.append((char) randomCharacter);
    }
    Store.append ((int)(Math.random()*10));//10+Math,random()*10  ==(0to 10)+10
    Store.append((int) (100000+Math.random() * (999999)));
    PassportNumber= Store.toString();
    return PassportNumber;
  }
  
  public void setPassportNumber(String passportNumber) {
    this.PassportNumber = passportNumber;
  }
  
  
  public String getFirstName() {
    return FirstName;
  }
  
  public void setFirstName(String firstName) {
    FirstName = firstName;
  }
  
  public String getLastName() {
    return LastName;
  }
  
  public void setLastName(String lastName) {
    LastName = lastName;
  }
  
  public String getNidNumber() {
    return NidNumber;
  }
  
  public void setNidNumber(String nidNumber) {
    this.NidNumber = nidNumber;
    Arrays.fill(AllNidNumber, nidNumber);
  }
  
  public DateOfBirth getDateOfBirth() {
    return DateOfBirth;
  }
  
  public void setDateOfBirth(DateOfBirth dateOfBirth) {
    DateOfBirth = dateOfBirth;
  }
  
  
  public static String[] getAllPassportNumber() {
    //AllPassportNumber;
//    String[] pass= getAllPassportNumber();
    
    return AllPassportNumber;
  }
  
  public static String[] getAllNidNumber() {
    
    return AllNidNumber;
  }
  
  public static void setAllPassportNumber(String[] allPassportNumber) {
    
    AllPassportNumber = allPassportNumber;
  }
  
  public static void setAllNidNumber(String[] allNidNumber) {
    AllNidNumber = allNidNumber;
  }
 
  
  @Override
  public String toString() {
    return
             "{\nPassportNumber ="+getPassportNumber()+"\nFirstName=" + FirstName  +
             "\nLastName=" + LastName  +
               "\nNID :"+NidNumber+
             "\nAllAssiignment.DateOfBirth=" + DateOfBirth+"\n}"
             ;
  }
}
