public class Pessoa
{
    private String _nome;
    private int _idade;
    private String _sexo;

    public String getNome()
    {
        return this._nome;
    }
    public int getIdade()
    {
        return this._idade;
    }
    public String getSexo()
    {
        return this._sexo;
    }
    
    public Pessoa(String nome, int idade, String sexo)
    {
        this._nome = nome;
        this._idade = idade;
        this._sexo = sexo;
    }
}