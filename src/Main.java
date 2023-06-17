import ra.Car;
import ra.Motorcycle;
import ra.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        //khởi tạo đối tượng từ lớp con
        Car car = new Car("oto tải suzuki","màu trắng");
        Car car1 = new Car("taxi", "màu vàng");

        Motorcycle motorcycle = new Motorcycle("yamaha","mau xanh ngọc");
        Motorcycle motorcycle1 = new Motorcycle("zim","mau đỏ");
        System.out.println(car1.getBrand());
        System.out.println(car.toString());
        System.out.println(car1.toString());
        System.out.println(motorcycle.toString());
        System.out.println(motorcycle1.toString());
    }
}