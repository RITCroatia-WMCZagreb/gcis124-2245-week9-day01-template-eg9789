/*
@ASSESSME.USERID: eg9789
@ASSESSME.AUTHOR: Eldin Grebović
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/
import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors;

    public Vertex(E value) {
        this.value = value;
        this.neighbors= new HashSet<>();
    }

    public E getValue(){
        return this.value;
    }

    public void connect(Vertex<E> neighbor){
         this.neighbors.add(neighbor);
    }

    public boolean connected(Vertex<E> neighbor){
        return this.neighbors.contains(neighbor);
    }

    public Set<Vertex<E>> getNeighbors(){
        return this.neighbors;
    }

    public static void main(String[] args) {
        Vertex<String> vA = new Vertex<String>("A");
        Vertex<String> vB = new Vertex<String>("B");
        Vertex<String> vC = new Vertex<String>("C");

        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vA);
        vC.connect(vB);

    }

    

}
