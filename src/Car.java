public class Car {

    String marka;
    String model;
    int rokProdukcji;

    public Car(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public Car() {
    }

    public String toString() {
        return "Car producer " + marka + " model " + model + " produced " + rokProdukcji;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getrokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}