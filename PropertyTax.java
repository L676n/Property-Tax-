


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PropertyTax extends JFrame {
    
    final int WINDOW_WIDTH = 310; 
    final int WINDOW_HEIGHT = 160;
    private JButton calcButton;
    private JTextField TaxTextField;
    private JPanel panel; 
    private JLabel messageLabel;
    
    public PropertyTax(){
        
    setTitle("Property Taxes");
    
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        buildPanel();
        
        add(panel);

        setLocationRelativeTo(null);

        setVisible(true);
    }
    
    
    private void buildPanel(){
        
        panel = new JPanel();
        
        messageLabel = new JLabel("Enter the actual property value: ");
    
        TaxTextField = new JTextField(10);
    
        calcButton = new JButton("Calculate property tax");
        
        calcButton.addActionListener(new CountButtonListener());
        
        panel.add(messageLabel);
        panel.add(TaxTextField);
        panel.add(calcButton);
    }
   
    private class CountButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
    
    double property_tax;
    double assessment;
    String Actual_Value;
    
    
    Actual_Value = TaxTextField.getText();
    
    assessment = (60 * Double.parseDouble(Actual_Value)) / 100 ;
    
    property_tax = (0.64 * assessment) / 100;
    
    JOptionPane.showMessageDialog(null, "Assessment value: $" + assessment  
        +  "\n Property tax: $" + property_tax );
        }
    }


    public static void main(String[] args){

    PropertyTax PT = new PropertyTax();

    }

}
    

