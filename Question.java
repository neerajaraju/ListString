package springproject;
import java.util.Iterator;
import java.util.List;
public class Question {
private int id;
private String name;
private List<String> answers;
private Answer ans;
public Question() {}
public Question(int id, String name, List<String> answers,Answer ans) {
	super();
	this.id=id;
	this.name=name;
	this.answers=answers;
	this.ans=ans;
}
public void displayInfo() {
	System.out.println(id+""+name);
	System.out.println("answers are:");
	Iterator<String> itr=answers.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(ans.toString());
}
}
