public class Halbwertszeit {
    private final int halfLife;
//    private int years = 0;

    public Halbwertszeit(int hl) {
        this.halfLife = hl;
    }

    public double calculateYears(double materialAmount) {

        return (halfLife * (Math.log( 100 / materialAmount ) / (Math.log( (double) 1/2))));

//        if (materialAmount > 100) {
//            years += halfLife;
//            materialAmount /= 2;
////            System.out.println(materialAmount);
//            calculateYears(materialAmount);
//        }
//        return years;
    }
}
