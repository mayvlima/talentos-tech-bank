package padaria.aplication;

import padaria.dao.ItemVendaDao;
import padaria.dao.ProdutoDao;
import padaria.dao.VendaDao;
import padaria.models.ItemVenda;
import padaria.models.Produto;
import padaria.models.Venda;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static padaria.aplication.Validador.*;

public class Menu {

    public static void textoDoMenu() {
        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Realizar venda");
        System.out.println("0 - Sair");
    }

    public static int menu(int opcao, Scanner sc, ProdutoDao produtoDao, VendaDao vendaDao, ItemVendaDao itemVendaDao) throws SQLException {
        switch (opcao) {
            case 1:
                cadastrarProduto(produtoDao, sc);
                break;
            case 2:
                venda(sc, produtoDao, vendaDao, itemVendaDao);
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }

        textoDoMenu();
        validaSystemInteiro(sc);
        return sc.nextInt();
    }

    public static void cadastrarProduto(ProdutoDao produtoDao, Scanner sc) throws SQLException {

        System.out.print("Digite o código de barras do produto: ");
        String codigo = inputStringVazio(sc);

        while (!Produto.verificarSeCodigoJaExiste(produtoDao, codigo)) {
            System.out.println("Esse código de barras já foi cadastrado!");
            System.out.print("Digite novamente: ");
            codigo = sc.next();
        }

        System.out.print("Digite a descrição do produto: ");
        String descricao = inputStringVazio(sc);

        System.out.print("Digite o valor de custo: ");
        BigDecimal valorCusto = null;
        if (!sc.next().isEmpty()) {
            validaSystemBigDecimal(sc);
            valorCusto = validaValorPositivo(sc);
        }

        System.out.print("Digite o peso unitário: ");
        BigDecimal pesoUnitario = null;
        if (!sc.next().isEmpty()) {
            validaSystemBigDecimal(sc);
            pesoUnitario = validaValorPositivo(sc);
        }

        System.out.print("Digite a unidade de medida: ");
        String unidadeMedida = null;
        if (!sc.next().isEmpty()) {
            unidadeMedida = sc.next();
        }

        System.out.print("Digite o valor da venda: ");
        validaSystemBigDecimal(sc);
        BigDecimal valorVenda = validaValorPositivo(sc);

        Produto produto = new Produto(descricao, valorCusto, pesoUnitario, unidadeMedida, codigo, valorVenda);

        produto.cadastrarNovoProduto(produtoDao);
        System.out.println(produto);

    }


    public static void confirmarVenda(Scanner sc, Venda venda, VendaDao vendaDao) throws SQLException {
        System.out.println("Deseja confirmar a venda?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int confirmar = sc.nextInt();

        if (confirmar == 1) {
            venda.concluirVenda(vendaDao);
            System.out.println("Venda realizada");
        } else if (confirmar == 2) {
            venda.cancelarVenda(vendaDao);
            System.out.println("Venda cancelada");
        }


    }

    public static void venda(Scanner sc, ProdutoDao produtoDao, VendaDao vendaDao, ItemVendaDao itemVendaDao) throws SQLException {
        Venda venda = Venda.inicializarVenda(vendaDao);

        int opcao = 1;
        boolean finalizar = true;

        List<Produto> resultadoBuscaProdutos = new ArrayList<>();

        while (opcao != 2) {
            System.out.print("Digite a descrição ou código de barras do produto que deseja: ");
            String busca = sc.next();

            resultadoBuscaProdutos = Produto.buscarProdutos(produtoDao, busca);

            if (resultadoBuscaProdutos.isEmpty()) {
                System.out.println("Nenhum produto encontrado");
                System.out.println("Digite: ");
                System.out.println("1 - Tentar novamente");
                System.out.println("2 - Sair");
                opcao = sc.nextInt();

                if(opcao == 2){
                    venda.cancelarVenda(vendaDao);
                    finalizar = false;
                    System.out.println("Venda Cancelada");
                }

            } else {
                imprimirBusca(resultadoBuscaProdutos);
                Produto produtoDesejado = selecionarProduto(resultadoBuscaProdutos, sc);
                realizarVenda(venda, itemVendaDao, produtoDesejado, sc);

                System.out.println("Deseja adicionar mais um item?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                opcao = sc.nextInt();

            }
        }

        if(finalizar){
            confirmarVenda(sc, venda, vendaDao);
        }

    }

    public static Produto selecionarProduto(List<Produto> resultadoBuscaProdutos, Scanner sc) {
        Produto produtoDesejado = null;

        while (produtoDesejado == null) {
            System.out.println("Digite o id do produto desejado: ");
            validaSystemInteiro(sc);
            int id = sc.nextInt();

            for (Produto resultado : resultadoBuscaProdutos) {
                if (resultado.getId() == id) {
                    produtoDesejado = resultado;
                }
            }

            if (produtoDesejado != null) {
                System.out.println(produtoDesejado);
            } else {
                System.out.println("Digite um id válido");
            }
        }

        return produtoDesejado;
    }


    public static void realizarVenda(Venda venda, ItemVendaDao itemVendaDao, Produto produto, Scanner sc) throws SQLException {


        ItemVenda item = new ItemVenda();
        item.setProduto(produto);

        System.out.println("Digite a quantidade de produto: ");
        validaSystemBigDecimal(sc);
        BigDecimal quantidade = validaValorPositivo(sc);
        item.setQuantidade(quantidade);

        venda.adicionarItemNaVenda(itemVendaDao, item);


    }

    public static void imprimirBusca(List<Produto> resultadoBuscaProdutos) {

        for (Produto resultado : resultadoBuscaProdutos) {
            System.out.println(resultado);
        }
    }


}
