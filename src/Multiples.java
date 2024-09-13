public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3) {
                j++;
            } else if (divisibleBy5) {
                j++;
            } else {
            }
            }
        System.out.println(j);}
}

    public static int main(int n, int a, int b) {
        int num = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;
            if (divisibleBya) {
                num++;
            } else if (divisibleByb) {
                num++;
            } else {
            }
            }
        return num;
    }

