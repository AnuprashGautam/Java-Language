public class PremitiveTypeArrayExample 
{
    public static void main(String[] args) {
        int[] premitiveArray=new int[6];

        byte b=127;
        premitiveArray[0]=b;

        short s=32767;
        premitiveArray[1]=s;

        int i=247483647;
        premitiveArray[2]=i;

        char c='a';
        premitiveArray[3]=c;

        for(int i1: premitiveArray)
            System.out.println(i1);
    }
}
