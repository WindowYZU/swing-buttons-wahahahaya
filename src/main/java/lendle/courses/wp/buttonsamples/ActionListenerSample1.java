/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class ActionListenerSample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JButton button=new JButton("click");
        //利用 addActionListener 將 SampleActionListener 設定給 button
        SampleActionListener l = new SampleActionListener();
        button.addActionListener(l);
        //////////////////////////////////////////////////////
        frame.add(button);
        
        frame.setVisible(true);
    }
    
}
