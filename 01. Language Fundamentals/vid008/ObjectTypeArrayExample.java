class ObjectTypeArrayExample {
    public static void main(String[] args) {

        Object[] obj = new Object[3]; // Object type array
        Integer i = 4;
        obj[0] = i; // Child class array
        obj[1] = new Object(); // Declared type array
        obj[2] = new String("Anuprash"); // Child class array

        Number[] n = new Number[4];

        n[0] = i; // Child class
        Long l = 12l;
        n[1] = l; // Child class
        Float f = 123.4f;
        n[2] = f; // Child class
        // i[3]=new String("Anuprash"); // will give the compile time error

        for (Object o1 : obj)
            System.out.println(o1);

        for (Number n1 : n)
            System.out.println(n1);
    }
}
