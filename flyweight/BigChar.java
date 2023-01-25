package flyweight;

import java.io.File;
import java.io.FileReader;

public class BigChar {
  private String bigString = new String();

  public BigChar(char c) {
    StringBuilder fileName = new StringBuilder();
    fileName.append("/goinfre/jaham/oopStudy/flyweight/big/big").append(c).append(".txt");
    try {
      FileReader fileReader = new FileReader(new File(fileName.toString()));
      char[] str = new char[2048];
      fileReader.read(str);
      bigString = new String(str);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public BigChar(char c1, char c2) {
    bigString += c1;
    bigString += c2;
  }
  
  public void print() {
    System.out.print(bigString);
  }
}
