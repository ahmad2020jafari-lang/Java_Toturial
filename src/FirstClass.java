public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And i am scared of Aliens");
        }
        int topScore = 80;
        if (topScore < 100){
            System.out.println("Yot got the high score!");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore && topScore < 100)) {
            System.out.println("Greater than second top score und less than 100 !");
        }
        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not suppose to happen!");
        }

        // Ternary Operator
        String makeOfCar = "Volkswagen";
        // boolean isDomisTic = makeOfCar == "Volkswagen" ? false : true;
        boolean isDomisTic = (makeOfCar != "Volkswagen");

        if (!isDomisTic) {
            System.out.println("The Car is domistic to our Country");
        }
        int ageOfClient = 10;
        String ageText = ageOfClient >= 18 ? "Over Eighten" : "Still Kid";
        System.out.println(ageText);

    }
}