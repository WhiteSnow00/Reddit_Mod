// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.app.Dialog;
import k.b;
import android.os.Bundle;
import android.view.Window$Callback;
import a4.i$a;
import a4.i;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import androidx.activity.h;

public class n extends h implements c
{
    public g h;
    public final m i;
    
    public n() {
        throw null;
    }
    
    public n(final Context context, final int n) {
        int resourceId;
        if (n == 0) {
            final TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130968904, typedValue, true);
            resourceId = typedValue.resourceId;
        }
        else {
            resourceId = n;
        }
        super(context, resourceId);
        this.i = new m(this);
        final f t = this.t();
        int resourceId2 = n;
        if (n == 0) {
            final TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130968904, typedValue2, true);
            resourceId2 = typedValue2.resourceId;
        }
        ((g)t).b0 = resourceId2;
        t.s();
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.t().c(view, viewGroup$LayoutParams);
    }
    
    public final void dismiss() {
        super.dismiss();
        this.t().t();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return a4.i.b((i$a)this.i, ((Dialog)this).getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public final <T extends View> T findViewById(final int n) {
        return (T)this.t().g(n);
    }
    
    public final void invalidateOptionsMenu() {
        this.t().p();
    }
    
    public void onCreate(final Bundle bundle) {
        this.t().o();
        super.onCreate(bundle);
        this.t().s();
    }
    
    public void onStop() {
        super.onStop();
        this.t().y();
    }
    
    public final void onSupportActionModeFinished(final b b) {
    }
    
    public final void onSupportActionModeStarted(final b b) {
    }
    
    public final b onWindowStartingSupportActionMode(final b.a a) {
        return null;
    }
    
    public void setContentView(final int n) {
        this.t().C(n);
    }
    
    public void setContentView(final View view) {
        this.t().D(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.t().E(view, viewGroup$LayoutParams);
    }
    
    public void setTitle(final int title) {
        super.setTitle(title);
        this.t().I((CharSequence)((Dialog)this).getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.t().I(title);
    }
    
    public final f t() {
        if (this.h == null) {
            final s.a f = h.f.f;
            this.h = new g(((Dialog)this).getContext(), ((Dialog)this).getWindow(), (c)this, (Object)this);
        }
        return (f)this.h;
    }
    
    public final boolean u(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final boolean v(final int n) {
        return this.t().A(1);
    }
}
