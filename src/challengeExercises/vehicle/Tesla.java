package challengeExercises.vehicle;

public class Tesla extends Cars{
    private int roadServiceMonths;

    public Tesla(int roadServiceMonths) {
        super("Tesla", "Armor", 6, 5, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }

        else if (newVelocity >0 && newVelocity <=10) changeGear(1);
        else if (newVelocity >10 && newVelocity <=20) changeGear(2);
        else if (newVelocity >20 && newVelocity <=30) changeGear(3);
        else if (newVelocity >30 && newVelocity <=40) changeGear(4);
        else changeGear(5);
        if(newVelocity >0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
