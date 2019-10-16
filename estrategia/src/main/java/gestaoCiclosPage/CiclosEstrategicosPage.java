package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class CiclosEstrategicosPage extends BasePage {
    public CiclosEstrategicosPage(WebDriver navegador){
        super(navegador);
    }

    public NovoCicloPage selecionarNovoCiclo(){

        // Clicar em Novo Ciclo

        return new NovoCicloPage(navegador);
    }

    public CiclosEstrategicosPage selecionarCicloCriado(){

        // Selecionar Ciclo

        return this;
    }

    public IdentidadeOrganizacionalPage selecionarIdentidadeOrganizacional(){

        // Clicar em Identidade Organizacional
        // Aguardar Tela

        return new IdentidadeOrganizacionalPage(navegador);
    }

    public StakeholdersPage selecionarStakeholders(){

        // Clicar em Stakeholders
        // Aguardar Tela

        return new StakeholdersPage(navegador);
    }

    public AnalisesPage selecionarAnalises(){

        // Clicar em Análises
        // Aguardar Tela

        return new AnalisesPage(navegador);
    }

    public MatrizSWOTPage selecionarMatrizSWOT(){

        // Clicar em Matriz SWOT
        // Aguardar Tela

        return new MatrizSWOTPage(navegador);
    }

    public ObjetivosPage selecionarObjetivos(){

        // Selecionar Objetivos
        // Aguardar Tela

        return new ObjetivosPage(navegador);
    }


}
