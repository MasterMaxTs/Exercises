package ru.job4j.tracker.stream.builder;

public class PcCombiner {
    private String motherBoard;
    private String cpu;
    private byte core;
    private long frequencyCore;
    private String gpu;
    private short memoryBusGpu;
    private String ram;
    private long frequencyRam;
    private long totalRam;

    static class Builder {
        private String motherBoard;
        private String cpu;
        private byte core;
        private  long frequencyCore;
        private String gpu;
        private short memoryBusGpu;
        private String ram;
        private long frequencyRam;
        private long totalRam;

        public Builder buildNameMotherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder buildNameCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder buildQuantityCore(byte core) {
            this.core = core;
            return this;
        }

        public Builder buildFrequencyCore(long frequencyCore) {
            this.frequencyCore = frequencyCore;
            return this;
        }

        public Builder buildNameGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder buildMemoryBusGpu(short memoryBusGpu) {
            this.memoryBusGpu = memoryBusGpu;
            return this;
        }

        public Builder buildNameRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder buildFrequencyRam(long frequencyRam) {
            this.frequencyRam = frequencyRam;
            return this;
        }

        public Builder buildQuantityRam(long totalRam) {
            this.totalRam = totalRam;
            return this;
        }

        PcCombiner build() {
            PcCombiner pc = new PcCombiner();
            pc.motherBoard = motherBoard;
            pc.cpu = cpu;
            pc.core = core;
            pc.frequencyCore = frequencyCore;
            pc.gpu = gpu;
            pc.memoryBusGpu = memoryBusGpu;
            pc.ram = ram;
            pc.frequencyRam = frequencyRam;
            pc.totalRam = totalRam;
            return pc;
        }
    }

    @Override
    public String toString() {
        return "motherBoard='"
                + motherBoard
                + '\''
                + "\ncpu='" + cpu
                + '\''
                + "\ncore=" + core
                + "\nfrequencyCore=" + frequencyCore
                + "\ngpu='" + gpu
                + '\''
                + "\nmemoryBusGpu=" + memoryBusGpu
                + "\nram='" + ram
                + '\''
                + "\nfrequencyRam=" + frequencyRam
                + "\ntotalRam=" + totalRam
                + "\n";
    }

    public static void main(String[] args) {
        PcCombiner pc1 = new Builder().buildNameMotherBoard("Gigabyte B450M")
                                        .buildNameCpu(" Intel® Core™ i5-7300HQ")
                                        .buildNameGpu("AMD RADEON RX 590")
                                        .buildNameRam("Crucial 32GB DDR4-2666 SODIMM")
                                        .build();
        System.out.println("PC combine with minimum info\n" + pc1);
        PcCombiner pc2 = new Builder().buildNameMotherBoard("Gigabyte B450M")
                .buildNameCpu(" Intel® Core™ i5-7300HQ")
                .buildQuantityCore((byte) 4)
                .buildFrequencyCore(2500000000L)
                .buildNameGpu("AMD RADEON RX 590")
                .buildMemoryBusGpu((short) 256)
                .buildNameRam("Crucial 32GB DDR4-2666 SODIMM")
                .buildFrequencyRam(2666000000L)
                .buildQuantityRam(16000000000L)
                .build();
        System.out.println("PC combine with maximum info\n" + pc2);
    }
}
