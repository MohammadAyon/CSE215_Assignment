package Assignment5;

public class PassportInfo  {
  public String PassportNumber;
  private String FirstName;
  private String lastName;
  private String NID;
  private String DateOfBirth;
  
  public PassportInfo(String passportNumber, String firstName, String lastName, String NID, String dateOfBirth) {
    PassportNumber = passportNumber;
    FirstName = firstName;
    this.lastName = lastName;
    this.NID = NID;
    setDateOfBirth(dateOfBirth);
  }
  
  public String getFirstName() {
    return FirstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getPassportNumber() {
    return PassportNumber;
  }
  
  public String getNID() {
    return NID;
  }
  
  public String getDateOfBirth() {
    return DateOfBirth;
  }
  
  public void setPassportNumber(String passportNumber) {
    PassportNumber = passportNumber;
  }
  
  @Override
  public String toString() {
    return
              PassportNumber + ","+
              FirstName + ","+
              lastName + ","+
              NID + ","+
                getDateOfBirth() + ","
             ;
  }
  
  public void setDateOfBirth(String dateOfBirth) {
    DateOfBirth = dateOfBirth;
  }
  /* public void setPassportNumber(String passportNumber) {
    PassportNumber = passportNumber;
  }*/
}
