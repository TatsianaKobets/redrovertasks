package by.http.redrovertasks.task_8;

import java.util.HashMap;
import java.util.Map;

public class ClassJournal {

  private String[] studentNames;
  private Map<String, Map<Integer, Integer>> studentGrades;

  public ClassJournal(int studentCount) {
    studentNames = new String[studentCount];
    studentGrades = new HashMap<>();

    for (int i = 0; i < studentCount; i++) {
      studentNames[i] = "Student " + (i + 1);
      studentGrades.put(studentNames[i], new HashMap<>());
    }
  }

  public void setGrade(String studentName, int lessonNumber, int grade) {
    studentGrades.get(studentName).put(lessonNumber, grade);
  }

  public void printGradesForLesson(int lessonNumber) {
    for (String studentName : studentGrades.keySet()) {
      if (studentGrades.get(studentName).containsKey(lessonNumber)) {
        System.out.println(studentName + ": " + studentGrades.get(studentName).get(lessonNumber));
      }
    }
  }

  public void printGradesForStudent(String studentName) {
    for (int lessonNumber = 1; lessonNumber <= 10; lessonNumber++) {
      if (studentGrades.get(studentName).containsKey(lessonNumber)) {
        System.out.println(
            "Lesson " + lessonNumber + ": " + studentGrades.get(studentName).get(lessonNumber));
      }
    }
  }

  public void printGradesForCourse(String studentName) {
    for (int lessonNumber = 1; lessonNumber <= 10; lessonNumber++) {
      if (studentGrades.get(studentName).containsKey(lessonNumber)) {
        System.out.println(
            "Lesson " + lessonNumber + ": " + studentGrades.get(studentName).get(lessonNumber));
      }
    }
  }

  public double calculateAverageGrade(String studentName) {
    int totalGradeSum = 0;
    int totalLessonCount = 0;

    for (int lessonNumber = 1; lessonNumber <= 10; lessonNumber++) {
      if (studentGrades.get(studentName).containsKey(lessonNumber)) {
        totalGradeSum += studentGrades.get(studentName).get(lessonNumber);
        totalLessonCount++;
      }
    }
    return (double) totalGradeSum / totalLessonCount;
  }
}
