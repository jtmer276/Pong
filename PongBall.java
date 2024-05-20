public class PongBall {
    private int x, y, xvel, yvel;
    public PongBall(int initX, int initY, int initXVel, int initYVel){
        x = initX;
        y = initY;
        xvel = initXVel;
        yvel = initYVel;
    }
    public void bounceX(){
        xvel = xvel * -1;
    }
    public void bounceY(){
        yvel = yvel * -1;

    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public void move(){
        x += xvel;
        y += yvel;
    
    }
}
