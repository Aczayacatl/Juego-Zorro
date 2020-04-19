import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zorro extends Actor
{
    private String[] framesWalkDer = {"ZorroWalk/zorroStillR.png","ZorroWalk/zorro1R.png","ZorroWalk/zorro2R.png","ZorroWalk/zorro3R.png","ZorroWalk/zorro4R.png","ZorroWalk/zorro5R.png"};
    private String[] framesWalkIzq = {"ZorroWalk/zorroStillL.png","ZorroWalk/zorro1L.png","ZorroWalk/zorro2L.png","ZorroWalk/zorro3L.png","ZorroWalk/zorro4L.png","ZorroWalk/zorro5L.png"};
    private int xDirection=1;   //Variable usada para indicar la direccios de los frames
    private int velocity = 9;
    private String key;

    private int frameStill;
    private int contadorFrames;
    public Zorro(){
        contadorFrames=0;
        frameStill = 1;
    }
    public void act() 
    {
        // Add your action code here.
        /*Animation control*/
        //facing = 0;

        /*int x = getX(); //funciona tambien con: this.getX o super.getX()
        int y = getY();
        setLocation(x + velocity * xDirection,y);
        if(isAtEdge()){
            xDirection *= -1;
            setRotation(360);
        }*/
        control();
        if(xDirection==1)animacion(framesWalkDer);
        else animacion(framesWalkIzq);
    }
    
    public void animacion(String[] frames){
        if(frameStill == 0){
            if(contadorFrames>=frames.length){
                 contadorFrames=1;
            }
            setImage(frames[contadorFrames]);
            contadorFrames++;
        }
        if(frameStill == 1){setImage(frames[0]);}
    }
    
    public void control(){
        key = Greenfoot.getKey();
        int x = getX();
        int y = getY();
        /*--- Controles de Direccion ---*/
        if(Greenfoot.isKeyDown("A")){
            xDirection = -1;
            x = x + velocity * -1;
        }
        if(Greenfoot.isKeyDown("D")){
            xDirection = 1;
            x = x + velocity;
        }
        if(Greenfoot.isKeyDown("W")){
            y = y + velocity * -1;
        }
        if(Greenfoot.isKeyDown("S")){
            y = y + velocity;
        }
        /*--- Controles de frameStill ---*/
        if(key==null && (Greenfoot.isKeyDown("A")||Greenfoot.isKeyDown("D")||Greenfoot.isKeyDown("W")||Greenfoot.isKeyDown("S"))){
            frameStill=0;
        }
        else{frameStill=1;}
        setLocation(x,y);
    }
}
