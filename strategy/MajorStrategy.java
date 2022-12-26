package strategy;

public class MajorStrategy implements GradeStrategy {
  @Override
  public String gradeSubject(int grade) {
    if (grade >= 95)
      return "S";

    if (grade >= 90)
      return "A";

    if (grade >= 80)
      return "B";

    if (grade >= 70)
      return "C";

    if (grade >= 60)
      return "D";

    return "F";
  }
}
