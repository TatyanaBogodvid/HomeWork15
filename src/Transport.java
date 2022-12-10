public abstract class Transport {
    private final String brand;
    private final String model;
    private final int yearOfIssue;
    private final String countryOfProduction;
    private String bodyColor;
    private int maxTravelSpeed;

    public abstract void refill();

    public Transport(String brand, String model, int yearOfIssue, String countryOfProduction, String bodyColor, int maxTravelSpeed) {
        if (brand == null || brand.isEmpty()){
            this.brand = "Бранд не указан";
        } else{
        this.brand = brand;}
        if (model == null || model.isEmpty()){
            this.model = "Модель не указана";
        } else{
        this.model = model;}
        if (yearOfIssue < 0){
            this.yearOfIssue = Math.abs(yearOfIssue);
        } else {
        this.yearOfIssue = yearOfIssue;}
        if (countryOfProduction == null || countryOfProduction.isEmpty()){
            this.countryOfProduction = "Страна производства не указана";
        } else{
        this.countryOfProduction = countryOfProduction;}
        if (bodyColor == null || bodyColor.isEmpty()){
            this.bodyColor = "Цвет не указан";
        } else {
        this.bodyColor = bodyColor;}
        if (maxTravelSpeed < 0){
            this.maxTravelSpeed = Math.abs(maxTravelSpeed);
        } else{
        this.maxTravelSpeed = maxTravelSpeed;}
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaxTravelSpeed() {
        return maxTravelSpeed;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty()){
            this.bodyColor = "Цвет не указан";
        } else {
        this.bodyColor = bodyColor;}
    }

    public void setMaxTravelSpeed(int maxTravelSpeed) {
        if (maxTravelSpeed < 0){
            this.maxTravelSpeed = Math.abs(maxTravelSpeed);
        } else{
            this.maxTravelSpeed = maxTravelSpeed;}
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", модель: " + getModel() +
                ", год выпуска: " + getYearOfIssue() +
                ", страна производства: " + getCountryOfProduction() +
                ", цвет кузова: " + getBodyColor() +
                ", максимальная скорость передвижения: " + getMaxTravelSpeed();






    }
}
