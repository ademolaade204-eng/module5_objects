public abstract class Programmer implements Chargeable {
    protected String name;
    protected int batteryLife = 100;
    protected int maxBatteryHealth = 100;
    private int linesOfCode = 0;

    public Programmer (String name) {
        this.name = name;
    }

    public void writeCode() throws BatteryExhaustedException {
        if ( this.batteryLife < 15 ) {
            throw new BatteryExhaustedException("🚨 [ERROR] " + this.name + " cannot write code! Battery is critically low (" + this.batteryLife + "%). please recharge!", this);
        }
        this.batteryLife -= 15;
        this.linesOfCode += 50;
        System.out.println(this.name + " wrote 50 lines! Total :" + this.linesOfCode + " (Battery :" + this.batteryLife + "%)");
    }

    public int getBatteryLife() {
        return this.batteryLife;
    }

    public void setBatteryLife(int newBattery) {
        if (newBattery < 0) {
            this.batteryLife = 0;
        } else if (newBattery > this.maxBatteryHealth) {
            this.batteryLife = this.maxBatteryHealth;
        } else {
            this.batteryLife = newBattery;
        }
    }

    public String getName() {
        return this.name;
    }

    public abstract void recharge();

    public void degradeHardware() {
        this.maxBatteryHealth -= 5;
        System.out.println("⚠️ Hardware Alert:" + this.name + "'s maximum battery capacity degraded to " + this.maxBatteryHealth + "%");
    }
        public abstract void usePhone()  throws BatteryExhaustedException;
        }

