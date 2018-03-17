import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelName extends Actor
{
    /**
     * Act - do whatever the LevelName wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String levelName;
    public void setNumber(String num) { levelName = levelName; }
    public void act() 
    {
        //setImage(new GreenfootImage("Score: " + levelName, 20, Color.WHITE,null ));
        Color TRANS = new Color(0, 0, 0, 0);
        //System.out.println(levelName + "hi");
        //levelName = "Rhys";
        setImage(new GreenfootImage("The Central Cavern", 40, Color.WHITE, TRANS));
    }    
}
