package org.exoplatform.addons.upgradevalidator;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import org.exoplatform.container.PortalContainer;
import org.exoplatform.services.jcr.RepositoryService;
import org.exoplatform.services.jcr.core.ManageableRepository;
import org.exoplatform.services.jcr.impl.checker.RepositoryCheckController;
import org.exoplatform.services.log.ExoLogger;
import io.swagger.annotations.*;
import org.exoplatform.services.log.Log;
import org.exoplatform.services.rest.resource.ResourceContainer;


@Path("/upgradeValidator")
@Api(value = "/upgradeValidator")
public class RequestHandler implements ResourceContainer {
    private static final Log LOG =
            ExoLogger.getLogger(RequestHandler.class);
    @GET
    @RolesAllowed("administrators")
    @Path("exportConfig")
    @ApiOperation(value = "Export Config", httpMethod = "GET", response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request fulfilled"),
            @ApiResponse(code = 400, message = "Invalid query input"),
            @ApiResponse(code = 403, message = "Unauthorized operation"),
            @ApiResponse(code = 500, message = "Internal server error")})
    public Response exportConfig() {

       return null;
    }


    @GET
    @RolesAllowed("administrators")
    @Path("checkConfig")
    @ApiOperation(value = "Check Config", httpMethod = "GET", response = Response.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Request fulfilled"),
            @ApiResponse(code = 400, message = "Invalid query input"),
            @ApiResponse(code = 403, message = "Unauthorized operation"),
            @ApiResponse(code = 500, message = "Internal server error")})
    public Response checkConfig() {

        return null;
    }

}
