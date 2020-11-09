package com.yaliout.designpatterns.behavioralpatterns.command;

/**
 * @author Hu JunJie
 * @date 2020/11/9 19:33
 * @since
 */
public class FuckCommand implements Command {

    private GirlStore girlStore;
    
    public FuckCommand(GirlStore girlStore){
        this.girlStore = girlStore;
    }

    @Override
    public void execute() {
        girlStore.fuckGirl();
    }
}
