/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author isame
 */
public class CompraGUI extends javax.swing.JPanel {

    //armazenamento temporario durante a busca
    private Produto produtoSelecionado;
    private ModeloTabelaCompra carrinhoTab;
    private double precoTotal, precoParcial;

    public CompraGUI() {
        initComponents();
        precoTotal = 0.0;
        meuInitComponents();
    }

    private void meuInitComponents() {
        this.carrinhoTab = new ModeloTabelaCompra(this);

        //criando conecxão dos dados do objeto com a tabela
        tabelaCarrinho.setModel(carrinhoTab);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigoText = new javax.swing.JTextField();
        nomeText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        quantidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarrinho = new javax.swing.JTable();
        removerButton = new javax.swing.JButton();
        finalizarButton = new javax.swing.JButton();
        estoqueButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        totalText = new javax.swing.JLabel();
        addProduto = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        codigoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoTextActionPerformed(evt);
            }
        });
        codigoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoTextKeyTyped(evt);
            }
        });

        nomeText.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Quantidade");

        quantidadeText.setText("1");
        quantidadeText.setEnabled(false);
        quantidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTextActionPerformed(evt);
            }
        });
        quantidadeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantidadeTextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeTextKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Preço Unit.");

        precoText.setEnabled(false);

        tabelaCarrinho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaCarrinho);

        removerButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        finalizarButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        finalizarButton.setText("Finalizar");
        finalizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarButtonActionPerformed(evt);
            }
        });

        estoqueButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        estoqueButton.setText("Estoque");
        estoqueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estoqueButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor total R$ ");

        totalText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalText.setText("0,00");

        addProduto.setText("jButton1");
        addProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(nomeText)
                    .addComponent(codigoText)
                    .addComponent(quantidadeText, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(precoText))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removerButton)
                    .addComponent(estoqueButton))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(addProduto)
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizarButton)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removerButton)
                                .addGap(241, 241, 241)
                                .addComponent(estoqueButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(totalText)
                            .addComponent(finalizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addProduto)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codigoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoTextActionPerformed

    private void estoqueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estoqueButtonActionPerformed
        JanelaPrincipal.efetuaTransicao(new EstoqueGUI(), "estoque");
    }//GEN-LAST:event_estoqueButtonActionPerformed

    private void quantidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeTextActionPerformed

    private void codigoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTextKeyTyped

        //testando se a tecla pressionada foi o enter
        if (evt.getKeyChar() == '\n') {

            //se o código não estiver vazio, pega-se a informação
            if (!codigoText.getText().isEmpty()) {

                try {
                    //avaliando se o dado é numérico
                    int codigo = Integer.parseInt(codigoText.getText());
                    System.out.println(codigo);
                    //busca pelo codigo do produto
                    produtoSelecionado = FakeBD.consultaProdutoCod(codigo);

                    //avaliando se o produto consultado é vazio
                    if (produtoSelecionado != null) {
                        //atualizando o campo de dados do produto
                        nomeText.setText(produtoSelecionado.getNome());
                        precoText.setText(produtoSelecionado.getPreco() + "");
                        //ativando campo de quantidade
                        quantidadeText.setEnabled(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não cadastrado", "Código", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "O código deve ser numérico", " Erro no código", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_codigoTextKeyTyped

    private void quantidadeTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTextKeyPressed

    }//GEN-LAST:event_quantidadeTextKeyPressed

    private void quantidadeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTextKeyReleased
        //operador do caixa informará nova quantidade e cálculo de preço parcial dos produtos

        //conferindo se existe informação no campo
        if (!quantidadeText.getText().isEmpty()) {
            //pegando quantidade e tranformando em inteiro
            try {
                int quantidade = Integer.parseInt(quantidadeText.getText());

                //cálculo do preço parcial 
               double parcial = produtoSelecionado.getPreco() * quantidade;
                precoText.setText(String.format("%.2f", parcial));
            } catch (NumberFormatException ex) {

                //caso usuario insere quantidade diferente de números
                precoText.setText("N/A");
            }
        } else {
            //se campo sem informação
            precoText.setText("N/A");
        }
    }//GEN-LAST:event_quantidadeTextKeyReleased

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        int linha = tabelaCarrinho.getSelectedRow();

        //validação da linha
        if (linha > -1) {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja remover o produto?",
                    "Confirmação de exclusão", JOptionPane.YES_NO_OPTION);

            //conferindo se realmente deseja exluir e excluindo
            if (opcao == JOptionPane.YES_OPTION) {
                //requisitando a senha para que seja possível fazer a remoção
                String senha = JOptionPane.showInputDialog(null, "Informe a senha do gerente:",
                        "Operação restrita", JOptionPane.INFORMATION_MESSAGE);

                //validação da senha
                if (senha != null && senha.equals("ifmg")) {

                    //remover o produto e atualizar as quantidades 
                    carrinhoTab.removeProduto(linha);
                    atualizaDados();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto primeiro!", "Selecionar",
                    +JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_removerButtonActionPerformed

    private boolean verificaDado() {
        Vector<Produto> produto = carrinhoTab.produtosCarrinho();

        //avaliando as quantidades que estão sendo requisitadas
        for (int x = 0; x < produto.size(); x++) {
            Produto estoque = FakeBD.consultaProdutoCod(produto.get(x).getCodigo());
            if (produto.get(x).getQuantidade() > estoque.getQuantidade()) {
                JOptionPane.showMessageDialog(null, "A quantidade do produto" + estoque.getNome()
                        + "é insuficiente para completar transação", "Quantidade insuficiente", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private void finalizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarButtonActionPerformed
        //verificar se existe a quantidade de produtos que estão sendo requisitados
        if (verificaDado() == true) {

            //busca produtos 
            Vector<Produto> produto = carrinhoTab.produtosCarrinho();

            //atualizar o banco de dados fake
            for (int x = 0; x < produto.size(); x++) {
                Produto estoque = FakeBD.consultaProdutoCod(produto.get(x).getCodigo());
                estoque.setQuantidade(estoque.getQuantidade() - produto.get(x).getQuantidade());
            }
            //limpando campos para a próxima compra
            precoTotal = 0.0;
            totalText.setText("0.0");

            //remoção dos produtos do carrinho da última compra finalizada
            carrinhoTab.limpaCarrinho();

            //atualiza tabela carrinho
            tabelaCarrinho.updateUI();

            JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso", "Final",
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_finalizarButtonActionPerformed

    private void addProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProdutoMouseClicked
        System.out.println("arroz");
        //verificando se o produto selecionado e preço parcial são diferentes de nulo
        if (produtoSelecionado != null && !precoText.getText().equals("N/A")) {
            //produto pode ser adicionado na tabela
            System.out.println("feijao");
            //quantidade que está sendo comprada
            int qnt = Integer.parseInt(quantidadeText.getText());

            //conferindo se há a quantidade desejada no estoque
            if (qnt <= produtoSelecionado.getQuantidade()) {
                System.out.println("arrozEfeijao");
                Produto vendido = new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getNome(), produtoSelecionado.getPreco(), qnt);

               
                //campos sendo lipos para que novo produto seja selecionado
                codigoText.setText("");
                quantidadeText.setText("1");
                precoText.setText("");
                produtoSelecionado = null;
                quantidadeText.setEnabled(false);
                nomeText.setText("");

                //adicionar o produto vendido à tabela - carrinho de compras 
                this.carrinhoTab.addProduto(vendido);
                tabelaCarrinho.updateUI();
                
                 //atualizando informações do produto no estoque 
                //produtoSelecionado.setQuantidade(produtoSelecionado.getQuantidade() - qnt);
                //atualizado preço total da compra 
                precoParcial = vendido.getPreco() * qnt;
                totalText.setText(String.format("%.2f", precoTotal += precoParcial));
                precoParcial = 0.0;

            } else {
                JOptionPane.showMessageDialog(null, "Quantidade insuficiente no estoque",
                        "Alerta", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de produtos informada deve ser numérica ",
                    "Entrada inválida", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addProdutoMouseClicked

    public void atualizaDados() {
        //atualiza informações da tabela
        tabelaCarrinho.updateUI();

        //altera o da compra com os produtos do carrinho
        double preco = carrinhoTab.calculaPrecoParcial();

        //alteranto valor total da compra 
        totalText.setText(String.format("%.2f", preco));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduto;
    private javax.swing.JTextField codigoText;
    private javax.swing.JButton estoqueButton;
    private javax.swing.JButton finalizarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField precoText;
    private javax.swing.JTextField quantidadeText;
    private javax.swing.JButton removerButton;
    private javax.swing.JTable tabelaCarrinho;
    private javax.swing.JLabel totalText;
    // End of variables declaration//GEN-END:variables
}
