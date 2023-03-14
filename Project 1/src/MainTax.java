public class MainTax {
    public static void main(String[] args){
        var calculator = new TaxCalculator2023(100_000);
        var report = new TaxReport();
        report.show(calculator);
        report.show(new TaxCalculator2022());
    }
}
