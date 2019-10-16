package tests;

import basicPages.LoginPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.InicialPage;
import gestaoCiclosPage.StakeholdersPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import suporte.Web;
import org.openqa.selenium.WebDriver;

public class AdicionarStakeholdersTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void AdicionarStakeholders() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado()
                .selecionarStakeholders();

        new StakeholdersPage(navegador)
                .adicionarNovoStakeholder()
                .editarStakeholder()
                .excluirStakeholder()
                .adicionarNovoStakeholder()
                .inserirMembro()
                .inserirMembroRepetido()
                .adicionarNecessidade()
                .excluirNecessidade()
                .adicionarNecessidade()
                .retornarPaginaCicloEstrategico();

    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
