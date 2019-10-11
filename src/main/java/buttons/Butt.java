package buttons;

import sun.font.FontFamily;
import windows.Wind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class Butt extends JButton {



    public Butt(){


        setBackground(Color.CYAN);
        setForeground(Color.RED);
        setCursor(Cursor.getPredefinedCursor(12));
        setBounds(500-150,400-250,300,200);
        //addActionListener(this);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        Butt whichButton = (Butt) e.getSource();
//
//        if(whichButton.getName().equals("bPodajDate")) {
//            System.out.println(new Date());
//        }
//    }


}