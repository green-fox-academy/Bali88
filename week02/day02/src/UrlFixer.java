public class UrlFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String a = "bots";
        String b = "odds";



        System.out.println(url.replace(a,b));

        System.out.println(url.replace(a,b).replace("https","https:"));
    }
}
