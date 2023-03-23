package Model;

import Model.Device;

import java.util.*;

public class Stepper implements Device {

    /** list of the pin numbers that this stepper motor has been allocated by the arduino */
    private List<Integer> pinList;

    /**
     * Used to get the pin numbers that are associated with this stepper
     * @return number of all arduino pins that this stepper is connected to
     */
    @Override
    public List<Integer> getPinNums(){
        return pinList;
    }

}
