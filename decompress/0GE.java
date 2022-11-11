// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.util.TreeMap;
import java.util.HashMap;
import android.os.Handler;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.app.ActivityManager;
import java.util.HashSet;
import java.io.File;
import java.util.Set;
import java.util.ArrayList;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Callable;
import android.database.Cursor;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class 0GE
{
    public volatile 0Ce LIZ;
    public Executor LIZIZ;
    public 0Cj LIZJ;
    public final 0G3 LIZLLL;
    public boolean LJ;
    public List<Object> LJFF;
    public final ReentrantReadWriteLock LJI;
    public final ThreadLocal<Integer> LJII;
    public boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(1710);
    }
    
    public 0GE() {
        this.LJI = new ReentrantReadWriteLock();
        this.LJII = new ThreadLocal<Integer>();
        new ConcurrentHashMap();
        this.LIZLLL = this.LIZ();
    }
    
    public abstract 0G3 LIZ();
    
    public final 168 LIZ(final String s) {
        this.LIZJ();
        this.LIZLLL();
        return this.LIZJ.LIZIZ().LIZ(s);
    }
    
    public final Cursor LIZ(final 0Cl 0Cl) {
        this.LIZJ();
        this.LIZLLL();
        return this.LIZJ.LIZIZ().LIZ(0Cl);
    }
    
    public final <V> V LIZ(final Callable<V> callable) {
        this.LJ();
        try {
            final V call = callable.call();
            this.LJI();
            return call;
        }
        catch (final Exception ex) {
            throw ex;
        }
        catch (final RuntimeException ex2) {
            throw ex2;
        }
        finally {
            this.LJFF();
        }
    }
    
    public final void LIZ(final 0Ce 0Ce) {
        final 0G3 lizlll = this.LIZLLL;
        synchronized (lizlll) {
            if (lizlll.LJ) {
                return;
            }
            0Ce.LIZJ("PRAGMA temp_store = MEMORY;");
            0Ce.LIZJ("PRAGMA recursive_triggers='ON';");
            0Ce.LIZJ("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            lizlll.LIZ(0Ce);
            lizlll.LJFF = 0Ce.LIZ("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            lizlll.LJ = true;
        }
    }
    
    public final void LIZ(final 0Fl liz) {
        final 0Cj liziz = this.LIZIZ(liz);
        this.LIZJ = liziz;
        if (liziz instanceof 17b) {
            ((17b)liziz).LIZ = liz;
        }
        final boolean lj = liz.LJI == b.WRITE_AHEAD_LOGGING;
        this.LIZJ.LIZ(lj);
        this.LJFF = liz.LJ;
        this.LIZIZ = liz.LJII;
        new 0GL(liz.LJIIIIZZ);
        this.LJIIIIZZ = liz.LJFF;
        this.LJ = lj;
        if (liz.LJIIIZ) {
            final 0G3 lizlll = this.LIZLLL;
            new 0G9(liz.LIZIZ, liz.LIZJ, lizlll, lizlll.LIZJ.LIZIZ);
        }
    }
    
    public final void LIZ(final Runnable runnable) {
        this.LJ();
        try {
            runnable.run();
            this.LJI();
        }
        finally {
            this.LJFF();
        }
    }
    
    public abstract 0Cj LIZIZ(final 0Fl p0);
    
    public final boolean LIZIZ() {
        final 0Ce liz = this.LIZ;
        return liz != null && liz.LJ();
    }
    
    public final void LIZJ() {
        if (this.LJIIIIZZ) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }
    
    public final void LIZLLL() {
        if (this.LJII() || this.LJII.get() == null) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }
    
    public final void LJ() {
        this.LIZJ();
        final 0Ce liziz = this.LIZJ.LIZIZ();
        this.LIZLLL.LIZ(liziz);
        liziz.LIZ();
    }
    
    public final void LJFF() {
        this.LIZJ.LIZIZ().LIZIZ();
        if (!this.LJII()) {
            final 0G3 lizlll = this.LIZLLL;
            if (lizlll.LIZLLL.compareAndSet(false, true)) {
                lizlll.LIZJ.LIZIZ.execute(lizlll.LJII);
            }
        }
    }
    
    public final void LJI() {
        this.LIZJ.LIZIZ().LIZJ();
    }
    
    public final boolean LJII() {
        return this.LIZJ.LIZIZ().LIZLLL();
    }
    
    public static final class a<T extends 0GE>
    {
        public boolean LIZ;
        public final Class<T> LIZIZ;
        public final String LIZJ;
        public final Context LIZLLL;
        public ArrayList<Object> LJ;
        public Executor LJFF;
        public Executor LJI;
        public 0Cj.c LJII;
        public b LJIIIIZZ;
        public boolean LJIIIZ;
        public boolean LJIIJ;
        public boolean LJIIJJI;
        public final c LJIIL;
        public Set<Integer> LJIILIIL;
        public Set<Integer> LJIILJJIL;
        public String LJIILL;
        public File LJIILLIIL;
        
        static {
            Covode.recordClassIndex(1711);
        }
        
        public a(final Context lizlll, final Class<T> liziz, final String lizj) {
            this.LIZLLL = lizlll;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LJIIIIZZ = b.AUTOMATIC;
            this.LJIIJ = true;
            this.LJIIL = new c();
        }
        
        public final a<T> LIZ() {
            this.LJIIJ = false;
            this.LJIIJJI = true;
            return this;
        }
        
        public final a<T> LIZ(final 0Fk... array) {
            if (this.LJIILJJIL == null) {
                this.LJIILJJIL = new HashSet<Integer>();
            }
            for (final 0Fk 0Fk : array) {
                this.LJIILJJIL.add(0Fk.LIZ);
                this.LJIILJJIL.add(0Fk.LIZIZ);
            }
            this.LJIIL.LIZ(array);
            return this;
        }
        
        public final T LIZIZ() {
            if (this.LIZLLL == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            }
            if (this.LIZIZ != null) {
                final Executor ljff = this.LJFF;
                if (ljff == null) {
                    if (this.LJI == null) {
                        final Executor lizj = 12C.LIZJ;
                        this.LJI = lizj;
                        this.LJFF = lizj;
                    }
                    else {
                        final Executor lji = this.LJI;
                        if (lji != null) {
                            this.LJFF = lji;
                        }
                    }
                }
                else if (this.LJI == null) {
                    this.LJI = ljff;
                }
                final Set<Integer> ljiiljjil = this.LJIILJJIL;
                if (ljiiljjil != null && this.LJIILIIL != null) {
                    for (final Integer next : ljiiljjil) {
                        if (!this.LJIILIIL.contains(next)) {
                            continue;
                        }
                        throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ".concat(String.valueOf(next)));
                    }
                }
                if (this.LJII == null) {
                    this.LJII = new 165();
                }
                final String ljiill = this.LJIILL;
                if (ljiill != null || this.LJIILLIIL != null) {
                    if (this.LIZJ == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    if (ljiill != null && this.LJIILLIIL != null) {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                    this.LJII = new 17c(this.LJIILL, this.LJIILLIIL, this.LJII);
                }
                final Context lizlll = this.LIZLLL;
                final String lizj2 = this.LIZJ;
                final 0Cj.c ljii = this.LJII;
                final c ljiil = this.LJIIL;
                final ArrayList<Object> lj = this.LJ;
                final boolean liz = this.LIZ;
                Enum<b> enum1 = this.LJIIIIZZ;
                if (enum1 == b.AUTOMATIC) {
                    final ActivityManager activityManager = (ActivityManager)b.INVOKEVIRTUAL_androidx_room_RoomDatabase$JournalMode_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(lizlll, "activity");
                    if (activityManager != null && !activityManager.isLowRamDevice()) {
                        enum1 = b.WRITE_AHEAD_LOGGING;
                    }
                    else {
                        enum1 = b.TRUNCATE;
                    }
                }
                final 0Fl 0Fl = new 0Fl(lizlll, lizj2, ljii, ljiil, lj, liz, (b)enum1, this.LJFF, this.LJI, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIILIIL);
                final 0GE 0ge = 0GA.LIZ(this.LIZIZ, "_Impl");
                0ge.LIZ(0Fl);
                return (T)0ge;
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
    }
    
    public enum b
    {
        AUTOMATIC, 
        TRUNCATE, 
        WRITE_AHEAD_LOGGING;
        
        static {
            Covode.recordClassIndex(1712);
        }
        
        public static Object INVOKEVIRTUAL_androidx_room_RoomDatabase$JournalMode_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String declaredField) {
            Label_0158: {
                if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                    if (!2JT.LIZ) {
                        break Label_0158;
                    }
                    synchronized (ClipboardManager.class) {
                        final Object systemService = context.getSystemService((String)declaredField);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                                ((AccessibleObject)declaredField).setAccessible(true);
                                ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                            }
                            catch (final Exception declaredField) {
                                6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        2JT.LIZ = false;
                        return context;
                    }
                }
                Label_0149: {
                    if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                        break Label_0149;
                    }
                    try {
                        new 6G9().LIZ();
                        2JT.LIZIZ = true;
                        context = (Context)context.getSystemService((String)declaredField);
                        return context;
                        context = (Context)context.getSystemService((String)declaredField);
                        return context;
                        context = (Context)context.getSystemService((String)declaredField);
                        return context;
                    }
                    finally {
                        return context.getSystemService((String)declaredField);
                    }
                }
            }
        }
    }
    
    public static final class c
    {
        public HashMap<Integer, TreeMap<Integer, 0Fk>> LIZ;
        
        static {
            Covode.recordClassIndex(1713);
        }
        
        public c() {
            this.LIZ = new HashMap<Integer, TreeMap<Integer, 0Fk>>();
        }
        
        public final List<0Fk> LIZ(final List<0Fk> list, final boolean b, int n, final int n2) {
        Label_0000:
            while (true) {
                if (b) {
                    if (n >= n2) {
                        break;
                    }
                }
                else if (n <= n2) {
                    break;
                }
                final TreeMap treeMap = this.LIZ.get(n);
                if (treeMap == null) {
                    return null;
                }
                Set set;
                if (b) {
                    set = treeMap.descendingKeySet();
                }
                else {
                    set = treeMap.keySet();
                }
                for (final int intValue : set) {
                    if (b) {
                        if (intValue > n2 || intValue <= n) {
                            continue;
                        }
                    }
                    else if (intValue < n2 || intValue >= n) {
                        continue;
                    }
                    list.add((0Fk)treeMap.get(intValue));
                    n = intValue;
                    continue Label_0000;
                }
                return null;
            }
            return list;
        }
        
        public final void LIZ(final 0Fk... array) {
            for (final 0Fk 0Fk : array) {
                final int liz = 0Fk.LIZ;
                final int liziz = 0Fk.LIZIZ;
                TreeMap treeMap;
                if ((treeMap = this.LIZ.get(liz)) == null) {
                    treeMap = new TreeMap();
                    this.LIZ.put(liz, treeMap);
                }
                treeMap.get(liziz);
                treeMap.put(liziz, 0Fk);
            }
        }
    }
}
