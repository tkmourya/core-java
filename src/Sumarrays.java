class SumArrays
{
    public static void main(String[] args)
    {
        int sum=0;
        int[] n = {1,2,3,4,5,6};
        for(int i=0; i<n.length; i++)
        {
            sum=sum+n[i];
        }
        System.out.println("Sum of all elements of an array: "+sum);
    }
}