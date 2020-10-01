/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    
    /**
     */
    public void downUp(){
        while (!isWater(AHEAD)){
            hop();
        }
        turn(LEFT);
        hop();
        turn(LEFT);
        while (!isWater(AHEAD)){
            hop();
        }
        turn(RIGHT);
        hop();
        turn(RIGHT);
    }
    
    public void findFlowerInRoom() {
        if (!isFacing(North)){
            if (isFacing(EAST)){
                turn(LEFT);
            }
            else if (isFacing(WEST)){
                turn(RIGHT));
            }
            else {
                turn(LEFT);
                turn(LEFT);
            }
        }
        while (!isWater(AHEAD)){
            hop();
        }
        turn(LEFT);
        while (!isWater(AHEAD)){
            hop();
        }
        turn(LEFT);
        while (!isFlower(HERE)){
            downUp();
        }
    }


    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

