public class C {
    
    private String C1;
    private int C2;

    public C(String c1, int c2) {
        C1 = c1;
        C2 = c2;
    }

    public void setC1(String meuC1) {
        C1 = meuC1;
    }

    public void setC2(int meuC2) {
        C2 = meuC2;
    }

    public String getC1() {
        return C1;
    }

    public int getC2() {
        return C2;
    }

    public void MC1() {
        System.out.println("MC1()");
    }

    public void MC2() {
        System.out.println("MC2()");
    }
}