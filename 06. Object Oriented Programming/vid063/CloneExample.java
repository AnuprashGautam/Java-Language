package vid063;
class CopyClass implements Cloneable {
    int x=100;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneExample {

    public static void main(String[] args) {
        CopyClass a=new CopyClass();
        try {
            CopyClass b=(CopyClass)a.clone();

            System.out.println("Original value:"+a.x);
            System.out.println("Cloned value:"+b.x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}