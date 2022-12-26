package strategy;

import java.util.ArrayList;

public class Student {
  int studentID;
  String studentName;
  ArrayList<StudentSubject> subjectList;

  public Student(int studentID, String studentName){ 
   this.studentID = studentID;
   this.studentName = studentName;
    
   subjectList = new ArrayList<StudentSubject>();
  }

  public void addSubject(Subject subject, GradeStrategy strategy) {
   subjectList.add(new StudentSubject(subject, strategy));
  }

  public void showGradeInfo() {
    for (StudentSubject currSubject : subjectList) {
      System.out.printf("학생 %s의 ", studentName);
      currSubject.showGradeInfo();
    }
  }
}

class StudentSubject {
  Subject subject;
  GradeStrategy strategy;

  public StudentSubject(Subject subject, GradeStrategy strategy) {
    this.subject = subject;
    this.strategy = strategy;
  }

  public void showGradeInfo() {
    System.out.printf(
      "%s 과목 성적은 %d 점 이고, 학점은 %s 입니다.\n",
      subject.getName(),
      subject.getScorePoint(),
      strategy.gradeSubject(subject.getScorePoint())
    );
  }
}
