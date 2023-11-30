package com.henry.Nov30;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrameMouseListener extends JFrame implements MouseListener {

    JButton jbt=new JButton("按钮");
    public MyFrameMouseListener(){
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


        //设置位置和宽高
        jbt.setBounds(0,0,100,50);
        //添加监听对象
        jbt.addMouseListener(this);


        //添加按钮到整个界面中
        this.getContentPane().add(jbt);


        //显示整个界面
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("移入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("移出");
    }
}
