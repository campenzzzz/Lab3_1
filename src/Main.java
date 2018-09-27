import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input Number 1 piece", "0");
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.INFORMATION_MESSAGE);
     int ans =    JOptionPane.showConfirmDialog(null, "Do u love me?", "Ask u", JOptionPane.YES_NO_CANCEL_OPTION);
    if(ans==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null,"Love u jubjub");
    }
        else{
            JOptionPane.showMessageDialog(null,"Remember now!");
    }
    }

}

