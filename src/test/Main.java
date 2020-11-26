package test;

import model.Student;
import service.FileService;
import service.StudentService;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] data = FileService.read("C:\\Users\\Artyom\\Desktop\\test.txt");
        Student[] myStudentArray = StudentService.createStudentsArray(data);

        //Task 1 - Test
        System.out.println("Testing Task 1: Print full names of students");
        StudentService.printFullNames(myStudentArray);
        System.out.println("Testing Task 2: Print all male students");
        StudentService.printMaleStudents(myStudentArray);
        System.out.println("Testing Task 3: Print all female students who has mark greater then 50.4");
        StudentService.printFemaleAndMarkGreaterThen(myStudentArray);
        System.out.println("Testing Task 4: Print student information having the minimal mark");
        StudentService.printStudentWithMinimalMark(myStudentArray);
        System.out.println("Testing Task 5: Print biggest male student information");
        StudentService.printBiggestMaleStudent(myStudentArray);
        System.out.println("Testing Task 6: Print students sorted by mark");
        StudentService.printStudentsSortedByMark(myStudentArray);
        System.out.println("Testing Task 7: Print female students sorted by year");
        StudentService.printFemaleStudentsSortedByYear(myStudentArray);
    }
}