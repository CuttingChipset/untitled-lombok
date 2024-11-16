import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class LombokCar {
    private String color;
    private int year;
    private String brand;
    private String model;
    private int quantity;
    private int price;
}

public class LombokShowcase {
    public static void main(String[] args) {
        LombokCar car1 = new LombokCar("yellow", 2202, "GMC", "Bruno", 33, 24440);
        LombokCar car2 = new LombokCar("green", 2022, "Vauxhall", "Zafira", 17772, 22200);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println("Are cars equal? " + car1.equals(car2));
        System.out.println("Hashcode of car1 = " + car1.hashCode());
        System.out.println("Hashcode of car2 = " + car2.hashCode());
    }
}