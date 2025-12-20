enum Color{
    BLUE, RED
    {
        public void info()
        {
            System.out.println("Dangerous Color");
        }
    }
    ,Green;

    public void info()
    {
        System.out.println("Universal Color");
    }
}

class Test2 {
    public static void main(String[] args) {
        Color[] colors= Color.values();

        for(Color c1:colors)
        {
            System.out.print(c1+"---");
            c1.info();
        }
    }
}
