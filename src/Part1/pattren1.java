package Part1;

public class pattren1 {
    public static void pro(){
        System.out.println("pattren1");
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
