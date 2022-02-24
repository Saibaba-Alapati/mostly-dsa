class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void speedUp(int increment){
        speed+=increment;
    }
    public void applyBrake(int decrement){
        speed-=decrement;
    }
    public String toString(){
        return("No of gears are" + gear + "\n" + "speed of bicycle is " + speed );
    }
}

class KidBike extends Bicycle{
    int seatHeight;
    public KidBike(int gear, int speed, int startHeight){
        super(gear,speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    @Override public String toString(){
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
class Test{
    public static void main(String args[]){
        KidBike kb =  new KidBike(7, 100, 20);
        System.out.println(kb.toString());
    }
}