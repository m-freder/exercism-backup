class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    int PRD_DRIVE_UNITS = 10;
    int prdDistanceTravelled = 0;
    int prdNumVictories = 0;

    public void drive() {
        prdDistanceTravelled += PRD_DRIVE_UNITS;
    }

    public int getDistanceTravelled() {
        return prdDistanceTravelled;
    }

    public int getNumberOfVictories() {
        return prdNumVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        prdNumVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
