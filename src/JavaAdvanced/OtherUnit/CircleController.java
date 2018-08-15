package JavaAdvanced.OtherUnit;

import JavaAdvanced.OtherUnit.vo.CircleModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class CircleController extends JPanel {
    private CircleModel model;
    private JTextField jtfRadius = new JTextField();
    private JComboBox jcboFilled = new JComboBox(new Boolean[]{
            new Boolean(false),new Boolean(true)
    });
    public CircleController(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2,1));
        panel1.add(new JLabel("Radius"));
        panel1.add(new JLabel("Filled"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,1));
        panel2.add(jtfRadius);
        panel2.add(jcboFilled);

        setLayout(new BorderLayout());
        add(panel1,BorderLayout.WEST);
        add(panel2,BorderLayout.CENTER);

        jtfRadius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model == null)return;
                model.setRadius(new Double(jtfRadius.getText()).doubleValue());
            }
        });
        jcboFilled.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (model == null) return;
                model.setFilled(((Boolean)jcboFilled.getSelectedItem()).booleanValue());
            }
        });
    }
    public void setModel(CircleModel newModel){
        model = newModel;
    }
    public CircleModel getModel(){
        return model;
    }
}
