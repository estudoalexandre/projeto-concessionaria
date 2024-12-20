package br.com.fecaf.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.fecaf.model.VeiculoModel;
import br.com.fecaf.view.VeiculoView;

public class VeiculoController {
    private List<VeiculoModel> veiculos = new ArrayList<>();
    private VeiculoView view;

    public VeiculoController(VeiculoView view) {
        this.view = view;
    }

    public void createVeiculo(String marca, String modelo, String tipoVeiculo, int anoFabricacao, double preco, String statusDisponibilidade, String cor, int quilometragem, String tipoCombustivel, int numeroPortas, String tipoCambio) {
        if (marca == null || modelo == null || tipoVeiculo == null || anoFabricacao == 0 || preco == 0 || statusDisponibilidade == null || cor == null || quilometragem == 0 || tipoCombustivel == null || numeroPortas == 0 || tipoCambio == null) {
            view.mensagemErro("Preencha todos os campos!");
            return;
        }

        VeiculoModel veiculo = new VeiculoModel(marca, modelo, tipoVeiculo, anoFabricacao, preco, statusDisponibilidade, cor, quilometragem, tipoCombustivel, numeroPortas, tipoCambio);
        veiculos.add(veiculo);
        view.mensagemSucesso(veiculo.getModelo());
    }

    public void listVeiculos() {
        view.exibirVeiculos(veiculos);
    }
    public void deleteVeiculo(int id) {
        for (VeiculoModel veiculo: veiculos) {
            if (veiculo.getId() == id) {
                veiculos.remove(veiculo);
                System.out.println(veiculo.getModelo() + " Veiculo deletado com sucesso!");	
                return;
            } else {
                view.mensagemErro("Veiculo não encontrado!");
            }
        }
    }
    
}
