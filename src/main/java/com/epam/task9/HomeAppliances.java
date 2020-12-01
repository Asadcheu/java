package com.epam.task9;

class HomeAppliances {

    private int indexNumber;
    private String nameOfAnAppliance;
    private String typeOfAnAppliance;
    private int powerOfAnAppliance;
    private int category;


    HomeAppliances(int indexNumber, String nameOfAnAppliance, String typeOfAnAppliance, int powerOfAnAppliance, int category) {
        this.indexNumber = indexNumber;
        this.nameOfAnAppliance = nameOfAnAppliance;
        this.typeOfAnAppliance = typeOfAnAppliance;
        this.powerOfAnAppliance = powerOfAnAppliance;
        this.category = category;
    }

    int getIndexNumber() { return indexNumber; }

    String getTypeOfAnAppliance() {
        return typeOfAnAppliance;
    }

    int getPowerOfAnAppliance() {
        return powerOfAnAppliance;
    }

    int getCategory() { return category; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeAppliances that = (HomeAppliances) o;

        if (indexNumber != that.indexNumber) return false;
        if (powerOfAnAppliance != that.powerOfAnAppliance) return false;
        if (category != that.category) return false;
        if (nameOfAnAppliance != null ? !nameOfAnAppliance.equals(that.nameOfAnAppliance) : that.nameOfAnAppliance != null)
            return false;
        return typeOfAnAppliance != null ? typeOfAnAppliance.equals(that.typeOfAnAppliance) : that.typeOfAnAppliance == null;
    }

    @Override
    public int hashCode() {
        int result = indexNumber;
        result = 31 * result + (nameOfAnAppliance != null ? nameOfAnAppliance.hashCode() : 0);
        result = 31 * result + (typeOfAnAppliance != null ? typeOfAnAppliance.hashCode() : 0);
        result = 31 * result + powerOfAnAppliance;
        result = 31 * result + category;
        return result;
    }

    @Override
    public String toString() {
        return "HomeAppliances{" +
                "indexNumber=" + indexNumber +
                ", nameOfAnAppliance='" + nameOfAnAppliance + '\'' +
                ", typeOfAnAppliance='" + typeOfAnAppliance + '\'' +
                ", powerOfAnAppliance=" + powerOfAnAppliance +
                ", category=" + category +
                '}';
    }
}
