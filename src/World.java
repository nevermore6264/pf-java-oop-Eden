public class World {
    public static void main(String[] args) {
        Human Adam = new Human();
        Human Eva = new Human();

        God.say("You can't eat apple,if you eat, you will die");

        Snake.say("Delicious apple. Eat up, you won't be caught");

        Apple apple = new Apple();
        apple.weight = 10;

        while (apple.isEmpty()) {
            Adam.eat(apple);
            Eva.eat(apple);
        }
        Adam.sleep();
        Eva.sleep();

        God.say("Eva!You will have to obey your husband and have pain when giving birth");
        God.say("You will have to plant a tree to eat");

        God.say("The end!");
    }
}

