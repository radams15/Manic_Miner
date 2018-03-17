import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Miner
{
    private int vSpeed;
    private int apexTimer;
    private int keyAmount;
    
    public void act()
    {
        Actor Player = getOneIntersectingObject(null);
        if (Greenfoot.isKeyDown("left")){
            move(-3);
        }
        if (Greenfoot.isKeyDown("right")){
            move(3);
        }
        if ("up".equals(Greenfoot.getKey())){
            jump2(50);
        }
        if(getOneIntersectingObject(Key.class)!=null){
            
        }
        fall();
    }
    /*public void fall()
    {   
        setLocation(getX(), getY()+1);
    }*/
    
    public void fall()
    {
        vSpeed+=1; // add gravity
        int dir=(int)Math.signum(vSpeed); // determine direction
        for(int step=0; step!=vSpeed; step+=dir) // for each pixel-step
        {
            setLocation(getX(), getY()+dir); // move 
            if(getOneIntersectingObject(null)!=null) // check intersection
            {
                setLocation(getX(), getY()-dir); // resistance (step-back)
                vSpeed=0; // stopped
                break; // forces exit out of 'for' loop
            }
        }
    }
    
        public void jump2(int ySpeed)
    {
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);
        if (!onGround) // in middle of jump
        {
            if (ySpeed == 0 && apexTimer > 0) apexTimer--; // run apex timer
            if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()-ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -15; // add jump speed
                setLocation(getX(), getY()-ySpeed); // leave ground
                apexTimer = 300;  // set apex timer (adjust value to suit)
            }
        }
    }
    
    public void jump(int height)
    {
        if (isTouching(Weed.class) || (isTouching(Brick.class)))
        {
            for (int i = 0; i < height; i++){
                setLocation(getX(), getY()-1);
                System.out.println("up");
            }
            for (int i = 0; i < height; i++){
                setLocation(getX(), getY()+1);
                System.out.println("down");
            }
        }
    }
}
