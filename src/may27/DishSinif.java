package may27;

public class DishSinif {
    public interface IcSınıf {
        void metot();
    }
    private int outerVar = 10;
    private static int disDegisken = 20;

    public class IchSinif{ //TASK 2
        public void ichMethod() {
            System.out.println("Inner method called");
            System.out.println("Outer variable: " + outerVar);
        }
    }
    public void disMetod() {  //TASK 3
        class IcSinif {
            public void icMetod() {
                System.out.println("İç metod çağrıldı");
                System.out.println("Dış değişken: " + outerVar);
            }
        }
        IcSinif ic = new IcSinif();
        ic.icMetod();
    }


    public static class IcSiniff { //TASK 4
        public void icMetodd() {
            System.out.println("İç metod çağrıldı");
            System.out.println("Dış değişken: " + disDegisken);
        }
    }

    public void dishMetod() { //TASK 5
        IcSınıf ic = new IcSınıf() {
            @Override
            public void metot() {
                System.out.println("Özelleştirilmiş metot çağrıldı");
            }
        };

        ic.metot();
    }
    public static void main(String[] args) {
        DishSinif dish = new DishSinif();
        IchSinif ich = dish.new IchSinif();
        ich.ichMethod();
        dish.disMetod();

        IcSiniff ic = new IcSiniff();
        ic.icMetodd();

        DishSinif dis = new DishSinif();
        dis.disMetod();
    }
}