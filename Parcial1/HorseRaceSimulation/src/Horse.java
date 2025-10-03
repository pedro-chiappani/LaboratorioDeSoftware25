
/**
 * This class represents a horse in the race. It's class variables iclude the horse's name, symbol, confidence, distance travelled and whether it has fallen or not. 
 * The class also includes methods to set and get the horse's confidence, distance travelled, name, symbol and whether it has fallen or not. 
 * The class also includes methods to make the horse fall, move forward, go back to the start, set the horse's confidence and symbol.
 * 
 * @author (Acil Djehiche) 
 * @version (Version 2 - 22/04/2024)
 */
public class Horse
{
    String horseName;
    char horseSymbol;
    double horseConfidence;
    int distanceTravelled;
    boolean hasFallen;
    int totalDistanceTravelled;
    Temp temperamento;

    public Horse(char horseSymbol, String horseName, double horseConfidence, Temp temp)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.horseConfidence = horseConfidence;
        this.distanceTravelled = 0;
        this.hasFallen = false;
        this.temperamento = temp;
    }
    
    
    public void fall()
    {
        this.hasFallen = true;
    }
    
    public double getConfidence()
    {
        return this.horseConfidence;
    }
    
    public int getDistanceTravelled()
    {
        return this.distanceTravelled;
    }
    
    public String getName()
    {
        return this.horseName;
    }
    
    public char getSymbol()
    {
        return this.horseSymbol;
    }
    
    public void goBackToStart()
    {
        this.distanceTravelled = 0;
        this.hasFallen = false;
    }
    
    public boolean hasFallen()
    {
        return this.hasFallen;
    }

    public void moveForward()
    {
        this.distanceTravelled += 1;
    }
    public void moveForwardGUI(){
        this.distanceTravelled += 4;
    }
    public void SetTotalDistanceTravelled(int distance){
        this.totalDistanceTravelled += distance;
    }
    public int getTotalDistanceTravelled(){
        return this.totalDistanceTravelled;
    }

    public void setConfidence(double newConfidence)
    {
        if(newConfidence>1.0){
            newConfidence = 1.0;
        }
        else if(newConfidence<0.1){
            newConfidence = 0.1;
        }
        newConfidence = Math.round(newConfidence * 100.0) / 100.0;
        this.horseConfidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        this.horseSymbol = newSymbol;
    }

    public void move(Race r){
        temperamento.moveHorse(this, r);
        if  (!this.hasFallen())
        {
            if (Math.random() < this.getConfidence())//Velocidad según confianza
            {
                this.moveForwardGUI();
                this.SetTotalDistanceTravelled(this.getDistanceTravelled());
            }

            if (Math.random() < ((1-this.getConfidence())* (1-this.getConfidence())*0.1))//Caída según confianza
            {
                this.fall();
                if(this.getConfidence()>0.0){
                    this.setConfidence(this.getConfidence()-0.1);
                }else{
                    this.setConfidence(0.1);
                }
            }
        }
    }


    
}
