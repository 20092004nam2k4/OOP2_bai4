package baitap.docdulieu;


import java.io.FileWriter;
import java.io.IOException;

class FileReader {
  public static void main(String[] args) {
    String data = "đã lưu vào file";
    try {
      FileWriter fileWriter = new FileWriter ("baitap/docdulieu/filename.txt");
      fileWriter.write(data);
      fileWriter.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
