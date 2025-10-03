public class Temperal {
    private final Temp temperamento1 = this.new Temp1();
    private final Temp temperamento2 = this.new Temp2();
    private final Temp temperamento3 = this.new Temp3();

    private static Temperal instancia;

    private Temperal(){

    }

    public static Temperal getInstancia() {
        if (instancia == null) {
            instancia = new Temperal();
        }
        return instancia;
    }

    public Temp getTemperamento1() {
        return this.temperamento1;
    }

    public Temp getTemperamento2() {
        return this.temperamento2;
    }

    public Temp getTemperamento3() {
        return this.temperamento3;
    }

    private class Temp1 implements Temp{


        @Override
        public void moveHorse(Horse horse, Race race) {
            if (horse.getDistanceTravelled() == (race.getRaceLength()/2)){
                horse.setConfidence(0.9);
            }
        }
    }

    private class Temp2 implements Temp{
        @Override
        public void moveHorse(Horse horse, Race race) {
            int pos = race.getPosicion(horse);
            if (pos == 1){
                horse.setConfidence(0.8);
            } else if (pos == 3) {
                horse.setConfidence(0.5);
            }
        }
    }

    private class Temp3 implements Temp{
        @Override
        public void moveHorse(Horse horse, Race race) {
            if (!race.isFinished())
                horse.setConfidence(horse.getConfidence()+0.001);
        }
    }
}