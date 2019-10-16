package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class ObjetivosPage extends BasePage {
    public ObjetivosPage(WebDriver navegador){
        super(navegador);
    }

    public ObjetivosPage adicionarNovoObjetivo(){

        // Adicionar Novo Objetivo
        // Inserir descrição do objetivo
        // Selecionar Perspectiva
        // Selecionar Importância
        // Selecionar Urgência
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo cadastrado com sucesso."

        return this;
    }

    public ObjetivosPage editarObjetivo(){

        // Em ações, selecionar Editar Objetivo
        // Alterar a descrição
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo atualizado com sucesso."

        return this;
    }

    public ObjetivosPage excluirObjetivo(){

        // Em ações, selecionar Excluir Objetivo
        // Confirmar mensagem
        // Aguardar mensagem de sucesso "Objetivo excluído com sucesso."

        return this;
    }

    public CiclosEstrategicosPage retornarPaginaCicloEstrategico(){

        // Retornar pra página Ciclos Estratégicos

        return new CiclosEstrategicosPage(navegador);

    }
}
