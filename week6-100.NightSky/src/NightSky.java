/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cathal
 */
import java.util.Random;

public class NightSky {

    private final double density;
    private final int width;
    private final int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrint = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;

    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrint = 0;

    }

    public void printLine() {
        Random random = new Random();
        String line = "";
        for (int i = 0; i < width; i++) {
            if (random.nextDouble() < density) {
                line += "*";
                starsInLastPrint += 1;
            } else {
                line += " ";
            }
        }
        System.out.println(line);
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            this.printLine();
        }
    }

    public int starsInLastPrint() {
        int previous = starsInLastPrint;
        starsInLastPrint = 0;
        return previous;
    }
}
