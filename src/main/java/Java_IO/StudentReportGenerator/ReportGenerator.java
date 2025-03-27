package Java_IO.StudentReportGenerator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator{
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Student1",1,100));
        studentList.add(new Student("Student2",2,85));
        studentList.add(new Student("Student3",3,88));
        studentList.add(new Student("Student4",4,70));
        studentList.add(new Student("Student5",5,95));

        try(PrintWriter pw = new PrintWriter("student_report.txt")){
            pw.println("Student Report");
            pw.println("______________________________");
            pw.println("Name | Roll No. | Marks");
            pw.println("______________________________");

            for (Student student : studentList) {
                pw.printf("%-10s | %-8d | %-8.2f\n", student.getName(), student.getRollNumber(), student.getMarks());
            }
            pw.close();
        }
        catch(IOException e){
            System.out.println("Error in generating the student report");
        }
    }
}
