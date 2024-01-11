import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tyoki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tyoki extends Actor
{
    /**
     * Act - do whatever the tyoki wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 80, 80 );
    }    
    public tyoki()
{
    getImage().scale( 100, 100 );
}
}
