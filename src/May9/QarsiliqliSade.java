package May9;

public class QarsiliqliSade {
    private int a;
    private int b;

    public QarsiliqliSade(int a,int b){
        setA(a);
        setB(b);
        boolean bool=true;
        if (a%b==0 || b%a==0){
            bool = false;
        }
        else if ((a%2==0 && b%2==0)||(a%3==0 &&b%3==0)||(a%5==0 &&b%5==0)||(a%7==0 &&b%7==0)||(a%9==0 &&b%9==0)){
            bool = false;
        }
        if(bool) {
            System.out.println(a+" ve "+b+" qarsiliqli sade ededlerdir");
        }
        if (!bool){
            System.out.println(a+" ve "+b+" qarsiliqli sade ededler deyil");
        }
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
