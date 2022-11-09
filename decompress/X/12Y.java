// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;

public final class 12y implements DialogInterface$OnClickListener, DialogInterface$OnDismissListener, DialogInterface$OnKeyListener, a
{
    public 12x LIZ;
    public 1fM LIZIZ;
    public 12w LIZJ;
    public a LIZLLL;
    
    static {
        Covode.recordClassIndex(351);
    }
    
    public 12y(final 12x liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ(final 12x 12x, final boolean b) {
        if (b || 12x == this.LIZ) {
            final 1fM liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.dismiss();
            }
        }
        final a lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(12x, b);
        }
    }
    
    public final boolean LIZ(final 12x 12x) {
        final a lizlll = this.LIZLLL;
        return lizlll != null && lizlll.LIZ(12x);
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.LIZ.LIZ((MenuItem)this.LIZJ.LIZJ().getItem(n), null, 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.LIZJ.LIZ(this.LIZ, true);
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        if (n == 82 || n == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = this.LIZIZ.getWindow();
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
                final Window window2 = this.LIZIZ.getWindow();
                if (window2 != null) {
                    final View decorView2 = window2.getDecorView();
                    if (decorView2 != null) {
                        final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                        if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent)) {
                            this.LIZ.LIZ(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.LIZ.performShortcut(n, keyEvent, 0);
    }
}
