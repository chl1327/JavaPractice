package JavaAdvanced.OtherUnit;

import JavaAdvanced.OtherUnit.vo.CircleModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by chl1327 on 2018/6/24.
 */
public class MVCDemo extends JApplet {
    private JButton jbtController = new JButton("Show Controller");
    private JButton jbtView = new JButton("Show View");
    private CircleModel model = new CircleModel();

    public MVCDemo(){
        setLayout(new FlowLayout());
        add(jbtController);
        add(jbtView);
        jbtController.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Controller");
                CircleController controller = new CircleController();
                controller.setModel(model);
                frame.add(controller);
                frame.setSize(200,200);
                frame.setLocation(200,200);
                frame.setVisible(true);
            }
        });
        jbtView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("View");
                CircleView view = new CircleView();
                view.setModel(model);
                frame.add(view);
                frame.setSize(500,200);
                frame.setLocation(200,200);
                frame.setVisible(true);
            }
        });
    }
}
