import java.util.concurrent.TimeUnit;
import java.util.Random;

class MotorDescompuesto extends Exception{}
class NeumaticoPinchado extends Exception{}


public class Auto implements Runnable{
    private String piloto;
    private int dist = 0;
    private Boolean motor = true;
    private Boolean finish = false;
    private int distCarrera;

    public Auto(String piloto, int distCarrera){
        this.piloto = piloto;
        this.distCarrera = distCarrera;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getPiloto() {
        return piloto;
    }

    public int getDist() {
        return dist;
    }

    public boolean getMotor() {
        return motor;
    }

    public void correr() throws MotorDescompuesto, NeumaticoPinchado{
        try {
            TimeUnit.SECONDS.sleep((new Random().nextInt(10)+1));
            dist += 10;
            int r = new Random().nextInt(100);
            if (r == new Random().nextInt(100)){
                throw new MotorDescompuesto();
            }else{
                if (r < 30){
                    throw new NeumaticoPinchado();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        try {
            if (motor && !finish)
                correr();
            System.out.println(piloto);
        }catch (MotorDescompuesto e){
            motor = false;
            System.out.println(piloto + " no termina por motor descompuesto");
        }catch (NeumaticoPinchado e){
            System.out.println(piloto + " neumatico pinchado");
            try{
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
