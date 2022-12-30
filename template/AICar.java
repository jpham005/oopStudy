package template;

public class AICar extends Car{

  @Override
  public void drive() {
    System.out.println("자율 주행합니다");
    System.out.println("자동차가 스스로 방향을 바꿉니다");
  }

  @Override
  public void stop() {
    System.out.println("스스로 멈춥니다");
  }

  @Override
  public void turnOff() {
    System.out.println("시동을 끕니다");
    System.out.println("OS 업데이트를 체크합니다");
    System.out.println("프로세스를 종료합니다");
  }
}
