package src.com.airtribe.service;

import java.util.ArrayList;

import src.com.airtribe.entity.Enrollment;

public class EnrollmentService {
    
    private ArrayList<Enrollment> enrollments  = new ArrayList<>();

    public void enrollCourse(Enrollment enrollment){
         enrollments.add(enrollment);
         System.out.println("Course Enrolled");
         return;
    }

    public void viewEnrollments(){
        for (Enrollment enrollment : enrollments){
            System.out.println("Id : " + enrollment.getId() + ", " + "StudentId : " + enrollment.getStudentId() +  ", " +
             "CourseId : " + enrollment.getCourseId() +  ", " + "ErollmentDate : " + enrollment.getEnrollmentDate() + ", " + "Status : " + enrollment.getStatus());
        }
    }

    public void setEnrollmentStatus(int id, String status){
        for (Enrollment enrollment : enrollments){
            if (enrollment.getId() == id ){
                enrollment.setStatus(status);
                return;
            }
        }

    }

}
