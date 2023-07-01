public class NameApp_3D {
    public static void main(String[] args) {
        String[][][] n = new String[2][2][3];
        n[0][0][0] = "Dan";
        n[0][0][1] = "tan";
        n[0][0][2] = "Ean";
        n[0][1][0] = "Ran";
        n[0][1][1] = "Wan";
        n[0][1][2] = "Aan";
        n[1][0][0] = "Han";
        n[1][0][1] = "Kan";
        n[1][0][2] = "Lan";
        n[1][1][0] = "Fan";
        n[1][1][1] = "Xan";
        n[1][1][2] = "Zan";
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = 0; k < n[i][j].length; k++) {
                    System.out.print(n[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}