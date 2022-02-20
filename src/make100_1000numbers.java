public class make100_1000numbers {
        static String Third(String a){
                      if(a.charAt(0)!='0') System.out.print(" " + "و");
                      if(a.charAt(0)=='1') System.out.print("مئة");
                      if(a.charAt(0)=='2') System.out.print("مائتين");
                      if(a.charAt(0)=='3') System.out.print("ثلاثمئة");
                      if(a.charAt(0)=='4') System.out.print("اربعمئة");
                      if(a.charAt(0)=='5') System.out.print("خمسمئة");
                      if(a.charAt(0)=='6') System.out.print("ستمئة");
                      if(a.charAt(0)=='7') System.out.print("سبعمئة");
                      if(a.charAt(0)=='8') System.out.print("ثمانمئة");
                      if(a.charAt(0)=='9') System.out.print("تسعمئة");

               return "";
        }
        static String Four(String a){
            if (a.charAt(0)=='1'){
                if (a.charAt(1)=='0'&& a.charAt(2)=='0'&& a.charAt(3)=='0') System.out.print("الف");
                if (a.charAt(1)!='0'|| a.charAt(2)!='0'|| a.charAt(3)!='0'){System.out.print("الف"); System.out.print(" " + "و");}
            }
            if(a.charAt(0)=='2') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("الفين");
                else{
                    System.out.print("الفين"); System.out.print(" " + "و"); }
            }
            if(a.charAt(0)=='3') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("ثلاثةالف");
                else {
                    System.out.print("ثلاثةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='4') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("اربعةالف");
                else {
                    System.out.print("اربعةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='5') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("خمسةالف");
                else {
                    System.out.print("خمسةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='6') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("ست الف");
                else {
                    System.out.print("ستةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='7') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("سبعةالف");
                else {
                    System.out.print("سبعةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='8') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("ثمانيةالف");
                else {
                    System.out.print("ثمانيةالف");System.out.print(" " + "و");
                }
            }
            if(a.charAt(0)=='9') {
                if (a.charAt(1) == '0' && a.charAt(2) == '0' && a.charAt(3) == '0') System.out.print("تسعةالف");
                else {
                    System.out.print("تسعةالف");System.out.print(" " + "و");
                }
            }

            return "";
        }
        static String last(String a){
            if(a.charAt(0)=='1') System.out.print("مليون");
            if(a.charAt(0)=='2') System.out.print("اثنين مليون");
            if(a.charAt(0)=='3') System.out.print("ثلاثة مليون");
            if(a.charAt(0)=='4') System.out.print("اربعة مليون");
            if(a.charAt(0)=='5') System.out.print("خمسة مليون");
            if(a.charAt(0)=='6') System.out.print("ستة مليون");
            if(a.charAt(0)=='7') System.out.print("سبعة مليون");
            if(a.charAt(0)=='8') System.out.print("ثمانية مليون");
            if(a.charAt(0)=='9') System.out.print("تسعة مليون");

            return "";
        }








































}
