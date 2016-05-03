package com.example.dell.smackerballs;
import android.graphics.RectF;

public class Paddle {

    // RectF is an object that holds four coordinates - just what we need
    public RectF rect;

    // How long and high our paddle will be
    private float length;
    private float height;

    // X is the far left of the rectangle which forms our paddle
    private float x;

    // Y is the top coordinate
    private float y;

    // This will hold the pixels per second speedthat the paddle will move
    private float paddleSpeed;
    private float screenx;
    private float screeny;

    // Which ways can the paddle move
    public final int STOPPED = 0;
    public final int LEFT = 1;
    public final int RIGHT = 2;

    // Is the paddle moving and in which direction
    private int paddleMoving = STOPPED;

    // This the the constructor method
    // When we create an object from this class we will pass
    // in the screen width and height
    public Paddle(int screenX, int screenY){
        // 130 pixels wide and 20 pixels high
        screenx = screenX;
        screeny = screenY;
        length = 100;
        height = 25;

        // Start paddle in roughly the sceen centre
        x = screenX / 2;
        y = screenY - 120;

        rect = new RectF(x, y, x + length, y + height);

        // How fast is the paddle in pixels per second
        paddleSpeed = 350;
        if(screenX>screenY) {
            length *=2;
            paddleSpeed *= 3;
        }

    }

    // This is a getter method to make the rectangle that
    // defines our paddle available in BreakoutView class
    public RectF getRect(){
        return this.rect;
    }
    /*public RectF getRect(){
        return this.rect;
    }*/
    private boolean isVisible;
    public void setInvisible(){
        isVisible = true;
    }

    public boolean getVisibility(){
        return isVisible;
    }

    // This method will be used to change/set if the paddle is going left, right or nowhere
    public void setMovementState(int state){
        paddleMoving = state;
    }

    // This update method will be called from update in BreakoutView
    // It determines if the paddle needs to move and changes the coordinates
    // contained in rect if necessary
    public void update(long fps){
        if(paddleMoving == LEFT){
            if(x-paddleSpeed/fps >0)
                x = x - paddleSpeed / fps;

        }

        if(paddleMoving == RIGHT){
            if(x+length+paddleSpeed/fps <screenx)
                 x = x + paddleSpeed / fps;
        }

        rect.left = x;
        rect.right = x + length;
    }

}
