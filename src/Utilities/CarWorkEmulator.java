package Utilities;

import Entity.Car;

import java.util.List;

/**
 * Created by admin on 02.11.2016.
 */
public class CarWorkEmulator implements Runnable {
    private List<Car> carList;

    @Override
    public void run() {
        while (true) {
            synchronized (carList) {
                for (Car car : carList) {
                    if (Car.TYPE_OF_STATUS_RESERVED.equals(car.getCarStatus())) {
                        try {
                            Thread.sleep((long) (Math.random() * 10000));
                        } catch (InterruptedException e) {
                            ClientsMassage.showError(e.getMessage());
                        }
                        car.setCarStatus(Car.TYPE_OF_STATUS_FREE);
                        ClientsMassage.showMassage("Автомобиль: "+car.toString()+" ожидает заказа");
                    }
                }
            }
        }
    }

    public CarWorkEmulator(List<Car> carList) {
        this.carList = carList;
        new Thread(this).start();
    }
}
