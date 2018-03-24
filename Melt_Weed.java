import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.TimeUnit;

/**
 * Write a description of class Melt_Weed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Melt_Weed extends Blocks
{
    /**
     * Act - do whatever the Melt_Weed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int depression;
    private int yAxis;
    
    public void act() 
    {
        /* it does not say to sink
        yAxis = getY();
        depression = 0;
            if(isTouching(Player.class)){
                if (depression == 0){
                    setLocation(getX(), getY()+1);
                    depression++;
                }
                if (depression == 1){
                    setLocation(getX(), getY()+2);
                    depression++;
                }
                if (depression == 2){
                    setLocation(getX(), getY()+4);
                    depression++;
                }
                if (depression == 3){
                    getWorld().removeObject(this);
                }
        }  */  
    }
}
