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
    public long lastAdded = System.currentTimeMillis();
    private Stack<Miner> lives = new Stack<Miner>();

    public Bar bar1 = new Bar("AIR", "", 20, 100);
    public Score scoreCounter = new Score();//the current score
    public Player player = new Player(scoreCounter, lives); //The Moving Player
    
    public Level()
    {
        setPaintOrder(GameOver.class, mainMenu.class, Miner.class, Blocks.class, Dangers.class, Key.class);
        prepare();
        
        addObject(bar1, 446, 562);

    }

    public void act()
    {
            if (bar1.getValue() == bar1.getMinimumValue())
        {
            if (getObjects(GameOver.class).isEmpty()) showGameOver();
            
            player.endGame(true);
            return;
        }
        timer(1);
    }
    
    private void showGameOver()
    {
        addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
    }
    public void timer(int timeBetweenCountdown)
    {
        long curTime  = System.currentTimeMillis();
        int delay = (timeBetweenCountdown*1000);
        if (curTime >= lastAdded + delay) //5000ms = 5s
        {
            bar1.subtract(1);
            lastAdded  = curTime;
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        /*mainMenu mainmenu = new mainMenu();
        addObject(mainmenu,577,425);
        mainmenu.setLocation(569,424);*/
        //
        speedUp speedup = new speedUp();
        addObject(speedup,560,678);
        speedup.setLocation(779,726);
        //
        VerticalBrick1 verticalbrick1 = new VerticalBrick1();
        addObject(verticalbrick1,889,203);
        VerticalBrick1 verticalbrick12 = new VerticalBrick1();
        addObject(verticalbrick12,884,282);
        verticalbrick1.setLocation(887,193);
        verticalbrick12.setLocation(874,320);
        verticalbrick1.setLocation(876,189);
        verticalbrick12.setLocation(876,321);
        
        VerticalBrick verticalbrick = new VerticalBrick();
        addObject(verticalbrick,120,195);
        VerticalBrick verticalbrick2 = new VerticalBrick();
        addObject(verticalbrick2,159,216);
        verticalbrick.setLocation(20,202);
        verticalbrick2.setLocation(23,318);
        verticalbrick.setLocation(22,200);
        verticalbrick2.setLocation(23,320);
        verticalbrick2.setLocation(22,321);
        //
   
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
        Gate gate = new Gate();//Gate To Finish
        addObject(gate,843,492);
        gate.setLocation(837,467);
        //
        addObject(player,85,490);
        player.setLocation(65,462);
        //
        
    }
}
