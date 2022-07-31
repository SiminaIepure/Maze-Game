import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallheightsmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallheightsmall extends walls
{
    /**
     * Act - do whatever the wallheightsmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public wallheightsmall()
    {
        getImage().scale(getImage().getWidth()/2 , getImage().getHeight()*6);
        
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
