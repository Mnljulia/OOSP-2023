package TemplateMethod;
public class Text extends Report implements ReportTemplate{
    public Text(String title) {
        super(title);
    }
    @Override
    public void setTitle(String title) {
        super.title = title;
    }
    @Override
    public void setContent() {
            System.out.println("Set content for text report");
    }
}