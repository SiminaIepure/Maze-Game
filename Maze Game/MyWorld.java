import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time=0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 720, 1); 

        prepare();
    }
    public void act()
    {
        time++;
        if (time % 120==0)
        {
            addObject(new Enemy(), Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Enemy enemy=new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550)); 
        Enemy enemy2=new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550)); 
        Enemy enemy3=new Enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550)); 

        wallwidthmedium wallwidthmedium = new wallwidthmedium();
        addObject(wallwidthmedium,639,456);
        wallwidthmedium.setLocation(500,241);
        wallwidthlong wallwidthlong = new wallwidthlong();
        addObject(wallwidthlong,627,631);
        wallwidthlong.setLocation(471,470);
        wallwidthmedium wallwidthmedium2 = new wallwidthmedium();
        addObject(wallwidthmedium2,229,32);
        wallwidthmedium2.setLocation(287,357);
        wallwidthmedium wallwidthmedium3 = new wallwidthmedium();
        addObject(wallwidthmedium3,165,591);
        wallwidthmedium3.setLocation(198,585);
        wallwidthmedium wallwidthmedium4 = new wallwidthmedium();
        addObject(wallwidthmedium4,597,606);
        wallwidthmedium4.setLocation(569,584);
        wallwidthmedium wallwidthmedium5 = new wallwidthmedium();
        addObject(wallwidthmedium5,900,699);
        wallwidthmedium5.setLocation(853,707);
        wallheighttall wallheighttall = new wallheighttall();
        addObject(wallheighttall,931,328);
        wallheighttall.setLocation(929,228);
        wallheighttall.setLocation(942,178);
        wallheighttall wallheighttall2 = new wallheighttall();
        addObject(wallheighttall2,917,437);
        wallheighttall2.setLocation(943,537);
        /* wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(853,707);
        wallwidthmedium10.setLocation(850,710);*/
        wallheighttall wallheighttall3 = new wallheighttall();
        addObject(wallheighttall3,741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(741,674);
        wallheighttall3.setLocation(8,427);
        wallheightmedium wallheightmedium = new wallheightmedium();
        addObject(wallheightmedium,626,250);
        wallheightmedium.setLocation(662,219);
        wallheightmedium.setLocation(647,287);
        wallheightmedium wallheightmedium2 = new wallheightmedium();
        addObject(wallheightmedium2,857,523);
        wallheightmedium2.setLocation(839,546);
        wallheightmedium wallheightmedium3 = new wallheightmedium();
        addObject(wallheightmedium3,315,210);
        wallheightmedium3.setLocation(307,211);
        wallheightmedium wallheightmedium4 = new wallheightmedium();
        addObject(wallheightmedium4,5,52);
        wallheightmedium4.setLocation(7,77);
        wallheightmedium wallheightmedium5 = new wallheightmedium();
        addObject(wallheightmedium5,218,300);
        wallheightmedium5.setLocation(204,283);
        wallheightmedium wallheightmedium6 = new wallheightmedium();
        addObject(wallheightmedium6,119,434);
        wallheightmedium6.setLocation(111,399);
        wallheightmedium wallheightmedium7 = new wallheightmedium();
        addObject(wallheightmedium7,403,513);
        wallheightmedium7.setLocation(381,543);
        wallheightmedium wallheightmedium8 = new wallheightmedium();
        addObject(wallheightmedium8,739,194);
        wallheightmedium8.setLocation(752,209);
        wallheightmedium wallheightmedium9 = new wallheightmedium();
        addObject(wallheightmedium9,296,629);
        wallheightmedium9.setLocation(286,639);
        wallheightmedium wallheightmedium10 = new wallheightmedium();
        addObject(wallheightmedium10,575,628);
        wallheightmedium10.setLocation(563,656);
        wallwidthlong wallwidthlong3 = new wallwidthlong();
        addObject(wallwidthlong3,562,556);
        wallwidthlong3.setLocation(201,711);
        wallwidthlong wallwidthlong4 = new wallwidthlong();
        addObject(wallwidthlong4,299,73);
        wallwidthlong4.setLocation(380,7);
        wallwidthmedium wallwidthmedium11 = new wallwidthmedium();
        addObject(wallwidthmedium11,876,22);
        wallwidthmedium11.setLocation(851,6);
        wallwidthlong4.setLocation(385,7);
        wallwidthlong wallwidthlong5 = new wallwidthlong();
        addObject(wallwidthlong5,512,104);
        wallwidthlong5.setLocation(486,132);
        wallwidthsmall wallwidthsmall = new wallwidthsmall();
        addObject(wallwidthsmall,819,372);
        wallwidthsmall.setLocation(796,359);
        wallwidthsmall wallwidthsmall2 = new wallwidthsmall();
        addObject(wallwidthsmall2,900,244);
        wallwidthsmall2.setLocation(894,243);
        wallwidthsmall wallwidthsmall3 = new wallwidthsmall();
        addObject(wallwidthsmall3,623,344);
        wallwidthsmall3.setLocation(597,354);
        wallwidthsmall wallwidthsmall4 = new wallwidthsmall();
        addObject(wallwidthsmall4,695,580);
        wallwidthsmall4.setLocation(698,584);
        wallwidthsmall wallwidthsmall5 = new wallwidthsmall();
        addObject(wallwidthsmall5,705,715);
        wallwidthsmall5.setLocation(717,711);
        wallwidthsmall wallwidthsmall6 = new wallwidthsmall();
        addObject(wallwidthsmall6,631,238);
        wallwidthsmall6.setLocation(608,241);
        wallwidthmedium wallwidthmedium12 = new wallwidthmedium();
        addObject(wallwidthmedium12,117,239);
        wallwidthmedium12.setLocation(105,241);
        wallheighttall3.setLocation(7,416);
        wallheightmedium wallheightmedium11 = new wallheightmedium();
        addObject(wallheightmedium11,62,626);
        wallheightmedium11.setLocation(5,640);
        wallheightmedium wallheightmedium12 = new wallheightmedium();
        addObject(wallheightmedium12,519,285);
        wallheightmedium12.setLocation(475,323);
        wallheightsmall wallheightsmall = new wallheightsmall();
        addObject(wallheightsmall,842,317);
        wallheightsmall.setLocation(752,327);
        wallheightsmall wallheightsmall2 = new wallheightsmall();
        addObject(wallheightsmall2,814,644);
        wallheightsmall2.setLocation(838,665);
        wallheightsmall wallheightsmall3 = new wallheightsmall();
        addObject(wallheightsmall3,480,427);
        wallheightsmall3.setLocation(474,430);
        wallheightsmall wallheightsmall4 = new wallheightsmall();
        addObject(wallheightsmall4,334,330);
        wallheightsmall4.setLocation(307,317);
        wallwidthlong4.setLocation(480,129);
        wallheightmedium5.setLocation(202,287);
        wallwidthsmall5.setLocation(719,708);
        //wallwidthlong wallwidthlong5 = new wallwidthlong();
        addObject(wallwidthlong5,311,28);
        wallwidthlong5.setLocation(384,7);
        Food food = new Food();
        addObject(food,245,692);
        food.setLocation(243,686);
        Food food2 = new Food();
        addObject(food2,620,222);
        food2.setLocation(606,218);
        Food food3 = new Food();
        addObject(food3,619,338);
        Food food4 = new Food();
        addObject(food4,910,689);
        Food food5 = new Food();
        addObject(food5,242,343);
        food5.setLocation(239,334);
        Mouse mouse = new Mouse();
        addObject(mouse,54,208);
        mouse.setLocation(26,225);
        Food food6 = new Food();
        addObject(food6,915,226);
        food6.setLocation(914,226);

        mouse.setLocation(23,215);
        Finish finish = new Finish();
        addObject(finish,633,695);
        finish.setLocation(628,687);
        wallwidthmedium5.setLocation(859,711);
        wallwidthsmall5.setLocation(724,711);
        //wallwidthmedium6.setLocation(849,7);
        //wallwidthmedium6.setLocation(849,6);
    }
}
