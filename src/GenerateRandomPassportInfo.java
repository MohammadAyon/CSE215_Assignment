
import AllAssiignment.DateOfBirth;
import AllAssiignment.PassportInfo;

import java.util.Random;

public class GenerateRandomPassportInfo {
  enum firstname{
    Najmus,Ehsanul,Monirul, Abu,Nazmul,Sadman,Shahdat,Sadia,Asif,Imran , Ivan,Sheikh,Shumsun,Tahmid,Ashraf,Fahim,Kazi,Ramisa,Sudipto,Nahin,Saadman,Mashoon,Farhan,Naziour,Miah,Raidul,Saiyem,Omar,Tahiyat,Mahbub,Mubtasim,Abdul,Tanvir,Ahnaf,Mehdi,Shadman,Faiyaz,Saif,Junaid,Jahidul,Mostaqeen,Iazdanul,Faruk,Jawad,Shirajus,Ajwad,Fardin,Utsab,Tanjeed,Tanzimul
  }
  enum lastname{
    Sakib,Haque,Monirul,Nayeem,Islam,Rahman,Saif,Sultana,Faysal,Karim,Chowdhury,Jubayer,Nahar,Shams,Uddin,Ahamed,Ejaj, Asad,Barua,Alam,Wasee,Adib,Sadik,Rehman,Mohammed,Aslam,Raiyan,Zia,Hakim,Anik,fuad,Momin,Hossain,Wadud,Hasan,Shakib,Hashem,Sarkar,Safwan,Bhuiya,Billah,Huda,khan,Ahad,Salekhin,Abrar,Nur,Chakma,Shohrab,Kaif
  }
public static firstname getFirstname(){
  int randomFirstName = new Random().nextInt(firstname.values().length);
  
  return firstname.values()[randomFirstName];
}
  public static lastname getLastname(){
    int randomlastName = new Random().nextInt(firstname.values().length);
    
    return lastname.values()[randomlastName];
   
  }
  public static int[] dateOfbirth(){
    int[] arr=new int[3];
    int year=1940 + (int) (Math.random() * (2000 - 1940 + 1));
    arr[0]=year;
   int  month = (int)((Math.random() * 12) + 1);
   arr[1]=month;
    int day;

    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        day=(int)(Math.random()*31+1);
        arr[2]=day;
        break;
      case 2:
        
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
          day=(int)(Math.random()*29+1);
        } else {
          day=(int)(Math.random()*28+1);
        }
        arr[2]=day;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        day=(int)(Math.random()*30+1);
        arr[2]=day;
        break;
    }
    return arr;
  }
  public static String GenerateNID(){

    String Store = String.valueOf((int) (Math.random() * (999))) +
                     '-' +
                     (int) (Math.random() * (999)) +
                     '-' +
                     (int) (Math.random() * (9999));
    
    return Store;
  }
  
  public static void main(String[] args) {
    
    int [] store1=dateOfbirth();
   
    System.out.println("Randomly generating Passport info");

    PassportInfo [] obj= new PassportInfo[15];
    for (int i=0;i<15;i++){
      int [] store=dateOfbirth();
      int year=store[0];
      int month=store[1];
      int day=store[2];
  
      obj[i]=  PassportInfo.Builder();
      obj[i].setFirstName((String.valueOf(getFirstname())));
      obj[i].setLastName((String.valueOf(getLastname())));
      obj[i].setDateOfBirth(new DateOfBirth(day,year,month));
      obj[i].setNidNumber(GenerateNID());
      System.out.println(obj[i].toString());
    
    }
    
  }

}
