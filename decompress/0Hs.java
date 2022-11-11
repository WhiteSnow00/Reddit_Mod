// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Set;
import java.util.List;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;

public final class 0hs
{
    public final ArrayList<1Lm> LIZ;
    public final T0p LIZIZ;
    public final 0Gh LIZJ;
    public final DataChannel LIZLLL;
    
    static {
        Covode.recordClassIndex(6571);
    }
    
    public 0hs(final T0p liziz, final 0Gh lizj, final DataChannel lizlll) {
        CTM.LIZ((Object)liziz, (Object)lizj);
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LIZ = new ArrayList<1Lm>();
        liziz.addOnTabSelectedListener((Stv)new 1th(lizj, lizlll));
        lizj.addOnPageChangeListener((0Gh.e)new T0s(liziz));
    }
    
    private final T0r LIZ(final 1Lm liz, final boolean b) {
        final T0r tab = this.LIZIZ.newTab();
        n.LIZIZ((Object)tab, "");
        tab.LIZ(2131561966);
        final View ljff = tab.LJFF;
        if (ljff != null) {
            final TextView textView = (TextView)ljff.findViewById(2131372064);
            if (textView != null) {
                textView.setText((CharSequence)liz.LIZ);
            }
        }
        final View ljff2 = tab.LJFF;
        if (ljff2 != null) {
            final View viewById = ljff2.findViewById(2131372067);
            if (viewById != null) {
                if (b) {
                    GTi.LIZIZ(viewById);
                }
                else {
                    GTi.LIZ(viewById);
                }
            }
        }
        tab.LIZ = liz;
        return tab;
    }
    
    public final void LIZ() {
        final T0p liziz = this.LIZIZ;
        final String ljiiiz = 0gZ.LJIIIZ;
        n.LIZIZ((Object)ljiiiz, "");
        final String liz = 0gZ.LIZ();
        n.LIZIZ((Object)liz, "");
        final T0r liz2 = this.LIZ(new 1Lm(ljiiiz, liz), 1Kb.LIZIZ.LIZLLL());
        0ht.LIZ(liz2);
        liziz.addTab(liz2);
    }
    
    public final void LIZ(final List<1Lm> list) {
        final Iterator<Object> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 1Lm next = iterator.next();
            if (n < 0) {
                Ey9.LIZ();
            }
            final 1Lm 1Lm = next;
            boolean contains;
            if (n != 0) {
                final String liziz = 1Lm.LIZIZ;
                CTM.LIZ((Object)liziz);
                final 44V llllz = GST.LLLLZ;
                kotlin.jvm.internal.n.LIZIZ((Object)llllz, "");
                contains = ((Set)((44T)llllz).LIZ()).contains(liziz);
            }
            else {
                contains = false;
            }
            final T0p liziz2 = this.LIZIZ;
            final T0r liz = this.LIZ(1Lm, contains);
            if (n == 0) {
                0ht.LIZIZ(liz);
            }
            else {
                0ht.LIZ(liz);
            }
            liziz2.addTab(liz);
            ++n;
        }
    }
}
