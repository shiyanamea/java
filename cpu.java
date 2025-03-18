public class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public class Processor {
        private int noOfCores;
        private String manufacturer;

        public Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        public int getNoOfCores() {
            return noOfCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor Details:");
            System.out.println("Number of Cores: " + noOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static class RAM {
        private int memory; // in GB
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void displayRAMInfo() {
            System.out.println("RAM Details:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public void displayCPUInfo() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        CPU myCPU = new CPU(299.99);

        CPU.Processor processor = myCPU.new Processor(8, "Intel");

        CPU.RAM ram = new CPU.RAM(16, "Corsair");

        myCPU.displayCPUInfo();
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
