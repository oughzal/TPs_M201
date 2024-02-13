public class VoitureElectrique  extends Voiture{
    public int autonomie;
    public VoitureElectrique
    (int id,String marque,int nbChauvaux,double prix,int autonomie)
    {
        super(id, marque, nbChauvaux, prix);
        this.autonomie=autonomie;
    }
    public VoitureElectrique(){
        super();
        this.autonomie=20;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"\nAutonomie:"+this.autonomie;
    }
}
