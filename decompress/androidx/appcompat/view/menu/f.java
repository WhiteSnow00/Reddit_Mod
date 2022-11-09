// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.view.menu;

import android.app.Dialog;
import h.m;
import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import androidx.appcompat.app.e;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

public final class f implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, i$a
{
    public MenuBuilder f;
    public e g;
    public d h;
    
    public f(final MenuBuilder f) {
        this.f = f;
    }
    
    public final void b(final MenuBuilder menuBuilder, final boolean b) {
        if (b || menuBuilder == this.f) {
            final e g = this.g;
            if (g != null) {
                ((m)g).dismiss();
            }
        }
    }
    
    public final boolean c(final MenuBuilder menuBuilder) {
        return false;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final MenuBuilder f = this.f;
        final d h = this.h;
        if (h.k == null) {
            h.k = new d$a(h);
        }
        f.performItemAction((MenuItem)h.k.c(n), 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.h.b(this.f, true);
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        if (n == 82 || n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = ((Dialog)this.g).getWindow();
                if (window != null) {
                    final View decorView = window.getDecorView();
                    if (decorView != null) {
                        final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                final Window window2 = ((Dialog)this.g).getWindow();
                if (window2 != null) {
                    final View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.f.close(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f.performShortcut(n, keyEvent, 0);
    }
}
