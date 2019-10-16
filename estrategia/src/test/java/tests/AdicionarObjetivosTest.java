package tests;

import basicPages.LoginPage;
import gestaoCiclosPage.CiclosEstrategicosPage;
import gestaoCiclosPage.InicialPage;
import gestaoCiclosPage.ObjetivosPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import suporte.Web;
import org.openqa.selenium.WebDriver;

public class AdicionarObjetivosTest {
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void AdicionarObjetivos() throws Exception {

        new LoginPage(navegador)
                .fazerLogin();

        new InicialPage(navegador)
                .conferirTelaInicial()
                .clicarGestaoDeCiclos();

        new CiclosEstrategicosPage(navegador)
                .selecionarCicloCriado()
                .selecionarObjetivos();

        new ObjetivosPage(navegador)
                .adicionarNovoObjetivo()
                .editarObjetivo()
                .excluirObjetivo()
                .retornarPaginaCicloEstrategico();

}

    @After
    public void tearDown(){
        navegador.quit(); }

}
