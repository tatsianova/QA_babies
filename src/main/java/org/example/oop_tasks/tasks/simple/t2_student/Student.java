package org.example.oop_tasks.tasks.simple.t2_student;

/**
 * Задача "Студент":
 * Создайте класс `Student` с полями для хранения имени, номера зачётной книжки и среднего балла.
 * Реализуйте методы для получения и установки этих полей.
 * Создайте интерфейс `Printable` с методом `print()`, аналогичный задаче "Банковский счёт",
 * для вывода информации о студенте.
 */
public class Student implements Printable {
    private String name;
    private int recordBookNumber;
    private double averageGrade;
    // print

    @Override
    public void print() {
        System.out.println("name: " + this.name);
        System.out.println("Record Book Number: " + this.recordBookNumber);
        System.out.println("Average Grade: " + this.averageGrade);
    }

    //getters
    public String getName() {
        return this.name;
    }

    public int getRecordBookNumber() {
        return this.recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    //setters
    public void setName(String studentName) {
        this.name = studentName;
    }

    public void setRecordBookNumber(int recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
