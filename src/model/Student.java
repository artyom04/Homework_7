package model;

public class Student {
    private String name;
    private String surname;
    private char gender;
    private double mark;
    private short birthYear;

    public Student(String data) {
        String[] splitData = data.split(",");
        setName(splitData[0]);
        setSurname(splitData[1]);
        setBirthYear(Short.parseShort(splitData[2]));
        setGender(splitData[3].charAt(0));
        setMark(Double.parseDouble(splitData[4]));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name can't be empty!");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname;
        } else {
            System.out.println("Surname can't be empty!");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'm') {
            this.gender = gender;
        } else {
            System.out.println("Gender should be 'm' for male and 'f' for female!");
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            System.out.println("Mark should be number between 0 and 100!");
        }
    }

    public short getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(short birthYear) {
        if (birthYear >= 1900 && birthYear <= 2020) {
            this.birthYear = birthYear;
        } else {
            System.out.println("Year of Birthday must be between 1900 and 2020");
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Year of Birth: " + this.getBirthYear() +
                ", Gender: " + this.getGender() + ", Mark: " + this.getMark();
    }
}