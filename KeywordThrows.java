/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keywordthrows;

/**
 *
 * @author HP
 */
public class KeywordThrows {
    public static void test (int n)
            throws NullpointerException,       .ArithmeticException{
        if (n < 0) {
            throw new NullPointerException("KESALAHAN: null pointer");
            
        } else {
            throw new       ArithmeticException("KESALAHAN: arithmetic exception");
        }
    }
   
    public static void main(String[] args) {
       try {
           test(-12); //menimbulkan eksepsi NullPointerException
           //test(0); // menimbulkan eksepsi ArithmetichException
       } catch (          .ArithmeticException|NullPointerException e)
       {
           
          System.out.println("eksepsi ditangkap di sini...");
          System.out.println(e.getMessage());
       }
       System.out.println("Statemen setelah blok try-catch");
    }
    }
}

