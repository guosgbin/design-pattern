package cn.guosgbin.principle.LoD.before;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author: Dylan kwok GSGB
 * @date: 2023/2/12 17:59
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.getWorkProcess(teamLeader);
    }
}

class Staff {
    private Random random = new Random();
    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public void reportWorkProcess() {
        System.out.println(name + " ---> 目前我的进度是： " + random.nextInt(11));
    }
}

class TeamLeader {
    public void reportWorkProcess(List<Staff> staffList) {
        for (Staff staff : staffList) {
            staff.reportWorkProcess();
        }
    }
}

class Boss {
    public void getWorkProcess(TeamLeader teamLeader) {
        List<Staff> staffList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            staffList.add(new Staff("员工[" + i + "]"));
        }
        teamLeader.reportWorkProcess(staffList);
    }
}
