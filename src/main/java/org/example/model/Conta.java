 package org.example.model;
 import lombok.AllArgsConstructor;
 import lombok.Data;
 import lombok.NoArgsConstructor;
 import org.example.repository.ContaRepository;
 @Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Conta implements ContaRepository {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
     public Conta(Cliente cliente) {
         this.agencia = Conta.AGENCIA_PADRAO;
         this.numero = SEQUENCIAL++;
         this.cliente = cliente;
     }

}
