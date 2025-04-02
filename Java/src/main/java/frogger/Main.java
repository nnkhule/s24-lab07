package frogger;

public class Main {
    public static void main(String[] args) {
        // Таны `Frogger` объектын жишээ
        Road road = new Road(new boolean[10]);  // Жишээ зам
        Records records = new Records();  // Бичлэгийн систем
        Frogger frogger = new Frogger(road, 0, records, "John", "Doe", "1234567890", "12345", "NY", "Male");
        
        // Frogger хөдөлгөх
        frogger.move(true);  // Урагш хөдөлнө
        frogger.move(true);  // Дахин урагш
        System.out.println("Frogger's position: " + frogger.getPosition());
        
        // Бичлэг хийх
        if (frogger.recordMyself(records)) {
            System.out.println("Frogger is recorded.");
        }

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("How many times do you want to move forward? ");
        // int moves = scanner.nextInt();

        // // Frogger хөдөлгөх
        // for (int i = 0; i < moves; i++) {
        //     frogger.move(true);  // Урагш хөдөлнө
        //     System.out.println("Frogger's position: " + frogger.getPosition());
        // }

        // // Бичлэг хийх
        // if (frogger.recordMyself(records)) {
        //     System.out.println("Frogger is recorded.");
        // }

        // scanner.close();
    }
}
//j ava -cp ../../out frogger.Main
//javac -d ../../out frogger/*.java drawing/*.java drawing/shapes/*.java drawing/writing/*.java
