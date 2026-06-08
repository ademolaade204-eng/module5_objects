import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
    public void usePhone() throws BatteryExhaustedException,IOException{
        String logMessage = this.name + " is checking UI designs on their phone!";
        System.out.println(logMessage);
        FileWriter file = new FileWriter("simulation_log.txt", true);
        PrintWriter logger = new PrintWriter(file);

        logger.println(logMessage);
        logger.close();
    }
}
