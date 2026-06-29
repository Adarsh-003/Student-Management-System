package src.com.airtribe.ui;

import src.com.airtribe.entity.Course;
import src.com.airtribe.entity.Enrollment;
import src.com.airtribe.entity.Student;
import src.com.airtribe.exception.EntityNotFoundException;
import src.com.airtribe.service.CourseService;
import src.com.airtribe.service.EnrollmentService;
import src.com.airtribe.service.StudentService;
import src.com.airtribe.util.IdGenerator;

public class Main {
    public static void main(String[] args ) {
        StudentService studentService = new StudentService();

       
        Student student = new Student(IdGenerator.getNextStudentId(), "adarsh", "nani", "adarash@hgmil.com", "python", true);
        Student student1 = new Student(IdGenerator.getNextStudentId(), "addy", "nani", "adarash@hgmil.com", "python", false);

        // System.out.println(student.getId());
        // studentService.addStudent(student);
        // studentService.addStudent(student1);
        // studentService.addStudent("andrew", "kumar");
        // try{
        //     studentService.searchById(5);
        // }catch(EntityNotFoundException e){
        //     System.out.println(e.getMessage());
        // }
        
        // studentService.updateStudent(1, "addy@gmail.com");
        // studentService.deactivateStudent(0, false);
        // studentService.listStudents();



        CourseService courseService = new CourseService();

        Course course = new Course(IdGenerator.getNextCourseId(), "Backend" , "programming of servers" , 2 , true);
        Course course1 = new Course(IdGenerator.getNextCourseId(), "Frontend" , "programming of userinterface" , 2 , true);
        Course course2 = new Course(IdGenerator.getNextCourseId(), "Database" , "programming of database" , 2 , true);
        courseService.addCourse(course);
        courseService.addCourse(course1);
        courseService.addCourse(course2);
        try {
            courseService.deactivateCourse(4001, false);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage()); 
        }
        
        courseService.viewAllCourses();
    

        EnrollmentService enrollmentService = new EnrollmentService();

        Enrollment enrollment = new Enrollment(IdGenerator.getNextEnrollmentId(), 0, 4000, null, null);
        Enrollment enrollment1 = new Enrollment(IdGenerator.getNextEnrollmentId(), 1, 4001, null, null);
        Enrollment enrollment2 = new Enrollment(IdGenerator.getNextEnrollmentId(), 2, 4002, null, null);

    //     enrollmentService.enrollCourse(enrollment);
    //     enrollmentService.enrollCourse(enrollment1);
    //     enrollmentService.enrollCourse(enrollment2);    
    //     enrollmentService.setEnrollmentStatus(8000, "completed");
    //     enrollmentService.setEnrollmentStatus(8002, "cancelled");
    //     enrollmentService.viewEnrollments();
    }
}
