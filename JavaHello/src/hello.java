public class hello {

    public static int doubly(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        // how to print
        System.out.println("Hello World");

        // variables
        int num = 5;
        double doubley = 4.6;
        char fisrtInitial = 'B';
        String name = "Broo2";
        boolean isHome = true;

        System.out.println(num);
        System.out.println(doubley);
        System.out.println(fisrtInitial);
        System.out.println(name);
        System.out.println(isHome);

        // Conditionals / IF ELSE / Condition
        if (isHome && num < 18) {
            System.out.println("You are not an adult.");
            }

        if (name.equals("Broo2")) {
            System.out.println("Live long and prosper!");
        } else {
            System.out.println("Have a nice day...");
            }

        // While, Do While, For Loops
        while (num < 18) {
            System.out.println("You are not an adult");
            // num = num + 1;
            num++;
            }

        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            }

        int x = 0;

        do {
            System.out.println("Happy 4th");
            x++;
            } while(x < 10);

        // call function
        // f(x) = x * x;
        // f(5) = 5 * 5;
        int doubled = doubly( 5);
        int otherDoubled = doubly(10);
        System.out.println(doubled);
        System.out.println(otherDoubled);

        // string manipulation of 'name' object.
        char firstInitial2 = name.charAt(0);
        char lastIntitial = name.charAt(name.length() - 1);
        String lowered = name.toLowerCase();

        System.out.println(firstInitial2);
        System.out.println(lastIntitial);
        System.out.println(lowered);

    }
}
