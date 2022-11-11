// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import j0.g;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import ie.k2;
import ie.j2;
import ie.f2;
import ie.e2;
import np.a;
import ie.d2;
import ie.c2;
import ie.b2;
import ie.a2;
import java.util.Collection;
import java.util.ArrayList;
import ie.e6;
import java.util.Map;
import com.google.android.gms.internal.measurement.zzd;
import com.android.billingclient.api.x;
import ie.q0;
import ie.c4;
import ie.s2;
import android.text.TextUtils;
import lq0.k;
import pd.r;
import ie.q2;
import java.util.List;
import java.util.Collections;
import com.google.android.gms.internal.measurement.w;
import java.util.HashSet;
import ie.t2;
import com.google.android.gms.internal.measurement.zzko;
import ie.b6;
import java.util.Iterator;
import ie.x2;
import ie.u2;
import j0.b;

public final class b4 extends b7 implements e
{
    public final b i;
    public final b j;
    public final b k;
    public final b l;
    public final b m;
    public final b n;
    public final z3 o;
    public final a2.b p;
    public final b q;
    public final b r;
    public final b s;
    
    public b4(final g7 g7) {
        super(g7);
        this.i = new b();
        this.j = new b();
        this.k = new b();
        this.l = new b();
        this.m = new b();
        this.q = new b();
        this.r = new b();
        this.s = new b();
        this.n = new b();
        this.o = new z3(this);
        this.p = new a2.b(this);
    }
    
    public static final b U(final u2 u2) {
        final b b = new b();
        for (final x2 x2 : u2.D()) {
            b.put((Object)x2.s(), (Object)x2.t());
        }
        return b;
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final u2 Q(final String s, final byte[] array) {
        if (array == null) {
            return u2.x();
        }
        try {
            final u2 u2 = (u2)i7.f0(ie.u2.v(), array).j();
            final b3 s2 = ((h4)super.f).h().s;
            final boolean i = u2.I();
            Object y = null;
            Long value;
            if (i) {
                value = u2.t();
            }
            else {
                value = null;
            }
            if (u2.H()) {
                y = u2.y();
            }
            s2.c((Object)value, "Parsed config. version, gmp_app_id", y);
            return u2;
        }
        catch (final RuntimeException ex) {
            ((h4)super.f).h().n.c((Object)d3.V(s), "Unable to merge remote config. appId", (Object)ex);
            return u2.x();
        }
        catch (final zzko zzko) {
            ((h4)super.f).h().n.c((Object)d3.V(s), "Unable to merge remote config. appId", (Object)zzko);
            return u2.x();
        }
    }
    
    public final void R(final String s, final t2 t2) {
        final HashSet set = new HashSet();
        final b b = new b();
        final b b2 = new b();
        final b b3 = new b();
        w.b();
        if (((h4)super.f).l.V(null, r2.n0)) {
            final Iterator<q2> iterator = Collections.unmodifiableList((List<? extends q2>)((u2)t2.g).B()).iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().s());
            }
        }
        for (int i = 0; i < ((u2)t2.g).s(); ++i) {
            final ie.r2 r2 = (ie.r2)((u2)t2.g).u(i).o();
            if (r2.m().isEmpty()) {
                ((h4)super.f).h().n.a("EventConfig contained null event name");
            }
            else {
                final String m = r2.m();
                final String z0 = lq0.k.Z0(r2.m(), pd.r.g, pd.r.i);
                if (!TextUtils.isEmpty((CharSequence)z0)) {
                    if (r2.h) {
                        r2.l();
                        r2.h = false;
                    }
                    s2.u((s2)r2.g, z0);
                    if (t2.h) {
                        t2.l();
                        t2.h = false;
                    }
                    u2.E((u2)t2.g, i, (s2)r2.j());
                }
                if (((s2)r2.g).x() && ((s2)r2.g).v()) {
                    b.put((Object)m, (Object)Boolean.TRUE);
                }
                if (((s2)r2.g).y() && ((s2)r2.g).w()) {
                    b2.put((Object)r2.m(), (Object)Boolean.TRUE);
                }
                if (((s2)r2.g).z()) {
                    if (((s2)r2.g).r() >= 2 && ((s2)r2.g).r() <= 65535) {
                        b3.put((Object)r2.m(), (Object)((s2)r2.g).r());
                    }
                    else {
                        ((h4)super.f).h().n.c((Object)r2.m(), "Invalid sampling rate. Event name, sample rate", (Object)((s2)r2.g).r());
                    }
                }
            }
        }
        this.j.put((Object)s, (Object)set);
        this.k.put((Object)s, (Object)b);
        this.l.put((Object)s, (Object)b2);
        this.n.put((Object)s, (Object)b3);
    }
    
    public final void S(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   pe/b7.N:()V
        //     4: aload_0        
        //     5: invokevirtual   z0/d1.M:()V
        //     8: aload_1        
        //     9: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: getfield        pe/b4.m:Lj0/b;
        //    16: astore_2       
        //    17: aconst_null    
        //    18: astore_3       
        //    19: aload_2        
        //    20: aload_1        
        //    21: aconst_null    
        //    22: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    25: ifnonnull       543
        //    28: aload_0        
        //    29: getfield        pe/a7.g:Lpe/g7;
        //    32: getfield        pe/g7.h:Lpe/k;
        //    35: astore          4
        //    37: aload           4
        //    39: invokestatic    pe/g7.H:(Lpe/b7;)V
        //    42: aload_1        
        //    43: invokestatic    lw0/b.O:(Ljava/lang/String;)V
        //    46: aload           4
        //    48: invokevirtual   z0/d1.M:()V
        //    51: aload           4
        //    53: invokevirtual   pe/b7.N:()V
        //    56: aload           4
        //    58: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //    61: ldc_w           "apps"
        //    64: iconst_3       
        //    65: anewarray       Ljava/lang/String;
        //    68: dup            
        //    69: iconst_0       
        //    70: ldc_w           "remote_config"
        //    73: aastore        
        //    74: dup            
        //    75: iconst_1       
        //    76: ldc_w           "config_last_modified_time"
        //    79: aastore        
        //    80: dup            
        //    81: iconst_2       
        //    82: ldc_w           "e_tag"
        //    85: aastore        
        //    86: ldc_w           "app_id=?"
        //    89: iconst_1       
        //    90: anewarray       Ljava/lang/String;
        //    93: dup            
        //    94: iconst_0       
        //    95: aload_1        
        //    96: aastore        
        //    97: aconst_null    
        //    98: aconst_null    
        //    99: aconst_null    
        //   100: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   103: astore_2       
        //   104: aload_2        
        //   105: astore_3       
        //   106: aload_2        
        //   107: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   112: ifne            118
        //   115: goto            301
        //   118: aload_2        
        //   119: astore_3       
        //   120: aload_2        
        //   121: iconst_0       
        //   122: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   127: astore          5
        //   129: aload_2        
        //   130: astore_3       
        //   131: aload_2        
        //   132: iconst_1       
        //   133: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   138: astore          6
        //   140: aload_2        
        //   141: astore_3       
        //   142: aload           4
        //   144: getfield        z0/d1.f:Ljava/lang/Object;
        //   147: checkcast       Lpe/h4;
        //   150: getfield        pe/h4.l:Lpe/f;
        //   153: aconst_null    
        //   154: getstatic       pe/r2.y0:Lpe/q2;
        //   157: invokevirtual   pe/f.V:(Ljava/lang/String;Lpe/q2;)Z
        //   160: ifeq            177
        //   163: aload_2        
        //   164: astore_3       
        //   165: aload_2        
        //   166: iconst_2       
        //   167: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   172: astore          7
        //   174: goto            180
        //   177: aconst_null    
        //   178: astore          7
        //   180: aload_2        
        //   181: astore_3       
        //   182: aload_2        
        //   183: invokeinterface android/database/Cursor.moveToNext:()Z
        //   188: ifeq            217
        //   191: aload_2        
        //   192: astore_3       
        //   193: aload           4
        //   195: getfield        z0/d1.f:Ljava/lang/Object;
        //   198: checkcast       Lpe/h4;
        //   201: invokevirtual   pe/h4.h:()Lpe/d3;
        //   204: getfield        pe/d3.k:Lpe/b3;
        //   207: aload_1        
        //   208: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   211: ldc_w           "Got multiple records for app config, expected one. appId"
        //   214: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   217: aload           5
        //   219: ifnonnull       225
        //   222: goto            301
        //   225: aload_2        
        //   226: astore_3       
        //   227: new             Lpe/h;
        //   230: dup            
        //   231: aload           5
        //   233: aload           6
        //   235: aload           7
        //   237: invokespecial   pe/h.<init>:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   240: astore          7
        //   242: aload_2        
        //   243: invokeinterface android/database/Cursor.close:()V
        //   248: aload           7
        //   250: astore_2       
        //   251: goto            309
        //   254: astore          7
        //   256: goto            269
        //   259: astore_1       
        //   260: aload_3        
        //   261: astore_2       
        //   262: goto            531
        //   265: astore          7
        //   267: aconst_null    
        //   268: astore_2       
        //   269: aload_2        
        //   270: astore_3       
        //   271: aload           4
        //   273: getfield        z0/d1.f:Ljava/lang/Object;
        //   276: checkcast       Lpe/h4;
        //   279: invokevirtual   pe/h4.h:()Lpe/d3;
        //   282: getfield        pe/d3.k:Lpe/b3;
        //   285: aload_1        
        //   286: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   289: ldc_w           "Error querying remote config. appId"
        //   292: aload           7
        //   294: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   297: aload_2        
        //   298: ifnull          307
        //   301: aload_2        
        //   302: invokeinterface android/database/Cursor.close:()V
        //   307: aconst_null    
        //   308: astore_2       
        //   309: aload_2        
        //   310: ifnonnull       404
        //   313: aload_0        
        //   314: getfield        pe/b4.i:Lj0/b;
        //   317: aload_1        
        //   318: aconst_null    
        //   319: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   322: pop            
        //   323: aload_0        
        //   324: getfield        pe/b4.k:Lj0/b;
        //   327: aload_1        
        //   328: aconst_null    
        //   329: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   332: pop            
        //   333: aload_0        
        //   334: getfield        pe/b4.j:Lj0/b;
        //   337: aload_1        
        //   338: aconst_null    
        //   339: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   342: pop            
        //   343: aload_0        
        //   344: getfield        pe/b4.l:Lj0/b;
        //   347: aload_1        
        //   348: aconst_null    
        //   349: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   352: pop            
        //   353: aload_0        
        //   354: getfield        pe/b4.m:Lj0/b;
        //   357: aload_1        
        //   358: aconst_null    
        //   359: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   362: pop            
        //   363: aload_0        
        //   364: getfield        pe/b4.q:Lj0/b;
        //   367: aload_1        
        //   368: aconst_null    
        //   369: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   372: pop            
        //   373: aload_0        
        //   374: getfield        pe/b4.r:Lj0/b;
        //   377: aload_1        
        //   378: aconst_null    
        //   379: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   382: pop            
        //   383: aload_0        
        //   384: getfield        pe/b4.s:Lj0/b;
        //   387: aload_1        
        //   388: aconst_null    
        //   389: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   392: pop            
        //   393: aload_0        
        //   394: getfield        pe/b4.n:Lj0/b;
        //   397: aload_1        
        //   398: aconst_null    
        //   399: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   402: pop            
        //   403: return         
        //   404: aload_0        
        //   405: aload_1        
        //   406: aload_2        
        //   407: getfield        pe/h.h:Ljava/lang/Object;
        //   410: checkcast       [B
        //   413: invokevirtual   pe/b4.Q:(Ljava/lang/String;[B)Lie/u2;
        //   416: invokevirtual   ie/e6.o:()Lie/b6;
        //   419: checkcast       Lie/t2;
        //   422: astore_3       
        //   423: aload_0        
        //   424: aload_1        
        //   425: aload_3        
        //   426: invokevirtual   pe/b4.R:(Ljava/lang/String;Lie/t2;)V
        //   429: aload_0        
        //   430: getfield        pe/b4.i:Lj0/b;
        //   433: aload_1        
        //   434: aload_3        
        //   435: invokevirtual   ie/b6.j:()Lie/e6;
        //   438: checkcast       Lie/u2;
        //   441: invokestatic    pe/b4.U:(Lie/u2;)Lj0/b;
        //   444: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   447: pop            
        //   448: aload_0        
        //   449: getfield        pe/b4.m:Lj0/b;
        //   452: aload_1        
        //   453: aload_3        
        //   454: invokevirtual   ie/b6.j:()Lie/e6;
        //   457: checkcast       Lie/u2;
        //   460: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   463: pop            
        //   464: aload_0        
        //   465: aload_1        
        //   466: aload_3        
        //   467: invokevirtual   ie/b6.j:()Lie/e6;
        //   470: checkcast       Lie/u2;
        //   473: invokevirtual   pe/b4.T:(Ljava/lang/String;Lie/u2;)V
        //   476: aload_0        
        //   477: getfield        pe/b4.q:Lj0/b;
        //   480: aload_1        
        //   481: aload_3        
        //   482: getfield        ie/b6.g:Lie/e6;
        //   485: checkcast       Lie/u2;
        //   488: invokevirtual   ie/u2.z:()Ljava/lang/String;
        //   491: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   494: pop            
        //   495: aload_0        
        //   496: getfield        pe/b4.r:Lj0/b;
        //   499: aload_1        
        //   500: aload_2        
        //   501: getfield        pe/h.f:Ljava/lang/Object;
        //   504: checkcast       Ljava/lang/String;
        //   507: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   510: pop            
        //   511: aload_0        
        //   512: getfield        pe/b4.s:Lj0/b;
        //   515: aload_1        
        //   516: aload_2        
        //   517: getfield        pe/h.g:Ljava/lang/Object;
        //   520: checkcast       Ljava/lang/String;
        //   523: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   526: pop            
        //   527: return         
        //   528: astore_1       
        //   529: aload_3        
        //   530: astore_2       
        //   531: aload_2        
        //   532: ifnull          541
        //   535: aload_2        
        //   536: invokeinterface android/database/Cursor.close:()V
        //   541: aload_1        
        //   542: athrow         
        //   543: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  56     104    265    269    Landroid/database/sqlite/SQLiteException;
        //  56     104    259    265    Any
        //  106    115    254    259    Landroid/database/sqlite/SQLiteException;
        //  106    115    528    531    Any
        //  120    129    254    259    Landroid/database/sqlite/SQLiteException;
        //  120    129    528    531    Any
        //  131    140    254    259    Landroid/database/sqlite/SQLiteException;
        //  131    140    528    531    Any
        //  142    163    254    259    Landroid/database/sqlite/SQLiteException;
        //  142    163    528    531    Any
        //  165    174    254    259    Landroid/database/sqlite/SQLiteException;
        //  165    174    528    531    Any
        //  182    191    254    259    Landroid/database/sqlite/SQLiteException;
        //  182    191    528    531    Any
        //  193    217    254    259    Landroid/database/sqlite/SQLiteException;
        //  193    217    528    531    Any
        //  227    242    254    259    Landroid/database/sqlite/SQLiteException;
        //  227    242    528    531    Any
        //  271    297    528    531    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    
    public final void T(final String s, final u2 u2) {
        if (u2.r() != 0) {
            ((h4)super.f).h().s.b((Object)u2.r(), "EES programs found");
            final c4 c4 = ((List<c4>)u2.C()).get(0);
            try {
                final q0 q0 = new q0();
                q0.a.d.a.put("internal.remoteConfig", new x3(this, s));
                q0.a.d.a.put("internal.appMetadata", new y3(this, s));
                q0.a.d.a.put("internal.logger", new x((Object)this, 1));
                q0.a(c4);
                ((g)this.o).put((Object)s, (Object)q0);
                ((h4)super.f).h().s.c((Object)s, "EES program loaded for appId, activities", (Object)c4.r().r());
                final Iterator<Object> iterator = ((List<Object>)c4.r().u()).iterator();
                while (iterator.hasNext()) {
                    ((h4)super.f).h().s.b((Object)iterator.next().s(), "EES program activity");
                }
                return;
            }
            catch (final zzd zzd) {
                ((h4)super.f).h().k.b((Object)s, "Failed to load EES program. appId");
                return;
            }
        }
        ((g)this.o).remove((Object)s);
    }
    
    public final int V(final String s, final String s2) {
        this.M();
        this.S(s);
        final Map map = (Map)this.n.getOrDefault((Object)s, (Object)null);
        if (map == null) {
            return 1;
        }
        final Integer n = map.get(s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    public final u2 W(final String s) {
        this.N();
        this.M();
        lw0.b.O(s);
        this.S(s);
        return (u2)this.m.getOrDefault((Object)s, (Object)null);
    }
    
    public final String X(final String s) {
        this.M();
        this.S(s);
        return (String)this.q.getOrDefault((Object)s, (Object)null);
    }
    
    public final boolean Y(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final u2 u2 = (u2)this.m.getOrDefault((Object)s, (Object)null);
        return u2 != null && u2.r() != 0;
    }
    
    public final boolean Z(final String s, final String s2) {
        this.M();
        this.S(s);
        if ("ecommerce_purchase".equals(s2)) {
            return true;
        }
        if ("purchase".equals(s2) || "refund".equals(s2)) {
            return true;
        }
        final Map map = (Map)this.l.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final boolean a0(final String s, final String s2) {
        this.M();
        this.S(s);
        if ("1".equals(this.k(s, "measurement.upload.blacklist_internal")) && n7.y0(s2)) {
            return true;
        }
        if ("1".equals(this.k(s, "measurement.upload.blacklist_public")) && n7.z0(s2)) {
            return true;
        }
        final Map map = (Map)this.k.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final void b0(final String s, final String s2, final String s3, byte[] i) {
        this.N();
        this.M();
        lw0.b.O(s);
        t2 t2 = (t2)this.Q(s, i).o();
        this.R(s, t2);
        this.T(s, (u2)t2.j());
        this.m.put((Object)s, (Object)t2.j());
        this.q.put((Object)s, (Object)((u2)t2.g).z());
        this.r.put((Object)s, (Object)s2);
        this.s.put((Object)s, (Object)s3);
        this.i.put((Object)s, (Object)U((u2)t2.j()));
        final pe.k h = super.g.h;
        g7.H((b7)h);
        final ArrayList list = new ArrayList(Collections.unmodifiableList((List<?>)((u2)t2.g).A()));
        String s4 = "app_id=? and audience_id=?";
        String s5 = "event_filters";
        String s6;
        String s7;
        t2 t4;
        t2 t6;
        String s8;
        for (int j = 0; j < list.size(); ++j, t6 = t4, s8 = s6, s5 = s7, t2 = t6, s4 = s8) {
            final a2 a2 = (a2)((b2)list.get(j)).o();
            a2 a3;
            if (((b2)a2.g).s() != 0) {
                a3 = a2;
                a2 a4;
                for (int k = 0; k < ((b2)a3.g).s(); ++k, a3 = a4) {
                    final c2 c2 = (c2)((b2)a3.g).v(k).o();
                    final c2 c3 = (c2)c2.g();
                    final String z0 = lq0.k.Z0(((d2)c2.g).x(), pd.r.g, pd.r.i);
                    boolean b;
                    if (z0 != null) {
                        if (c3.h) {
                            c3.l();
                            c3.h = false;
                        }
                        d2.z((d2)c3.g, z0);
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    for (int l = 0; l < ((d2)c2.g).r(); ++l) {
                        final f2 v = ((d2)c2.g).v(l);
                        final String z2 = lq0.k.Z0(v.v(), a.k, a.l);
                        if (z2 != null) {
                            final e2 e2 = (e2)v.o();
                            if (e2.h) {
                                e2.l();
                                e2.h = false;
                            }
                            f2.w((f2)e2.g, z2);
                            final f2 f2 = (f2)e2.j();
                            if (c3.h) {
                                c3.l();
                                c3.h = false;
                            }
                            d2.A((d2)c3.g, l, f2);
                            b = true;
                        }
                    }
                    a4 = a3;
                    if (b) {
                        if (a3.h) {
                            a3.l();
                            a3.h = false;
                        }
                        b2.A((b2)a3.g, k, (d2)c3.j());
                        list.set(j, (Object)a2.j());
                        a4 = a2;
                    }
                }
                final t2 t3 = t2;
                s6 = s4;
                s7 = s5;
                t4 = t3;
            }
            else {
                final t2 t5 = t2;
                s6 = s4;
                s7 = s5;
                final a2 a5 = a2;
                t4 = t5;
                a3 = a5;
            }
            if (((b2)a3.g).t() != 0) {
                a2 a6;
                for (int n = 0; n < ((b2)a3.g).t(); ++n, a3 = a6) {
                    final k2 w = ((b2)a3.g).w(n);
                    final String z3 = lq0.k.Z0(w.v(), lw0.b.K0, lw0.b.L0);
                    a6 = a3;
                    if (z3 != null) {
                        final j2 j2 = (j2)w.o();
                        if (j2.h) {
                            j2.l();
                            j2.h = false;
                        }
                        k2.w((k2)j2.g, z3);
                        if (a3.h) {
                            a3.l();
                            a3.h = false;
                        }
                        b2.z((b2)a3.g, n, (k2)j2.j());
                        list.set(j, (Object)a2.j());
                        a6 = a2;
                    }
                }
            }
        }
        h.N();
        h.M();
        lw0.b.O(s);
        final SQLiteDatabase f3 = h.f0();
        f3.beginTransaction();
        try {
            h.N();
            h.M();
            lw0.b.O(s);
            final SQLiteDatabase f4 = h.f0();
            f4.delete("property_filters", "app_id=?", new String[] { s });
            f4.delete(s5, "app_id=?", new String[] { s });
        Label_0920:
            for (final b2 b2 : list) {
                h.N();
                h.M();
                lw0.b.O(s);
                lw0.b.R((Object)b2);
                if (!b2.B()) {
                    ((h4)h.f).h().n.b((Object)d3.V(s), "Audience with no ID. appId");
                }
                else {
                    final int r = b2.r();
                    final Iterator iterator2 = b2.x().iterator();
                    while (iterator2.hasNext()) {
                        if (!((d2)iterator2.next()).F()) {
                            ((h4)h.f).h().n.c((Object)d3.V(s), "Event filter with no ID. Audience definition ignored. appId, audienceId", (Object)r);
                            continue Label_0920;
                        }
                    }
                    final Iterator<Object> iterator3 = ((List<Object>)b2.y()).iterator();
                    while (iterator3.hasNext()) {
                        if (!iterator3.next().A()) {
                            ((h4)h.f).h().n.c((Object)d3.V(s), "Property filter with no ID. Audience definition ignored. appId, audienceId", (Object)r);
                            continue Label_0920;
                        }
                    }
                    final Iterator iterator4 = b2.x().iterator();
                    Label_1844: {
                        String s9 = null;
                        Label_1494: {
                            d2 d2;
                            while (true) {
                                final boolean hasNext = iterator4.hasNext();
                                s9 = "audience_id";
                                if (!hasNext) {
                                    break Label_1494;
                                }
                                d2 = (d2)iterator4.next();
                                h.N();
                                h.M();
                                lw0.b.O(s);
                                lw0.b.R((Object)d2);
                                if (d2.x().isEmpty()) {
                                    break;
                                }
                                final byte[] m = d2.i();
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", s);
                                contentValues.put("audience_id", Integer.valueOf(r));
                                Integer value;
                                if (d2.F()) {
                                    value = d2.s();
                                }
                                else {
                                    value = null;
                                }
                                contentValues.put("filter_id", value);
                                contentValues.put("event_name", d2.x());
                                Boolean value2;
                                if (d2.G()) {
                                    value2 = d2.D();
                                }
                                else {
                                    value2 = null;
                                }
                                contentValues.put("session_scoped", value2);
                                contentValues.put("data", m);
                                try {
                                    if (h.f0().insertWithOnConflict(s5, (String)null, contentValues, 5) != -1L) {
                                        continue;
                                    }
                                    ((h4)h.f).h().k.b((Object)d3.V(s), "Failed to insert event filter (got -1). appId");
                                    continue;
                                }
                                catch (final SQLiteException ex) {
                                    ((h4)h.f).h().k.c((Object)d3.V(s), "Error storing event filter. appId", (Object)ex);
                                    break Label_1844;
                                }
                                break Label_1494;
                            }
                            final b3 n2 = ((h4)h.f).h().n;
                            final c3 v2 = d3.V(s);
                            Integer value3;
                            if (d2.F()) {
                                value3 = d2.s();
                            }
                            else {
                                value3 = null;
                            }
                            n2.d((Object)v2, "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", (Object)r, (Object)String.valueOf(value3));
                            break Label_1844;
                        }
                        final Iterator<Object> iterator5 = ((List<Object>)b2.y()).iterator();
                        final String s10 = s9;
                        final Iterator<Object> iterator6 = iterator5;
                        while (iterator6.hasNext()) {
                            final k2 k2 = iterator6.next();
                            h.N();
                            h.M();
                            lw0.b.O(s);
                            lw0.b.R((Object)k2);
                            if (k2.v().isEmpty()) {
                                final b3 n3 = ((h4)h.f).h().n;
                                final c3 v3 = d3.V(s);
                                Integer value4;
                                if (k2.A()) {
                                    value4 = k2.r();
                                }
                                else {
                                    value4 = null;
                                }
                                n3.d((Object)v3, "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", (Object)r, (Object)String.valueOf(value4));
                                break Label_1844;
                            }
                            final byte[] i2 = k2.i();
                            final ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("app_id", s);
                            contentValues2.put(s10, Integer.valueOf(r));
                            Integer value5;
                            if (k2.A()) {
                                value5 = k2.r();
                            }
                            else {
                                value5 = null;
                            }
                            contentValues2.put("filter_id", value5);
                            contentValues2.put("property_name", k2.v());
                            Boolean value6;
                            if (k2.B()) {
                                value6 = k2.z();
                            }
                            else {
                                value6 = null;
                            }
                            contentValues2.put("session_scoped", value6);
                            contentValues2.put("data", i2);
                            try {
                                if (h.f0().insertWithOnConflict("property_filters", (String)null, contentValues2, 5) != -1L) {
                                    continue;
                                }
                                ((h4)h.f).h().k.b((Object)d3.V(s), "Failed to insert property filter (got -1). appId");
                            }
                            catch (final SQLiteException ex2) {
                                ((h4)h.f).h().k.c((Object)d3.V(s), "Error storing property filter. appId", (Object)ex2);
                            }
                            break Label_1844;
                        }
                        continue;
                    }
                    h.N();
                    h.M();
                    lw0.b.O(s);
                    final SQLiteDatabase f5 = h.f0();
                    final String s11 = s4;
                    f5.delete("property_filters", s11, new String[] { s, String.valueOf(r) });
                    f5.delete(s5, s11, new String[] { s, String.valueOf(r) });
                }
            }
            final ArrayList<Integer> list2 = new ArrayList<Integer>();
            for (final b2 b3 : list) {
                Integer value7;
                if (b3.B()) {
                    value7 = b3.r();
                }
                else {
                    value7 = null;
                }
                list2.add(value7);
            }
            lw0.b.O(s);
            h.N();
            h.M();
            final SQLiteDatabase f6 = h.f0();
            Label_2293: {
                try {
                    final long a7 = h.a0("select count(1) from audience_filter_values where app_id=?", new String[] { s });
                    final int max = Math.max(0, Math.min(2000, ((h4)h.f).l.Q(s, r2.F)));
                    if (a7 > max) {
                        final ArrayList<String> list3 = new ArrayList<String>();
                        for (int n4 = 0; n4 < list2.size(); ++n4) {
                            final Integer n5 = list2.get(n4);
                            if (n5 == null) {
                                break Label_2293;
                            }
                            list3.add(Integer.toString(n5));
                        }
                        final String join = TextUtils.join((CharSequence)",", (Iterable)list3);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("(");
                        sb.append(join);
                        sb.append(")");
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                        sb2.append(sb.toString());
                        sb2.append(" order by rowid desc limit -1 offset ?)");
                        f6.delete("audience_filter_values", sb2.toString(), new String[] { s, Integer.toString(max) });
                    }
                }
                catch (final SQLiteException ex3) {
                    ((h4)h.f).h().k.c((Object)d3.V(s), "Database error querying filters. appId", (Object)ex3);
                }
            }
            f3.setTransactionSuccessful();
            f3.endTransaction();
            try {
                if (t2.h) {
                    t2.l();
                    t2.h = false;
                }
                u2.F((u2)t2.g);
                i = t2.j().i();
            }
            catch (final RuntimeException ex4) {
                ((h4)super.f).h().n.c((Object)d3.V(s), "Unable to serialize reduced-size config. Storing full config instead. appId", (Object)ex4);
            }
            final pe.k h2 = super.g.h;
            g7.H((b7)h2);
            lw0.b.O(s);
            h2.M();
            h2.N();
            final ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", i);
            contentValues3.put("config_last_modified_time", s2);
            if (((h4)h2.f).l.V(null, r2.y0)) {
                contentValues3.put("e_tag", s3);
            }
            try {
                if (h2.f0().update("apps", contentValues3, "app_id = ?", new String[] { s }) == 0L) {
                    ((h4)h2.f).h().k.b((Object)d3.V(s), "Failed to update remote config (got 0). appId");
                }
            }
            catch (final SQLiteException ex5) {
                ((h4)h2.f).h().k.c((Object)d3.V(s), "Error storing remote config. appId", (Object)ex5);
            }
            this.m.put((Object)s, (Object)t2.j());
        }
        finally {
            f3.endTransaction();
        }
    }
    
    @Override
    public final String k(final String s, final String s2) {
        this.M();
        this.S(s);
        final Map map = (Map)this.i.getOrDefault((Object)s, (Object)null);
        if (map != null) {
            return (String)map.get(s2);
        }
        return null;
    }
}
