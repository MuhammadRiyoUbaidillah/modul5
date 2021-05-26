package abstrak;

public final class mainbilangan {
    public static void main (String [] args){
        
        System.out.println("************************");
        System.out.println(" -- Operasi Bilangan -- ");
        System.out.println("************************");
        
        operasibilangan[] a = new operasibilangan[4];
     
        a[0] = new operasipenjumlahan();
        a[1] = new operasipengurangan();
        a[2] = new operasiperkalian();
        a[3] = new operasipembagian();
        
        for (operasibilangan a1 : a) {
            a1.setA(6.5);
            a1.setB(0.5);
            a1.tampil();
        }
    }
}

    
