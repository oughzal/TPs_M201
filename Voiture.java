class Voiture{
    private int id;
    private String marque;
    private int nbChauvaux;
    private double prix;
    private static int nbVoitures;
    public Voiture(){
        this.id=0;
        this.marque="BMW";
        this.nbChauvaux=10;
        this.prix=300000;
        Voiture.nbVoitures++;
    }
    public Voiture(int id,String marque,int nbChauvaux,double prix){
        this.id=id;
        this.marque=marque;
        this.nbChauvaux=nbChauvaux;
        this.prix=prix;
        Voiture.nbVoitures++;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int value){
        this.id=value;
    }
    public double getPrix(){
        return this.prix;
    }
    public void setPrix(double value){
        this.prix=value;
    }
     
    @Override
    public String toString() {
        return "Id:"+this.id+"\nMarque:"+this.marque+"\nnbChauvaux:"+this.nbChauvaux+"\nPrix:"+this.prix;
    }
    
}