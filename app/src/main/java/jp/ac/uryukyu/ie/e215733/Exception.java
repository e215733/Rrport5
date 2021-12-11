package jp.ac.uryukyu.ie.e215733;

public class Exception {
    public static void main(String[] args) throws NumberFormatException{
        String str = "百二十三";
        try{
        Integer.parseInt(str);
    }
        catch (NumberFormatException e) {
            System.out.println("Error: NumberFormatException");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(str);
        }
    }
}