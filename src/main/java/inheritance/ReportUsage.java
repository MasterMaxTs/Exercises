package inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsreport = new JSONReport();
        String text = jsreport.generate("name", "body");
        System.out.println(text);
    }
}
