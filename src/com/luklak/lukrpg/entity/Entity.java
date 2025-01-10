package com.luklak.lukrpg.entity;

public class Entity
{
    private String name;
    private int level;
    private Rank rank;
    private int str;
    private int vit;
    private int _int;
    private int dex;
    private int luk;

    enum Rank
    {
        NORMAL,
        ELITE,
        BOSS
    }

    public Entity(String name, int level, Rank rank)
    {
        this.name = name;
        this.level = level;
        this.rank = rank;
    }

    public Entity(String name, int level, Rank rank, int str, int vit, int _int, int dex, int luk)
    {
        this.name = name;
        this.level = level;
        this.rank = rank;
        this.str = str;
        this.vit = vit;
        this._int = _int;
        this.dex = dex;
        this.luk = luk;
    }

    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public Rank getRank()
    {
        return rank;
    }

    public int getStr()
    {
        return str;
    }

    public int getVit()
    {
        return vit;
    }

    public int get_int()
    {
        return _int;
    }

    public int getDex()
    {
        return dex;
    }

    public int getLuk()
    {
        return luk;
    }
}
