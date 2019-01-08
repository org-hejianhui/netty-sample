package com.nuih.netty.snake_game;

/**
 * 单条指令
 * Created by hejianhui on 2018/11/24
 */
public class DrawingCommand {
    private String cmd;
    private String cmdData;

    public DrawingCommand(String cmd, String cmdData) {
        this.cmd = cmd;
        this.cmdData = cmdData;
    }

    public DrawingCommand() {
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getCmdData() {
        return cmdData;
    }

    public void setCmdData(String cmdData) {
        this.cmdData = cmdData;
    }
}
