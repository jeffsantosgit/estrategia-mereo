package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class AnalisesPage extends BasePage {
    public AnalisesPage(WebDriver navegador){
        super(navegador);
    }

    public AnalisesPage adicionarNovaAnaliseInterna(){

        // Clicar em Adicionar Nova Análise
        // Selecionar Tipo de Análise Interna
        // Inserir Título
        // Selecionar Categoria
        // Selecionar Responsável
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Análise Cadastrada com sucesso."

        return this;
    }

    public AnalisesPage adicionarNovaAnaliseExterna(){

        // Clicar em Adicionar Nova Análise
        // Selecionar Tipo de Análise Externa
        // Inserir Título
        // Selecionar Categoria
        // Selecionar Responsável
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Análise Cadastrada com sucesso."

        return this;
    }

    public AnalisesPage editarAnalise(){

        // Em Ações do Comitê clicar em Editar Análise
        // Alterar título
        // Clicar em Salvar
        // Aguardar mensagem de sucesso "Análise atualizada com sucesso."

        return this;
    }

    public AnalisesPage excluirAnalise(){

        // Em Ações do Comitê clicar em Excluir Análise
        // Confirmar a mensagem de exclusão
        // Aguardar mensagem de sucesso "Análise excluída com sucesso."

        return this;
    }

    public CiclosEstrategicosPage retornarPaginaCicloEstrategico(){

        // Retornar pra página Ciclos Estratégicos

        return new CiclosEstrategicosPage(navegador);

    }
}
