import java.io.IOException;

public class Principal {
    public static void main(String[] args){

        ConsultaCep consulta = new ConsultaCep();

        try {
            Endereco novoEndereco = consulta.BuscarCep();
            System.out.println(novoEndereco.formatado());

            GerarArquivo salva = new GerarArquivo();
            salva.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizado programa");
        }

    }
}

