package Assignment6;

public class Person implements Comparable<Person> {
  public String PassportNumber;
  private String FirstName;
  private String lastName;
  private String NID;
  private String DateOfBirth;
  
  public Person(String passportNumber, String firstName, String lastName, String NID, String dateOfBirth) {
    PassportNumber = passportNumber;
    FirstName = firstName;
    this.lastName = lastName;
    this.NID = NID;
    DateOfBirth = dateOfBirth;
  }
  
  public String getPassportNumber() {
    return PassportNumber;
  }
  
  public String getFirstName() {
    return FirstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getNID() {
    return NID;
  }
  
  public String getDateOfBirth() {
    return DateOfBirth;
  }
  
  @Override
  public String toString() {
    return
       PassportNumber +
         FirstName +
         lastName +
         NID +
        DateOfBirth+"\n"
      ;
  }
  
  
  @Override
  public int compareTo(Person o) {
    return this.PassportNumber.compareTo(o.getPassportNumber());
  }
}
