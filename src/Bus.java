public class Bus extends Transport{
    private double costOfTravel;

    public void refill(){
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }

    public Bus(String brand, String model, int yearOfIssue, String countryOfProduction, String bodyColor, int maxTravelSpeed, double costOfTravel) {
        super(brand, model, yearOfIssue, countryOfProduction, bodyColor, maxTravelSpeed);
        if (costOfTravel < 0){
            this.costOfTravel = Math.abs(costOfTravel);
        } else {
        this.costOfTravel = costOfTravel;}
    }

    @Override
    public String toString() {
        return super.toString() + ", стоимость поездки " + costOfTravel;
    }
}

