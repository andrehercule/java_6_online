package ua.paladiuc.hw7;

// bugfix branch

/*
Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
а) конструктор с параметрами в виде списка координат x, y, z
б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
в) метод, вычисляющий векторное произведение с другим вектором
г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
равен скалярному произведению векторов, деленному на произведение модулей (длин)
векторов:
д) методы для суммы и разности векторов
е) статический метод, который принимает целое число N, и возвращает массив случайных
векторов размером N.
*Если метод возвращает вектор, то он должен возвращать новый объект, а не менять
базовый

 */

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3.2, 4.5, 3);
        System.out.println(vector);
        System.out.println("Длина вектора: " + vector.length(3.2, 4.5, 3));
        System.out.println("Векторное произведение векторов: " + vector.crossProduct(new Vector(2.2, 5.4, 6.5)));
        System.out.println("Скалярное произведение векторов: " + vector.scalarProduct(new Vector(2.5, 3.4, 5.5)));
        System.out.println("Сумма векторов: " + vector.add(new Vector(5.1, 3.6, 8.7)));
        System.out.println("Разница векторов:" + vector.subtract(new Vector(2.5, 3.0, 2.8)));
        System.out.println("Косинус угла между векторами: " + vector.cos(new Vector(2, 3.2, 4.1)));

        Vector[] vectors = Vector.generate(5);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length(1, 2, 3));
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }

}
