package day33_encapsulation;
public class Araba {
    String marka = "Marka belirtilmedi"; // markanin access ,modifier i default access modifier
    // oldugundan, package icerisinde kullanilabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu verable' nin degistirilmemesi lazim
    // model'e deger atanabilsin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    public void setModel(String model) { // set method u deger atamaya izin veriyordu
        this.model = model;
    }
    public String getYakit() { // get methodu ulasima izin veriyordu
        return yakit;
    }
}
