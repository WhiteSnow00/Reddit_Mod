// 
// Decompiled by Procyon v0.6.0
// 

package androidx.room;

import java.util.TreeMap;
import java.util.Iterator;
import j5.v;
import java.util.BitSet;
import java.util.HashSet;
import java.util.ArrayList;
import android.content.Context;
import android.app.ActivityManager;
import android.database.Cursor;
import n5.d;
import android.util.Log;
import java.util.Set;
import n5.e;
import android.os.Looper;
import j5.c;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.HashMap;
import java.util.List;
import j5.g;
import n5.b;
import j5.y;
import java.util.concurrent.Executor;
import n5.a;

public abstract class RoomDatabase
{
    @Deprecated
    public volatile n5.a a;
    public Executor b;
    public y c;
    public n5.b d;
    public final g e;
    public boolean f;
    @Deprecated
    public List<b> g;
    public HashMap h;
    public final ReentrantReadWriteLock i;
    public final ThreadLocal<Integer> j;
    public final Map<String, Object> k;
    public final HashMap l;
    
    public RoomDatabase() {
        this.i = new ReentrantReadWriteLock();
        this.j = new ThreadLocal<Integer>();
        this.k = Collections.synchronizedMap(new HashMap<String, Object>());
        this.e = this.g();
        this.l = new HashMap();
        this.h = new HashMap();
    }
    
    public static Object r(final Class clazz, final n5.b b) {
        if (clazz.isInstance(b)) {
            return b;
        }
        if (b instanceof j5.c) {
            return r(clazz, ((j5.c)b).getDelegate());
        }
        return null;
    }
    
    public final void a() {
        if (this.f) {
            return;
        }
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }
    
    public final void b() {
        if (!this.l() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
    
    @Deprecated
    public final void c() {
        this.a();
        this.a();
        final n5.a writableDatabase = this.d.getWritableDatabase();
        this.e.h(writableDatabase);
        if (writableDatabase.n2()) {
            writableDatabase.l1();
        }
        else {
            writableDatabase.beginTransaction();
        }
    }
    
    public abstract void d();
    
    public final void e() {
        if (this.o()) {
            final ReentrantReadWriteLock.WriteLock writeLock = this.i.writeLock();
            writeLock.lock();
            try {
                this.e.g();
                this.d.close();
            }
            finally {
                writeLock.unlock();
            }
        }
    }
    
    public final e f(final String s) {
        this.a();
        this.b();
        return this.d.getWritableDatabase().compileStatement(s);
    }
    
    public abstract g g();
    
    public abstract n5.b h(final androidx.room.b p0);
    
    public List i() {
        return Collections.emptyList();
    }
    
    public Set<Class<? extends k5.a>> j() {
        return Collections.emptySet();
    }
    
    public Map<Class<?>, List<Class<?>>> k() {
        return Collections.emptyMap();
    }
    
    public final boolean l() {
        return this.d.getWritableDatabase().k2();
    }
    
    public final void m() {
        this.d.getWritableDatabase().endTransaction();
        if (!this.l()) {
            final g e = this.e;
            if (e.e.compareAndSet(false, true)) {
                e.d.b.execute((Runnable)e.l);
            }
        }
    }
    
    public final void n(final n5.a a) {
        final g e = this.e;
        synchronized (e) {
            if (e.f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                monitorexit(e);
            }
            else {
                a.execSQL("PRAGMA temp_store = MEMORY;");
                a.execSQL("PRAGMA recursive_triggers='ON';");
                a.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                e.h(a);
                e.g = a.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                e.f = true;
            }
        }
    }
    
    public final boolean o() {
        boolean b = true;
        final n5.a a = this.a;
        if (a == null || !a.isOpen()) {
            b = false;
        }
        return b;
    }
    
    public final Cursor p(final n5.d d) {
        this.a();
        this.b();
        return this.d.getWritableDatabase().f2(d);
    }
    
    @Deprecated
    public final void q() {
        this.d.getWritableDatabase().setTransactionSuccessful();
    }
    
    public enum JournalMode
    {
        AUTOMATIC, 
        TRUNCATE, 
        WRITE_AHEAD_LOGGING;
        
        private static boolean isLowRamDevice(final ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }
        
        public JournalMode resolve(final Context context) {
            if (this != JournalMode.AUTOMATIC) {
                return this;
            }
            final ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
            if (activityManager != null && !isLowRamDevice(activityManager)) {
                return JournalMode.WRITE_AHEAD_LOGGING;
            }
            return JournalMode.TRUNCATE;
        }
    }
    
    public static final class a<T extends RoomDatabase>
    {
        public final Class<T> a;
        public final String b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;
        public Executor f;
        public n5.b.c g;
        public boolean h;
        public JournalMode i;
        public boolean j;
        public boolean k;
        public final c l;
        public HashSet m;
        
        public a(final Context c, final Class<T> a, final String b) {
            this.c = c;
            this.a = a;
            this.b = b;
            this.i = JournalMode.AUTOMATIC;
            this.j = true;
            this.l = new c();
        }
        
        public final void a(final k5.b... array) {
            if (this.m == null) {
                this.m = new HashSet();
            }
            for (final k5.b b : array) {
                this.m.add(b.a);
                this.m.add(b.b);
            }
            this.l.a(array);
        }
        
        public final T b() {
            final Context c = this.c;
            if (c != null) {
                if (this.a != null) {
                    final Executor e = this.e;
                    if (e == null && this.f == null) {
                        final Executor j = m.a.j;
                        this.f = j;
                        this.e = j;
                    }
                    else if (e != null && this.f == null) {
                        this.f = e;
                    }
                    else if (e == null) {
                        final Executor f = this.f;
                        if (f != null) {
                            this.e = f;
                        }
                    }
                    n5.b.c g;
                    if ((g = this.g) == null) {
                        g = new o5.c();
                    }
                    final androidx.room.b f2 = new androidx.room.b(c, this.b, g, this.l, this.d, this.h, this.i.resolve(c), this.e, this.f, this.j, this.k);
                    Object o = this.a;
                    final String name = ((Class)o).getPackage().getName();
                    String s = ((Class)o).getCanonicalName();
                    if (!name.isEmpty()) {
                        s = s.substring(name.length() + 1);
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s.replace('.', '_'));
                    sb.append("_Impl");
                    Object string = sb.toString();
                    try {
                        Object string2;
                        if (name.isEmpty()) {
                            string2 = string;
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(name);
                            sb2.append(".");
                            sb2.append((String)string);
                            string2 = sb2.toString();
                        }
                        final RoomDatabase roomDatabase = (T)Class.forName((String)string2, true, ((Class)o).getClassLoader()).newInstance();
                        roomDatabase.d = roomDatabase.h(f2);
                        o = roomDatabase.j();
                        string = new BitSet();
                        final Iterator iterator = ((Set)o).iterator();
                        while (true) {
                            final boolean hasNext = iterator.hasNext();
                            final int n = -1;
                            if (hasNext) {
                                o = iterator.next();
                                int n2 = f2.g.size() - 1;
                                int n3;
                                while (true) {
                                    n3 = n;
                                    if (n2 < 0) {
                                        break;
                                    }
                                    if (((Class)o).isAssignableFrom(f2.g.get(n2).getClass())) {
                                        ((BitSet)string).set(n2);
                                        n3 = n2;
                                        break;
                                    }
                                    --n2;
                                }
                                if (n3 < 0) {
                                    final StringBuilder r = a.r("A required auto migration spec (");
                                    r.append(((Class)o).getCanonicalName());
                                    r.append(") is missing in the database configuration.");
                                    throw new IllegalArgumentException(r.toString());
                                }
                                roomDatabase.h.put(o, f2.g.get(n3));
                            }
                            else {
                                for (int i = f2.g.size() - 1; i >= 0; --i) {
                                    if (!((BitSet)string).get(i)) {
                                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    }
                                }
                                o = roomDatabase.i().iterator();
                                boolean writeAheadLoggingEnabled;
                                while (true) {
                                    final boolean hasNext2 = ((Iterator)o).hasNext();
                                    writeAheadLoggingEnabled = false;
                                    if (!hasNext2) {
                                        break;
                                    }
                                    string = ((Iterator)o).next();
                                    if (Collections.unmodifiableMap((Map<?, ?>)f2.d.a).containsKey(((k5.b)string).a)) {
                                        continue;
                                    }
                                    f2.d.a((k5.b)string);
                                }
                                string = RoomDatabase.r(v.class, roomDatabase.d);
                                if (string != null) {
                                    ((v)string).f = f2;
                                }
                                if (RoomDatabase.r(j5.b.class, roomDatabase.d) == null) {
                                    if (f2.i == JournalMode.WRITE_AHEAD_LOGGING) {
                                        writeAheadLoggingEnabled = true;
                                    }
                                    roomDatabase.d.setWriteAheadLoggingEnabled(writeAheadLoggingEnabled);
                                    roomDatabase.g = f2.e;
                                    roomDatabase.b = f2.j;
                                    roomDatabase.c = new y(f2.k);
                                    roomDatabase.f = f2.h;
                                    o = roomDatabase.k();
                                    string = new BitSet();
                                    for (final Map.Entry<Class, V> entry : ((Map<Object, Object>)o).entrySet()) {
                                        o = entry.getKey();
                                    Label_0796:
                                        for (final Class clazz : (List)entry.getValue()) {
                                            int k = f2.f.size() - 1;
                                            while (true) {
                                                while (k >= 0) {
                                                    if (clazz.isAssignableFrom(f2.f.get(k).getClass())) {
                                                        ((BitSet)string).set(k);
                                                        if (k >= 0) {
                                                            roomDatabase.l.put(clazz, f2.f.get(k));
                                                            continue Label_0796;
                                                        }
                                                        final StringBuilder sb3 = new StringBuilder();
                                                        sb3.append("A required type converter (");
                                                        sb3.append(clazz);
                                                        sb3.append(") for ");
                                                        sb3.append(((Class)o).getCanonicalName());
                                                        sb3.append(" is missing in the database configuration.");
                                                        throw new IllegalArgumentException(sb3.toString());
                                                    }
                                                    else {
                                                        --k;
                                                    }
                                                }
                                                k = -1;
                                                continue;
                                            }
                                        }
                                    }
                                    for (int l = f2.f.size() - 1; l >= 0; --l) {
                                        if (!((BitSet)string).get(l)) {
                                            final Object value = f2.f.get(l);
                                            string = new StringBuilder();
                                            ((StringBuilder)string).append("Unexpected type converter ");
                                            ((StringBuilder)string).append(value);
                                            ((StringBuilder)string).append(". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            throw new IllegalArgumentException(((StringBuilder)string).toString());
                                        }
                                    }
                                    return (T)roomDatabase;
                                }
                                roomDatabase.e.getClass();
                                throw null;
                            }
                        }
                    }
                    catch (final InstantiationException ex) {
                        final StringBuilder r2 = a.r("Failed to create an instance of ");
                        r2.append(((Class)o).getCanonicalName());
                        throw new RuntimeException(r2.toString());
                    }
                    catch (final IllegalAccessException ex2) {
                        final StringBuilder r3 = a.r("Cannot access the constructor");
                        r3.append(((Class)o).getCanonicalName());
                        throw new RuntimeException(r3.toString());
                    }
                    catch (final ClassNotFoundException ex3) {
                        final StringBuilder r4 = a.r("cannot find implementation for ");
                        r4.append(((Class)o).getCanonicalName());
                        r4.append(". ");
                        r4.append((String)string);
                        r4.append(" does not exist");
                        throw new RuntimeException(r4.toString());
                    }
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }
    
    public abstract static class b
    {
        public void a(final o5.a a) {
        }
        
        public void b(final o5.a a) {
        }
    }
    
    public static final class c
    {
        public HashMap<Integer, TreeMap<Integer, k5.b>> a;
        
        public c() {
            this.a = new HashMap<Integer, TreeMap<Integer, k5.b>>();
        }
        
        public final void a(final k5.b... array) {
            for (final k5.b b : array) {
                final int a = b.a;
                final int b2 = b.b;
                TreeMap treeMap;
                if ((treeMap = this.a.get(a)) == null) {
                    treeMap = new TreeMap();
                    this.a.put(a, treeMap);
                }
                final k5.b b3 = (k5.b)treeMap.get(b2);
                if (b3 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Overriding migration ");
                    sb.append(b3);
                    sb.append(" with ");
                    sb.append(b);
                    Log.w("ROOM", sb.toString());
                }
                treeMap.put(b2, b);
            }
        }
    }
    
    public interface d
    {
        void a();
    }
}
