package springorm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import entities.Student;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm/config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Scanner sc = new Scanner(System.in);
        boolean go = true;
        while (go) {
            System.out.println("***********Welcome to my ORM Project***********");
            System.out.println("Press 1 to add new student");
            System.out.println("Press 2 to display all students");
            System.out.println("Press 3 to get details of a student");
            System.out.println("Press 4 to delete a student");
            System.out.println("Press 5 to update a student");
            System.out.println("Press 6 to exit");
            System.out.println("***********************************************");
            
            try {
                int input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1:
                        // Add new student
                        System.out.println("Enter student id:");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter student name:");
                        String name = sc.nextLine();
                        System.out.println("Enter student city:");
                        String city = sc.nextLine();
                        Student student = new Student(id, name, city);
                        int result = studentDao.insert(student);
                        System.out.println("Student added successfully" + result);
                        break;
                    case 2:
                        //Display all students
                            List<Student> allstudents = studentDao.getAllStudents();
                            for(Student s:allstudents){
                                System.out.println("Id: " + s.getId());
                                System.out.println("Name: " + s.getName());
                                System.out.println("City: " + s.getStudentCity());
                                System.out.println("-----------------------------");
                            }
                        break;
                    case 3:
                        // Get details of a student
                        System.out.println("Enter student id:");
                        int userId = Integer.parseInt(sc.nextLine());
                        Student student1 = studentDao.getStudent(userId);
                        System.out.println("Id: " + student1.getId());
                        System.out.println("Name: " + student1.getName());
                        System.out.println("City: " + student1.getStudentCity());
                        System.out.println("-----------------------------");
                        break;
                    case 4:
                        // Delete a student
                        System.out.println("Enter student id:");
                        int studentId = Integer.parseInt(sc.nextLine());
                        studentDao.deleteStudent(studentId);
                        System.out.println("Student deleted successfully");
                        break;
                    case 5:
                        // Update a student
                        System.out.println("Enter student id:");
                        int studentId1 = Integer.parseInt(sc.nextLine());
                        Student student2 = studentDao.getStudent(studentId1);

                        System.out.println("Enter new student name:");
                        String name1 = sc.nextLine();
                        System.out.println("Enter new student city:");
                        String city1 = sc.nextLine();
                        student2.setName(name1);
                        student2.setStudentCity(city1);
                        
                        studentDao.updateStudent(student2);
                        System.out.println("Student updated successfully");
                        break;
                    case 6:
                        // Exit
                        System.out.println("Thank you for using my ORM Project");
                        go = false;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number between 1 and 6");
            }
        }
        
    }
}
