package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class MatrizSWOTPage extends BasePage {
    public MatrizSWOTPage(WebDriver navegador){
        super(navegador);
    }

    public MatrizSWOTPage inserirForca(){

        // Clicar em Novo Item
        // Selecionar Força
        // Selecionar Gravidade
        // Selecionar Urgência
        // SelecionarTendência
        // Inserir uma descrição
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Item SWOT cadastrado(a) com sucesso."

        return this;
    }

    public MatrizSWOTPage inserirFraqueza(){

        // Clicar em Novo Item
        // Selecionar Fraqueza
        // Selecionar Gravidade
        // Selecionar Urgência
        // SelecionarTendência
        // Inserir uma descrição
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Item SWOT cadastrado(a) com sucesso."

        return this;
    }

    public MatrizSWOTPage inserirOportunidade(){

        // Clicar em Novo Item
        // Selecionar Oportunidade
        // Selecionar Gravidade
        // Selecionar Urgência
        // SelecionarTendência
        // Inserir uma descrição
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Item SWOT cadastrado(a) com sucesso."

        return this;
    }

    public MatrizSWOTPage inserirAmeaca(){

        // Clicar em Novo Item
        // Selecionar Ameaça
        // Selecionar Gravidade
        // Selecionar Urgência
        // SelecionarTendência
        // Inserir uma descrição
        // Marcar a mensagem "Deseja relacionar o Item SWOT à alguma Análise?"
        // Selecionar alguma Análise Relacionada
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Item SWOT cadastrado(a) com sucesso."

        return this;
    }

    public MatrizSWOTPage editarItem(){

        // Selecionar Força
        // Clicar em Editar
        // Alterar a descrição
        // Aguardar mensagem de sucesso "Item SWOT atualizado com sucesso."

        return this;
    }

    public MatrizSWOTPage excluirItem(){

        // Selecionar Força
        // Clicar em Excluir
        // Confirmar mensagem
        // Aguardar mensagem de sucesso "Item SWOT excluído com sucesso."

        return this;
    }

    public MatrizSWOTPage relacionarForcaOportunidade(){

        // Clicar em Forças X Oportunidades
        // Selecionar o item de força e de oportunidade
        // Clicar em Relacionar Itens
        // Inserir uma descrição
        // Selecionar Perspectiva
        // Selecionar Importância
        // Selecionar Urgência
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo cadastrado com sucesso."

        return this;
    }

    public MatrizSWOTPage relacionarForcaAmeaca(){

        // Clicar em Forças X Ameaças
        // Selecionar o item de força e de ameaças
        // Clicar em Relacionar Itens
        // Inserir uma descrição
        // Selecionar Perspectiva
        // Selecionar Importância
        // Selecionar Urgência
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo cadastrado com sucesso."

        return this;
    }
    public MatrizSWOTPage relacionarFraquezaOportunidade(){

        // Clicar em Fraquezas X Oportunidades
        // Selecionar o item de fraquezas e de oportunidade
        // Clicar em Relacionar Itens
        // Inserir uma descrição
        // Selecionar Perspectiva
        // Selecionar Importância
        // Selecionar Urgência
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo cadastrado com sucesso."

        return this;
    }
    public MatrizSWOTPage relacionarFraquezaAmeaca(){

        // Clicar em Fraquezas X Ameaças
        // Selecionar o item de fraquezas e de ameaças
        // Clicar em Relacionar Itens
        // Inserir uma descrição
        // Selecionar Perspectiva
        // Selecionar Importância
        // Selecionar Urgência
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Objetivo cadastrado com sucesso."

        return this;
    }

    public MatrizSWOTPage excluirObjetivo(){

        // Selecionar relacionamento ForçaXOportunidade para excluir o objetivo
        // Excluir Objetivo
        // Confirmar mensagem de exclusão
        // Aguardar mensagem de sucesso "Relacionamento excluído com sucesso."

        return this;
    }

    public CiclosEstrategicosPage retornarPaginaCicloEstrategico(){

        // Retornar pra página Ciclos Estratégicos

        return new CiclosEstrategicosPage(navegador);

    }
}
