public class b1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 2; k <= 11 - 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

        {

            for (int m = 5; m > 1; m--) {
                for (int n = 5; n >= 5 - m + 2; n--) {
                    System.out.print("*");
                }
                for (int o = 0; o <= 11 - 2 * m; o++) {
                    System.out.print(" ");
                }
                for (int p = 1; p < m; p++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        }
    }
}
    