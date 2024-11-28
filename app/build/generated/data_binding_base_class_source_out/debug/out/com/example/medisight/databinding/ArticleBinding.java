// Generated by view binder compiler. Do not edit!
package com.example.medisight.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.medisight.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.search.SearchBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ArticleBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final Chip chip1;

  @NonNull
  public final Chip chip2;

  @NonNull
  public final Chip chip3;

  @NonNull
  public final ChipGroup chipGroup;

  @NonNull
  public final TextView hotArticle;

  @NonNull
  public final TextView konteks;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RecyclerView recyclerView2;

  @NonNull
  public final SearchBar searchBar;

  @NonNull
  public final TextView toolbarTitle;

  @NonNull
  public final MaterialToolbar topAppBar;

  private ArticleBinding(@NonNull CoordinatorLayout rootView, @NonNull Chip chip1,
      @NonNull Chip chip2, @NonNull Chip chip3, @NonNull ChipGroup chipGroup,
      @NonNull TextView hotArticle, @NonNull TextView konteks, @NonNull RecyclerView recyclerView,
      @NonNull RecyclerView recyclerView2, @NonNull SearchBar searchBar,
      @NonNull TextView toolbarTitle, @NonNull MaterialToolbar topAppBar) {
    this.rootView = rootView;
    this.chip1 = chip1;
    this.chip2 = chip2;
    this.chip3 = chip3;
    this.chipGroup = chipGroup;
    this.hotArticle = hotArticle;
    this.konteks = konteks;
    this.recyclerView = recyclerView;
    this.recyclerView2 = recyclerView2;
    this.searchBar = searchBar;
    this.toolbarTitle = toolbarTitle;
    this.topAppBar = topAppBar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ArticleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.article, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ArticleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chip_1;
      Chip chip1 = ViewBindings.findChildViewById(rootView, id);
      if (chip1 == null) {
        break missingId;
      }

      id = R.id.chip_2;
      Chip chip2 = ViewBindings.findChildViewById(rootView, id);
      if (chip2 == null) {
        break missingId;
      }

      id = R.id.chip_3;
      Chip chip3 = ViewBindings.findChildViewById(rootView, id);
      if (chip3 == null) {
        break missingId;
      }

      id = R.id.chip_group;
      ChipGroup chipGroup = ViewBindings.findChildViewById(rootView, id);
      if (chipGroup == null) {
        break missingId;
      }

      id = R.id.hot_article;
      TextView hotArticle = ViewBindings.findChildViewById(rootView, id);
      if (hotArticle == null) {
        break missingId;
      }

      id = R.id.konteks;
      TextView konteks = ViewBindings.findChildViewById(rootView, id);
      if (konteks == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.recyclerView2;
      RecyclerView recyclerView2 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView2 == null) {
        break missingId;
      }

      id = R.id.search_bar;
      SearchBar searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.toolbarTitle;
      TextView toolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitle == null) {
        break missingId;
      }

      id = R.id.topAppBar;
      MaterialToolbar topAppBar = ViewBindings.findChildViewById(rootView, id);
      if (topAppBar == null) {
        break missingId;
      }

      return new ArticleBinding((CoordinatorLayout) rootView, chip1, chip2, chip3, chipGroup,
          hotArticle, konteks, recyclerView, recyclerView2, searchBar, toolbarTitle, topAppBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}