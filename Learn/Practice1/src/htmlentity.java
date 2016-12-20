import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlentity {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("<[a-z][A-Z]>(\\S+)</[a-z][A-Z]>");
		String s = "<html>sss</html><p>sss</p>";
		String q[] = s.split("<[a-z][A-Z]>(\\S+)</[a-z][A-Z]>");
		for (String ss : q) {
			System.out.println(ss);
		}
		



	    String stringToSearch = "<p>Yada yada yada <code>StringBuffer</code> yada yada ...</p>";

	    // the pattern we want to search for
	    Pattern p2 = Pattern.compile("<(\"[^\"]*\"|'[^']*'|[^'\">])*>");
	    Matcher m = p2.matcher(stringToSearch);

	    // if we find a match, get the group 
	    if (m.find()) {
	    System.out.println("here");
	      // get the matching group
	      String codeGroup = m.group(1);

	      
	      // print the group
	      System.out.format("%s\n", codeGroup);

	    }

	  }
}
