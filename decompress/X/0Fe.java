// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$OnLayoutChangeListener;
import android.view.View$OnAttachStateChangeListener;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.view.View;
import java.util.Map;
import java.util.Queue;

public final class 0fE
{
    public final Queue<b> LIZ;
    public final Map<View, a> LIZIZ;
    public final List<b> LIZJ;
    public b LIZLLL;
    public boolean LJ;
    
    static {
        Covode.recordClassIndex(6032);
    }
    
    public 0fE() {
        this.LIZ = new LinkedList<b>();
        this.LIZIZ = new HashMap<View, a>();
        this.LIZJ = new ArrayList<b>();
        this.LJ = true;
    }
    
    private void LIZ() {
        if (!this.LJ) {
            return;
        }
        if (this.LIZLLL == null) {
            final b lizlll = this.LIZ.poll();
            if (lizlll != null) {
                this.LIZ(lizlll);
                0fJ.LIZ(this.LIZLLL = lizlll);
            }
        }
    }
    
    private void LIZ(final b b) {
        this.LIZ.remove(b);
        final a a = this.LIZIZ.get(b.LIZLLL.LIZIZ);
        if (a != null && !a.LIZ.isEmpty()) {
            a.LIZ.remove(b);
            if (a.LIZ.isEmpty()) {
                b.LIZLLL.LIZIZ.removeOnAttachStateChangeListener(a.LIZIZ);
                this.LIZIZ.remove(b.LIZLLL.LIZIZ);
            }
        }
    }
    
    public final long LIZ(final 0f6 lizlll) {
        final b b = new b();
        b.LIZ = SystemClock.uptimeMillis();
        b.LIZLLL = lizlll;
        b.LIZIZ = new 1Ip(this, lizlll);
        a a;
        if ((a = this.LIZIZ.get(b.LIZLLL.LIZIZ)) == null) {
            a = new a((byte)0);
            this.LIZIZ.put(b.LIZLLL.LIZIZ, a);
            a.LIZIZ = (View$OnAttachStateChangeListener)new 0fA(this);
            b.LIZLLL.LIZIZ.addOnAttachStateChangeListener(a.LIZIZ);
        }
        a.LIZ.add(b);
        this.LIZ.offer(b);
        this.LIZ();
        return b.LIZ;
    }
    
    public final void LIZ(final long n, final int liz) {
        final b lizlll = this.LIZLLL;
        b lizlll2 = null;
        Label_0079: {
            if (lizlll != null && lizlll.LIZ == n) {
                if ((lizlll2 = this.LIZLLL) != null) {
                    break Label_0079;
                }
            }
            else {
                for (final b lizlll2 : this.LIZ) {
                    if (lizlll2.LIZ == n) {
                        break Label_0079;
                    }
                }
            }
            final Iterator<b> iterator2 = this.LIZJ.iterator();
            while (iterator2.hasNext()) {
                lizlll2 = iterator2.next();
                if (lizlll2.LIZ == n) {
                    break Label_0079;
                }
            }
            return;
        }
        if (this.LIZLLL == lizlll2) {
            this.LIZLLL = null;
        }
        else {
            this.LIZ(lizlll2);
        }
        if (lizlll2.LJ != null) {
            lizlll2.LJ.LIZ = liz;
            lizlll2.LJ.dismiss();
            return;
        }
        if (lizlll2.LIZJ != null) {
            lizlll2.LIZLLL.LIZIZ.removeOnLayoutChangeListener(lizlll2.LIZJ);
            this.LIZ();
        }
    }
    
    public final void LIZ(final boolean lj) {
        this.LJ = lj;
        if (lj) {
            this.LIZ();
            return;
        }
        final b lizlll = this.LIZLLL;
        if (lizlll != null) {
            this.LIZ(lizlll.LIZ, 5);
        }
    }
    
    public static final class a
    {
        public List<b> LIZ;
        public View$OnAttachStateChangeListener LIZIZ;
        
        static {
            Covode.recordClassIndex(6034);
        }
        
        public a() {
            this.LIZ = new LinkedList<b>();
        }
    }
    
    public static final class b
    {
        public long LIZ;
        public 0f7 LIZIZ;
        public View$OnLayoutChangeListener LIZJ;
        public 0f6 LIZLLL;
        public 0f9 LJ;
        
        static {
            Covode.recordClassIndex(6035);
        }
    }
    
    public static final class c
    {
        public static final 0fE LIZ;
        
        static {
            Covode.recordClassIndex(6036);
            LIZ = new 0fE((byte)0);
        }
    }
}
