// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Handler;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BasePendingResult;
import android.content.BroadcastReceiver;
import nd.g;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Collection;
import java.util.Iterator;
import android.util.Log;
import java.util.HashSet;
import te.b;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import te.f;
import com.google.android.gms.common.api.a;
import qd.d;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.a$b;
import java.util.Map;
import nd.e;
import java.util.LinkedList;
import android.os.Looper;
import android.content.Context;
import qd.d0;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.api.c;

public final class l0 extends c implements c1
{
    public Integer A;
    public final o1 B;
    public final Lock g;
    public final d0 h;
    public e1 i;
    public final int j;
    public final Context k;
    public final Looper l;
    public final LinkedList m;
    public volatile boolean n;
    public long o;
    public long p;
    public final j0 q;
    public final e r;
    public b1 s;
    public final Map<a$b<?>, a$e> t;
    public Set<Scope> u;
    public final d v;
    public final Map<a<?>, Boolean> w;
    public final a.a<? extends f, te.a> x;
    public final j y;
    public final ArrayList<a2> z;
    
    public l0(Context k, final ReentrantLock g, final Looper l, final d v, final e r, final b x, final j0.b w, final ArrayList list, final ArrayList list2, final j0.b t, int length, final int n, final ArrayList z) {
        this.i = null;
        this.m = new LinkedList();
        this.o = 120000L;
        this.p = 5000L;
        this.u = new HashSet<Scope>();
        this.y = new j();
        this.A = null;
        final cg.j j = new cg.j((Object)this, 5);
        this.k = k;
        this.g = g;
        this.h = new d0(l, j);
        this.l = l;
        this.q = new j0(this, l);
        this.r = r;
        this.j = length;
        if (length >= 0) {
            this.A = n;
        }
        this.w = w;
        this.t = t;
        this.z = z;
        this.B = new o1();
        for (c.b b : list) {
            final d0 h = this.h;
            h.getClass();
            mg.d0.y((Object)b);
            k = (Context)h.n;
            synchronized (k) {
                if (h.g.contains(b)) {
                    final String value = String.valueOf(b);
                    length = value.length();
                    final StringBuilder sb = new StringBuilder(length + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(value);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                }
                else {
                    h.g.add(b);
                }
                monitorexit(k);
                if (h.f.b()) {
                    k = (Context)h.m;
                    ((Handler)k).sendMessage(((Handler)k).obtainMessage(1, (Object)b));
                    continue;
                }
                continue;
            }
            break;
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            this.h.a((c.c)iterator2.next());
        }
        this.v = v;
        this.x = (a.a<? extends f, te.a>)x;
    }
    
    public static int i(final Collection collection, final boolean b) {
        final Iterator iterator = collection.iterator();
        boolean b2 = false;
        boolean b3 = false;
        while (iterator.hasNext()) {
            final a$e a$e = (a$e)iterator.next();
            b2 |= a$e.f();
            b3 |= a$e.c();
        }
        if (!b2) {
            return 3;
        }
        if (b3 && b) {
            return 2;
        }
        return 1;
    }
    
    public final boolean a(final n n) {
        final e1 i = this.i;
        return i != null && i.a(n);
    }
    
    public final void b() {
        final e1 i = this.i;
        if (i != null) {
            i.d();
        }
    }
    
    public final void c() {
        this.g.lock();
        try {
            final int j = this.j;
            final int n = 2;
            final boolean b = false;
            if (j >= 0) {
                mg.d0.D(this.A != null, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                final Integer a = this.A;
                if (a == null) {
                    this.A = i(this.t.values(), false);
                }
                else if (a == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            final Integer a2 = this.A;
            mg.d0.y((Object)a2);
            final int intValue = a2;
            this.g.lock();
            Label_0150: {
                int n2;
                if (intValue != 3 && intValue != 1) {
                    n2 = intValue;
                    final boolean b2 = b;
                    if (intValue != 2) {
                        break Label_0150;
                    }
                    n2 = n;
                }
                else {
                    n2 = intValue;
                }
                final boolean b2 = true;
                try {
                    final StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(n2);
                    mg.d0.q(b2, sb.toString());
                    this.k(n2);
                    this.l();
                    return;
                }
                finally {
                    this.g.unlock();
                }
            }
            throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        finally {
            this.g.unlock();
        }
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pd/l0.g:Ljava/util/concurrent/locks/Lock;
        //     4: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //     9: aload_0        
        //    10: getfield        pd/l0.B:Lpd/o1;
        //    13: astore          8
        //    15: aload           8
        //    17: getfield        pd/o1.a:Ljava/util/Set;
        //    20: iconst_0       
        //    21: anewarray       Lcom/google/android/gms/common/api/internal/BasePendingResult;
        //    24: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    29: checkcast       [Lcom/google/android/gms/common/api/internal/BasePendingResult;
        //    32: astore          6
        //    34: aload           6
        //    36: arraylength    
        //    37: istore_2       
        //    38: iconst_0       
        //    39: istore_1       
        //    40: iload_1        
        //    41: iload_2        
        //    42: if_icmpge       158
        //    45: aload           6
        //    47: iload_1        
        //    48: aaload         
        //    49: astore          7
        //    51: aload           7
        //    53: getfield        com/google/android/gms/common/api/internal/BasePendingResult.e:Ljava/util/concurrent/atomic/AtomicReference;
        //    56: aconst_null    
        //    57: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //    60: aload           7
        //    62: getfield        com/google/android/gms/common/api/internal/BasePendingResult.a:Ljava/lang/Object;
        //    65: astore          4
        //    67: aload           4
        //    69: monitorenter   
        //    70: aload           7
        //    72: getfield        com/google/android/gms/common/api/internal/BasePendingResult.b:Ljava/lang/ref/WeakReference;
        //    75: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    78: checkcast       Lcom/google/android/gms/common/api/c;
        //    81: ifnull          92
        //    84: aload           7
        //    86: getfield        com/google/android/gms/common/api/internal/BasePendingResult.k:Z
        //    89: ifne            97
        //    92: aload           7
        //    94: invokevirtual   com/google/android/gms/common/api/internal/BasePendingResult.c:()V
        //    97: aload           7
        //    99: getfield        com/google/android/gms/common/api/internal/BasePendingResult.a:Ljava/lang/Object;
        //   102: astore          5
        //   104: aload           5
        //   106: monitorenter   
        //   107: aload           7
        //   109: getfield        com/google/android/gms/common/api/internal/BasePendingResult.i:Z
        //   112: istore_3       
        //   113: aload           5
        //   115: monitorexit    
        //   116: aload           4
        //   118: monitorexit    
        //   119: iload_3        
        //   120: ifeq            136
        //   123: aload           8
        //   125: getfield        pd/o1.a:Ljava/util/Set;
        //   128: aload           7
        //   130: invokeinterface java/util/Set.remove:(Ljava/lang/Object;)Z
        //   135: pop            
        //   136: iinc            1, 1
        //   139: goto            40
        //   142: astore          6
        //   144: aload           5
        //   146: monitorexit    
        //   147: aload           6
        //   149: athrow         
        //   150: astore          5
        //   152: aload           4
        //   154: monitorexit    
        //   155: aload           5
        //   157: athrow         
        //   158: aload_0        
        //   159: getfield        pd/l0.i:Lpd/e1;
        //   162: astore          4
        //   164: aload           4
        //   166: ifnull          176
        //   169: aload           4
        //   171: invokeinterface pd/e1.e:()V
        //   176: aload_0        
        //   177: getfield        pd/l0.y:Lpd/j;
        //   180: astore          4
        //   182: aload           4
        //   184: getfield        pd/j.a:Ljava/util/Set;
        //   187: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   192: astore          5
        //   194: aload           5
        //   196: invokeinterface java/util/Iterator.hasNext:()Z
        //   201: ifeq            221
        //   204: aload           5
        //   206: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   211: checkcast       Lpd/i;
        //   214: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   217: pop            
        //   218: goto            194
        //   221: aload           4
        //   223: getfield        pd/j.a:Ljava/util/Set;
        //   226: invokeinterface java/util/Set.clear:()V
        //   231: aload_0        
        //   232: getfield        pd/l0.m:Ljava/util/LinkedList;
        //   235: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
        //   240: astore          4
        //   242: aload           4
        //   244: invokeinterface java/util/Iterator.hasNext:()Z
        //   249: ifeq            281
        //   252: aload           4
        //   254: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   259: checkcast       Lcom/google/android/gms/common/api/internal/a;
        //   262: astore          5
        //   264: aload           5
        //   266: getfield        com/google/android/gms/common/api/internal/BasePendingResult.e:Ljava/util/concurrent/atomic/AtomicReference;
        //   269: aconst_null    
        //   270: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   273: aload           5
        //   275: invokevirtual   com/google/android/gms/common/api/internal/BasePendingResult.c:()V
        //   278: goto            242
        //   281: aload_0        
        //   282: getfield        pd/l0.m:Ljava/util/LinkedList;
        //   285: invokevirtual   java/util/LinkedList.clear:()V
        //   288: aload_0        
        //   289: getfield        pd/l0.i:Lpd/e1;
        //   292: astore          4
        //   294: aload           4
        //   296: ifnonnull       308
        //   299: aload_0        
        //   300: getfield        pd/l0.g:Ljava/util/concurrent/locks/Lock;
        //   303: astore          4
        //   305: goto            340
        //   308: aload_0        
        //   309: invokevirtual   pd/l0.j:()Z
        //   312: pop            
        //   313: aload_0        
        //   314: getfield        pd/l0.h:Lqd/d0;
        //   317: astore          4
        //   319: aload           4
        //   321: iconst_0       
        //   322: putfield        qd/d0.j:Z
        //   325: aload           4
        //   327: getfield        qd/d0.k:Ljava/util/concurrent/atomic/AtomicInteger;
        //   330: invokevirtual   java/util/concurrent/atomic/AtomicInteger.incrementAndGet:()I
        //   333: pop            
        //   334: aload_0        
        //   335: getfield        pd/l0.g:Ljava/util/concurrent/locks/Lock;
        //   338: astore          4
        //   340: aload           4
        //   342: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   347: return         
        //   348: astore          4
        //   350: aload_0        
        //   351: getfield        pd/l0.g:Ljava/util/concurrent/locks/Lock;
        //   354: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   359: aload           4
        //   361: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      38     348    362    Any
        //  51     70     348    362    Any
        //  70     92     150    158    Any
        //  92     97     150    158    Any
        //  97     107    150    158    Any
        //  107    116    142    150    Any
        //  116    119    150    158    Any
        //  123    136    348    362    Any
        //  144    147    142    150    Any
        //  147    150    150    158    Any
        //  152    155    150    158    Any
        //  155    158    348    362    Any
        //  158    164    348    362    Any
        //  169    176    348    362    Any
        //  176    194    348    362    Any
        //  194    218    348    362    Any
        //  221    242    348    362    Any
        //  242    278    348    362    Any
        //  281    294    348    362    Any
        //  308    334    348    362    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("mContext=").println(this.k);
        printWriter.append(s).append("mResuming=").print(this.n);
        printWriter.append(" mWorkQueue.size()=").print(this.m.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.B.a.size());
        final e1 i = this.i;
        if (i != null) {
            i.f(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends od.c, A>> T f(T b) {
        final a n = b.n;
        final boolean containsKey = this.t.containsKey(b.m);
        String c;
        if (n != null) {
            c = n.c;
        }
        else {
            c = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(c);
        sb.append(" required for this call.");
        mg.d0.q(containsKey, sb.toString());
        this.g.lock();
        try {
            final e1 i = this.i;
            if (i != null) {
                Lock lock;
                if (this.n) {
                    this.m.add(b);
                    while (!this.m.isEmpty()) {
                        final com.google.android.gms.common.api.internal.a a = this.m.remove();
                        final o1 b2 = this.B;
                        b2.a.add(a);
                        ((BasePendingResult)a).e.set(b2.b);
                        a.m(Status.m);
                    }
                    lock = this.g;
                }
                else {
                    b = (T)i.b((com.google.android.gms.common.api.internal.a)b);
                    lock = this.g;
                }
                lock.unlock();
                return b;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        finally {
            this.g.unlock();
        }
    }
    
    public final a$e g(final a.f f) {
        final a$e a$e = this.t.get(f);
        mg.d0.z((Object)a$e, "Appropriate Api was not requested.");
        return a$e;
    }
    
    public final void h(final nd.b b) {
        final e r = this.r;
        final Context k = this.k;
        final int g = b.g;
        r.getClass();
        if (!nd.g.isPlayServicesPossiblyUpdating(k, g)) {
            this.j();
        }
        if (!this.n) {
            final d0 h = this.h;
            mg.d0.t(h.m, "onConnectionFailure must only be called on the Handler thread");
            ((Handler)h.m).removeMessages(1);
            synchronized (h.n) {
                final ArrayList list = new ArrayList(h.i);
                final int value = h.k.get();
                while (true) {
                    for (c.c c : list) {
                        if (!h.j || h.k.get() != value) {
                            monitorexit(h.n);
                            final d0 h2 = this.h;
                            h2.j = false;
                            h2.k.incrementAndGet();
                            return;
                        }
                        if (!h.i.contains(c)) {
                            continue;
                        }
                        ((l)c).m(b);
                    }
                    monitorexit(h.n);
                    continue;
                }
            }
        }
    }
    
    public final boolean j() {
        if (!this.n) {
            return false;
        }
        this.n = false;
        ((Handler)this.q).removeMessages(2);
        ((Handler)this.q).removeMessages(1);
        final b1 s = this.s;
        if (s != null) {
            synchronized (s) {
                final Context a = s.a;
                if (a != null) {
                    a.unregisterReceiver((BroadcastReceiver)s);
                }
                s.a = null;
                monitorexit(s);
                this.s = null;
            }
        }
        return true;
    }
    
    public final void k(int n) {
        final Integer a = this.A;
        if (a == null) {
            this.A = n;
        }
        else if (a != n) {
            String s = "UNKNOWN";
            String s2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        s2 = "UNKNOWN";
                    }
                    else {
                        s2 = "SIGN_IN_MODE_NONE";
                    }
                }
                else {
                    s2 = "SIGN_IN_MODE_OPTIONAL";
                }
            }
            else {
                s2 = "SIGN_IN_MODE_REQUIRED";
            }
            n = this.A;
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        s = "SIGN_IN_MODE_NONE";
                    }
                }
                else {
                    s = "SIGN_IN_MODE_OPTIONAL";
                }
            }
            else {
                s = "SIGN_IN_MODE_REQUIRED";
            }
            n = s2.length();
            throw new IllegalStateException(xm2.a.b(new StringBuilder(s.length() + (n + 51)), "Cannot use sign-in mode: ", s2, ". Mode was already set to ", s));
        }
        if (this.i != null) {
            return;
        }
        final Iterator<a$e> iterator = this.t.values().iterator();
        boolean b = false;
        n = 0;
        while (iterator.hasNext()) {
            final a$e a$e = iterator.next();
            b |= a$e.f();
            n |= (a$e.c() ? 1 : 0);
        }
        final int intValue = this.A;
        if (intValue != 1) {
            if (intValue == 2 && b) {
                final Context k = this.k;
                final Lock g = this.g;
                final Looper l = this.l;
                final e r = this.r;
                final Map<a$b<?>, a$e> t = this.t;
                final d v = this.v;
                final Map<a<?>, Boolean> w = this.w;
                final a.a<? extends f, te.a> x = this.x;
                final ArrayList<a2> z = this.z;
                final j0.b b2 = new j0.b<Object, Object>();
                final j0.b b3 = new j0.b();
                final Iterator<Map.Entry<a$b<?>, a$e>> iterator2 = t.entrySet().iterator();
                a$e a$e2 = null;
                while (iterator2.hasNext()) {
                    final Map.Entry<a$b, a$e> entry = (Map.Entry<a$b, a$e>)iterator2.next();
                    final a$e a$e3 = entry.getValue();
                    if (a$e3.c()) {
                        a$e2 = a$e3;
                    }
                    if (a$e3.f()) {
                        b2.put((Object)entry.getKey(), (Object)a$e3);
                    }
                    else {
                        b3.put((Object)entry.getKey(), (Object)a$e3);
                    }
                }
                mg.d0.D(b2.isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                final j0.b b4 = new j0.b();
                final j0.b b5 = new j0.b();
                for (final a a2 : w.keySet()) {
                    final a.f b6 = a2.b;
                    if (b2.containsKey((Object)b6)) {
                        b4.put((Object)a2, (Object)w.get(a2));
                    }
                    else {
                        if (!b3.containsKey((Object)b6)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        b5.put((Object)a2, (Object)w.get(a2));
                    }
                }
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                n = z.size();
                int i = 0;
                final ArrayList list3 = z;
                while (i < n) {
                    final a2 a3 = (a2)list3.get(i);
                    if (b4.containsKey((Object)a3.a)) {
                        list.add(a3);
                    }
                    else {
                        if (!b5.containsKey((Object)a3.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        list2.add(a3);
                    }
                    ++i;
                }
                this.i = (e1)new q(k, this, g, l, r, b2, b3, v, x, a$e2, list, list2, b4, b5);
                return;
            }
        }
        else {
            if (!b) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (n != 0) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.i = (e1)new p0(this.k, this, this.g, this.l, this.r, (Map)this.t, this.v, (Map)this.w, (a.a)this.x, (ArrayList)this.z, (c1)this);
    }
    
    public final void l() {
        this.h.j = true;
        final e1 i = this.i;
        mg.d0.y((Object)i);
        i.c();
    }
    
    public final void m(int i, final boolean b) {
        int n = i;
        Label_0122: {
            if (i != 1) {
                break Label_0122;
            }
            Label_0120: {
                if (b) {
                    break Label_0120;
                }
                if (this.n) {
                    break Label_0120;
                }
                this.n = true;
                while (true) {
                    if (this.s != null) {
                        break Label_0076;
                    }
                    try {
                        final e r = this.r;
                        final Context applicationContext = this.k.getApplicationContext();
                        final k0 k0 = new k0(this);
                        r.getClass();
                        this.s = e.h(applicationContext, (android.support.v4.media.b)k0);
                        final j0 q = this.q;
                        ((Handler)q).sendMessageDelayed(((Handler)q).obtainMessage(1), this.o);
                        final j0 q2 = this.q;
                        ((Handler)q2).sendMessageDelayed(((Handler)q2).obtainMessage(2), this.p);
                        n = 1;
                        final BasePendingResult[] array = this.B.a.toArray(new BasePendingResult[0]);
                        int length;
                        for (length = array.length, i = 0; i < length; ++i) {
                            array[i].e(o1.c);
                        }
                        final d0 h = this.h;
                        mg.d0.t(h.m, "onUnintentionalDisconnection must only be called on the Handler thread");
                        ((Handler)h.m).removeMessages(1);
                        Object o = h.n;
                        synchronized (o) {
                            h.l = true;
                            final ArrayList list = new ArrayList(h.g);
                            i = h.k.get();
                            for (final c.b b2 : list) {
                                if (!h.j) {
                                    break;
                                }
                                if (h.k.get() != i) {
                                    break;
                                }
                                if (!h.g.contains(b2)) {
                                    continue;
                                }
                                ((pd.d)b2).k(n);
                            }
                            h.h.clear();
                            h.l = false;
                            monitorexit(o);
                            o = this.h;
                            ((d0)o).j = false;
                            ((d0)o).k.incrementAndGet();
                            if (n == 2) {
                                this.l();
                            }
                        }
                    }
                    catch (final SecurityException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final void n(final Bundle bundle) {
        while (!this.m.isEmpty()) {
            this.f(this.m.remove());
        }
        final d0 h = this.h;
        mg.d0.t(h.m, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (h.n) {
            mg.d0.C(h.l ^ true);
            ((Handler)h.m).removeMessages(1);
            h.l = true;
            mg.d0.C(h.h.isEmpty());
            final ArrayList list = new ArrayList(h.g);
            final int value = h.k.get();
            for (final c.b b : list) {
                if (!h.j || !h.f.b()) {
                    break;
                }
                if (h.k.get() != value) {
                    break;
                }
                if (h.h.contains(b)) {
                    continue;
                }
                ((pd.d)b).N(bundle);
            }
            h.h.clear();
            h.l = false;
        }
    }
}
