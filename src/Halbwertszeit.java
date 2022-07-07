public class Halbwertszeit {
    private final int halfLife;
    private int years = 0;

    public Halbwertszeit(int hl) {
        this.halfLife = hl;
    }

    public int calculateYears(double materialAmount) {
        years = 0;      // resetting the years so it can be calculated multiple times
        return calculateHelp(materialAmount);
    }

    // Help method that calculates the years recursively
    public int calculateHelp(double materialAmount) {
        if (materialAmount > 100) {
            years += halfLife;
            materialAmount /= 2;
            calculateHelp(materialAmount);
        }
        return years;
    }
}

