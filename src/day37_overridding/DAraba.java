package day37_overridding;
public class DAraba {

    // overridding tamamen method larla ilgilidir. veriable lerde buldugun ilk degeri yapistiriirdik.
   private void yakit(){

        System.out.println("Tum arabalar yakit kullanir"); // burda da ok isareti asagida overridding yapilmis gecersiz kilinmis
       /*
       Parent class dan override edilmesini istemediginiz method lari private, static, ve final edebilirsiniz.
        */

    }
    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }
}
