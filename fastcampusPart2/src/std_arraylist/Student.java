package std_arraylist;

import java.util.ArrayList;

public class Student {
    int studentId;
    String studentName;

    ArrayList<Subject> subjectList;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point){
        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(point);

        subjectList.add(subject);
    }

    public void showScoreInfo(){
        int total = 0;
        for(Subject subject : subjectList){
            total += subject.getScore();
            System.out.println(studentName + " 학생의 " + subject.getSubjectName() + "과목 점수는 "+ subject.getScore() +"입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }
}