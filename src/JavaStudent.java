public class JavaStudent extends Programmer implements Chargeable  {
    public String codingLanguage;

    public JavaStudent(String name, String codingLanguage) {
        super(name);
        this.codingLanguage = codingLanguage;
    }

    public void usePhone() {
        int updatedBattery = getBatteryLife() - 20;
        setBatteryLife(updatedBattery);
        System.out.println(this.name + " is playing on their phone... (Battery: " + getBatteryLife() + "%)");
    }

    @Override
    public void recharge() {
        System.out.println(this.name + " is plugging into the SunKing Solar station. Battery is restoring!");
        degradeHardware();
        setBatteryLife(100);
        System.out.println("-> Battery level is now capped at: " + getBatteryLife() + "%");
    }
    @Override
   public void writeCode()throws BatteryExhaustedException {
        super.writeCode();
        System.out.println(this.name + " is writing " + this.codingLanguage + "code on their Mac! (Battery: " + getBatteryLife() + "%)");
   }
}


