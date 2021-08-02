package cn.guosgbin.pattern.factory.method.demo;

/**
 * 笔记本电脑
 */
public class Laptop extends Computer {
    public Laptop(String memory, String mainboard, String cpu) {
        super(memory, mainboard, cpu);
    }

    @Override
    public String getMemory() {
        return memory;
    }

    @Override
    public String getMainboard() {
        return mainboard;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}