package com.imudges.synchron;

import com.imudges.map.Map;
import com.imudges.map.MapTop;
import com.imudges.monster.Hero;

/**
 * 数据同步类
 * Created by killer on 2016/9/23.
 */
public class Synchron {
    private int width = 20;
    private int height = 15;

    public Hero initHero(){
        Hero hero = new Hero();
        hero.setPng("hero_1.png");
        return hero;
    }

    public int getMapWidth(){
        return width;
    }

    public int getMapHeight(){
        return height;
    }

    public Map initMap(){
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
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,710,999,999,999,999,999,999,702,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,710,999,999,999,999,999,999,702,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,702,999,999,999,999,999,999,710,999,999,999,999,999,999-" +
                "999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999-" +
                "1000,1000,1000,1000,1000,1000,1000,999,999,999,999,999,999,1000,1000,1000,1000,1000,1000,1000" ;

        //System.out.println(backgroundString);
        return new Map(id, width, height, pngWidth, name, backgroundString,thingsString);
    }

    public MapTop initMapTop(){
        int id = 0;
        int pngWidth = 8;
        String name = "map2.png";
        String top =
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
        return new MapTop(id, width, height, pngWidth, name, top);
    }
}