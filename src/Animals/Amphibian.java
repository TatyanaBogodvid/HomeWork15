package Animals;

import java.util.Objects;

public final class Amphibian extends Animal{
    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty()){
            this.habitat = "Среда обитания не указана";
        } else{
        this.habitat = habitat;}
    }
    @Override
    public void eat() {
        System.out.println("Есть насекомых и мелких беспозвоночных");
    }

    @Override
    public void sleep() {
        System.out.println("Закрыть глаза и спать");
    }

    @Override
    public void go() {
        System.out.println("Плыть, если в воде");
        System.out.println("Идти, если на суше");
    }

    public void hunt(){
        System.out.println("Выбрать жертву, затаиться, напасть.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public String toString() {
        return super.toString() + "Amphibian{" +
                "habitat='" + habitat + '\'' +
                '}';

    }
}
