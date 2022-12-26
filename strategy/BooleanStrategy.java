package strategy;

public class BooleanStrategy implements GradeStrategy {
  @Override
  public String gradeSubject(int grade) {
    if (grade >= 50)
      return "PASS";

    return "FAIL";
  }
}
