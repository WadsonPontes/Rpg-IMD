package com.main;

public class SerVivoComLevel extends SerVivo{
  public double level;

  public double obterExperienciaMaxima(){

    if (this.level >= 100){
      return  999999999;
    }

    return Math.round(Math.floor(Math.pow(this.level + 4, 4.017) + 267) / ((this.level + 4) * 6) );
  }
}
