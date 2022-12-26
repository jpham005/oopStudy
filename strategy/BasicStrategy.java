package strategy;

public class BasicStrategy implements GradeStrategy {
  @Override
  public String gradeSubject(int grade) {
    if (grade >= 90)
      return "A";

    if (grade >= 80)
      return "B";

    if (grade >= 70)
      return "C";

    if (grade >= 55)
      return "D";

    return "F";
  }
}
