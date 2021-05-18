package AllAssiignment;

public class DateOfBirth {
  private int date;
  private int year;
  private int month;
  
  public DateOfBirth(int date, int year, int month) {
    this.date = date;
    this.year = year;
    this.month = month;
    
  }
  
  
  
  
  
  
  @Override
  public String toString() {
    return
              date +"/" + month +
             "/" + year
             
             ;
  }
}
