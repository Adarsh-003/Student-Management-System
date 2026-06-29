package src.com.airtribe.util;

public class IdGenerator {
    private static int studentIdCounter = 0;
    private static int courseIdCounter = 4000; 
    private static int enrollmentIdCounter = 8000;



    public static int getNextStudentId(){
        return studentIdCounter++;
    }

    public static int getNextCourseId(){
        return courseIdCounter++;
    }

    public static int getNextEnrollmentId(){
        return enrollmentIdCounter++;
    }

    
}