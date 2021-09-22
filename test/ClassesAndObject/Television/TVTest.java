package ClassesAndObject.Television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    TV tv1;
    TV tv2;
    @BeforeEach
    void setUp() {
       tv1 = new TV();
       tv2 = new TV();
    }

    @Test
    void initialStatOfTvIsOff(){
        assertFalse(tv1.on);
    }

    @Test
    void tvIsOn(){
        assertTrue(tv1.turnOn());
    }
    @Test
    void tvIsOff(){
        assertFalse(tv1.turnOff());
    }

    @Test
    void canSetTvChannel(){
        tv1.turnOn();
        assertEquals(30, tv1.setChannel(30));
    }

    @Test
    void canSetTvVolumeLevel(){
        tv1.turnOn();
        assertEquals(30, tv1.setVolume(30));
    }

    @Test
    void canIncreaseTvVolumeLevel(){
        tv1.turnOn();
        assertEquals(30, tv1.setVolume(30));
        assertEquals(31,tv1.volumeUp());
    }

    @Test
    void canDecreaseTvVolumeLevel(){
        tv1.turnOn();
        assertEquals(30, tv1.setVolume(30));
        assertEquals(29,tv1.volumeDown());
    }

    @Test
    void canChangeTvForward(){
        tv1.turnOn();
        assertEquals(30, tv1.setChannel(30));
        assertEquals(31,tv1.channelUp());
    }

    @Test
    void canChangeTvBackward(){
        tv1.turnOn();
        assertEquals(30, tv1.setChannel(30));
        assertEquals(29,tv1.channelDown());
    }


}