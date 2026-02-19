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

        // Challenge
        // 1. create a double variable with a value of 20.00.
        // 2. create a second variable of type double with a value of 80.00.
        // 3. add both numbers together, then multiply by 100.00.
        // 4. use the remainder Operator, to figure out what the remainder from the result of the operation in step three, and 40.00 will be.
        // 5. create a boolean variable that assign the value true, if the remainder in step four is 0.00, or false if it is not zero.
        // 6. output the boolean variable just to see what the result is.
        // 7. write an if then statement that displays a message, "got some remainder"if the boolean in step five is not true.

        double firstNumber = 20.00d;
        double secondNumber = 80.00d;
        double total  = 100 * (firstNumber + secondNumber);
        System.out.println("My Total is = " + total);
        double theRemainder = total % 40.00d;
        System.out.println("theRemainder is = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0 ) ? true : false;
        System.out.println("IsNoRemainder is = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some Remainder");
        }


    }
}
