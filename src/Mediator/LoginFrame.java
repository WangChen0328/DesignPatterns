package Mediator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wangchen
 * @date 2018/5/23 14:42
 */
public class LoginFrame implements Mediator, ActionListener {

    ColleagueButton button;

    ColleagueTextField textField;

    @Override
    public void createColleagues() {
        button = new ColleagueButton();
        textField = new ColleagueTextField();

        button.setMediator(this);
        textField.setMediator(this);

        button.addActionListener(this);
        textField.addTextListener(textField);
    }

    @Override
    public void colleagueChanged() {
        /**
         * 所有组员任意变化都通知此方法
         * 该方法统筹，所有业务变化
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
