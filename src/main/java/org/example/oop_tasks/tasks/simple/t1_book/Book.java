package org.example.oop_tasks.tasks.simple.t1_book;

/**
 * Задача "Книга":
 * Создайте класс `Book` с полями для хранения названия, автора и года издания.
 * Реализуйте методы для получения и установки этих полей.
 * Создайте интерфейс `Displayable` с методом `display()`, который будет реализован в классе `Book` для отображения информации о книге.
 */
public class Book implements Displayable {
    private String name;
    private String author;
    private int year;
// method from interface

    @Override
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Year: " + this.year);
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    //setters
    public void setName(String bookName) {
        this.name = bookName;
    }

    public void setAuthor(String bookAuthor) {
        this.author = bookAuthor;
    }

    public void setYear(int bookYear) {
        this.year = bookYear;
    }
}
