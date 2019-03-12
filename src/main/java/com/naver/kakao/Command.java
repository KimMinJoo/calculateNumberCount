package com.naver.kakao;

import java.util.List;

public class Command {
    private int elevator_id;
    private String command;
    private List<Integer> call_ids;

    public int getElevator_id() {
        return elevator_id;
    }

    public void setElevator_id(int elevator_id) {
        this.elevator_id = elevator_id;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<Integer> getCall_ids() {
        return call_ids;
    }

    public void setCall_ids(List<Integer> call_ids) {
        this.call_ids = call_ids;
    }
}
