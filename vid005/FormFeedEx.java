public class FormFeedEx
{
        public static void main(String[] args) {
        String textBeforeFormFeed = "This is the text before the form feed.";
        String textAfterFormFeed = "This is the text after the form feed.";

        String combinedText = textBeforeFormFeed + "\f" + textAfterFormFeed;

        System.out.println("Printing text with form feed character:");
        System.out.println(combinedText);
    }
}
