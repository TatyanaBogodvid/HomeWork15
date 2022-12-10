public class Car extends Transport {

    private final double engineVolume;
    private final String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private  boolean summer;

    public void refill(){
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электроду-парковках, " +
                "если это электрокар.");
    }


    public Car(String brand, String model, int yearOfIssue, String countryOfProduction, String bodyColor, int maxTravelSpeed,
               double engineVolume, String transmission, String bodyType,
               String registrationNumber, int seats, boolean summer) {
        super(brand, model, yearOfIssue, countryOfProduction, bodyColor, maxTravelSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.seats = seats;
        this.summer = summer;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSummer() {
        return summer;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummer(boolean summer) {
        this.summer = summer;
    }

    @Override
    public String toString(){
        return super.toString() +
                    ", объем двтигателя: " + engineVolume +
                    ", коробка передач: " + transmission +
                    ", тип кузова: " + bodyType +
                    ", регистрационный номер" + registrationNumber +
                    ", количество мест: " + seats +
                    ", резина летняя? - " + summer;


    }
}
