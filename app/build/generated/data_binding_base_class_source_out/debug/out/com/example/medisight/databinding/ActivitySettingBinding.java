// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medisight.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView accessibilityText;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final ImageView icNextAccessibility;

  @NonNull
  public final ImageView icNextLanguage;

  @NonNull
  public final TextView languageText;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView titleText;

  @NonNull
  public final ConstraintLayout topAppBar;

  private ActivitySettingBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView accessibilityText, @NonNull ImageButton btnBack,
      @NonNull ImageView icNextAccessibility, @NonNull ImageView icNextLanguage,
      @NonNull TextView languageText, @NonNull ConstraintLayout main, @NonNull TextView titleText,
      @NonNull ConstraintLayout topAppBar) {
    this.rootView = rootView;
    this.accessibilityText = accessibilityText;
    this.btnBack = btnBack;
    this.icNextAccessibility = icNextAccessibility;
    this.icNextLanguage = icNextLanguage;
    this.languageText = languageText;
    this.main = main;
    this.titleText = titleText;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accessibility_text;
      TextView accessibilityText = ViewBindings.findChildViewById(rootView, id);
      if (accessibilityText == null) {
        break missingId;
      }

      id = R.id.btnBack;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.ic_next_accessibility;
      ImageView icNextAccessibility = ViewBindings.findChildViewById(rootView, id);
      if (icNextAccessibility == null) {
        break missingId;
      }

      id = R.id.ic_next_language;
      ImageView icNextLanguage = ViewBindings.findChildViewById(rootView, id);
      if (icNextLanguage == null) {
        break missingId;
      }

      id = R.id.language_text;
      TextView languageText = ViewBindings.findChildViewById(rootView, id);
      if (languageText == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

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

      return new ActivitySettingBinding((ConstraintLayout) rootView, accessibilityText, btnBack,
          icNextAccessibility, icNextLanguage, languageText, main, titleText, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}