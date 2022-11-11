// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MenuInflater;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

public abstract class 027
{
    public static int LIZ;
    public static final 04t<WeakReference<027>> LIZIZ;
    public static final Object LIZJ;
    
    static {
        Covode.recordClassIndex(264);
        027.LIZ = -100;
        LIZIZ = new 04t<WeakReference<027>>();
        LIZJ = new Object();
    }
    
    public static 027 LIZ(final Dialog dialog, final 026 026) {
        return new 12Y(dialog, 026);
    }
    
    public static void LIZ(final 027 027) {
        synchronized (027.LIZJ) {
            LIZJ(027);
            027.LIZIZ.add(new WeakReference<027>(027));
        }
    }
    
    public static void LIZIZ(final 027 027) {
        synchronized (027.LIZJ) {
            LIZJ(027);
        }
    }
    
    public static void LIZJ(final 027 027) {
        synchronized (027.LIZJ) {
            final Iterator<WeakReference<027>> iterator = 027.LIZIZ.iterator();
            while (iterator.hasNext()) {
                final 027 28 = iterator.next().get();
                if (28 == 027 || 28 == null) {
                    iterator.remove();
                }
            }
        }
    }
    
    public abstract 023 LIZ();
    
    public abstract 02T LIZ(final 02T.a p0);
    
    public abstract View LIZ(final View p0, final String p1, final Context p2, final AttributeSet p3);
    
    public void LIZ(final int n) {
    }
    
    public abstract void LIZ(final 03X p0);
    
    public abstract void LIZ(final Configuration p0);
    
    public abstract void LIZ(final View p0);
    
    public abstract void LIZ(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void LIZ(final CharSequence p0);
    
    public abstract MenuInflater LIZIZ();
    
    public abstract <T extends View> T LIZIZ(final int p0);
    
    public abstract void LIZIZ(final View p0, final ViewGroup$LayoutParams p1);
    
    public abstract void LIZJ();
    
    public abstract void LIZJ(final int p0);
    
    public abstract void LIZLLL();
    
    public abstract boolean LIZLLL(final int p0);
    
    public abstract void LJ();
    
    public abstract void LJFF();
    
    public abstract void LJI();
    
    public void LJII() {
    }
    
    public abstract void LJIIIIZZ();
    
    public abstract void LJIIIZ();
    
    public abstract 12N.a LJIIJ();
    
    public abstract void LJIIJJI();
    
    public abstract void LJIIL();
    
    public abstract boolean LJIILIIL();
    
    public int LJIILJJIL() {
        return -100;
    }
}
