package org.example.oop_tasks.tasks.simple.t5_car;

/**
 * Задача 5 "Автомобиль":
 * Создайте класс `Car` с полями для марки, модели и года выпуска.
 * Реализуйте методы для получения и установки этих полей.
 * Создайте интерфейс `Drivable` с методами `start()`, `stop()`, и `drive(distance)`,
 * которые реализует класс `Car` для имитации вождения автомобиля.
 */
public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    boolean isRunning;

    public Car(String brand, String model, int year, boolean isRunning) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isRunning = isRunning;
    }

    // Drivable interface methods
    @Override
    public void start() {
        System.out.println("Car is running");
        this.isRunning = true;
    }

    public void stop() {
        System.out.println("Car stopped");
        this.isRunning = false;
    }

    public void drive(double distance) {
        if (!this.isRunning) {
            System.out.println("Start car");
            this.isRunning=true;
        }

        System.out.println("The car is running.");

        double distanceTraveled = 0; // Переменная для отслеживания пройденного расстояния

        while (distanceTraveled < distance) {
            distanceTraveled += 1; // Увеличиваем пройденное расстояние
        }

        System.out.println("The car drived " + distance + " km.");
        stop(); // Останавливаем автомобиль после достижения нужного расстояния
    }

    //getters
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
