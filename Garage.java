import java.util.ArrayList;

public class Garage {
    public String nom;
    public String adresse;
    public ArrayList<Voiture> voitures = new ArrayList();
    
    public void ajouterVoiture(Voiture v){
        voitures.add(v);
    }
    public Voiture rechercherVoiture(int id){
        for(Voiture v:voitures){
            if (v.getId()==id) {
                return v;
            }
        }
        return null;
    }
    public void supprimerVoiture(int id){
        Voiture v=this.rechercherVoiture(id);
        if (v!=null) {
            voitures.remove(v);
        }
        }
        public void supp2(int id){
            for(int i=0;i<voitures.size();i++){
                if (id==voitures.get(i).getId()) {
                    voitures.remove(i);
                    // break;
                }
            }
        }
        void suppDouble(int id){
            int i=0;
            while (i < voitures.size()) {
                if(id == voitures.get(i).getId()){
                    voitures.remove(i);
                }
                else{
                    i++;
                }
            }
        }
        public double totalPrix(){
            Double total=0.0;
            for(Voiture v:voitures){
                total+=v.getPrix();
            }
            return total;
        }

        void Afficher(){
            for(Voiture v : voitures){
                System.out.println(v);
                System.out.println("********"+v.getId()+"**********");
            }
            
        }
}
