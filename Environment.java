import java.util.ArrayDeque;
import java.util.Deque;

//Class that handles user specified parameters from the Driver class and generates the population as such. 
public class Environment {
    private Deque<Node> population = new ArrayDeque<Node>();

    public Environment (int size, int generations) {
        initPopulation(size);
    }

    //helper function loads the ArrayDeque with all the parents in a random order

    public void initPopulation (int size) {
        for (int i =0; i < size; i++) {
            Node node = new Node();
            node.printBits(node.data);
            population.add(node);
        }
    }

    public static void main(String[] args) {
        Environment e = new Environment(2, 1);
    }

}
