package com.projectten.webapp.client.ui.users.editUser;

import java.util.List;

import com.projectten.webapp.client.application.base.view.ProxyEditView;
import com.projectten.webapp.client.proxies.LabelValueProxy;
import com.projectten.webapp.client.proxies.RoleProxy;
import com.projectten.webapp.client.proxies.UserProxy;

public interface EditUserView extends ProxyEditView<UserProxy, EditUserView> {

    interface Delegate extends ProxyEditView.Delegate {

        void updatePasswordClicked();

    }

    void setCountries(List<LabelValueProxy> countries);

    void setAvailableRoles(List<RoleProxy> roles);
}