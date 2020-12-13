import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
public class ParseUrl {

        private static Map<String, List<String>> splitQuery(URL url) throws UnsupportedEncodingException {
            System.out.println(url);
            final Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
            final String[] pairs = url.getQuery().split("&");
            for (String pair : pairs) {
                final int idx = pair.indexOf("=");
                final String key = idx > 0 ? URLDecoder.decode(pair.substring(0, idx), "UTF-8") : pair;
                if (!query_pairs.containsKey(key)) {
                    query_pairs.put(key, new LinkedList<String>());
                }
                final String value = idx > 0 && pair.length() > idx + 1 ? URLDecoder.decode(pair.substring(idx + 1), "UTF-8") : null;
                query_pairs.get(key).add(value);
            }
            return query_pairs;
        }

        public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
            String s = "http://testing.bipulse.ru/?page=project&project=7&aspect=plan";
            System.out.println(splitQuery(new URL(s)).get("project"));
            String v = "http://testing.bipulse.ru/?project=7&stage=20&status=all&page=tasks&theme=1&aspect=plan";
            System.out.println(splitQuery(new URL(v)).get("stage"));
            String c = "http://testing.bipulse.ru/?page=tasks&aspect=plan&task=141&theme=1&status=all";
            System.out.println(splitQuery(new URL(c)).get("task"));

        }
    }