public class ExceptionHandling{
    public static void main(String args[]){
        try{
            int arr[] = {1,2,3};
            System.out.println(arr[3]); 
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }finally{
            System.out.println("Try and catch is finished.");
        }
    }
}