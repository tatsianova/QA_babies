package org.example.oop_tasks.tasks.simple.t4_clock;

/**
 * Задача 4 "Часы":
 * Создайте класс `Clock` с полями для хранения часов, минут и секунд.
 * Реализуйте методы для установки и получения времени,
 * а также метод `tick()`, который увеличивает время на одну секунду.
 * Создайте интерфейс `Readable` с методом `readTime()`, который выводит текущее время.
 */
public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;


    // Конструктор
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //interface methods
    @Override
    public void readTime() {
        System.out.println("Current time: " + hours + "." + minutes + "." + seconds);
    }

    // method который увеличивает время на одну секунду
    public void tick() {
        this.seconds += 1;
        // учитываем переполнение секунд
        if (this.seconds == 60) {
            this.minutes += 1;
            this.seconds = 0;
        }
        if (this.minutes == 60) {
            this.hours += 1;
            this.minutes = 0;
        }
    }

    //getters
    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    // setters
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
