package com.company;

import java.util.Scanner;

public class Main
        {

    public static void main(String[] args)
    {

        //Домашняя работа по первому уроку
        // Increment_Dicrement();


        //Домашняя работа по второму уроку    (Математика + условие IF)
     // Kvadratne_Uravnenie();
     // Chastnoe_Dvuh_Chisel();
     // Znaniya_Odessy();
     // Skidka();
     // Chet_Nechet();
     // Delit_Na_Tri();
     // Cena_Telefonnogo_Razgovora();
     // Cifra_Trehznachnogo_Chisla();
     // Kvadrat_3znachgo_Chisla();
     // Dva_Chisla_X_Y();



     //     Домашняяя работа по третьему уроку (Математика + цикл FOR)
     //     Znachenie_Funcii();         //(1)
     //     Funkciya();                 //(2)       //y=ax^2+b / a=3 / b=-5 / x =0 to 5 , 0.5
     //     Naturalnoe_Chislo();        //(3)
     //     Funkciya1();                //(5) сумма (i+x/i!)
    //    Naturalnoe_reshenie();        //(6) x2+y2=k2
     //   Naturalnie_chisla();          //(7) /19 >100
     //   Naturalnie_chisla_1();        //(8) /13 /17 >500
     //   Progresiya();                   //(10) прогрессия +4
     //   Pryamougolnik();                //(11)
     //  Pryamougolniy_Treugonik();         //(11)
        Ravnostoronniy_Treugolnik();        //(11)


    }


            private static void Ravnostoronniy_Treugolnik()
            {
                int a,c1,c2;
                String x="@", str="";
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите длину стороны равностороннего треугольника");
                a = in.nextInt();
                for (c2=0;c2<=a;c2++)
                {
                    str+=" ";
                }
                System.out.println(str+x);
                str="";
                for (c1=0;c1<(a-1); c1++)

                {
                    for (c2=0;c2<(a-c1);c2++)
                    {
                        str+=" ";
                    }
                    x+=" @";
                    System.out.println(str+x);

                    str="";
                }
            }



            private static void Pryamougolniy_Treugonik()
            {
                int a, b,c1,c2;
                String x="@";
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите длину вертикального катета");
                a = in.nextInt();
                for (c1=0;c1<a; c1++)
                {
                    System.out.println(x);
                    x+="@";
                }

            }




            private static void Pryamougolnik()
            {
                int a, b,c1,c2;
                String x="";
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите длину горизонтальной стороны");
                a = in.nextInt();
                System.out.println("Ввведите длину вертикальной стороны");
                b = in.nextInt();
                for (c1=0;c1<(a-1);c1++)
                {
                    x  += "@";
                }
                for (c1=0;c1<a; c1++)
                {
                    System.out.print("@");
                }
                System.out.println();
                for (c2=0;c2<(b-2);c2++)
                {
                    System.out.println(x+"@");
                }
                for (c1=0;c1<a; c1++)
                {
                    System.out.print("@");
                }
            }


            private static void Progresiya()
            {
                int x=1, cnt, summa=0;
                System.out.println(x);
                for (cnt=1; cnt<10;cnt++)
                {
                    x=x+4;
                    System.out.println(x);
                    summa+=x;
                }
                System.out.println("\n" + summa);
            }




            private static void Naturalnie_chisla_1()
            {
                int cnt=1;
                long x=500;
                while (cnt<21)
                {
                    if (x%13==0 || x%17==0)
                    {
                        System.out.println(x%13==0 ? cnt + "    " + x + "      Делится на 13" : cnt + "    " + x + "      Делится на 17");
                        cnt++;
                    }
                    x++;
                }
            }


            private static void Naturalnie_chisla()
            {
                int cnt=1;
                long x=100;
                while (cnt<16)
                {
                    if (x%19==0)
                    {
                        System.out.println(cnt + "    " + x);
                        cnt++;
                    }
                    x++;
                }
            }


            private static void Naturalnoe_reshenie()
            {
                int x=1,y=1,k=1;
                for (x=1; x<=30; x++)
                {
                    for (y=1; y<=30; y++)
                    {
                                for (k=1; k<=30; k++)
                                {
                                    if (Math.pow(x,2) + Math.pow(y,2)==Math.pow(k,2))
                                    {
                                        System.out.println("x="+x+ "\n" + "y=" + y + "\n"+ "k=" + k +"\n");
                                    }
                                }

                    }
                }


            }





            private static void Funkciya1()
            {
                int x, cnt, cnt1=1;
                long i;
                double  F=0, summa=0;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите число");
                x = in.nextInt();
                   for (cnt1=1; cnt1<=15; cnt1++)
                    {
                        i=1;
                        for (cnt = 1; cnt <= cnt1; cnt++)
                         {
                            i *= cnt;
                         }
                        System.out.println("Факториал i(" + cnt1 + ")=" + i);
                    F=(((cnt1+x))/(double)i);
                    summa+=F;
                    System.out.println("F="+F);
                        System.out.println("Сумма = " + summa);
                    System.out.println("");
                    }

            }



            private static void Naturalnoe_Chislo()
            {
                long a;
                int  b, c, cnt = 0, cntA=0, cntB=0;
                String x = "";

                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите целое число");
                a = in.nextLong();
                x += a;
                int[] d = new int[x.length()];
                    for (cnt =0; cnt<x.length();cnt++)
                    {
                    d[cnt]=Character.getNumericValue(x.charAt(cnt));
                    }
                System.out.println("Ввведите введите первое число от 0 до 9");
                b = in.nextInt();
                System.out.println("Ввведите второе первое число от 0 до 9");
                c = in.nextInt();
                    for (cnt=0; cnt<x.length();cnt++)
                    {
                    cntA = b==d[cnt] ? ++cntA : cntA;
                    cntB = c==d[cnt] ? ++cntB : cntB;
                    }
                System.out.println("Первая цифра встречается " + cntA + "\nВторая цифра встречается " + cntB);
                System.out.println(cntA>=cntB ? "Первая цифра встречается на " + (cntA-cntB) + " чаще":"Втораяя цифра встречается на " + (cntB-cntA) + " чаще" );
            }




            private static void Funkciya() //y=ax^2+b / a=3 / b=-5 / x =0 to 5 , 0.5
            {
                int a = 3, b = -5;
                float x=0, y;
                while (x <= 5)
                {
                    x+=0.5;
                    y = a * (float) Math.pow(x, 2) + b;
                    System.out.println(x + "    " + y);
                }
            }


            private static void Znachenie_Funcii()
            {
                //x-sin(x)
                //(sin(x))^2
                //2*cos(x)-1
                Double x, F;
                final int h=60;
                for (x=0.0;x<=360;x+=h)
                {
                F=x-Math.sin(x);
                System.out.println(F + " - " + x + "\n");
                }

                for (x=0.0;x<=360;x+=h)
                {
                F=Math.pow(Math.sin(x),2)-x;
                System.out.println(F + " - " + x + "\n");
                }

                for (x=0.0;x<=360;x+=h)
                {
                    F=2*Math.cos(x)-1;
                    System.out.println(F + " - " + x + "\n");
                }

            }




            private static void Dva_Chisla_X_Y()
            {
                double x, y, c;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите X");
                x=in.nextDouble();
                System.out.println("Ввведите Y");
                y=in.nextDouble();
                if (x>y)
                {
                    c = (x + y) / 2;
                    x = 2 * x * y;
                    y = c;

                }
                else if (x<y)
                {
                    c = (x + y) / 2;
                    y = 2 * x * y;
                    x = c;

                }
                System.out.println("X = " + x + "\nY= " +y);
            }



            private static void Kvadrat_3znachgo_Chisla()
            {
                int a, a1,a2,a3, c;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите трехзначное число");
                a = in.nextInt();
                a1 = a/100; //Первая цифра
                a2 = a/10%10; //Вторая цифра
                a3 = a%100%10;//Третья цифра
                c=(int)Math.pow(a1,3)+(int)Math.pow(a2,3)+(int)Math.pow(a3,3);
                System.out.println("Квадрат числа " + (int)Math.pow(a,2));
                System.out.println("Сумма куббов его цифр " + c);
                System.out.println((int)Math.pow(a,2)==c ? "Квадрат числа равен сумме кубов его цифр" : "Квадрат числа не равен сумме кубов его цифр");
            }


            private static void Cifra_Trehznachnogo_Chisla()
            {
                int a, a1,a2,a3;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите трехзначное число");
                a = in.nextInt();
                a1 = a/100; //Первая цифра
                a2 = a/10%10; //Вторая цифра
                a3 = a%100%10;//Третья цифра
                System.out.println(a1 + "   " + a2 + "   " + a3);
                System.out.println(a1>=a3 ? "Первая цифра больше последней или равны": "Последняя цифра больше первой");
                System.out.println(a1>=a2 ? "Первая цифра больше второй или равны": "Вторая цифра больше первой");
                System.out.println(a2>=a3 ? "Вторая цифра больше последней или равны": "Последняя цифра больше второй");
            }



            private static void Cena_Telefonnogo_Razgovora()
            {
                double a, b;
                final int c=2; // Цена минуты разговора
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите длительность разговора");
                a = in.nextInt();
                System.out.println("Введите день недели");
                b = in.nextInt();
                System.out.println ( b ==6 || b==7 ? "Поздравляем вам предоставлена скидка \nСтоимость разговора составит: " + (a*c - a/100*20): "Скидка не предоставляется \nСтоимость разговора: " + a*c);
            }


            private static void Delit_Na_Tri()
            {
                int a;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите число");
                a = in.nextInt();
                System.out.println ( a%3 == 0 ? "Число делится на три" : "Число на три не делится");
            }




            private static void Chet_Nechet()
            {
                int a;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите число");
                a = in.nextInt();
                System.out.println ( a%2 == 0 ? "Число четное" : "Число нечетное");
            }


            private static void Skidka()
            {
                int a;
                Scanner in = new Scanner(System.in);
                System.out.println("Ввведите стоимость покупки");
                a = in.nextInt();
                System.out.println (a>=500 && a<1000 ? "Позравляем! Вам предоставлена скидка 3% \n Стоимость вашей покупкт составит " + (a-a/100*3): (a>=1000 ? "Позравляем! Вам предоставлена скидка 5% \n Стоимость вашей покупкт составит " + (a-a/100*5):"Скидка не предоставляется!"));
            }


            private static void Znaniya_Odessy()
            {
                int a;
                Scanner in = new Scanner(System.in);
                System.out.println("В каком году была основана Одесса?");
                a = in.nextInt();
                System.out.println(a== 1794 ? "Молодец, ты лучший!":"Вы ошиблись, Одесса была основана в 1794 году.");
            }





            private static void Chastnoe_Dvuh_Chisel()
            {
                int a,b,c;
                Scanner in = new Scanner(System.in);
                System.out.println("Введите делимое a: ");
                a = in.nextInt();
                    do      {
                    System.out.println("Введите делитель b: ");
                    b = in.nextInt();
                    if (b==0) System.out.println("Делитель не может быть равным нулю");
                            } while (b==0);
                c=a/b;
                System.out.println("Частное = " + c);
            }



    private static void Increment_Dicrement ()
    {
        int a,b,c,d,e,f,g,h,i,j;
        a = 1;
        b = 2;
        c = 3;
        d = a++ + b++ + c++;
        e = a-- + b-- + c--;
        f = --a + ++b + c--;
        g = ++a + --b + --c;
        h = d++ + ++e + ++f + g--;
        i = --d + --e + --f + --g;
        j = h++ + ++i;
        System.out.println("\n\na="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("j="+g);
        System.out.println("h="+h);
        System.out.println("i="+i);
        System.out.println("j="+j);
    }



    private static void  Kvadratne_Uravnenie ()
    {
        //ax2 + bx + c = 0

        int a, b, c, D, x1, x2;

        //in - перемменая для сканера
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную a: ");
        a = in.nextInt();
        System.out.println("Введите переменную b: ");
        b = in.nextInt();
        System.out.println("Введите переменную c: ");
        c = in.nextInt();

        //D = b^2 − 4ac
        D = (int) Math.pow(b, 2) - 4 * a * c;


        if (D > 0) {
            x1 = (-b + (int) Math.sqrt(D)) / (2 * a);
            x2 = (-b - (int) Math.sqrt(D)) / (2 * a);

            System.out.println("Уравнение имеет 2 корня");
            System.out.println("Дискриминант = " + D);
            System.out.println("Первый корень = " + x1);
            System.out.println("Второй корень2 = " + x2);
        } else if (D == 0) {
            x1 = (-b + (int) Math.sqrt(D)) / (2 * a);
            System.out.println("Уравнение имеет 1 корень");
            System.out.println("Дискриминант = " + D);
            System.out.println("Корень = " + x1);
        } else if (D < 0) {
            System.out.println("Уравнение не имеет корней");
        }

    }
}
