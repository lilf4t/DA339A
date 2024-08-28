package view;

import javax.swing.*;
import java.awt.*;

public class ButtonType extends JButton {
    public ButtonType(int width, int height ){
        super();
        this.setEnabled(true);
        this.setSize(width, height);
    }

    public void hitButtonType(ButtonEnum buttonenum){
        switch (buttonenum) {
            case hit:
                setBackground(Color.green);
                break;

            case miss:
                setBackground(Color.red);
                break;
        }
    }
}

