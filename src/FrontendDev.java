public class FrontendDev extends Programmer {
    public FrontendDev(String name) {
        super(name);
    }

    @Override
    public void writeCode() throws BatteryExhaustedException {
        super.writeCode();
        System.out.println(this.name + " is rendering UI components!");
    }

    @Override
    public void recharge() {
        System.out.println(this.name + " is plugged their phone into a standard USB wall charger. UI design takes a lot of battery!");
        setBatteryLife(100);
    }

    @Override
    public void usePhone() throws BatteryExhaustedException {
        System.out.println(this.name + " is checking UI designs on their phone!");
    }
}