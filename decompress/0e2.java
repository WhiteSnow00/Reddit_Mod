// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import com.bytedance.covode.number.Covode;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import java.util.Set;

public final class 0e2
{
    public Set<DialogInterface> LIZ;
    public Set<DialogFragment> LIZIZ;
    public boolean LIZJ;
    
    static {
        Covode.recordClassIndex(5916);
    }
    
    public final void LIZ() {
        if (!0dw.a.LIZ.LJII) {
            return;
        }
        final Set<DialogInterface> liz = this.LIZ;
        if (liz != null && !liz.isEmpty()) {
            final Iterator iterator = new HashSet(this.LIZ).iterator();
            while (iterator.hasNext()) {
                ((DialogInterface)iterator.next()).cancel();
            }
            this.LIZ.clear();
        }
        final Set<DialogFragment> liziz = this.LIZIZ;
        if (liziz != null && !liziz.isEmpty()) {
            final Iterator iterator2 = new HashSet(this.LIZIZ).iterator();
            while (iterator2.hasNext()) {
                ((DialogFragment)iterator2.next()).dismiss();
            }
            this.LIZIZ.clear();
        }
    }
    
    public final void LIZ(final DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            if (this.LIZ == null) {
                this.LIZ = new HashSet<DialogInterface>();
            }
            this.LIZ.add(dialogInterface);
        }
    }
    
    public final void LIZ(final DialogFragment dialogFragment) {
        if (dialogFragment != null) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new HashSet<DialogFragment>();
            }
            this.LIZIZ.add(dialogFragment);
        }
    }
    
    public final void LIZ(final boolean lizj) {
        if (0dw.a.LIZ.LJI) {
            this.LIZJ = lizj;
        }
    }
    
    public final void LIZIZ(final DialogInterface dialogInterface) {
        if (dialogInterface != null) {
            final Set<DialogInterface> liz = this.LIZ;
            if (liz != null) {
                liz.remove(dialogInterface);
            }
        }
    }
    
    public final void LIZIZ(final DialogFragment dialogFragment) {
        if (dialogFragment != null) {
            final Set<DialogFragment> liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.remove(dialogFragment);
            }
        }
    }
    
    public final boolean LIZIZ() {
        return 0dw.a.LIZ.LJI && this.LIZJ;
    }
    
    public static final class a
    {
        public static final 0e2 LIZ;
        
        static {
            Covode.recordClassIndex(5917);
            LIZ = new 0e2((byte)0);
        }
    }
}
