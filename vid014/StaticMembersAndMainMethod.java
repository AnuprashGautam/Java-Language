public class StaticMembersAndMainMethod {
    static{
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    //1.7 version onwards it is imposiible to print anything without the main method. In the 1.7 and onward versions main method is checked first and then static members are checked.
}
