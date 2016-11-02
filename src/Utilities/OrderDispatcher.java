package Utilities;

import Entity.Car;
import Entity.Order;

/**
 * Created by admin on 02.11.2016.
 */
public class OrderDispatcher {
    public static String reservCarToOrder(Car car, Order order){
        if (car != null) {
            car.setCarStatus(Car.TYPE_OF_STATUS_RESERVED);
            order.setCarReserver(car);
            return "На ваш заказ назначена: "+car;
        } else {
            return "В данный момент нет подходящего для вас автомобиля, заявка ожидает подходящего, освободившегося автомобиля." ;
        }

    }
    private OrderDispatcher(){}
}
