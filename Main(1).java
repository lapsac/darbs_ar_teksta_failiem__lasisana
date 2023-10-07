import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
    
    System.out.println("input file name:");
    String fileName = sc.nextLine();
    
      System.out.println("result:");
  try{
    Scanner fileScanner = new Scanner(new File(fileName));
    while(fileScanner.hasNextLine()){
      String line = fileScanner.nextLine();
      String[] n= line.split(" ");
      String uzvards = n[0];
      String vards = n[1];
      int atz1 = Integer.parseInt(n[2]);
      int atz2 = Integer.parseInt(n[3]);
      int atz3 = Integer.parseInt(n[4]);
      int atz4 = Integer.parseInt(n[5]);
      int atz5 = Integer.parseInt(n[6]);
      
      int parads =0;

      for(int i=2; i<=6; i++){
        if(Integer.parseInt(n[i])<4){
          parads++;
        }
      }
      
      double videja_atzime = (atz1+atz2+atz3+atz4+atz5) /5.0;
      if(videja_atzime <=5){
        System.out.println(uzvards+" "+vards+" "+parads);
      }
    }
    fileScanner.close();
  }catch (IOException e){
  }
    sc.close();
    }
  }