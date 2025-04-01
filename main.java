import java.util.Scanner;

public class Main {
    public static void main(Strin[] args) {

        Scanner scanner = newScanner(System.in);

        Produto p1 = new Produto(001);
        Produto p2 = new Produto(002, "Dean Blunt - Black is Beautiful", 10, album, 100.00);
        Produto p3 = new Produto(003, "FKA Twigs - Eusexua", 20, album, 120.00);
        Produto p4 = new Produto(004, "Charli XCX - Pop 2", 15, album, 90.00);

        p1.inserir("Álbum Genérico", 15, "album", 80.00);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p4.vender(5);
        p4.vender(20);

        p3.comprar(10);
        p3.comprar(5, 600.00);

        System.out.println("P1 e P2 são iguais? " + p1.igual(p2));

        scanner.close();

    }
}