public class BatteryExhaustedException extends Exception {
    private  Programmer offender;
    public BatteryExhaustedException(String message, Programmer offender) {
        super(message);
        this.offender = offender;
    }
    public Programmer getOffender() {
        return this. offender;
    }
}
