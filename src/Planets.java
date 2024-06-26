import java.util.Arrays;

public class Planets {
    String name;
    String gases[];
    int numberOfMoons;
    boolean planetsWithRings;

    Planets(){}

    Planets( String name, int numberOfMoons, boolean planetsWithRings) {
        this.name = name;
        this.numberOfMoons = numberOfMoons;
        this.planetsWithRings = planetsWithRings;
    }

    Planets( String name, String[] gases, int numberOfMoons, boolean planetsWithRings) {

        this.name = name;
        this.gases=gases;
        this.numberOfMoons = numberOfMoons;
        this.planetsWithRings = planetsWithRings;
    }

    @Override
    public String toString() {
        return "Planets{" +
                ", name='" + name + '\'' +
                ", gases=" + Arrays.toString(gases) +
                ", numberOfMoons=" + numberOfMoons +
                ", planetsWithRings=" + planetsWithRings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planets planets = (Planets) o;
        return Arrays.equals(gases, planets.gases);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(gases);
    }
}