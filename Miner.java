import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Miner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Miner extends Actor
{
    /**
     * Act - do whatever the Miner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Miner()
    {
                GreenfootImage image = getImage();
        image.scale(image.getWidth() + 15, image.getHeight() + 15);
        setImage(image);
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
