public class CarsAssemble {

    int BASE_RATE = 221;

    public double productionRatePerHour(int speed) {
        double productionRatePerHour = 0.0;
        int carsProduced = BASE_RATE * speed;
        productionRatePerHour = carsProduced * getSuccessRate(speed);
        return productionRatePerHour;
    }

    public int workingItemsPerMinute(int speed) {
        double prodRate = productionRatePerHour(speed);
        return (int) Math.floor(prodRate / 60);
    }

    public double getSuccessRate(int speed) {
        double errorRate = 0.0;
        if (speed == 10) {
            errorRate = .77;
        } else if (speed == 9) {
            errorRate = .8;
        } else if (speed < 9 && speed >= 5) {
            errorRate = .9;
        } else if (speed < 5 && speed >= 1) {
            errorRate = 1.0;
        }
        return errorRate;
    }
}
