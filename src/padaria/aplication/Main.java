package padaria.aplication;

import padaria.DataBaseConnection;
import padaria.dao.ItemVendaDao;
import padaria.dao.ProdutoDao;
import padaria.dao.VendaDao;

import static padaria.aplication.Menu.*;
import static padaria.aplication.Validador.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws SQLException {

        DataBaseConnection databaseConnection = new DataBaseConnection();

        Connection conn = databaseConnection.getConnection();

        ProdutoDao produtoDao = new ProdutoDao(conn);
        VendaDao vendaDao = new VendaDao(conn);
        ItemVendaDao itemVendaDao = new ItemVendaDao(conn);

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Bem vindo ao sistema de gerenciamento Padaria");
        textoDoMenu();
        validaSystemInteiro(sc);
        int opcao = sc.nextInt();

        while (opcao != 0) {
            opcao = menu(opcao, sc, produtoDao, vendaDao, itemVendaDao);
        }

        sc.close();
        conn.close();
        System.out.println("Até a próxima");

    }


}
