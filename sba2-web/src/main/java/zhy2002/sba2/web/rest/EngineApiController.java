package zhy2002.sba2.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zhy2002.sba2.core.Engine;
import zhy2002.sba2.domain.security.User;
import zhy2002.sba2.core.ActionCommand;
import zhy2002.sba2.core.ActionResult;
import zhy2002.sba2.core.QueryCommand;
import zhy2002.sba2.core.QueryResult;

/**
 * This controller expose the engine functionality as web api.
 */
@RestController
@RequestMapping("/api")
public class EngineApiController {

    @Autowired
    private Engine engine;

    @Autowired
    private User user;

    @RequestMapping(path = "/query", method = RequestMethod.POST)
    public QueryResult query(QueryCommand queryCommand) {
        return engine.query(user, queryCommand);
    }

    @RequestMapping(path = "/execute", method = RequestMethod.POST)
    public ActionResult execute(ActionCommand actionCommand) {
        return engine.execute(user, actionCommand);
    }

    //todo handle exceptions

}
