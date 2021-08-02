package cn.guosgbin.pattern.factory.method.demo;

public abstract class Computer {
    protected String memory;
    protected String mainboard;
    protected String cpu;

    public Computer(String memory, String mainboard, String cpu) {
        this.memory = memory;
        this.mainboard = mainboard;
        this.cpu = cpu;
    }

    // 获取内存
    public abstract String getMemory();

    // 获取主板
    public abstract String getMainboard();

    // 获取CPU
    public abstract String getCPU();

    @Override
    public String toString() {
        return "内存 = " + this.getMemory() +
                ", 主板 = " + this.getMainboard() +
                ", CPU = " + this.getCPU();
    }
}