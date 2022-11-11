// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.view.View;
import com.twitter.sdk.android.core.internal.CommonUtils;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.twitter.sdk.android.core.R$color;
import com.twitter.sdk.android.core.R$string;
import com.twitter.sdk.android.core.R$dimen;
import android.graphics.drawable.Drawable;
import com.twitter.sdk.android.core.R$drawable;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterCore;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.Callback;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.widget.Button;

public class TwitterLoginButton extends Button
{
    public static final String ERROR_MSG_NO_ACTIVITY = "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.";
    public static final String TAG = "Twitter";
    public final WeakReference<Activity> activityRef;
    public volatile TwitterAuthClient authClient;
    public Callback<TwitterSession> callback;
    public View$OnClickListener onClickListener;
    
    public TwitterLoginButton(final Context context) {
        this(context, null);
    }
    
    public TwitterLoginButton(final Context context, final AttributeSet set) {
        this(context, set, 16842824);
    }
    
    public TwitterLoginButton(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, null);
    }
    
    public TwitterLoginButton(final Context context, final AttributeSet set, final int n, final TwitterAuthClient authClient) {
        super(context, set, n);
        this.activityRef = new WeakReference<Activity>(this.getActivity());
        this.authClient = authClient;
        this.setupButton();
        this.checkTwitterCoreAndEnable();
    }
    
    private void checkTwitterCoreAndEnable() {
        if (((View)this).isInEditMode()) {
            return;
        }
        try {
            TwitterCore.getInstance();
        }
        catch (final IllegalStateException ex) {
            Twitter.getLogger().e("Twitter", ex.getMessage());
            ((View)this).setEnabled(false);
        }
    }
    
    private void setupButton() {
        final Resources resources = ((View)this).getResources();
        super.setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(R$drawable.tw__ic_logo_default), (Drawable)null, (Drawable)null, (Drawable)null);
        super.setCompoundDrawablePadding(resources.getDimensionPixelSize(R$dimen.tw__login_btn_drawable_padding));
        super.setText(R$string.tw__login_btn_txt);
        super.setTextColor(resources.getColor(R$color.tw__solid_white));
        super.setTextSize(0, (float)resources.getDimensionPixelSize(R$dimen.tw__login_btn_text_size));
        super.setTypeface(Typeface.DEFAULT_BOLD);
        super.setPadding(resources.getDimensionPixelSize(R$dimen.tw__login_btn_left_padding), 0, resources.getDimensionPixelSize(R$dimen.tw__login_btn_right_padding), 0);
        super.setBackgroundResource(R$drawable.tw__login_btn);
        super.setOnClickListener((View$OnClickListener)new LoginClickListener(null));
        super.setAllCaps(false);
    }
    
    public Activity getActivity() {
        if (((View)this).getContext() instanceof Activity) {
            return (Activity)((View)this).getContext();
        }
        if (((View)this).isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }
    
    public Callback<TwitterSession> getCallback() {
        return this.callback;
    }
    
    public TwitterAuthClient getTwitterAuthClient() {
        if (this.authClient == null) {
            synchronized (TwitterLoginButton.class) {
                if (this.authClient == null) {
                    this.authClient = new TwitterAuthClient();
                }
            }
        }
        return this.authClient;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == this.getTwitterAuthClient().getRequestCode()) {
            this.getTwitterAuthClient().onActivityResult(n, n2, intent);
        }
    }
    
    public void setCallback(final Callback<TwitterSession> callback) {
        if (callback != null) {
            this.callback = callback;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }
    
    public void setOnClickListener(final View$OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    
    public class LoginClickListener implements View$OnClickListener
    {
        private LoginClickListener() {
        }
        
        private void checkActivity(final Activity activity) {
            if (activity == null || activity.isFinishing()) {
                CommonUtils.logOrThrowIllegalStateException("Twitter", "TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
            }
        }
        
        private void checkCallback(final Callback callback) {
            if (callback == null) {
                CommonUtils.logOrThrowIllegalStateException("Twitter", "Callback must not be null, did you call setCallback?");
            }
        }
        
        public void onClick(final View view) {
            this.checkCallback(TwitterLoginButton.this.callback);
            this.checkActivity(TwitterLoginButton.this.activityRef.get());
            TwitterLoginButton.this.getTwitterAuthClient().authorize(TwitterLoginButton.this.activityRef.get(), TwitterLoginButton.this.callback);
            final View$OnClickListener onClickListener = TwitterLoginButton.this.onClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
