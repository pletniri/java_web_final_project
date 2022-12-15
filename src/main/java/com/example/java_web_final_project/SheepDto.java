package com.example.java_web_final_project;

public class SheepDto
{

    private String name;

    private String color;

   public SheepDto( String name, String color )
    {
        this.name = name;
        this.color = color;

    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }


}