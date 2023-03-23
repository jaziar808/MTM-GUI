package Model;

import Model.Device;

import java.util.*;

public class Servo implements Device {

    /** list of the pin numbers that this servo motor has been allocated by the arduino */
    private HashMap<String, Integer> pinNums;

    /**
     * Used to get the pin numbers that are associated with this servo
     * @return number of all arduino pins that this servo is connected to
     */
    @Override
    public Collection<Integer> getPinNums(){
        return this.pinNums.values();
    }

    /**
     * This method is not used for the servo
     * @return null, since servo cannot be read from
     */
    @Override
    public List<String> read(){
        return null;
    }

    /**
     * Write to one of the servo's pins
     * @param pinNum the number of the pin that is being written to
     */
    @Override
    public void update(int pinNum){
        // TODO
    }

    /**
     * Allocate pin numbers to this servo
     * @param pinNums a map of string keys mapped to integers representing pin numbers
     */
    @Override
    public void allocPins(HashMap<String, Integer> pinNums){
        this.pinNums = pinNums;
    }

}
