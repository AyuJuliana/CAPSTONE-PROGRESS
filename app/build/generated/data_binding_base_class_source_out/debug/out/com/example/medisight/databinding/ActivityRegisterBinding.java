// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final ImageButton btnGoogleSignIn;

  @NonNull
  public final MaterialButton btnSignUp;

  @NonNull
  public final EmailEditText edRegisterEmail;

  @NonNull
  public final EditText edRegisterName;

  @NonNull
  public final PasswordEditText edRegisterPassword;

  @NonNull
  public final PasswordEditText editTextConfirmPassword;

  @NonNull
  public final LinearLayout formContainer;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progressBarLoading;

  @NonNull
  public final TextView textConfirmPasswordTitle;

  @NonNull
  public final TextView textEmailTitle;

  @NonNull
  public final TextView textOrContinueWith;

  @NonNull
  public final TextView textPasswordTitle;

  @NonNull
  public final TextView textUsernameTitle;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final ConstraintLayout topAppBar;

  private ActivityRegisterBinding(@NonNull ScrollView rootView, @NonNull ImageButton btnBack,
      @NonNull ImageButton btnGoogleSignIn, @NonNull MaterialButton btnSignUp,
      @NonNull EmailEditText edRegisterEmail, @NonNull EditText edRegisterName,
      @NonNull PasswordEditText edRegisterPassword,
      @NonNull PasswordEditText editTextConfirmPassword, @NonNull LinearLayout formContainer,
      @NonNull ConstraintLayout main, @NonNull ProgressBar progressBarLoading,
      @NonNull TextView textConfirmPasswordTitle, @NonNull TextView textEmailTitle,
      @NonNull TextView textOrContinueWith, @NonNull TextView textPasswordTitle,
      @NonNull TextView textUsernameTitle, @NonNull TextView titleText,
      @NonNull ConstraintLayout topAppBar) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnGoogleSignIn = btnGoogleSignIn;
    this.btnSignUp = btnSignUp;
    this.edRegisterEmail = edRegisterEmail;
    this.edRegisterName = edRegisterName;
    this.edRegisterPassword = edRegisterPassword;
    this.editTextConfirmPassword = editTextConfirmPassword;
    this.formContainer = formContainer;
    this.main = main;
    this.progressBarLoading = progressBarLoading;
    this.textConfirmPasswordTitle = textConfirmPasswordTitle;
    this.textEmailTitle = textEmailTitle;
    this.textOrContinueWith = textOrContinueWith;
    this.textPasswordTitle = textPasswordTitle;
    this.textUsernameTitle = textUsernameTitle;
    this.titleText = titleText;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
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

      id = R.id.btnSignUp;
      MaterialButton btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.ed_register_email;
      EmailEditText edRegisterEmail = ViewBindings.findChildViewById(rootView, id);
      if (edRegisterEmail == null) {
        break missingId;
      }

      id = R.id.ed_register_name;
      EditText edRegisterName = ViewBindings.findChildViewById(rootView, id);
      if (edRegisterName == null) {
        break missingId;
      }

      id = R.id.ed_register_password;
      PasswordEditText edRegisterPassword = ViewBindings.findChildViewById(rootView, id);
      if (edRegisterPassword == null) {
        break missingId;
      }

      id = R.id.editTextConfirmPassword;
      PasswordEditText editTextConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextConfirmPassword == null) {
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

      id = R.id.textConfirmPasswordTitle;
      TextView textConfirmPasswordTitle = ViewBindings.findChildViewById(rootView, id);
      if (textConfirmPasswordTitle == null) {
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

      id = R.id.textUsernameTitle;
      TextView textUsernameTitle = ViewBindings.findChildViewById(rootView, id);
      if (textUsernameTitle == null) {
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

      return new ActivityRegisterBinding((ScrollView) rootView, btnBack, btnGoogleSignIn, btnSignUp,
          edRegisterEmail, edRegisterName, edRegisterPassword, editTextConfirmPassword,
          formContainer, main, progressBarLoading, textConfirmPasswordTitle, textEmailTitle,
          textOrContinueWith, textPasswordTitle, textUsernameTitle, titleText, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
