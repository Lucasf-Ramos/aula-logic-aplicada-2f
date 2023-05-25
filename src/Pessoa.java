public class Pessoa extends Animal{


        String sobrenome;

        public void falar(){
            System.out.println("falei");
        }
        public String falar(String volume){
            return "falaei " + volume;
        }
        public void comer(){
            System.out.print("pessoa comeu");
        }

}
