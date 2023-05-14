package baitap.FileWrite;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class FileWrite {
  public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);

    System.out.print("nhập link file để đọc: ");
   String string = sc.nextLine ();

   try{
     FileReader fr = new FileReader (string);
     BufferedReader br = new BufferedReader (fr);

     String name;
     while ((name = br.readLine ( )) != null){
       System.out.println (name);
     }
     br.close ();
   }catch (Exception e){
     System.out.println ("link sai không đọc được văn bản");
   }
  }
}

