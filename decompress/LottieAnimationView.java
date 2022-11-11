// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie;

import android.view.AbsSavedState;
import android.widget.ImageView;
import android.animation.ValueAnimator;
import q6.l0;
import android.graphics.Bitmap;
import java.util.Iterator;
import q6.f0;
import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import com.airbnb.lottie.model.layer.b;
import q6.k;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import q6.m;
import android.text.TextUtils;
import android.os.Parcelable;
import q6.h0;
import java.util.concurrent.Callable;
import q6.r;
import q6.i;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import q6.j0;
import c7.g$a;
import android.content.res.TypedArray;
import android.provider.Settings$Global;
import c7.g;
import d7.c;
import q6.k0;
import n3.a;
import q6.g0;
import w6.d;
import android.util.AttributeSet;
import android.content.Context;
import q6.h;
import q6.i0;
import java.util.HashSet;
import q6.e0;
import q6.e;
import q6.f;
import androidx.appcompat.widget.AppCompatImageView;

public class LottieAnimationView extends AppCompatImageView
{
    public static final f x;
    public final e j;
    public final LottieAnimationView$a k;
    public e0<Throwable> l;
    public int m;
    public final LottieDrawable n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final HashSet t;
    public final HashSet u;
    public i0<h> v;
    public h w;
    
    static {
        x = new f();
    }
    
    public LottieAnimationView(final Context context, final AttributeSet set) {
        super(context, set);
        this.j = new e(this);
        this.k = new e0<Throwable>() {
            @Override
            public final void onResult(final Object o) {
                final Throwable t = (Throwable)o;
                final LottieAnimationView a = LottieAnimationView.this;
                final int m = a.m;
                if (m != 0) {
                    a.setImageResource(m);
                }
                e0<Throwable> e0;
                if ((e0 = LottieAnimationView.this.l) == null) {
                    e0 = LottieAnimationView.x;
                }
                e0.onResult(t);
            }
        };
        boolean b = false;
        this.m = 0;
        final LottieDrawable n = new LottieDrawable();
        this.n = n;
        this.q = false;
        this.r = false;
        this.s = true;
        this.t = new HashSet();
        this.u = new HashSet();
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, mk2.e.Y, 2130969363, 0);
        this.s = obtainStyledAttributes.getBoolean(1, true);
        final boolean hasValue = obtainStyledAttributes.hasValue(11);
        final boolean hasValue2 = obtainStyledAttributes.hasValue(6);
        final boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            final int resourceId = obtainStyledAttributes.getResourceId(11, 0);
            if (resourceId != 0) {
                this.setAnimation(resourceId);
            }
        }
        else if (hasValue2) {
            final String string = obtainStyledAttributes.getString(6);
            if (string != null) {
                this.setAnimation(string);
            }
        }
        else if (hasValue3) {
            final String string2 = obtainStyledAttributes.getString(16);
            if (string2 != null) {
                this.setAnimationFromUrl(string2);
            }
        }
        this.setFallbackResource(obtainStyledAttributes.getResourceId(5, 0));
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.r = true;
        }
        if (obtainStyledAttributes.getBoolean(9, false)) {
            ((ValueAnimator)n.g).setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            this.setRepeatMode(obtainStyledAttributes.getInt(14, 1));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.setRepeatCount(obtainStyledAttributes.getInt(13, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            this.setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.setClipToCompositionBounds(obtainStyledAttributes.getBoolean(2, true));
        }
        this.setImageAssetsFolder(obtainStyledAttributes.getString(8));
        this.setProgress(obtainStyledAttributes.getFloat(10, 0.0f));
        final boolean boolean1 = obtainStyledAttributes.getBoolean(4, false);
        if (n.q != boolean1) {
            n.q = boolean1;
            if (n.f != null) {
                n.c();
            }
        }
        if (obtainStyledAttributes.hasValue(3)) {
            n.a(new d(new String[] { "**" }), (Object)g0.K, new c(new k0(a.getColorStateList(((View)this).getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            final RenderMode automatic = RenderMode.AUTOMATIC;
            int n2;
            if ((n2 = obtainStyledAttributes.getInt(12, ((Enum)automatic).ordinal())) >= RenderMode.values().length) {
                n2 = ((Enum)automatic).ordinal();
            }
            this.setRenderMode(RenderMode.values()[n2]);
        }
        this.setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(7, false));
        obtainStyledAttributes.recycle();
        final Context context2 = ((View)this).getContext();
        final g$a a = g.a;
        if (Settings$Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            b = true;
        }
        n.h = (boolean)b;
    }
    
    private void setCompositionTask(final i0<h> v) {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_ANIMATION);
        this.w = null;
        this.n.d();
        this.g();
        v.b(this.j);
        v.a(this.k);
        this.v = v;
    }
    
    public final void f() {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.PLAY_OPTION);
        final LottieDrawable n = this.n;
        n.l.clear();
        n.g.cancel();
        if (!((Drawable)n).isVisible()) {
            n.k = LottieDrawable$OnVisibleAction.NONE;
        }
    }
    
    public final void g() {
        i0<h> i0 = this.v;
        if (i0 != null) {
            final e j = this.j;
            synchronized (i0) {
                i0.a.remove(j);
                monitorexit(i0);
                i0 = this.v;
                final e0<Throwable> k = this.k;
                synchronized (i0) {
                    i0.b.remove(k);
                }
            }
        }
    }
    
    public boolean getClipToCompositionBounds() {
        return this.n.s;
    }
    
    public h getComposition() {
        return this.w;
    }
    
    public long getDuration() {
        final h w = this.w;
        long n;
        if (w != null) {
            n = (long)w.b();
        }
        else {
            n = 0L;
        }
        return n;
    }
    
    public int getFrame() {
        return (int)this.n.g.k;
    }
    
    public String getImageAssetsFolder() {
        return this.n.o;
    }
    
    public boolean getMaintainOriginalImageBounds() {
        return this.n.r;
    }
    
    public float getMaxFrame() {
        return this.n.g.d();
    }
    
    public float getMinFrame() {
        return this.n.g.e();
    }
    
    public j0 getPerformanceTracker() {
        final h f = this.n.f;
        j0 a;
        if (f != null) {
            a = f.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public float getProgress() {
        final c7.d g = this.n.g;
        final h o = g.o;
        float n;
        if (o == null) {
            n = 0.0f;
        }
        else {
            final float k = g.k;
            final float i = o.k;
            n = (k - i) / (o.l - i);
        }
        return n;
    }
    
    public RenderMode getRenderMode() {
        RenderMode renderMode;
        if (this.n.z) {
            renderMode = RenderMode.SOFTWARE;
        }
        else {
            renderMode = RenderMode.HARDWARE;
        }
        return renderMode;
    }
    
    public int getRepeatCount() {
        return ((ValueAnimator)this.n.g).getRepeatCount();
    }
    
    public int getRepeatMode() {
        return ((ValueAnimator)this.n.g).getRepeatMode();
    }
    
    public float getSpeed() {
        return this.n.g.h;
    }
    
    public final void h() {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.PLAY_OPTION);
        this.n.i();
    }
    
    public final void i() {
        final LottieDrawable n = this.n;
        n.g.removeAllUpdateListeners();
        n.g.addUpdateListener((ValueAnimator$AnimatorUpdateListener)n.m);
    }
    
    public final void invalidate() {
        super.invalidate();
        final Drawable drawable = ((ImageView)this).getDrawable();
        if (drawable instanceof LottieDrawable) {
            RenderMode renderMode;
            if (((LottieDrawable)drawable).z) {
                renderMode = RenderMode.SOFTWARE;
            }
            else {
                renderMode = RenderMode.HARDWARE;
            }
            if (renderMode == RenderMode.SOFTWARE) {
                this.n.invalidateSelf();
            }
        }
    }
    
    public final void invalidateDrawable(final Drawable drawable) {
        final Drawable drawable2 = ((ImageView)this).getDrawable();
        final LottieDrawable n = this.n;
        if (drawable2 == n) {
            super.invalidateDrawable((Drawable)n);
        }
        else {
            super.invalidateDrawable(drawable);
        }
    }
    
    public final void j(final String s, final String s2) {
        this.setCompositionTask(q6.r.a(s2, new i(s, s2, 0, ((View)this).getContext())));
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!((View)this).isInEditMode() && this.r) {
            this.n.i();
        }
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof LottieAnimationView.LottieAnimationView$b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final LottieAnimationView.LottieAnimationView$b lottieAnimationView$b = (LottieAnimationView.LottieAnimationView$b)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)lottieAnimationView$b).getSuperState());
        this.o = lottieAnimationView$b.f;
        final HashSet t = this.t;
        final LottieAnimationView.LottieAnimationView$UserActionTaken set_ANIMATION = LottieAnimationView.LottieAnimationView$UserActionTaken.SET_ANIMATION;
        if (!t.contains(set_ANIMATION) && !TextUtils.isEmpty((CharSequence)this.o)) {
            this.setAnimation(this.o);
        }
        this.p = lottieAnimationView$b.g;
        if (!this.t.contains(set_ANIMATION)) {
            final int p = this.p;
            if (p != 0) {
                this.setAnimation(p);
            }
        }
        if (!this.t.contains(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_PROGRESS)) {
            this.setProgress(lottieAnimationView$b.h);
        }
        if (!this.t.contains(LottieAnimationView.LottieAnimationView$UserActionTaken.PLAY_OPTION) && lottieAnimationView$b.i) {
            this.h();
        }
        if (!this.t.contains(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_IMAGE_ASSETS)) {
            this.setImageAssetsFolder(lottieAnimationView$b.j);
        }
        if (!this.t.contains(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_REPEAT_MODE)) {
            this.setRepeatMode(lottieAnimationView$b.k);
        }
        if (!this.t.contains(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_REPEAT_COUNT)) {
            this.setRepeatCount(lottieAnimationView$b.l);
        }
    }
    
    public final Parcelable onSaveInstanceState() {
        final LottieAnimationView.LottieAnimationView$b lottieAnimationView$b = new LottieAnimationView.LottieAnimationView$b(super.onSaveInstanceState());
        lottieAnimationView$b.f = this.o;
        lottieAnimationView$b.g = this.p;
        final LottieDrawable n = this.n;
        final c7.d g = n.g;
        final h o = g.o;
        float h;
        if (o == null) {
            h = 0.0f;
        }
        else {
            final float k = g.k;
            final float i = o.k;
            h = (k - i) / (o.l - i);
        }
        lottieAnimationView$b.h = h;
        boolean p;
        if (((Drawable)n).isVisible()) {
            p = n.g.p;
        }
        else {
            final LottieDrawable$OnVisibleAction j = n.k;
            p = (j == LottieDrawable$OnVisibleAction.PLAY || j == LottieDrawable$OnVisibleAction.RESUME);
        }
        lottieAnimationView$b.i = p;
        final LottieDrawable n2 = this.n;
        lottieAnimationView$b.j = n2.o;
        lottieAnimationView$b.k = ((ValueAnimator)n2.g).getRepeatMode();
        lottieAnimationView$b.l = ((ValueAnimator)this.n.g).getRepeatCount();
        return (Parcelable)lottieAnimationView$b;
    }
    
    public void setAnimation(final int p) {
        this.p = p;
        this.o = null;
        i0<h> compositionTask;
        if (((View)this).isInEditMode()) {
            compositionTask = new i0<h>(new q6.d(this, p), true);
        }
        else if (this.s) {
            final Context context = ((View)this).getContext();
            compositionTask = q6.r.f(context, p, q6.r.j(p, context));
        }
        else {
            compositionTask = q6.r.f(((View)this).getContext(), p, null);
        }
        this.setCompositionTask(compositionTask);
    }
    
    public void setAnimation(final String o) {
        this.o = o;
        this.p = 0;
        i0<h> compositionTask;
        if (((View)this).isInEditMode()) {
            compositionTask = new i0<h>(new q6.g(0, this, o), true);
        }
        else if (this.s) {
            compositionTask = q6.r.b(((View)this).getContext(), o);
        }
        else {
            final Context context = ((View)this).getContext();
            final HashMap a = q6.r.a;
            compositionTask = q6.r.a(null, new m(o, null, 0, context.getApplicationContext()));
        }
        this.setCompositionTask(compositionTask);
    }
    
    @Deprecated
    public void setAnimationFromJson(final String s) {
        this.setCompositionTask(q6.r.a(null, new k(0, new ByteArrayInputStream(s.getBytes()), null)));
    }
    
    public void setAnimationFromUrl(final String s) {
        i0<h> compositionTask;
        if (this.s) {
            final Context context = ((View)this).getContext();
            final HashMap a = q6.r.a;
            final String l = ak0.m.l("url_", s);
            compositionTask = q6.r.a(l, new i(s, l, 0, context));
        }
        else {
            compositionTask = q6.r.a(null, new i(s, null, 0, ((View)this).getContext()));
        }
        this.setCompositionTask(compositionTask);
    }
    
    public void setApplyingOpacityToLayersEnabled(final boolean x) {
        this.n.x = x;
    }
    
    public void setCacheComposition(final boolean s) {
        this.s = s;
    }
    
    public void setClipToCompositionBounds(final boolean b) {
        final LottieDrawable n = this.n;
        if (b != n.s) {
            n.s = b;
            final b t = n.t;
            if (t != null) {
                t.H = b;
            }
            n.invalidateSelf();
        }
    }
    
    public void setComposition(final h w) {
        ((Drawable)this.n).setCallback((Drawable$Callback)this);
        this.w = w;
        this.q = true;
        final boolean l = this.n.l(w);
        boolean p = false;
        this.q = false;
        final Drawable drawable = ((ImageView)this).getDrawable();
        final LottieDrawable n = this.n;
        if (drawable == n && !l) {
            return;
        }
        if (!l) {
            final c7.d g = n.g;
            if (g != null) {
                p = g.p;
            }
            this.setImageDrawable(null);
            this.setImageDrawable((Drawable)this.n);
            if (p) {
                this.n.k();
            }
        }
        ((View)this).onVisibilityChanged((View)this, ((View)this).getVisibility());
        ((View)this).requestLayout();
        final Iterator iterator = this.u.iterator();
        while (iterator.hasNext()) {
            ((f0)iterator.next()).a();
        }
    }
    
    public void setFailureListener(final e0<Throwable> l) {
        this.l = l;
    }
    
    public void setFallbackResource(final int m) {
        this.m = m;
    }
    
    public void setFontAssetDelegate(final q6.a a) {
        final v6.a p = this.n.p;
    }
    
    public void setFrame(final int n) {
        this.n.m(n);
    }
    
    public void setIgnoreDisabledSystemAnimations(final boolean i) {
        this.n.i = i;
    }
    
    public void setImageAssetDelegate(final q6.b b) {
        final LottieDrawable n = this.n;
        n.getClass();
        final v6.b n2 = n.n;
        if (n2 != null) {
            n2.getClass();
        }
    }
    
    public void setImageAssetsFolder(final String o) {
        this.n.o = o;
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        this.g();
        super.setImageBitmap(imageBitmap);
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        this.g();
        super.setImageDrawable(imageDrawable);
    }
    
    public void setImageResource(final int imageResource) {
        this.g();
        super.setImageResource(imageResource);
    }
    
    public void setMaintainOriginalImageBounds(final boolean r) {
        this.n.r = r;
    }
    
    public void setMaxFrame(final int n) {
        this.n.n(n);
    }
    
    public void setMaxFrame(final String s) {
        this.n.o(s);
    }
    
    public void setMaxProgress(final float n) {
        this.n.p(n);
    }
    
    public void setMinAndMaxFrame(final String s) {
        this.n.r(s);
    }
    
    public void setMinFrame(final int n) {
        this.n.s(n);
    }
    
    public void setMinFrame(final String s) {
        this.n.t(s);
    }
    
    public void setMinProgress(final float n) {
        this.n.u(n);
    }
    
    public void setOutlineMasksAndMattes(final boolean w) {
        final LottieDrawable n = this.n;
        if (n.w != w) {
            n.w = w;
            final b t = n.t;
            if (t != null) {
                t.r(w);
            }
        }
    }
    
    public void setPerformanceTrackingEnabled(final boolean b) {
        final LottieDrawable n = this.n;
        n.v = b;
        final h f = n.f;
        if (f != null) {
            f.a.a = b;
        }
    }
    
    public void setProgress(final float n) {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_PROGRESS);
        this.n.v(n);
    }
    
    public void setRenderMode(final RenderMode y) {
        final LottieDrawable n = this.n;
        n.y = y;
        n.e();
    }
    
    public void setRepeatCount(final int repeatCount) {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_REPEAT_COUNT);
        ((ValueAnimator)this.n.g).setRepeatCount(repeatCount);
    }
    
    public void setRepeatMode(final int repeatMode) {
        this.t.add(LottieAnimationView.LottieAnimationView$UserActionTaken.SET_REPEAT_MODE);
        this.n.g.setRepeatMode(repeatMode);
    }
    
    public void setSafeMode(final boolean j) {
        this.n.j = j;
    }
    
    public void setSpeed(final float h) {
        this.n.g.h = h;
    }
    
    public void setTextDelegate(final l0 l0) {
        this.n.getClass();
    }
    
    public final void unscheduleDrawable(final Drawable drawable) {
        final boolean q = this.q;
        final int n = 0;
        Label_0118: {
            if (!q) {
                final LottieDrawable n2 = this.n;
                if (drawable == n2) {
                    final c7.d g = n2.g;
                    if (g != null && g.p) {
                        this.r = false;
                        n2.h();
                        break Label_0118;
                    }
                }
            }
            if (!q && drawable instanceof LottieDrawable) {
                final LottieDrawable lottieDrawable = (LottieDrawable)drawable;
                final c7.d g2 = lottieDrawable.g;
                int p;
                if (g2 == null) {
                    p = n;
                }
                else {
                    p = (g2.p ? 1 : 0);
                }
                if (p != 0) {
                    lottieDrawable.h();
                }
            }
        }
        super.unscheduleDrawable(drawable);
    }
}
