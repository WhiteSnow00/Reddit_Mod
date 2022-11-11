// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;

public final class 2B7 extends TSI
{
    public final int LIZ;
    
    static {
        Covode.recordClassIndex(4322);
    }
    
    public 2B7(final int liz) {
        this.LIZ = liz;
    }
    
    public final ViewGroup LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        CTM.LIZ((Object)layoutInflater, (Object)viewGroup);
        final View liz = 0II.LIZ(layoutInflater, this.LIZ, viewGroup, false);
        if (liz != null) {
            return (ViewGroup)liz;
        }
        throw new 5u3("null cannot be cast to non-null type android.view.ViewGroup");
    }
    
    public final void LIZ(final Bundle bundle) {
        super.LIZ(bundle);
        final List ljjiijzljl = this.LJJIIJZLJL();
        n.LIZ((Object)ljjiijzljl, "");
        final Iterator iterator = Qsi.LJIIL((Iterable)ljjiijzljl).iterator();
        while (iterator.hasNext()) {
            this.LIZJ((TS5)iterator.next());
        }
    }
}
