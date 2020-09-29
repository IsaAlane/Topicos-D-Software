/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isame
 */
public class FakeBD {
    //vetor que será armazenado os produtos 
    private static Vector<Produto> produtos;
    
    //leitura do arquivo externo
    private static void cargaArquivo(){
        //pegando o arquivo na memória
        File arquivoCSV = new File("E:\\Área de Trabalho\\produtos.csv");
        
        //verificação se o faleBD está vazio
        if(produtos==null){
            produtos = new Vector<>();
        }else{
            //caso de atualizações, ajuste na criação de produtos do vetor static
            produtos.clear();
        }
        
        
        try {
            //ler o arquivo
            FileReader marcaLeitura = new FileReader(arquivoCSV);
             
            //permite que copie o máximo de dados para fazer o processamento 
            BufferedReader bufLeitura = new BufferedReader(marcaLeitura);
            
            //leitura de primeira linha
            //descarte da primeira linha(cabeçalho)
            bufLeitura.readLine();
            String linha = bufLeitura.readLine();
            
            //leitura das linhas seguintes
            while(linha!= null){
                String info[] = linha.split(";");
                
                //leitura de cada elemento 
                int codigo = Integer.parseInt(info[0]);
                String nome = info[1];
                double preco = Double.parseDouble(info[2]);
                int quantidade = Integer.parseInt(info[3]);
                
                //adicionando produtos no vetor dinâmico
                produtos.add(new Produto(codigo, nome, preco, quantidade));
                
                //atualizando a variável linha com a informação da próxima linha do arquivo
                linha = bufLeitura.readLine();
            }
            
            //fechamento do arquivo, liberando para outro processo
            bufLeitura.close();
                   
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo especificado não existe");
        } catch (IOException e){
            System.out.println("Arquivo corrompido");
        }        
        
    } 
    public static Produto consultaProdutoCod(int codigo){
       
        //conferindo se o arquivo ja foi carregado
        if(produtos == null){
            cargaArquivo();
        }
        
        //buscando por produtos com base ao código
        for(Produto prod : produtos){
            if(prod.getCodigo()== codigo){
                return prod;
            }
        }
        
        //produto com código especificado inexistente
        return null;
    }
    //alterando informações na unidade de armazenamento secundária
    public static void atualizaArquivo(){
        //encontrando o arquivo
        File arquivo = new File("E:\\Área de Trabalho\\produtos.csv");
        
        try {
            //modificação de arquivos
            FileWriter escrita = new FileWriter(arquivo);
            
            //otimização de informações
            BufferedWriter bufferEscrita = new BufferedWriter(escrita);
            
            
            //escrevendo no arquivo a quantidade de linhas relativa aos produtos
            escrita.write("codigo;produto;preco;quantidade;" + "\n");
            for(int x=0; x< produtos.size(); x++){
                
                //chamada do método toString();
                bufferEscrita.write(produtos.get(x)+"\n");
            }
            
            //descarregando informações
            bufferEscrita.flush();
            
            bufferEscrita.close();
                    
        } catch (IOException ex) {
            //falha se tiver corrompido
            System.out.println("Dispositivo com falha");
        }
    }
}
