import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @getOneIntersectingObject(Food.class)author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{  int speed=3;
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mouse()
    {
        getImage().scale(getImage().getWidth() / 2, getImage().getHeight() / 2);
    }
        
    public void act() 
    {
      moveAround();
      hitFood();
      youLose();
      youWin();
    }    
    
    public void moveAround()
    {
       if (Greenfoot.isKeyDown("right"))
       {
         setLocation(getX() + speed, getY());
         if (hitWall()==true)
         {
             setLocation(getX()- speed, getY());
         }
       }
        if (Greenfoot.isKeyDown("left"))
       {
          setLocation(getX() - speed, getY());
          if (hitWall()==true)
         {
             setLocation(getX() + speed , getY());
         }
       }
        if (Greenfoot.isKeyDown("up"))
       {
          setLocation(getX(), getY() - speed );
          if (hitWall()==true)
         {
             setLocation(getX(), getY() + speed);
         }
       }
        if (Greenfoot.isKeyDown("down"))
       {
          setLocation(getX(), getY() + speed);
          if (hitWall()==true)
         {
             setLocation(getX(), getY() - speed );
         }
       }
    }
    
    public boolean hitWall()
    {
        if (isTouching(walls.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void hitFood()
    {
        if(getOneIntersectingObject(Food.class)!=null)
        {
            getWorld().removeObject(getOneIntersectingObject(Food.class));
            speed++;
        }
    }
     public boolean hitEnemy()
     {
        if (isTouching(Enemy.class))
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
     
     public void youLose()
     {
         if (hitEnemy())
         {
            getWorld().addObject(new YouLose(), 480, 320);
            Greenfoot.stop();
            
         }
         
     } 
      public boolean hitFinish()
     {
        if (isTouching(Finish.class))
        {
            return true;
        }
        else 
        {
            return false;
        }
     }
     public void youWin()
     {
         if (hitFinish())
         {
            getWorld().addObject(new YouWin(), 480, 320);
            Greenfoot.stop();
            
         }
     }
        
    
        
}
