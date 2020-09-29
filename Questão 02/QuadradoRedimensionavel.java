package com.Quadrado;

public class QuadradoRedimensionavel extends Quadrado implements Redimensionavel{


    public QuadradoRedimensionavel(double lado) {
        super(lado);
    }

    public void redimensionar(int percentual) {
        this.lado *= percentual;
    }

}

//@Override mostra que o método declarado está sobrescrevendo um método de mesma assinatura declarado na superclasse ou na interface 
   que está sendo herdada/implementada pela sua classe.