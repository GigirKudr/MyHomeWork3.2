public class BmiService {
    int k;
    public double calculate(double heightInMetr, double massaInKg) {
        return  massaInKg / (heightInMetr*heightInMetr);
    }
}
