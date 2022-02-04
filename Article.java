import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Article extends Thread {
String line;
int count;
public Article() {
super();
}
public Article(String line) {
super();
this.line=line;
}
public String getLine() {
    return line;
}
public void setLine(String line) {
    this.line = line;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public void run() {
Matcher m = Pattern.compile("(?i)\\b((a)|(an)|(the))\\b").matcher(this.getLine());
while (m.find()) {
this.count++;
}
}
}