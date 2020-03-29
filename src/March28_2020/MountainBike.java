package March28_2020;

public class MountainBike extends Bicycle {
    int tireType;
    int seatHeight;

    public MountainBike(int tireType, int seatHeight) {
        super();
        this.tireType = tireType;
        this.seatHeight = seatHeight;
    }

    public int getTireType() {
        return tireType;
    }
    public void setTireType(int tireType) {
        this.tireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
void slowDown(){
    System.out.println("Speed Slowed");
}
void speedUp(){
    System.out.println("Speed up");
}
void stop (){
    System.out.println("Stop");
}
void start() {
    System.out.println("Start");
}
void switchToSteepMode(){
    System.out.println("Steep Mode Active");
}

    @Override
    public String toString() {
        return "MountainBike{" +
                "tireType=" + tireType +
                ", seatHeight=" + seatHeight +
                '}';
    }
}
