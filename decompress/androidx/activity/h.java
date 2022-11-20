// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import android.view.Window;
import vl.a;
import androidx.lifecycle.Lifecycle$Event;
import android.os.Build$VERSION;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import ng2.e;
import android.content.Context;
import androidx.lifecycle.r;
import androidx.lifecycle.q;
import android.app.Dialog;

public class h extends Dialog implements q, m
{
    public r f;
    public final OnBackPressedDispatcher g;
    
    public h(final Context context, final int n) {
        e.f((Object)context, "context");
        super(context, n);
        this.g = new OnBackPressedDispatcher((Runnable)new g((Object)this, 0));
    }
    
    public static void r(final h h) {
        e.f((Object)h, "this$0");
        h.onBackPressed();
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        e.f((Object)view, "view");
        this.s();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    public final Lifecycle getLifecycle() {
        r f;
        if ((f = this.f) == null) {
            f = new r((q)this);
            this.f = f;
        }
        return (Lifecycle)f;
    }
    
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.g;
    }
    
    public final void onBackPressed() {
        this.g.b();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (Build$VERSION.SDK_INT >= 33) {
            final OnBackPressedDispatcher g = this.g;
            g.e = this.getOnBackInvokedDispatcher();
            g.c();
        }
        r f;
        if ((f = this.f) == null) {
            f = new r((q)this);
            this.f = f;
        }
        f.f(Lifecycle$Event.ON_CREATE);
    }
    
    public void onStart() {
        super.onStart();
        r f;
        if ((f = this.f) == null) {
            f = new r((q)this);
            this.f = f;
        }
        f.f(Lifecycle$Event.ON_RESUME);
    }
    
    public void onStop() {
        r f;
        if ((f = this.f) == null) {
            f = new r((q)this);
            this.f = f;
        }
        f.f(Lifecycle$Event.ON_DESTROY);
        this.f = null;
        super.onStop();
    }
    
    public final void s() {
        final Window window = this.getWindow();
        e.c((Object)window);
        window.getDecorView().setTag(2131432184, (Object)this);
        final Window window2 = this.getWindow();
        e.c((Object)window2);
        final View decorView = window2.getDecorView();
        e.e((Object)decorView, "window!!.decorView");
        a.e3(decorView, (m)this);
    }
    
    public void setContentView(final int contentView) {
        this.s();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        e.f((Object)contentView, "view");
        this.s();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        e.f((Object)view, "view");
        this.s();
        super.setContentView(view, viewGroup$LayoutParams);
    }
}
