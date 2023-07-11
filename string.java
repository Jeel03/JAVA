public class string {
    public static void main(String args[]) {
        StringBuilder rj = new StringBuilder("rupareliya");

        for (int i = 0; i <rj.length() / 2; i++) {
            int front = i;
            int back = rj.length() - i - 1; // i=1 

            char frontchar = rj.charAt(front);
            char backchar = rj.charAt(back);

            rj.setCharAt(i, backchar);
            rj.setCharAt(back, frontchar);
        }
        System.out.println(rj);
    }
}
