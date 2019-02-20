/**
 * This is a Template that has a template method performDailyRoutine.
 * performDailyRoutine() is a template and has method work()with many
 * others. All classes using this template can override work as per their
 * requirements.
 * 
 * @author shashank2484
 *
 */
public abstract class DailyRoutineTemplate {
	// The template should be made final so that it cannot be altered.
	final public void performDailyRoutine() {
		getUp();
		getReady();
		eatBreakfast();
		getToWork();
		work();
		eatDinner();
		gotoSleep();
	}

	public void getUp() {
		System.out.println("I got up.");
	}

	public void getReady() {
		System.out.println("I am getting ready.");
	}

	public void eatBreakfast() {
		System.out.println("I am eating breakfast.");
	}

	public void getToWork() {
		System.out.println("I am going to work");
	}

	abstract public void work();

	public void returnHome() {
		System.out.println("I am going back home.");
	}

	public void eatDinner() {
		System.out.println("I am having dinner.");
	}

	public void gotoSleep() {
		System.out.println("I am going to sleep.");
	}
}
