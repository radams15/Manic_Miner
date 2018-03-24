import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Stack;

/**
 * Write a description of class level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Level extends main
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private Stack<Miner> lives = new Stack<Miner>();
    
    public Level()
    {
        setPaintOrder(Miner.class, Blocks.class, Dangers.class, Key.class);
        prepare();
        
        

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Score scoreCounter = new Score();//the current score
        addObject(scoreCounter,804,575);
        scoreCounter.setLocation(809,600);
        //
        Miner life1 = new Miner(); // The Lives (Just Picture) (1)
        addObject(life1,76,490);
        life1.setLocation(44,730);
        this.lives.add(life1);

        Miner life2 = new Miner(); // The Lives (Just Picture) (2)
        addObject(life2,76,490);
        life2.setLocation(84,730);
        this.lives.add(life2);
        //
        VerticalBrick verticalbrick = new VerticalBrick();//Walls
        addObject(verticalbrick,28,211);
        VerticalBrick verticalbrick2 = new VerticalBrick();
        addObject(verticalbrick2,799,235);
        verticalbrick2.setLocation(873,206);
        verticalbrick.setLocation(22,204);
        VerticalBrick verticalbrick3 = new VerticalBrick();
        addObject(verticalbrick3,878,311);
        verticalbrick3.setLocation(873,319);
        VerticalBrick verticalbrick4 = new VerticalBrick();
        addObject(verticalbrick4,97,263);
        verticalbrick4.setLocation(22,321);
        //
        Gate gate = new Gate();//Gate To Finish
        addObject(gate,843,492);
        gate.setLocation(837,467);
        //
        Player player = new Player(scoreCounter, lives); //The Moving Player
        addObject(player,85,490);
        player.setLocation(65,462);
        //
    }
}
