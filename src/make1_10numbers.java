public class make1_10numbers {
    static String Spechil(String a){
        if (a.charAt(0)=='1' && a.charAt(1)=='0') System.out.print("عشرة");
        if (a.charAt(0)=='1' && a.charAt(1)=='1') System.out.print("احد عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='2') System.out.print("اثنى عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='3') System.out.print("ثلاثة عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='4') System.out.print("اربعة عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='5') System.out.print("خمسة عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='6') System.out.print("ستة عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='7') System.out.print("سبعة عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='8') System.out.print("ثمانية عشر");
        if (a.charAt(0)=='1' && a.charAt(1)=='9') System.out.print("تسعة عشر");

        return "";
    }
    static String First(String a){
        int i = 0;
        if (a.length()==2){
            i = 1;}
            switch(a.charAt(i))
            {
                  case '1': System.out.print("واحد");break;
                  case '2': System.out.print("اثنين");break;
                  case '3': System.out.print("ثلاث");break;
                  case '4': System.out.print("اربعة");break;
                  case '5': System.out.print("خمسة");break;
                  case '6': System.out.print("ستة");break;
                  case '7': System.out.print("سبعة");break;
                  case '8': System.out.print("ثمانية");break;
                  case '9': System.out.print("تسعة");break;
            }
        return "";
    }
    static String Second(String a){
            switch (a.charAt(0)) {
                case '2': System.out.print("عشرين");break;
                case '3': System.out.print("ثلاثين");break;
                case '4': System.out.print("اربعين");break;
                case '5': System.out.print("خمسين");break;
                case '6': System.out.print("ستين");break;
                case '7': System.out.print("سبعين");break;
                case '8': System.out.print("ثمانين");break;
                case '9': System.out.print("تسعين");break;
            }
        return "";
    }

}
