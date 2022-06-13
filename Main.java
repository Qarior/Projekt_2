import java.io.*;

class trojmian
{
double a, b, c, delta, x1, x2;
char liczba_pierwiastkow;
public void czytaj_dane()
    throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Program oblicza pierwiastki równania kwadratowego dla dowolnych wartości a, b oraz c \n");
System.out.println("Podaj wartość a:");
a = Double.parseDouble(br.readLine());
if (a == 0)
{
    System.out.println("Niedozwolona wartość współczynnika a");
    System.exit(1);
}
else
{
    System.out.println("Podaj wartość b:");
    b = Double.parseDouble(br.readLine());
    System.out.println("Podaj wartość c:");
    c = Double.parseDouble(br.readLine());
}
}
public void przetworz_dane()
{
    delta = b*b-4*a*c;
    if (delta < 0) liczba_pierwiastkow = 0;
    if (delta == 0) liczba_pierwiastkow = 1;
    if (delta > 0) liczba_pierwiastkow = 2;
switch(liczba_pierwiastkow)
{
    case 1 : x1 = -b/(2*a);
    break;
    case 2 : {x1 = (-b-Math.sqrt(delta))/(2*a);
              x2 = (-b+Math.sqrt(delta))/(2*a);
             }
    break;
}
}
public void wyswietl_wynik()
{
System.out.println("Dla wprowadzonych liczb:");
System.out.printf("a = "+"%2.2f,\n", a);
System.out.printf("b = "+"%2.2f,\n", b);
System.out.printf("c = "+"%2.2f,\n", c);
switch (liczba_pierwiastkow)
{
case 0 : System.out.print("Brak pierwiastków rzeczywistych");
break;
case 1 : System.out.printf("Równanie kwadratowe ma jeden pierwiastek podwójny:\n" +"x1 = " + "%2.2f.\n", x1);
break;
case 2 : {System.out.println("Równanie kwadratowe ma dwa pierwiastki:");
          System.out.printf("x1 = "+"%2.2f,\n", x1);
          System.out.printf("x2 = "+"%2.2f.\n", x2);
          }
break;
}
}
}
public class Main {
    public static void main(String[] args)
            throws IOException
    {
        trojmian trojmian1 = new trojmian();
        trojmian1.czytaj_dane();
        trojmian1.przetworz_dane();
        trojmian1.wyswietl_wynik();
    }
}