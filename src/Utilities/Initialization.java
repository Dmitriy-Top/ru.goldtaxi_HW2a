package Utilities;

import Entity.Car;
import Entity.Driver;

import java.util.ArrayList;

/**
 * Created by дима on 30.10.2016.
 */
public class Initialization {
    public static ArrayList<Car> initCarArray() {
        ArrayList<Car> carArray = new ArrayList<Car>();
        carArray.add(new Car("Лада 2114", new Driver("Теренкин Василий Павлович", "+79276548756"), "MP 745 A 163", true, false, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_FREE));
        carArray.add(new Car("Лада 2110", new Driver("Пихтин Сергей Егорович", "+79627498756"), "AM 145 M 163", false, true, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_RESERVED));
        carArray.add(new Car("Лада Priora", new Driver("Андреянчинко Владимир Васильевич", "+79456164851"), "TK 148 T 163", false, false, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_FREE));
        carArray.add(new Car("Лада 2112", new Driver("Холмогоров Василий Сергеевич", "+79329351856"), "PP 359 M 163", false, true, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_RESERVED));
        carArray.add(new Car("Лада Ларгус", new Driver("Авдеев Максим Владимирович", "+79472751458"), "MA 785 A 163", true, true, Car.TYPE_OF_CLASS_BUSYNESS, Car.TYPE_OF_STATUS_FREE));
        carArray.add(new Car("Ford Focus", new Driver("Карпенко Светлана Васильевна", "+79798359468"), "AA 726 T 163", false, true, Car.TYPE_OF_CLASS_BUSYNESS, Car.TYPE_OF_STATUS_FREE));
        carArray.add(new Car("Toyota Camry", new Driver("Афанасьев Михаил Максимович", "+79365256854"), "XE 521 M 163", false, false, Car.TYPE_OF_CLASS_BUSYNESS, Car.TYPE_OF_STATUS_FREE));
        carArray.add(new Car("Renault Logan", new Driver("Перепелкина Елена Степановна", "+79242965478"), "EM 279 T 163", true, true, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_RESERVED));
        carArray.add(new Car("Renault Duster", new Driver("Телегин Олег Михайлович", "+79456125465"), "KM 248 X 163", false, true, Car.TYPE_OF_CLASS_ECONOMIC, Car.TYPE_OF_STATUS_RESERVED));
        carArray.add(new Car("Skoda Octavia", new Driver("Васечкин Дмитрий Александрович", "+79785458754"), "EK 777 K 163", true, false, Car.TYPE_OF_CLASS_BUSYNESS, Car.TYPE_OF_STATUS_FREE));
        return carArray;
    }

}
