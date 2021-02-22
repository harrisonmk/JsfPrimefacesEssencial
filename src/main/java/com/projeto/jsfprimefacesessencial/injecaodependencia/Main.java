
package com.projeto.jsfprimefacesessencial.injecaodependencia;


public class Main {

   
    public static void main(String[] args) {
       
        
        Pedidos pedidos = new Pedidos();
        RelatorioService relatorio = new RelatorioService();
        relatorio.setPedido(pedidos);
        //RelatorioService relatorio = new RelatorioService(pedidos);
        
        
    }
    
}
