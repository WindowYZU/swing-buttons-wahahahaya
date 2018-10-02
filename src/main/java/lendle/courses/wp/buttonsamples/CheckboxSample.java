/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class CheckboxSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        JCheckBox check1 = new JCheckBox("check1");
        
        JCheckBox check2 = new JCheckBox("check2");
        
        //1. 在 frame 裡面 add check1 check2
        //2. 在 check1 check2 加入 ActionActionListener
        //3. 裡面執行JOptionPane.showMessageDialog(null, "check1=" + check1.isSelected() + ",check2=" + check2.isSelected());
        frame.add(check1);
        frame.add(check2);
        
        ActionListener listerner = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = "check1 = "+check1.isSelected()+'\n'+"check2 = "+check2.isSelected();
                JOptionPane.showMessageDialog(null, str);
            }
        };
        
        check1.addActionListener(listerner);
        check2.addActionListener(listerner);
        ////////////////////////////////////////
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
