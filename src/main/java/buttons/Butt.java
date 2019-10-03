package buttons;

import sun.font.FontFamily;
import windows.Wind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class Butt extends JButton implements ActionListener {



    public Butt(){

        setBackground(Color.CYAN);
        setForeground(Color.RED);
        setCursor(Cursor.getPredefinedCursor(1));
        setBounds(500-150,400-150,300,200);
        //addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Butt whichButton = (Butt) e.getSource();

        if(whichButton.getName().equals("bPodajDate")) {
            System.out.println(new Date());
        }
    }
}