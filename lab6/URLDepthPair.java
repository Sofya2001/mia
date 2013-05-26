public class URLDepthPair {
    
    public static final String URL_PREFIX = "http://";
    
    private int currentDepth;
    private String currentURL;
    
    public URLDepthPair(String URL, int depth) {
        currentDepth = depth;
        currentURL = URL;
    }
    public String getURL() {
        return currentURL;
    }
    public int getDepth() {
        return currentDepth;
    }
    public String toString() {
        return currentDepth.toString() + currentURL;
    }
    public String getDocPath() {
        index = 0;
        index = currentURL.indexOf(Crawler.END_URL);
        String docPath = substring(index);
        return docPath;
    }
    public String getwebHost() {
        index = 0;
        index = currentURL.indexOf(URL_PREFIX, index);
        index += URL_PREFIX.length();
        beginIndex = index;
        index = currentURL.indexOf(Crawler.END_URL);
        endIndex = index - 1;
        String webHost = substring(beginIndex, endIndex);
        return webHost;
    }
    
    
}