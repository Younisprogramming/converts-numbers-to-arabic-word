import java.util.Scanner;
public class UpgradeSkill {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to stop the program if the number between 10_20
        boolean stop = false;
        boolean newstop = false;
        String f;
        //first step is defined 1_99 numbers
        make1_10numbers tim = new make1_10numbers();
        //defined 100_1000numbers
        make100_1000numbers tim2 = new make100_1000numbers();

        String N;
        do {
            System.out.print("enter number : ");
            N = sc.nextLine();


            if (N.charAt(0) == '1' && N.length() == 2) {
                tim.Spechil(N);
                stop = true;
            }
            if (stop == false) {
                if (N.length() == 1) {
                    System.out.print(tim.First(N));
                } else if (N.length() == 2) {
                    System.out.print(tim.First(N));
                    System.out.print(" " + "و");
                    System.out.print(tim.Second(N));
                }
            }
            if (N.length() == 3) {
                System.out.print(tim2.Third(N));
                System.out.print(" ");
                N = N.substring(1);
                if (N.charAt(0) == '0' && N.charAt(1) == '0')
                    stop = true;
                if (N.charAt(0) == '1' && N.length() == 2) {
                    tim.Spechil(N);
                    stop = true;
                }
                if (stop == false) {
                    if (N.length() == 2) {
                        System.out.print(tim.First(N));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(N));
                    }
                }
            }
            if (N.length() == 4) {
                System.out.print(tim2.Four(N));
                N = N.substring(1);
                if (N.length() == 3) {
                    System.out.print(tim2.Third(N));
                    System.out.print(" ");
                    N = N.substring(1);
                    if (N.charAt(0) == '0' && N.charAt(1) == '0') {
                        stop = true;
                    }
                    if (N.charAt(0) == '1' && N.length() == 2) {
                        tim.Spechil(N);
                        stop = true;
                    }
                    if (stop == false) {
                        if (N.length() == 2) {
                            System.out.print(tim.First(N));
                            System.out.print(" " + "و");
                            System.out.print(tim.Second(N));
                        }
                    }
                }
            }
            if (N.length() == 5) {
                f = N.substring(0, 2);
                if (f.charAt(0) == '1' && f.length() == 2) {
                    tim.Spechil(N);
                    newstop = true;
                }
                if (newstop == false) {
                    if (f.length() == 2) {
                        System.out.print(tim.First(f));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(f));
                    }
                }
                System.out.print(" " + "الف");
                N = N.substring(2);

                System.out.print(tim2.Third(N));
                System.out.print(" ");
                N = N.substring(1);
                if (N.charAt(0) == '0' && N.charAt(1) == '0') {
                    stop = true;
                }
                if (N.charAt(0) == '1' && N.length() == 2) {
                    tim.Spechil(N);
                    stop = true;
                }
                if (stop == false) {
                    if (N.length() == 2) {
                        System.out.print(tim.First(N));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(N));
                    }
                }
            }
            if (N.length() == 6) {
                f = N.substring(0, 3);
                System.out.print(tim2.Third(f));
                System.out.print(" ");
                f = f.substring(1);
                if (f.charAt(0) == '0' && f.charAt(1) == '0') {
                    newstop = true;
                }
                if (f.charAt(0) == '1' && f.length() == 2) {
                    tim.Spechil(f);
                    newstop = true;
                }
                if (newstop == false) {
                    if (f.length() == 2) {
                        System.out.print(tim.First(f));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(f));
                    }
                }
                System.out.print(" " + "الف");
                N = N.substring(3);
                System.out.print(tim2.Third(N));
                System.out.print(" ");
                N = N.substring(1);
                if (N.charAt(0) == '0' && N.charAt(1) == '0') {
                    stop = true;
                }
                if (N.charAt(0) == '1' && N.length() == 2) {
                    tim.Spechil(N);
                    stop = true;
                }
                if (stop == false) {
                    if (N.length() == 2) {
                        System.out.print(tim.First(N));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(N));
                    }
                }
            }
            if (N.length() == 7) {
                System.out.print(tim2.last(N));

                N = N.substring(1);
                f = N.substring(0, 3);
                System.out.print(tim2.Third(f));
                System.out.print(" ");
                f = f.substring(1);
                if (f.charAt(0) == '0' && f.charAt(1) == '0') {
                    newstop = true;
                }
                if (f.charAt(0) == '1' && f.length() == 2) {
                    tim.Spechil(f);
                    newstop = true;
                }
                if (newstop == false) {
                    if (f.length() == 2) {
                        System.out.print(tim.First(f));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(f));
                        System.out.print(" " + "الف");
                    }
                }

                N = N.substring(3);
                System.out.print(tim2.Third(N));
                System.out.print(" ");
                N = N.substring(1);
                if (N.charAt(0) == '0' && N.charAt(1) == '0')
                    stop = true;
                if (N.charAt(0) == '1' && N.length() == 2) {
                    tim.Spechil(N);
                    stop = true;
                }
                if (stop == false) {
                    if (N.length() == 2) {
                        System.out.print(tim.First(N));
                        System.out.print(" " + "و");
                        System.out.print(tim.Second(N));
                    }
                }
            }
            System.out.print(" " + "جنيه");
            System.out.println();
        }
        while (N.length()!=8);
    }
}


