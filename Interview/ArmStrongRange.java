package TopInterview;

public class ArmStrongRange {

    public static void ranger(int start,int end)
    {
        for(int value = start; value< end;value++)
        {
            int number = value;
            int armStrong = 0;
             int sum=0;
            while(number!=0)
            {
                armStrong = number%10;
                sum = sum+ (armStrong*armStrong*armStrong);
                number = number/10;
            }
            if(sum == value)
            {
                System.out.print(value+" ");
            }
        }

    }

    public static void main(String [] args)
    {
        ranger(10,1000);
    }
}
