package service;

import model.Student;

public class StudentService {
    public static Student[] createStudentsArray(String[] data) {
        Student[] studentsArray = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            studentsArray[i] = new Student(data[i]);
        }
        return studentsArray;
    }

    //Task 1: Print full names of students
    public static void printFullNames(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
        System.out.println();
    }

    //Task 2: Print all male students
    public static void printMaleStudents(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    //Task 3: Print all female students who has mark greater then 50.4
    public static void printFemaleAndMarkGreaterThen(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
        System.out.println();
    }

    //Task 4: Print student information having the minimal mark
    public static void printStudentWithMinimalMark(Student[] students) {
        int indexOfMinimalElement = 0;
        double minimalMark = students[0].getMark();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < minimalMark) {
                minimalMark = students[i].getMark();
                indexOfMinimalElement = i;
            }
        }
        System.out.println(students[indexOfMinimalElement]);
        System.out.println();
    }

    //Task 5: Print biggest male student information
    public static void printBiggestMaleStudent(Student[] students) {
        Student biggestMale = null;
        for (Student student : students) {
            if (biggestMale == null) {
                if (student.getGender() == 'm') {
                    biggestMale = student;
                }
            } else {
                if (student.getGender() == 'm' && student.getBirthYear() < biggestMale.getBirthYear()) {
                    biggestMale = student;
                }
            }
        }
        if (biggestMale != null) {
            System.out.println(biggestMale);
        } else {
            System.out.println("No Male Student!");
        }
        System.out.println();
    }

    //Task 6: Print students sorted by mark
    public static void printStudentsSortedByMark(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    Student temporary = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temporary;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    //Task 7: Print female students sorted by year
    public static void printFemaleStudentsSortedByYear(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getBirthYear() < students[j + 1].getBirthYear()) {
                    Student temporary = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temporary;
                }
            }
        }
        for (Student student : students) {
            if (student.getGender() == 'f') {
                System.out.println(student);
            }
        }
        System.out.println();
    }
}