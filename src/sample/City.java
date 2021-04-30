package sample;

import java.util.ArrayList;

public class City {

    private int plateNo;
    ArrayList<Integer> distancesToOtherCities = new ArrayList<>();

    ArrayList<ArrayList<Integer>> paths = new ArrayList<>();

    public City(int plateNo) {
        this.plateNo = plateNo;
    }

    public int getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(int plateNo) {
        this.plateNo = plateNo;
    }
}
