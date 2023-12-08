package TemplateMethod;
public class Table extends Report implements ReportTemplate{

    public Table(String title) {
        super(title);
    }

    @Override
    public void setTitle(String title) {
        super.title = title;
    }

    @Override
    public void setContent() {
        System.out.println("Set content for table report");
    }
}