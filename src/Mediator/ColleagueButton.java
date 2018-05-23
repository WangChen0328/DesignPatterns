package Mediator;

import java.awt.*;

/**
 * @author wangchen
 * @date 2018/5/23 14:39
 */
public class ColleagueButton extends Button implements Colleague {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
