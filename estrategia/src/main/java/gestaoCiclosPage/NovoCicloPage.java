package gestaoCiclosPage;

import basicPages.BasePage;
import org.openqa.selenium.WebDriver;

public class NovoCicloPage extends BasePage {
    public NovoCicloPage(WebDriver navegador){
        super(navegador);
    }

    public NovoCicloPage adicionarNovoCiclo() {

        // Inserir Nome do Ciclo
        // Inserir Data Início e Data Fim do Ciclo
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Ciclo Estratégico cadastrado(a) com sucesso."

        return this;
    }

    public NovoCicloPage adicionarCicloMesmoNome() {

        // Tentar criar outro ciclo com o mesmo nome do anterior
        // Inserir Data Início e Data Fim do Ciclo
        // Clicar em Adicionar
        // Aguardar mensagem de erro "Este nome de Ciclo já existe. Crie um novo nome."
        // Alterar o nome
        // Clicar em Adicionar
        // Aguardar mensagem de sucesso "Ciclo Estratégico cadastrado(a) com sucesso."

        return this;
    }

    public NovoCicloPage excluirCiclo(){

        // Clicar em Excluir ciclo estratégico
        // Confirmar mensagem de exclusão
        // Aguardar mensagem de sucesso "Ciclo Estratégico excluído com sucesso."

        return this;
    }

    public NovoCicloPage editarCiclo(){

        // Localizar na tela o primeiro ciclo criado
        // Clicar em Editar
        // Alterar a Data Fim
        // Aguardar mensagem de sucesso "Ciclo Estratégico atualizado com sucesso."

        return this;
    }

    public NovoCicloPage encerrarCiclo(){

        // Clicar em Encerrar Ciclo
        // Confirmar mensagem de encerramento
        // Aguardar mensagem de sucesso "Ciclo Estratégico encerrado com sucesso!"
        // Clicar em Abrir Ciclo
        // Confirmar mensagem de reabertura de ciclo
        // Aguardar mensagem de sucesso "Ciclo Estratégico aberto com sucesso!"

        return this;
    }

}
