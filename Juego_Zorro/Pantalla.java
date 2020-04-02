import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Pantalla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pantalla extends World
{
    private GreenfootImage pantallaFondo=new GreenfootImage(600, 400);
    private GreenfootImage pantallaBienvenida1=new GreenfootImage("PantallaBienvenida1.png");
    private GreenfootImage pantallaBienvenida2=new GreenfootImage("PantallaBienvenida2.png");
    private GreenfootImage pantallaMenu=new GreenfootImage("Menu.png");
    private GreenfootImage pantallaJuego=new GreenfootImage("Juego.png");
    
    /**
     * Constructor for objects of class Pantalla.
     * 
     */
    public Pantalla()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(pantallaFondo);
        Bienvenida();
    }
    
    public void Bienvenida(){
        pantallaFondo.drawImage(pantallaBienvenida1,0,0);
        try{ Thread.sleep(5000); }
            catch (InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        pantallaFondo.drawImage(pantallaBienvenida2,100,100);
        if(Greenfoot.isKeyDown("a")){
            pantallaFondo.drawImage(pantallaMenu,200,200);
        }
    }
    
}

