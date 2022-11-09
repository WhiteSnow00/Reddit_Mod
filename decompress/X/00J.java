// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import android.ss.com.vboost.VboostListener;
import java.lang.ref.WeakReference;
import android.util.SparseBooleanArray;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.TreeSet;
import android.ss.com.vboost.CapabilityType;
import java.util.Map;

public class 00j
{
    public static 00r<Boolean> LJI;
    public static volatile 00r<Boolean> LJII;
    public Map<CapabilityType, TreeSet<00f>> LIZ;
    public final transient ReentrantLock LIZIZ;
    public Map<CapabilityType, 00f> LIZJ;
    public ScheduledExecutorService LIZLLL;
    public ConcurrentHashMap<00f, 00a> LJ;
    public 00r<SparseBooleanArray> LJFF;
    public 00r<WeakReference<VboostListener.b>> LJIIIIZZ;
    public 00p.a LJIIIZ;
    public ConcurrentHashMap<00a, 00f> LJIIJ;
    
    static {
        Covode.recordClassIndex(64);
        00j.LJI = new 11r();
        00j.LJII = new 11s();
    }
    
    public 00j() {
        this.LIZ = new HashMap<CapabilityType, TreeSet<00f>>();
        (this.LIZIZ = new ReentrantLock()).newCondition();
        this.LIZJ = new HashMap<CapabilityType, 00f>();
        this.LIZLLL = null;
        this.LJ = new ConcurrentHashMap<00f, 00a>();
        this.LJIIJ = new ConcurrentHashMap<00a, 00f>();
        this.LJFF = new 11q();
        this.LJIIIIZZ = new 11t();
        this.LJIIIZ = new 11u(this);
        this.LIZLLL = (ScheduledExecutorService)new PThreadScheduledThreadPoolExecutor(2, (ThreadFactory)new DefaultThreadFactory("equestManager"));
    }
    
    private Object LIZ(final 00f 00f) {
        00s.LIZ(3);
        this.LIZIZ.lock();
        try {
            Object liz;
            if (00f.LJIIL == 00d.LIZIZ) {
                TreeSet set;
                if ((set = this.LIZ.get(00f.LIZ)) == null) {
                    set = new TreeSet();
                    this.LIZ.put(00f.LIZ, set);
                }
                final boolean add = set.add(00f);
                00s.LIZ(3);
                liz = 00f;
                if (add) {
                    liz = 00f;
                    if (this.LIZIZ(00f)) {
                        this.LIZ(00f.LIZ);
                        liz = 00f;
                    }
                }
            }
            else {
                this.LIZJ.put(00f.LIZ, 00f);
                liz = 00b.LIZ(00f);
            }
            return liz;
        }
        finally {
            this.LIZIZ.unlock();
        }
    }
    
    private void LIZ(CapabilityType liz) {
        while (true) {
            00s.LIZ(3);
            final TreeSet set = this.LIZ.get(liz);
            00s.LIZ(3);
            if (set == null || set.isEmpty()) {
                break;
            }
            final 00f 00f = (00f)set.pollFirst();
            00f.LJIILLIIL = System.currentTimeMillis();
            int n = 0;
            if (00f.LJIIJJI == 00k.USE_OURS) {
                n = n;
                if (00f.LIZ() > 50L) {
                    n = 1;
                }
            }
            00s.LIZ(3);
            if (n != 0) {
                00s.LIZ(3);
                final 00l ljiizilj = new 00l(00f);
                ljiizilj.LIZ = this.LIZLLL.schedule((Callable<Integer>)ljiizilj, 00f.LIZ(), TimeUnit.MILLISECONDS);
                00f.LJIIZILJ = ljiizilj;
                00f.LIZJ = 00f.LIZ();
            }
            if (!this.LIZIZ(00f)) {
                break;
            }
            if (00f.LJIIJJI != 00k.USE_OURS || 00f.LIZ() > 50L) {
                00s.LIZ(3);
                this.LIZLLL.submit((Callable<Object>)new 00c(00f));
                this.LIZJ.put(00f.LIZ, 00f);
                break;
            }
            liz = 00f.LIZ;
        }
    }
    
    private 00f LIZIZ(final 00a ljij) {
        if (ljij.LIZ < CapabilityType.TYPE_MIN.getIndex() || ljij.LIZ > CapabilityType.TYPE_MAX.getIndex()) {
            00s.LIZ(6);
            return null;
        }
        final CapabilityType value = CapabilityType.valueOf(ljij.LIZ);
        boolean contains;
        if (!00j.LJI.LIZIZ()) {
            00s.LIZ(3);
            contains = false;
        }
        else {
            00O.LIZ();
            value.getName();
            value.getIndex();
            00s.LIZ(3);
            contains = 00L.LIZ.contains(value);
        }
        if (!contains) {
            00s.LIZ(5);
            return null;
        }
        Object o = this.LJIIJ.remove(ljij);
        00f 00f;
        if ((00f = (00f)o) == null) {
            00f = new 00f(CapabilityType.valueOf(ljij.LIZ));
            00f.LJIJ = ljij;
        }
        00f.LJIIL = 00d.LIZIZ;
        while (true) {
            switch (00h.LIZ[CapabilityType.valueOf(ljij.LIZ).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8: {
                    if (ljij.LIZIZ > 00w.LEVEL_9.ordinal() || ljij.LIZIZ < 00w.LEVEL_0.ordinal()) {
                        00w.LEVEL_0.ordinal();
                        00w.LEVEL_9.ordinal();
                        00s.LIZ(5);
                        if (ljij.LIZIZ > 00w.LEVEL_9.ordinal()) {
                            00f.LIZIZ = 00w.LEVEL_9;
                        }
                        if (ljij.LIZIZ < 00w.LEVEL_0.ordinal()) {
                            00f.LIZIZ = 00w.LEVEL_0;
                        }
                    }
                    else {
                        00f.LIZIZ = 00w.valueOf(ljij.LIZIZ);
                    }
                    if (ljij.LIZJ < 50L) {
                        00s.LIZ(5);
                        00f.LIZJ = 50L;
                        break;
                    }
                    00f.LIZJ = ljij.LIZJ;
                    break;
                }
                case 9: {
                    if (ljij.LIZLLL <= 1) {
                        00s.LIZ(5);
                        return null;
                    }
                    00f.LIZLLL = ljij.LIZLLL;
                    00f.LJIIIZ = ljij.LJII;
                    00f.LJIIJ = true;
                    if (ljij.LJFF > 00K.SUPER.getIndex() || ljij.LJFF < 00K.SILVER.getIndex()) {
                        00K.SILVER.getIndex();
                        00K.SUPER.getIndex();
                        00s.LIZ(5);
                        if (ljij.LJFF > 00K.SUPER.getIndex()) {
                            00f.LJFF = 00K.SUPER;
                        }
                        if (ljij.LJFF < 00K.SILVER.getIndex()) {
                            00f.LJFF = 00K.SILVER;
                        }
                    }
                    else {
                        00f.LJFF = 00K.valueOf(ljij.LJFF);
                    }
                    00f.LJIIL = 00d.LIZ;
                    break;
                }
                case 10: {
                    if (ljij.LJIIIIZZ == null) {
                        return null;
                    }
                    00f.LJII = new 010();
                    00f.LJII.LIZ = ljij.LJIIIIZZ.getInt("scene_type");
                    00f.LJII.LIZIZ = ljij.LJIIIIZZ.getFloat("intensity");
                    ljij.LJIIIIZZ.getFloat("sharpness");
                    00f.LJII.LIZJ = ljij.LJIIIIZZ.getFloat("duration");
                    00f.LJII.LIZLLL = ljij.LJIIIIZZ.getString("jsonFilePath");
                    break;
                }
                case 11: {
                    if (ljij.LJIIIIZZ == null) {
                        return null;
                    }
                    00f.LJIIIIZZ = new 00y();
                    00f.LJIIIIZZ.LIZ = ljij.LJIIIIZZ.getString("scene_type");
                    00f.LJIIIIZZ.LIZIZ = ljij.LJIIIIZZ.getString("exception_type");
                    00f.LJIIIIZZ.LIZJ = ljij.LJIIIIZZ.getString("exception_reason");
                    00f.LJIIIIZZ.LIZLLL = ljij.LJIIIIZZ.getString("behavior_type");
                    00f.LJIIIIZZ.LJ = ljij.LJIIIIZZ.getString("stallState");
                    00f.LJIIIIZZ.LJFF = ljij.LJIIIIZZ.getString("reportEnabled");
                    break;
                }
                case 12: {
                    if (ljij.LIZLLL <= 1) {
                        00s.LIZ(5);
                        return null;
                    }
                    if (ljij.LJ > 00w.LEVEL_9.ordinal() || ljij.LJ < 00w.LEVEL_0.ordinal()) {
                        00w.LEVEL_0.ordinal();
                        00w.LEVEL_9.ordinal();
                        00s.LIZ(5);
                        if (ljij.LIZIZ > 00w.LEVEL_9.ordinal()) {
                            00f.LIZIZ = 00w.LEVEL_9;
                        }
                        if (ljij.LIZIZ < 00w.LEVEL_0.ordinal()) {
                            00f.LIZIZ = 00w.LEVEL_0;
                        }
                    }
                    00f.LIZLLL = ljij.LIZLLL;
                    00f.LJ = ljij.LJ;
                    00f.LIZIZ = 00w.valueOf(ljij.LJ);
                    00f.LJIIIZ = ljij.LJII;
                    00f.LJIIJ = true;
                    00f.LJIIL = 00d.LIZ;
                    break;
                }
                case 15: {
                    o = this.LJFF;
                    synchronized (o) {
                        if (!this.LJFF.LIZIZ().get(ljij.LJI.getId()) || !00n.isValidId(ljij.LJI.getId())) {
                            ljij.LJI.getDesc();
                            00s.LIZ(5);
                            monitorexit(o);
                            return null;
                        }
                        monitorexit(o);
                        ljij.LJI.getDesc();
                        00s.LIZ(3);
                        00f.LJI = ljij.LJI;
                        00f.LJIIL = 00d.LIZIZ;
                        if (ljij.LJII) {
                            00f.LJI.getDesc();
                            00s.LIZ(3);
                            00f.LJIIIZ = true;
                            00f.LJIIJ = false;
                            00f.LJIIL = 00d.LIZ;
                            00f.LJIIJJI = 00k.ONE_TIME;
                            o = 00f.LJIIZILJ;
                            if (o != null) {
                                ((00l)o).LIZ.cancel(true);
                                break;
                            }
                            break;
                        }
                        else {
                            if (ljij.LIZJ > 0L) {
                                00f.LJIIIZ = false;
                                00f.LIZJ = ljij.LIZJ;
                                00f.LJIIJ = false;
                                00f.LJIIJJI = 00k.USE_OURS;
                                break;
                            }
                            00f.LJIIIZ = false;
                            00f.LJIIJ = true;
                            00f.LIZJ = 30000L;
                            00f.LJIIJJI = 00k.USE_OURS;
                            break;
                        }
                        00f.LJIIL = 00d.LIZ;
                        break;
                    }
                    break;
                }
                case 16: {
                    continue;
                }
            }
            break;
        }
        if (ljij.LJIIIIZZ != null) {
            00f.LJIILL = new 00g();
        }
        return 00f;
    }
    
    private boolean LIZIZ(final 00f 00f) {
        final 00f 00f2 = this.LIZJ.get(00f.LIZ);
        final Map<CapabilityType, 00f> lizj = this.LIZJ;
        final boolean b = true;
        boolean b2 = true;
        if (lizj != null) {
            if (00f2 == null) {
                b2 = b2;
            }
            else {
                final int n = 00h.LIZIZ[00f.LJIILJJIL.ordinal()];
                Label_0091: {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                b2 = b;
                                if (n == 4) {
                                    break Label_0091;
                                }
                            }
                        }
                        else if (00f.LIZIZ.ordinal() < 00f2.LIZIZ.ordinal()) {
                            b2 = b;
                            break Label_0091;
                        }
                    }
                    else if (00f.LIZIZ != null && 00f2.LIZIZ != null && 00f.LIZIZ.ordinal() > 00f2.LIZIZ.ordinal()) {
                        b2 = b;
                        break Label_0091;
                    }
                    b2 = false;
                }
                if ((00f.LJIIJJI == 00k.USE_OURS || 00f.LJIIJJI == 00k.USE_PROVIDERS) && 00f.LIZ() <= 50L) {
                    return false;
                }
                00s.LIZ(3);
            }
        }
        return b2;
    }
    
    public final Object LIZ(final 00a 00a) {
        if (!00j.LJII.LIZIZ()) {
            00s.LIZ(3);
            return null;
        }
        if (!00j.LJI.LIZIZ()) {
            00s.LIZ(3);
            return null;
        }
        final 00f liziz = this.LIZIZ(00a);
        if (liziz != null) {
            final Object liz = this.LIZ(liziz);
            this.LJ.put(liziz, 00a);
            if (liziz.LJIIJ) {
                this.LJIIJ.put(00a, liziz);
            }
            return liz;
        }
        return null;
    }
    
    public final void LIZ(final 00f 00f, final boolean b) {
        00s.LIZ(3);
        this.LIZIZ.lock();
        Label_0028: {
            if (!b) {
                break Label_0028;
            }
            try {
                this.LJIIJ.remove(00f.LJIJ);
                if (00f.LJIIZILJ == null || b) {
                    this.LJ.remove(00f);
                    this.LIZJ.remove(00f.LIZ);
                    final TreeSet set = this.LIZ.get(00f.LIZ);
                    if (set != null && !set.isEmpty()) {
                        this.LIZ(00f.LIZ);
                    }
                }
            }
            finally {
                this.LIZIZ.unlock();
            }
        }
    }
    
    public static final class a
    {
        public static final 00j LIZ;
        
        static {
            Covode.recordClassIndex(71);
            LIZ = new 00j((byte)0);
        }
    }
}
