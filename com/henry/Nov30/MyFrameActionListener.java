package com.henry.Nov30;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyFrameActionListener extends JFrame implements ActionListener {

    //创建一个按钮对象
    JButton jtb1  = new JButton("点我啊");

    //再创建一个按钮对象
    JButton jtb2  = new JButton("再点我啊");
    public MyFrameActionListener(){
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
        jtb1.setBounds(0,0,100,50);
        //添加监听对象
        jtb1.addActionListener(this);


        //设置位置和宽高
        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        //添加按钮到整个界面中
        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        //显示整个界面
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==jtb1){
            jtb1.setSize(200,100);
        }else if(source==jtb2){
            Random r=new Random();
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }


}
