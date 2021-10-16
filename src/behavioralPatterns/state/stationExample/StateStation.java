package behavioralPatterns.state.stationExample;


public class StateStation {
    public static void main(String[] args) {
        //Зміна станів у контексті (в класі Radio)
        Station station = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(station);

        for (int i = 0; i < 10; i++) {
            radio.play();
            radio.nextStation();
        }

        System.out.println("\n===\n");

        //Зміна станів у самих станах
        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }

    }
}

/**
 * Приклад з зміною станів у самих станах
 */

class Human {
    private Activity state;
    public void setState(Activity state) {
        this.state = state;
    }
    public void doSomething() {
        state.doSomething(this);
    }
}

class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Work!!!");
        context.setState(new WeekEnd());
    }
}

class WeekEnd implements Activity{
    private int count = 0;
    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Relax)))");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}

/**
 * Приклад з зміною станів у контексті (клас Radio)
 */
interface Activity {
    void doSomething(Human context);
}

interface Station {
    void play();
}

class Radio7 implements Station {
    public void play() {
        System.out.println("Radio 7...");
    }
}

class RadioDFM implements Station {
    public void play() {
        System.out.println("Radio DFM...");
    }
}

class XitFM implements Station {
    public void play() {
        System.out.println("Radio FM...");
    }
}

class Radio {
    Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new XitFM());
        } else if (station instanceof XitFM) {
            setStation(new Radio7());
        }
    }

    public void play() {
        station.play();
    }
}
