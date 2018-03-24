import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speedUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speedUp extends Actor
{
    /**
     * Act - do whatever the speedUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean clicked = false;
    public speedUp()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 150, image.getHeight() - 150);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setSpeed(70);
        }
    }    
}
