package Assignment5;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Passport {
  public static String generateRandomFirstName(){
    int startPoint = 65;
    int endpoint = 90;
    
    Random random = new Random();
    int StringSize=5+(int)(Math.random()*(10-5+1));
    
    StringBuilder Store = new StringBuilder(StringSize);
    for (int i = 0; i < StringSize; i++) {
      int randomCharacter = startPoint  + (int) (random.nextFloat() * (endpoint - startPoint  + 1));
      Store.append((char) randomCharacter);
    }
    
    
    return Store.toString();
  }
  public static String generateRandomLastName(){
    int startPoint = 65;
    int endpoint = 90;
  
    Random random = new Random();
    int StringSize=5+(int)(Math.random()*(10-5+1));
  
    StringBuilder Store = new StringBuilder(StringSize);
    for (int i = 0; i < StringSize; i++) {
      int randomCharacter = startPoint  + (int) (random.nextFloat() * (endpoint - startPoint  + 1));
      Store.append((char) randomCharacter);
    }
  
  
    return Store.toString();
    
  }
  public static String generateRandomPassportNumber(){
    int startPoint = 65;
    int endpoint = 90;
  
    Random random = new Random();
  
    StringBuilder Store = new StringBuilder(9);
    for (int i = 0; i < 2; i++) {
      int randomCharacter = startPoint  + (int) (random.nextFloat() * (endpoint - startPoint  + 1));
      Store.append((char) randomCharacter);
    }
    Store.append((int) (Math.random() * (9999999)));
   
    return Store.toString();
  }
  public static Date generateDateOfBirth(){
    int randomYear=(1940+(int)(Math.random()*2000-1940));
    int randomDay=(((int)(Math.random()* 7))+1);
    int randomWeek=(((int)(Math.random()* 54))+1);
    Calendar DateOfBirth=Calendar.getInstance();
    DateOfBirth.setWeekDate(randomYear,randomWeek,randomDay);
    return DateOfBirth.getTime();
  
  }
  public static String GenerateNID(){
    
    String Store = String.valueOf((int) (Math.random() * (9))+1) +
                     
                     (int) (Math.random() * (999999999));
    
    return Store;
  }
  private final static DateFormat sDateFormat = DateFormat.getDateInstance(DateFormat.DATE_FIELD,
    new Locale("en","US"));
  public static void main(String[] args) {
//    System.out.println( generateRandomFirstName());
//    System.out.println(generateRandomLastName());
//    System.out.println(generateRandomPassportNumber());
//    System.out.println(sDateFormat.format(generateDateOfBirth()));//generateDateOfBirth()
//    System.out.println(GenerateNID());
//    AllAssiignment.PassportInfo obj = new AllAssiignment.PassportInfo();
//    obj.setFirstName(generateRandomFirstName());
//    obj.setLastName(generateRandomLastName());
//    obj.setPassportNumber(generateRandomPassportNumber());
//    obj.setNID(GenerateNID());
//    obj.setDateOfBirth(generateDateOfBirth());
//    System.out.println(obj.toString());
  }
}
