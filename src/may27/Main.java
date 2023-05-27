package may27;

public class Main {
    public static void main(String[] args) {
        int bal = 75;
        Qiymet qiymet;
        switch (bal/10) {
            case 10:
            case 9:
                qiymet=Qiymet.A;
                break;
            case 8:
                qiymet=Qiymet.B;
                break;
            case 7:
                qiymet=Qiymet.C;
                break;
            case 6:
                qiymet=Qiymet.D;
                break;
            case 5:
                qiymet=Qiymet.E;
            default:
                qiymet=Qiymet.F;
                break;
        }
        System.out.println(qiymet);
    }
}
