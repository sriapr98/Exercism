import java.lang.*;
class SpaceAge {
    private double seconds;
    private double earthYears;
    SpaceAge(double seconds) {
        this.seconds=seconds;
        earthYears=seconds/(365.25*60*60*24);
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return Math.round((onEarth()/0.2408467)*100.0)/100.0;
    }

    double onVenus() {
        return Math.round((onEarth()/0.61519726)*100.0)/100.0;
    }

    double onMars() {
        return Math.round((onEarth()/1.8808158)*100.0)/100.0;
    }

    double onJupiter() {
        return Math.round((onEarth()/11.862615)*100.0)/100.0;
    }

    double onSaturn() {
        return Math.round((onEarth()/29.447498)*100.0)/100.0;
    }

    double onUranus() {
        return Math.round((onEarth()/84.016846)*100.0)/100.0;
    }

    double onNeptune() {
        return Math.round((onEarth()/164.79132)*100.0)/100.0;
    }

}
