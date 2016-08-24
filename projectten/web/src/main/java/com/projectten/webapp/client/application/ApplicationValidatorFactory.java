/**
 * 
 */
package com.projectten.webapp.client.application;

import javax.validation.Validator;

import com.projectten.webapp.client.proxies.UserProxy;
import com.projectten.webapp.client.ui.login.LoginView;
import com.projectten.webapp.client.ui.upload.FileUploadBean;
import com.projectten.webapp.client.ui.users.updatePassword.UpdatePasswordView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.validation.client.AbstractGwtValidatorFactory;
import com.google.gwt.validation.client.GwtValidation;
import com.google.gwt.validation.client.impl.AbstractGwtValidator;

/**
 * @author ivangsa
 *
 */
public class ApplicationValidatorFactory extends AbstractGwtValidatorFactory {

    @GwtValidation({
            LoginView.LoginDetails.class,
            UpdatePasswordView.UserCredentials.class,
            UserProxy.class,
            FileUploadBean.class
    })
    public interface GwtValidator extends Validator {
    }

    @Override
    public AbstractGwtValidator createValidator() {
        return GWT.create(GwtValidator.class);
    }

}
