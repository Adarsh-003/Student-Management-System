package src.com.airtribe.service;
import src.com.airtribe.entity.Student;
import src.com.airtribe.exception.EntityNotFoundException;
import src.com.airtribe.util.IdGenerator;

import java.util.ArrayList;

public class StudentService {
    
    private ArrayList<Student> students = new ArrayList<>(); 


    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student Added");
    }

    public void addStudent(String firstName, String lastName){
        Student student = new Student(IdGenerator.getNextStudentId(),firstName,lastName,"email","Java",true);
        students.add(student);
        System.out.println("Student Added");
    }

    public void removeStudent(int id){
        for (Student student : students){
            if (student.getId() == id){
                students.remove(student);
                return;
            }
        }
    }

    public void searchById(int id) throws EntityNotFoundException{
        for (Student student : students){
            if (student.getId() == id){
                System.out.println("Id : " + student.getId() + " " + "FirstName : " + student.getFirstName() + " " + "LastName : " + student.getLastName());
                return;
            }
        }

        throw new EntityNotFoundException("Student with Id " + id  + " not found");
    }
    
    public void deactivateStudent(int id, boolean active){
        for (Student student : students){
            if(student.getId() == id){
                student.setActive(active);
                System.out.println("Id :" +student.getId() +" " +"Student Deactivated");
                return;
            }
        }
    }

    public void updateStudent(int id, String newEmail){
        for (Student student : students){
            if (student.getId() == id){

                student.setEmail(newEmail);
                return;
            }
        }
    }


    public void listStudents(){
        if (students.isEmpty()){
            System.out.println("No Students found");
            return;
        }
        for (Student student : students){

            System.out.println(student.getId() + " " + student.getDisplayName() + " " + student.getEmail() + " " + student.getActive());
        }

    }
}
