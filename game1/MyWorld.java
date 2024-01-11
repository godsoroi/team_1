         import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Greenfoot.playSound("freeBGM.mp3");
        addObject( new jogi(), 290, 100 );
        addObject(new gu(),100,300);
        addObject(new tyoki(),270,300);
        addObject(new pa(),450,300);
        //コンストラクタで画像の初期配置
        
        //グーチョキパーのテキスト表示
   
        showText( "グー(G)", 100, 250 );
        showText("チョキ(C)",270,250);
        showText("パー(P)",450,250);
        showText( "キーを押してください", 100, 50 );
        
    
        
    }

}