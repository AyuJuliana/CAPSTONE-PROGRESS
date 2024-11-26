// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medisight.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemHealthServiceBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView healthServiceAddress;

  @NonNull
  public final ShapeableImageView healthServiceImage;

  @NonNull
  public final TextView healthServiceTitle;

  @NonNull
  public final TextView healthServiceType;

  private ItemHealthServiceBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView healthServiceAddress, @NonNull ShapeableImageView healthServiceImage,
      @NonNull TextView healthServiceTitle, @NonNull TextView healthServiceType) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.healthServiceAddress = healthServiceAddress;
    this.healthServiceImage = healthServiceImage;
    this.healthServiceTitle = healthServiceTitle;
    this.healthServiceType = healthServiceType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemHealthServiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemHealthServiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_health_service, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemHealthServiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.health_service_address;
      TextView healthServiceAddress = ViewBindings.findChildViewById(rootView, id);
      if (healthServiceAddress == null) {
        break missingId;
      }

      id = R.id.health_service_image;
      ShapeableImageView healthServiceImage = ViewBindings.findChildViewById(rootView, id);
      if (healthServiceImage == null) {
        break missingId;
      }

      id = R.id.health_service_title;
      TextView healthServiceTitle = ViewBindings.findChildViewById(rootView, id);
      if (healthServiceTitle == null) {
        break missingId;
      }

      id = R.id.health_service_type;
      TextView healthServiceType = ViewBindings.findChildViewById(rootView, id);
      if (healthServiceType == null) {
        break missingId;
      }

      return new ItemHealthServiceBinding((CardView) rootView, cardView, healthServiceAddress,
          healthServiceImage, healthServiceTitle, healthServiceType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
