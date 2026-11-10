
package assignmnet3_4;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(101, "Taranand", 23);

        Course course = new Course(
                "IT101", "Java Programming", "John");

        Enrollment enrollment = new Enrollment(
                student, course, "10.11.2026");

        try {
            // Save enrollment into a file
            ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream("enrollments.ser"));

            output.writeObject(enrollment);
            output.close();

            System.out.println("Enrollment saved successfully!");

            // Read enrollment from the file
            ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream("enrollments.ser"));

            Enrollment saved = (Enrollment) input.readObject();
            input.close();

            System.out.println("Student ID: " + saved.getStudent().getId());
            System.out.println("Student Name: " + saved.getStudent().getName());
            System.out.println("Student Age: " + saved.getStudent().getAge());
            System.out.println("Course Code: " + saved.getCourse().getCourseCode());
            System.out.println("Course Name: " + saved.getCourse().getCourseName());
            System.out.println("Instructor: " + saved.getCourse().getInstructor());
            System.out.println("Enrollment Date: " + saved.getEnrollmentDate());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

