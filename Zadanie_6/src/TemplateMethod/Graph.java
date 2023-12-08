package TemplateMethod;
public class Graph extends Report implements ReportTemplate{
    public Graph(String title) {
        super(title);
    }

    @Override
    public void setTitle(String title) {
        super.title = title;
    }

    @Override
    public void setContent() {
        System.out.println("Set content for graph report");
    }
}