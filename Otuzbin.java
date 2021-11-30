package metot_dizi_string;

public class Otuzbin {

    public static void main(String[] args) {
        int toplam=0;
        int sayac=0;
        int birler=0;
        int onlar=0;
        int yuzler=0;
        int binler=0;
        int onbinler=0;

        for(int i=29;i<=30000;i++){

            if(i>=29 && i<=99){
                onlar = i/10;
                birler = i%10;
                toplam = onlar+birler;
                if(toplam == 11){
                    sayac++;
                    System.out.println(i);

                }
            }
            else if(i>=100 && i<=999){
                yuzler = i /100;
                onlar = (i%100)/10;
                birler = (i%100)%10;
                toplam = yuzler+onlar+birler;
                if(toplam == 11){
                    sayac++;
                    System.out.println(i);
                }
            }
            else if(i>=1000 && i<=9999){
                binler = i/1000;
                yuzler = (i %1000)/100;
                onlar = ((i %1000)%100)/10;
                birler = ((i %1000)%100)%10;
                toplam = binler+yuzler+onlar+birler;
                if(toplam == 11){
                    sayac++;
                    System.out.println(i);
                }

            }
            else if(i>=10000 && i<=30000){
                onbinler = i/10000;
                binler = (i%10000)/1000;
                yuzler=((i%10000)%1000)/100;
                onlar=(((i%10000)%1000)%100)/10;
                birler=(((i%10000)%1000)%100)%10;
                toplam = onbinler+binler+yuzler+onlar+birler;
                if(toplam == 11) {
                    sayac++;
                    System.out.println(i);
                }

            }
        }
        System.out.println("ADET:"+sayac);
    }
}
