package Assignment6;
import java.io.*;
import java.util.Map;
import java.util.*;

public class PersonInfo {
  //final static String outputFilePath="C:\\Users\\Asus\\IdeaProjects\\ASsignment\\src\\datafille.txt";
  public static void main(String[] args) throws Exception{
    File file = new File("C:\\Users\\Asus\\IdeaProjects\\ASsignment\\src\\data.txt");
    ArrayList<Person>Persons = new ArrayList<>();
    Map <String,Person> map = new LinkedHashMap<>(16,0.75f,true);
    try(Scanner input = new Scanner(file)){
      while(input.hasNext()){
        String PassportNUmber=input.next();
        String firstName=input.next();
        String LastName=input.next();
        String NationalId= (input.next());
        String DateOfBirth=input.next();
        Persons.add(new Person(PassportNUmber,firstName,LastName,NationalId,DateOfBirth));
        //System.out.println("PassportNumber"+PassportNUmber+"\nFirst Name "+firstName+"\n Last Name "+LastName+"\nNational Id "+NationalId+"\nAllAssiignment.DateOfBirth "+AllAssiignment.DateOfBirth);
      }
      //System.out.println(Persons.toString());
      
      
    }
//    File sortPassport=new File("SortPassport.txt");
//    sortPassport.createNewFile();
//
    Comparator<Person>comPass= new Comparator<>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getNID().compareTo(o2.getNID());
      }
  
      @Override
      public boolean equals(Object obj) {
        return false;
      }
    };
  Persons.sort(comPass);
  
    //System.out.println(Persons.toString());

  
    try {
      for(Person p :Persons){
        
        map.put(p.getNID(),p);
        System.out.println(p.getNID() + " = \n" + map.get(p.getNID()));
      }
  
      //File file1 = new File(outputFilePath);
      BufferedWriter bw = new BufferedWriter(new FileWriter("sortByNid.txt", false));
      bw.write(map.toString());
      bw.flush();
      bw.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

  
  }
 
}
