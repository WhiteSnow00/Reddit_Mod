// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class 26k extends F5g implements SRT<T0r, 1ZU, 2P9>
{
    public static final 26k LIZ;
    
    static {
        Covode.recordClassIndex(9686);
        LIZ = new 26k();
    }
    
    public 26k() {
        super(2);
    }
    
    public final void LIZ(final T0r t0r, final 1ZU 1zu) {
        CTM.LIZ((Object)1zu);
        if (t0r != null) {
            t0r.LIZ(1zu.LIZJ);
            final View ljff = t0r.LJFF;
            if (ljff != null) {
                final TextView textView = (TextView)ljff.findViewById(2131372064);
                if (textView != null) {
                    textView.setText((CharSequence)1zu.LIZIZ);
                }
            }
        }
    }
}
