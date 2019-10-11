package labels;

import buttons.Butt;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import static java.awt.Color.GREEN;

public class Labl extends JLabel implements ActionListener {

    public Labl(){
        setBackground(Color.MAGENTA);
        setForeground(new Color(200,150,100));
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBounds(500-150,400+150,300,200);
        setText("Tu bedzie data: ");
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){

        Butt bPodajDate = (Butt) event.getSource();

        if(bPodajDate.getName().equals("bPodajDate")) {
            setText("Data: "+bPodajDate.getText()+"   "+(new Date()).toString());
        }
    }
}
