package Animals;

import java.util.Objects;

public class Bird extends Animal{
    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "Среда обитания не указана";
        } else{
        this.habitat = habitat;}
    }

    public String getHabitat() {
        return habitat;
    }
    @Override
    public void eat() {
        System.out.println("Есть корм");
    }

    @Override
    public void sleep() {
        System.out.println("Закрыть глаза и спать");
    }

    @Override
    public void go() {

    }

    public void hunt(){
        System.out.println("Выбрать жертву, затаиться, напасть.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(habitat, bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + "Bird{" +
                "habitat='" + habitat + '\'' +
                '}';


    }
}
