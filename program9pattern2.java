public class program9pattern2
{
    public static void main()
    {
        int count= 0;
        int num = 1;
        int diff= 1;
        while(count<10)
        {
            System.out.print(num+" ");
            num += diff;
            diff++;
            count++;
        }
    }
}