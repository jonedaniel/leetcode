public class TestForNow {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        System.out.println(new TestForNow().aplusb(1,2));
        System.out.println(Byte.MAX_VALUE);
    }
    public int aplusb(int a, int b) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        if (a > b) {
            did(sb, a);
            did(sb, b);
        } else {
            did(sb, b);
            did(sb, a);
        }
        return new String(sb).length();
    }

    public void did(StringBuilder sb, int x){
        if (x > 0) {
            int[] y = new int[x];
            for (int xi : y) {
                sb.append("x");
            }
        } else {
            int[] y = new int[-x];
            for (int xi : y) {
                sb.delete(0,1);
            }
        }
    }

}
