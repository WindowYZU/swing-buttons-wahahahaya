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
public class ButtonSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        //1. 建立 button，text 設定為 Find
        //2. 建立 icon
        //3. 設定 icon
        JButton button=new JButton("FIND");
        button.setMnemonic('F');
        ImageIcon icon=new ImageIcon(new URL("https://cdn3.iconfinder.com/data/icons/basic-interface/100/dowload-512.png"));
        ImageIcon icon2=new ImageIcon(icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        button.setIcon(icon2);
        ////////////////////////////////////
        frame.add(button);
        frame.getRootPane().setDefaultButton(button);
        
        frame.setVisible(true);
    }
    
}
