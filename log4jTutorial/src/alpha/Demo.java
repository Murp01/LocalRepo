package alpha;
import org.apache.logging.log4j.*;

public class Demo {

		/* here we create a logger object called log.  This can then be called throughout class
		 * LogManager is an api and getLogger is one of its methods
		 */
		private static Logger log = LogManager.getLogger(Demo.class.getName());
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Will you work damn it");
		
	}

}
