public class Main {
    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        //Abstract Classlar tek başına new'lenemez tekrardan methodu Override etmen gerekir ki
        // o da tercih edilen bir yöntem değildir!
        // ama inherit ettiğin Classı new leyebilirisin

        GameCalculator gameCalculator = new WomanGameCalculator();
        GameCalculator gameCalculatorForMan = new ManGameCalculator();
        GameCalculator gameCalculatorForKids = new KidsGameCalculator();




    }
}