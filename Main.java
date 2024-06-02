public class Main {
    public static void main(String[] args) {

//       static void addNumber(int a, int b){
//            System.out.println(a+b);
//        }
        RAM ram = new RAM();
        Processor processor = new Processor();
        Storage storage = new Storage();

        // Create an instance of Computer using the above instances
        Computer computer = new Computer(ram, processor, storage);

        // Print the details of the Computer
        System.out.println(computer);
    }
}

