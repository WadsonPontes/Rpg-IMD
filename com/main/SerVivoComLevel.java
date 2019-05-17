package com.main;

public class SerVivoComLevel extends SerVivo {

    public int level;

    public int obterExperienciaMaxima() {

        if (this.level >= 100) {
            return 999999999;
        }

        return (int) Math.round(Math.floor(Math.pow(this.level + 4, 4.017) + 267) / ((this.level + 4) * 6));
    }
}
