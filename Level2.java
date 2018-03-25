import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends Level
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {
        prepare();
    }
    
    public String nameOfLevel = "The Gloomy Cellar";
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //level Name
        String setName;
        LevelName levelname1 = new LevelName();
        levelname1.setNumber(nameOfLevel);
        addObject(levelname1,415,532);
        // all level 1
        Hard_Weed hard_weed31 = new Hard_Weed();
        addObject(hard_weed31,152,415);
        Hard_Weed hard_weed32 = new Hard_Weed();
        addObject(hard_weed32,381,349);
        Hard_Weed hard_weed33 = new Hard_Weed();
        addObject(hard_weed33,701,328);
        Hard_Weed hard_weed34 = new Hard_Weed();
        addObject(hard_weed34,742,390);
        Hard_Weed hard_weed35 = new Hard_Weed();
        addObject(hard_weed35,784,458);
        hard_weed32.setLocation(240,338);
        hard_weed33.setLocation(122,247);
        hard_weed34.setLocation(333,254);
        hard_weed35.setLocation(417,424);
        Hard_Weed hard_weed36 = new Hard_Weed();
        addObject(hard_weed36,504,382);
        Hard_Weed hard_weed37 = new Hard_Weed();
        addObject(hard_weed37,675,321);
        Hard_Weed hard_weed38 = new Hard_Weed();
        addObject(hard_weed38,760,431);
        hard_weed36.setLocation(467,332);
        hard_weed37.setLocation(622,256);
        hard_weed38.setLocation(668,433);
        Hard_Weed hard_weed39 = new Hard_Weed();
        addObject(hard_weed39,748,340);
        hard_weed39.setLocation(746,329);
        Hard_Weed hard_weed40 = new Hard_Weed();
        addObject(hard_weed40,788,127);
        Hard_Weed hard_weed41 = new Hard_Weed();
        addObject(hard_weed41,629,123);
        Hard_Weed hard_weed42 = new Hard_Weed();
        addObject(hard_weed42,540,195);
        hard_weed40.setLocation(776,159);
        hard_weed41.setLocation(643,101);
        hard_weed42.setLocation(412,158);
        Hard_Weed hard_weed43 = new Hard_Weed();
        addObject(hard_weed43,131,105);
        Hard_Weed hard_weed44 = new Hard_Weed();
        addObject(hard_weed44,232,203);
        hard_weed44.setLocation(199,191);
        Plant plant5 = new Plant();
        addObject(plant5,330,237);
        plant5.setLocation(329,226);
        Rock rock3 = new Rock();
        addObject(rock3,174,46);
        rock3.setLocation(163,28);
        Hard_Weed hard_weed45 = new Hard_Weed();
        addObject(hard_weed45,213,498);
        Hard_Weed hard_weed46 = new Hard_Weed();
        addObject(hard_weed46,229,491);
        Hard_Weed hard_weed47 = new Hard_Weed();
        addObject(hard_weed47,328,495);
        Hard_Weed hard_weed48 = new Hard_Weed();
        addObject(hard_weed48,564,498);
        Hard_Weed hard_weed49 = new Hard_Weed();
        addObject(hard_weed49,658,496);
        hard_weed45.setLocation(85,496);
        hard_weed46.setLocation(180,496);
        hard_weed47.setLocation(275,496);
        hard_weed48.setLocation(370,496);
        hard_weed49.setLocation(464,496);
        Hard_Weed hard_weed50 = new Hard_Weed();
        addObject(hard_weed50,589,479);
        Hard_Weed hard_weed51 = new Hard_Weed();
        addObject(hard_weed51,725,495);
        Hard_Weed hard_weed52 = new Hard_Weed();
        addObject(hard_weed52,817,482);
        hard_weed50.setLocation(558,496);
        hard_weed51.setLocation(640,496);
        hard_weed52.setLocation(735,496);
        Hard_Weed hard_weed53 = new Hard_Weed();
        addObject(hard_weed53,741,477);
        hard_weed53.setLocation(815,496);
        Key key5 = new Key();
        addObject(key5,438,238);
        Key key6 = new Key();
        addObject(key6,513,192);
        Key key7 = new Key();
        addObject(key7,769,197);
        Key key8 = new Key();
        addObject(key8,852,317);
        key5.setLocation(147,86);
        key6.setLocation(618,81);
        key8.setLocation(225,314);
        key7.setLocation(635,242);
        Rock rock4 = new Rock();
        addObject(rock4,738,197);
        rock4.setLocation(748,185);
        VerticalBrick1 verticalbrick1 = new VerticalBrick1();
        addObject(verticalbrick1,814,138);
        VerticalBrick verticalbrick = new VerticalBrick();
        addObject(verticalbrick,799,139);
        verticalbrick.setLocation(787,139);
        removeObject(verticalbrick);
        removeObject(verticalbrick1);
        Key key9 = new Key();
        addObject(key9,583,409);
        key9.setLocation(649,415);
        Key key10 = new Key();
        addObject(key10,777,459);
        key10.setLocation(780,474);
        //
    }
}
