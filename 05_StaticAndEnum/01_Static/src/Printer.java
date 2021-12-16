public class Printer {
    private String queue;
    public static int pagesCount;
    public static int documentsCount;
    public static int summaryCount;

    public Printer() {
        queue = "Очередь документов:";
    }

    public void append(String text) {
        append(text, "", 1);
    }

    public void append(String text, String documentName) {
        append(text, documentName, 1);
    }

    public void append(String text, String documentName, int pagesCount) {
        queue = queue + "\n" + "Текст документа " + text + " - Имя документа " + documentName + " - Количество страниц равно " + pagesCount;
        increasePagesCount(pagesCount);
        increaseDocumentsCount(1);
    }

    public void clear() {
        queue = "";
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("В очереди нет документов");
        } else {
            System.out.println(queue);
            System.out.println("Общее количество страниц равно " + getPagesCount());
            System.out.println("Общее количество документов равно " + getDocumentsCount());
            System.out.println("Общее количество документов и страниц равно " + getDocumentsAndPagesCount());
            clear();
        }
    }

    public static void increasePagesCount(int pagesCount) {
        Printer.pagesCount = Printer.pagesCount + pagesCount;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    public static void increaseDocumentsCount(int documentsCount) {
        Printer.documentsCount = Printer.documentsCount + documentsCount;
    }

    public int getDocumentsCount() {
        return documentsCount;
    }

    public int getDocumentsAndPagesCount() {
        summaryCount = pagesCount + documentsCount;
        return summaryCount;
    }

}
