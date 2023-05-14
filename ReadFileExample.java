package thuhanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
  public static void main(String[] args) {
    System.out.println ( "nhập đường dẫn file: " );
    Scanner sc = new Scanner ( System.in );
    String Path = sc.nextLine ( );

    ReadFileExample readFileEx = new ReadFileExample ( );
    readFileEx.readFileText ( Path );
  }

  public void readFileText(String filePath) {
    try{
      //đọc file theo đường dẫn
      File file = new File (filePath);
      //kiểm tra xem file có còn tồn tại hay không
      if(file.exists ()){
        throw new FileNotFoundException ();
      }
      // Đọc từng dòng của file và tiến hành cộng tổng lại
      BufferedReader br = new BufferedReader(new FileReader (file));
      String line = "";
      int sum = 0;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
        sum += Integer.parseInt(line);
      }
      br.close();

      // Hiển thị ra màn hình tổng các số nguyên trong file
      System.out.println("Tổng = " + sum);
    } catch (Exception e) {
      // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
      System.err.println("Fie không tồn tại or nội dung có lỗi!");
    }
  }
}




