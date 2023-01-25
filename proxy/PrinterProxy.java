package proxy;

public class PrinterProxy implements Printable {
  private String name; // 이름
  private Printer real; // "본인"

  public PrinterProxy(String name) {
    this.name = name;
  }

  public PrinterProxy() {
    this.name = "default";
  }

  public String getPrinterName() {
    System.out.println("proxy : getPrinterName()");
    return name;
  }
  
  public synchronized void setPrinterName(String name) {
    System.out.println("proxy : setPrinterName()");
    this.name = name;
  }

  // real printer

  private synchronized void realize() {
    real = new Printer(name);
  }

  public void print(String string) {
    realize();
    real.print(string);
  }

}
