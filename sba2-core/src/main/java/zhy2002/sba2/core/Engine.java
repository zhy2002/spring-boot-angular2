package zhy2002.sba2.core;

import org.springframework.beans.factory.annotation.Autowired;
import zhy2002.sba2.domain.security.User;

/**
 * A singleton class used to process requests.
 */
public class Engine {

    @Autowired
    private EngineEnvironment engineEnvironment;

    public QueryResult query(User user, QueryCommand queryCommand) {
        //todo implement
        return null;
    }

    public ActionResult execute(User user, ActionCommand actionCommand) {
          return null;
    }
}
