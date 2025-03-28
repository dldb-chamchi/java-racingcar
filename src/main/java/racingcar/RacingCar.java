package racingcar;

public class RacingCar {
    int forwardCount = 0;
    String carName;

    public RacingCar(String carName) {
        if(carName.length() > 5) throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
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

