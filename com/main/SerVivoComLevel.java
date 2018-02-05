package com.main;

public class SerVivoComLevel extends SerVivo{
  public double level;

  public double obterExperienciaMaxima(){
    return Math.round(Math.floor(Math.pow(level, 2) * 25));
  }
}
