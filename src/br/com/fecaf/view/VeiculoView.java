package br.com.fecaf.view;

import java.util.List;

import br.com.fecaf.model.VeiculoModel;

public class VeiculoView {
    public void exibirVeiculos(List<VeiculoModel> veiculos) {
        for (VeiculoModel veiculo : veiculos) {
            System.out.println("ID: " + veiculo.getId());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Tipo de Veículo: " + veiculo.getTipoVeiculo());
            System.out.println("Ano de Fabricação: " + veiculo.getAnoFabricacao());
            System.out.println("Preço: " + veiculo.getPreco());
            System.out.println("Status de Disponibilidade: " + veiculo.getStatusDisponibilidade());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Quilometragem: " + veiculo.getQuilometragem());
            System.out.println("Tipo de Combustível: " + veiculo.getTipoCombustivel());
            System.out.println("Número de Portas: " + veiculo.getNumeroPortas());
            System.out.println("Tipo de Câmbio: " + veiculo.getTipoCambio());
            System.out.println();
        }
    }

    public void mensagemSucesso(String veiculo) {
        System.out.println("Veiculo:\n" + veiculo + "cadastrado com sucesso!");
    }

    public void mensagemErro(String erro){
        System.out.println("Erro ao cadastrar veiculo: " + erro);
    }
}
