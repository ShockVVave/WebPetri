

public class Main2 {
    static Prog a = new Prog();

    static void cycle(float k[]) {
        for (int i = 0; i < 11; i++) {
            k=a.shag(k);
        }
        System.out.println();
    }

    ;

    public static void main(String[] args) {
        float tekVer1[] = {1f, 0f, 0f, 0f}, tekVer2[] = {0f, 1f, 0f, 0f}, tekVer3[] = {0f, 0f, 1f, 0f}, tekVer4[] = {0f, 0f, 0f, 1f};
        System.out.println("Вариант №32");

        cycle(tekVer1);
        cycle(tekVer2);
        cycle(tekVer3);
        cycle(tekVer4);


    }
}