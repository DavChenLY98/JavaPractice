package com.henry.Nov30;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrameKeyListener extends JFrame implements KeyListener {
    JButton jbt=new JButton("按钮");
    public MyFrameKeyListener(){
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);

        this.addKeyListener(this);



        //显示整个界面
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下了某个键");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开了某个键");
    }
}
