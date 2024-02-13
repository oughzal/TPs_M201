public class test {
    public static void main(String[] args) {
        
       Garage g = new Garage();

       Voiture v1=new Voiture();
       v1.setId(0);
       g.ajouterVoiture(v1);

    
       v1=new Voiture();
       v1.setId(1);
       g.ajouterVoiture(v1);

       v1=new Voiture();
       v1.setId(0);
       g.ajouterVoiture(v1);


       v1=new Voiture();
       v1.setId(2);
       g.ajouterVoiture(v1);

       g.Afficher();
       g.supp2(0);
       g.Afficher();
       
       
    }
}
