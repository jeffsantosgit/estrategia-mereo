package tests;

import basicPages.LoginPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.InicialPage;
import gestaoCiclosPage.NovoCicloPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import suporte.Web;
import org.openqa.selenium.WebDriver;

public class AdicionarNovoCicloTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void AdicionarNovoCiclo() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarNovoCiclo();

        new NovoCicloPage(navegador)
                .adicionarNovoCiclo();

        new CiclosEstrategicosPage(navegador)
                .selecionarNovoCiclo();

        new NovoCicloPage(navegador)
                .adicionarCicloMesmoNome();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado();

        new NovoCicloPage(navegador)
                .editarCiclo();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado();

        new NovoCicloPage(navegador)
                .encerrarCiclo();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado();

        new NovoCicloPage(navegador)
                .excluirCiclo();

    }

    @After
    public void tearDown(){
        navegador.quit();
    }

}
