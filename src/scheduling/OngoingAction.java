package scheduling;
import static util.Utils.*;

public abstract class OngoingAction extends Action{
    String lastActivity;
    public OngoingAction(String label, String descriptionFormat, Object...descriptionArgs){
        super(label, descriptionFormat, descriptionArgs);
    }
    public abstract boolean loop();
    public void abort(String reasonFormat, Object...ReasonArgs){
        //TODO: Log
        String reason = safeStringFormat(reasonFormat, ReasonArgs);
        log("Action Aborted:: %s", reason);
    }

}
