import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(600, 480, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter, 545, 21);
        
        Turtle turtle = new Turtle(counter);
        addObject(turtle,384,176);
       
        lettuce lettuce = new lettuce();
        addObject(lettuce,84,47);
        lettuce lettuce2 = new lettuce();
        addObject(lettuce2,91,136);
        lettuce lettuce3 = new lettuce();
        addObject(lettuce3,327,198);
        lettuce lettuce4 = new lettuce();
        addObject(lettuce4,239,101);
        lettuce lettuce5 = new lettuce();
        addObject(lettuce5,366,86);
        lettuce lettuce6 = new lettuce();
        addObject(lettuce6,513,122);
        lettuce lettuce7 = new lettuce();
        addObject(lettuce7,464,276);
        lettuce lettuce8 = new lettuce();
        addObject(lettuce8,420,442);
        lettuce lettuce9 = new lettuce();
        addObject(lettuce9,82,416);
        lettuce lettuce10 = new lettuce();
        addObject(lettuce10,90,302);
        lettuce lettuce11 = new lettuce();
        addObject(lettuce11,247,286);
        lettuce lettuce12 = new lettuce();
        addObject(lettuce12,193,219);
        lettuce lettuce13 = new lettuce();
        addObject(lettuce13,63,183);
        lettuce lettuce14 = new lettuce();
        addObject(lettuce14,398,15);
        lettuce lettuce15 = new lettuce();
        addObject(lettuce15,154,19);
        lettuce lettuce16 = new lettuce();
        addObject(lettuce16,550,70);
        lettuce lettuce17 = new lettuce();
        addObject(lettuce17,537,307);
        lettuce lettuce18 = new lettuce();
        addObject(lettuce18,543,431);
        lettuce lettuce19 = new lettuce();
        addObject(lettuce19,412,347);
        lettuce lettuce20 = new lettuce();
        addObject(lettuce20,275,421);
        lettuce lettuce21 = new lettuce();
        addObject(lettuce21,177,454);
        lettuce lettuce22 = new lettuce();
        addObject(lettuce22,248,361);
        lettuce lettuce23 = new lettuce();
        addObject(lettuce23,254,150);
        lettuce lettuce24 = new lettuce();
        addObject(lettuce24,291,51);
        Snake snake = new Snake();
        addObject(snake,434,164);
        Snake snake2 = new Snake();
        addObject(snake2,234,254);
        Snake snake3 = new Snake();
        addObject(snake3,296,27);
        
        Bug bug = new Bug();
        addObject(bug,547,207);
        Bug bug2 = new Bug();
        addObject(bug2,288,279);
    }
}