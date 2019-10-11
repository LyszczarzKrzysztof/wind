package windows;

import buttons.Butt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Wind extends JFrame implements ActionListener{


    public Wind(){
        setLayout(null);  // jak sie tego nie da to wypelnia cale okno np.: przyciskiem
        setVisible(true);
        setSize(1000,900);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Butt whichButton = (Butt) e.getSource();

        if(whichButton.getName().equals("bWyjscie")) {
            dispose();
        }
    }
}
