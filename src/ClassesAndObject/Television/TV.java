package ClassesAndObject.Television;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }

    public boolean turnOn(){
        on = true;
        return on;
    }
    public boolean turnOff(){
        on = false;
        return on;
    }

    public int setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 150) channel = newChannel;
        return channel;
    }
    public int setVolume(int newVolume){
        if(on && newVolume >= 1 && newVolume <= 50) volumeLevel = newVolume;
        return newVolume;
    }

    public int channelUp(){
        if (on && channel < 150)
            channel++;
        return channel;
    }
    public int channelDown(){
        if (on && channel > 1)
            channel--;
        return channel;
    }
    public int volumeUp(){
        if (on && volumeLevel < 50) volumeLevel++;
        return volumeLevel;
    }
    public int volumeDown(){
        if (on && volumeLevel > 1) volumeLevel--;
        return volumeLevel;
    }

}
