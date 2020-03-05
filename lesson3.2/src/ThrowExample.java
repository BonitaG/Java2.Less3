public class ThrowExample {

    public static void main(String[] args) {
       try {
            System.out.println("Площадь = "
                    + getAreaValue(-1, 100));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
       try {
           System.out.println("Площадь = "
                   + getAreaValue(-1, 100));
       } catch (Exception e){}


        System.out.println("Площадь = "
                + getAreaValue(2, 100));
    }

    public static int getAreaValue(int x, int y) throws IllegalArgumentException {
        if (x <=0 || y <=0) {
            throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="
                            + x + ", y=" + y);
        }
        return x * y;
    }
}
