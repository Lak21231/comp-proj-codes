public class program9pattern1
{
    public static void main()
    {
        int count= 0;
        int num = 1;
        int diff= 1;
        while(count<10)
        {
            System.out.print(num+" ");
            num +=2+diff;
            count++;
            diff+= 2;
        }
    }
}