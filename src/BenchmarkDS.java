import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class BenchmarkDS {

    public static void displayMenu() {
        System.out.println("\n=============================");
        System.out.println("Flower Shop Management System");
        System.out.println("=============================");
        System.out.println("Welcome to our Flower Shop !");
        System.out.println("1. Input New Flower");
        System.out.println("2. Update Flower Details");
        System.out.println("3. Remove Flower");
        System.out.println("4. Search the Flower");
        System.out.println("5. Quit");
        System.out.println("=============================");
        System.out.print("Choose the function: ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long arrayStart, arrayEnd, stackStart, stackEnd, tmStart, tmEnd, llStart, llEnd;
        int x;
        flowerRead();
        int cap = Math.min(flowerCount, 25);

        for (int i = 0; i < cap; i++) {
            FlowerShopArrayList.inputFlower(flowerName[i], price[i], quantity[i]);
        }

        for (int i = 0; i < cap; i++) {
            FlowerShopTreeMap.inputFlower(flowerName[i], price[i], quantity[i]);
        }

        for (int i = 0; i < cap; i++) {
            FlowerShopLinkedList.inputFlower(flowerName[i], price[i], quantity[i]);
        }

        for (int i = 0; i < cap; i++) {
            FlowerShopStack.inputFlower(flowerName[i], price[i], quantity[i]);
        }



        boolean exit = false;
        while (exit == false) {
            displayMenu();
            String choice = input.nextLine();


            switch (choice) {
                case "1":
                    Scanner inputRead = new Scanner(System.in);
                    System.out.println("\nThe Result of the Benchmark for different data structure: ");
                    System.out.print("Enter the number of flowers (x) in the benchmark: ");
                    x = inputRead.nextInt();

                    // Array List (Input Flower BenchMark)
                    System.out.println("\nArray List: ");
                    arrayStart = System.nanoTime();

                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        // System.out.println(x + " " + flowerCount);
                        FlowerShopArrayList.inputFlower(flowerName[i], price[i], quantity[i]);
                    }

                    arrayEnd = System.nanoTime();
                    get_Time(arrayStart, arrayEnd);

                    // Stack (Input Flower Benchmark)
                    System.out.println("\nStack: ");
                    stackStart = System.nanoTime();

                    for (int j = 0; j < x && x <= flowerCount; j++) {
                        FlowerShopStack.inputFlower(flowerName[j], price[j], quantity[j]);
                    }

                    stackEnd = System.nanoTime();
                    get_Time(stackStart, stackEnd);

                    // Tree Map (Input Flower Benchmark)
                    System.out.println("\nTree Map: ");
                    tmStart = System.nanoTime();

                    for (int j = 0; j < x && x <= flowerCount; j++) {
                        FlowerShopTreeMap.inputFlower(flowerName[j], price[j], quantity[j]);
                    }

                    tmEnd = System.nanoTime();
                    get_Time(tmStart, tmEnd);

                    // Linked List (Input Flower Benchmark)
                    System.out.println("\nLinked List: ");
                    llStart = System.nanoTime();

                    for (int j = 0; j < x && x <= flowerCount; j++) {
                        FlowerShopLinkedList.inputFlower(flowerName[j], price[j], quantity[j]);
                    }

                    llEnd = System.nanoTime();
                    get_Time(llStart, llEnd);

                    break;

                case "2":
                    Scanner updateRead = new Scanner(System.in);
                    System.out.println("\nThe Result of the Benchmark for different data structure: ");
                    System.out.print("Enter the number of flowers (x) in the benchmark: ");
                    x = updateRead.nextInt();

                    // ArrayList
                    System.out.println("\nArray List: ");
//                System.out.print("Updating flower details: ");
                    arrayStart = System.nanoTime();
                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopArrayList.updateFlowerDetails(flowerName[i], 98, 7);
                    }
                    arrayEnd = System.nanoTime();
                    get_Time(arrayStart, arrayEnd);

                    // Stack
                    System.out.println("\nStack: ");
//                System.out.print("Updating flower details: ");
                    stackStart = System.nanoTime();
                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopStack.updateFlowerDetails(flowerName[i], 98, 7);
                    }
                    stackEnd = System.nanoTime();
                    get_Time(stackStart, stackEnd);

                    // TreeMap
                    System.out.println("\nTreeMap: ");
//                System.out.print("Updating flower details: ");
                    tmStart = System.nanoTime();
                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopTreeMap.updateFlowerDetails(flowerName[i], 98, 7);
                    }
                    tmEnd = System.nanoTime();
                    get_Time(tmStart, tmEnd);

                    // LinkedList
                    System.out.println("\nLinkedList: ");
//                System.out.print("Updating flower details: ");
                    llStart = System.nanoTime();
                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopLinkedList.updateFlowerDetails(flowerName[i], 98, 7);
                    }
                    llEnd = System.nanoTime();
                    get_Time(llStart, llEnd);

                    break;

                case "3":
                    Scanner removeRead = new Scanner(System.in);
                    System.out.println("\nThe Result of the Benchmark for different data structure: ");
                    System.out.print("Enter the number of flowers (x) in the benchmark: ");
                    x = removeRead.nextInt();

                    // Array List (Remove Flower BenchMark)
                    System.out.println("\nArray List: ");
//                System.out.println("\nMenu: Remove Flower\n");
                    arrayStart = System.nanoTime();

                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopArrayList.removeFlower(flowerName[i]);
                    }

                    arrayEnd = System.nanoTime();
                    get_Time(arrayStart, arrayEnd);

                    // Stack (Remove Flower BenchMark)
                    System.out.println("\nStack: ");
//                System.out.println("\nMenu: Remove Flower\n");
                    stackStart = System.nanoTime();

                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopStack.removeFlower(flowerName[i]);
                    }

                    stackEnd = System.nanoTime();
                    get_Time(stackStart, stackEnd);

                    // Tree Map (Remove Flower BenchMark)
                    System.out.println("\nTreeMap: ");
//                System.out.println("\nMenu: Remove Flower\n");
                    tmStart = System.nanoTime();

                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopTreeMap.removeFlower(flowerName[i]);
                    }

                    tmEnd = System.nanoTime();
                    get_Time(tmStart, tmEnd);

                    //Linked List (Remove Flower BenchMark)
                    System.out.println("\nLinked List: ");
                    llStart = System.nanoTime();

                    for (int i = 0; i < x && x <= flowerCount; i++) {
                        FlowerShopLinkedList.removeFlower(flowerName[i]);
                    }

                    llEnd = System.nanoTime();
                    get_Time(llStart, llEnd);

                    break;

                case "4":
                    System.out.println("\nThe Result of the Benchmark for different data structure: ");
                    //Array List (Search BenchMark)
                    System.out.println("\nArray List: ");
                    arrayStart = System.nanoTime();
                    FlowerShopArrayList.searchFlowerByName("Rose");
                    arrayEnd = System.nanoTime();
                    get_Time(arrayStart, arrayEnd);

                    //Tree Map (Search BenchMark)
                    System.out.println("\nTree Map: ");
                    tmStart = System.nanoTime();
                    FlowerShopTreeMap.searchFlowerByName("Rose");
                    tmEnd = System.nanoTime();
                    get_Time(tmStart, tmEnd);

                    //Stack (Search BenchMark)
                    System.out.println("\nStack: ");
                    stackStart = System.nanoTime();
                    FlowerShopStack.searchFlowerByName("Rose");
                    stackEnd = System.nanoTime();
                    get_Time(stackStart, stackEnd);

                    //Linked List (Search BenchMark)
                    System.out.println("\nLinkedList: ");
                    llStart = System.nanoTime();
                    FlowerShopLinkedList.searchFlowerByName("Rose");
                    llEnd = System.nanoTime();
                    get_Time(llStart, llEnd);
                    break;

                case "5" :
                    input.close();
                    System.exit(0);
            }

        }

    }

    private static int flowerCount = 0;
    static String[] flowerName = new String[25];
    static double[] price = new double[25];
    static int[] quantity = new int[25];

    static void get_Time(long timeStart, long timeEnd) {
        double elapsedTime = (timeEnd - timeStart) / 1_000.0;  //milliseconds
        System.out.println("Time used: " + elapsedTime + " millisecond(s)");
        // System.out.printf("\nTime used: %.2f milliseconds", elapsedTime);
    }

    public static void flowerRead() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/vania/University/Data Structures/Flower Shop System/src/FlowerData.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                String fprice = parts[1];
                String fquantity = parts[2];

                flowerName[flowerCount] = name;
                price[flowerCount] = Double.parseDouble(fprice);
                quantity[flowerCount] = Integer.parseInt(fquantity);
                flowerCount++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}