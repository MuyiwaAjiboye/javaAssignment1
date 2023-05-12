package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;


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


    //POTENTIAL ENERGY FRAME

    JButton PotentialEnergyButton = new JButton("Potential Energy");
    JFrame PotentialEnergyFrame = new JFrame("Potential Energy");
    JButton calculatePotentialEnergy = new JButton("Calculate");
    JTextField enterMassOfPotentialEnergy = new JTextField("Enter Mass");
    JTextField enterHeightOfPotentialEnergy = new JTextField("Enter Height");
    
    // ELECTRICAL ENERGY FRAME
    
    JButton ElectricalEnergyButton = new JButton("Electrical Energy");
    JFrame ElectricalEnergyFrame = new JFrame("Electrical Energy");
    JButton calculateElectricalEnergy = new JButton("Calculate");
    JTextField enterPDifferenceOfElectricalEnergy = new JTextField("Enter Potential Diff...");
    JTextField enterCurrentOfElectricalEnergy = new JTextField("Enter Current");
    JTextField enterTimeOfElectricalEnergy = new JTextField("Enter Time");

    // MOMENTUM FRAME
    JButton MomentumButton = new JButton("Momentum");
    JFrame MomentumFrame = new JFrame("Momentum");
    JButton calculateMomentum = new JButton("Calculate");
    JTextField enterMassOfMomentum = new JTextField("Enter Mass");
    JTextField enterVelocityOfMomentum = new JTextField("Enter Velocity");

    public void mainUI() {
        myFrame.add(KineticEnergyButton);
        myFrame.add(PotentialEnergyButton);
        myFrame.add(ElectricalEnergyButton);
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
        // POTENTIAL ENERGY FRAME 2
        PotentialEnergyButton.addActionListener(e -> {
            System.out.println("Calculate Potential Energy");
            JOptionPane.showMessageDialog(null, "Calculate Potential Energy");
            drawPotentialEnergyUI();
        });
        
        // ELECTRICAL ENERGY FRAME 2
        ElectricalEnergyButton.addActionListener(e -> {
            System.out.println("Calculate Electrical Energy");
            JOptionPane.showMessageDialog(null, "Calculate Electrical Energy");
            drawElectricaEnergyUI();
        });

        // MOMENTUM FRAME 2
        MomentumButton.addActionListener(e -> {
            System.out.println("Calculate Momentum");
            JOptionPane.showMessageDialog(null, "Calculate Momentum");
            drawMomentumUI();
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
        // POTENTIAL ENERGY

        calculatePotentialEnergy.addActionListener(e -> {
            try {
                double Mass = Double.parseDouble(enterMassOfPotentialEnergy.getText());
                double Height = Double.parseDouble(enterHeightOfPotentialEnergy.getText());
                double PotentialEnergy = Mass * Physics.getGravity() * Height;
                JOptionPane.showMessageDialog(null, " Potential Energy = " + PotentialEnergy);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");

            }
        });
        
        //   ELECTRICAL ENERGY
        calculateElectricalEnergy.addActionListener(e -> {
            try {
                double PDiffence = Double.parseDouble(enterPDifferenceOfElectricalEnergy.getText());
                double Current = Double.parseDouble(enterCurrentOfElectricalEnergy.getText());
                double Time = Double.parseDouble(enterTimeOfElectricalEnergy.getText());
                double ElectricalEnergy = PDiffence * Current * Time;
                JOptionPane.showMessageDialog(null, " Electrical Energy = " + ElectricalEnergy);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Pls Input a Valid Number");

            }
        });

        //   MOMENTUM
        calculateMomentum.addActionListener(e -> {
            try {
                double Mass = Double.parseDouble(enterMassOfMomentum.getText());
                double Velocity = Double.parseDouble(enterVelocityOfMomentum.getText());
                double Momentum = Mass * Velocity;
                JOptionPane.showMessageDialog(null, " Momentum = " + Momentum);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Input a Valid Number");

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

    public void drawPotentialEnergyUI() {
        PotentialEnergyFrame = new JFrame("Potential Energy");
        PotentialEnergyFrame.add(enterMassOfPotentialEnergy);
        PotentialEnergyFrame.add(enterHeightOfPotentialEnergy);
        PotentialEnergyFrame.add(calculatePotentialEnergy);
        PotentialEnergyFrame.setLayout(new FlowLayout((FlowLayout.LEFT)));
        PotentialEnergyFrame.setSize(900, 950);
        PotentialEnergyFrame.setVisible(true);


    }
    public void drawElectricaEnergyUI() {
        ElectricalEnergyFrame = new JFrame("Force");
        ElectricalEnergyFrame.add(enterPDifferenceOfElectricalEnergy);
        ElectricalEnergyFrame.add(enterCurrentOfElectricalEnergy);
        ElectricalEnergyFrame.add(enterTimeOfElectricalEnergy);
        ElectricalEnergyFrame.add(calculateElectricalEnergy);
        ElectricalEnergyFrame.setLayout(new FlowLayout((FlowLayout.LEFT)));
        ElectricalEnergyFrame.setSize(900, 950);
        ElectricalEnergyFrame.setVisible(true);
    }

    public void drawMomentumUI() {
        MomentumFrame = new JFrame("Momentum");
        MomentumFrame.add(enterMassOfMomentum);
        MomentumFrame.add(enterVelocityOfMomentum);
        MomentumFrame.add(calculateMomentum);
        MomentumFrame.setLayout(new FlowLayout((FlowLayout.LEFT)));
        MomentumFrame.setSize(600, 650);
        MomentumFrame.setVisible(true);
    }
}
