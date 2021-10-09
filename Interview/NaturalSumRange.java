package TopInterview;

public class NaturalSumRange {

    public static void ranger(int startingNum,int endingNum)
    {
        int sum=0;
        for(int value = startingNum;value <=endingNum;value++)
        {
            sum=sum+value;
        }
         System.out.println("The sum is "+sum);

    }

    public static void main(String args[])
    {
    ranger(2,14);
    }
}
