public class Main {

    public static void main(String[] args) {
        int count = 0;
        Secret[] values = Secret.values();
        for (Secret x : values) {
            if (x.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// At least two constants start with STAR
//enum Secret {
//   STAR, CRASH, START, // ...
//}