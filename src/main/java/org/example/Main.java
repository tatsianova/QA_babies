package org.example;


import org.example.oop_tasks.examples.ex1.BankAccount;
import org.example.oop_tasks.tasks.simple.t1_book.Book;
import org.example.oop_tasks.tasks.simple.t2_student.Student;
import org.example.oop_tasks.tasks.simple.t3_point.Point;
import org.example.oop_tasks.tasks.simple.t4_clock.Clock;
import org.example.oop_tasks.tasks.simple.t5_car.Car;

// main - единственная точка входа в джава, поэтому запуски только тут
public class Main {
    public static void main(String[] args) {
        //example1 - Bank Account
        System.out.println(" ");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(1000);
        bankAccount.print();
        System.out.println(" ");
        //task1 - Book
        Book book = new Book();
        book.setAuthor("My Book Author");
        book.setName("My Book Name");
        book.setYear(1985);
        System.out.println("task1, Book: ");
        book.display();
        System.out.println(" ");
        // task2 - Student
        Student student = new Student();
        student.setName("My Student Name");
        student.setAverageGrade(45.60);
        student.setRecordBookNumber(666);
        System.out.println("task2 Student: ");
        student.print();
        System.out.println(" ");
        // task3 - Point
        Point point = new Point(10, 15);
        System.out.println("task3 Point: ");
        point.moveDown(10);
        System.out.println("Y should be 5: " + point.getY());
        point.moveUp(100);
        System.out.println("Y should be 105: " + point.getY());
        point.moveLeft(1000);
        System.out.println("X should be -990: " + point.getX());
        point.moveRight(500);
        System.out.println("X should be -490: " + point.getX());
        System.out.println(" ");
        // task4 - Clock
        Clock clock = new Clock(23, 59, 59);
        System.out.println("task4 Clock: ");
        clock.readTime();
        clock.tick();
        clock.readTime();
        System.out.println(" ");
        // task5 - Car
        Car car = new Car("Tesla", "Tm1", 1985, false);
        System.out.println("task5 Car: ");
        car.drive(100);
        System.out.println(" ");


    }
}