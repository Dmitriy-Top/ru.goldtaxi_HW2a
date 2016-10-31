package Entity;

/**
 * Created by дима on 30.10.2016.
 */
public class Order {
    private String startPoint;
    private String endPoint;
    private boolean isNeedBabySeat;
    private boolean isNeedSmokeCar;
    private int needCarClass;
    private Car carReserver;

    public Order(String startPoint, String endPoint, boolean isNeedBabySeat, boolean isNeedSmokeCar, int needCarClass) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.isNeedBabySeat = isNeedBabySeat;
        this.isNeedSmokeCar = isNeedSmokeCar;
        this.needCarClass = needCarClass;
        this.carReserver = null;
    }

    public boolean isNeedBabySeat() {
        return isNeedBabySeat;
    }

    public boolean isNeedSmokeCar() {
        return isNeedSmokeCar;
    }

    public int getNeedCarClass() {
        return needCarClass;
    }

    public Car getCarReserver() {
        return carReserver;
    }

    public void setCarReserver(Car carReserver) {
        this.carReserver = carReserver;
    }

    @Override
    public String toString() {
        String orderedCar = (this.carReserver == null) ? ", машина не назначена" : ", " + this.carReserver.toString();
        String orderedType;
        if (this.needCarClass == Car.TYPE_OF_CLASS_BUSYNESS) orderedType = "Бизнес класс";
        else if (this.needCarClass == Car.TYPE_OF_CLASS_ECONOMIC) orderedType = "Эконом класс";
        else orderedType = "Не присвоен";
        return "Пункт отправки: " + this.startPoint + ", конечная точка: " + this.endPoint + ", необходимо детское сидение: " + this.isNeedBabySeat + ", необходим салон для курящих: " + this.isNeedSmokeCar + ", класс машины: " + orderedType + orderedCar;
    }
}
