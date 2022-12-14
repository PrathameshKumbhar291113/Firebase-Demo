// Generated by view binder compiler. Do not edit!
package com.example.firebasedemo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebasedemo.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView notRegisteredSignUpTextView;

  @NonNull
  public final AppCompatButton signInBtn;

  @NonNull
  public final TextInputEditText signInEmail;

  @NonNull
  public final TextInputEditText signInPassword;

  @NonNull
  public final TextView textView;

  private ActivitySignInBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView notRegisteredSignUpTextView, @NonNull AppCompatButton signInBtn,
      @NonNull TextInputEditText signInEmail, @NonNull TextInputEditText signInPassword,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.notRegisteredSignUpTextView = notRegisteredSignUpTextView;
    this.signInBtn = signInBtn;
    this.signInEmail = signInEmail;
    this.signInPassword = signInPassword;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.notRegistered_signUp_textView;
      TextView notRegisteredSignUpTextView = ViewBindings.findChildViewById(rootView, id);
      if (notRegisteredSignUpTextView == null) {
        break missingId;
      }

      id = R.id.signIn_btn;
      AppCompatButton signInBtn = ViewBindings.findChildViewById(rootView, id);
      if (signInBtn == null) {
        break missingId;
      }

      id = R.id.signIn_email;
      TextInputEditText signInEmail = ViewBindings.findChildViewById(rootView, id);
      if (signInEmail == null) {
        break missingId;
      }

      id = R.id.signIn_password;
      TextInputEditText signInPassword = ViewBindings.findChildViewById(rootView, id);
      if (signInPassword == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivitySignInBinding((ConstraintLayout) rootView, notRegisteredSignUpTextView,
          signInBtn, signInEmail, signInPassword, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
