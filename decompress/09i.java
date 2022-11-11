// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.text.Editable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.text.method.KeyListener;

public final class 09i implements KeyListener
{
    public final KeyListener LIZ;
    
    static {
        Covode.recordClassIndex(1013);
    }
    
    public 09i(final KeyListener liz) {
        this.LIZ = liz;
    }
    
    public final void clearMetaKeyState(final View view, final Editable editable, final int n) {
        this.LIZ.clearMetaKeyState(view, editable, n);
    }
    
    public final int getInputType() {
        return this.LIZ.getInputType();
    }
    
    public final boolean onKeyDown(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        while (true) {
            boolean b = false;
            Label_0052: {
                if (n == 67) {
                    b = 09O.LIZ(editable, keyEvent, false);
                    break Label_0052;
                }
                if (n == 112) {
                    b = 09O.LIZ(editable, keyEvent, true);
                    break Label_0052;
                }
                if (!this.LIZ.onKeyDown(view, editable, n, keyEvent)) {
                    return false;
                }
                return true;
            }
            if (b) {
                MetaKeyKeyListener.adjustMetaAfterKeypress((Spannable)editable);
                return true;
            }
            continue;
        }
    }
    
    public final boolean onKeyOther(final View view, final Editable editable, final KeyEvent keyEvent) {
        return this.LIZ.onKeyOther(view, editable, keyEvent);
    }
    
    public final boolean onKeyUp(final View view, final Editable editable, final int n, final KeyEvent keyEvent) {
        return this.LIZ.onKeyUp(view, editable, n, keyEvent);
    }
}
