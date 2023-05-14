package thuhanh.huongdan;

import java.io.File;

public class huongdan {
  public static void main(String[] args) {
    File myFile = new File ("ten_file.txt");
    String fileName = myFile.getName();
    String filePath = myFile.getPath();
    System.out.println ("Tên file: " + fileName );
    System.out.println ("Đường dẫn tuyệt đối: " + filePath);
  }
}
