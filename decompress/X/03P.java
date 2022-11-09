// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import android.widget.TextView$OnEditorActionListener;

public final class 03P implements TextView$OnEditorActionListener
{
    public final /* synthetic */ 13L LIZ;
    
    static {
        Covode.recordClassIndex(437);
    }
    
    public 03P(final 13L liz) {
        this.LIZ = liz;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        this.LIZ.LJ();
        return true;
    }
}
