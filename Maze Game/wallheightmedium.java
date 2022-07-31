import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallheightmedium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallheightmedium extends walls
{
    /**
     * Act - do whatever the wallheightmedium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public wallheightmedium()
    {
        getImage().scale(getImage().getWidth()/2 , getImage().getHeight()*10);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
