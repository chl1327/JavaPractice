package JavaAdvanced.Unit29;

import javax.swing.*;

/**
 * Created by 心痕 on 2018-4-3.
 */
public class FlashingText extends JApplet implements Runnable {
    private JLabel jlblText = new JLabel("Welcome",JLabel.CENTER);

    public FlashingText(){
        add(jlblText);
        new Thread(this).start();
    }

    public void run(){
        try{
            while (true){
                if (jlblText.getText() == null){
                    jlblText.setText("Welcome");
                }else{
                    jlblText.setText(null);
                }
                Thread.sleep(200);
            }
        }catch (InterruptedException ex){

        }
    }
}
