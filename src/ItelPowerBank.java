public class ItelPowerBank implements Chargeable {
    private int capacitymAh = 20000;
    private int currentPower = 59;

    @Override
    public void recharge() {
        System.out.println("Connecting itel " + capacitymAh + " mAh power bank to solar station...");
        this.currentPower = 100;
        System.out.println("itel Power Bank is fully topped up to" + this.currentPower + "%!");
    }
    @Override
    public int getBatteryLife() {
        return this.currentPower;
    }
    @Override
    public String getName() {
        return "Itel 20,000mAh Power Bank";
    }
}
