package pl.stormit;

public class Service1 {

    public static void main(String[] args) {
        System.out.println(runTask());
        System.out.println(add());
    }

    public static String runTask() {
        return System.currentTimeMillis() + "";
    }

    public static Integer add() {
        int a = 2_147_483_646;
        int b = 1;
        int result = a + b;

        return result;
    }

}
