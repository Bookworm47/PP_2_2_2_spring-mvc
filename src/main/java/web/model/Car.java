package web.model;

public class Car {

    private String carBrand;
    private String model;
    private int release;

    public Car(String carBrand, String model, int release) {
        this.carBrand = carBrand;
        this.model = model;
        this.release = release;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}
