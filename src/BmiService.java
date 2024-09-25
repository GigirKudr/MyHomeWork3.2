public class BmiService {
    public double calculate(double heightInMetr, double massaInKg) {
        return  massaInKg / (heightInMetr*heightInMetr);
    }
}
