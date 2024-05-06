package org.oopfundamentals;

public class CarModel extends CarBrand {
    private String modelName;
    private int year;

    public CarModel(String brandName, String country, String modelName, int year) {
        super(brandName, country);
        this.modelName = modelName;
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
