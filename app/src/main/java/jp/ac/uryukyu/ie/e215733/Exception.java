package jp.ac.uryukyu.ie.e215733;

public class Exception {
    public static void main(String[] args) throws NullPointerException {
        printLength(null);
    }
        static void printLength(String str) {

            try{
            int i = str.length();
            System.out.println(str + "は" + i + "文字");
            }
            catch(NullPointerException e){
                System.out.println("エラー：NullPointerException");
                System.out.println(e.getMessage());
            }
        }
    }
