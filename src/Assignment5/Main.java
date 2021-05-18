package Assignment5;
//Given a Data file in the attachment, where each line contains the following information for a person:
//  Passport Number
//  First Name - does not contain any space, all capital letters
//  Last Name - does not contain any space, all capital letters
//  NID - 10 digit, always starts with a non-zero digit
//  Date of birth
//
//  Read the given file to create an array of persons. Create two output files like the following:
//
//  SortedByPassport.txt : Contains all persons sorted by Passport Number in Ascending order. Original order of the fields should be maintained.
//  SortedByDOB.txt : Contains all persons sorted by Date of Birth in Ascending order. Original order of the fields should be maintained.
//
//  Sample data file is provided. Write the code and run the code with the sample input. Submit the code and output in Google classroom.

import java.util.Random;

public class Main {
  public static String generateRandomFirstName(){
    int startPoint = 97;
    int endpoint = 122;
  
    Random random = new Random();
    int StringSize=5+(int)(Math.random()*(10-5+1));
  
    StringBuilder Store = new StringBuilder(StringSize);
    for (int i = 0; i < StringSize; i++) {
      int randomCharacter = startPoint  + (int) (random.nextFloat() * (endpoint - startPoint  + 1));
      Store.append((char) randomCharacter);
    }
  
  
    return Store.toString();
  }
  
  
}
