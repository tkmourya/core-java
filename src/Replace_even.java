
    class Replace_even {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0)
            {
                int re=a[i]=999;
                System.out.println(re+" <- replaced number");
            }
            else
            {
                System.out.println(a[i]);
            }
    }
    }}