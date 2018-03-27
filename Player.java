import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Stack;

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Miner
{
    //public int lives = 3;
    private int walkSpeed = 3;
    public int level = 1;
    private int bounceSpeed = 7;
    private int gravitySpeed = 5;
    private int jumpHeight = 100;
    private int score = 0;
    
    public boolean endGame;
    private int maxScore = 400; //ten times the key amount
    private int ySpeed;
    private int apexTimer;
    private int keyAmount;
    private Stack<Miner> lives;
    private Score scoreCounter;
    public boolean endGame(boolean endGame){
        return this.endGame = endGame;
    }
    public Player(Score scoreCounter, Stack<Miner> lives)
    {
        this.scoreCounter = scoreCounter;
        this.lives = lives;
    }     

    public void lostLife()
    {

        if (! this.lives.empty()){
            Miner life = this.lives.pop();
            getWorld().removeObject(life);
        } else if (this.lives.empty()){
            Greenfoot.stop();
        }
    }
    public void act()
    {
        Actor Player = getOneIntersectingObject(null);
        if (Greenfoot.isKeyDown("left")){
            move(-walkSpeed);
        }
        if (Greenfoot.isKeyDown("right")){
            move(walkSpeed);
        }
        if ("space".equals(Greenfoot.getKey())){
            jump2(jumpHeight);
        }
        if (endGame == true)
        {
            Greenfoot.setWorld(new Level1());
            Greenfoot.stop();
        }
        
        if(isTouching(Key.class)){
            removeTouching(Key.class);
            score = score + 100;
            scoreCounter.setScore(score);
        }
        
        if(isTouching(Dangers.class)){
            lostLife();
            this.setLocation(65,462);
        }
        
        if (isTouching(VerticalBrick.class))
        {
            move(bounceSpeed);
        }
        if (isTouching(VerticalBrick1.class))
        {
            move(-bounceSpeed);
        }
        
        if (isTouching(Gate.class) && score == maxScore)
        {
            checkNextLevel();
        }
        gravity(10);
    }
        private void checkNextLevel()
    {
        try{
            if (level == 1) {
                this.setLocation(65,462);
                Greenfoot.setWorld(new Level2());
                maxScore = 400;
                level = 2;
            }
            else if (level == 2){
                this.setLocation(65,462);
                System.out.println("level 2 finished");
                Greenfoot.setWorld(new Level1());
                maxScore = 600;
                level = 1;
            }
        } catch(java.lang.IllegalStateException i)
        {
            System.out.println(i);
        }
    }
    
    public void gravity(int gravitySpeed)
    {
        if (! isTouching(Blocks.class) )
        {
                 setLocation(getX(), getY()+gravitySpeed);
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
    
    public void resetWorld()
    {
        Greenfoot.setWorld(new main());
    }
}
