package CS221Course.src.DS_assignment7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TellerQueue<String> line = new TellerQueue<>();

        line.offer("Robeil");
        line.offer("Meron");
        line.offer("Soliana");
        line.offer("Keleab");
        line.offer("Haben");
        line.offer("Hannah");
        line.offer("Silvana");
        line.offer("Filmon");
        line.offer("Luna");
        line.offer("Feruz");

        System.out.println(line);
        System.out.println(line.poll());
        System.out.println(line.peek());
        System.out.println(line.size());



      //  System.out.println(line.run());





        // todo ----adding timer to the program -- try to use GUI from demoCode
    }

}
