import java.util.*;

public class PlanetsDriver {
    public static void main(String[] args) {
        PlanetsDriver pd = new PlanetsDriver();
        ArrayList<Planets> planet = new ArrayList<>();
        planet.add(new Planets("Mercury",new String[]{}, 0, false));
        planet.add(new Planets("Venus", new String[]{"Carbon Dioxide", "Nitrogen"}, 0, false));
        planet.add(new Planets("Earth", new String[]{"Nitrogen", "Oxygen"}, 1, false));
        planet.add(new Planets("Jupitor", new String[]{"Hydrogen", "Helium"}, 79, true));
        planet.add(new Planets("Satrun", new String[]{"Hydrogen", "Helium"}, 83, true));
        planet.add(new Planets("Uranus", new String[]{"Hydrogen", "Helium", "Methane"}, 27, true));


       for (Planets p : planet) {
            System.out.println(p);
        }

       //pd.moonCount(planet);
       pd.maxGases(planet);
    }

    public void moonCount(ArrayList<Planets> ls) {
        int count = 0;
        Iterator<Planets> pl = ls.iterator();
        while (pl.hasNext()) {
            Planets itr = pl.next();
            if (itr.planetsWithRings = true) {
                count = count + itr.numberOfMoons;
            }
        }
        System.out.println("Moons of planets having rings" + count);
    }

    public void maxGases(ArrayList<Planets> ls) {
        Set<String> mg = new HashSet<>();
        Iterator<Planets> pl = ls.iterator();
        while (pl.hasNext()) {
            Planets itr = pl.next();
            for (int i = 0; i <itr.gases.length ; i++) {
                if(mg.add(itr.gases[i])==true){
                    System.out.println(Arrays.toString(itr.gases));
                }
            }

            }

        }

        /*for (int i = 0; i < gases.length ; i++) {
            if(mg.add(gases[i])==false){
                System.out.println(gases[i]);
            }
        }
    }*/
}


