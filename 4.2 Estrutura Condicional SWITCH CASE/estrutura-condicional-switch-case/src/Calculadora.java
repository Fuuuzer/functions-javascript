public class Calculadora {
  // Atributos
  private Double valor1;
  private Double valor2;
  private Double resultado;

  // Métodos
  public void iniciarCalculadora() {

    // Objeto da classe Tela
    Tela tela = new Tela();

    // Cria o menu de opçoes
    String menu = ":: Calculadora ::\n" + "\n1. Somar" + "\n2. Subtrair" + "\n3. Multiplicar" + "\n4. Dividir"
        + "\n0. Sair" + "\n\nInforme uma das opções do menu";

    String operacao = tela.informarDados(menu);

    switch (operacao) {

    case "0":
      tela.mostrarMensagem("Encerrando...");
      break;

    case "1":
      tela.mostrarMensagem("um");
      break;

    case "2":
      tela.mostrarMensagem("dois");
      break;

    case "3":
      tela.mostrarMensagem("três");
      break;

    case "4":
      tela.mostrarMensagem("quatro");
      break;

    default:
      tela.mostrarMensagem("Opção Inválida");
      break;
    }

    // if (operacao == "1") // o mesmo que abaixo (formato incorreto)
    /*
     * if (operacao.equals("1")) { tela.mostrarMensagem("Um");
     * 
     * } else if (operacao.equals("2")) { tela.mostrarMensagem("Dois");
     * 
     * } else if (operacao.equals("3")) { tela.mostrarMensagem("Três");
     * 
     * } else if (operacao.equals("4")) { tela.mostrarMensagem("Quatro");
     * 
     * } else if (operacao.equals("0")) { tela.mostrarMensagem("Sair");
     * 
     * } else { tela.mostrarMensagem("Opção Inválida"); }
     */
  }
}
