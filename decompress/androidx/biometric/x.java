// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import android.widget.TextView;
import androidx.lifecycle.y;

public final class x implements y<CharSequence>
{
    public final /* synthetic */ v a;
    
    public x(final v a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        final CharSequence text = (CharSequence)o;
        final v a = this.a;
        a.f.removeCallbacks((Runnable)a.g);
        final TextView l = this.a.l;
        if (l != null) {
            l.setText(text);
        }
        final v a2 = this.a;
        a2.f.postDelayed((Runnable)a2.g, 2000L);
    }
}
