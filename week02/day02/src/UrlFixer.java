public class UrlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";

    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!
    String urlX = url.replace("https","https:").replace("bots","odds");

//    String url1 = url.replace("bots", "odds");
//    String url2 = url1.replace("https","https:");
    System.out.println(urlX);
  }
}

