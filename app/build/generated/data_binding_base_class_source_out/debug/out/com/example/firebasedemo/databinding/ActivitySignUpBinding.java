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

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView alreadyRegisteredSignInTextView;

  @NonNull
  public final TextInputEditText confirmSignUpPassword;

  @NonNull
  public final AppCompatButton signUpBtn;

  @NonNull
  public final TextInputEditText signUpEmail;

  @NonNull
  public final TextInputEditText signUpPassword;

  @NonNull
  public final TextView textView;

  private ActivitySignUpBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView alreadyRegisteredSignInTextView,
      @NonNull TextInputEditText confirmSignUpPassword, @NonNull AppCompatButton signUpBtn,
      @NonNull TextInputEditText signUpEmail, @NonNull TextInputEditText signUpPassword,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.alreadyRegisteredSignInTextView = alreadyRegisteredSignInTextView;
    this.confirmSignUpPassword = confirmSignUpPassword;
    this.signUpBtn = signUpBtn;
    this.signUpEmail = signUpEmail;
    this.signUpPassword = signUpPassword;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.alreadyRegistered_signIn_textView;
      TextView alreadyRegisteredSignInTextView = ViewBindings.findChildViewById(rootView, id);
      if (alreadyRegisteredSignInTextView == null) {
        break missingId;
      }

      id = R.id.confirm_signUp_password;
      TextInputEditText confirmSignUpPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmSignUpPassword == null) {
        break missingId;
      }

      id = R.id.signUp_btn;
      AppCompatButton signUpBtn = ViewBindings.findChildViewById(rootView, id);
      if (signUpBtn == null) {
        break missingId;
      }

      id = R.id.signUp_email;
      TextInputEditText signUpEmail = ViewBindings.findChildViewById(rootView, id);
      if (signUpEmail == null) {
        break missingId;
      }

      id = R.id.signUp_password;
      TextInputEditText signUpPassword = ViewBindings.findChildViewById(rootView, id);
      if (signUpPassword == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ConstraintLayout) rootView, alreadyRegisteredSignInTextView,
          confirmSignUpPassword, signUpBtn, signUpEmail, signUpPassword, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
