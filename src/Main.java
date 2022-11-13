

public class Main {
    public static void main(String[] args) {

        //задание 1

        int yearNow = 2022;
        int yearAgo = yearNow - 200;
        int result = yearNow + 100;
        int i = 0;

        while (i <= result) {
            i = i + 79;
            if (i > yearAgo && i < result) {
                System.out.println(i);
            }
        }


    }


}
