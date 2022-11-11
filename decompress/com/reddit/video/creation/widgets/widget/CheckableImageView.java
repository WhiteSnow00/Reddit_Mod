// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.widgets.widget;

import v5.b;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Animatable;
import v5.c;
import rl1.a;
import android.view.View;
import android.view.View$OnClickListener;
import android.util.AttributeSet;
import sg2.e;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageView;

@Metadata(bv = {}, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007R\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006&" }, d2 = { "Lcom/reddit/video/creation/widgets/widget/CheckableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/Checkable;", "", "extraSpace", "", "onCreateDrawableState", "", "checked", "Lhg2/j;", "setChecked", "isChecked", "toggle", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "state", "startAnimation", "isAnimating", "Z", "()Z", "setAnimating", "(Z)V", "stateToSet", "Ljava/lang/Boolean;", "getStateToSet", "()Ljava/lang/Boolean;", "setStateToSet", "(Ljava/lang/Boolean;)V", "mChecked", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "widgets_release" }, k = 1, mv = { 1, 7, 1 })
public final class CheckableImageView extends AppCompatImageView implements Checkable
{
    private static final int[] CHECKED_STATE_SET;
    public static final CheckableImageView.CheckableImageView$Companion Companion;
    private boolean isAnimating;
    private boolean mChecked;
    private Boolean stateToSet;
    
    static {
        Companion = new CheckableImageView.CheckableImageView$Companion((DefaultConstructorMarker)null);
        CHECKED_STATE_SET = new int[] { 16842912 };
    }
    
    public CheckableImageView(final Context context) {
        e.f((Object)context, "context");
        super(context);
    }
    
    public CheckableImageView(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        super(context, set);
    }
    
    private static final void setOnClickListener$lambda-0(final CheckableImageView checkableImageView, final View$OnClickListener view$OnClickListener, final View view) {
        e.f((Object)checkableImageView, "this$0");
        checkableImageView.toggle();
        if (view$OnClickListener != null) {
            view$OnClickListener.onClick(view);
        }
    }
    
    public final Boolean getStateToSet() {
        return this.stateToSet;
    }
    
    public final boolean isAnimating() {
        return this.isAnimating;
    }
    
    public boolean isChecked() {
        return this.mChecked;
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CheckableImageView.CHECKED_STATE_SET);
        }
        e.e((Object)onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }
    
    public final void setAnimating(final boolean isAnimating) {
        this.isAnimating = isAnimating;
    }
    
    public void setChecked(final boolean mChecked) {
        if (this.mChecked != mChecked) {
            this.mChecked = mChecked;
            ((View)this).refreshDrawableState();
        }
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        super.setOnClickListener((View$OnClickListener)new a(22, (Object)this, (Object)view$OnClickListener));
    }
    
    public final void setStateToSet(final Boolean stateToSet) {
        this.stateToSet = stateToSet;
    }
    
    public final void startAnimation(final boolean b) {
        final Drawable current = ((ImageView)this).getDrawable().getCurrent();
        e.e((Object)current, "drawable.current");
        final CheckableImageView$startAnimation.CheckableImageView$startAnimation$1 checkableImageView$startAnimation$1 = new CheckableImageView$startAnimation.CheckableImageView$startAnimation$1(this, b);
        final int g = c.g;
        if (current instanceof Animatable) {
            ((AnimatedVectorDrawable)current).registerAnimationCallback(((b)checkableImageView$startAnimation$1).getPlatformCallback());
        }
        this.isAnimating = true;
        this.stateToSet = b;
        ((Animatable)current).start();
    }
    
    public void toggle() {
        this.setChecked(this.mChecked ^ true);
    }
}
