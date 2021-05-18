package Assignment5;

import java.util.Comparator;

public class SortingByPassport implements Comparator<PassportInfo> {
  public int compare(PassportInfo s1,PassportInfo s2){
    return s1.getPassportNumber().compareTo(s2.getPassportNumber());
  }
}
