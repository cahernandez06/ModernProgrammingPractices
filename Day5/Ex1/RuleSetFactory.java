package Day5.Ex1;

import java.awt.Component;
import java.util.HashMap;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	
	static {
		map.put(BookWindow.class,new BookRuleSet());
		map.put(CDWindow.class,new CDRuleSet());
	}
	
	public static RuleSet getRuleSet(Component c) {
			Class<? extends Component> com = c.getClass();
			if (!map.containsKey(com))
				throw new IllegalArgumentException("Rule doesn't exist");
			return map.get(com);
	}
	
}
