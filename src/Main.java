import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("James");
        list.add("Hetrer");
        list.add("Paup");

        System.out.println(list);
    }

    static int isPacked(int a[]) {
        int isPacked = 1;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            count = 1;
            for (int j = 1 + i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count != a[i]) {
                    isPacked = 0;
                    break;
            }
            }
        }
        return count;
    }
}