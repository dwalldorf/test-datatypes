public class Application {

    public static void main(String args[]) {
        Application app = new Application();
        app.e1();
        app.e2();
        app.e3();
        app.e4();
        app.e5();
        app.e6();
        app.e7();
    }

    public void e1() {
        short k = 14;

        int result = (k + 5 / 2) / k;
        System.out.println("(k + 5 / 2) / k : int " + result);
    }

    public void e2() {
        int i = 12;

        long result = (i++ + 3L) / (i + 2);
        System.out.println("(i++ + 3L) / (i + 2) : long " + result);
    }

    public void e3() {
        int i = 12;
        double d = 10.8;
        float f = 7.5F;

        double result = (short) (d * (short) (f / 3)) / (double) (i++ + i);
        System.out.println("(short) (d * (short) (f / 3)) / (double) (i++ + i) : double " + result);
    }

    public void e4() {
        int i = 12;
        long j = 145;

        boolean result = (short) j / 10 != (short) i + 2;
        System.out.println("4: boolean - " + result);
    }

    public void e5() {
        int i = 12;
        double d = 10.8;
        long j = 145;
        float f = 7.5F;

        long result = (((d * 10) / i) == ((int) f + 1) ? j : j - 2) / 2;
        System.out.println(" (((d * 10) / i) == ((int) f + 1) ? j : j - 2) / 2 : long " + result);
    }

    public void e6() {
        int i = 12;
        short k = 14;

        boolean result = (i++ - ++i) == (--k - ++i);
        System.out.println("(i++ - ++i) == (--k - ++i) : boolean " + result);
    }

    public void e7() {
        int i = 12;
        long j = 145;
        short k = 14;

        long result = (i + --j / i++) * (++k - i);
        System.out.println("(i + --j / i++) * (++k - i) : long " + result);
    }
}
