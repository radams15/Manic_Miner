import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends Level
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public String nameOfLevel = "Cavern";
    
    
    public Level1()
    {
        prepare();
    }

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
        Hard_Weed hard_weed = new Hard_Weed();
        addObject(hard_weed,113,134);
        hard_weed.setLocation(91,141);
        Hard_Weed hard_weed2 = new Hard_Weed();
        addObject(hard_weed2,84,141);
        hard_weed2.setLocation(93,224);
        Hard_Weed hard_weed3 = new Hard_Weed();
        addObject(hard_weed3,98,286);
        hard_weed3.setLocation(94,285); 
        Hard_Weed hard_weed4 = new Hard_Weed();
        addObject(hard_weed4,98,286);
        hard_weed4.setLocation(171,429);
        Hard_Weed hard_weed5 = new Hard_Weed();
        addObject(hard_weed5,89,507);
        hard_weed5.setLocation(84,499);
        Hard_Weed hard_weed6 = new Hard_Weed();
        addObject(hard_weed6,209,500);
        Hard_Weed hard_weed7 = new Hard_Weed();
        addObject(hard_weed7,209,500);
        Hard_Weed hard_weed8 = new Hard_Weed();
        addObject(hard_weed8,209,500);
        hard_weed8.setLocation(297,428);
        hard_weed7.setLocation(357,454);
        hard_weed6.setLocation(179,499);
        hard_weed7.setLocation(274,499);
        hard_weed8.setLocation(368,499);
        hard_weed4.setLocation(462,498);
        removeObject(hard_weed4);
        Hard_Weed hard_weed9 = new Hard_Weed();
        addObject(hard_weed9,464,500);
        hard_weed9.setLocation(463,499);
        Hard_Weed hard_weed10 = new Hard_Weed();
        addObject(hard_weed10,465,504);
        hard_weed10.setLocation(557,498);
        hard_weed10.setLocation(558,499);
        Hard_Weed hard_weed11 = new Hard_Weed();
        addObject(hard_weed11,547,495);
        hard_weed11.setLocation(651,499);
        Hard_Weed hard_weed12 = new Hard_Weed();
        addObject(hard_weed12,734,496);
        hard_weed12.setLocation(745,499);
        Hard_Weed hard_weed13 = new Hard_Weed();
        addObject(hard_weed13,739,450);
        hard_weed12.setLocation(746,499);
        hard_weed13.setLocation(812,499);
        hard_weed13.setLocation(814,499);
        ConveyorBrick conveyorbrick = new ConveyorBrick();
        addObject(conveyorbrick,503,288);
        conveyorbrick.setLocation(491,284);
        Hard_Weed hard_weed14 = new Hard_Weed();
        addObject(hard_weed14,817,320);
        hard_weed14.setLocation(812,322);
        Hard_Weed hard_weed15 = new Hard_Weed();
        addObject(hard_weed15,804,373);
        hard_weed15.setLocation(812,374);
        Melt_Weed melt_weed = new Melt_Weed();
        addObject(melt_weed,722,383);
        melt_weed.setLocation(717,378);
        melt_weed.setLocation(716,377);
        Melt_Weed melt_weed2 = new Melt_Weed();
        addObject(melt_weed2,604,378);
        melt_weed2.setLocation(621,377);
        melt_weed.setLocation(716,376);
        melt_weed2.setLocation(621,376);
        HorizontalBrick horizontalbrick = new HorizontalBrick();
        addObject(horizontalbrick,545,385);
        horizontalbrick.setLocation(538,379);
        Hard_Weed hard_weed16 = new Hard_Weed();
        addObject(hard_weed16,460,380);
        Hard_Weed hard_weed17 = new Hard_Weed();
        addObject(hard_weed17,384,351);
        Hard_Weed hard_weed18 = new Hard_Weed();
        addObject(hard_weed18,378,350);
        hard_weed16.setLocation(453,376);
        hard_weed18.setLocation(355,378);
        removeObject(hard_weed18);
        hard_weed17.setLocation(356,377);
        removeObject(hard_weed17);
        Hard_Weed hard_weed19 = new Hard_Weed();
        addObject(hard_weed19,360,386);
        hard_weed19.setLocation(276,380);
        hard_weed16.setLocation(381,381);
        removeObject(hard_weed16);
        Hard_Weed hard_weed20 = new Hard_Weed();
        addObject(hard_weed20,359,386);
        hard_weed20.setLocation(366,371);
        Hard_Weed hard_weed21 = new Hard_Weed();
        addObject(hard_weed21,424,357);
        hard_weed21.setLocation(455,375);
        hard_weed20.setLocation(360,375);
        hard_weed19.setLocation(265,375);
        hard_weed19.setLocation(267,392);
        hard_weed20.setLocation(360,382);
        Hard_Weed hard_weed22 = new Hard_Weed();
        addObject(hard_weed22,211,422);
        hard_weed22.setLocation(192,417);
        Hard_Weed hard_weed23 = new Hard_Weed();
        addObject(hard_weed23,157,448);
        hard_weed23.setLocation(154,440);
        Hard_Weed hard_weed24 = new Hard_Weed();
        addObject(hard_weed24,198,146);
        Hard_Weed hard_weed25 = new Hard_Weed();
        addObject(hard_weed25,334,134);
        Hard_Weed hard_weed26 = new Hard_Weed();
        addObject(hard_weed26,479,121);
        Hard_Weed hard_weed27 = new Hard_Weed();
        addObject(hard_weed27,604,129);
        Hard_Weed hard_weed28 = new Hard_Weed();
        addObject(hard_weed28,719,129);
        hard_weed24.setLocation(186,141);
        hard_weed25.setLocation(281,141);
        hard_weed26.setLocation(375,141);
        hard_weed27.setLocation(469,141);
        hard_weed28.setLocation(564,141);
        removeObject(hard_weed28);
        Melt_Weed melt_weed3 = new Melt_Weed();
        addObject(melt_weed3,570,150);
        Melt_Weed melt_weed4 = new Melt_Weed();
        addObject(melt_weed4,659,142);
        melt_weed3.setLocation(563,143);
        melt_weed4.setLocation(657,143);
        Hard_Weed hard_weed29 = new Hard_Weed();
        addObject(hard_weed29,759,149);
        hard_weed29.setLocation(753,141);

        Hard_Weed hard_weed31 = new Hard_Weed();
        addObject(hard_weed31,182,292);
        hard_weed31.setLocation(181,284);
        hard_weed31.setLocation(181,285);
        conveyorbrick.setLocation(494,232);
        hard_weed2.setLocation(88,194);
        hard_weed3.setLocation(86,263);
        hard_weed31.setLocation(178,263);
        //level 1 set out
        Robot_Restrictor robot_restrictor = new Robot_Restrictor();
        addObject(robot_restrictor,268,226);
        robot_restrictor.setLocation(261,217);
        //
    }
}
