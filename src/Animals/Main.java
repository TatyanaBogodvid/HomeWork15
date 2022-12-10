package Animals;

public class Main {
    public static void main(String[] args){
        Herbivore gazelle = new Herbivore("Газель", 3, "лес", 97, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 4, "саванна", 60, "листья деревьев");
        Herbivore horse = new Herbivore("Лошадь", 1, "степь", 88, "овес");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        gazelle.eat();
        gazelle.sleep();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();

        System.out.println(gazelle.equals(giraffe));
        System.out.println(gazelle.equals(horse));
        System.out.println(giraffe.equals(horse));

        Predator hyena = new Predator("Гиена", 4, "саванна", 64, "мясо");
        Predator tiger = new Predator("Тигр", 6, "саванна", 65, "мясо");
        Predator bear = new Predator("Медведь", 7, "лес", 40, "мясо");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        hyena.eat();
        hyena.sleep();
        hyena.go();
        hyena.walk();
        hyena.hunt();

        System.out.println(hyena.equals(tiger));
        System.out.println(hyena.equals(bear));
        System.out.println(tiger.equals(bear));

        Amphibian frog = new Amphibian("Лягушка", 1, "болото");
        Amphibian snake = new Amphibian("Уж пресноводный", 1, "озеро");

        System.out.println(frog);
        System.out.println(snake);

        frog.eat();
        frog.sleep();
        frog.go();
        frog.hunt();

        System.out.println(frog.equals(snake));

        Unflying peacock = new Unflying("Павлин", 5, "лес","хождение");
        Unflying penguin = new Unflying("Пингвин", 1, "Арктика","хождение и плавание");
        Unflying dodo = new Unflying("Птица додо", 2, "лес","хождение");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        peacock.eat();
        peacock.sleep();
        peacock.go();
        peacock.hunt();
        peacock.walk();

        System.out.println(peacock.equals(penguin));
        System.out.println(peacock.equals(dodo));
        System.out.println(penguin.equals(dodo));

        Flying seagull = new Flying("Чайка", 3, "побережье", "летать");
        Flying albatross = new Flying("Альбатрос", 3, "побережье", "летать");
        Flying falcon = new Flying("Сокол", 3, "степь", "летать");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

        seagull.eat();
        seagull.sleep();
        seagull.go();
        seagull.hunt();
        seagull.fly();

        System.out.println(seagull.equals(albatross));
        System.out.println(seagull.equals(falcon));
        System.out.println(albatross.equals(falcon));
    }
}
