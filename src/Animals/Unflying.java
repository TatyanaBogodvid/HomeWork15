package Animals;

import java.util.Objects;

public final class Unflying extends Bird{
    private String movementType;

    public Unflying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        if (movementType == null || movementType.isEmpty()){
            this.movementType = "Информация не указана";
        } else{
        this.movementType = movementType;}
    }

    public String getMovementType() {
        return movementType;
    }
    public void walk(){
        System.out.println("Перемещать лапы поочередно, двигаясь вперед и назад");}
    public void go() {
        System.out.println("Перемещать лапы поочередно");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Unflying unflying = (Unflying) o;
        return Objects.equals(movementType, unflying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return super.toString() + "Unflying{" +
                "movementType='" + movementType + '\'' +
                '}';


    }
}
