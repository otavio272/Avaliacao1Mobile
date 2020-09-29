/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {
public Truco() {
        cartaVirada = new Carta("Paus", "Às");
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        baralho = new Baralho();
    }

    private void embaralharCartas() {
        baralho.embaralhar();
    }

    private void distribuirMaos() throws Exception {
        int i;
        for( i = 0; i < 3; i++) {
            jogador1.recebeCarta(baralho.distribuir());
            jogador2.recebeCarta(baralho.distribuir());
        }
    }

    private void inicializaManilha() throws Exception {
        cartaVirada = baralho.distribuir();
    }
    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }    
}
