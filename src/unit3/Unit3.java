package unit3;

public class Unit3 {

    public static void main(String[] args) throws InterruptedException {
        SetUnit3<Integer> set = new SetUnit3<>();

        Thread oneSet = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                set.add(i);
            }
        });

        Thread twoSet = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                set.add(i + 1000);
            }
        });

        oneSet.start();
        twoSet.start();
        Thread.sleep(3000);
        System.out.println("Set contains " + set.size() + " values");

        MapUnit3<String, Integer> map = new MapUnit3<>();

        Thread oneMap = new Thread(() -> {
           for (int i = 0; i < 1000; i++) {
               map.put("key" + i, i);
           }
        });

        Thread twoMap = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put("key" + i + 1000, i + 1000);
            }
        });

        oneMap.start();
        twoMap.start();
        Thread.sleep(3000);
        System.out.println("Map contains " + map.size() + " keys and values");
    }
}
