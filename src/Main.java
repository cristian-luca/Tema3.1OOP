

public class Main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();        //instantierea clasei ElonsToyCar

        System.out.println(car.distanceDisplay());  //Output: Driven 0 meters

        System.out.println(car.batteryDisplay());   //Output: Battery at 100%

        car.drive();
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());  //Output: Driven 60 meters
        System.out.println(car.batteryDisplay());   //Output: Battery at 97%

    }
}
