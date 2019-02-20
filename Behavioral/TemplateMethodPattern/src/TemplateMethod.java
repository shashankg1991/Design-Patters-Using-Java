/**
 * Template method defines a alogo for a process. Fixed parts of the algo are
 * implemented in the abstract class itself. The variable parts can be
 * overridden in individual classes using the template method.
 * 
 * @author shashank2484
 *
 */
public class TemplateMethod {

	public static void main(String[] args) {
		DailyRoutineTemplate engineerDailyRoutine = new EngineerDailyRoutine();
		DailyRoutineTemplate managerDailyRoutine = new ManagerDailyRoutine();
		System.out.println("Perform engineer daily routine.");
		engineerDailyRoutine.performDailyRoutine();
		System.out.println("******************************************");
		System.out.println("Perform manager daily routine.");
		managerDailyRoutine.performDailyRoutine();

	}

}
