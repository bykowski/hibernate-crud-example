import entity.Car;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();

        Car car = new Car();
        car.setMark("Hyundai");
        car.setProductionDate(LocalDate.of(2000, 1, 1));

        carDAO.add(car);
        carDAO.read(1L);
        carDAO.update(1L, car);
        carDAO.delete(1L);
    }
}
