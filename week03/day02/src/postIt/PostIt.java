package postIt;

public class PostIt {
    String backgroudColor;
    String text;
    String textColor;

    public PostIt(String backgroudColor, String text, String textColor) {
        this.backgroudColor = backgroudColor;
        this.text = text;
        this.textColor = textColor;
    }

    PostIt example1 = new PostIt("orange", "Idea1", "blue");
    PostIt example2 = new PostIt("pink", "Awesome", "black");
    PostIt example3 = new PostIt("Yellow", "Superb", "Green");


}

