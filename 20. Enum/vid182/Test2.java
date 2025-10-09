enum Day{
    Sunday,  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}

public class Test2 {
    public static void main(String[] args) {
        Day d=Day.Sunday;

        switch (d) {
            case Monday:
                System.out.println("It is called somvaar in Hindi.");
                break;
        
            case Tuesday:
                System.out.println("It is called mangalvaar in Hindi.");
                break;
        
            case Wednesday:
                System.out.println("It is called budhavaar in Hindi.");
                break;
        
            case Thursday:
                System.out.println("It is called guruvaar in Hindi.");
                break;
        
            case Friday:
                System.out.println("It is called sukrvaar in Hindi.");
                break;
        
            case Saturday:
                System.out.println("It is called sanivaar in Hindi.");
                break;
        
            default:
                System.out.println("It is called ravivaar in Hindi.");
                break;
        }
    }
}
