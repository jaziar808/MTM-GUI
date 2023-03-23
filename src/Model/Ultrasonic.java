package Model;


import java.util.*;

public class Ultrasonic implements Device {

    /** list of the pin numbers that this ultrasonic sensor has been allocated by the arduino */
    private HashMap<String, Integer> pinNums;

    /**
     * Used to get the pin numbers that are associated with this ultrasonic sensor
     * @return number of all arduino pins that this ultrasonic sensor is connected to
     */
    @Override
    public Collection<Integer> getPinNums(){
        return this.pinNums.values();
    }

    /**
     * Used to read data from the ultrasonic sensor
     * @return UNKOWN HOW THIS WILL RETURN DATA AT THE MOMENT
     */
    @Override
    public List<String> read(){
        // TODO
        return null;
    }

    /**
     * Write to one of the ultrasonic sensors's pins
     * @param pinNum the number of the pin that is being written to
     */
    @Override
    public void update(int pinNum){
        // TODO
    }

    /**
     * Allocate pin numbers to this ultrasonic sensor
     * @param pinNums a map of string keys mapped to integers representing pin numbers
     */
    @Override
    public void allocPins(HashMap<String, Integer> pinNums){
        this.pinNums = pinNums;
    }

}
