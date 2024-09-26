public class BmiService {
    public double calculate(double heightInMetr, double massaInKg) {
        int bmi = (int) (massaInKg / (heightInMetr * heightInMetr));
        return bmi;
    }
}
