import java.util.Arrays;

public class alpha {
    public static void main(String[] args) {
        String[] names = {
            "samarth","raj","piyush","pratik","aniket"
        };

        Arrays.sort(names);
        System.out.println("Names in alphabetical order:");
        for (int i=1;i<5;i++) {
            System.out.println(names[i]);
        }
    }
}
