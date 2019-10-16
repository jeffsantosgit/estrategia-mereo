package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class StakeholdersPage extends BasePage {
    public StakeholdersPage(WebDriver navegador){
        super(navegador);
    }

    public StakeholdersPage adicionarNovoStakeholder(){

        // Clicar em Adicionar novo Stakeholder
        // Inserir o nome
        // Clicar em Adicionar
        // Aguardar Mensagem ""Stakeholder inserido com sucesso"

        return this;
    }

    public StakeholdersPage editarStakeholder(){

        // Clicar em editar Stakeholder
        // Alterar o nome
        // Aguardar mensagem "Steakholder alterado com sucesso"

        return this;
    }

    public StakeholdersPage excluirStakeholder(){

        // Excluir Steakholder criado
        // Confirmar mensagem de exclusão
        // Aguardar mensagem "Steakholder excluído com sucesso"

        return this;
    }

    public StakeholdersPage inserirMembro(){

        // Clicar em Ações do Comitê
        // Selecionar Membros
        // Inserir Membros do Comitê
        // Localizar Nome do Colaborador
        // Clicar em Adicionar Membro
        // Aguardar mensagem "Membro do Comitê adicionado com sucesso"

        return this;
    }

    public StakeholdersPage inserirMembroRepetido(){

        // Selecionar o mesmo colaborador e tentar adicionar novamente
        // Aguardar mensagem "Colaborador já participa deste comitê"
        // Fechar tela de Adição de Membro

       return this;
    }

    public StakeholdersPage adicionarNecessidade(){

        // Clicar em Adicionar Necessidade
        // Inserir texto e clicar em Adicionar
        // Aguardar mensagem "Necessidade inserida com sucesso"

        return this;
    }

    public StakeholdersPage excluirNecessidade(){

        // Excluir Necessidade
        // Aguardar mensagem "Registro excluído com sucesso."

        return this;
    }

    public CiclosEstrategicosPage retornarPaginaCicloEstrategico(){

        // Retornar pra página Ciclos Estratégicos

        return new CiclosEstrategicosPage(navegador);

    }

}
