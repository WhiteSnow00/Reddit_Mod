// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.toast;

import android.view.ViewGroup$MarginLayoutParams;
import android.animation.Animator;
import hg2.j;
import android.util.Property;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;
import z92.c;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$MeasureSpec;
import com.reddit.vault.util.PointsFormat;
import fb2.g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import jq0.f;
import a4.a0;
import kotlin.NoWhenBranchMatchedException;
import s82.e0;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.Button;
import a92.b;
import android.widget.TextView;
import android.content.Context;
import android.view.LayoutInflater;
import java.math.BigInteger;
import x82.h;
import android.animation.Animator$AnimatorListener;
import z92.d;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import javax.inject.Inject;
import android.app.Application$ActivityLifecycleCallbacks;
import sg2.e;
import android.app.Application;
import java.util.concurrent.TimeUnit;
import android.app.Activity;

public final class a implements z92.a
{
    public static final long b;
    public Activity a;
    
    static {
        b = TimeUnit.MILLISECONDS.convert(6L, TimeUnit.SECONDS);
    }
    
    @Inject
    public a(final Application application) {
        e.f((Object)application, "application");
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new a$a(this));
    }
    
    public static void b(final int n, final ConstraintLayout constraintLayout, final ViewGroup viewGroup) {
        final Object tag = ((View)constraintLayout).getTag();
        final Boolean true = Boolean.TRUE;
        if (!e.a(tag, (Object)true)) {
            ((View)constraintLayout).setTag((Object)true);
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)constraintLayout, View.TRANSLATION_Y, new float[] { (float)n });
            ((Animator)ofFloat).addListener((Animator$AnimatorListener)new d(viewGroup, constraintLayout));
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }
    
    @Override
    public final void a(final ToastState toastState, final String text, final h h, final BigInteger bigInteger, final rg2.a a) {
        e.f((Object)toastState, "state");
        e.f((Object)text, "detail");
        final Activity a2 = this.a;
        if (a2 == null) {
            return;
        }
        final String string = ((Context)a2).getString(2131955151);
        e.e((Object)string, "activity.getString(title)");
        final Activity a3 = this.a;
        if (a3 != null) {
            final ViewGroup viewGroup = (ViewGroup)a3.findViewById(16908290);
            if (viewGroup != null) {
                final View inflate = LayoutInflater.from((Context)a3).inflate(2131625556, viewGroup, false);
                int n = 2131428680;
                final TextView textView = (TextView)a92.b.G(2131428680, inflate);
                if (textView != null) {
                    n = 2131429315;
                    final Button button = (Button)a92.b.G(2131429315, inflate);
                    if (button != null) {
                        n = 2131429984;
                        final LottieAnimationView lottieAnimationView = (LottieAnimationView)a92.b.G(2131429984, inflate);
                        if (lottieAnimationView != null) {
                            n = 2131430489;
                            final ImageView imageView = (ImageView)a92.b.G(2131430489, inflate);
                            if (imageView != null) {
                                final TextView textView2 = (TextView)a92.b.G(2131430499, inflate);
                                if (textView2 != null) {
                                    final ToastTimer toastTimer = (ToastTimer)a92.b.G(2131431739, inflate);
                                    if (toastTimer != null) {
                                        final TextView textView3 = (TextView)a92.b.G(2131431743, inflate);
                                        if (textView3 != null) {
                                            final ConstraintLayout constraintLayout = (ConstraintLayout)inflate;
                                            final e0 e0 = new e0(constraintLayout, textView, button, lottieAnimationView, imageView, textView2, toastTimer, textView3);
                                            final int n2 = a$b.a[((Enum)toastState).ordinal()];
                                            int color;
                                            int backgroundResource;
                                            String animation;
                                            if (n2 != 1) {
                                                if (n2 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                color = n3.a.getColor((Context)a3, 2131100573);
                                                backgroundResource = 2131231011;
                                                animation = "tx_complete_state.json";
                                            }
                                            else {
                                                final LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                                                lottieAnimationView2.setRepeatCount(-1);
                                                color = a0.L((Context)a3, 2130969589, 255);
                                                lottieAnimationView2.n.g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new f((Object)e0, 2));
                                                backgroundResource = 2131231012;
                                                animation = "tx_processing_state.json";
                                            }
                                            e.e((Object)constraintLayout, "toast.root");
                                            ((View)constraintLayout).setTag((Object)Boolean.FALSE);
                                            ((View)constraintLayout).setBackgroundResource(backgroundResource);
                                            lottieAnimationView.setAnimation(animation);
                                            textView3.setText((CharSequence)string);
                                            textView.setText((CharSequence)text);
                                            final com.reddit.vault.g g = null;
                                            if (bigInteger != null && !e.a((Object)bigInteger, (Object)BigInteger.ZERO)) {
                                                String n3;
                                                if (h != null) {
                                                    n3 = h.n;
                                                }
                                                else {
                                                    n3 = null;
                                                }
                                                fb2.g.b(imageView, n3, 2131231702);
                                                textView2.setText((CharSequence)PointsFormat.b(bigInteger, true));
                                            }
                                            else {
                                                ((View)imageView).setVisibility(8);
                                                ((View)textView2).setVisibility(8);
                                            }
                                            ((View)constraintLayout).measure(View$MeasureSpec.makeMeasureSpec(100000, 1073741824), 0);
                                            viewGroup.addView((View)constraintLayout);
                                            com.reddit.vault.g g2 = g;
                                            if (a3 instanceof com.reddit.vault.g) {
                                                g2 = (com.reddit.vault.g)a3;
                                            }
                                            final int n4 = (int)((Context)a3).getResources().getDimension(2131166674);
                                            final int n5 = (int)((Context)a3).getResources().getDimension(2131166539);
                                            if (g2 != null) {
                                                g2.a();
                                            }
                                            final int systemWindowInsetBottom = ((View)constraintLayout).getRootWindowInsets().getSystemWindowInsetBottom();
                                            final ViewGroup$LayoutParams layoutParams = ((View)constraintLayout).getLayoutParams();
                                            if (layoutParams != null) {
                                                final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
                                                layoutParams2.gravity = 81;
                                                final int n6 = n5 + systemWindowInsetBottom;
                                                ((ViewGroup$MarginLayoutParams)layoutParams2).setMargins(n4, 0, n4, n6);
                                                ((View)constraintLayout).setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                                                final int n7 = ((View)constraintLayout).getMeasuredHeight() + n6;
                                                ((View)button).setOnClickListener((View$OnClickListener)new z92.b(this, e0, viewGroup, n7));
                                                ((View)constraintLayout).setOnClickListener((View$OnClickListener)new c(this, e0, viewGroup, n7, a));
                                                final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)constraintLayout, View.TRANSLATION_Y, new float[] { (float)n7, 0.0f });
                                                ofFloat.setDuration(300L);
                                                ((Animator)ofFloat).setInterpolator((TimeInterpolator)new OvershootInterpolator(2.2f));
                                                ofFloat.start();
                                                final long b = a.b;
                                                final ToastManagerImpl$displayToast$5 toastManagerImpl$displayToast$5 = new ToastManagerImpl$displayToast$5(this, e0, viewGroup, n7);
                                                toastTimer.i.setColor(color);
                                                final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)toastTimer, (Property)ToastTimer$a.a, new float[] { 0.0f, 1.0f });
                                                ((Animator)ofFloat2).addListener((Animator$AnimatorListener)new z92.e(toastManagerImpl$displayToast$5));
                                                ofFloat2.setDuration(b);
                                                ofFloat2.start();
                                                return;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                                        }
                                        else {
                                            n = 2131431743;
                                        }
                                    }
                                    else {
                                        n = 2131431739;
                                    }
                                }
                                else {
                                    n = 2131430499;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(n)));
            }
        }
    }
}
