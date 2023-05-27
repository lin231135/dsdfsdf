import greenfoot.*; 

public class Turtle extends Animal
{
    private Counter counter;
    
    public Turtle(Counter pointCounter)
    {
        counter = pointCounter;
    }
    
    public void act()
    {
        move(4);
        checkKeys();
        tryToEatLettuce();
        
        if (atWorldEdge())
        {
            turn(7);
        }
        
    }
    
 
    
    public void checkKeys()
    {
        if ( Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    }
    
    public void tryToEatLettuce()
    {
        if (canSee(lettuce.class))
        {
            eat(lettuce.class);
            counter.add(5);
            Greenfoot.playSound("slurp.wav");
        }
        if (canSee(Bug.class))
        {
            eat(Bug.class);
            counter.add(20);
            Greenfoot.playSound("slurp.wav");
            createNewBug();
        }
        if (counter.getValue() >= 100)
        {
            gameOver();
        }
    }
    
    private void createNewBug()
    {
        Bug newBug;
        newBug = new Bug();
        
        World world;
        world = getWorld();
        
        int worldWidth = world.getWidth();
        int worldHeight = world.getHeight();
       
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(480);
        
        world.addObject(newBug, x, y);
    }
    public void gameOver()
    {
        Greenfoot.playSound("slurp.wav");
        Greenfoot.stop();
    }
}
