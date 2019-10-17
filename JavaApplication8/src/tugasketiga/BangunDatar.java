package tugasketiga;

public class BangunDatar {
    protected String jenis;
    
    public void view(){
        System.out.print("Nama bangun datar adalah ");
    }
}
class Persegi extends BangunDatar {
    protected double sisi;
    
    public Persegi(double s){
        this.sisi = s;
    }
    public double Luas(){
        return Math.pow(sisi,2);
        
    }
    public double Keliling(){
        return 4*sisi;
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Persegi");
        System.out.println("Luasnya adalah "+Luas()+" cm^2");
        System.out.println("Keliling adalah "+Keliling()+" cm");
    }
}
class Lingkaran extends BangunDatar {
    protected double r;
    
    public Lingkaran (double r){
        this.r=r;
    }
    public double Luas(){
        return Math.PI*Math.pow(r, 2);
    }
    public double Keliling(){
        return 2*Math.PI*r;
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Lingkaran");
        System.out.println("Luas lingkaran adalah "+Luas()+" cm^2");
        System.out.println("Keliling lingkaran adalah "+Keliling()+" cm");
    }
}
class Segitiga extends BangunDatar {
    protected double alas, tinggi;

    public Segitiga(double alas) {
        this.alas = alas;
    }
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Segitiga");
    }    
}

class Segi3Siku2 extends Segitiga {
    public Segi3Siku2(double alas, double tinggi) {
        super(alas, tinggi);
    }
    public double SisiMiring(){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi, 2));
    }
    public double Luas(){
            return 0.5*alas*tinggi;
    }
    public double Keliling(){
        return alas+tinggi+SisiMiring();
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Jenis segitiga adalah segitiga siku-siku");
        System.out.println("Luasnya adalah "+Luas()+" cm^2");
        System.out.println("Kelilingnya adalah "+Keliling()+" cm");
    }
}
class Segi3SamaSisi extends Segitiga {

    public Segi3SamaSisi(double alas) {
        super(alas);
    }
    public double Luas(){
        return 0.25*Math.pow(alas,2)*Math.sqrt(3);
    }
    public double Keliling(){
        return 3*alas;
    }
    @Override
    public void view(){
        super.view();
        System.out.println("Jenis segitiga adalah segitiga sama sisi");
        System.out.println("Luasnya adalah "+Luas()+" cm^2");
        System.out.println("Kelillingnya adalah "+Keliling()+" cm");
    }
}