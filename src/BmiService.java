public class BmiService {
    public int calculate(double heightInMetr, double massaInKg) {
        double bmi =  (massaInKg / (heightInMetr * heightInMetr));
        return (int) bmi;
    }
}
