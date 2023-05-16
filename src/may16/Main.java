package may16;

public class Main {
    public static void main(String[] args) {
        romb romb = new romb();
        System.out.println(romb);

        Kvadrat kvadrat = new Kvadrat(5);
        System.out.println("Kvadrat - Perimeter: " + kvadrat.getPerimeter());
        System.out.println("Kvadrat - Sahe: " + kvadrat.getArea());

        DuzbucaqliUcbucaq duzbucaqliUcbucaq = new DuzbucaqliUcbucaq(4,6);
        System.out.println("Duzbucaqli Ucbucaq - Perimeter: " + duzbucaqliUcbucaq.getPerimeter());
        System.out.println("Duzbucaqli Ucbucaq - Sahe: " + duzbucaqliUcbucaq.getArea());
    }
}
