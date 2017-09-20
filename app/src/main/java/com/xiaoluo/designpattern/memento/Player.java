package com.xiaoluo.designpattern.memento;

/**
 * author: xiaoluo
 * date: 2017/9/19 17:29
 */
public class Player {
    private int level;
    private int life;

    public Player() {
        level = 0;
        life = 100;
        System.out.println("初始人物,等级:" + level + ",生命:" + life);
    }

    public void play() {
        level++;
        life -= 10;
        System.out.println("玩了一下,等级:" + level + ",生命:" + life);
    }

    // 保存备忘录
    public Memento savaMemento() {
        Memento memento = new Memento();
        memento.playerLevel = level;
        memento.playerLife = life;
        System.out.println("存档");
        return memento;
    }

    // 恢复
    public void restore(Memento memento) {
        level = memento.playerLevel;
        life = memento.playerLife;
        System.out.println("恢复存档,等级:" + level + ",生命:" + life);
    }
}
