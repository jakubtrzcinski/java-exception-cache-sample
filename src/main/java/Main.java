import java.util.Random;

class Main {
    public static void main(String[] args) {
        String a = null;

        while (true) {
            if (new Random().nextInt(2) == 0) {
                try {
                    a.contains("123");
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    a.contains("123");
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
