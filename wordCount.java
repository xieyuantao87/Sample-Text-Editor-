/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavatexteditor;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Yuantao Xie
 */
public class wordCount {
    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label1, label2, label3;
    
    public wordCount(JTextArea textArea){
        
       
        String str=textArea.getText();
        int count=0, len=str.length(), numC=0; 
        for(int i=0; i<len; i++){
            if(str.charAt(i)!=' ' ){
                numC++;
                if (i==len-1 || str.charAt(i+1)!=' ')
                    count++;
            }
        }
        
        panel = new JPanel(new FlowLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        frame = new JFrame();
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        
        frame.setVisible(true);
        frame.setSize(500,300);
       
        
        
        frame.setTitle("Count of words" );

     
       
        label1 = new JLabel();
        label1.setText("Statistic");
        label1.setBorder(new EmptyBorder(25, 250, 25, 500));
        panel.add(label1);
        label2 = new JLabel();
        label2.setText("Count of words"+count);
        label2.setBorder(new EmptyBorder(30, 250, 25, 500));
        panel.add(label2);
        label3= new JLabel();
        label3.setText("Count of characters");
        label3.setBorder(new EmptyBorder(35, 250, 25, 500));
        panel.add(label3);
        frame.add(panel);
    }
}
