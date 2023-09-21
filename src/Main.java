import br.com.buscarcep.dominio.Endereco;
import br.com.buscarcep.dominio.ServicoDeCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu CEP: ");
        String cep = sc.nextLine();
        Endereco endereco = ServicoDeCep.buscarEnderecoPelCep(cep);

        System.out.println("Logradouro: " + endereco.getLogadouro());
        System.out.println("Bairro: "+ endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());

    }
}