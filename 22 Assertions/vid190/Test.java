public class Test {
    int z=5;

    public void m1(int x)
    {
        assert(x>10);   // Inappropriate
        switch (x) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
        
            default:
                assert(false);
        }
    }

    private void m2(int x)
    {
        assert(x<10);   // Appropriate
    }

    private void m3()
    {
        assert(m4()); // Inappropriate
    }

    private boolean m4()
    {
        z=6;
        return true;
    }
}

