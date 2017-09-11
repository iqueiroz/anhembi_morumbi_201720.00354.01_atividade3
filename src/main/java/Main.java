import java.util.Scanner;

public class Main
{
    static final int QTD_REGISTROS = 20;
    static final int IDADE_MINIMA = 21;
     
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[QTD_REGISTROS];
        for(int i = 0; i < QTD_REGISTROS; i++)
        {
            System.out.println(String.format("Cadastro %1$d/%2$d", i+1, QTD_REGISTROS));
            pessoas[i] = new Pessoa(solicitarNome(scanner), solicitarIdade(scanner), solicitarSexo(scanner));
        }
        System.out.println();
        System.out.println(String.format("Pessoas do sexo Masculino com MAIS DE %1$d anos", IDADE_MINIMA));
        System.out.println("=============================================");
        int contador = 0;
        for (Pessoa pessoa : pessoas)
        {
            if(pessoa.getSexo().equals("M") && pessoa.getIdade() > IDADE_MINIMA)
            {
                contador++;
                System.out.println(String.format("%1$d. %2$s", contador, pessoa.getNome()));
            }
        }
        if(contador==0)
        {
            System.out.println("Nenhum registro encontado :(");
        }
    }

    private static String solicitarNome(Scanner scanner)
    {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        while(nome==null || nome.isEmpty())
        {
            System.out.print("Não parece ser um nome válido. Digite o nome: ");
            nome = scanner.nextLine();
        }
        return nome;
    }

    private static int solicitarIdade(Scanner scanner)
    {
        System.out.print("Digite a idade: ");
        int idade = lerNumero(scanner);
        while(idade<=0)
        {
            System.out.print("Não parece ser uma idade válida. Digite a idade: ");
            idade = lerNumero(scanner);
        }
        return idade;
    }
    private static int lerNumero(Scanner scanner)
    {
        int numero;
        String entrada = scanner.nextLine();
        try
        {
            numero = Integer.parseInt(entrada);    
        }
        catch (NumberFormatException ex)
        {
            numero = 0;
        }
        return numero;
    }

    private static String solicitarSexo(Scanner scanner)
    {
        System.out.print("Digite o sexo (M/F): ");
        String sexo = scanner.nextLine();
        while(sexo==null || (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")))
        {
            System.out.print("Não parece ser um sexo válido. Digite o sexo (M/F): ");
            sexo = scanner.nextLine();
        }
        return sexo;
    }
}