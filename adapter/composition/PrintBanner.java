package adapter.composition;

public class PrintBanner implements Print {
  private Banner banner;

  public PrintBanner(String string) {
    banner = new Banner(string);
  }

  @Override
  public void printWeak() {
    banner.showWithParen();
  }

  @Override
  public void printStrong() {
    banner.showWithAster();
  }
}
