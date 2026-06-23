public class CarsAssemble {

    private static final int BASE_RATE = 221;
    private static final double MINUTES_PER_HOUR = 60.0;
    private static final double RATE_AT_SPEED_10 = 0.77;
    private static final double RATE_AT_SPEED_9 = 0.8;
    private static final double RATE_AT_SPEED_5_TO_8 = 0.9;
    private static final double RATE_AT_SPEED_1_TO_4 = 1.0;

    public double productionRatePerHour(int speed) {
        return BASE_RATE * speed * getSuccessRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        double prodRate = productionRatePerHour(speed);
        return (int) Math.floor(prodRate / MINUTES_PER_HOUR);
    }

    private double getSuccessRate(int speed) {
        double successRate = 0.0;
        if (speed == 10) {
            successRate = RATE_AT_SPEED_10;
        } else if (speed == 9) {
            successRate = RATE_AT_SPEED_9;
        } else if (speed < 9 && speed >= 5) {
            successRate = RATE_AT_SPEED_5_TO_8;
        } else if (speed < 5 && speed >= 1) {
            successRate = RATE_AT_SPEED_1_TO_4;
        }
        return successRate;
    }
}
