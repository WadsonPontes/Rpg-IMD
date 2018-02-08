package com.main;

public class SerVivoComLevel extends SerVivo{
  public double level;

  public double obterExperienciaMaxima(){
    
    if (level == 100) return 0;
    
    switch(classeNumero){
      case 1: return Math.round(Math.floor(Math.pow(level + 4, 4.017) + 267) / ((level + 4) * 6) ); break;
      case 2: return Math.round(Math.floor(Math.pow(level + 4, 4.017) + 270) / ((level + 4) * 6.1) ); break;
      case 3: return Math.round(Math.floor(Math.pow(level + 4, 4.017) + 270)/ ((level + 4) * 6.2) ); break;
      default: return Math.round(Math.floor(Math.pow(level + 4, 4.017) + 600)/ ((level + 4) * 9) ); break;
    }
  }
}
