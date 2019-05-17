package com.main;

import java.io.IOException;

public class Ferramentas {

    public Ferramentas() throws IOException, InterruptedException {
    }

    public void limparTela() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public void pausar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
    }

    public void digitar(String text, int delay) throws IOException, InterruptedException {
        if (delay == 0) {
            delay = 15;
        }

        for (int i = 1; i <= text.length(); i++) {
            limparTela();
            System.out.println(text.substring(0, i));
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
