package PlayGround;

public class xrpl3kece {
    public static void main(String[] args) throws InterruptedException{
         String text = "X RPL 3 KECE!";
        for (int i = 0; i < text.length() ; i++) {
            System.out.print(text.charAt(i));
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
