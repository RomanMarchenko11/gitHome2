public class Computer {
    private Processor processor = new Processor();
    private RAM ram = new RAM();
    public Computer() {
        processor.setName("Apple M2");
        processor.setNumberOfCore(10);
        ram.setManufacture("Samsung");
        ram.setNumberOfMemory(16);
    }
    private class Processor {
        private String name;
        private int numberOfCore;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "name='" + name + '\'' +
                    ", numberOfCore=" + numberOfCore +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfCore() {
            return numberOfCore;
        }

        public void setNumberOfCore(int numberOfCore) {
            this.numberOfCore = numberOfCore;
        }
    }

    private class RAM {
        private String manufacture;
        private int numberOfMemory;

        @Override
        public String toString() {
            return "RAM{" +
                    "manufacture='" + manufacture + '\'' +
                    ", numberOfMemory=" + numberOfMemory +
                    '}';
        }

        public String getManufacture() {
            return manufacture;
        }

        public void setManufacture(String manufacture) {
            this.manufacture = manufacture;
        }

        public int getNumberOfMemory() {
            return numberOfMemory;
        }

        public void setNumberOfMemory(int numberOfMemory) {
            this.numberOfMemory = numberOfMemory;
        }
    }

    public void describe() {
        System.out.println("Computer Processor: " + processor.getName() + " " + processor.getNumberOfCore() + " cores");
        System.out.println("RAM: " + ram.getManufacture() + " " + ram.getNumberOfMemory() + " Gb");
    }
}
