package org.example.oop_tasks.tasks.simple.t3_point;

/**
 * Создайте интерфейс `Movable` с методами `moveUp()`, `moveDown()`, `moveLeft()`, и `moveRight()`,
 * которые изменяют положение точки.
 */
public interface Movable {
    void moveUp(double distance);

    void moveDown(double distance);

    void moveLeft(double distance);

    void moveRight(double distance);
}
