// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.os.Looper;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

public class 15u extends 0CC
{
    public 12E<0CG, a> LIZIZ;
    public b LIZJ;
    public final WeakReference<0CH> LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public ArrayList<b> LJII;
    public final boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(1281);
    }
    
    public 15u(final 0CH 0ch) {
        this(0ch, true);
    }
    
    public 15u(final 0CH 0ch, final boolean ljiiiizz) {
        this.LIZIZ = new 12E<0CG, a>();
        this.LJ = 0;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = new ArrayList<b>();
        this.LIZLLL = new WeakReference<0CH>(0ch);
        this.LIZJ = b.INITIALIZED;
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public static b LIZ(final b b, final b b2) {
        if (b2 != null && b2.compareTo(b) < 0) {
            return b2;
        }
        return b;
    }
    
    private void LIZ(final 0CH 0ch) {
        final 01b.d liz = this.LIZIZ.LIZ();
        while (liz.hasNext() && !this.LJI) {
            final Map.Entry entry = (Map.Entry)liz.next();
            final a a = (a)entry.getValue();
            while (a.LIZ.compareTo(this.LIZJ) < 0 && !this.LJI && this.LIZIZ.LIZJ((0CG)entry.getKey())) {
                this.LIZLLL(a.LIZ);
                final 0CC.a up = 0CC.a.upFrom(a.LIZ);
                if (up == null) {
                    final StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(a.LIZ);
                    throw new IllegalStateException(sb.toString());
                }
                a.LIZ(0ch, up);
                this.LIZJ();
            }
        }
    }
    
    private void LIZ(final String s) {
        if (!this.LJIIIIZZ || 12C.LIZ().LIZ.LIZIZ()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Method ");
        sb.append(s);
        sb.append(" must be called on the main thread");
        throw new IllegalStateException(sb.toString());
    }
    
    private void LIZIZ(final 0CH 0ch) {
        final 12E<0CG, a> liziz = this.LIZIZ;
        final 01b.b b = new 01b.b<0CG, a>(liziz.LIZJ, liziz.LIZIZ);
        liziz.LIZLLL.put((01b.f<0CG, a>)b, false);
        while (b.hasNext() && !this.LJI) {
            final Map.Entry entry = (Map.Entry)b.next();
            final a a = (a)entry.getValue();
            while (a.LIZ.compareTo(this.LIZJ) > 0 && !this.LJI && this.LIZIZ.LIZJ((0CG)entry.getKey())) {
                final 0CC.a down = 0CC.a.downFrom(a.LIZ);
                if (down == null) {
                    final StringBuilder sb = new StringBuilder("no event down from ");
                    sb.append(a.LIZ);
                    throw new IllegalStateException(sb.toString());
                }
                this.LIZLLL(down.getTargetState());
                a.LIZ(0ch, down);
                this.LIZJ();
            }
        }
    }
    
    private boolean LIZIZ() {
        if (this.LIZIZ.LJ == 0) {
            return true;
        }
        final b liz = this.LIZIZ.LIZIZ.getValue().LIZ;
        final b liz2 = this.LIZIZ.LIZJ.getValue().LIZ;
        return liz == liz2 && this.LIZJ == liz2;
    }
    
    private b LIZJ(final 0CG 0cg) {
        final 12E<0CG, a> liziz = this.LIZIZ;
        final boolean lizj = liziz.LIZJ(0cg);
        b b = null;
        while (true) {
            Label_0095: {
                if (!lizj) {
                    break Label_0095;
                }
                final 01b.c<K, V> lizlll = (01b.c<K, V>)liziz.LIZ.get(0cg).LIZLLL;
                if (lizlll == null) {
                    break Label_0095;
                }
                final b liz = lizlll.getValue().LIZ;
                if (!this.LJII.isEmpty()) {
                    final ArrayList<b> ljii = this.LJII;
                    b = ljii.get(ljii.size() - 1);
                }
                return LIZ(LIZ(this.LIZJ, liz), b);
            }
            final b liz = null;
            continue;
        }
    }
    
    private void LIZJ() {
        final ArrayList<b> ljii = this.LJII;
        ljii.remove(ljii.size() - 1);
    }
    
    private void LIZJ(final b lizj) {
        if (this.LIZJ == lizj) {
            return;
        }
        this.LIZJ = lizj;
        if (this.LJFF || this.LJ != 0) {
            this.LJI = true;
            return;
        }
        this.LJFF = true;
        this.LIZLLL();
        this.LJFF = false;
    }
    
    private void LIZLLL() {
        final 0CH 0ch = this.LIZLLL.get();
        if (0ch != null) {
            while (!this.LIZIZ()) {
                this.LJI = false;
                if (this.LIZJ.compareTo(this.LIZIZ.LIZIZ.getValue().LIZ) < 0) {
                    this.LIZIZ(0ch);
                }
                final 01b.c<0CG, a> lizj = this.LIZIZ.LIZJ;
                if (!this.LJI && lizj != null && this.LIZJ.compareTo(lizj.getValue().LIZ) > 0) {
                    this.LIZ(0ch);
                }
            }
            this.LJI = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }
    
    private void LIZLLL(final b b) {
        this.LJII.add(b);
    }
    
    @Override
    public b LIZ() {
        return this.LIZJ;
    }
    
    public final void LIZ(final 0CC.a a) {
        this.LIZ("handleLifecycleEvent");
        this.LIZJ(a.getTargetState());
    }
    
    public final void LIZ(final b b) {
        this.LIZ("markState");
        this.LIZIZ(b);
    }
    
    @Override
    public void LIZ(final 0CG 0cg) {
        CTM.LIZ((Object)0cg);
        if (n.LIZ((Object)Looper.getMainLooper(), (Object)Looper.myLooper()) ^ true) {
            CTM.LIZ((Object)this, (Object)0cg);
            4Iz.LIZJ.LIZ().post((Runnable)new 7qo(this, 0cg));
            return;
        }
        this.LIZ("addObserver");
        b b;
        if (this.LIZJ == 0CC.b.DESTROYED) {
            b = 0CC.b.DESTROYED;
        }
        else {
            b = 0CC.b.INITIALIZED;
        }
        final a a = new a(0cg, b);
        if (this.LIZIZ.LIZ(0cg, a) == null) {
            final 0CH 0ch = this.LIZLLL.get();
            if (0ch != null) {
                final boolean b2 = this.LJ != 0 || this.LJFF;
                b b3 = this.LIZJ(0cg);
                ++this.LJ;
                while (a.LIZ.compareTo(b3) < 0 && this.LIZIZ.LIZJ(0cg)) {
                    this.LIZLLL(a.LIZ);
                    final 0CC.a up = 0CC.a.upFrom(a.LIZ);
                    if (up == null) {
                        final StringBuilder sb = new StringBuilder("no event up from ");
                        sb.append(a.LIZ);
                        throw new IllegalStateException(sb.toString());
                    }
                    a.LIZ(0ch, up);
                    this.LIZJ();
                    b3 = this.LIZJ(0cg);
                }
                if (!b2) {
                    this.LIZLLL();
                }
                --this.LJ;
            }
        }
    }
    
    public final void LIZIZ(final b b) {
        this.LIZ("setCurrentState");
        this.LIZJ(b);
    }
    
    @Override
    public void LIZIZ(final 0CG 0cg) {
        this.LIZ("removeObserver");
        this.LIZIZ.LIZIZ(0cg);
    }
    
    public static final class a
    {
        public b LIZ;
        public 15t LIZIZ;
        
        static {
            Covode.recordClassIndex(1282);
        }
        
        public a(final 0CG 0cg, final b liz) {
            this.LIZIZ = 0CK.LIZ(0cg);
            this.LIZ = liz;
        }
        
        public final void LIZ(final 0CH 0ch, final 0CC.a a) {
            final b targetState = a.getTargetState();
            this.LIZ = 15u.LIZ(this.LIZ, targetState);
            this.LIZIZ.onStateChanged(0ch, a);
            this.LIZ = targetState;
        }
    }
}
