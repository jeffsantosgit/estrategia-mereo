package tests;

import basicPages.LoginPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.InicialPage;
import gestaoCiclosPage.MatrizSWOTPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import suporte.Web;
import org.openqa.selenium.WebDriver;

public class FazerMatrizSWOTTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void FazerMatrizSWOT() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado()
                .selecionarMatrizSWOT();

        new MatrizSWOTPage(navegador)
                .inserirForca()
                .inserirFraqueza()
                .inserirOportunidade()
                .inserirAmeaca()
                .editarItem()
                .excluirItem()
                .inserirForca()
                .relacionarForcaOportunidade()
                .relacionarForcaAmeaca()
                .relacionarFraquezaOportunidade()
                .relacionarFraquezaAmeaca()
                .excluirObjetivo()
                .retornarPaginaCicloEstrategico();
    }

    @After
    public void tearDown(){
        navegador.quit();
    }
}
