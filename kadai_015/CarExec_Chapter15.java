package kadai_015;

public class CarExec_Chapter15 {

    public static void main(String[] args) {

        Car_Chapter15 car = new Car_Chapter15();
        int beforeGear = 1;
        int afterGear = 3;
        
        car.gearChange(afterGear);
        car.run(beforeGear,afterGear);
    }

}
