package baitap.SuDungFile;

import java.io.File;

public class SuDungFile {
  public static void main(String[] args) {
    String FileName = "textname.txt";

    File file = new File (FileName);


    //kiểm tra xem file có tồn tại không
    if(file.exists ( )){
      System.out.println ("file có tồn tại");
    }else {
      System.out.println ("file không tồn tại");
    }
    //kiểm tra xem file có phải là thư mục hay không
    if(file.isAbsolute ( )){
      System.out.println ("file là thư mục");
    }else {
      System.out.println ("file không phải là thư mục");
    }

    //hiển thị đường dẫn file
    System.out.println ("đường dẫn đến file: "+ file.getAbsolutePath ());


  }
}
