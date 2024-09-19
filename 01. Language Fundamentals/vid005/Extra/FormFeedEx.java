public class FormFeedEx
{
        // Form feed character is used to clear the screen or advance the paper to the next page.
        public static void main(String[] args) {
        String textBeforeFormFeed = "This is the text before the form feed.";
        String textAfterFormFeed = "This is the text after the form feed.";

        String combinedText = textBeforeFormFeed + "\f" + textAfterFormFeed;

        System.out.println("Printing text with form feed character:");
        System.out.println(combinedText);
    }
}
