package proxy;

public class Main {
  public static void main(String[] args) {

  Printable p = new PrinterProxy("Alice");

  System.out.println("current printer name is" + p.getPrinterName() );

  p.setPrinterName("Bob");

  System.out.println("current printer name is" + p.getPrinterName() );

  p.print("Hello, world.");
  p.print("test");

  p.setPrinterName("Tomas");
  
  System.out.println("current printer name is"+ p.getPrinterName() );
  }
}
