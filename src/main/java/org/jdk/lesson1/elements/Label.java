package org.jdk.lesson1.elements;
import org.jdk.lesson1.Colorica;
import org.jdk.lesson1.iFont;
import javax.swing.*;

public class Label extends JLabel implements Colorica,iFont{
    /**
     *
     * @param width длина
     * @param height высота
     * @param x позиция по оси Х
     * @param y позиция по оси Y
     */
    public void params(int width,int height,int x,int y){
        setFont(fontText);
        setBackground(colorText);
        setForeground(colorButton);
        setSize(width,height);
        setLocation(x,y);
    }
}
