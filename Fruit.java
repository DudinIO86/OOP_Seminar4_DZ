public class Fruit <T>{
    T fr;
    public Fruit(T ob){
        this.fr=ob;
    }

    public Fruit() {

    }

    @Override
    public String toString(){
        return fr.toString();
    }
}
