package src.com.airtribe.service;

import java.util.ArrayList;

import src.com.airtribe.entity.Course;
import src.com.airtribe.exception.EntityNotFoundException;

public class CourseService {
     
    private ArrayList<Course> courses = new ArrayList<>();   

    public void addCourse(Course course){
         courses.add(course);
         System.out.println("Course added");
    }

    public void viewAllCourses(){
        if (courses.isEmpty()){
            System.out.println("No Courses found");
            return;
        }else{
            for (Course course : courses){
                System.out.println("Id : " + course.getId() + ", " + "CourseName : " + course.getCourseName() + ", " + "Description : " + course.getDescription() + ", " + "active : " + course.isActive());
            }
        }

        
    }


    public void deactivateCourse(int id, boolean active)throws EntityNotFoundException {
        for (Course course : courses){
            if (course.getId() == id){
                course.setActive(active);
                return;
            }
        }

        throw new EntityNotFoundException("Course Id " + id + " doesn't exist");
    }
}
