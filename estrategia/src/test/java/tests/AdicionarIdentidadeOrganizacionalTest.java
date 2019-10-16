package tests;

import basicPages.LoginPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.IdentidadeOrganizacionalPage;
import gestaoCiclosPage.InicialPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import suporte.Web;
import org.openqa.selenium.WebDriver;

public class AdicionarIdentidadeOrganizacionalTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void AdicionarIdentidadeOrganizacional() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado()
                .selecionarIdentidadeOrganizacional();

        new IdentidadeOrganizacionalPage(navegador)
                .criarIdentidadeOrganizacional()
                .retornarPaginaCicloEstrategico();

    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
