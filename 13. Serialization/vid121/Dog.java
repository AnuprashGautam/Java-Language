import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable {

    transient static int i = 10;
    transient final int j = 20;

    public static void main(String[] args) {
        try {
            Dog d = new Dog();

            // Serialoization
            FileOutputStream fos = new FileOutputStream("dog.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);

            // Deserialization
            FileInputStream fis = new FileInputStream("Dog.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog d1 = (Dog) ois.readObject();

            System.out.println(d1.i + "====" + d1.j);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}