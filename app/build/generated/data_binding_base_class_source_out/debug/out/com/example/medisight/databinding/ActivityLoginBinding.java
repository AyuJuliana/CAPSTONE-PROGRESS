// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medisight.R;
import com.example.medisight.ui.custom.EmailEditText;
import com.example.medisight.ui.custom.PasswordEditText;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final ImageButton btnGoogleSignIn;

  @NonNull
  public final MaterialButton btnLogin;

  @NonNull
  public final EmailEditText edLoginEmail;

  @NonNull
  public final PasswordEditText edLoginPassword;

  @NonNull
  public final LinearLayout formContainer;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBarLoading;

  @NonNull
  public final TextView subWelcomeTextTitle;

  @NonNull
  public final TextView textEmailTitle;

  @NonNull
  public final TextView textOrContinueWith;

  @NonNull
  public final TextView textPasswordTitle;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final ConstraintLayout topAppBar;

  @NonNull
  public final TextView tvForgotPassword;

  @NonNull
  public final TextView welcomeTextTitle;

  private ActivityLoginBinding(@NonNull ScrollView rootView, @NonNull ImageButton btnBack,
      @NonNull ImageButton btnGoogleSignIn, @NonNull MaterialButton btnLogin,
      @NonNull EmailEditText edLoginEmail, @NonNull PasswordEditText edLoginPassword,
      @NonNull LinearLayout formContainer, @NonNull ConstraintLayout main,
      @NonNull ProgressBar progressBarLoading, @NonNull TextView subWelcomeTextTitle,
      @NonNull TextView textEmailTitle, @NonNull TextView textOrContinueWith,
      @NonNull TextView textPasswordTitle, @NonNull TextView titleText,
      @NonNull ConstraintLayout topAppBar, @NonNull TextView tvForgotPassword,
      @NonNull TextView welcomeTextTitle) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnGoogleSignIn = btnGoogleSignIn;
    this.btnLogin = btnLogin;
    this.edLoginEmail = edLoginEmail;
    this.edLoginPassword = edLoginPassword;
    this.formContainer = formContainer;
    this.main = main;
    this.progressBarLoading = progressBarLoading;
    this.subWelcomeTextTitle = subWelcomeTextTitle;
    this.textEmailTitle = textEmailTitle;
    this.textOrContinueWith = textOrContinueWith;
    this.textPasswordTitle = textPasswordTitle;
    this.titleText = titleText;
    this.topAppBar = topAppBar;
    this.tvForgotPassword = tvForgotPassword;
    this.welcomeTextTitle = welcomeTextTitle;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnGoogleSignIn;
      ImageButton btnGoogleSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btnGoogleSignIn == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      MaterialButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.ed_login_email;
      EmailEditText edLoginEmail = ViewBindings.findChildViewById(rootView, id);
      if (edLoginEmail == null) {
        break missingId;
      }

      id = R.id.ed_login_password;
      PasswordEditText edLoginPassword = ViewBindings.findChildViewById(rootView, id);
      if (edLoginPassword == null) {
        break missingId;
      }

      id = R.id.formContainer;
      LinearLayout formContainer = ViewBindings.findChildViewById(rootView, id);
      if (formContainer == null) {
        break missingId;
      }

      id = R.id.main;
      ConstraintLayout main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      id = R.id.progressBarLoading;
      ProgressBar progressBarLoading = ViewBindings.findChildViewById(rootView, id);
      if (progressBarLoading == null) {
        break missingId;
      }

      id = R.id.subWelcomeTextTitle;
      TextView subWelcomeTextTitle = ViewBindings.findChildViewById(rootView, id);
      if (subWelcomeTextTitle == null) {
        break missingId;
      }

      id = R.id.textEmailTitle;
      TextView textEmailTitle = ViewBindings.findChildViewById(rootView, id);
      if (textEmailTitle == null) {
        break missingId;
      }

      id = R.id.textOrContinueWith;
      TextView textOrContinueWith = ViewBindings.findChildViewById(rootView, id);
      if (textOrContinueWith == null) {
        break missingId;
      }

      id = R.id.textPasswordTitle;
      TextView textPasswordTitle = ViewBindings.findChildViewById(rootView, id);
      if (textPasswordTitle == null) {
        break missingId;
      }

      id = R.id.title_text;
      TextView titleText = ViewBindings.findChildViewById(rootView, id);
      if (titleText == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      ConstraintLayout topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      id = R.id.tv_forgot_password;
      TextView tvForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvForgotPassword == null) {
        break missingId;
      }

      id = R.id.welcomeTextTitle;
      TextView welcomeTextTitle = ViewBindings.findChildViewById(rootView, id);
      if (welcomeTextTitle == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ScrollView) rootView, btnBack, btnGoogleSignIn, btnLogin,
          edLoginEmail, edLoginPassword, formContainer, main, progressBarLoading,
          subWelcomeTextTitle, textEmailTitle, textOrContinueWith, textPasswordTitle, titleText,
          topAppBar, tvForgotPassword, welcomeTextTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}