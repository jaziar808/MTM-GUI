package Model;

import java.util.*;
public interface Device {
    /**
     * Used to get the numbers of all pins that are associated with a device
     * @return all arduino pins that this device has been allocated
     */
    public Collection<Integer> getPinNums();

    /**
     * Used to read data from the device, if available
     * @return a list of strings, each string representing data from one pin
     */
    public List<String> read();

    /**
     * Used to write to a device connected to the arduino
     * @param pinNum the number of the pin that is being written to
     */
    public void update(int pinNum);

    /**
     * Used to tell a device which arduino pins it has been connected to
     * @param pinNums a list of string keys mapped to integers representing pin numbers
     */
    public void allocPins(HashMap<String, Integer> pinNums);
}
