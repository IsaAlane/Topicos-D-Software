/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author isame
 */
public class ModeloTabelaCompra extends AbstractTableModel {
    //vetor responsavel por adicionar produtos no carrinho de compras
    private Vector<Produto> carrinhoCompra;
    private CompraGUI painel;

    public ModeloTabelaCompra(CompraGUI painel){
        this.carrinhoCompra = new Vector<>();
        this.painel = painel;
    }
    
    //linhas
    @Override
    public int getRowCount() {
        //retorna a quantidade de elementos diferentes inseridos no carrinho de compra
        return carrinhoCompra.size();
    }

    //colunas
    @Override
    public int getColumnCount() {
        //nome, preço unitário, código e quantidade
        return 4;
    }

    //valor das células
    @Override
    public Object getValueAt(int linha, int coluna) {
        //criando um objeto do tipo produto temporário 
        Produto temporario = carrinhoCompra.get(linha);
        
        switch(coluna){
            case 0:
               return temporario.getNome();
            case 1:
                return temporario.getPreco();
            case 2:
                return temporario.getQuantidade();
            case 3:
                return temporario.getQuantidade()*temporario.getPreco();
            default: return null;
        }
    }
   
    //adicionar conteúdo no carrinho 
    public void addProduto(Produto vendido){
        this.carrinhoCompra.add(vendido);
    }
    
    //remoção do produto do carrinho
    public void removeProduto(int indice){
        this.carrinhoCompra.remove(indice);
    }
    
    public void limpaCarrinho(){
        this.carrinhoCompra.clear();
    }

    //definindo o nome das colunas da tabela 
    @Override
    public String getColumnName(int coluna) {
        switch(coluna){
            case 0 : 
                return "Nome";
            case 1 :
                return "Preço Unitário";
            case 2 : 
                return "Quantdade";
            case 3 : 
                return "Preço Parcial";
            default: 
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        //definindo que a coluna de quantidade poderá ser alterada
        if(coluna==2){
            return true;
        }else{
        return false;
        }
    }

    //atualizando as informações da tabela após modificação
    @Override
    public void setValueAt(Object valorNovo, int linha, int coluna) {
        if(coluna==2){
            
            //requisitando a senha para que seja possível fazer alterações
            String senha = JOptionPane.showInputDialog(null,"Informe a senha do gerente:",
                    "Operação restrita", JOptionPane.INFORMATION_MESSAGE);
            
            //validação da senha
            if(senha!= null && senha.equals("ifmg")){

                //alterando quantidade indicada na linha x e conferência do casting
                carrinhoCompra.get(linha).setQuantidade((int)valorNovo);

                //tabela e valor da compra são atualizados 
                this.painel.atualizaDados();
                }
        }
    } 

    //avaliando qual será o retorno de cada classe
    @Override
    public Class<?> getColumnClass(int coluna) {
        switch(coluna){
            case 0: return String.class;
            case 1: return Double.class;
            case 2: return Integer.class;
            case 3: return Double.class;
            default : return null;
        }
    }
    
    //atualiza o valor de casa preço unitário depois de modificações 
    public double calculaPrecoParcial(){
        double valor = 0.0;
        
        //recaulculando o preço dos produtos inseridos 
        for(Produto prod: carrinhoCompra){
            valor+= prod.getQuantidade()* prod.getPreco();
        }
        return valor;
    }

    public Vector<Produto> produtosCarrinho() {
        return carrinhoCompra;
    }
}
