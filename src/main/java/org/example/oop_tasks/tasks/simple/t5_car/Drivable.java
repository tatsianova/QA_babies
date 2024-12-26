package org.example.oop_tasks.tasks.simple.t5_car;

/**
 * Создайте интерфейс `Drivable` с методами `start()`, `stop()`, и `drive(distance)`,
 * которые реализует класс `Car` для имитации вождения автомобиля.
 */
public interface Drivable {
    void start();

    void stop();

    void drive(double distance);
}
