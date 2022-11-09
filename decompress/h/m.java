// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.app.Dialog;
import k.b;
import android.os.Bundle;
import android.view.Window$Callback;
import a4.i;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.Context;
import androidx.activity.h;

public class m extends h implements c
{
    public f h;
    public final l i;
    
    public m() {
        throw null;
    }
    
    public m(final Context context, final int n) {
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
        this.i = new l(this);
        final e n2 = this.n();
        int resourceId2 = n;
        if (n == 0) {
            final TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130968904, typedValue2, true);
            resourceId2 = typedValue2.resourceId;
        }
        ((f)n2).b0 = resourceId2;
        n2.s();
    }
    
    public final void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.n().c(view, viewGroup$LayoutParams);
    }
    
    public final void dismiss() {
        super.dismiss();
        this.n().t();
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return a4.i.b((i.a)this.i, ((Dialog)this).getWindow().getDecorView(), (Window$Callback)this, keyEvent);
    }
    
    public final <T extends View> T findViewById(final int n) {
        return (T)this.n().g(n);
    }
    
    public final void invalidateOptionsMenu() {
        this.n().p();
    }
    
    public final e n() {
        if (this.h == null) {
            final r$a f = e.f;
            this.h = new f(((Dialog)this).getContext(), ((Dialog)this).getWindow(), (c)this, this);
        }
        return this.h;
    }
    
    public final boolean o(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public void onCreate(final Bundle bundle) {
        this.n().o();
        super.onCreate(bundle);
        this.n().s();
    }
    
    public void onStop() {
        super.onStop();
        this.n().y();
    }
    
    public final void onSupportActionModeFinished(final b b) {
    }
    
    public final void onSupportActionModeStarted(final b b) {
    }
    
    public final b onWindowStartingSupportActionMode(final b.a a) {
        return null;
    }
    
    public final boolean p(final int n) {
        return this.n().A(1);
    }
    
    public void setContentView(final int n) {
        this.n().C(n);
    }
    
    public void setContentView(final View view) {
        this.n().D(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.n().E(view, viewGroup$LayoutParams);
    }
    
    public void setTitle(final int title) {
        super.setTitle(title);
        this.n().I((CharSequence)((Dialog)this).getContext().getString(title));
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.n().I(title);
    }
}
