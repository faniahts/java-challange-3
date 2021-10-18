public class SyaratVaksin {
  static void syaratVaksin(int umur) {

    if (umur < 12) {
      System.out.println("Anda Tidak Dapat Di Vaksin"); 
      
    } else {
      System.out.println("Anda Dapat Di Vaksin"); 
    }
    
  } 
  public static void main(String[] args) { 
    syaratVaksin(19); 
  }  
}
