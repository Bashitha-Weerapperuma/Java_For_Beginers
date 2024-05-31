public class mathFun {
    public static void main(String[] args) {
        System.out.println(Math.max(4,6));
        System.out.println(Math.min(4,6));

        System.out.println(Math.sqrt(8));

        //31 is range value less than one
        // want range 30 --> code 31
        int ranNum = (int) (Math.random() * 31);
        System.out.println("New "+ranNum);

        System.out.println(Math.random());
    }
}
