package cn.guosgbin.pattern.factory.method.demo;

/**
 * 台式机
 */
public class DesktopComputer extends Computer {

    public DesktopComputer(String memory, String mainboard, String cpu) {
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