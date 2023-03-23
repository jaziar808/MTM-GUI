package Model;

import java.util.*;

public class ArduinoNano {

    /** constants for writes and reads to digital pins */
    public static final short LOW = 0;
    public static final short HIGH = 1;

    /** the pins of the arduino nano */
    public static final short D1_TX = 1;
    public static final short D0_RX = 2;
    public static final short RESET3 = 3;
    public static final short GND4 = 4;
    public static final short D2 = 5;
    public static final short D3_PWM = 6;
    public static final short D4 = 7;
    public static final short D5_PWM = 8;
    public static final short D6_PWM = 9;
    public static final short D7 = 10;
    public static final short D8 = 11;
    public static final short D9_PWM = 12;
    public static final short D10_PWM_SS = 13;
    public static final short D11_PWM_MOSI = 14;
    public static final short D12_PWM_MISO = 15;
    public static final short D13_SCK = 16;
    public static final short PLUS3V3 = 17;
    public static final short AREF = 18;
    public static final short D14_A0 = 19;
    public static final short D15_A1 = 20;
    public static final short D16_A2 = 21;
    public static final short D17_A3 = 22;
    public static final short D18_A4_SDA = 23;
    public static final short D19_A5_SCL = 24;
    public static final short D20_A6 = 25;
    public static final short D21_A7 = 26;
    public static final short PLUS5V = 27;
    public static final short RESET28 = 28;
    public static final short GND29 = 29;
    public static final short VIN = 30;

    /** Holds the collection of devices connected to the nano */
    private ArrayList<Device> devices = new ArrayList<>();

    /**
     * Creates an arduino nano object
     * @param devices list of devices connected to this arduino nano
     */
    public ArduinoNano(List<Device> devices){

    }
}
