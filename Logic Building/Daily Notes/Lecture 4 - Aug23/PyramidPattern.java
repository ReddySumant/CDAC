public class PyramidPattern{ 
 public static void main(String[] args){
	class HelloWorld {
    public static void main(String[] args) {
        int i = 1;
        while(i<=3){
            int j = 1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
 }
}