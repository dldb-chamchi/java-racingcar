package racingcar;

public class RacingCar {
    int forwardCount = 0;
    String carName;

    public RacingCar(String carName) {
        if(carName.length() > 5) throw new IllegalArgumentException();
        this.carName = carName;
    }

    public void increaseForwardCount(int randomNumber) {
        if(randomNumber >= 4) ++forwardCount;
    }

    public String getCarName(){
        return carName;
    }

    public int getForwardCount(){
        return forwardCount;
    }

}

