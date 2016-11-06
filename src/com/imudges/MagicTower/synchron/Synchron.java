package com.imudges.MagicTower.synchron;

import com.imudges.MagicTower.things.map.MapAll;
import com.imudges.MagicTower.things.monster.Hero;

/**
 * 数据同步类
 * Created by killer on 2016/9/23.
 */
public class Synchron {
    private int width = 20;
    private int height = 15;

    public Hero initHero(){
        Hero hero = new Hero(true);
        hero.setPng("hero_1.png");
        return hero;
    }

    public int getMapWidth(){
        return width;
    }

    public int getMapHeight(){
        return height;
    }

    public MapAll initMap(){
        int id = 0;
        int pngWidth = 8;
        String name = "map2.png";
        String backgroundString =
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20-" +
                "28,28,28,28,28,28,28,20,20,20,20,20,20,28,28,28,28,28,28,28";
        String thingsString =
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,702,999,999,999,999,999,999,702,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,870,871,999,999,999-" +
                "999,999,999,999,999,999,710,999,999,999,999,999,999,702,999,878,879,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,788,789,999,999,710,999,999,999,999,999,999,702,999,999,999,999,999,999-" +
                "999,999,796,797,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,702,999,999,999,999,999,999,710,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "1000,1000,1000,1000,1000,1000,1000,999,999,999,999,999,999,1000,1000,1000,1000,1000,1000,1000" ;
        String fontgroundString =
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,694,999,999,999,999,999,999,694,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,694,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,694,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,694,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "1000,1000,1000,1000,1000,1000,1000,999,999,999,999,999,999,1000,1000,1000,1000,1000,1000,1000" ;



        return new MapAll(id,width,height,pngWidth,name,backgroundString,thingsString,fontgroundString);
    }
}
