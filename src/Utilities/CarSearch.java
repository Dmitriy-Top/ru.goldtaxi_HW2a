package Utilities;

import Entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by дима on 30.10.2016.
 */
public class CarSearch {
    public static Car searchFreeCar(List<Car> carArrayList, Order order) {
        Car suitCar = null;
        for (Car car : carArrayList) {
            if (CarSearch.compareOrderToCar(car, order)) {
                suitCar = car;
                break;
            }
        }
        return suitCar;


    }

    private static boolean compareOrderToCar(Car car, Order order) {
        boolean isSuitCar = true;
        if (Car.TYPE_OF_STATUS_RESERVED.equals(car.getCarStatus())) return false;
        if (!(car.isHaveBabySeat() == order.isNeedBabySeat())) isSuitCar = false;
        if (!(car.isSmokeCar() == order.isNeedSmokeCar())) isSuitCar = false;
        if (!(car.getCarClass() == order.getNeedCarClass())) isSuitCar = false;
        return isSuitCar;
    }
}
