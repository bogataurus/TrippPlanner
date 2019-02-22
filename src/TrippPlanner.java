import java.util.Scanner;
public class TrippPlanner {
    public static void main(String[] args) {
        greet();
        travelTimeAndBudget();
        timeDifference();
        countryArea();

    }
    public static void greet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", "+ "where are you travelling to?");
        String travelling = input.nextLine();
        System.out.println("Great! " + travelling + " sounds like a great trip");
        System.out.println("***********");
        System.out.println();

    }
    public static void travelTimeAndBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int day = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spand  on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for you travel destination? ");
        String crysym = input.next();
        System.out.print("How many "+ crysym +" are there in 1 USD? ");
        double current = input.nextDouble();
        System.out.println();
        int hours = day * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + day+ " days that is the same as "+ hours +" hours or "+ minutes+" minutes" );
        double moneyDay = money / day;
        moneyDay = moneyDay*100;
        moneyDay = (int) moneyDay;
        moneyDay /= 100;
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+moneyDay);
        double totalBudget = current * money;
        double perDay = totalBudget / day;
        perDay = perDay*100;
        perDay = (int) perDay;
        perDay /= 100;
        System.out.println("Your total budget in "+crysym+ " is "+totalBudget+" "+crysym+","+" which per day is "+ perDay+" "+crysym );
        System.out.println("***********");
        System.out.println();

    }
    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination?");
        int time = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be "+((24+time)%24)+":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+((12+time)%24) +":00");
        System.out.println("***********");
        System.out.println();

    }
    public static void countryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2?");
        double area = input.nextDouble();
        double mil2 = area * 0.3861;
        System.out.println("In miles2 that is "+mil2);
        System.out.println("***********");
        System.out.println();

    }

}
