package GSM;

import java.util.ArrayList;

public class GSM {

    private String model;
    private String manufacturer;
    private double price;
    private String owner;
    private Battery battery;
    private Display display;
    public static GSM Iphone4S = new GSM("Iphone4S", "apple"
            , 100, "dat", new Battery(), new Display());
    private ArrayList<Call> callHistory = new ArrayList<>();

    public GSM(String model, String manufacturer) {
        this(model, manufacturer, 0, null, null, null);
    }
    public GSM(String model, String manufacturer, double price){
        this(model,manufacturer,price,null,null,null);
    }
    public GSM(String model, String manufacturer, double price,String owner){
        this(model,manufacturer,price,owner,null,null);
    }
    public GSM(String model, String manufacturer, double price,String owner,Battery battery){
        this(model,manufacturer,price,owner,battery,null);
    }
    public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
        this.owner = owner;
        this.battery = battery;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public ArrayList<Call> getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(ArrayList<Call> callHistory) {
        this.callHistory = callHistory;
    }



    public void call(String number) {
        double random = Math.random() * 1000;
        Call call = new Call(number, (int) random);
        callHistory.add(call);
    }

    public void addCall(Call call){
        callHistory.add(call);
    }
    public double calculatePrice(double pricePerMinute) {
        double total = 0;
        for (Call call : callHistory) {
            long sec = call.getDuration().getSeconds();
            total += ((double) sec / 60) * pricePerMinute;
        }
        return total;
    }
    public void showCallsInfo(){
        for (Call call : callHistory) {
            System.out.println(call);
        }
    }
    public void clearCallHistory() {
        callHistory.clear();
    }
    public Call removeLongestCall(){
        long max = 0;
        int index = 0;
        for (int i = 0; i < callHistory.size(); i++) {
            long duration = callHistory.get(i).getDuration().getSeconds();
            if(max < duration){
                max = duration;
                index = i;
            }
        }
        Call temp = callHistory.get(index);
        callHistory.remove(index);
        return temp;
    }
    @Override
    public String toString() {
        return "model=" + model + '\n' +
                "manufacturer=" + manufacturer + '\n' +
                "price=" + price + '\n' +
                "owner=" + owner + '\n' +
                ((battery != null) ? battery.toString() : null) +
                ((display != null) ? display.toString() : null);
    }
}
