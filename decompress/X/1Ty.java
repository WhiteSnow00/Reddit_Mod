// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.Iterator;
import com.bytedance.covode.number.Covode;

public final class 1Ty extends a
{
    public final /* synthetic */ 0qn LIZ;
    
    static {
        Covode.recordClassIndex(8477);
    }
    
    public 1Ty(final 0qn liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        for (final 0qc.a a : this.LIZ.LIZJ) {
            final LinkPlayerInfo liz = this.LIZ.LIZ.LIZ(a.LIZLLL(), a.LIZJ());
            if (liz != null) {
                a.LIZ(liz);
            }
        }
        this.LIZ.LIZIZ.LIZ();
    }
    
    @Override
    public final void LIZ(final long n, final long n2, final int n3) {
        if (n <= 0L) {
            return;
        }
        for (final 0qc.a a : this.LIZ.LIZJ) {
            if (a.LIZJ() == n) {
                a.LIZ(n3, n2);
                break;
            }
        }
    }
    
    @Override
    public final void LIZ(final long n, final String s) {
        for (final 0qc.a a : this.LIZ.LIZJ) {
            if ((n > 0L && a.LIZJ() == n) || TextUtils.equals((CharSequence)a.LIZLLL(), (CharSequence)s)) {
                this.LIZ.LIZJ.remove(a);
                break;
            }
        }
    }
}
