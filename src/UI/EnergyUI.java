package UI;

import javax.swing.*;
import java.awt.*;

import static java.lang.Math.pow;

public class EnergyUI {

    // ENERGY FORMULA'S FRAME
    JFrame myFrame = new JFrame("Energy");

    // KINETIC ENERGY FRAME
    JButton KineticEnergyButton = new JButton("Kinetic Energy");
    JFrame KineticEnergyFrame = new JFrame("Kinetic Energy");
    JButton calculateKineticEnergy = new JButton("Calculate");
    JTextField enterMassOfKineticEnergy = new JTextField("Enter Mass");
    JTextField enterVelocityOfKineticEnergy = new JTextField("Enter Velocity");

    public void mainUI() {
        myFrame.add(KineticEnergyButton);

        myFrame.setSize(950, 500);
        myFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // KINETIC ENERGY FRAME 2
        KineticEnergyButton.addActionListener(e -> {
            System.out.println("Calculate Kinetic Energy");
            JOptionPane.showMessageDialog(null, "Calculate Kinetic Energy");
            drawKineticEnergyUI();
        });

        // PARAMETER (ATTRIBUTES)
        // KINETIC ENERGY
        calculateKineticEnergy.addActionListener(e -> {
            try {
                double Mass = Double.parseDouble(enterMassOfKineticEnergy.getText());
                double Velocity = Double.parseDouble(enterVelocityOfKineticEnergy.getText());
                double KineticEnergy = (Mass * pow(Velocity, 2)) / 2;
                JOptionPane.showMessageDialog(null, " Kinetic Energy = " + KineticEnergy);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");

            }
        });
    }

    public void drawKineticEnergyUI() {
        KineticEnergyFrame = new JFrame("Kinetic Energy");
        KineticEnergyFrame.add(enterMassOfKineticEnergy);
        KineticEnergyFrame.add(enterVelocityOfKineticEnergy);
        KineticEnergyFrame.add(calculateKineticEnergy);
        KineticEnergyFrame.setLayout(new FlowLayout((FlowLayout.LEFT)));
        KineticEnergyFrame.setSize(900, 950);
        KineticEnergyFrame.setVisible(true);
    }

}
