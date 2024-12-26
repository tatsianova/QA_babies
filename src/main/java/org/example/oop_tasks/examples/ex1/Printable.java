package org.example.oop_tasks.examples.ex1;

//Создайте интерфейс Printable с методом print(), который будет реализован в классе
// BankAccount для вывода информации о счёте.
public interface Printable {
    // 'public' не нужен, так как в JAVA методы в интерфейсе по умолчанию public
    void print();//фигурных скобок нет тк это интерфейс-мы не пишем в нем реализацию
}
