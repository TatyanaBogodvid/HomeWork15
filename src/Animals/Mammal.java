package Animals;

import java.util.Objects;

public class Mammal extends Animal {
    private String habitat;
    private int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "Среда обитания не указана";
        } else{
        this.habitat = habitat;}
        if (speed < 0){
            this.speed = Math.abs(speed);
        } else{
        this.speed = speed;}
    }

    @Override
    public void eat() {
        System.out.println("Есть пищу");
    }

    @Override
    public void sleep() {
        System.out.println("Закрыть глаза и спать");
    }

    @Override
    public void go() {
        System.out.println("Перемещать лапы поочередно, двигаясь вперед");
    }

    public void walk(){
        System.out.println("Перемещать лапы поочередно, двигаясь вперед и назад");
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(habitat, mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, speed);
    }

    @Override
    public String toString() {
        return super.toString() + "Mammal{" +
                "habitat='" + habitat + '\'' +
                ", speed=" + speed +
                '}';


    }
}
