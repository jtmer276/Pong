public class PongPaddle {
    private int x, y, width, height;
    public PongPaddle(int top, int left, int w, int h){
        y = top;
        x = left;
        width = w;
        height = h;
    }
    int getBottomY(){
        int bottomY;
        bottomY = y + height;
        bottomY --;
        return bottomY;
    }
    public int getLeftX(){
        return x;
    }
    public int getRightX(){
        int rightX;
        rightX = x + width;
        rightX --;
        return rightX;

    }
    public int getTopY(){
        return y;
    }
    public void moveDown(int d){
        y += d;
    }
    public void moveUp(int d){
        y -= d;
    }
}
