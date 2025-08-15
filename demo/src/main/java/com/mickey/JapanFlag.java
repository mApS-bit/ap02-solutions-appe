package com.mickey;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.Color;

public class JapanFlag extends Canvas{

    public static void main(String[] args){
        JFrame frame = new JFrame("Japan Flag");
        Canvas canvas = new JapanFlag();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        Rectangle bb = new Rectangle(100,100,
        200,150);

        japonFlag(g, bb);
    }

    public void boxRectangle(Graphics g, Rectangle bb){
        g.fillRect(bb.x, bb.y, bb.width, bb.height);
        g.setColor(Color.white);
        g.fillRect(bb.x, bb.y, bb.width, bb.height);
    }

    public void boxOval(Graphics g, Rectangle bb){
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
        g.setColor(Color.red);
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

    public void japonFlag(Graphics g, Rectangle bb){

        boxRectangle(g, bb);

        int size = bb.height/2;
        int dx = bb.width/4 + 50/4;
        int dy = bb.height/4;
        
        Rectangle shieldBox = new Rectangle(bb.x,bb.y,
        size, size);

        shieldBox.translate(dx, dy);
        boxOval(g, shieldBox);

    }
}