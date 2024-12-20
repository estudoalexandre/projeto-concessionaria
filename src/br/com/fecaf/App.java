package br.com.fecaf;

import java.util.Scanner;

import br.com.fecaf.view.VeiculoView;
import br.com.fecaf.controller.VeiculoController;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeiculoView view = new VeiculoView();
        VeiculoController controller = new VeiculoController(view);

        System.out.println("Bem-vindo ao sistema de cadastro de veículos!");
        boolean continuar = true;

        while(continuar){
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Listar veículos");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1: System.out.println("Digite a marca do veículo: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo do veículo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite o tipo do veículo: ");
                        String tipoVeiculo = scanner.nextLine();
                        System.out.println("Digite o ano de fabricação do veículo: ");
                        int anoFabricacao = scanner.nextInt();
                        System.out.println("Digite o preço do veículo: ");
                        double preco = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Digite o status de disponibilidade do veículo: ");
                        String statusDisponibilidade = scanner.nextLine();
                        System.out.println("Digite a cor do veículo: ");
                        String cor = scanner.nextLine();
                        System.out.println("Digite a quilometragem do veículo: ");
                        int quilometragem = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite o tipo de combustível do veículo: ");
                        String tipoCombustivel = scanner.nextLine();
                        System.out.println("Digite o número de portas do veículo: ");
                        int numeroPortas = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Digite o tipo de câmbio do veículo: ");
                        String tipoCambio = scanner.nextLine();
                        controller.createVeiculo(marca, modelo, tipoVeiculo, anoFabricacao, preco, statusDisponibilidade, cor, quilometragem, tipoCombustivel, numeroPortas, tipoCambio);
                        break;
                case 2: 
                    controller.listVeiculos();
                    break;
                case 3: 
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;
            }
        }
        scanner.close();
    }
    
}
