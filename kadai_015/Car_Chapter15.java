package kadai_015;

public class Car_Chapter15 {

    private int speed;

    public void gearChange(int afterGear) {

        switch(afterGear) {

            case 1 :
                speed = 10;
                break;

            case 2 :
                speed = 20;
                break;

            case 3:
                speed = 30;
                break;

            case 4:
                speed = 40;
                break;

            case 5:
                speed =50;
                break;

            default:
                speed = 10;

        }


    }

    public void run(int beforeGear,int afterGear) {
        System.out.println("ギア"+beforeGear+"から"+afterGear+"に切り替わりました。");
        System.out.println("速度は時速"+speed+"kmです");

    }

}
