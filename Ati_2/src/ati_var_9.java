import java.util.Scanner;

public class ati_var_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int telefone,cep,cpf,num_rua;
        String nome,nome_rua,cidade,estado;

        System.out.println("digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("digite sua cidade: ");
        cidade = ler.nextLine();
        System.out.println("digite seu estado: ");
        estado = ler.nextLine();
        System.out.println("digite o nome da sua rua: ");
        nome_rua = ler.nextLine();
        System.out.println("digite o numero de sua casa: ");
        num_rua = ler.nextInt();
        System.out.println("digite seu telefone: ");
        telefone = ler.nextInt();
        System.out.println("digite seu CPF: ");
        cpf = ler.nextInt();
        System.out.println("digite seu CEP: ");
        cep = ler.nextInt();


        System.out.println("nome............: " + nome);
        System.out.println("Endereço........: RUA" + nome_rua + ", numero: " + num_rua + ", CEP: " + cep);
        System.out.println("Cidade..........: " + cidade);
        System.out.println("Estado..........: " + estado);
        System.out.println("CPF ............: " + cpf);
        System.out.println("telefone celular: " + telefone);
    }
}
