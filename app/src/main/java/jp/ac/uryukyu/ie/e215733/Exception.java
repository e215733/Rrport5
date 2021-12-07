package jp.ac.uryukyu.ie.e215733;

public class Exception {
    public static void main(String[] args) {

        printLength(null);
        
        }
        
        static void printLength(String str) {
            
            int i = str.length();
            System.out.println(str + "は" + i + "文字");
        }
    }
