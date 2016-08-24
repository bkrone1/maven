package com.projectten.webapp.client.application;

import com.projectten.webapp.client.ui.home.HomePlace;
import com.projectten.webapp.client.ui.login.LoginPlace;
import com.projectten.webapp.client.ui.logout.LogoutPlace;
import com.projectten.webapp.client.ui.reloadOptions.ReloadOptionsPlace;
import com.projectten.webapp.client.ui.upload.FileUploadPlace;
import com.projectten.webapp.client.ui.users.active.ActiveUsersPlace;
import com.projectten.webapp.client.ui.users.editProfile.EditProfilePlace;
import com.projectten.webapp.client.ui.users.signUp.SignUpPlace;
import com.projectten.webapp.client.ui.users.updatePassword.UpdatePasswordPlace;

import com.google.gwt.place.shared.PlaceHistoryMapperWithFactory;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({
        HomePlace.Tokenizer.class,
        LoginPlace.Tokenizer.class,
        UpdatePasswordPlace.Tokenizer.class,
        LogoutPlace.Tokenizer.class,
        EditProfilePlace.Tokenizer.class,
        SignUpPlace.Tokenizer.class,
        ActiveUsersPlace.Tokenizer.class,
        FileUploadPlace.Tokenizer.class,
        ReloadOptionsPlace.Tokenizer.class
})
public interface ApplicationPlaceHistoryMapper extends PlaceHistoryMapperWithFactory<ApplicationPlaceHistoryFactory> {
}