public class BMIService {
    public long calculate(long height, long weight) {
        return weight * 1000 / (height*height);
    }
}
