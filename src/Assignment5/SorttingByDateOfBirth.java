package Assignment5;

import java.util.Comparator;

public class SorttingByDateOfBirth implements Comparator <PassportInfo>{
  public int compare(PassportInfo p1,PassportInfo p2){
    return p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
  }
}
