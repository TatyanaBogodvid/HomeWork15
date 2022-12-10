public class Train extends Transport {
    private double costOfTravel;
    private double travelTime;
    private String departureStation;
    private String endStation;
    private int howManyWagons;

    public void refill(){
        System.out.println("Нужно заправлять дизелем.");
    }

    public Train(String brand, String model, int yearOfIssue,
                 String countryOfProduction, String bodyColor, int maxTravelSpeed,
                 double costOfTravel, double travelTime, String departureStation,
                 String endStation, int howManyWagons) {
        super(brand, model, yearOfIssue, countryOfProduction, bodyColor, maxTravelSpeed);
        if(costOfTravel <= 0){
            this.costOfTravel = Math.abs(costOfTravel);
        } else {
        this.costOfTravel = costOfTravel;}
        if (travelTime <= 0){
            this.travelTime = Math.abs(travelTime);
        } else {
        this.travelTime = travelTime;}
        if (departureStation == null || departureStation.isEmpty()){
            this.departureStation = "Информация не указана";
        } else {
        this.departureStation = departureStation;}
        if (endStation == null || endStation.isEmpty()){
            this.endStation = "Информация не указана";
        } else {
        this.endStation = endStation;}
        if (howManyWagons <= 0){
            System.out.println("Информация указана неверно или не указана");
        } else{
        this.howManyWagons = howManyWagons;}
    }

    public double getCostOfTravel() {
        return costOfTravel;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getHowManyWagons() {
        return howManyWagons;
    }

    public void setCostOfTravel(double costOfTravel) {
        this.costOfTravel = costOfTravel;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public void setHowManyWagons(int howManyWagons) {
        this.howManyWagons = howManyWagons;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", цена поездки " + costOfTravel +
                ", время поездки " + travelTime +
                ", станция отбытия " + departureStation +
                ", конечная остановка " + endStation +
                ", количество вагонов " + howManyWagons;
    }
}
