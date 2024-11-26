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

public final class ItemArticleBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView articleDescription;

  @NonNull
  public final ShapeableImageView articleImage;

  @NonNull
  public final TextView articleTitle;

  @NonNull
  public final TextView articleType;

  @NonNull
  public final CardView cardView;

  private ItemArticleBinding(@NonNull CardView rootView, @NonNull TextView articleDescription,
      @NonNull ShapeableImageView articleImage, @NonNull TextView articleTitle,
      @NonNull TextView articleType, @NonNull CardView cardView) {
    this.rootView = rootView;
    this.articleDescription = articleDescription;
    this.articleImage = articleImage;
    this.articleTitle = articleTitle;
    this.articleType = articleType;
    this.cardView = cardView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_article, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemArticleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.article_description;
      TextView articleDescription = ViewBindings.findChildViewById(rootView, id);
      if (articleDescription == null) {
        break missingId;
      }

      id = R.id.article_image;
      ShapeableImageView articleImage = ViewBindings.findChildViewById(rootView, id);
      if (articleImage == null) {
        break missingId;
      }

      id = R.id.article_title;
      TextView articleTitle = ViewBindings.findChildViewById(rootView, id);
      if (articleTitle == null) {
        break missingId;
      }

      id = R.id.article_type;
      TextView articleType = ViewBindings.findChildViewById(rootView, id);
      if (articleType == null) {
        break missingId;
      }

      CardView cardView = (CardView) rootView;

      return new ItemArticleBinding((CardView) rootView, articleDescription, articleImage,
          articleTitle, articleType, cardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
