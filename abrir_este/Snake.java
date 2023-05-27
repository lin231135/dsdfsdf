import greenfoot.*;  


public class Snake extends Animal
{
    public void act()
    {
        move(4);
        randomTurn();
        turnAtEdge();
        tryToEatTurtle();
        
        if (atWorldEdge())
        {
            turn(7);
        }
        
    }
    
    public void randomTurn()
    {
     if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }   
    }
    
    public void turnAtEdge()
    {
        if (atWorldEdge())
        {
            turn(7);
        }
    }
    
    void tryToEatTurtle()
    {
        if (canSee(Turtle.class))
        {
            eat(Turtle.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
}
