package Animals;

import java.util.Objects;

public final class Flying extends Bird{
    private String movementType;

    public Flying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        if (movementType == null || movementType.isEmpty()){
            this.movementType = "Информация не указана";
        } else{
        this.movementType = movementType;}
    }

    public String getMovementType() {
        return movementType;
    }

    public void fly(){
        System.out.println("Раскрыть крылья, махать ими.");
    }
    public void go() {
        System.out.println("Лететь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public String toString() {
        return super.toString() + "Flying{" +
                "movementType='" + movementType + '\'' +
                '}';


    }
}
