// 
// Decompiled by Procyon v0.6.0
// 

package p4;

import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import androidx.emoji2.text.j;
import androidx.emoji2.text.f;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import android.text.method.KeyListener;

public final class e implements KeyListener
{
    public final KeyListener a;
    public final a b;
    
    public e(final KeyListener a) {
        final a b = new a();
        this.a = a;
        this.b = b;
    }
    
    public final void clearMetaKeyState(final View view, final Editable editable, final int n) {
        this.a.clearMetaKeyState(view, editable, n);
    }
    
    public final int getInputType() {
        return this.a.getInputType();
    }
    
    public final boolean onKeyDown(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        this.b.getClass();
        final Object i = f.i;
        final boolean b = false;
        boolean a;
        if (n != 67) {
            a = (n == 112 && j.a(editable, keyEvent, true));
        }
        else {
            a = j.a(editable, keyEvent, false);
        }
        boolean b2;
        if (a) {
            MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!b2) {
            final boolean b3 = b;
            if (!this.a.onKeyDown(view, editable, n, keyEvent)) {
                return b3;
            }
        }
        return true;
    }
    
    public final boolean onKeyOther(final View view, final Editable editable, final KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }
    
    public final boolean onKeyUp(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, n, keyEvent);
    }
    
    public static final class a
    {
    }
}
