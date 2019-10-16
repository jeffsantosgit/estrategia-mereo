package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class IdentidadeOrganizacionalPage extends BasePage {
    public IdentidadeOrganizacionalPage(WebDriver navegador){
        super(navegador);
    }

    public IdentidadeOrganizacionalPage adicionarProposito(){

        // Clicar em Adicionar Propósito
        // Inserir Texto
        // Clicar em Salvar
        // Aguardar mensagem "Identidade Organizacional atualizada com sucesso."

        return this;
    }

    public IdentidadeOrganizacionalPage adicionarMissao(){

        // Clicar em Adicionar Missão
        // Inserir Texto
        // Clicar em Salvar
        // Aguardar mensagem "Identidade Organizacional atualizada com sucesso."

        return this;
    }


    public IdentidadeOrganizacionalPage adicionarVisao(){

        // Clicar em Adicionar Visão
        // Inserir Texto
        // Clicar em Salvar
        // Aguardar mensagem "Identidade Organizacional atualizada com sucesso."

        return this;
    }

    public IdentidadeOrganizacionalPage adicionarValores(){

        // Clicar em Adicionar Valores
        // Inserir Texto
        // Clicar em Salvar
        // Aguardar mensagem "Identidade Organizacional atualizada com sucesso."

        return this;
    }

    public IdentidadeOrganizacionalPage adicionarFatoresCriticos(){

        // Clicar em Adicionar Fatores Críticos
        // Inserir Texto
        // Clicar em Salvar
        // Aguardar mensagem "Identidade Organizacional atualizada com sucesso."

        return this;
    }

    public IdentidadeOrganizacionalPage criarIdentidadeOrganizacional(){
        adicionarProposito();
        adicionarMissao();
        adicionarVisao();
        adicionarValores();
        adicionarFatoresCriticos();

        return this;
    }

    public CiclosEstrategicosPage retornarPaginaCicloEstrategico(){

        // Retornar pra página Ciclos Estratégicos

        return new CiclosEstrategicosPage(navegador);

    }


}
