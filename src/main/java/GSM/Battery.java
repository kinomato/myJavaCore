package GSM;

public class Battery {
    private String model;
    private BatteryType type;
    private int hoursIdle;
    private int hoursActive;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(int hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public int getHoursActive() {
        return hoursActive;
    }

    public void setHoursActive(int hoursActive) {
        this.hoursActive = hoursActive;
    }

    public BatteryType getType() {
        return type;
    }

    public void setType(BatteryType type) {
        this.type = type;
    }

    public Battery() {
        this("Unknown",null,0,0);
    }
    public Battery(String model,BatteryType type, int hoursIdle, int hoursActive) {
        this.model = model;
        this.type = type;
        this.hoursIdle = hoursIdle;
        this.hoursActive = hoursActive;
    }

    @Override
    public String toString() {
        return  "battery model=" + model + '\n' +
                "battery hoursIdle=" + hoursIdle + '\n'+
                "battery hoursActive=" + hoursActive + '\n';
    }
}
