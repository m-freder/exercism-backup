public class ExperimentalRemoteControlCar implements RemoteControlCar {

    int EXP_DRIVE_UNITS = 20;
    int expDistanceTravelled = 0;

    public void drive() {
        expDistanceTravelled += EXP_DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return expDistanceTravelled;
    }
}
