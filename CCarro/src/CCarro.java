public class CCarro { 
     // Atributos 
     String modelo; 
     int ano; 
     boolean ligado; 

     // Construtor 
      public CCarro (String modelo, int ano) {
              this.modelo = modelo; 
              this.ano = ano; 
              this.ligado = false; 
       } 

      // Método para imprimir as informações
      public void exibirInformacoes () { 
              System.out.println("Modelo: " + modelo); 
              System.out.println("Ano: " + ano); 
              System.out.println("Ligado: " + ligado); 
       } 
}