package cn.guosgbin.pattern.builder.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: Dylan kwok GSGB
 * @date: 2021/8/8 21:27
 * <p>
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志——苏轼
 */
@Data
@AllArgsConstructor
public class Computer {
    private String mainboard;
    private String cpu;
    private String gpu;
    private String memory;
    private String power;
    private String computerCase;
    private String disk;

    public Computer(ComputerBuilder builder) {
        this.mainboard = builder.mainboard;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.memory = builder.memory;
        this.power = builder.power;
        this.computerCase = builder.computerCase;
        this.disk = builder.disk;
    }


    public static class ComputerBuilder {
        private String mainboard;
        private String cpu;
        private String gpu;
        private String memory;
        private String power;
        private String computerCase;
        private String disk;

        public ComputerBuilder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public ComputerBuilder power(String power) {
            this.power = power;
            return this;
        }

        public ComputerBuilder computerCase(String computerCase) {
            this.computerCase = computerCase;
            return this;
        }

        public ComputerBuilder disk(String disk) {
            this.disk = disk;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


    public static void main(String[] args) {
//        Computer computer = new Computer("华硕主板","因特尔","华硕3060TI",
//                "金士顿16G", "海韵","平头哥","西部数据");

        Computer computer = new ComputerBuilder()
                .mainboard("华硕主板")
                .cpu("因特尔")
                .gpu("华硕3060TI")
                .memory("金士顿16G")
                .power("海韵")
                .computerCase("平头哥")
                .disk("西部数据")
                .build();

        System.out.println(computer);
    }
}
