package TopInterview;

public class GreatestNum {


    public static void great(int first,int second){
        if(first>second){
            System.out.println(first +" is greater");
        }
        else if(first==second){
            System.out.println("Both are Equal");
        }
        else
        {
            System.out.println(second+" is greater");
        }
    }
    public static void main(String ... args)
    {
        great(18,15);
    }
}
