package baitap.docghifile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static baitap.docghifile.FileWriterAndFileReade.WriteToFile.writeToFile;

public class FileWriterAndFileReade {
  public static void main(String[] args) {
    Scanner sc = new Scanner ( System.in );
    String Filename = "baitap/docghifile/gogo.txt";
///////////////////////////////////////////////////////////////////////////////////////
    //FileReader để đọc văn Bản trong file và in ra
    try {
      FileReader fr = new FileReader ( Filename );
      BufferedReader br = new BufferedReader ( fr );
      String line;
      while ((line = br.readLine ( )) != null) {
        System.out.println ( line );
      }
      br.close ( );
    } catch (Exception e) {
      System.out.println ( "dữ liệu không đọc được, do không truy cập được Flie!" );
    }
    ////////////////////////////////////////////////////////////////////////////////////
    //in ra khi chạy đoạn code FileWriter ở dưới

    String WriteGoGo = "baitap/docghifile/gogo.txt";
    boolean result = writeToFile ( WriteGoGo );
    if (result) {
      System.out.println ( "Ghi file thành công." );
    } else {
      System.out.println ( "Ghi file thất bại." );
    }
  }

  /////////////////////////////////////////////////////////////////////////////////////////
  //FileWriter để ghi một đoạn văn bản vào file có sẵn
  //và dùng phương thức write(tên nhập dữ liệu cần ghi)
  public class WriteToFile {
    public static boolean writeToFile(String WriteGoGo) {
      Scanner sc = new Scanner ( System.in );
      try {
        FileWriter fw = new FileWriter ( WriteGoGo );
        System.out.print ( "nhập dữ liệu cần ghi vào file: " );
        String data = sc.nextLine ( );
        fw.write ( data );
        fw.close ( );
        return true;
      } catch (IOException e) {
        System.out.println ( "Lỗi ghi file: " + e.getMessage ( ) );
        return false;
      }
    }
  }
}
