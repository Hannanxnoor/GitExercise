import java.sql.SQLOutput;

public class SuperGreeter {

    // Todo: main metode
    public static void main(String[] args) {


        //System.out.println("Det virker"!);

        // Todo: opret en nyt SuperGreater objekt, og kald start metoden og verificer  at den rent faktisk virker!
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        System.out.println("SuperGreeter virker!");
        }
        public void start(){
        System.out.println("SuperGreeter virker fr");}

        //Todo: tilføj en metode greet, der lader brugeren indtaste sit navn

        public void greet(){
        System.out.println("hej HN");}

        //Todo: tilføj en ny metode "askAboutAge" der lader brugeren indtastee sin alder, og returnerer den.

        public void askAboutAge (int age) {
            System.out.println("hvad er din alder!");


        }
        // Tod: lav en ny metode stupiderMethod, der udskriver "Even stupider"
         public void stupiderMethod () {
             System.out.println("Even stupider");
         }




    }






