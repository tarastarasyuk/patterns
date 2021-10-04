package facade.myImpl;

public class FacadeTest {
    public static void main(String[] args) {
        /**
         * Before facade
         */
//         Power power = new Power();
//         power.on();
//
//         DVDRom dvd = new DVDRom();
//         dvd.load();
//
//         HDD hdd = new HDD();
//         hdd.copyFromDVD(dvd);
        /**
         * After
         */
        Computer computer = new Computer();
        computer.copy();
    }
}

class Computer {
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy() {
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}

class Power {
     void on() {
         System.out.println("Power on...");
     }
     void off() {
         System.out.println("Power of...");
     }
}

class DVDRom {
    private boolean data = false;
    public boolean hasData() {
        return data;
    }
    void load() {
        data = true;
    }
    void unload() {
        data = false;
    }
}


class HDD {
    void copyFromDVD(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Copying data");
        } else {
            System.out.println("Insert disk with data");
        }
    }
}