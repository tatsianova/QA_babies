package org.example.oop_tasks.tasks.simple.t3_point;

/**
 * Задача "Точка на плоскости":
 * Создайте класс `Point` с приватными полями `x` и `y` для координат точки на плоскости.
 * Реализуйте методы для получения (`get`) и установки (`set`) этих полей.
 * Создайте интерфейс `Movable` с методами `moveUp()`, `moveDown()`, `moveLeft()`, и `moveRight()`,
 * которые изменяют положение точки.
 */
public class Point implements Movable {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // interfaces methods

    @Override
    public void moveUp(double distance) {
        this.y += distance;
    }

    @Override
    public void moveDown(double distance) {
        this.y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        this.x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        this.x -= distance;
    }

    //getters
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

