public class Car {
    private String type;
    private String marka;
    private String model;
    private int year;
    private int kilometers;
    private int vin;

    public Car(String type, String marka, String model, int year, int kilometers, int vin) {
        this.type = type;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.kilometers = kilometers;
        this.vin = vin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (kilometers != car.kilometers) return false;
        if (vin != car.vin) return false;
        if (!type.equals(car.type)) return false;
        if (!marka.equals(car.marka)) return false;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + marka.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + year;
        result = 31 * result + kilometers;
        result = 31 * result + vin;
        return result;
    }

    @Override
    public String toString() {
        return
                  type  + " " + marka + " " + model +" " + year + " " + kilometers + " " + vin;
    }
}
