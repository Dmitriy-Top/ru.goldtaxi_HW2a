package Utilities;

import Entity.Car;
import Entity.Order;

import java.util.List;

/**
 * Created by admin on 02.11.2016.
 */
public class OrderWaiter implements Runnable {
    private Order order;
    private List<Car> carList;


    public OrderWaiter(Order order, List<Car> carList) {
        this.order = order;
        this.carList = carList;
        new Thread(this).start();
    }

    @Override
    public void run() {
        boolean isFind = false;
        boolean waitingTextIsShow = false;
        while (!isFind) {
            Car suitCar = CarSearch.searchFreeCar(carList, order);
            String result = OrderDispatcher.reservCarToOrder(suitCar, order);
            if (suitCar != null){
                ClientsMassage.showMassage(result);
                isFind = true;
            } else if (waitingTextIsShow==false && suitCar == null){
                ClientsMassage.showMassage(result);
                waitingTextIsShow=true;
            }

        }
    }
}
