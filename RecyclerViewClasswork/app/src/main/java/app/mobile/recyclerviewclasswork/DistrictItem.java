package app.mobile.recyclerviewclasswork;

public class DistrictItem {
    String name;
            int temperature;
            double population, area;

    public DistrictItem(String name, int temperature,double population, double area) {
        this.name = name;
        this.population = population;
        this.temperature = temperature;
        this.area = area;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
