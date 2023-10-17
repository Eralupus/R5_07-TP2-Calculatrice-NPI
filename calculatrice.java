import java.util.Scanner;

public class calculatrice
{
    public static void calculatriceNpi(String calcul)
    {
        Pile p = new Pile(25);

        String[] calculSepare = calcul.split(" ");
        for(int i=0;i<calculSepare.length;i++)
        {
            if(calculSepare[i].matches("[0-9]*"))
            {
                p.empiler(calculSepare[i]);
            }
            if(calculSepare[i].matches("[+-/*]"))
            {
                int a = Integer.parseInt(p.depiler());
                int b = Integer.parseInt(p.depiler());
                int c = 0;
                switch(calculSepare[i])
                {
                    case "+":
                        c = a+b;
                        break;
                    case "-":
                        c = a-b;
                        break;
                    case "*":
                        c = a*b;
                        break;
                    case "/":
                        c = a/b;
                        break;
                }
                p.empiler(String.format("%d",c));
            }
            if(calculSepare[i].matches("[P]"))
            {
                System.out.println(p);
            }
            if(calculSepare[i].matches("[=]"))
            {
                String valeur = p.depiler();
                System.out.println(valeur);
                p.empiler(valeur);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String calcul = sc.nextLine();
        calculatriceNpi(calcul);

    }
}