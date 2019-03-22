package edu.ncsu.csc.itrust2.controllers.er;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to manage basic abilities for ER roles
 * 
 * @author Amalan Iyengar
 *
 */

@Controller
public class ERController {

    /**
     * Returns the ER for the given model
     * 
     * @param model
     *            model to check
     * @return role
     */
    @RequestMapping ( value = "er/index" )
    @PreAuthorize ( "hasRole('ROLE_ER')" )
    public String index ( final Model model ) {
        return edu.ncsu.csc.itrust2.models.enums.Role.ROLE_ER.getLanding();
    }
    
    /**
     * Returns the ER for the given model
     * 
     * @param model
     *            model to check
     * @return role
     */
    @RequestMapping ( value = "er/records" )
    @PreAuthorize ( "hasRole('ROLE_ER')" )
    public String emergencyRecords ( final Model model ) {
        return "personnel/records";
    }
    
    

}
















