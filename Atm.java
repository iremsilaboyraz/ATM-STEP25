import java.util.Scanner;

public class Atm {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String userName , password;
        int hak=3;

        while (hak>0){
            System.out.printf("Kullanıcı adınızı giriniz:");
            userName= input.nextLine();
            System.out.printf("Parolanız:");
            password= input.nextLine();
            int select;
            int balance = 1500;

            if (password.equals("Dev123") && (userName.equals("patika"))){
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
      do {


                System.out.println(
                        "1-Para Yatırma\n" +
                          "2-Para Çekme\n" +
                             "3-Bakiye Sorgula\n" +
                                "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                select= input.nextInt();

                switch (select){

                    case 1:
                        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                       int price= input.nextInt();
                        balance += price;
                    break;
                    case 2:
                        System.out.print("Hesabınızdan çekmek istediğiniz miktarı giriniz:");
                        price= input.nextInt();
                        if (price>balance){
                            System.out.println("Yetersiz bakiye!");


                        }else{
                            balance-= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:" + balance);
                        break;
                    case 4:
                        System.out.println("Sistemden başarıyla çıkış yaptınız.");
                        break;
                    default:
                        System.out.println("Hatalı giriş!");
                        break;
                }

      }while(select!=4);
      break;

            }else{
                --hak;
                if (hak==0){
                    System.out.println("Hesabınız bloke olmuştur!Lütfen banka ile iletişme geçiniz!");
                }else{
                    System.out.println("Kullanıcı adı veya parola hatalı.Tekrar deneyiniz.");
                    System.out.println("Kalan deneme hakkınız : " + hak);
                }


            }


        }

    }
}

