/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceraid;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 801621
 */
public class AlienCraft extends Threat{
    private static final int WIDTH = 20;
    private static final int HEIGHT = 20;
    private static final Color color = Color.GREEN;
    private static final int SPEED = 1;
    private static int X = 800;
    
    public AlienCraft(int y) {
        super(SPEED, X, y, WIDTH, HEIGHT, color);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
    
}
