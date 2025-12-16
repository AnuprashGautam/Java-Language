
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;

public class JarDemo {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.addWindowListener(new WindowAdapter() {
            {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("I am closing window:"+i);
                    try
                    {
                        Thread.sleep(1000);
                    }catch(InterruptedException ex)
                    {
                        ex.getStackTrace();
                    }
                    System.exit(0);
                }
            }
        });

        f.add(new Label("I am creating executable Jar file!!!"));
        f.setSize(500,500);
        f.setVisible(true);
    }
}
