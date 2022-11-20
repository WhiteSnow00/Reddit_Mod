// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.api.Status;
import android.app.PendingIntent;
import od.c;
import mg.d0;
import android.util.Log;
import java.util.Iterator;
import j0.h$c;
import cg.j;
import h.s;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.ArrayList;
import com.google.android.gms.common.api.a;
import qd.d;
import nd.e;
import java.util.concurrent.locks.Lock;
import nd.b;
import android.os.Bundle;
import com.google.android.gms.common.api.a$e;
import java.util.Set;
import com.google.android.gms.common.api.a$b;
import java.util.Map;
import android.os.Looper;
import android.content.Context;

public final class q implements e1
{
    public final Context a;
    public final l0 b;
    public final Looper c;
    public final p0 d;
    public final p0 e;
    public final Map<a$b<?>, p0> f;
    public final Set<n> g;
    public final a$e h;
    public Bundle i;
    public b j;
    public b k;
    public boolean l;
    public final Lock m;
    public int n;
    
    public q(final Context a, final l0 b, final Lock m, final Looper c, final e e, final j0.b b2, final j0.b b3, final d d, final a.a a2, final a$e h, final ArrayList list, final ArrayList list2, final j0.b b4, final j0.b b5) {
        this.g = Collections.newSetFromMap(new WeakHashMap<n, Boolean>());
        this.j = null;
        this.k = null;
        this.l = false;
        this.n = 0;
        this.a = a;
        this.b = b;
        this.m = m;
        this.c = c;
        this.h = h;
        this.d = new p0(a, b, m, c, e, (Map)b3, (d)null, (Map)b5, (a.a)null, list2, (c1)new s(this));
        this.e = new p0(a, b, m, c, e, (Map)b2, d, (Map)b4, a2, list, (c1)new j(this));
        final j0.b b6 = new j0.b();
        final Iterator iterator = ((h$c)b3.keySet()).iterator();
        while (iterator.hasNext()) {
            b6.put((Object)iterator.next(), (Object)this.d);
        }
        final Iterator iterator2 = ((h$c)b2.keySet()).iterator();
        while (iterator2.hasNext()) {
            b6.put((Object)iterator2.next(), (Object)this.e);
        }
        this.f = (Map<a$b<?>, p0>)Collections.unmodifiableMap((Map<?, ?>)b6);
    }
    
    public static /* bridge */ void j(final q q, final int n, final boolean b) {
        q.b.m(n, b);
        q.k = null;
        q.j = null;
    }
    
    public static void k(final q q) {
        final b j = q.j;
        final int n = 1;
        if (j != null && j.q()) {
            final b k = q.k;
            if (k == null || !k.q()) {
                final b i = q.k;
                if (i == null || i.g != 4) {
                    if (i == null) {
                        return;
                    }
                    if (q.n == 1) {
                        q.i();
                        return;
                    }
                    q.h(i);
                    q.d.e();
                    return;
                }
            }
            final int n2 = q.n;
            Label_0171: {
                if (n2 != 1) {
                    if (n2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new AssertionError());
                        break Label_0171;
                    }
                    final l0 b = q.b;
                    d0.y((Object)b);
                    b.n(q.i);
                }
                q.i();
            }
            q.n = 0;
            return;
        }
        if (q.j != null) {
            final b l = q.k;
            int n3;
            if (l != null && l.q()) {
                n3 = n;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                q.e.e();
                final b m = q.j;
                d0.y((Object)m);
                q.h(m);
                return;
            }
        }
        b j2 = q.j;
        if (j2 != null) {
            final b k2 = q.k;
            if (k2 != null) {
                if (q.e.l < q.d.l) {
                    j2 = k2;
                }
                q.h(j2);
            }
        }
    }
    
    public final boolean a(final n p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //     4: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //     9: aload_0        
        //    10: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //    13: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    18: aload_0        
        //    19: getfield        pd/q.n:I
        //    22: istore_2       
        //    23: iload_2        
        //    24: iconst_2       
        //    25: if_icmpne       33
        //    28: iconst_1       
        //    29: istore_2       
        //    30: goto            35
        //    33: iconst_0       
        //    34: istore_2       
        //    35: aload_0        
        //    36: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //    39: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    44: iload_2        
        //    45: ifne            55
        //    48: aload_0        
        //    49: invokevirtual   pd/q.g:()Z
        //    52: ifeq            114
        //    55: aload_0        
        //    56: getfield        pd/q.e:Lpd/p0;
        //    59: getfield        pd/p0.k:Lpd/m0;
        //    62: instanceof      Lpd/x;
        //    65: ifne            114
        //    68: aload_0        
        //    69: getfield        pd/q.g:Ljava/util/Set;
        //    72: aload_1        
        //    73: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    78: pop            
        //    79: aload_0        
        //    80: getfield        pd/q.n:I
        //    83: ifne            91
        //    86: aload_0        
        //    87: iconst_1       
        //    88: putfield        pd/q.n:I
        //    91: aload_0        
        //    92: aconst_null    
        //    93: putfield        pd/q.k:Lnd/b;
        //    96: aload_0        
        //    97: getfield        pd/q.e:Lpd/p0;
        //   100: invokevirtual   pd/p0.c:()V
        //   103: aload_0        
        //   104: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   107: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   112: iconst_1       
        //   113: ireturn        
        //   114: aload_0        
        //   115: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   118: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   123: iconst_0       
        //   124: ireturn        
        //   125: astore_1       
        //   126: goto            141
        //   129: astore_1       
        //   130: aload_0        
        //   131: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   134: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   139: aload_1        
        //   140: athrow         
        //   141: aload_0        
        //   142: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   145: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   150: aload_1        
        //   151: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      18     125    129    Any
        //  18     23     129    141    Any
        //  35     44     125    129    Any
        //  48     55     125    129    Any
        //  55     91     125    129    Any
        //  91     103    125    129    Any
        //  130    141    125    129    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends c, A>> T b(final T t) {
        final p0 p = this.f.get(t.m);
        d0.z((Object)p, "GoogleApiClient is not configured to use the API required for this call.");
        if (!p.equals(this.e)) {
            final p0 d = this.d;
            d.getClass();
            ((BasePendingResult)t).j();
            return (T)d.k.e((com.google.android.gms.common.api.internal.a)t);
        }
        final b k = this.k;
        if (k != null && k.g == 4) {
            PendingIntent activity;
            if (this.h == null) {
                activity = null;
            }
            else {
                activity = PendingIntent.getActivity(this.a, System.identityHashCode(this.b), this.h.l(), ee.e.a | 0x8000000);
            }
            t.m(new Status(4, activity, (String)null));
            return t;
        }
        final p0 e = this.e;
        e.getClass();
        ((BasePendingResult)t).j();
        return (T)e.k.e((com.google.android.gms.common.api.internal.a)t);
    }
    
    public final void c() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.c();
        this.e.c();
    }
    
    public final void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //     4: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //     9: aload_0        
        //    10: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //    13: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    18: aload_0        
        //    19: getfield        pd/q.n:I
        //    22: istore_1       
        //    23: iload_1        
        //    24: iconst_2       
        //    25: if_icmpne       33
        //    28: iconst_1       
        //    29: istore_1       
        //    30: goto            35
        //    33: iconst_0       
        //    34: istore_1       
        //    35: aload_0        
        //    36: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //    39: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    44: aload_0        
        //    45: getfield        pd/q.e:Lpd/p0;
        //    48: invokevirtual   pd/p0.e:()V
        //    51: new             Lnd/b;
        //    54: astore_2       
        //    55: aload_2        
        //    56: iconst_4       
        //    57: invokespecial   nd/b.<init>:(I)V
        //    60: aload_0        
        //    61: aload_2        
        //    62: putfield        pd/q.k:Lnd/b;
        //    65: iload_1        
        //    66: ifeq            100
        //    69: new             Lee/f;
        //    72: astore_3       
        //    73: aload_3        
        //    74: aload_0        
        //    75: getfield        pd/q.c:Landroid/os/Looper;
        //    78: invokespecial   ee/f.<init>:(Landroid/os/Looper;)V
        //    81: new             Lcom/android/billingclient/api/c0;
        //    84: astore_2       
        //    85: aload_2        
        //    86: aload_0        
        //    87: iconst_2       
        //    88: invokespecial   com/android/billingclient/api/c0.<init>:(Ljava/lang/Object;I)V
        //    91: aload_3        
        //    92: aload_2        
        //    93: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    96: pop            
        //    97: goto            104
        //   100: aload_0        
        //   101: invokevirtual   pd/q.i:()V
        //   104: aload_0        
        //   105: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   108: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   113: return         
        //   114: astore_2       
        //   115: goto            130
        //   118: astore_2       
        //   119: aload_0        
        //   120: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   123: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   128: aload_2        
        //   129: athrow         
        //   130: aload_0        
        //   131: getfield        pd/q.m:Ljava/util/concurrent/locks/Lock;
        //   134: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   139: aload_2        
        //   140: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  9      18     114    118    Any
        //  18     23     118    130    Any
        //  35     65     114    118    Any
        //  69     97     114    118    Any
        //  100    104    114    118    Any
        //  119    130    114    118    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public final void e() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.e();
        this.e.e();
        this.i();
    }
    
    public final void f(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("authClient").println(":");
        this.e.f(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
        printWriter.append(s).append("anonClient").println(":");
        this.d.f(String.valueOf(s).concat("  "), fileDescriptor, printWriter, array);
    }
    
    public final boolean g() {
        this.m.lock();
        try {
            final boolean b = this.d.k instanceof x;
            final boolean b2 = true;
            if (b) {
                boolean b3 = b2;
                if (this.e.k instanceof x) {
                    return b3;
                }
                final b k = this.k;
                final boolean b4 = k != null && k.g == 4;
                b3 = b2;
                if (b4) {
                    return b3;
                }
                if (this.n == 1) {
                    b3 = b2;
                    return b3;
                }
            }
            return false;
        }
        finally {
            this.m.unlock();
        }
    }
    
    public final void h(final b b) {
        final int n = this.n;
        Label_0046: {
            if (n != 1) {
                if (n != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", (Throwable)new Exception());
                    break Label_0046;
                }
                this.b.h(b);
            }
            this.i();
        }
        this.n = 0;
    }
    
    public final void i() {
        final Iterator<n> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().onComplete();
        }
        this.g.clear();
    }
}
