import TemplateMethod.Graph;
import TemplateMethod.Table;
import TemplateMethod.Text;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph("Graph");

        graph.setContent();

        Table table = new Table("Table");

        table.setContent();

        Text text = new Text("Text");

        text.setContent();
    }
}