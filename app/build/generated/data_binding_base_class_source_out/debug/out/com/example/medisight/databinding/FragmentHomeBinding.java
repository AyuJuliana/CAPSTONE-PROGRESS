// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medisight.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageButton btnArticle;

  @NonNull
  public final ImageButton btnHealthServices;

  @NonNull
  public final ImageButton btnMedicalResume;

  @NonNull
  public final ImageButton btnMedicine;

  @NonNull
  public final ImageButton btnSettings;

  @NonNull
  public final MaterialCardView cardFeatures;

  @NonNull
  public final ShapeableImageView ivBanner;

  @NonNull
  public final RecyclerView rvHotArticles;

  @NonNull
  public final RecyclerView rvMedicine;

  @NonNull
  public final TextView tvFeatures;

  @NonNull
  public final TextView tvHello;

  @NonNull
  public final TextView tvHotArticle;

  @NonNull
  public final TextView tvMedicine;

  @NonNull
  public final TextView tvSeeAllArticles;

  @NonNull
  public final TextView tvSeeAllMedicine;

  @NonNull
  public final TextView tvUserName;

  private FragmentHomeBinding(@NonNull NestedScrollView rootView, @NonNull ImageButton btnArticle,
      @NonNull ImageButton btnHealthServices, @NonNull ImageButton btnMedicalResume,
      @NonNull ImageButton btnMedicine, @NonNull ImageButton btnSettings,
      @NonNull MaterialCardView cardFeatures, @NonNull ShapeableImageView ivBanner,
      @NonNull RecyclerView rvHotArticles, @NonNull RecyclerView rvMedicine,
      @NonNull TextView tvFeatures, @NonNull TextView tvHello, @NonNull TextView tvHotArticle,
      @NonNull TextView tvMedicine, @NonNull TextView tvSeeAllArticles,
      @NonNull TextView tvSeeAllMedicine, @NonNull TextView tvUserName) {
    this.rootView = rootView;
    this.btnArticle = btnArticle;
    this.btnHealthServices = btnHealthServices;
    this.btnMedicalResume = btnMedicalResume;
    this.btnMedicine = btnMedicine;
    this.btnSettings = btnSettings;
    this.cardFeatures = cardFeatures;
    this.ivBanner = ivBanner;
    this.rvHotArticles = rvHotArticles;
    this.rvMedicine = rvMedicine;
    this.tvFeatures = tvFeatures;
    this.tvHello = tvHello;
    this.tvHotArticle = tvHotArticle;
    this.tvMedicine = tvMedicine;
    this.tvSeeAllArticles = tvSeeAllArticles;
    this.tvSeeAllMedicine = tvSeeAllMedicine;
    this.tvUserName = tvUserName;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnArticle;
      ImageButton btnArticle = ViewBindings.findChildViewById(rootView, id);
      if (btnArticle == null) {
        break missingId;
      }

      id = R.id.btnHealthServices;
      ImageButton btnHealthServices = ViewBindings.findChildViewById(rootView, id);
      if (btnHealthServices == null) {
        break missingId;
      }

      id = R.id.btnMedicalResume;
      ImageButton btnMedicalResume = ViewBindings.findChildViewById(rootView, id);
      if (btnMedicalResume == null) {
        break missingId;
      }

      id = R.id.btnMedicine;
      ImageButton btnMedicine = ViewBindings.findChildViewById(rootView, id);
      if (btnMedicine == null) {
        break missingId;
      }

      id = R.id.btnSettings;
      ImageButton btnSettings = ViewBindings.findChildViewById(rootView, id);
      if (btnSettings == null) {
        break missingId;
      }

      id = R.id.cardFeatures;
      MaterialCardView cardFeatures = ViewBindings.findChildViewById(rootView, id);
      if (cardFeatures == null) {
        break missingId;
      }

      id = R.id.ivBanner;
      ShapeableImageView ivBanner = ViewBindings.findChildViewById(rootView, id);
      if (ivBanner == null) {
        break missingId;
      }

      id = R.id.rvHotArticles;
      RecyclerView rvHotArticles = ViewBindings.findChildViewById(rootView, id);
      if (rvHotArticles == null) {
        break missingId;
      }

      id = R.id.rvMedicine;
      RecyclerView rvMedicine = ViewBindings.findChildViewById(rootView, id);
      if (rvMedicine == null) {
        break missingId;
      }

      id = R.id.tvFeatures;
      TextView tvFeatures = ViewBindings.findChildViewById(rootView, id);
      if (tvFeatures == null) {
        break missingId;
      }

      id = R.id.tvHello;
      TextView tvHello = ViewBindings.findChildViewById(rootView, id);
      if (tvHello == null) {
        break missingId;
      }

      id = R.id.tvHotArticle;
      TextView tvHotArticle = ViewBindings.findChildViewById(rootView, id);
      if (tvHotArticle == null) {
        break missingId;
      }

      id = R.id.tvMedicine;
      TextView tvMedicine = ViewBindings.findChildViewById(rootView, id);
      if (tvMedicine == null) {
        break missingId;
      }

      id = R.id.tvSeeAllArticles;
      TextView tvSeeAllArticles = ViewBindings.findChildViewById(rootView, id);
      if (tvSeeAllArticles == null) {
        break missingId;
      }

      id = R.id.tvSeeAllMedicine;
      TextView tvSeeAllMedicine = ViewBindings.findChildViewById(rootView, id);
      if (tvSeeAllMedicine == null) {
        break missingId;
      }

      id = R.id.tvUserName;
      TextView tvUserName = ViewBindings.findChildViewById(rootView, id);
      if (tvUserName == null) {
        break missingId;
      }

      return new FragmentHomeBinding((NestedScrollView) rootView, btnArticle, btnHealthServices,
          btnMedicalResume, btnMedicine, btnSettings, cardFeatures, ivBanner, rvHotArticles,
          rvMedicine, tvFeatures, tvHello, tvHotArticle, tvMedicine, tvSeeAllArticles,
          tvSeeAllMedicine, tvUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
