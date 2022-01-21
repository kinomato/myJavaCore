package GSM;

public class Display {
    private String model;
    private double size;
    private String resolution;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Display() {
        this("Unknown",0,"800x600");
    }

    public Display(String model, double size, String resolution) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return  "display model=" + model + '\n' +
                "display size=" + size + '\n' +
                "display resolution='" + resolution + '\n';
    }
}
