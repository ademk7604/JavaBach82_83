package day35_inheretancedaConstructurKullanimi;

public class EMuhasebe extends DPersonel{
    EMuhasebe (){
        System.out.println("EMuhasebe parametresiz const");
    }
    EMuhasebe (String isim){
        System.out.println("EMuhasebe parametrele const");
    }
}
