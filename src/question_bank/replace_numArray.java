package question_bank;
//Q -Write a program to replace all the even numbers of an array by 999.
public class replace_numArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.print("Updated value --> ");
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=999;
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
    }
}
