package Animals;

import java.util.Objects;

public final class Herbivore extends Mammal{
    private String foodType;

    public Herbivore(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);
        if (foodType == null || foodType.isEmpty()){
            this.foodType = "Информация не указана";
        } else{
        this.foodType = foodType;}
    }

    public String getFoodType() {
        return foodType;
    }

    public void graze(){
        System.out.println("Ходить по поляне");
        System.out.println("Есть траву");
    }

    public void eat(){
        System.out.println("Есть только растительную пищу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(foodType, herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return super.toString() + "Herbivore{" +
                "foodType='" + foodType + '\'' +
                '}';


    }
}
