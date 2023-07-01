public class ArraySamllNo {
    public static void main(String[] args) {
        int []a = {10,23,45,9,34,55};
        int m = a[0];
        for(int i=1; i<a.length;i++){
            if(m>a[i]){
                m=a[i];

            }
        }
        System.out.println(m);
    }
}
