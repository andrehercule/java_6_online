package ua.paladiuc.hw6;
/*
Задание 1
Класс Phone.
а) Создайте класс Phone, который содержит переменные(поля) number,
model и weight.
б) Добавить конструктор в класс Phone, который принимает на вход
три параметра для инициализации переменных класса - number, model
и weight.
в) Добавить конструктор, который принимает на вход два параметра
для инициализации переменных класса - number, model.
г) Добавить конструктор без параметров.
д) Создайте три экземпляра этого класса.
ж) Присвоить значения полям класса.
з) Выведите на консоль значения их полей.
и) Добавить в класс Phone методы: receiveCall, имеет один параметр
– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
getNumber – возвращает номер телефона. Вызвать эти методы для
каждого из объектов.

 */

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(25, "Nokia", 200.5);
        Phone phone2 = new Phone(40, "Samsung", 210.2);
        Phone phone3 = new Phone(35, "Iphone 6", 185.3);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();
        phone1.receiveCall("Андрей");
        System.out.println(phone1.getNumber());
        System.out.println();
        phone2.receiveCall("Александр");
        System.out.println(phone2.getNumber());
        System.out.println();
        phone3.receiveCall("Владимир");
        System.out.println(phone3.getNumber());
    }
}
