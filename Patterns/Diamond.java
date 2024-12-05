public class Diamond {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //4-1 = 3, 4-2=2, 4-3 =1 spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { //2*1-1 = 1 , 2*2-1=3, 2*3-1=5 , 2*4-1 = 7 stars
                System.out.print("*" + " ");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }

    }
}
