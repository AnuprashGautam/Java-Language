package vid001;

public class enum_Example{
    // Define an enum called Day
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Using the Day enum
        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);

        // Using switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Rest day!");
                break;
            default:
                System.out.println("Another day!");
                break;
        }

        // Iterating over all constants of the Day enum
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
