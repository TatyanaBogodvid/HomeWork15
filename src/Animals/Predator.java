package Animals;

import java.util.Objects;

public final class Predator extends Mammal{
    private String foodType;

    public Predator(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);
        if (foodType == null || foodType.isEmpty()){
            this.foodType = "Информация не указана";
        } else{
        this.foodType = foodType;}
    }

    public String getFoodType() {
        return foodType;
    }
    public void hunt(){
        System.out.println("Выбрать жертву, затаиться, напасть.");
    }

    public void eat(){
        System.out.println("Есть пищу только животного происхождения");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(foodType, predator.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return super.toString() + "Predator{" +
                "foodType='" + foodType + '\'' +
                '}';


    }
}
