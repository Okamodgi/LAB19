public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.a;
        calc.setCalculator(5, 43);
        calc.calculateFunction();
    }
}
enum Calculator{
    a;
    private int x, y;
    public void setCalculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void calculateFunction(){
        double rez = 2*x+3/y;
        System.out.println(rez);
    }
}