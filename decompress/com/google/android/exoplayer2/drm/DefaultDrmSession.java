// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.Iterator;
import java.util.Map;
import android.media.NotProvisionedException;
import bb.c;
import bb.e;
import bb.d;
import android.os.Handler;
import android.os.SystemClock;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;
import bd.c0;
import android.util.Log;
import java.util.Collections;
import android.os.Looper;
import ab.b;
import android.os.HandlerThread;
import java.util.UUID;
import xa.d0;
import com.google.android.exoplayer2.upstream.h;
import java.util.HashMap;
import java.util.List;

public final class DefaultDrmSession implements DrmSession
{
    public final List<b$b> a;
    public final g b;
    public final DefaultDrmSession.DefaultDrmSession$a c;
    public final DefaultDrmSession.DefaultDrmSession$b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap<String, String> h;
    public final bd.g<c$a> i;
    public final h j;
    public final d0 k;
    public final j l;
    public final UUID m;
    public final DefaultDrmSession.DefaultDrmSession$e n;
    public int o;
    public int p;
    public HandlerThread q;
    public DefaultDrmSession.DefaultDrmSession$c r;
    public b s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public g$a w;
    public g$d x;
    
    public DefaultDrmSession(final UUID m, final g b, final DefaultDrmSessionManager.f c, final DefaultDrmSessionManager.g d, final List list, final int e, final boolean f, final boolean g, final byte[] v, final HashMap h, final j l, final Looper looper, final h j, final d0 k) {
        if (e == 1 || e == 3) {
            v.getClass();
        }
        this.m = m;
        this.c = (DefaultDrmSession.DefaultDrmSession$a)c;
        this.d = (DefaultDrmSession.DefaultDrmSession$b)d;
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        if (v != null) {
            this.v = v;
            this.a = null;
        }
        else {
            list.getClass();
            this.a = Collections.unmodifiableList((List<? extends b$b>)list);
        }
        this.h = h;
        this.l = l;
        this.i = (bd.g<c$a>)new bd.g();
        this.j = j;
        this.k = k;
        this.o = 2;
        this.n = new DefaultDrmSession.DefaultDrmSession$e(this, looper);
    }
    
    public final void a(final c$a c$a) {
        int p = this.p;
        if (p <= 0) {
            Log.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        --p;
        if ((this.p = p) == 0) {
            this.o = 0;
            final DefaultDrmSession.DefaultDrmSession$e n = this.n;
            final int a = c0.a;
            ((Handler)n).removeCallbacksAndMessages((Object)null);
            Object o = this.r;
            synchronized (o) {
                ((Handler)o).removeCallbacksAndMessages((Object)null);
                ((DefaultDrmSession.DefaultDrmSession$c)o).a = true;
                monitorexit(o);
                this.r = null;
                this.q.quit();
                this.q = null;
                this.s = null;
                this.t = null;
                this.w = null;
                this.x = null;
                o = this.u;
                if (o != null) {
                    this.b.l((byte[])o);
                    this.u = null;
                }
            }
        }
        if (c$a != null) {
            final bd.g<c$a> i = this.i;
            synchronized (i.f) {
                final Integer n2 = i.g.get(c$a);
                if (n2 == null) {
                    monitorexit(i.f);
                }
                else {
                    final ArrayList list = new ArrayList(i.i);
                    list.remove(c$a);
                    i.i = Collections.unmodifiableList((List<?>)list);
                    if (n2 == 1) {
                        i.g.remove(c$a);
                        final HashSet set = new HashSet(i.h);
                        set.remove(c$a);
                        i.h = Collections.unmodifiableSet((Set<?>)set);
                    }
                    else {
                        i.g.put(c$a, n2 - 1);
                    }
                    monitorexit(i.f);
                }
                if (this.i.count((Object)c$a) == 0) {
                    c$a.f();
                }
            }
        }
        final DefaultDrmSession.DefaultDrmSession$b d = this.d;
        final int p2 = this.p;
        final DefaultDrmSessionManager.g g = (DefaultDrmSessionManager.g)d;
        Label_0629: {
            if (p2 == 1) {
                final DefaultDrmSessionManager a2 = g.a;
                if (a2.p > 0 && a2.l != -9223372036854775807L) {
                    a2.o.add(this);
                    final Handler u = g.a.u;
                    u.getClass();
                    u.postAtTime((Runnable)new androidx.activity.g((Object)this, 7), (Object)this, SystemClock.uptimeMillis() + g.a.l);
                    break Label_0629;
                }
            }
            if (p2 == 0) {
                g.a.m.remove(this);
                final DefaultDrmSessionManager a3 = g.a;
                if (a3.r == this) {
                    a3.r = null;
                }
                if (a3.s == this) {
                    a3.s = null;
                }
                final DefaultDrmSessionManager.f j = a3.i;
                j.a.remove(this);
                if (j.b == this) {
                    j.b = null;
                    if (!j.a.isEmpty()) {
                        final DefaultDrmSession b = j.a.iterator().next();
                        j.b = b;
                        final g$d b2 = b.b.b();
                        b.x = b2;
                        final DefaultDrmSession.DefaultDrmSession$c r = b.r;
                        final int a4 = c0.a;
                        b2.getClass();
                        r.getClass();
                        ((Handler)r).obtainMessage(0, (Object)new DefaultDrmSession.DefaultDrmSession$d(bc.h.d.getAndIncrement(), true, SystemClock.elapsedRealtime(), (Object)b2)).sendToTarget();
                    }
                }
                final DefaultDrmSessionManager a5 = g.a;
                if (a5.l != -9223372036854775807L) {
                    final Handler u2 = a5.u;
                    u2.getClass();
                    u2.removeCallbacksAndMessages((Object)this);
                    g.a.o.remove(this);
                }
            }
        }
        g.a.j();
    }
    
    public final boolean b() {
        return this.f;
    }
    
    public final b c() {
        return this.s;
    }
    
    public final void e(final c$a c$a) {
        final int p = this.p;
        boolean b = false;
        if (p < 0) {
            final StringBuilder sb = new StringBuilder(51);
            sb.append("Session reference count less than zero: ");
            sb.append(p);
            Log.e("DefaultDrmSession", sb.toString());
            this.p = 0;
        }
        if (c$a != null) {
            final bd.g<c$a> i = this.i;
            synchronized (i.f) {
                final ArrayList list = new ArrayList<c$a>(i.i);
                list.add(c$a);
                i.i = Collections.unmodifiableList((List<?>)list);
                final Integer n = i.g.get(c$a);
                if (n == null) {
                    final HashSet set = new HashSet<c$a>(i.h);
                    set.add(c$a);
                    i.h = Collections.unmodifiableSet((Set<?>)set);
                }
                final HashMap g = i.g;
                int n2;
                if (n != null) {
                    n2 = n + 1;
                }
                else {
                    n2 = 1;
                }
                g.put(c$a, n2);
            }
        }
        if (++this.p == 1) {
            if (this.o == 2) {
                b = true;
            }
            ah0.b.H(b);
            ((Thread)(this.q = new HandlerThread("ExoPlayer:DrmRequestHandler"))).start();
            this.r = new DefaultDrmSession.DefaultDrmSession$c(this, this.q.getLooper());
            if (this.l()) {
                this.h(true);
            }
        }
        else if (c$a != null && this.i() && this.i.count((Object)c$a) == 1) {
            c$a.d(this.o);
        }
        final DefaultDrmSessionManager.g g2 = (DefaultDrmSessionManager.g)this.d;
        final DefaultDrmSessionManager a = g2.a;
        if (a.l != -9223372036854775807L) {
            a.o.remove(this);
            final Handler u = g2.a.u;
            u.getClass();
            u.removeCallbacksAndMessages((Object)this);
        }
    }
    
    public final UUID f() {
        return this.m;
    }
    
    public final boolean g(final String s) {
        final g b = this.b;
        final byte[] u = this.u;
        ah0.b.I((Object)u);
        return b.f(s, u);
    }
    
    public final DrmSession$DrmSessionException getError() {
        DrmSession$DrmSessionException t;
        if (this.o == 1) {
            t = this.t;
        }
        else {
            t = null;
        }
        return t;
    }
    
    public final int getState() {
        return this.o;
    }
    
    public final void h(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.g:Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.u:[B
        //    12: astore          12
        //    14: getstatic       bd/c0.a:I
        //    17: istore_2       
        //    18: aload_0        
        //    19: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.e:I
        //    22: istore          4
        //    24: iconst_0       
        //    25: istore_2       
        //    26: iconst_0       
        //    27: istore_3       
        //    28: iload           4
        //    30: ifeq            138
        //    33: iload           4
        //    35: iconst_1       
        //    36: if_icmpeq       138
        //    39: iload           4
        //    41: iconst_2       
        //    42: if_icmpeq       83
        //    45: iload           4
        //    47: iconst_3       
        //    48: if_icmpeq       54
        //    51: goto            514
        //    54: aload_0        
        //    55: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.v:[B
        //    58: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    61: pop            
        //    62: aload_0        
        //    63: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.u:[B
        //    66: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    69: pop            
        //    70: aload_0        
        //    71: aload_0        
        //    72: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.v:[B
        //    75: iconst_3       
        //    76: iload_1        
        //    77: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.m:([BIZ)V
        //    80: goto            514
        //    83: aload_0        
        //    84: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.v:[B
        //    87: astore          11
        //    89: aload           11
        //    91: ifnull          127
        //    94: aload_0        
        //    95: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.b:Lcom/google/android/exoplayer2/drm/g;
        //    98: aload           12
        //   100: aload           11
        //   102: invokeinterface com/google/android/exoplayer2/drm/g.d:([B[B)V
        //   107: iconst_1       
        //   108: istore_2       
        //   109: goto            123
        //   112: astore          11
        //   114: aload_0        
        //   115: iconst_1       
        //   116: aload           11
        //   118: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.j:(ILjava/lang/Exception;)V
        //   121: iload_3        
        //   122: istore_2       
        //   123: iload_2        
        //   124: ifeq            514
        //   127: aload_0        
        //   128: aload           12
        //   130: iconst_2       
        //   131: iload_1        
        //   132: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.m:([BIZ)V
        //   135: goto            514
        //   138: aload_0        
        //   139: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.v:[B
        //   142: astore          11
        //   144: aload           11
        //   146: ifnonnull       160
        //   149: aload_0        
        //   150: aload           12
        //   152: iconst_1       
        //   153: iload_1        
        //   154: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.m:([BIZ)V
        //   157: goto            514
        //   160: aload_0        
        //   161: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.o:I
        //   164: iconst_4       
        //   165: if_icmpeq       199
        //   168: aload_0        
        //   169: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.b:Lcom/google/android/exoplayer2/drm/g;
        //   172: aload           12
        //   174: aload           11
        //   176: invokeinterface com/google/android/exoplayer2/drm/g.d:([B[B)V
        //   181: iconst_1       
        //   182: istore_2       
        //   183: goto            195
        //   186: astore          11
        //   188: aload_0        
        //   189: iconst_1       
        //   190: aload           11
        //   192: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.j:(ILjava/lang/Exception;)V
        //   195: iload_2        
        //   196: ifeq            514
        //   199: getstatic       wa/b.d:Ljava/util/UUID;
        //   202: aload_0        
        //   203: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.m:Ljava/util/UUID;
        //   206: invokevirtual   java/util/UUID.equals:(Ljava/lang/Object;)Z
        //   209: ifne            220
        //   212: ldc2_w          9223372036854775807
        //   215: lstore          5
        //   217: goto            360
        //   220: aload_0        
        //   221: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.n:()Ljava/util/Map;
        //   224: astore          11
        //   226: aload           11
        //   228: ifnonnull       237
        //   231: aconst_null    
        //   232: astore          11
        //   234: goto            327
        //   237: ldc2_w          -9223372036854775807
        //   240: lstore          9
        //   242: aload           11
        //   244: ldc_w           "LicenseDurationRemaining"
        //   247: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   252: checkcast       Ljava/lang/String;
        //   255: astore          13
        //   257: aload           13
        //   259: ifnull          272
        //   262: aload           13
        //   264: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   267: lstore          5
        //   269: goto            277
        //   272: ldc2_w          -9223372036854775807
        //   275: lstore          5
        //   277: aload           11
        //   279: ldc_w           "PlaybackDurationRemaining"
        //   282: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   287: checkcast       Ljava/lang/String;
        //   290: astore          11
        //   292: lload           9
        //   294: lstore          7
        //   296: aload           11
        //   298: ifnull          308
        //   301: aload           11
        //   303: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   306: lstore          7
        //   308: new             Landroid/util/Pair;
        //   311: dup            
        //   312: lload           5
        //   314: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   317: lload           7
        //   319: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   322: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   325: astore          11
        //   327: aload           11
        //   329: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   332: pop            
        //   333: aload           11
        //   335: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   338: checkcast       Ljava/lang/Long;
        //   341: invokevirtual   java/lang/Long.longValue:()J
        //   344: aload           11
        //   346: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   349: checkcast       Ljava/lang/Long;
        //   352: invokevirtual   java/lang/Long.longValue:()J
        //   355: invokestatic    java/lang/Math.min:(JJ)J
        //   358: lstore          5
        //   360: aload_0        
        //   361: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.e:I
        //   364: ifne            426
        //   367: lload           5
        //   369: ldc2_w          60
        //   372: lcmp           
        //   373: ifgt            426
        //   376: new             Ljava/lang/StringBuilder;
        //   379: dup            
        //   380: bipush          88
        //   382: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   385: astore          11
        //   387: aload           11
        //   389: ldc_w           "Offline license has expired or will expire soon. Remaining seconds: "
        //   392: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   395: pop            
        //   396: aload           11
        //   398: lload           5
        //   400: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   403: pop            
        //   404: ldc             "DefaultDrmSession"
        //   406: aload           11
        //   408: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   411: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   414: pop            
        //   415: aload_0        
        //   416: aload           12
        //   418: iconst_2       
        //   419: iload_1        
        //   420: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.m:([BIZ)V
        //   423: goto            514
        //   426: lload           5
        //   428: lconst_0       
        //   429: lcmp           
        //   430: ifgt            448
        //   433: aload_0        
        //   434: iconst_2       
        //   435: new             Lcom/google/android/exoplayer2/drm/KeysExpiredException;
        //   438: dup            
        //   439: invokespecial   com/google/android/exoplayer2/drm/KeysExpiredException.<init>:()V
        //   442: invokevirtual   com/google/android/exoplayer2/drm/DefaultDrmSession.j:(ILjava/lang/Exception;)V
        //   445: goto            514
        //   448: aload_0        
        //   449: iconst_4       
        //   450: putfield        com/google/android/exoplayer2/drm/DefaultDrmSession.o:I
        //   453: aload_0        
        //   454: getfield        com/google/android/exoplayer2/drm/DefaultDrmSession.i:Lbd/g;
        //   457: astore          12
        //   459: aload           12
        //   461: getfield        bd/g.f:Ljava/lang/Object;
        //   464: astore          11
        //   466: aload           11
        //   468: monitorenter   
        //   469: aload           12
        //   471: getfield        bd/g.h:Ljava/util/Set;
        //   474: astore          12
        //   476: aload           11
        //   478: monitorexit    
        //   479: aload           12
        //   481: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   486: astore          11
        //   488: aload           11
        //   490: invokeinterface java/util/Iterator.hasNext:()Z
        //   495: ifeq            514
        //   498: aload           11
        //   500: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   505: checkcast       Lcom/google/android/exoplayer2/drm/c$a;
        //   508: invokevirtual   com/google/android/exoplayer2/drm/c$a.c:()V
        //   511: goto            488
        //   514: return         
        //   515: astore          12
        //   517: aload           11
        //   519: monitorexit    
        //   520: aload           12
        //   522: athrow         
        //   523: astore          13
        //   525: goto            272
        //   528: astore          11
        //   530: lload           9
        //   532: lstore          7
        //   534: goto            308
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  94     107    112    123    Ljava/lang/Exception;
        //  168    181    186    195    Ljava/lang/Exception;
        //  242    257    523    528    Ljava/lang/NumberFormatException;
        //  262    269    523    528    Ljava/lang/NumberFormatException;
        //  277    292    528    537    Ljava/lang/NumberFormatException;
        //  301    308    528    537    Ljava/lang/NumberFormatException;
        //  469    479    515    523    Any
        //  517    520    515    523    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0277:
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
    
    public final boolean i() {
        final int o = this.o;
        return o == 3 || o == 4;
    }
    
    public final void j(int b, final Exception ex) {
        final int a = c0.a;
        Label_0155: {
            if (a >= 21 && bb.d.a((Throwable)ex)) {
                b = bb.d.b((Throwable)ex);
            }
            else {
                Label_0038: {
                    if (a < 23 || !bb.e.a((Throwable)ex)) {
                        if (a < 18 || !bb.c.b((Throwable)ex)) {
                            if (a >= 18 && bb.c.a((Throwable)ex)) {
                                b = 6007;
                                break Label_0155;
                            }
                            if (ex instanceof UnsupportedDrmException) {
                                b = 6001;
                                break Label_0155;
                            }
                            if (ex instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                                b = 6003;
                                break Label_0155;
                            }
                            if (ex instanceof KeysExpiredException) {
                                b = 6008;
                                break Label_0155;
                            }
                            if (b == 1) {
                                break Label_0038;
                            }
                            if (b == 2) {
                                b = 6004;
                                break Label_0155;
                            }
                            if (b != 3) {
                                throw new IllegalArgumentException();
                            }
                        }
                        b = 6002;
                        break Label_0155;
                    }
                }
                b = 6006;
            }
        }
        this.t = new DrmSession$DrmSessionException((Throwable)ex, b);
        ah0.b.U("DefaultDrmSession", "DRM session error", (Throwable)ex);
        final bd.g<c$a> i = this.i;
        Object o = i.f;
        synchronized (o) {
            final Set h = i.h;
            monitorexit(o);
            o = h.iterator();
            while (((Iterator)o).hasNext()) {
                ((c$a)((Iterator)o).next()).e(ex);
            }
            if (this.o != 4) {
                this.o = 1;
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public final void k(final Exception ex, final boolean b) {
        if (ex instanceof NotProvisionedException) {
            final DefaultDrmSessionManager.f f = (DefaultDrmSessionManager.f)this.c;
            f.a.add(this);
            if (f.b == null) {
                f.b = this;
                final g$d b2 = this.b.b();
                this.x = b2;
                final DefaultDrmSession.DefaultDrmSession$c r = this.r;
                final int a = c0.a;
                b2.getClass();
                r.getClass();
                ((Handler)r).obtainMessage(0, (Object)new DefaultDrmSession.DefaultDrmSession$d(bc.h.d.getAndIncrement(), true, SystemClock.elapsedRealtime(), (Object)b2)).sendToTarget();
            }
        }
        else {
            int n;
            if (b) {
                n = 1;
            }
            else {
                n = 2;
            }
            this.j(n, ex);
        }
    }
    
    public final boolean l() {
        if (this.i()) {
            return true;
        }
        try {
            final byte[] c = this.b.c();
            this.u = c;
            this.b.j(c, this.k);
            this.s = this.b.k(this.u);
            this.o = 3;
            final bd.g<c$a> i = this.i;
            Object o = i.f;
            synchronized (o) {
                final Set h = i.h;
                monitorexit(o);
                o = h.iterator();
                while (((Iterator)o).hasNext()) {
                    ((c$a)((Iterator)o).next()).d(3);
                }
                this.u.getClass();
                return true;
            }
        }
        catch (final Exception ex) {
            this.j(1, ex);
        }
        catch (final NotProvisionedException ex2) {
            final DefaultDrmSessionManager.f f = (DefaultDrmSessionManager.f)this.c;
            f.a.add(this);
            if (f.b == null) {
                f.b = this;
                final g$d b = this.b.b();
                this.x = b;
                final DefaultDrmSession.DefaultDrmSession$c r = this.r;
                final int a = c0.a;
                b.getClass();
                r.getClass();
                ((Handler)r).obtainMessage(0, (Object)new DefaultDrmSession.DefaultDrmSession$d(bc.h.d.getAndIncrement(), true, SystemClock.elapsedRealtime(), (Object)b)).sendToTarget();
            }
        }
        return false;
    }
    
    public final void m(final byte[] array, int a, final boolean b) {
        try {
            final g$a m = this.b.m(array, (List)this.a, a, (HashMap)this.h);
            this.w = m;
            final DefaultDrmSession.DefaultDrmSession$c r = this.r;
            a = c0.a;
            m.getClass();
            r.getClass();
            ((Handler)r).obtainMessage(1, (Object)new DefaultDrmSession.DefaultDrmSession$d(bc.h.d.getAndIncrement(), b, SystemClock.elapsedRealtime(), (Object)m)).sendToTarget();
        }
        catch (final Exception ex) {
            this.k(ex, true);
        }
    }
    
    public final Map<String, String> n() {
        final byte[] u = this.u;
        Map<String, String> a;
        if (u == null) {
            a = null;
        }
        else {
            a = this.b.a(u);
        }
        return a;
    }
}
