import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    public main()
    {    
        super(900, 800, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootSound backgroundMusic = new GreenfootSound("sounds/manicMinerMusic.mp3");
        backgroundMusic.playLoop();
    }
}
