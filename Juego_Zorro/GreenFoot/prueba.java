import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class prueba here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class prueba extends World
{

    /**
     * Constructor for objects of class prueba.
     *
     */
    public prueba()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Zorro zorro = new Zorro();
        addObject(zorro,50,200);
    }
}