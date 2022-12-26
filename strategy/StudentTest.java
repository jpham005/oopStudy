package strategy;

public class StudentTest {
  public static void main(String[] args) { 
    Student studentLee = new Student(1001, "Lee");

    studentLee.addSubject(new Subject("국어", 100), new BasicStrategy());
    studentLee.addSubject(new Subject("수학", 100), new MajorStrategy());

    Student studentKim = new Student(1002, "Kim");

    studentKim.addSubject(new Subject("국어", 55), new MajorStrategy());
    studentKim.addSubject(new Subject("수학", 55), new BasicStrategy());
    studentKim.addSubject(new Subject("영어", 100), new BooleanStrategy());

    studentLee.showGradeInfo();
    System.out.println("======================================");
    studentKim.showGradeInfo();
  }
}
