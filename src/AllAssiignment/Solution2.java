package AllAssiignment;

import java.util.Random;

public class Solution2 {
  public  static int[][] DistanceOfCities(String []RndCity){
    int[][] city = new int[RndCity.length][RndCity.length];
    for (int row=0;row< RndCity.length;row++){
      for(int column=0;column< RndCity.length;column++){
        if(row==column){
          city[row][column]=0;
        }
        else {
          int distance=50+(int)(Math.random()*(90-50+1));
          city[row][column]=distance;
          city[column][row]=distance;
        }
      }
    }
    return city;
  }
  public static String cityGenerator(){
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
  public static void DisplayDistances(String[] cities, int[][] distance){
    System.out.println();
    System.out.format("%20s", " ");
    for(int i=0;i< cities.length;i++){
      System.out.format("%20s",cities[i]);
    }
    System.out.println();
    
      for (int i = 0; i < cities.length; i++) {
        System.out.format("%20s", cities[i]);
        for (int j = 0; j < cities.length; j++) {
          System.out.format("%20d", distance[i][j]);
          
        }
        System.out.println("\n");
      }
  }
  public static void main(String[] args) {
    int CityNumber =5+(int)(Math.random()*(15-5+1));
    String[] Cities= new String[CityNumber];
    for (int i=0;i<CityNumber;i++) {
      
      Cities[i] =cityGenerator();
    }
    System.out.println(CityNumber);
    
    
    int [][] Distances=DistanceOfCities(Cities);
    DisplayDistances(Cities,Distances);
    
    
  }
}
