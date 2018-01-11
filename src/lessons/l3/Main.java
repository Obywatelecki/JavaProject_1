package lessons.l3;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.println("in for loop: " + "idx: " + i + ", value: " + arr[i]);
        }

        // System.out.println(i); ---> tego nie mozna, bo "i" juz nie istnieje

        int idx = 0;
        while (idx < arr.length) {
            System.out.println("in while loop: " + "idx: " + idx + ", value: " + arr[idx]);
            ++idx;
            if (idx == 5) break; // --> wypadamy z pętli, bo coś się zadziało
        }

        System.out.println("idx is now: " + idx);

        for (int value : arr) {
            System.out.println("in enchanced for loop: " + "idx: " + value + ", value: " + value);
        }

        int idx1 = 0;
        do {
            System.out.println("in do...while loop: " + "idx: " + idx1 + ", value: " + arr[idx1]);
            ++idx1;
        } while (idx1 < arr.length);

        if (arr[5] == 40) {
            System.out.println("Good!");
        } else {
            System.out.println("tyz dobrze!");
        }

        System.out.println(arr[0]);

        int x = 0;

        switch (arr[x]) {

            case 2:
                System.out.println("ej noooo!!!!!!!!!!!");
                break;
            default:
                System.out.println("dajesz, nie przestajesz!!!!");
                break;
        }
    }
}
