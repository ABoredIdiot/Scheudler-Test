package scheduling;

import static util.Utils.*;

public class InstantAction extends Action{
    public InstantAction(String label, String descriptionFormat, Object...descriptionArgs){
        super(label, descriptionFormat, descriptionArgs);
    }

    @Override
    protected void childStarted(Action childAction) {
        log("WARNING: Instant actions not expected to have children. Child action started under %s: %s ",
            label, childAction.label);

        super.childStarted(childAction);
    }
}
