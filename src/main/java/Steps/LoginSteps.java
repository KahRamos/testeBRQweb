package Steps;

import Pages.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import static Runners.Executar.driver;
import static org.junit.Assert.assertEquals;

public class LoginSteps{

    LoginPage loginPage = new LoginPage(driver);
    @Dado("que estou no site da Phptravels")
    public void queEstouNoSiteDaPhptravels() {
        loginPage.acessarAplicacao();
    }

    @Quando("preencho os dados validos")
    public void preenchoOsDadosValidos() throws InterruptedException {
        loginPage.nomeUsuario("admin@phptravels.com");
        loginPage.digitarSenha("demoadmin");
        loginPage.clicarEntrar();
    }

    @Entao("o login e realizado com sucesso")
    public void oLoginERealizadoComSucesso() throws InterruptedException {
        //Assert.assertEquals("Revenue Breakdown 2022", loginPage.validarLogin());
    }

}
