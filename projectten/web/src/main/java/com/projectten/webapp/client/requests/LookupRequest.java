/**
 * 
 */
package com.projectten.webapp.client.requests;

import com.projectten.webapp.client.proxies.LookupConstantsProxy;
import com.projectten.webapp.server.GwtServiceLocator;
import com.projectten.webapp.server.services.LookupRequestService;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

/**
 * @author ivangsa
 *
 */
@Service(value = LookupRequestService.class, locator = GwtServiceLocator.class)
public interface LookupRequest extends RequestContext {

    public Request<LookupConstantsProxy> getApplicationConstants();

    public Request<LookupConstantsProxy> reloadOptions();
}
