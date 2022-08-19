import java.util.Random;

class Main {
    public static void main(String[] args) throws BoxNotFullException {
        Random random = new Random();
        MagicBox<Integer> box1 = new MagicBox<Integer>(6);
        MagicBox<String> box2 = new MagicBox<String>(5);
        System.out.println(box1.add(random.nextInt(500)));
        System.out.println(box1.add(random.nextInt(500)));
        System.out.println(box1.add(random.nextInt(500)));
        //System.out.println(box1.pick());
        System.out.println(box1.add(random.nextInt(500)));
        System.out.println(box1.add(random.nextInt(500)));
        System.out.println(box1.add(random.nextInt(500)));
        System.out.println(box1.pick());
        System.out.println(box1.add(random.nextInt(500)));

        System.out.println(box2.add("Alfa"));
        System.out.println(box2.add("Beta"));
        System.out.println(box2.add("Gamma"));
        //System.out.println(box2.pick());
        System.out.println(box2.add("Delta"));
        System.out.println(box2.add("Epsilon"));
        System.out.println(box2.add("Dzeta"));
        System.out.println(box2.pick());
    }
}