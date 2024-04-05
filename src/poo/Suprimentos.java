package poo;

public class Suprimentos {
    //1 - Crie uma classe chamada Suprimentos que possa ser utilizado por uma loja de suprimentos de informática
    // para representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações
    // como atributos:
    //
    //• o número do item faturado
    //• a descrição do item
    //• a quantidade comprada do item e
    //• o preço unitário do item.
    private int numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    //Sua classe deve ter um construtor que inicialize os quatro atributos.
    public Suprimentos(int numeroItem, String descricaoItem, int quantidade, double precoUnitario){
        setNumeroItem(numeroItem);
        setDescricaoItem(descricaoItem);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    // Se a quantidade não for positiva, ela deve ser configurada como 0.
    public void setQuantidade(int quantidade){
        this.quantidade = Math.max(quantidade, 0);
    }

    // Se o preço por item não for positivo ele deve ser configurado como 0.0.
    public void setPrecoUnitario(double precoUnitario){
        this.precoUnitario = Math.max(precoUnitario, 0);
    }

    // Forneça um método set e um método get para cada variável de instância.

    public void setNumeroItem(int numeroItem){
        this.numeroItem = numeroItem;
    }

    public void setDescricaoItem(String descricaoItem){
        this.descricaoItem = descricaoItem;
    }

    public int getNumeroItem() {
        return this.numeroItem;
    }

    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPrecoUnitario() {
        return this.precoUnitario;
    }


    // Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura
    // (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double.
    public double getInvoiceAmount(){
       return this.quantidade * this.precoUnitario;
    }


}
