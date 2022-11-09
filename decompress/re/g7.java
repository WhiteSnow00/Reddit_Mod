// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.content.pm.PackageInfo;
import android.os.BaseBundle;
import j0.i;
import android.os.Build$VERSION;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.content.ContentValues;
import java.util.Collection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import com.google.android.gms.internal.measurement.x;
import ke.q9;
import ke.s2;
import java.net.MalformedURLException;
import java.net.URL;
import android.net.Uri$Builder;
import java.util.Map;
import java.nio.ByteBuffer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import java.math.BigInteger;
import java.util.Locale;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import ke.t8;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.y;
import p2.e;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.internal.measurement.w;
import ke.w3;
import ke.o3;
import ke.x3;
import kz0.k;
import ke.n3;
import java.util.Iterator;
import ke.h3;
import java.util.List;
import ke.e3;
import ke.d3;
import yd.a;
import android.content.Context;
import android.text.TextUtils;
import com.android.billingclient.api.m0;
import ke.a1;
import a2.c;
import java.util.HashMap;
import java.util.ArrayList;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public final class g7 implements u4
{
    public static volatile g7 K;
    public FileLock A;
    public FileChannel B;
    public ArrayList C;
    public ArrayList D;
    public long E;
    public final HashMap F;
    public final HashMap G;
    public t5 H;
    public String I;
    public final c J;
    public final b4 f;
    public final i3 g;
    public j h;
    public k3 i;
    public z6 j;
    public b k;
    public final i7 l;
    public s5 m;
    public o6 n;
    public final c7 o;
    public t3 p;
    public final h4 q;
    public boolean r;
    public boolean s;
    public long t;
    public ArrayList u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    public g7(final h7 h7) {
        this.r = false;
        this.J = new c((Object)this);
        this.q = h4.t(h7.a, null, null);
        this.E = -1L;
        this.o = new c7(this);
        final i7 l = new i7(this);
        ((b7)l).A();
        this.l = l;
        final i3 g = new i3(this);
        ((b7)g).A();
        this.g = g;
        final b4 f = new b4(this);
        ((b7)f).A();
        this.f = f;
        this.F = new HashMap();
        this.G = new HashMap();
        this.a().G(new m0(this, h7, 4));
    }
    
    public static final boolean G(final q7 q7) {
        return !TextUtils.isEmpty((CharSequence)q7.g) || !TextUtils.isEmpty((CharSequence)q7.v);
    }
    
    public static final void H(final b7 b7) {
        if (b7 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (b7.h) {
            return;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(b7.getClass())));
    }
    
    public static g7 N(final Context context) {
        a.S0((Object)context);
        a.S0((Object)context.getApplicationContext());
        if (g7.K == null) {
            synchronized (g7.class) {
                if (g7.K == null) {
                    g7.K = new g7(new h7(context));
                }
            }
        }
        return g7.K;
    }
    
    public static final void w(final d3 d3, final int n, final String s) {
        final List u = d3.u();
        for (int i = 0; i < u.size(); ++i) {
            if ("_err".equals(((ke.i3)u.get(i)).x())) {
                return;
            }
        }
        final h3 v = ke.i3.v();
        v.n("_err");
        v.m(n);
        final ke.i3 i2 = v.j();
        final h3 v2 = ke.i3.v();
        v2.n("_ev");
        v2.o(s);
        final ke.i3 i3 = v2.j();
        if (d3.h) {
            d3.l();
            d3.h = false;
        }
        e3.B((e3)d3.g, i2);
        if (d3.h) {
            d3.l();
            d3.h = false;
        }
        e3.B((e3)d3.g, i3);
    }
    
    public static final void x(final d3 d3, final String s) {
        final List u = d3.u();
        for (int i = 0; i < u.size(); ++i) {
            if (s.equals(((ke.i3)u.get(i)).x())) {
                d3.p(i);
                return;
            }
        }
    }
    
    public final void A() {
        this.a().y();
        if (this.x || this.y || this.z) {
            this.f().s.d(this.x, "Not stopping services. fetch, network, upload", this.y, this.z);
            return;
        }
        this.f().s.a("Stopping uploading service(s)");
        final ArrayList u = this.u;
        if (u == null) {
            return;
        }
        final Iterator iterator = u.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        final ArrayList u2 = this.u;
        a.S0((Object)u2);
        u2.clear();
    }
    
    public final void B(final n3 n3, final long n4, final boolean b) {
        String s;
        if (!b) {
            s = "_lte";
        }
        else {
            s = "_se";
        }
        final j h = this.h;
        H((b7)h);
        final l7 x = h.X(n3.r(), s);
        l7 l7;
        if (x != null && x.e != null) {
            final String r = n3.r();
            ((k)this.g()).getClass();
            l7 = new l7(r, "auto", System.currentTimeMillis(), s, (Object)((long)x.e + n4));
        }
        else {
            final String r2 = n3.r();
            ((k)this.g()).getClass();
            l7 = new l7(r2, "auto", System.currentTimeMillis(), s, (Object)n4);
        }
        final w3 u = x3.u();
        u.n(s);
        ((k)this.g()).getClass();
        u.o(System.currentTimeMillis());
        u.m((long)l7.e);
        final x3 x2 = u.j();
        final int i = i7.L(n3, s);
        if (i >= 0) {
            if (n3.h) {
                n3.l();
                n3.h = false;
            }
            o3.x0((o3)n3.g, i, x2);
        }
        else {
            if (n3.h) {
                n3.l();
                n3.h = false;
            }
            o3.y0((o3)n3.g, x2);
        }
        if (n4 > 0L) {
            final j h2 = this.h;
            H((b7)h2);
            h2.J(l7);
            String s2;
            if (!b) {
                s2 = "lifetime";
            }
            else {
                s2 = "session-scoped";
            }
            this.f().s.c(s2, "Updated engagement user property. scope, value", l7.e);
        }
    }
    
    public final void C() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   re/g7.a:()Lre/g4;
        //     4: invokevirtual   re/g4.y:()V
        //     7: aload_0        
        //     8: invokevirtual   re/g7.c:()V
        //    11: aload_0        
        //    12: getfield        re/g7.t:J
        //    15: lconst_0       
        //    16: lcmp           
        //    17: ifle            96
        //    20: aload_0        
        //    21: invokevirtual   re/g7.g:()Lwd/c;
        //    24: checkcast       Lkz0/k;
        //    27: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    30: pop            
        //    31: ldc2_w          3600000
        //    34: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    37: aload_0        
        //    38: getfield        re/g7.t:J
        //    41: lsub           
        //    42: invokestatic    java/lang/Math.abs:(J)J
        //    45: lsub           
        //    46: lstore_1       
        //    47: lload_1        
        //    48: lconst_0       
        //    49: lcmp           
        //    50: ifle            91
        //    53: aload_0        
        //    54: invokevirtual   re/g7.f:()Lre/c3;
        //    57: getfield        re/c3.s:Lre/a3;
        //    60: lload_1        
        //    61: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    64: ldc_w           "Upload has been suspended. Will update scheduling later in approximately ms"
        //    67: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    70: aload_0        
        //    71: invokevirtual   re/g7.M:()Lre/k3;
        //    74: invokevirtual   re/k3.a:()V
        //    77: aload_0        
        //    78: getfield        re/g7.j:Lre/z6;
        //    81: astore_3       
        //    82: aload_3        
        //    83: invokestatic    re/g7.H:(Lre/b7;)V
        //    86: aload_3        
        //    87: invokevirtual   re/z6.C:()V
        //    90: return         
        //    91: aload_0        
        //    92: lconst_0       
        //    93: putfield        re/g7.t:J
        //    96: aload_0        
        //    97: getfield        re/g7.q:Lre/h4;
        //   100: invokevirtual   re/h4.e:()Z
        //   103: ifeq            1592
        //   106: aload_0        
        //   107: invokevirtual   re/g7.E:()Z
        //   110: ifne            116
        //   113: goto            1592
        //   116: aload_0        
        //   117: invokevirtual   re/g7.g:()Lwd/c;
        //   120: checkcast       Lkz0/k;
        //   123: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   126: pop            
        //   127: invokestatic    java/lang/System.currentTimeMillis:()J
        //   130: lstore          4
        //   132: aload_0        
        //   133: invokevirtual   re/g7.J:()Lre/f;
        //   136: pop            
        //   137: lconst_0       
        //   138: getstatic       re/q2.A:Lre/p2;
        //   141: aconst_null    
        //   142: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   145: checkcast       Ljava/lang/Long;
        //   148: invokevirtual   java/lang/Long.longValue:()J
        //   151: invokestatic    java/lang/Math.max:(JJ)J
        //   154: lstore          6
        //   156: aload_0        
        //   157: getfield        re/g7.h:Lre/j;
        //   160: astore_3       
        //   161: aload_3        
        //   162: invokestatic    re/g7.H:(Lre/b7;)V
        //   165: aload_3        
        //   166: ldc_w           "select count(1) > 0 from raw_events where realtime = 1"
        //   169: aconst_null    
        //   170: invokevirtual   re/j.M:(Ljava/lang/String;[Ljava/lang/String;)J
        //   173: lconst_0       
        //   174: lcmp           
        //   175: ifeq            184
        //   178: iconst_1       
        //   179: istore          8
        //   181: goto            187
        //   184: iconst_0       
        //   185: istore          8
        //   187: iload           8
        //   189: ifne            237
        //   192: aload_0        
        //   193: getfield        re/g7.h:Lre/j;
        //   196: astore_3       
        //   197: aload_3        
        //   198: invokestatic    re/g7.H:(Lre/b7;)V
        //   201: aload_3        
        //   202: ldc_w           "select count(1) > 0 from queue where has_realtime = 1"
        //   205: aconst_null    
        //   206: invokevirtual   re/j.M:(Ljava/lang/String;[Ljava/lang/String;)J
        //   209: lconst_0       
        //   210: lcmp           
        //   211: ifeq            220
        //   214: iconst_1       
        //   215: istore          8
        //   217: goto            223
        //   220: iconst_0       
        //   221: istore          8
        //   223: iload           8
        //   225: ifeq            231
        //   228: goto            237
        //   231: iconst_0       
        //   232: istore          8
        //   234: goto            240
        //   237: iconst_1       
        //   238: istore          8
        //   240: iload           8
        //   242: ifeq            325
        //   245: aload_0        
        //   246: invokevirtual   re/g7.J:()Lre/f;
        //   249: ldc_w           "debug.firebase.analytics.app"
        //   252: invokevirtual   re/f.z:(Ljava/lang/String;)Ljava/lang/String;
        //   255: astore_3       
        //   256: aload_3        
        //   257: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   260: ifne            299
        //   263: ldc_w           ".none."
        //   266: aload_3        
        //   267: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   270: ifne            299
        //   273: aload_0        
        //   274: invokevirtual   re/g7.J:()Lre/f;
        //   277: pop            
        //   278: lconst_0       
        //   279: getstatic       re/q2.v:Lre/p2;
        //   282: aconst_null    
        //   283: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   286: checkcast       Ljava/lang/Long;
        //   289: invokevirtual   java/lang/Long.longValue:()J
        //   292: invokestatic    java/lang/Math.max:(JJ)J
        //   295: lstore_1       
        //   296: goto            348
        //   299: aload_0        
        //   300: invokevirtual   re/g7.J:()Lre/f;
        //   303: pop            
        //   304: lconst_0       
        //   305: getstatic       re/q2.u:Lre/p2;
        //   308: aconst_null    
        //   309: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   312: checkcast       Ljava/lang/Long;
        //   315: invokevirtual   java/lang/Long.longValue:()J
        //   318: invokestatic    java/lang/Math.max:(JJ)J
        //   321: lstore_1       
        //   322: goto            348
        //   325: aload_0        
        //   326: invokevirtual   re/g7.J:()Lre/f;
        //   329: pop            
        //   330: lconst_0       
        //   331: getstatic       re/q2.t:Lre/p2;
        //   334: aconst_null    
        //   335: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   338: checkcast       Ljava/lang/Long;
        //   341: invokevirtual   java/lang/Long.longValue:()J
        //   344: invokestatic    java/lang/Math.max:(JJ)J
        //   347: lstore_1       
        //   348: aload_0        
        //   349: getfield        re/g7.n:Lre/o6;
        //   352: getfield        re/o6.l:Lre/n3;
        //   355: invokevirtual   re/n3.a:()J
        //   358: lstore          9
        //   360: aload_0        
        //   361: getfield        re/g7.n:Lre/o6;
        //   364: getfield        re/o6.m:Lre/n3;
        //   367: invokevirtual   re/n3.a:()J
        //   370: lstore          11
        //   372: aload_0        
        //   373: getfield        re/g7.h:Lre/j;
        //   376: astore_3       
        //   377: aload_3        
        //   378: invokestatic    re/g7.H:(Lre/b7;)V
        //   381: aload_3        
        //   382: ldc_w           "select max(bundle_end_timestamp) from queue"
        //   385: aconst_null    
        //   386: lconst_0       
        //   387: invokevirtual   re/j.O:(Ljava/lang/String;[Ljava/lang/String;J)J
        //   390: lstore          13
        //   392: aload_0        
        //   393: getfield        re/g7.h:Lre/j;
        //   396: astore_3       
        //   397: aload_3        
        //   398: invokestatic    re/g7.H:(Lre/b7;)V
        //   401: lload           13
        //   403: aload_3        
        //   404: ldc_w           "select max(timestamp) from raw_events"
        //   407: aconst_null    
        //   408: lconst_0       
        //   409: invokevirtual   re/j.O:(Ljava/lang/String;[Ljava/lang/String;J)J
        //   412: invokestatic    java/lang/Math.max:(JJ)J
        //   415: lstore          13
        //   417: lload           13
        //   419: lconst_0       
        //   420: lcmp           
        //   421: ifne            427
        //   424: goto            646
        //   427: lload           4
        //   429: lload           13
        //   431: lload           4
        //   433: lsub           
        //   434: invokestatic    java/lang/Math.abs:(J)J
        //   437: lsub           
        //   438: lstore          13
        //   440: lload           9
        //   442: lload           4
        //   444: lsub           
        //   445: invokestatic    java/lang/Math.abs:(J)J
        //   448: lstore          9
        //   450: lload           4
        //   452: lload           11
        //   454: lload           4
        //   456: lsub           
        //   457: invokestatic    java/lang/Math.abs:(J)J
        //   460: lsub           
        //   461: lstore          11
        //   463: lload           4
        //   465: lload           9
        //   467: lsub           
        //   468: lload           11
        //   470: invokestatic    java/lang/Math.max:(JJ)J
        //   473: lstore          9
        //   475: lload           6
        //   477: lload           13
        //   479: ladd           
        //   480: lstore          4
        //   482: lload           4
        //   484: lstore          6
        //   486: iload           8
        //   488: ifeq            513
        //   491: lload           4
        //   493: lstore          6
        //   495: lload           9
        //   497: lconst_0       
        //   498: lcmp           
        //   499: ifle            513
        //   502: lload           13
        //   504: lload           9
        //   506: invokestatic    java/lang/Math.min:(JJ)J
        //   509: lload_1        
        //   510: ladd           
        //   511: lstore          6
        //   513: aload_0        
        //   514: getfield        re/g7.l:Lre/i7;
        //   517: astore_3       
        //   518: aload_3        
        //   519: invokestatic    re/g7.H:(Lre/b7;)V
        //   522: aload_3        
        //   523: lload           9
        //   525: lload_1        
        //   526: invokevirtual   re/i7.Y:(JJ)Z
        //   529: ifne            541
        //   532: lload           9
        //   534: lload_1        
        //   535: ladd           
        //   536: lstore          6
        //   538: goto            541
        //   541: lload           6
        //   543: lstore_1       
        //   544: lload           11
        //   546: lconst_0       
        //   547: lcmp           
        //   548: ifeq            648
        //   551: lload           6
        //   553: lstore_1       
        //   554: lload           11
        //   556: lload           13
        //   558: lcmp           
        //   559: iflt            648
        //   562: iconst_0       
        //   563: istore          8
        //   565: aload_0        
        //   566: invokevirtual   re/g7.J:()Lre/f;
        //   569: pop            
        //   570: iload           8
        //   572: bipush          20
        //   574: iconst_0       
        //   575: getstatic       re/q2.C:Lre/p2;
        //   578: aconst_null    
        //   579: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   582: checkcast       Ljava/lang/Integer;
        //   585: invokevirtual   java/lang/Integer.intValue:()I
        //   588: invokestatic    java/lang/Math.max:(II)I
        //   591: invokestatic    java/lang/Math.min:(II)I
        //   594: if_icmpge       646
        //   597: aload_0        
        //   598: invokevirtual   re/g7.J:()Lre/f;
        //   601: pop            
        //   602: lload           6
        //   604: lconst_0       
        //   605: getstatic       re/q2.B:Lre/p2;
        //   608: aconst_null    
        //   609: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   612: checkcast       Ljava/lang/Long;
        //   615: invokevirtual   java/lang/Long.longValue:()J
        //   618: invokestatic    java/lang/Math.max:(JJ)J
        //   621: lconst_1       
        //   622: iload           8
        //   624: lshl           
        //   625: lmul           
        //   626: ladd           
        //   627: lstore          6
        //   629: lload           6
        //   631: lstore_1       
        //   632: lload           6
        //   634: lload           11
        //   636: lcmp           
        //   637: ifgt            648
        //   640: iinc            8, 1
        //   643: goto            565
        //   646: lconst_0       
        //   647: lstore_1       
        //   648: aload_0        
        //   649: astore_3       
        //   650: lload_1        
        //   651: lconst_0       
        //   652: lcmp           
        //   653: ifeq            1558
        //   656: aload_3        
        //   657: getfield        re/g7.g:Lre/i3;
        //   660: astore          15
        //   662: aload           15
        //   664: invokestatic    re/g7.H:(Lre/b7;)V
        //   667: aload           15
        //   669: invokevirtual   re/i3.C:()Z
        //   672: ifeq            1412
        //   675: aload_3        
        //   676: getfield        re/g7.n:Lre/o6;
        //   679: getfield        re/o6.k:Lre/n3;
        //   682: invokevirtual   re/n3.a:()J
        //   685: lstore          4
        //   687: aload_0        
        //   688: invokevirtual   re/g7.J:()Lre/f;
        //   691: pop            
        //   692: lconst_0       
        //   693: getstatic       re/q2.s:Lre/p2;
        //   696: aconst_null    
        //   697: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   700: checkcast       Ljava/lang/Long;
        //   703: invokevirtual   java/lang/Long.longValue:()J
        //   706: invokestatic    java/lang/Math.max:(JJ)J
        //   709: lstore          13
        //   711: aload_3        
        //   712: getfield        re/g7.l:Lre/i7;
        //   715: astore          15
        //   717: aload           15
        //   719: invokestatic    re/g7.H:(Lre/b7;)V
        //   722: lload_1        
        //   723: lstore          6
        //   725: aload           15
        //   727: lload           4
        //   729: lload           13
        //   731: invokevirtual   re/i7.Y:(JJ)Z
        //   734: ifne            748
        //   737: lload_1        
        //   738: lload           4
        //   740: lload           13
        //   742: ladd           
        //   743: invokestatic    java/lang/Math.max:(JJ)J
        //   746: lstore          6
        //   748: aload_0        
        //   749: invokevirtual   re/g7.M:()Lre/k3;
        //   752: invokevirtual   re/k3.a:()V
        //   755: aload_0        
        //   756: invokevirtual   re/g7.g:()Lwd/c;
        //   759: checkcast       Lkz0/k;
        //   762: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   765: pop            
        //   766: lload           6
        //   768: invokestatic    java/lang/System.currentTimeMillis:()J
        //   771: lsub           
        //   772: lstore          6
        //   774: lload           6
        //   776: lstore_1       
        //   777: lload           6
        //   779: lconst_0       
        //   780: lcmp           
        //   781: ifgt            835
        //   784: aload_0        
        //   785: invokevirtual   re/g7.J:()Lre/f;
        //   788: pop            
        //   789: lconst_0       
        //   790: getstatic       re/q2.w:Lre/p2;
        //   793: aconst_null    
        //   794: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   797: checkcast       Ljava/lang/Long;
        //   800: invokevirtual   java/lang/Long.longValue:()J
        //   803: invokestatic    java/lang/Math.max:(JJ)J
        //   806: lstore_1       
        //   807: aload_3        
        //   808: getfield        re/g7.n:Lre/o6;
        //   811: getfield        re/o6.l:Lre/n3;
        //   814: astore          15
        //   816: aload_0        
        //   817: invokevirtual   re/g7.g:()Lwd/c;
        //   820: checkcast       Lkz0/k;
        //   823: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   826: pop            
        //   827: aload           15
        //   829: invokestatic    java/lang/System.currentTimeMillis:()J
        //   832: invokevirtual   re/n3.b:(J)V
        //   835: aload_0        
        //   836: invokevirtual   re/g7.f:()Lre/c3;
        //   839: getfield        re/c3.s:Lre/a3;
        //   842: lload_1        
        //   843: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   846: ldc_w           "Upload scheduled in approximately ms"
        //   849: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   852: aload_3        
        //   853: getfield        re/g7.j:Lre/z6;
        //   856: astore_3       
        //   857: aload_3        
        //   858: invokestatic    re/g7.H:(Lre/b7;)V
        //   861: aload_3        
        //   862: invokevirtual   re/b7.z:()V
        //   865: aload_3        
        //   866: getfield        u5/w.f:Ljava/lang/Object;
        //   869: checkcast       Lre/h4;
        //   872: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   875: pop            
        //   876: aload_3        
        //   877: getfield        u5/w.f:Ljava/lang/Object;
        //   880: checkcast       Lre/h4;
        //   883: getfield        re/h4.f:Landroid/content/Context;
        //   886: astore          15
        //   888: aload           15
        //   890: invokestatic    re/n7.m0:(Landroid/content/Context;)Z
        //   893: ifne            915
        //   896: aload_3        
        //   897: getfield        u5/w.f:Ljava/lang/Object;
        //   900: checkcast       Lre/h4;
        //   903: invokevirtual   re/h4.f:()Lre/c3;
        //   906: getfield        re/c3.r:Lre/a3;
        //   909: ldc_w           "Receiver not registered/enabled"
        //   912: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   915: aload           15
        //   917: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //   920: astore          16
        //   922: aload           16
        //   924: ifnonnull       930
        //   927: goto            978
        //   930: new             Landroid/content/ComponentName;
        //   933: astore          17
        //   935: aload           17
        //   937: aload           15
        //   939: ldc_w           "com.google.android.gms.measurement.AppMeasurementJobService"
        //   942: invokespecial   android/content/ComponentName.<init>:(Landroid/content/Context;Ljava/lang/String;)V
        //   945: aload           16
        //   947: aload           17
        //   949: iconst_0       
        //   950: invokevirtual   android/content/pm/PackageManager.getServiceInfo:(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;
        //   953: astore          15
        //   955: aload           15
        //   957: ifnull          978
        //   960: aload           15
        //   962: getfield        android/content/pm/ServiceInfo.enabled:Z
        //   965: istore          18
        //   967: iload           18
        //   969: ifeq            978
        //   972: iconst_1       
        //   973: istore          8
        //   975: goto            981
        //   978: iconst_0       
        //   979: istore          8
        //   981: iload           8
        //   983: ifne            1005
        //   986: aload_3        
        //   987: getfield        u5/w.f:Ljava/lang/Object;
        //   990: checkcast       Lre/h4;
        //   993: invokevirtual   re/h4.f:()Lre/c3;
        //   996: getfield        re/c3.r:Lre/a3;
        //   999: ldc_w           "Service not registered/enabled"
        //  1002: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1005: aload_3        
        //  1006: invokevirtual   re/z6.C:()V
        //  1009: aload_3        
        //  1010: getfield        u5/w.f:Ljava/lang/Object;
        //  1013: checkcast       Lre/h4;
        //  1016: invokevirtual   re/h4.f:()Lre/c3;
        //  1019: getfield        re/c3.s:Lre/a3;
        //  1022: lload_1        
        //  1023: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1026: ldc_w           "Scheduling upload, millis"
        //  1029: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1032: aload_3        
        //  1033: getfield        u5/w.f:Ljava/lang/Object;
        //  1036: checkcast       Lre/h4;
        //  1039: getfield        re/h4.s:Lkz0/k;
        //  1042: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1045: pop            
        //  1046: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1049: pop2           
        //  1050: aload_3        
        //  1051: getfield        u5/w.f:Ljava/lang/Object;
        //  1054: checkcast       Lre/h4;
        //  1057: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1060: pop            
        //  1061: lload_1        
        //  1062: lconst_0       
        //  1063: getstatic       re/q2.x:Lre/p2;
        //  1066: aconst_null    
        //  1067: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1070: checkcast       Ljava/lang/Long;
        //  1073: invokevirtual   java/lang/Long.longValue:()J
        //  1076: invokestatic    java/lang/Math.max:(JJ)J
        //  1079: lcmp           
        //  1080: ifge            1117
        //  1083: aload_3        
        //  1084: invokevirtual   re/z6.F:()Lre/m;
        //  1087: getfield        re/m.c:J
        //  1090: lconst_0       
        //  1091: lcmp           
        //  1092: ifeq            1101
        //  1095: iconst_1       
        //  1096: istore          8
        //  1098: goto            1104
        //  1101: iconst_0       
        //  1102: istore          8
        //  1104: iload           8
        //  1106: ifne            1117
        //  1109: aload_3        
        //  1110: invokevirtual   re/z6.F:()Lre/m;
        //  1113: lload_1        
        //  1114: invokevirtual   re/m.c:(J)V
        //  1117: aload_3        
        //  1118: getfield        u5/w.f:Ljava/lang/Object;
        //  1121: checkcast       Lre/h4;
        //  1124: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1127: pop            
        //  1128: aload_3        
        //  1129: getfield        u5/w.f:Ljava/lang/Object;
        //  1132: checkcast       Lre/h4;
        //  1135: getfield        re/h4.f:Landroid/content/Context;
        //  1138: astore          16
        //  1140: new             Landroid/content/ComponentName;
        //  1143: dup            
        //  1144: aload           16
        //  1146: ldc_w           "com.google.android.gms.measurement.AppMeasurementJobService"
        //  1149: invokespecial   android/content/ComponentName.<init>:(Landroid/content/Context;Ljava/lang/String;)V
        //  1152: astore          15
        //  1154: aload_3        
        //  1155: invokevirtual   re/z6.D:()I
        //  1158: istore          8
        //  1160: new             Landroid/os/PersistableBundle;
        //  1163: dup            
        //  1164: invokespecial   android/os/PersistableBundle.<init>:()V
        //  1167: astore_3       
        //  1168: aload_3        
        //  1169: ldc_w           "action"
        //  1172: ldc_w           "com.google.android.gms.measurement.UPLOAD"
        //  1175: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1178: new             Landroid/app/job/JobInfo$Builder;
        //  1181: dup            
        //  1182: iload           8
        //  1184: aload           15
        //  1186: invokespecial   android/app/job/JobInfo$Builder.<init>:(ILandroid/content/ComponentName;)V
        //  1189: lload_1        
        //  1190: invokevirtual   android/app/job/JobInfo$Builder.setMinimumLatency:(J)Landroid/app/job/JobInfo$Builder;
        //  1193: lload_1        
        //  1194: lload_1        
        //  1195: ladd           
        //  1196: invokevirtual   android/app/job/JobInfo$Builder.setOverrideDeadline:(J)Landroid/app/job/JobInfo$Builder;
        //  1199: aload_3        
        //  1200: invokevirtual   android/app/job/JobInfo$Builder.setExtras:(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;
        //  1203: invokevirtual   android/app/job/JobInfo$Builder.build:()Landroid/app/job/JobInfo;
        //  1206: astore          15
        //  1208: getstatic       ke/l0.a:Ljava/lang/reflect/Method;
        //  1211: astore_3       
        //  1212: aload           16
        //  1214: ldc_w           "jobscheduler"
        //  1217: invokevirtual   android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //  1220: checkcast       Landroid/app/job/JobScheduler;
        //  1223: astore          17
        //  1225: aload           17
        //  1227: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1230: pop            
        //  1231: getstatic       ke/l0.a:Ljava/lang/reflect/Method;
        //  1234: ifnull          1403
        //  1237: aload           16
        //  1239: ldc_w           "android.permission.UPDATE_DEVICE_STATS"
        //  1242: invokevirtual   android/content/Context.checkSelfPermission:(Ljava/lang/String;)I
        //  1245: ifeq            1251
        //  1248: goto            1403
        //  1251: getstatic       ke/l0.b:Ljava/lang/reflect/Method;
        //  1254: astore_3       
        //  1255: aload_3        
        //  1256: ifnull          1314
        //  1259: aload_3        
        //  1260: ldc_w           Landroid/os/UserHandle;.class
        //  1263: iconst_0       
        //  1264: anewarray       Ljava/lang/Object;
        //  1267: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1270: checkcast       Ljava/lang/Integer;
        //  1273: astore_3       
        //  1274: aload_3        
        //  1275: ifnull          1314
        //  1278: aload_3        
        //  1279: invokevirtual   java/lang/Integer.intValue:()I
        //  1282: istore          8
        //  1284: goto            1317
        //  1287: astore_3       
        //  1288: goto            1292
        //  1291: astore_3       
        //  1292: ldc_w           "JobSchedulerCompat"
        //  1295: bipush          6
        //  1297: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  1300: ifeq            1314
        //  1303: ldc_w           "JobSchedulerCompat"
        //  1306: ldc_w           "myUserId invocation illegal"
        //  1309: aload_3        
        //  1310: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1313: pop            
        //  1314: iconst_0       
        //  1315: istore          8
        //  1317: getstatic       ke/l0.a:Ljava/lang/reflect/Method;
        //  1320: astore_3       
        //  1321: aload_3        
        //  1322: ifnull          1392
        //  1325: aload_3        
        //  1326: aload           17
        //  1328: iconst_4       
        //  1329: anewarray       Ljava/lang/Object;
        //  1332: dup            
        //  1333: iconst_0       
        //  1334: aload           15
        //  1336: aastore        
        //  1337: dup            
        //  1338: iconst_1       
        //  1339: ldc_w           "com.google.android.gms"
        //  1342: aastore        
        //  1343: dup            
        //  1344: iconst_2       
        //  1345: iload           8
        //  1347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1350: aastore        
        //  1351: dup            
        //  1352: iconst_3       
        //  1353: ldc_w           "UploadAlarm"
        //  1356: aastore        
        //  1357: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //  1360: checkcast       Ljava/lang/Integer;
        //  1363: astore_3       
        //  1364: aload_3        
        //  1365: ifnull          1411
        //  1368: aload_3        
        //  1369: invokevirtual   java/lang/Integer.intValue:()I
        //  1372: pop            
        //  1373: goto            1411
        //  1376: astore_3       
        //  1377: goto            1381
        //  1380: astore_3       
        //  1381: ldc_w           "UploadAlarm"
        //  1384: ldc_w           "error calling scheduleAsPackage"
        //  1387: aload_3        
        //  1388: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1391: pop            
        //  1392: aload           17
        //  1394: aload           15
        //  1396: invokevirtual   android/app/job/JobScheduler.schedule:(Landroid/app/job/JobInfo;)I
        //  1399: pop            
        //  1400: goto            1411
        //  1403: aload           17
        //  1405: aload           15
        //  1407: invokevirtual   android/app/job/JobScheduler.schedule:(Landroid/app/job/JobInfo;)I
        //  1410: pop            
        //  1411: return         
        //  1412: aload_0        
        //  1413: invokevirtual   re/g7.f:()Lre/c3;
        //  1416: getfield        re/c3.s:Lre/a3;
        //  1419: ldc_w           "No network"
        //  1422: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1425: aload_0        
        //  1426: invokevirtual   re/g7.M:()Lre/k3;
        //  1429: astore          17
        //  1431: aload           17
        //  1433: getfield        re/k3.a:Lre/g7;
        //  1436: invokevirtual   re/g7.c:()V
        //  1439: aload           17
        //  1441: getfield        re/k3.a:Lre/g7;
        //  1444: invokevirtual   re/g7.a:()Lre/g4;
        //  1447: invokevirtual   re/g4.y:()V
        //  1450: aload           17
        //  1452: getfield        re/k3.b:Z
        //  1455: ifeq            1461
        //  1458: goto            1544
        //  1461: aload           17
        //  1463: getfield        re/k3.a:Lre/g7;
        //  1466: getfield        re/g7.q:Lre/h4;
        //  1469: getfield        re/h4.f:Landroid/content/Context;
        //  1472: aload           17
        //  1474: new             Landroid/content/IntentFilter;
        //  1477: dup            
        //  1478: ldc_w           "android.net.conn.CONNECTIVITY_CHANGE"
        //  1481: invokespecial   android/content/IntentFilter.<init>:(Ljava/lang/String;)V
        //  1484: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //  1487: pop            
        //  1488: aload           17
        //  1490: getfield        re/k3.a:Lre/g7;
        //  1493: getfield        re/g7.g:Lre/i3;
        //  1496: astore          15
        //  1498: aload           15
        //  1500: invokestatic    re/g7.H:(Lre/b7;)V
        //  1503: aload           17
        //  1505: aload           15
        //  1507: invokevirtual   re/i3.C:()Z
        //  1510: putfield        re/k3.c:Z
        //  1513: aload           17
        //  1515: getfield        re/k3.a:Lre/g7;
        //  1518: invokevirtual   re/g7.f:()Lre/c3;
        //  1521: getfield        re/c3.s:Lre/a3;
        //  1524: aload           17
        //  1526: getfield        re/k3.c:Z
        //  1529: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1532: ldc_w           "Registering connectivity change receiver. Network connected"
        //  1535: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1538: aload           17
        //  1540: iconst_1       
        //  1541: putfield        re/k3.b:Z
        //  1544: aload_3        
        //  1545: getfield        re/g7.j:Lre/z6;
        //  1548: astore_3       
        //  1549: aload_3        
        //  1550: invokestatic    re/g7.H:(Lre/b7;)V
        //  1553: aload_3        
        //  1554: invokevirtual   re/z6.C:()V
        //  1557: return         
        //  1558: aload_0        
        //  1559: invokevirtual   re/g7.f:()Lre/c3;
        //  1562: getfield        re/c3.s:Lre/a3;
        //  1565: ldc_w           "Next upload time is 0"
        //  1568: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1571: aload_0        
        //  1572: invokevirtual   re/g7.M:()Lre/k3;
        //  1575: invokevirtual   re/k3.a:()V
        //  1578: aload_3        
        //  1579: getfield        re/g7.j:Lre/z6;
        //  1582: astore_3       
        //  1583: aload_3        
        //  1584: invokestatic    re/g7.H:(Lre/b7;)V
        //  1587: aload_3        
        //  1588: invokevirtual   re/z6.C:()V
        //  1591: return         
        //  1592: aload_0        
        //  1593: invokevirtual   re/g7.f:()Lre/c3;
        //  1596: getfield        re/c3.s:Lre/a3;
        //  1599: ldc_w           "Nothing to upload or uploading impossible"
        //  1602: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1605: aload_0        
        //  1606: invokevirtual   re/g7.M:()Lre/k3;
        //  1609: invokevirtual   re/k3.a:()V
        //  1612: aload_0        
        //  1613: getfield        re/g7.j:Lre/z6;
        //  1616: astore_3       
        //  1617: aload_3        
        //  1618: invokestatic    re/g7.H:(Lre/b7;)V
        //  1621: aload_3        
        //  1622: invokevirtual   re/z6.C:()V
        //  1625: return         
        //  1626: astore          15
        //  1628: goto            927
        //  1631: astore          15
        //  1633: goto            978
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  915    922    1626   1631   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  930    935    1626   1631   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  935    955    1631   1636   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  960    967    1631   1636   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1259   1274   1291   1292   Ljava/lang/IllegalAccessException;
        //  1259   1274   1287   1291   Ljava/lang/reflect/InvocationTargetException;
        //  1278   1284   1291   1292   Ljava/lang/IllegalAccessException;
        //  1278   1284   1287   1291   Ljava/lang/reflect/InvocationTargetException;
        //  1325   1364   1380   1381   Ljava/lang/IllegalAccessException;
        //  1325   1364   1376   1380   Ljava/lang/reflect/InvocationTargetException;
        //  1368   1373   1380   1381   Ljava/lang/IllegalAccessException;
        //  1368   1373   1376   1380   Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0978:
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
    
    public final boolean D(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: ldc_w           "_npa"
        //     7: astore          4
        //     9: ldc_w           "_ai"
        //    12: astore          5
        //    14: aload_0        
        //    15: getfield        re/g7.h:Lre/j;
        //    18: astore          6
        //    20: aload           6
        //    22: invokestatic    re/g7.H:(Lre/b7;)V
        //    25: aload           6
        //    27: invokevirtual   re/j.e0:()V
        //    30: new             Lre/e7;
        //    33: astore          7
        //    35: aload           7
        //    37: aload_0        
        //    38: invokespecial   re/e7.<init>:(Lre/g7;)V
        //    41: aload_0        
        //    42: getfield        re/g7.h:Lre/j;
        //    45: astore          6
        //    47: aload           6
        //    49: invokestatic    re/g7.H:(Lre/b7;)V
        //    52: aload           6
        //    54: lload_1        
        //    55: aload_0        
        //    56: getfield        re/g7.E:J
        //    59: aload           7
        //    61: invokevirtual   re/j.K:(JJLre/e7;)V
        //    64: aload           7
        //    66: getfield        re/e7.c:Ljava/util/ArrayList;
        //    69: astore          6
        //    71: aload           6
        //    73: ifnull          12987
        //    76: aload           6
        //    78: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    81: ifeq            87
        //    84: goto            12987
        //    87: aload           7
        //    89: getfield        re/e7.a:Lke/o3;
        //    92: invokevirtual   ke/c6.o:()Lke/z5;
        //    95: checkcast       Lke/n3;
        //    98: astore          8
        //   100: aload           8
        //   102: getfield        ke/z5.h:Z
        //   105: istore          9
        //   107: iload           9
        //   109: ifeq            131
        //   112: aload           8
        //   114: invokevirtual   ke/z5.l:()V
        //   117: aload           8
        //   119: iconst_0       
        //   120: putfield        ke/z5.h:Z
        //   123: goto            131
        //   126: astore          6
        //   128: goto            2197
        //   131: aload           8
        //   133: getfield        ke/z5.g:Lke/c6;
        //   136: checkcast       Lke/o3;
        //   139: invokestatic    ke/o3.u0:(Lke/o3;)V
        //   142: iconst_0       
        //   143: istore          10
        //   145: iload           10
        //   147: istore          11
        //   149: iload           11
        //   151: istore          12
        //   153: iconst_m1      
        //   154: istore          13
        //   156: aconst_null    
        //   157: astore          14
        //   159: iconst_m1      
        //   160: istore          15
        //   162: aconst_null    
        //   163: astore          6
        //   165: iload           11
        //   167: istore          16
        //   169: iload           10
        //   171: istore          11
        //   173: iload           13
        //   175: istore          10
        //   177: aload           7
        //   179: getfield        re/e7.c:Ljava/util/ArrayList;
        //   182: invokevirtual   java/util/ArrayList.size:()I
        //   185: istore          13
        //   187: ldc_w           "_et"
        //   190: astore          17
        //   192: iload           16
        //   194: iload           13
        //   196: if_icmpge       2203
        //   199: aload           7
        //   201: getfield        re/e7.c:Ljava/util/ArrayList;
        //   204: iload           16
        //   206: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   209: checkcast       Lke/e3;
        //   212: invokevirtual   ke/c6.o:()Lke/z5;
        //   215: checkcast       Lke/d3;
        //   218: astore          18
        //   220: aload_0        
        //   221: getfield        re/g7.f:Lre/b4;
        //   224: astore          19
        //   226: aload           19
        //   228: invokestatic    re/g7.H:(Lre/b7;)V
        //   231: aload           19
        //   233: aload           7
        //   235: getfield        re/e7.a:Lke/o3;
        //   238: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   241: aload           18
        //   243: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   246: invokevirtual   re/b4.M:(Ljava/lang/String;Ljava/lang/String;)Z
        //   249: istore          9
        //   251: iload           9
        //   253: ifeq            468
        //   256: aload_0        
        //   257: invokevirtual   re/g7.f:()Lre/c3;
        //   260: invokevirtual   re/c3.F:()Lre/a3;
        //   263: aload           7
        //   265: getfield        re/e7.a:Lke/o3;
        //   268: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   271: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //   274: ldc_w           "Dropping blocked raw event. appId"
        //   277: aload_0        
        //   278: getfield        re/g7.q:Lre/h4;
        //   281: invokevirtual   re/h4.r:()Lre/x2;
        //   284: aload           18
        //   286: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   289: invokevirtual   re/x2.d:(Ljava/lang/String;)Ljava/lang/String;
        //   292: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   295: aload_0        
        //   296: getfield        re/g7.f:Lre/b4;
        //   299: astore          17
        //   301: aload           17
        //   303: invokestatic    re/g7.H:(Lre/b7;)V
        //   306: aload           7
        //   308: getfield        re/e7.a:Lke/o3;
        //   311: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   314: astore          19
        //   316: aload_3        
        //   317: aload           17
        //   319: aload           19
        //   321: ldc_w           "measurement.upload.blacklist_internal"
        //   324: invokevirtual   re/b4.j:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   327: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   330: istore          9
        //   332: iload           9
        //   334: ifne            452
        //   337: aload_0        
        //   338: getfield        re/g7.f:Lre/b4;
        //   341: astore          17
        //   343: aload           17
        //   345: invokestatic    re/g7.H:(Lre/b7;)V
        //   348: aload           7
        //   350: getfield        re/e7.a:Lke/o3;
        //   353: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   356: astore          19
        //   358: aload_3        
        //   359: aload           17
        //   361: aload           19
        //   363: ldc_w           "measurement.upload.blacklist_public"
        //   366: invokevirtual   re/b4.j:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   369: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   372: istore          9
        //   374: iload           9
        //   376: ifeq            382
        //   379: goto            452
        //   382: ldc             "_err"
        //   384: aload           18
        //   386: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   389: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   392: ifne            452
        //   395: aload_0        
        //   396: invokevirtual   re/g7.P:()Lre/n7;
        //   399: astore          17
        //   401: aload_0        
        //   402: getfield        re/g7.J:La2/c;
        //   405: astore          19
        //   407: aload           7
        //   409: getfield        re/e7.a:Lke/o3;
        //   412: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   415: astore          20
        //   417: aload           18
        //   419: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   422: astore          18
        //   424: aload           17
        //   426: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   429: pop            
        //   430: aload           19
        //   432: aload           20
        //   434: bipush          11
        //   436: ldc             "_ev"
        //   438: aload           18
        //   440: iconst_0       
        //   441: invokestatic    re/n7.O:(Lre/m7;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V
        //   444: goto            452
        //   447: astore          6
        //   449: goto            2197
        //   452: iload           11
        //   454: istore          21
        //   456: iload           10
        //   458: istore          11
        //   460: goto            2166
        //   463: astore          6
        //   465: goto            2197
        //   468: aload           18
        //   470: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   473: astore          20
        //   475: aload           5
        //   477: getstatic       p2/e.o:[Ljava/lang/String;
        //   480: getstatic       p2/e.m:[Ljava/lang/String;
        //   483: invokestatic    p2/e.s:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
        //   486: astore          19
        //   488: aload           20
        //   490: aload           19
        //   492: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   495: ifeq            637
        //   498: aload           18
        //   500: aload           5
        //   502: invokevirtual   ke/d3.q:(Ljava/lang/String;)V
        //   505: aload_0        
        //   506: invokevirtual   re/g7.f:()Lre/c3;
        //   509: invokevirtual   re/c3.E:()Lre/a3;
        //   512: ldc_w           "Renaming ad_impression to _ai"
        //   515: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   518: aload_0        
        //   519: invokevirtual   re/g7.f:()Lre/c3;
        //   522: invokevirtual   re/c3.K:()Ljava/lang/String;
        //   525: iconst_5       
        //   526: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   529: istore          9
        //   531: iload           9
        //   533: ifeq            637
        //   536: iconst_0       
        //   537: istore          13
        //   539: aload           18
        //   541: getfield        ke/z5.g:Lke/c6;
        //   544: checkcast       Lke/e3;
        //   547: invokevirtual   ke/e3.s:()I
        //   550: istore          21
        //   552: iload           13
        //   554: iload           21
        //   556: if_icmpge       637
        //   559: ldc_w           "ad_platform"
        //   562: aload           18
        //   564: iload           13
        //   566: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   569: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //   572: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   575: ifeq            626
        //   578: aload           18
        //   580: iload           13
        //   582: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   585: invokevirtual   ke/i3.y:()Ljava/lang/String;
        //   588: invokevirtual   java/lang/String.isEmpty:()Z
        //   591: ifne            626
        //   594: ldc_w           "admob"
        //   597: aload           18
        //   599: iload           13
        //   601: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   604: invokevirtual   ke/i3.y:()Ljava/lang/String;
        //   607: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   610: ifeq            626
        //   613: aload_0        
        //   614: invokevirtual   re/g7.f:()Lre/c3;
        //   617: invokevirtual   re/c3.G:()Lre/a3;
        //   620: ldc_w           "AdMob ad impression logged from app. Potentially duplicative."
        //   623: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   626: iinc            13, 1
        //   629: goto            539
        //   632: astore          6
        //   634: goto            2197
        //   637: aload_0        
        //   638: getfield        re/g7.f:Lre/b4;
        //   641: astore          19
        //   643: aload           19
        //   645: invokestatic    re/g7.H:(Lre/b7;)V
        //   648: aload           19
        //   650: aload           7
        //   652: getfield        re/e7.a:Lke/o3;
        //   655: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //   658: aload           18
        //   660: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   663: invokevirtual   re/b4.L:(Ljava/lang/String;Ljava/lang/String;)Z
        //   666: istore          9
        //   668: iload           9
        //   670: ifne            820
        //   673: aload_0        
        //   674: getfield        re/g7.l:Lre/i7;
        //   677: invokestatic    re/g7.H:(Lre/b7;)V
        //   680: aload           18
        //   682: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //   685: astore          19
        //   687: aload           19
        //   689: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //   692: aload           19
        //   694: invokevirtual   java/lang/String.hashCode:()I
        //   697: istore          13
        //   699: iload           13
        //   701: ldc_w           94660
        //   704: if_icmpeq       760
        //   707: iload           13
        //   709: ldc_w           95025
        //   712: if_icmpeq       743
        //   715: iload           13
        //   717: ldc_w           95027
        //   720: if_icmpeq       726
        //   723: goto            777
        //   726: aload           19
        //   728: ldc_w           "_ui"
        //   731: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   734: ifeq            777
        //   737: iconst_1       
        //   738: istore          13
        //   740: goto            780
        //   743: aload           19
        //   745: ldc_w           "_ug"
        //   748: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   751: ifeq            777
        //   754: iconst_2       
        //   755: istore          13
        //   757: goto            780
        //   760: aload           19
        //   762: ldc_w           "_in"
        //   765: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   768: ifeq            777
        //   771: iconst_0       
        //   772: istore          13
        //   774: goto            780
        //   777: iconst_m1      
        //   778: istore          13
        //   780: iload           13
        //   782: ifeq            820
        //   785: iload           13
        //   787: iconst_1       
        //   788: if_icmpeq       820
        //   791: iload           13
        //   793: iconst_2       
        //   794: if_icmpeq       820
        //   797: aload           8
        //   799: astore          19
        //   801: ldc_w           "_et"
        //   804: astore          8
        //   806: iconst_0       
        //   807: istore          9
        //   809: iload           11
        //   811: istore          21
        //   813: iload           10
        //   815: istore          11
        //   817: goto            1527
        //   820: iconst_0       
        //   821: istore          13
        //   823: iconst_0       
        //   824: istore          21
        //   826: iconst_0       
        //   827: istore          22
        //   829: aload           8
        //   831: astore          19
        //   833: aload           17
        //   835: astore          8
        //   837: aload           18
        //   839: getfield        ke/z5.g:Lke/c6;
        //   842: checkcast       Lke/e3;
        //   845: invokevirtual   ke/e3.s:()I
        //   848: istore          23
        //   850: iload           13
        //   852: iload           23
        //   854: if_icmpge       998
        //   857: ldc_w           "_c"
        //   860: aload           18
        //   862: iload           13
        //   864: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   867: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //   870: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   873: ifeq            918
        //   876: aload           18
        //   878: iload           13
        //   880: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   883: invokevirtual   ke/c6.o:()Lke/z5;
        //   886: checkcast       Lke/h3;
        //   889: astore          17
        //   891: aload           17
        //   893: lconst_1       
        //   894: invokevirtual   ke/h3.m:(J)V
        //   897: aload           18
        //   899: iload           13
        //   901: aload           17
        //   903: invokevirtual   ke/z5.j:()Lke/c6;
        //   906: checkcast       Lke/i3;
        //   909: invokevirtual   ke/d3.r:(ILke/i3;)V
        //   912: iconst_1       
        //   913: istore          23
        //   915: goto            984
        //   918: iload           21
        //   920: istore          23
        //   922: ldc_w           "_r"
        //   925: aload           18
        //   927: iload           13
        //   929: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   932: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //   935: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   938: ifeq            984
        //   941: aload           18
        //   943: iload           13
        //   945: invokevirtual   ke/d3.s:(I)Lke/i3;
        //   948: invokevirtual   ke/c6.o:()Lke/z5;
        //   951: checkcast       Lke/h3;
        //   954: astore          17
        //   956: aload           17
        //   958: lconst_1       
        //   959: invokevirtual   ke/h3.m:(J)V
        //   962: aload           18
        //   964: iload           13
        //   966: aload           17
        //   968: invokevirtual   ke/z5.j:()Lke/c6;
        //   971: checkcast       Lke/i3;
        //   974: invokevirtual   ke/d3.r:(ILke/i3;)V
        //   977: iconst_1       
        //   978: istore          22
        //   980: iload           21
        //   982: istore          23
        //   984: iinc            13, 1
        //   987: aload           8
        //   989: astore          17
        //   991: iload           23
        //   993: istore          21
        //   995: goto            833
        //   998: iload           10
        //  1000: istore          13
        //  1002: iload           21
        //  1004: ifne            1066
        //  1007: iload           9
        //  1009: ifeq            1066
        //  1012: aload_0        
        //  1013: invokevirtual   re/g7.f:()Lre/c3;
        //  1016: invokevirtual   re/c3.E:()Lre/a3;
        //  1019: aload_0        
        //  1020: getfield        re/g7.q:Lre/h4;
        //  1023: invokevirtual   re/h4.r:()Lre/x2;
        //  1026: aload           18
        //  1028: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //  1031: invokevirtual   re/x2.d:(Ljava/lang/String;)Ljava/lang/String;
        //  1034: ldc_w           "Marking event as conversion"
        //  1037: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1040: invokestatic    ke/i3.v:()Lke/h3;
        //  1043: astore          17
        //  1045: aload           17
        //  1047: ldc_w           "_c"
        //  1050: invokevirtual   ke/h3.n:(Ljava/lang/String;)V
        //  1053: aload           17
        //  1055: lconst_1       
        //  1056: invokevirtual   ke/h3.m:(J)V
        //  1059: aload           18
        //  1061: aload           17
        //  1063: invokevirtual   ke/d3.o:(Lke/h3;)V
        //  1066: iload           22
        //  1068: ifne            1125
        //  1071: aload_0        
        //  1072: invokevirtual   re/g7.f:()Lre/c3;
        //  1075: invokevirtual   re/c3.E:()Lre/a3;
        //  1078: aload_0        
        //  1079: getfield        re/g7.q:Lre/h4;
        //  1082: invokevirtual   re/h4.r:()Lre/x2;
        //  1085: aload           18
        //  1087: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //  1090: invokevirtual   re/x2.d:(Ljava/lang/String;)Ljava/lang/String;
        //  1093: ldc_w           "Marking event as real-time"
        //  1096: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1099: invokestatic    ke/i3.v:()Lke/h3;
        //  1102: astore          17
        //  1104: aload           17
        //  1106: ldc_w           "_r"
        //  1109: invokevirtual   ke/h3.n:(Ljava/lang/String;)V
        //  1112: aload           17
        //  1114: lconst_1       
        //  1115: invokevirtual   ke/h3.m:(J)V
        //  1118: aload           18
        //  1120: aload           17
        //  1122: invokevirtual   ke/d3.o:(Lke/h3;)V
        //  1125: aload_0        
        //  1126: getfield        re/g7.h:Lre/j;
        //  1129: astore          17
        //  1131: aload           17
        //  1133: invokestatic    re/g7.H:(Lre/b7;)V
        //  1136: aload           17
        //  1138: aload_0        
        //  1139: invokevirtual   re/g7.v:()J
        //  1142: aload           7
        //  1144: getfield        re/e7.a:Lke/o3;
        //  1147: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1150: iconst_0       
        //  1151: iconst_1       
        //  1152: invokevirtual   re/j.U:(JLjava/lang/String;ZZ)Lre/h;
        //  1155: getfield        re/h.e:J
        //  1158: aload_0        
        //  1159: invokevirtual   re/g7.J:()Lre/f;
        //  1162: aload           7
        //  1164: getfield        re/e7.a:Lke/o3;
        //  1167: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1170: getstatic       re/q2.p:Lre/p2;
        //  1173: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //  1176: i2l            
        //  1177: lcmp           
        //  1178: ifle            1192
        //  1181: aload           18
        //  1183: ldc_w           "_r"
        //  1186: invokestatic    re/g7.x:(Lke/d3;Ljava/lang/String;)V
        //  1189: goto            1195
        //  1192: iconst_1       
        //  1193: istore          11
        //  1195: aload           18
        //  1197: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //  1200: invokestatic    re/n7.l0:(Ljava/lang/String;)Z
        //  1203: ifeq            1519
        //  1206: iload           9
        //  1208: ifeq            1519
        //  1211: aload_0        
        //  1212: getfield        re/g7.h:Lre/j;
        //  1215: astore          17
        //  1217: aload           17
        //  1219: invokestatic    re/g7.H:(Lre/b7;)V
        //  1222: aload           17
        //  1224: aload_0        
        //  1225: invokevirtual   re/g7.v:()J
        //  1228: aload           7
        //  1230: getfield        re/e7.a:Lke/o3;
        //  1233: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1236: iconst_1       
        //  1237: iconst_0       
        //  1238: invokevirtual   re/j.U:(JLjava/lang/String;ZZ)Lre/h;
        //  1241: getfield        re/h.c:J
        //  1244: aload_0        
        //  1245: invokevirtual   re/g7.J:()Lre/f;
        //  1248: aload           7
        //  1250: getfield        re/e7.a:Lke/o3;
        //  1253: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1256: getstatic       re/q2.o:Lre/p2;
        //  1259: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //  1262: i2l            
        //  1263: lcmp           
        //  1264: ifle            1516
        //  1267: aload_0        
        //  1268: invokevirtual   re/g7.f:()Lre/c3;
        //  1271: invokevirtual   re/c3.F:()Lre/a3;
        //  1274: aload           7
        //  1276: getfield        re/e7.a:Lke/o3;
        //  1279: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1282: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  1285: ldc_w           "Too many conversions. Not logging as conversion. appId"
        //  1288: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1291: aconst_null    
        //  1292: astore          17
        //  1294: iconst_0       
        //  1295: istore          10
        //  1297: iconst_0       
        //  1298: istore          23
        //  1300: iconst_m1      
        //  1301: istore          21
        //  1303: aload           18
        //  1305: getfield        ke/z5.g:Lke/c6;
        //  1308: checkcast       Lke/e3;
        //  1311: invokevirtual   ke/e3.s:()I
        //  1314: istore          22
        //  1316: iload           10
        //  1318: iload           22
        //  1320: if_icmpge       1409
        //  1323: aload           18
        //  1325: iload           10
        //  1327: invokevirtual   ke/d3.s:(I)Lke/i3;
        //  1330: astore          24
        //  1332: ldc_w           "_c"
        //  1335: aload           24
        //  1337: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //  1340: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1343: ifeq            1363
        //  1346: aload           24
        //  1348: invokevirtual   ke/c6.o:()Lke/z5;
        //  1351: checkcast       Lke/h3;
        //  1354: astore          20
        //  1356: iload           10
        //  1358: istore          22
        //  1360: goto            1395
        //  1363: aload           17
        //  1365: astore          20
        //  1367: iload           21
        //  1369: istore          22
        //  1371: ldc             "_err"
        //  1373: aload           24
        //  1375: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //  1378: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1381: ifeq            1395
        //  1384: iconst_1       
        //  1385: istore          23
        //  1387: iload           21
        //  1389: istore          22
        //  1391: aload           17
        //  1393: astore          20
        //  1395: iinc            10, 1
        //  1398: aload           20
        //  1400: astore          17
        //  1402: iload           22
        //  1404: istore          21
        //  1406: goto            1303
        //  1409: aload           17
        //  1411: astore          20
        //  1413: iload           23
        //  1415: ifeq            1436
        //  1418: aload           17
        //  1420: ifnull          1433
        //  1423: aload           18
        //  1425: iload           21
        //  1427: invokevirtual   ke/d3.p:(I)V
        //  1430: goto            1519
        //  1433: aconst_null    
        //  1434: astore          20
        //  1436: aload           20
        //  1438: ifnull          1484
        //  1441: aload           20
        //  1443: invokevirtual   ke/z5.g:()Lke/z5;
        //  1446: checkcast       Lke/h3;
        //  1449: astore          17
        //  1451: aload           17
        //  1453: ldc             "_err"
        //  1455: invokevirtual   ke/h3.n:(Ljava/lang/String;)V
        //  1458: aload           17
        //  1460: ldc2_w          10
        //  1463: invokevirtual   ke/h3.m:(J)V
        //  1466: aload           18
        //  1468: iload           21
        //  1470: aload           17
        //  1472: invokevirtual   ke/z5.j:()Lke/c6;
        //  1475: checkcast       Lke/i3;
        //  1478: invokevirtual   ke/d3.r:(ILke/i3;)V
        //  1481: goto            1519
        //  1484: aload_0        
        //  1485: invokevirtual   re/g7.f:()Lre/c3;
        //  1488: invokevirtual   re/c3.D:()Lre/a3;
        //  1491: aload           7
        //  1493: getfield        re/e7.a:Lke/o3;
        //  1496: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  1499: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  1502: ldc_w           "Did not find conversion parameter. appId"
        //  1505: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1508: goto            1519
        //  1511: astore          6
        //  1513: goto            2197
        //  1516: goto            1519
        //  1519: iload           11
        //  1521: istore          21
        //  1523: iload           13
        //  1525: istore          11
        //  1527: iload           15
        //  1529: istore          10
        //  1531: iload           9
        //  1533: ifeq            1843
        //  1536: new             Ljava/util/ArrayList;
        //  1539: astore          17
        //  1541: aload           17
        //  1543: aload           18
        //  1545: invokevirtual   ke/d3.u:()Ljava/util/List;
        //  1548: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  1551: iconst_0       
        //  1552: istore          13
        //  1554: iconst_m1      
        //  1555: istore          15
        //  1557: iconst_m1      
        //  1558: istore          22
        //  1560: aload           17
        //  1562: invokevirtual   java/util/ArrayList.size:()I
        //  1565: istore          23
        //  1567: iload           13
        //  1569: iload           23
        //  1571: if_icmpge       1647
        //  1574: ldc_w           "value"
        //  1577: aload           17
        //  1579: iload           13
        //  1581: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1584: checkcast       Lke/i3;
        //  1587: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //  1590: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1593: ifeq            1603
        //  1596: iload           13
        //  1598: istore          23
        //  1600: goto            1637
        //  1603: iload           15
        //  1605: istore          23
        //  1607: ldc_w           "currency"
        //  1610: aload           17
        //  1612: iload           13
        //  1614: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1617: checkcast       Lke/i3;
        //  1620: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //  1623: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1626: ifeq            1637
        //  1629: iload           13
        //  1631: istore          22
        //  1633: iload           15
        //  1635: istore          23
        //  1637: iinc            13, 1
        //  1640: iload           23
        //  1642: istore          15
        //  1644: goto            1560
        //  1647: iload           15
        //  1649: iconst_m1      
        //  1650: if_icmpne       1656
        //  1653: goto            1843
        //  1656: aload           17
        //  1658: iload           15
        //  1660: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1663: checkcast       Lke/i3;
        //  1666: invokevirtual   ke/i3.M:()Z
        //  1669: ifne            1729
        //  1672: aload           17
        //  1674: iload           15
        //  1676: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1679: checkcast       Lke/i3;
        //  1682: invokevirtual   ke/i3.K:()Z
        //  1685: ifne            1729
        //  1688: aload_0        
        //  1689: invokevirtual   re/g7.f:()Lre/c3;
        //  1692: invokevirtual   re/c3.G:()Lre/a3;
        //  1695: ldc_w           "Value must be specified with a numeric type."
        //  1698: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1701: aload           18
        //  1703: iload           15
        //  1705: invokevirtual   ke/d3.p:(I)V
        //  1708: aload           18
        //  1710: ldc_w           "_c"
        //  1713: invokestatic    re/g7.x:(Lke/d3;Ljava/lang/String;)V
        //  1716: aload           18
        //  1718: bipush          18
        //  1720: ldc_w           "value"
        //  1723: invokestatic    re/g7.w:(Lke/d3;ILjava/lang/String;)V
        //  1726: goto            1843
        //  1729: iload           22
        //  1731: iconst_m1      
        //  1732: if_icmpne       1738
        //  1735: goto            1805
        //  1738: aload           17
        //  1740: iload           22
        //  1742: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1745: checkcast       Lke/i3;
        //  1748: invokevirtual   ke/i3.y:()Ljava/lang/String;
        //  1751: astore          17
        //  1753: aload           17
        //  1755: invokevirtual   java/lang/String.length:()I
        //  1758: iconst_3       
        //  1759: if_icmpne       1805
        //  1762: iconst_0       
        //  1763: istore          13
        //  1765: iload           13
        //  1767: aload           17
        //  1769: invokevirtual   java/lang/String.length:()I
        //  1772: if_icmpge       1843
        //  1775: aload           17
        //  1777: iload           13
        //  1779: invokevirtual   java/lang/String.codePointAt:(I)I
        //  1782: istore          22
        //  1784: iload           22
        //  1786: invokestatic    java/lang/Character.isLetter:(I)Z
        //  1789: ifeq            1805
        //  1792: iload           13
        //  1794: iload           22
        //  1796: invokestatic    java/lang/Character.charCount:(I)I
        //  1799: iadd           
        //  1800: istore          13
        //  1802: goto            1765
        //  1805: aload_0        
        //  1806: invokevirtual   re/g7.f:()Lre/c3;
        //  1809: invokevirtual   re/c3.G:()Lre/a3;
        //  1812: ldc_w           "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
        //  1815: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  1818: aload           18
        //  1820: iload           15
        //  1822: invokevirtual   ke/d3.p:(I)V
        //  1825: aload           18
        //  1827: ldc_w           "_c"
        //  1830: invokestatic    re/g7.x:(Lke/d3;Ljava/lang/String;)V
        //  1833: aload           18
        //  1835: bipush          19
        //  1837: ldc_w           "currency"
        //  1840: invokestatic    re/g7.w:(Lke/d3;ILjava/lang/String;)V
        //  1843: ldc_w           "_e"
        //  1846: aload           18
        //  1848: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //  1851: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1854: ifeq            1971
        //  1857: aload_0        
        //  1858: getfield        re/g7.l:Lre/i7;
        //  1861: invokestatic    re/g7.H:(Lre/b7;)V
        //  1864: aload           18
        //  1866: invokevirtual   ke/z5.j:()Lke/c6;
        //  1869: checkcast       Lke/e3;
        //  1872: ldc_w           "_fr"
        //  1875: invokestatic    re/i7.C:(Lke/e3;Ljava/lang/String;)Lke/i3;
        //  1878: ifnonnull       1968
        //  1881: aload           6
        //  1883: ifnull          1957
        //  1886: aload           6
        //  1888: invokevirtual   ke/d3.n:()J
        //  1891: aload           18
        //  1893: invokevirtual   ke/d3.n:()J
        //  1896: lsub           
        //  1897: invokestatic    java/lang/Math.abs:(J)J
        //  1900: ldc2_w          1000
        //  1903: lcmp           
        //  1904: ifgt            1957
        //  1907: aload           6
        //  1909: invokevirtual   ke/z5.g:()Lke/z5;
        //  1912: checkcast       Lke/d3;
        //  1915: astore          14
        //  1917: aload_0        
        //  1918: aload           18
        //  1920: aload           14
        //  1922: invokevirtual   re/g7.F:(Lke/d3;Lke/d3;)Z
        //  1925: ifeq            1946
        //  1928: aload           19
        //  1930: iload           11
        //  1932: aload           14
        //  1934: invokevirtual   ke/n3.o:(ILke/d3;)V
        //  1937: aconst_null    
        //  1938: astore          14
        //  1940: aconst_null    
        //  1941: astore          6
        //  1943: goto            1954
        //  1946: aload           18
        //  1948: astore          14
        //  1950: iload           12
        //  1952: istore          10
        //  1954: goto            2098
        //  1957: aload           18
        //  1959: astore          14
        //  1961: iload           12
        //  1963: istore          10
        //  1965: goto            2098
        //  1968: goto            2095
        //  1971: ldc_w           "_vs"
        //  1974: aload           18
        //  1976: invokevirtual   ke/d3.t:()Ljava/lang/String;
        //  1979: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1982: ifeq            2095
        //  1985: aload_0        
        //  1986: getfield        re/g7.l:Lre/i7;
        //  1989: invokestatic    re/g7.H:(Lre/b7;)V
        //  1992: aload           18
        //  1994: invokevirtual   ke/z5.j:()Lke/c6;
        //  1997: checkcast       Lke/e3;
        //  2000: aload           8
        //  2002: invokestatic    re/i7.C:(Lke/e3;Ljava/lang/String;)Lke/i3;
        //  2005: ifnonnull       2095
        //  2008: aload           14
        //  2010: ifnull          2084
        //  2013: aload           14
        //  2015: invokevirtual   ke/d3.n:()J
        //  2018: aload           18
        //  2020: invokevirtual   ke/d3.n:()J
        //  2023: lsub           
        //  2024: invokestatic    java/lang/Math.abs:(J)J
        //  2027: ldc2_w          1000
        //  2030: lcmp           
        //  2031: ifgt            2084
        //  2034: aload           14
        //  2036: invokevirtual   ke/z5.g:()Lke/z5;
        //  2039: checkcast       Lke/d3;
        //  2042: astore          6
        //  2044: aload_0        
        //  2045: aload           6
        //  2047: aload           18
        //  2049: invokevirtual   re/g7.F:(Lke/d3;Lke/d3;)Z
        //  2052: ifeq            2073
        //  2055: aload           19
        //  2057: iload           10
        //  2059: aload           6
        //  2061: invokevirtual   ke/n3.o:(ILke/d3;)V
        //  2064: aconst_null    
        //  2065: astore          14
        //  2067: aconst_null    
        //  2068: astore          6
        //  2070: goto            2098
        //  2073: aload           18
        //  2075: astore          6
        //  2077: iload           12
        //  2079: istore          11
        //  2081: goto            2098
        //  2084: aload           18
        //  2086: astore          6
        //  2088: iload           12
        //  2090: istore          11
        //  2092: goto            2098
        //  2095: goto            2081
        //  2098: aload           7
        //  2100: getfield        re/e7.c:Ljava/util/ArrayList;
        //  2103: iload           16
        //  2105: aload           18
        //  2107: invokevirtual   ke/z5.j:()Lke/c6;
        //  2110: checkcast       Lke/e3;
        //  2113: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //  2116: pop            
        //  2117: iinc            12, 1
        //  2120: aload           19
        //  2122: getfield        ke/z5.h:Z
        //  2125: ifeq            2139
        //  2128: aload           19
        //  2130: invokevirtual   ke/z5.l:()V
        //  2133: aload           19
        //  2135: iconst_0       
        //  2136: putfield        ke/z5.h:Z
        //  2139: aload           19
        //  2141: getfield        ke/z5.g:Lke/c6;
        //  2144: checkcast       Lke/o3;
        //  2147: aload           18
        //  2149: invokevirtual   ke/z5.j:()Lke/c6;
        //  2152: checkcast       Lke/e3;
        //  2155: invokestatic    ke/o3.L:(Lke/o3;Lke/e3;)V
        //  2158: iload           10
        //  2160: istore          15
        //  2162: aload           19
        //  2164: astore          8
        //  2166: iinc            16, 1
        //  2169: iload           11
        //  2171: istore          10
        //  2173: iload           21
        //  2175: istore          11
        //  2177: goto            177
        //  2180: astore          6
        //  2182: goto            2197
        //  2185: astore          6
        //  2187: goto            2197
        //  2190: astore          6
        //  2192: goto            2197
        //  2195: astore          6
        //  2197: aload_0        
        //  2198: astore          14
        //  2200: goto            13036
        //  2203: lconst_0       
        //  2204: lstore_1       
        //  2205: iconst_0       
        //  2206: istore          13
        //  2208: iload           12
        //  2210: istore          10
        //  2212: iload           13
        //  2214: istore          12
        //  2216: iload           12
        //  2218: iload           10
        //  2220: if_icmpge       2431
        //  2223: aload           8
        //  2225: getfield        ke/z5.g:Lke/c6;
        //  2228: checkcast       Lke/o3;
        //  2231: iload           12
        //  2233: invokevirtual   ke/o3.z1:(I)Lke/e3;
        //  2236: astore          6
        //  2238: ldc_w           "_e"
        //  2241: aload           6
        //  2243: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  2246: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2249: ifeq            2295
        //  2252: aload_0        
        //  2253: getfield        re/g7.l:Lre/i7;
        //  2256: invokestatic    re/g7.H:(Lre/b7;)V
        //  2259: aload           6
        //  2261: ldc_w           "_fr"
        //  2264: invokestatic    re/i7.C:(Lke/e3;Ljava/lang/String;)Lke/i3;
        //  2267: ifnull          2295
        //  2270: aload           8
        //  2272: iload           12
        //  2274: invokevirtual   ke/n3.m:(I)V
        //  2277: iload           10
        //  2279: iconst_1       
        //  2280: isub           
        //  2281: istore          15
        //  2283: iload           12
        //  2285: iconst_1       
        //  2286: isub           
        //  2287: istore          13
        //  2289: lload_1        
        //  2290: lstore          25
        //  2292: goto            2410
        //  2295: aload_0        
        //  2296: getfield        re/g7.l:Lre/i7;
        //  2299: invokestatic    re/g7.H:(Lre/b7;)V
        //  2302: aload           6
        //  2304: ldc_w           "_et"
        //  2307: invokestatic    re/i7.C:(Lke/e3;Ljava/lang/String;)Lke/i3;
        //  2310: astore          6
        //  2312: iload           12
        //  2314: istore          13
        //  2316: iload           10
        //  2318: istore          15
        //  2320: lload_1        
        //  2321: lstore          25
        //  2323: aload           6
        //  2325: ifnull          2410
        //  2328: aload           6
        //  2330: invokevirtual   ke/i3.M:()Z
        //  2333: ifeq            2349
        //  2336: aload           6
        //  2338: invokevirtual   ke/i3.u:()J
        //  2341: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2344: astore          6
        //  2346: goto            2352
        //  2349: aconst_null    
        //  2350: astore          6
        //  2352: iload           12
        //  2354: istore          13
        //  2356: iload           10
        //  2358: istore          15
        //  2360: lload_1        
        //  2361: lstore          25
        //  2363: aload           6
        //  2365: ifnull          2410
        //  2368: iload           12
        //  2370: istore          13
        //  2372: iload           10
        //  2374: istore          15
        //  2376: lload_1        
        //  2377: lstore          25
        //  2379: aload           6
        //  2381: invokevirtual   java/lang/Long.longValue:()J
        //  2384: lconst_0       
        //  2385: lcmp           
        //  2386: ifle            2410
        //  2389: aload           6
        //  2391: invokevirtual   java/lang/Long.longValue:()J
        //  2394: lstore          25
        //  2396: lload_1        
        //  2397: lload           25
        //  2399: ladd           
        //  2400: lstore          25
        //  2402: iload           10
        //  2404: istore          15
        //  2406: iload           12
        //  2408: istore          13
        //  2410: iload           13
        //  2412: iconst_1       
        //  2413: iadd           
        //  2414: istore          12
        //  2416: iload           15
        //  2418: istore          10
        //  2420: lload           25
        //  2422: lstore_1       
        //  2423: goto            2216
        //  2426: astore          6
        //  2428: goto            2197
        //  2431: aload_0        
        //  2432: aload           8
        //  2434: lload_1        
        //  2435: iconst_0       
        //  2436: invokevirtual   re/g7.B:(Lke/n3;JZ)V
        //  2439: aload           8
        //  2441: getfield        ke/z5.g:Lke/c6;
        //  2444: astore          6
        //  2446: aload           6
        //  2448: checkcast       Lke/o3;
        //  2451: invokevirtual   ke/o3.E:()Lke/h6;
        //  2454: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  2457: astore          6
        //  2459: aload           6
        //  2461: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  2466: astore          6
        //  2468: aload           6
        //  2470: invokeinterface java/util/Iterator.hasNext:()Z
        //  2475: istore          9
        //  2477: iload           9
        //  2479: ifeq            2528
        //  2482: ldc_w           "_s"
        //  2485: aload           6
        //  2487: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2492: checkcast       Lke/e3;
        //  2495: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  2498: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2501: ifeq            2468
        //  2504: aload_0        
        //  2505: getfield        re/g7.h:Lre/j;
        //  2508: astore          6
        //  2510: aload           6
        //  2512: invokestatic    re/g7.H:(Lre/b7;)V
        //  2515: aload           6
        //  2517: aload           8
        //  2519: invokevirtual   ke/n3.r:()Ljava/lang/String;
        //  2522: ldc_w           "_se"
        //  2525: invokevirtual   re/j.C:(Ljava/lang/String;Ljava/lang/String;)V
        //  2528: aload           8
        //  2530: ldc_w           "_sid"
        //  2533: invokestatic    re/i7.L:(Lke/n3;Ljava/lang/String;)I
        //  2536: istore          12
        //  2538: iload           12
        //  2540: iflt            2554
        //  2543: aload_0        
        //  2544: aload           8
        //  2546: lload_1        
        //  2547: iconst_1       
        //  2548: invokevirtual   re/g7.B:(Lke/n3;JZ)V
        //  2551: goto            2633
        //  2554: aload           8
        //  2556: ldc_w           "_se"
        //  2559: invokestatic    re/i7.L:(Lke/n3;Ljava/lang/String;)I
        //  2562: istore          12
        //  2564: iload           12
        //  2566: iflt            2633
        //  2569: aload           8
        //  2571: getfield        ke/z5.h:Z
        //  2574: ifeq            2588
        //  2577: aload           8
        //  2579: invokevirtual   ke/z5.l:()V
        //  2582: aload           8
        //  2584: iconst_0       
        //  2585: putfield        ke/z5.h:Z
        //  2588: aload           8
        //  2590: getfield        ke/z5.g:Lke/c6;
        //  2593: checkcast       Lke/o3;
        //  2596: iload           12
        //  2598: invokestatic    ke/o3.z0:(Lke/o3;I)V
        //  2601: aload_0        
        //  2602: invokevirtual   re/g7.f:()Lre/c3;
        //  2605: invokevirtual   re/c3.D:()Lre/a3;
        //  2608: aload           7
        //  2610: getfield        re/e7.a:Lke/o3;
        //  2613: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  2616: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  2619: ldc_w           "Session engagement user property is in the bundle without session ID. appId"
        //  2622: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  2625: goto            2633
        //  2628: astore          6
        //  2630: goto            2197
        //  2633: aload_0        
        //  2634: getfield        re/g7.l:Lre/i7;
        //  2637: astore          14
        //  2639: aload           14
        //  2641: invokestatic    re/g7.H:(Lre/b7;)V
        //  2644: aload           14
        //  2646: getfield        u5/w.f:Ljava/lang/Object;
        //  2649: checkcast       Lre/h4;
        //  2652: invokevirtual   re/h4.f:()Lre/c3;
        //  2655: invokevirtual   re/c3.E:()Lre/a3;
        //  2658: ldc_w           "Checking account type status for ad personalization signals"
        //  2661: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  2664: aload           14
        //  2666: getfield        re/a7.g:Lre/g7;
        //  2669: getfield        re/g7.f:Lre/b4;
        //  2672: astore          6
        //  2674: aload           6
        //  2676: invokestatic    re/g7.H:(Lre/b7;)V
        //  2679: aload           8
        //  2681: invokevirtual   ke/n3.r:()Ljava/lang/String;
        //  2684: astore          18
        //  2686: aload           6
        //  2688: invokevirtual   u5/w.y:()V
        //  2691: aload           6
        //  2693: aload           18
        //  2695: invokevirtual   re/b4.I:(Ljava/lang/String;)Lke/s2;
        //  2698: astore          6
        //  2700: aload           6
        //  2702: ifnonnull       2711
        //  2705: iconst_0       
        //  2706: istore          9
        //  2708: goto            2718
        //  2711: aload           6
        //  2713: invokevirtual   ke/s2.G:()Z
        //  2716: istore          9
        //  2718: iload           9
        //  2720: ifeq            3355
        //  2723: aload           14
        //  2725: getfield        re/a7.g:Lre/g7;
        //  2728: getfield        re/g7.h:Lre/j;
        //  2731: astore          6
        //  2733: aload           6
        //  2735: invokestatic    re/g7.H:(Lre/b7;)V
        //  2738: aload           6
        //  2740: aload           8
        //  2742: invokevirtual   ke/n3.r:()Ljava/lang/String;
        //  2745: invokevirtual   re/j.S:(Ljava/lang/String;)Lre/v4;
        //  2748: astore          6
        //  2750: aload           6
        //  2752: ifnull          3355
        //  2755: aload           6
        //  2757: getfield        re/v4.a:Lre/h4;
        //  2760: invokevirtual   re/h4.a:()Lre/g4;
        //  2763: invokevirtual   re/g4.y:()V
        //  2766: aload           6
        //  2768: getfield        re/v4.p:Z
        //  2771: istore          9
        //  2773: iload           9
        //  2775: ifeq            3355
        //  2778: aload           14
        //  2780: getfield        u5/w.f:Ljava/lang/Object;
        //  2783: checkcast       Lre/h4;
        //  2786: invokevirtual   re/h4.n:()Lre/n;
        //  2789: astore          18
        //  2791: aload           18
        //  2793: invokevirtual   u5/w.y:()V
        //  2796: aload           18
        //  2798: getfield        u5/w.f:Ljava/lang/Object;
        //  2801: checkcast       Lre/h4;
        //  2804: getfield        re/h4.s:Lkz0/k;
        //  2807: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2810: pop            
        //  2811: invokestatic    java/lang/System.currentTimeMillis:()J
        //  2814: lstore_1       
        //  2815: lload_1        
        //  2816: aload           18
        //  2818: getfield        re/n.l:J
        //  2821: lsub           
        //  2822: ldc2_w          86400000
        //  2825: lcmp           
        //  2826: ifle            2835
        //  2829: aload           18
        //  2831: aconst_null    
        //  2832: putfield        re/n.k:Ljava/lang/Boolean;
        //  2835: aload           18
        //  2837: getfield        re/n.k:Ljava/lang/Boolean;
        //  2840: astore          6
        //  2842: aload           6
        //  2844: ifnonnull       3113
        //  2847: aload           18
        //  2849: getfield        u5/w.f:Ljava/lang/Object;
        //  2852: checkcast       Lre/h4;
        //  2855: getfield        re/h4.f:Landroid/content/Context;
        //  2858: ldc_w           "android.permission.GET_ACCOUNTS"
        //  2861: invokestatic    n3/a.checkSelfPermission:(Landroid/content/Context;Ljava/lang/String;)I
        //  2864: ifeq            2907
        //  2867: aload           18
        //  2869: getfield        u5/w.f:Ljava/lang/Object;
        //  2872: checkcast       Lre/h4;
        //  2875: invokevirtual   re/h4.f:()Lre/c3;
        //  2878: getfield        re/c3.o:Lre/a3;
        //  2881: ldc_w           "Permission error checking for dasher/unicorn accounts"
        //  2884: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  2887: aload           18
        //  2889: lload_1        
        //  2890: putfield        re/n.l:J
        //  2893: aload           18
        //  2895: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  2898: putfield        re/n.k:Ljava/lang/Boolean;
        //  2901: iconst_0       
        //  2902: istore          9
        //  2904: goto            3120
        //  2907: aload           18
        //  2909: getfield        re/n.j:Landroid/accounts/AccountManager;
        //  2912: ifnonnull       2934
        //  2915: aload           18
        //  2917: aload           18
        //  2919: getfield        u5/w.f:Ljava/lang/Object;
        //  2922: checkcast       Lre/h4;
        //  2925: getfield        re/h4.f:Landroid/content/Context;
        //  2928: invokestatic    android/accounts/AccountManager.get:(Landroid/content/Context;)Landroid/accounts/AccountManager;
        //  2931: putfield        re/n.j:Landroid/accounts/AccountManager;
        //  2934: aload           18
        //  2936: getfield        re/n.j:Landroid/accounts/AccountManager;
        //  2939: ldc_w           "com.google"
        //  2942: iconst_1       
        //  2943: anewarray       Ljava/lang/String;
        //  2946: dup            
        //  2947: iconst_0       
        //  2948: ldc_w           "service_HOSTED"
        //  2951: aastore        
        //  2952: aconst_null    
        //  2953: aconst_null    
        //  2954: invokevirtual   android/accounts/AccountManager.getAccountsByTypeAndFeatures:(Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;
        //  2957: invokeinterface android/accounts/AccountManagerFuture.getResult:()Ljava/lang/Object;
        //  2962: checkcast       [Landroid/accounts/Account;
        //  2965: astore          6
        //  2967: aload           6
        //  2969: ifnull          2998
        //  2972: aload           6
        //  2974: arraylength    
        //  2975: ifle            2998
        //  2978: aload           18
        //  2980: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  2983: putfield        re/n.k:Ljava/lang/Boolean;
        //  2986: aload           18
        //  2988: lload_1        
        //  2989: putfield        re/n.l:J
        //  2992: iconst_1       
        //  2993: istore          9
        //  2995: goto            3120
        //  2998: aload           18
        //  3000: getfield        re/n.j:Landroid/accounts/AccountManager;
        //  3003: ldc_w           "com.google"
        //  3006: iconst_1       
        //  3007: anewarray       Ljava/lang/String;
        //  3010: dup            
        //  3011: iconst_0       
        //  3012: ldc_w           "service_uca"
        //  3015: aastore        
        //  3016: aconst_null    
        //  3017: aconst_null    
        //  3018: invokevirtual   android/accounts/AccountManager.getAccountsByTypeAndFeatures:(Ljava/lang/String;[Ljava/lang/String;Landroid/accounts/AccountManagerCallback;Landroid/os/Handler;)Landroid/accounts/AccountManagerFuture;
        //  3021: invokeinterface android/accounts/AccountManagerFuture.getResult:()Ljava/lang/Object;
        //  3026: checkcast       [Landroid/accounts/Account;
        //  3029: astore          6
        //  3031: aload           6
        //  3033: ifnull          3096
        //  3036: aload           6
        //  3038: arraylength    
        //  3039: ifle            3096
        //  3042: aload           18
        //  3044: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  3047: putfield        re/n.k:Ljava/lang/Boolean;
        //  3050: aload           18
        //  3052: lload_1        
        //  3053: putfield        re/n.l:J
        //  3056: goto            2992
        //  3059: astore          6
        //  3061: goto            3074
        //  3064: astore          6
        //  3066: goto            3061
        //  3069: astore          6
        //  3071: goto            3061
        //  3074: aload           18
        //  3076: getfield        u5/w.f:Ljava/lang/Object;
        //  3079: checkcast       Lre/h4;
        //  3082: invokevirtual   re/h4.f:()Lre/c3;
        //  3085: getfield        re/c3.l:Lre/a3;
        //  3088: aload           6
        //  3090: ldc_w           "Exception checking account types"
        //  3093: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  3096: aload           18
        //  3098: lload_1        
        //  3099: putfield        re/n.l:J
        //  3102: aload           18
        //  3104: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  3107: putfield        re/n.k:Ljava/lang/Boolean;
        //  3110: goto            2901
        //  3113: aload           6
        //  3115: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //  3118: istore          9
        //  3120: iload           9
        //  3122: ifeq            3355
        //  3125: aload           14
        //  3127: getfield        u5/w.f:Ljava/lang/Object;
        //  3130: checkcast       Lre/h4;
        //  3133: invokevirtual   re/h4.f:()Lre/c3;
        //  3136: invokevirtual   re/c3.C:()Lre/a3;
        //  3139: ldc_w           "Turning off ad personalization due to account type"
        //  3142: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  3145: invokestatic    ke/x3.u:()Lke/w3;
        //  3148: astore          6
        //  3150: aload           6
        //  3152: aload           4
        //  3154: invokevirtual   ke/w3.n:(Ljava/lang/String;)V
        //  3157: aload           6
        //  3159: aload           14
        //  3161: getfield        u5/w.f:Ljava/lang/Object;
        //  3164: checkcast       Lre/h4;
        //  3167: invokevirtual   re/h4.n:()Lre/n;
        //  3170: invokevirtual   re/n.C:()J
        //  3173: invokevirtual   ke/w3.o:(J)V
        //  3176: aload           6
        //  3178: lconst_1       
        //  3179: invokevirtual   ke/w3.m:(J)V
        //  3182: aload           6
        //  3184: invokevirtual   ke/z5.j:()Lke/c6;
        //  3187: checkcast       Lke/x3;
        //  3190: astore          14
        //  3192: iconst_0       
        //  3193: istore          12
        //  3195: aload           8
        //  3197: getfield        ke/z5.g:Lke/c6;
        //  3200: checkcast       Lke/o3;
        //  3203: invokevirtual   ke/o3.o1:()I
        //  3206: istore          10
        //  3208: iload           12
        //  3210: iload           10
        //  3212: if_icmpge       3300
        //  3215: aload           8
        //  3217: getfield        ke/z5.g:Lke/c6;
        //  3220: checkcast       Lke/o3;
        //  3223: iload           12
        //  3225: invokevirtual   ke/o3.C1:(I)Lke/x3;
        //  3228: astore          6
        //  3230: aload           4
        //  3232: aload           6
        //  3234: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //  3237: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3240: istore          9
        //  3242: iload           9
        //  3244: ifeq            3289
        //  3247: aload           8
        //  3249: getfield        ke/z5.h:Z
        //  3252: ifeq            3266
        //  3255: aload           8
        //  3257: invokevirtual   ke/z5.l:()V
        //  3260: aload           8
        //  3262: iconst_0       
        //  3263: putfield        ke/z5.h:Z
        //  3266: aload           8
        //  3268: getfield        ke/z5.g:Lke/c6;
        //  3271: checkcast       Lke/o3;
        //  3274: iload           12
        //  3276: aload           14
        //  3278: invokestatic    ke/o3.x0:(Lke/o3;ILke/x3;)V
        //  3281: goto            3355
        //  3284: astore          6
        //  3286: goto            2197
        //  3289: iinc            12, 1
        //  3292: goto            3195
        //  3295: astore          6
        //  3297: goto            2197
        //  3300: aload           8
        //  3302: getfield        ke/z5.h:Z
        //  3305: ifeq            3319
        //  3308: aload           8
        //  3310: invokevirtual   ke/z5.l:()V
        //  3313: aload           8
        //  3315: iconst_0       
        //  3316: putfield        ke/z5.h:Z
        //  3319: aload           8
        //  3321: getfield        ke/z5.g:Lke/c6;
        //  3324: checkcast       Lke/o3;
        //  3327: aload           14
        //  3329: invokestatic    ke/o3.y0:(Lke/o3;Lke/x3;)V
        //  3332: goto            3355
        //  3335: astore          6
        //  3337: goto            2197
        //  3340: astore          6
        //  3342: goto            2197
        //  3345: astore          6
        //  3347: goto            2197
        //  3350: astore          6
        //  3352: goto            2197
        //  3355: aload           8
        //  3357: getfield        ke/z5.h:Z
        //  3360: istore          9
        //  3362: iload           9
        //  3364: ifeq            3386
        //  3367: aload           8
        //  3369: invokevirtual   ke/z5.l:()V
        //  3372: aload           8
        //  3374: iconst_0       
        //  3375: putfield        ke/z5.h:Z
        //  3378: goto            3386
        //  3381: astore          6
        //  3383: goto            2197
        //  3386: aload           8
        //  3388: getfield        ke/z5.g:Lke/c6;
        //  3391: checkcast       Lke/o3;
        //  3394: ldc2_w          9223372036854775807
        //  3397: invokestatic    ke/o3.B0:(Lke/o3;J)V
        //  3400: aload           8
        //  3402: getfield        ke/z5.h:Z
        //  3405: istore          9
        //  3407: iload           9
        //  3409: ifeq            3431
        //  3412: aload           8
        //  3414: invokevirtual   ke/z5.l:()V
        //  3417: aload           8
        //  3419: iconst_0       
        //  3420: putfield        ke/z5.h:Z
        //  3423: goto            3431
        //  3426: astore          6
        //  3428: goto            2197
        //  3431: aload           8
        //  3433: getfield        ke/z5.g:Lke/c6;
        //  3436: checkcast       Lke/o3;
        //  3439: ldc2_w          -9223372036854775808
        //  3442: invokestatic    ke/o3.C0:(Lke/o3;J)V
        //  3445: iconst_0       
        //  3446: istore          12
        //  3448: aload           8
        //  3450: getfield        ke/z5.g:Lke/c6;
        //  3453: astore          6
        //  3455: aload           6
        //  3457: checkcast       Lke/o3;
        //  3460: invokevirtual   ke/o3.k1:()I
        //  3463: istore          10
        //  3465: iload           12
        //  3467: iload           10
        //  3469: if_icmpge       3650
        //  3472: aload           8
        //  3474: getfield        ke/z5.g:Lke/c6;
        //  3477: checkcast       Lke/o3;
        //  3480: iload           12
        //  3482: invokevirtual   ke/o3.z1:(I)Lke/e3;
        //  3485: astore          6
        //  3487: aload           6
        //  3489: invokevirtual   ke/e3.u:()J
        //  3492: lstore          25
        //  3494: aload           8
        //  3496: getfield        ke/z5.g:Lke/c6;
        //  3499: checkcast       Lke/o3;
        //  3502: invokevirtual   ke/o3.w1:()J
        //  3505: lstore_1       
        //  3506: lload           25
        //  3508: lload_1        
        //  3509: lcmp           
        //  3510: ifge            3558
        //  3513: aload           6
        //  3515: invokevirtual   ke/e3.u:()J
        //  3518: lstore_1       
        //  3519: aload           8
        //  3521: getfield        ke/z5.h:Z
        //  3524: ifeq            3538
        //  3527: aload           8
        //  3529: invokevirtual   ke/z5.l:()V
        //  3532: aload           8
        //  3534: iconst_0       
        //  3535: putfield        ke/z5.h:Z
        //  3538: aload           8
        //  3540: getfield        ke/z5.g:Lke/c6;
        //  3543: checkcast       Lke/o3;
        //  3546: lload_1        
        //  3547: invokestatic    ke/o3.B0:(Lke/o3;J)V
        //  3550: goto            3558
        //  3553: astore          6
        //  3555: goto            2197
        //  3558: aload           6
        //  3560: invokevirtual   ke/e3.u:()J
        //  3563: lstore_1       
        //  3564: aload           8
        //  3566: getfield        ke/z5.g:Lke/c6;
        //  3569: checkcast       Lke/o3;
        //  3572: invokevirtual   ke/o3.s1:()J
        //  3575: lstore          25
        //  3577: lload_1        
        //  3578: lload           25
        //  3580: lcmp           
        //  3581: ifle            3629
        //  3584: aload           6
        //  3586: invokevirtual   ke/e3.u:()J
        //  3589: lstore_1       
        //  3590: aload           8
        //  3592: getfield        ke/z5.h:Z
        //  3595: ifeq            3609
        //  3598: aload           8
        //  3600: invokevirtual   ke/z5.l:()V
        //  3603: aload           8
        //  3605: iconst_0       
        //  3606: putfield        ke/z5.h:Z
        //  3609: aload           8
        //  3611: getfield        ke/z5.g:Lke/c6;
        //  3614: checkcast       Lke/o3;
        //  3617: lload_1        
        //  3618: invokestatic    ke/o3.C0:(Lke/o3;J)V
        //  3621: goto            3629
        //  3624: astore          6
        //  3626: goto            2197
        //  3629: iinc            12, 1
        //  3632: goto            3448
        //  3635: astore          6
        //  3637: goto            2197
        //  3640: astore          6
        //  3642: goto            2197
        //  3645: astore          6
        //  3647: goto            2197
        //  3650: aload           8
        //  3652: invokevirtual   ke/n3.C:()V
        //  3655: aload           8
        //  3657: invokevirtual   ke/n3.w:()V
        //  3660: aload_0        
        //  3661: getfield        re/g7.k:Lre/b;
        //  3664: astore          27
        //  3666: aload           27
        //  3668: invokestatic    re/g7.H:(Lre/b7;)V
        //  3671: aload           8
        //  3673: invokevirtual   ke/n3.r:()Ljava/lang/String;
        //  3676: astore          18
        //  3678: aload           8
        //  3680: getfield        ke/z5.g:Lke/c6;
        //  3683: astore          6
        //  3685: aload           6
        //  3687: checkcast       Lke/o3;
        //  3690: invokevirtual   ke/o3.E:()Lke/h6;
        //  3693: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  3696: astore          14
        //  3698: aload           14
        //  3700: astore          6
        //  3702: aload           8
        //  3704: getfield        ke/z5.g:Lke/c6;
        //  3707: astore          19
        //  3709: aload           19
        //  3711: checkcast       Lke/o3;
        //  3714: invokevirtual   ke/o3.F:()Lke/h6;
        //  3717: invokestatic    java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
        //  3720: astore          28
        //  3722: aload           8
        //  3724: getfield        ke/z5.g:Lke/c6;
        //  3727: astore          19
        //  3729: aload           19
        //  3731: checkcast       Lke/o3;
        //  3734: invokevirtual   ke/o3.w1:()J
        //  3737: lstore          25
        //  3739: aload           8
        //  3741: getfield        ke/z5.g:Lke/c6;
        //  3744: astore          19
        //  3746: aload           19
        //  3748: checkcast       Lke/o3;
        //  3751: invokevirtual   ke/o3.s1:()J
        //  3754: lstore_1       
        //  3755: ldc_w           "current_results"
        //  3758: astore          5
        //  3760: aload           18
        //  3762: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  3765: aload           6
        //  3767: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //  3770: aload           28
        //  3772: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //  3775: aload           27
        //  3777: aload           18
        //  3779: putfield        re/b.i:Ljava/lang/String;
        //  3782: new             Ljava/util/HashSet;
        //  3785: astore          18
        //  3787: aload           18
        //  3789: invokespecial   java/util/HashSet.<init>:()V
        //  3792: aload           27
        //  3794: aload           18
        //  3796: putfield        re/b.j:Ljava/util/HashSet;
        //  3799: new             Lj0/b;
        //  3802: astore          18
        //  3804: aload           18
        //  3806: invokespecial   j0/b.<init>:()V
        //  3809: aload           27
        //  3811: aload           18
        //  3813: putfield        re/b.k:Lj0/b;
        //  3816: aload           27
        //  3818: lload           25
        //  3820: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3823: putfield        re/b.l:Ljava/lang/Long;
        //  3826: aload           27
        //  3828: lload_1        
        //  3829: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3832: putfield        re/b.m:Ljava/lang/Long;
        //  3835: aload           6
        //  3837: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  3842: astore          18
        //  3844: aload           18
        //  3846: invokeinterface java/util/Iterator.hasNext:()Z
        //  3851: ifeq            3882
        //  3854: ldc_w           "_s"
        //  3857: aload           18
        //  3859: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  3864: checkcast       Lke/e3;
        //  3867: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  3870: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3873: ifeq            3844
        //  3876: iconst_1       
        //  3877: istore          12
        //  3879: goto            3885
        //  3882: iconst_0       
        //  3883: istore          12
        //  3885: invokestatic    com/google/android/gms/internal/measurement/o.a:()V
        //  3888: aload           27
        //  3890: getfield        u5/w.f:Ljava/lang/Object;
        //  3893: checkcast       Lre/h4;
        //  3896: invokevirtual   re/h4.m:()Lre/f;
        //  3899: aload           27
        //  3901: getfield        re/b.i:Ljava/lang/String;
        //  3904: getstatic       re/q2.W:Lre/p2;
        //  3907: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  3910: istore          9
        //  3912: invokestatic    com/google/android/gms/internal/measurement/o.a:()V
        //  3915: aload           27
        //  3917: getfield        u5/w.f:Ljava/lang/Object;
        //  3920: checkcast       Lre/h4;
        //  3923: invokevirtual   re/h4.m:()Lre/f;
        //  3926: aload           27
        //  3928: getfield        re/b.i:Ljava/lang/String;
        //  3931: getstatic       re/q2.V:Lre/p2;
        //  3934: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  3937: istore          29
        //  3939: iload           12
        //  3941: ifeq            4068
        //  3944: aload           27
        //  3946: getfield        re/a7.g:Lre/g7;
        //  3949: invokevirtual   re/g7.L:()Lre/j;
        //  3952: astore          17
        //  3954: aload           27
        //  3956: getfield        re/b.i:Ljava/lang/String;
        //  3959: astore          19
        //  3961: aload           17
        //  3963: invokevirtual   re/b7.z:()V
        //  3966: aload           17
        //  3968: invokevirtual   u5/w.y:()V
        //  3971: aload           19
        //  3973: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  3976: new             Landroid/content/ContentValues;
        //  3979: astore          4
        //  3981: aload           4
        //  3983: invokespecial   android/content/ContentValues.<init>:()V
        //  3986: aload           4
        //  3988: ldc_w           "current_session_count"
        //  3991: iconst_0       
        //  3992: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3995: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  3998: aload           17
        //  4000: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  4003: astore          18
        //  4005: aload           18
        //  4007: ldc_w           "events"
        //  4010: aload           4
        //  4012: ldc_w           "app_id = ?"
        //  4015: iconst_1       
        //  4016: anewarray       Ljava/lang/String;
        //  4019: dup            
        //  4020: iconst_0       
        //  4021: aload           19
        //  4023: aastore        
        //  4024: invokevirtual   android/database/sqlite/SQLiteDatabase.update:(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //  4027: pop            
        //  4028: goto            4068
        //  4031: astore          18
        //  4033: goto            4038
        //  4036: astore          18
        //  4038: aload           17
        //  4040: getfield        u5/w.f:Ljava/lang/Object;
        //  4043: checkcast       Lre/h4;
        //  4046: invokevirtual   re/h4.f:()Lre/c3;
        //  4049: invokevirtual   re/c3.D:()Lre/a3;
        //  4052: aload           19
        //  4054: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  4057: ldc_w           "Error resetting session-scoped event counts. appId"
        //  4060: aload           18
        //  4062: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  4065: goto            4068
        //  4068: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  4071: astore          19
        //  4073: ldc_w           "Failed to merge filter. appId"
        //  4076: astore_3       
        //  4077: ldc_w           "Database error querying filters. appId"
        //  4080: astore          24
        //  4082: ldc_w           "audience_id"
        //  4085: astore          20
        //  4087: iload           29
        //  4089: ifeq            4614
        //  4092: iload           9
        //  4094: ifeq            4614
        //  4097: aload           27
        //  4099: getfield        re/a7.g:Lre/g7;
        //  4102: invokevirtual   re/g7.L:()Lre/j;
        //  4105: astore          30
        //  4107: aload           27
        //  4109: getfield        re/b.i:Ljava/lang/String;
        //  4112: astore          31
        //  4114: aload           31
        //  4116: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  4119: new             Lj0/b;
        //  4122: astore          32
        //  4124: aload           32
        //  4126: invokespecial   j0/b.<init>:()V
        //  4129: aload           30
        //  4131: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  4134: astore          18
        //  4136: aload           18
        //  4138: ldc_w           "event_filters"
        //  4141: iconst_2       
        //  4142: anewarray       Ljava/lang/String;
        //  4145: dup            
        //  4146: iconst_0       
        //  4147: ldc_w           "audience_id"
        //  4150: aastore        
        //  4151: dup            
        //  4152: iconst_1       
        //  4153: ldc_w           "data"
        //  4156: aastore        
        //  4157: ldc_w           "app_id=?"
        //  4160: iconst_1       
        //  4161: anewarray       Ljava/lang/String;
        //  4164: dup            
        //  4165: iconst_0       
        //  4166: aload           31
        //  4168: aastore        
        //  4169: aconst_null    
        //  4170: aconst_null    
        //  4171: aconst_null    
        //  4172: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  4175: astore          18
        //  4177: aload           18
        //  4179: astore          19
        //  4181: aload           18
        //  4183: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  4188: istore          33
        //  4190: iload           33
        //  4192: ifeq            4450
        //  4195: aload           18
        //  4197: astore          19
        //  4199: aload           18
        //  4201: iconst_1       
        //  4202: invokeinterface android/database/Cursor.getBlob:(I)[B
        //  4207: astore          14
        //  4209: aload           18
        //  4211: astore          19
        //  4213: invokestatic    ke/b2.t:()Lke/a2;
        //  4216: aload           14
        //  4218: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //  4221: checkcast       Lke/a2;
        //  4224: invokevirtual   ke/z5.j:()Lke/c6;
        //  4227: checkcast       Lke/b2;
        //  4230: astore          34
        //  4232: aload           18
        //  4234: astore          19
        //  4236: aload           34
        //  4238: invokevirtual   ke/b2.E:()Z
        //  4241: ifne            4247
        //  4244: goto            4398
        //  4247: aload           18
        //  4249: astore          19
        //  4251: aload           18
        //  4253: iconst_0       
        //  4254: invokeinterface android/database/Cursor.getInt:(I)I
        //  4259: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4262: astore          35
        //  4264: aload           18
        //  4266: astore          19
        //  4268: aload           32
        //  4270: aload           35
        //  4272: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  4275: checkcast       Ljava/util/List;
        //  4278: astore          17
        //  4280: aload           17
        //  4282: ifnonnull       4340
        //  4285: aload           6
        //  4287: astore          17
        //  4289: aload           17
        //  4291: astore          14
        //  4293: aload           18
        //  4295: astore          19
        //  4297: new             Ljava/util/ArrayList;
        //  4300: astore          4
        //  4302: aload           17
        //  4304: astore          14
        //  4306: aload           18
        //  4308: astore          19
        //  4310: aload           4
        //  4312: invokespecial   java/util/ArrayList.<init>:()V
        //  4315: aload           17
        //  4317: astore          14
        //  4319: aload           18
        //  4321: astore          19
        //  4323: aload           32
        //  4325: aload           35
        //  4327: aload           4
        //  4329: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4332: pop            
        //  4333: aload           4
        //  4335: astore          17
        //  4337: goto            4340
        //  4340: aload           6
        //  4342: astore          14
        //  4344: aload           18
        //  4346: astore          19
        //  4348: aload           17
        //  4350: aload           34
        //  4352: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  4357: pop            
        //  4358: goto            4398
        //  4361: astore          17
        //  4363: aload           6
        //  4365: astore          14
        //  4367: aload           18
        //  4369: astore          19
        //  4371: aload           30
        //  4373: getfield        u5/w.f:Ljava/lang/Object;
        //  4376: checkcast       Lre/h4;
        //  4379: invokevirtual   re/h4.f:()Lre/c3;
        //  4382: invokevirtual   re/c3.D:()Lre/a3;
        //  4385: aload           31
        //  4387: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  4390: ldc_w           "Failed to merge filter. appId"
        //  4393: aload           17
        //  4395: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  4398: aload           6
        //  4400: astore          14
        //  4402: aload           18
        //  4404: astore          19
        //  4406: aload           18
        //  4408: invokeinterface android/database/Cursor.moveToNext:()Z
        //  4413: istore          33
        //  4415: iload           33
        //  4417: ifne            4434
        //  4420: aload           18
        //  4422: invokeinterface android/database/Cursor.close:()V
        //  4427: aload           6
        //  4429: astore          31
        //  4431: goto            4626
        //  4434: goto            4195
        //  4437: astore          19
        //  4439: aload           6
        //  4441: astore          14
        //  4443: aload           19
        //  4445: astore          6
        //  4447: goto            4489
        //  4450: aload           6
        //  4452: astore          14
        //  4454: aload           18
        //  4456: astore          19
        //  4458: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  4461: astore          17
        //  4463: aload           17
        //  4465: astore          19
        //  4467: aload           6
        //  4469: astore          14
        //  4471: goto            4579
        //  4474: astore          6
        //  4476: goto            4489
        //  4479: astore          19
        //  4481: aload           6
        //  4483: astore          14
        //  4485: aload           19
        //  4487: astore          6
        //  4489: aload           6
        //  4491: astore          17
        //  4493: aload           18
        //  4495: astore          6
        //  4497: goto            4518
        //  4500: astore          17
        //  4502: goto            4515
        //  4505: astore          6
        //  4507: aconst_null    
        //  4508: astore          14
        //  4510: goto            4599
        //  4513: astore          6
        //  4515: aconst_null    
        //  4516: astore          6
        //  4518: aload           6
        //  4520: astore          19
        //  4522: aload           30
        //  4524: getfield        u5/w.f:Ljava/lang/Object;
        //  4527: checkcast       Lre/h4;
        //  4530: invokevirtual   re/h4.f:()Lre/c3;
        //  4533: invokevirtual   re/c3.D:()Lre/a3;
        //  4536: aload           31
        //  4538: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  4541: ldc_w           "Database error querying filters. appId"
        //  4544: aload           17
        //  4546: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  4549: aload           6
        //  4551: astore          19
        //  4553: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  4556: astore          17
        //  4558: aload           17
        //  4560: astore          19
        //  4562: aload           14
        //  4564: astore          18
        //  4566: aload           6
        //  4568: ifnull          4618
        //  4571: aload           6
        //  4573: astore          18
        //  4575: aload           17
        //  4577: astore          19
        //  4579: aload           18
        //  4581: invokeinterface android/database/Cursor.close:()V
        //  4586: aload           14
        //  4588: astore          18
        //  4590: goto            4618
        //  4593: astore          6
        //  4595: aload           19
        //  4597: astore          14
        //  4599: aload           14
        //  4601: ifnull          4611
        //  4604: aload           14
        //  4606: invokeinterface android/database/Cursor.close:()V
        //  4611: aload           6
        //  4613: athrow         
        //  4614: aload           6
        //  4616: astore          18
        //  4618: aload           18
        //  4620: astore          31
        //  4622: aload           19
        //  4624: astore          32
        //  4626: ldc_w           "data"
        //  4629: astore          30
        //  4631: aload           27
        //  4633: getfield        re/a7.g:Lre/g7;
        //  4636: invokevirtual   re/g7.L:()Lre/j;
        //  4639: astore          36
        //  4641: aload           27
        //  4643: getfield        re/b.i:Ljava/lang/String;
        //  4646: astore          35
        //  4648: aload           36
        //  4650: invokevirtual   re/b7.z:()V
        //  4653: aload           36
        //  4655: invokevirtual   u5/w.y:()V
        //  4658: aload           35
        //  4660: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  4663: aload           36
        //  4665: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  4668: astore          6
        //  4670: aload           6
        //  4672: ldc_w           "audience_filter_values"
        //  4675: iconst_2       
        //  4676: anewarray       Ljava/lang/String;
        //  4679: dup            
        //  4680: iconst_0       
        //  4681: ldc_w           "audience_id"
        //  4684: aastore        
        //  4685: dup            
        //  4686: iconst_1       
        //  4687: ldc_w           "current_results"
        //  4690: aastore        
        //  4691: ldc_w           "app_id=?"
        //  4694: iconst_1       
        //  4695: anewarray       Ljava/lang/String;
        //  4698: dup            
        //  4699: iconst_0       
        //  4700: aload           35
        //  4702: aastore        
        //  4703: aconst_null    
        //  4704: aconst_null    
        //  4705: aconst_null    
        //  4706: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  4709: astore          34
        //  4711: aload           24
        //  4713: astore          4
        //  4715: aload           5
        //  4717: astore          19
        //  4719: aload           34
        //  4721: astore          17
        //  4723: aload           34
        //  4725: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  4730: istore          33
        //  4732: iload           33
        //  4734: ifne            4785
        //  4737: aload           34
        //  4739: astore          17
        //  4741: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  4744: astore          19
        //  4746: aload           34
        //  4748: invokeinterface android/database/Cursor.close:()V
        //  4753: ldc_w           "Database error querying filters. appId"
        //  4756: astore          14
        //  4758: ldc_w           "current_results"
        //  4761: astore          4
        //  4763: goto            5166
        //  4766: astore          19
        //  4768: ldc_w           "Database error querying filters. appId"
        //  4771: astore          18
        //  4773: ldc_w           "current_results"
        //  4776: astore          6
        //  4778: aload           34
        //  4780: astore          5
        //  4782: goto            5090
        //  4785: aload           24
        //  4787: astore          4
        //  4789: aload           5
        //  4791: astore          19
        //  4793: aload           34
        //  4795: astore          17
        //  4797: new             Lj0/b;
        //  4800: astore          18
        //  4802: aload           24
        //  4804: astore          4
        //  4806: aload           5
        //  4808: astore          19
        //  4810: aload           34
        //  4812: astore          17
        //  4814: aload           18
        //  4816: invokespecial   j0/b.<init>:()V
        //  4819: aload           5
        //  4821: astore          14
        //  4823: aload           24
        //  4825: astore          6
        //  4827: aload           6
        //  4829: astore          4
        //  4831: aload           14
        //  4833: astore          19
        //  4835: aload           34
        //  4837: astore          17
        //  4839: aload           34
        //  4841: iconst_0       
        //  4842: invokeinterface android/database/Cursor.getInt:(I)I
        //  4847: istore          10
        //  4849: aload           34
        //  4851: astore          17
        //  4853: aload           34
        //  4855: iconst_1       
        //  4856: invokeinterface android/database/Cursor.getBlob:(I)[B
        //  4861: astore          19
        //  4863: aload           34
        //  4865: astore          17
        //  4867: invokestatic    ke/t3.w:()Lke/s3;
        //  4870: aload           19
        //  4872: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //  4875: checkcast       Lke/s3;
        //  4878: invokevirtual   ke/z5.j:()Lke/c6;
        //  4881: checkcast       Lke/t3;
        //  4884: astore          19
        //  4886: aload           34
        //  4888: astore          17
        //  4890: aload           18
        //  4892: iload           10
        //  4894: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4897: aload           19
        //  4899: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  4902: pop            
        //  4903: goto            4969
        //  4906: astore          19
        //  4908: aload           6
        //  4910: astore          18
        //  4912: aload           34
        //  4914: astore          5
        //  4916: aload           14
        //  4918: astore          6
        //  4920: goto            5090
        //  4923: astore          4
        //  4925: aload           34
        //  4927: astore          17
        //  4929: aload           36
        //  4931: getfield        u5/w.f:Ljava/lang/Object;
        //  4934: checkcast       Lre/h4;
        //  4937: invokevirtual   re/h4.f:()Lre/c3;
        //  4940: invokevirtual   re/c3.D:()Lre/a3;
        //  4943: astore          19
        //  4945: aload           34
        //  4947: astore          17
        //  4949: aload           19
        //  4951: aload           35
        //  4953: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  4956: ldc_w           "Failed to merge filter results. appId, audienceId, error"
        //  4959: iload           10
        //  4961: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4964: aload           4
        //  4966: invokevirtual   re/a3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  4969: aload           6
        //  4971: astore          5
        //  4973: aload           34
        //  4975: astore          17
        //  4977: aload           34
        //  4979: invokeinterface android/database/Cursor.moveToNext:()Z
        //  4984: istore          33
        //  4986: iload           33
        //  4988: ifne            5013
        //  4991: aload           34
        //  4993: invokeinterface android/database/Cursor.close:()V
        //  4998: aload           18
        //  5000: astore          19
        //  5002: aload           14
        //  5004: astore          4
        //  5006: aload           5
        //  5008: astore          14
        //  5010: goto            5166
        //  5013: aload           5
        //  5015: astore          6
        //  5017: goto            4827
        //  5020: aload           6
        //  5022: astore          18
        //  5024: astore          6
        //  5026: aload           34
        //  5028: astore          5
        //  5030: aload           6
        //  5032: astore          19
        //  5034: aload           14
        //  5036: astore          6
        //  5038: goto            5090
        //  5041: astore          19
        //  5043: aload           6
        //  5045: astore          18
        //  5047: aload           19
        //  5049: astore          6
        //  5051: goto            5026
        //  5054: astore          6
        //  5056: aload           4
        //  5058: astore          18
        //  5060: aload           19
        //  5062: astore          14
        //  5064: goto            5026
        //  5067: astore          6
        //  5069: aconst_null    
        //  5070: astore          14
        //  5072: goto            12924
        //  5075: astore          19
        //  5077: ldc_w           "Database error querying filters. appId"
        //  5080: astore          18
        //  5082: ldc_w           "current_results"
        //  5085: astore          6
        //  5087: aconst_null    
        //  5088: astore          5
        //  5090: aload           5
        //  5092: astore          17
        //  5094: aload           36
        //  5096: getfield        u5/w.f:Ljava/lang/Object;
        //  5099: checkcast       Lre/h4;
        //  5102: invokevirtual   re/h4.f:()Lre/c3;
        //  5105: invokevirtual   re/c3.D:()Lre/a3;
        //  5108: aload           35
        //  5110: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  5113: ldc_w           "Database error querying filter results. appId"
        //  5116: aload           19
        //  5118: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  5121: aload           5
        //  5123: astore          17
        //  5125: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  5128: astore          24
        //  5130: aload           24
        //  5132: astore          19
        //  5134: aload           6
        //  5136: astore          4
        //  5138: aload           18
        //  5140: astore          14
        //  5142: aload           5
        //  5144: ifnull          5166
        //  5147: aload           5
        //  5149: invokeinterface android/database/Cursor.close:()V
        //  5154: aload           18
        //  5156: astore          14
        //  5158: aload           6
        //  5160: astore          4
        //  5162: aload           24
        //  5164: astore          19
        //  5166: aload           19
        //  5168: invokeinterface java/util/Map.isEmpty:()Z
        //  5173: ifeq            5187
        //  5176: ldc_w           "Failed to merge filter. appId"
        //  5179: astore_3       
        //  5180: aload           20
        //  5182: astore          19
        //  5184: goto            6961
        //  5187: new             Ljava/util/HashSet;
        //  5190: astore          34
        //  5192: aload           34
        //  5194: aload           19
        //  5196: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  5201: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //  5204: iload           12
        //  5206: ifeq            6212
        //  5209: aload           27
        //  5211: getfield        re/b.i:Ljava/lang/String;
        //  5214: astore          35
        //  5216: aload           27
        //  5218: getfield        re/a7.g:Lre/g7;
        //  5221: invokevirtual   re/g7.L:()Lre/j;
        //  5224: astore          36
        //  5226: aload           27
        //  5228: getfield        re/b.i:Ljava/lang/String;
        //  5231: astore          37
        //  5233: aload           36
        //  5235: invokevirtual   re/b7.z:()V
        //  5238: aload           36
        //  5240: invokevirtual   u5/w.y:()V
        //  5243: aload           37
        //  5245: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  5248: new             Lj0/b;
        //  5251: astore          5
        //  5253: aload           5
        //  5255: invokespecial   j0/b.<init>:()V
        //  5258: aload           36
        //  5260: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  5263: astore          6
        //  5265: aload           6
        //  5267: ldc_w           "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
        //  5270: iconst_2       
        //  5271: anewarray       Ljava/lang/String;
        //  5274: dup            
        //  5275: iconst_0       
        //  5276: aload           37
        //  5278: aastore        
        //  5279: dup            
        //  5280: iconst_1       
        //  5281: aload           37
        //  5283: aastore        
        //  5284: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //  5287: astore          17
        //  5289: aload           17
        //  5291: astore          18
        //  5293: aload           17
        //  5295: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  5300: ifeq            5425
        //  5303: aload           17
        //  5305: astore          18
        //  5307: aload           17
        //  5309: iconst_0       
        //  5310: invokeinterface android/database/Cursor.getInt:(I)I
        //  5315: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5318: astore          38
        //  5320: aload           17
        //  5322: astore          18
        //  5324: aload           5
        //  5326: aload           38
        //  5328: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5331: checkcast       Ljava/util/List;
        //  5334: astore          24
        //  5336: aload           24
        //  5338: astore          6
        //  5340: aload           24
        //  5342: ifnonnull       5377
        //  5345: aload           17
        //  5347: astore          18
        //  5349: new             Ljava/util/ArrayList;
        //  5352: astore          6
        //  5354: aload           17
        //  5356: astore          18
        //  5358: aload           6
        //  5360: invokespecial   java/util/ArrayList.<init>:()V
        //  5363: aload           17
        //  5365: astore          18
        //  5367: aload           5
        //  5369: aload           38
        //  5371: aload           6
        //  5373: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  5376: pop            
        //  5377: aload           17
        //  5379: astore          18
        //  5381: aload           6
        //  5383: aload           17
        //  5385: iconst_1       
        //  5386: invokeinterface android/database/Cursor.getInt:(I)I
        //  5391: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5394: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  5399: pop            
        //  5400: aload           17
        //  5402: astore          18
        //  5404: aload           17
        //  5406: invokeinterface android/database/Cursor.moveToNext:()Z
        //  5411: ifne            5303
        //  5414: aload           5
        //  5416: astore          6
        //  5418: aload           17
        //  5420: astore          18
        //  5422: goto            5520
        //  5425: aload           17
        //  5427: astore          18
        //  5429: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  5432: astore          6
        //  5434: aload           17
        //  5436: astore          18
        //  5438: goto            5520
        //  5441: astore          5
        //  5443: aload           17
        //  5445: astore          6
        //  5447: goto            5463
        //  5450: astore          6
        //  5452: aconst_null    
        //  5453: astore          14
        //  5455: goto            6197
        //  5458: astore          5
        //  5460: aconst_null    
        //  5461: astore          6
        //  5463: aload           6
        //  5465: astore          18
        //  5467: aload           36
        //  5469: getfield        u5/w.f:Ljava/lang/Object;
        //  5472: checkcast       Lre/h4;
        //  5475: invokevirtual   re/h4.f:()Lre/c3;
        //  5478: invokevirtual   re/c3.D:()Lre/a3;
        //  5481: aload           37
        //  5483: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  5486: ldc_w           "Database error querying scoped filters. appId"
        //  5489: aload           5
        //  5491: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  5494: aload           6
        //  5496: astore          18
        //  5498: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  5501: astore          17
        //  5503: aload           17
        //  5505: astore          18
        //  5507: aload           6
        //  5509: ifnull          5531
        //  5512: aload           6
        //  5514: astore          18
        //  5516: aload           17
        //  5518: astore          6
        //  5520: aload           18
        //  5522: invokeinterface android/database/Cursor.close:()V
        //  5527: aload           6
        //  5529: astore          18
        //  5531: aload           35
        //  5533: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  5536: new             Lj0/b;
        //  5539: astore          24
        //  5541: aload           24
        //  5543: invokespecial   j0/b.<init>:()V
        //  5546: aload           19
        //  5548: invokeinterface java/util/Map.isEmpty:()Z
        //  5553: ifeq            5570
        //  5556: aload_3        
        //  5557: astore          17
        //  5559: aload           17
        //  5561: astore          5
        //  5563: aload           24
        //  5565: astore          17
        //  5567: goto            6221
        //  5570: aload           19
        //  5572: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  5577: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  5582: astore          6
        //  5584: aload           18
        //  5586: astore          5
        //  5588: aload           6
        //  5590: astore          18
        //  5592: aload_3        
        //  5593: astore          6
        //  5595: aload           6
        //  5597: astore          17
        //  5599: aload           18
        //  5601: invokeinterface java/util/Iterator.hasNext:()Z
        //  5606: ifeq            5559
        //  5609: aload           18
        //  5611: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  5616: checkcast       Ljava/lang/Integer;
        //  5619: invokevirtual   java/lang/Integer.intValue:()I
        //  5622: istore          10
        //  5624: iload           10
        //  5626: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5629: astore          17
        //  5631: aload           19
        //  5633: aload           17
        //  5635: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5640: checkcast       Lke/t3;
        //  5643: astore          36
        //  5645: aload           5
        //  5647: aload           17
        //  5649: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5654: checkcast       Ljava/util/List;
        //  5657: astore_3       
        //  5658: aload_3        
        //  5659: ifnull          6178
        //  5662: aload_3        
        //  5663: invokeinterface java/util/List.isEmpty:()Z
        //  5668: ifeq            5674
        //  5671: goto            6178
        //  5674: aload           27
        //  5676: getfield        re/a7.g:Lre/g7;
        //  5679: invokevirtual   re/g7.O:()Lre/i7;
        //  5682: aload           36
        //  5684: invokevirtual   ke/t3.B:()Ljava/util/List;
        //  5687: checkcast       Lke/g6;
        //  5690: aload_3        
        //  5691: invokevirtual   re/i7.U:(Lke/g6;Ljava/util/List;)Ljava/util/List;
        //  5694: astore          17
        //  5696: aload           17
        //  5698: invokeinterface java/util/List.isEmpty:()Z
        //  5703: ifne            6175
        //  5706: aload           36
        //  5708: invokevirtual   ke/c6.o:()Lke/z5;
        //  5711: checkcast       Lke/s3;
        //  5714: astore          35
        //  5716: aload           35
        //  5718: invokevirtual   ke/s3.n:()V
        //  5721: aload           35
        //  5723: getfield        ke/z5.h:Z
        //  5726: ifeq            5740
        //  5729: aload           35
        //  5731: invokevirtual   ke/z5.l:()V
        //  5734: aload           35
        //  5736: iconst_0       
        //  5737: putfield        ke/z5.h:Z
        //  5740: aload           35
        //  5742: getfield        ke/z5.g:Lke/c6;
        //  5745: checkcast       Lke/t3;
        //  5748: aload           17
        //  5750: invokestatic    ke/t3.G:(Lke/t3;Ljava/util/List;)V
        //  5753: aload           27
        //  5755: getfield        re/a7.g:Lre/g7;
        //  5758: invokevirtual   re/g7.O:()Lre/i7;
        //  5761: aload           36
        //  5763: invokevirtual   ke/t3.D:()Ljava/util/List;
        //  5766: checkcast       Lke/g6;
        //  5769: aload_3        
        //  5770: invokevirtual   re/i7.U:(Lke/g6;Ljava/util/List;)Ljava/util/List;
        //  5773: astore          17
        //  5775: aload           35
        //  5777: invokevirtual   ke/s3.p:()V
        //  5780: aload           35
        //  5782: getfield        ke/z5.h:Z
        //  5785: ifeq            5799
        //  5788: aload           35
        //  5790: invokevirtual   ke/z5.l:()V
        //  5793: aload           35
        //  5795: iconst_0       
        //  5796: putfield        ke/z5.h:Z
        //  5799: aload           35
        //  5801: getfield        ke/z5.g:Lke/c6;
        //  5804: checkcast       Lke/t3;
        //  5807: aload           17
        //  5809: invokestatic    ke/t3.E:(Lke/t3;Ljava/util/List;)V
        //  5812: invokestatic    com/google/android/gms/internal/measurement/p.a:()V
        //  5815: aload           27
        //  5817: getfield        u5/w.f:Ljava/lang/Object;
        //  5820: checkcast       Lre/h4;
        //  5823: invokevirtual   re/h4.m:()Lre/f;
        //  5826: aconst_null    
        //  5827: getstatic       re/q2.B0:Lre/p2;
        //  5830: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  5833: ifeq            6057
        //  5836: new             Ljava/util/ArrayList;
        //  5839: astore          37
        //  5841: aload           37
        //  5843: invokespecial   java/util/ArrayList.<init>:()V
        //  5846: aload           36
        //  5848: invokevirtual   ke/t3.A:()Lke/h6;
        //  5851: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  5856: astore          17
        //  5858: aload           17
        //  5860: invokeinterface java/util/Iterator.hasNext:()Z
        //  5865: ifeq            5908
        //  5868: aload           17
        //  5870: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  5875: checkcast       Lke/c3;
        //  5878: astore          38
        //  5880: aload_3        
        //  5881: aload           38
        //  5883: invokevirtual   ke/c3.r:()I
        //  5886: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5889: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  5894: ifne            5905
        //  5897: aload           37
        //  5899: aload           38
        //  5901: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  5904: pop            
        //  5905: goto            5858
        //  5908: aload           35
        //  5910: invokevirtual   ke/s3.m:()V
        //  5913: aload           35
        //  5915: getfield        ke/z5.h:Z
        //  5918: ifeq            5932
        //  5921: aload           35
        //  5923: invokevirtual   ke/z5.l:()V
        //  5926: aload           35
        //  5928: iconst_0       
        //  5929: putfield        ke/z5.h:Z
        //  5932: aload           35
        //  5934: getfield        ke/z5.g:Lke/c6;
        //  5937: checkcast       Lke/t3;
        //  5940: aload           37
        //  5942: invokestatic    ke/t3.I:(Lke/t3;Ljava/util/ArrayList;)V
        //  5945: new             Ljava/util/ArrayList;
        //  5948: astore          17
        //  5950: aload           17
        //  5952: invokespecial   java/util/ArrayList.<init>:()V
        //  5955: aload           36
        //  5957: invokevirtual   ke/t3.C:()Lke/h6;
        //  5960: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  5965: astore          36
        //  5967: aload           36
        //  5969: invokeinterface java/util/Iterator.hasNext:()Z
        //  5974: ifeq            6017
        //  5977: aload           36
        //  5979: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  5984: checkcast       Lke/v3;
        //  5987: astore          37
        //  5989: aload_3        
        //  5990: aload           37
        //  5992: invokevirtual   ke/v3.s:()I
        //  5995: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  5998: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  6003: ifne            5967
        //  6006: aload           17
        //  6008: aload           37
        //  6010: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  6013: pop            
        //  6014: goto            5967
        //  6017: aload           35
        //  6019: invokevirtual   ke/s3.o:()V
        //  6022: aload           35
        //  6024: getfield        ke/z5.h:Z
        //  6027: ifeq            6041
        //  6030: aload           35
        //  6032: invokevirtual   ke/z5.l:()V
        //  6035: aload           35
        //  6037: iconst_0       
        //  6038: putfield        ke/z5.h:Z
        //  6041: aload           35
        //  6043: getfield        ke/z5.g:Lke/c6;
        //  6046: checkcast       Lke/t3;
        //  6049: aload           17
        //  6051: invokestatic    ke/t3.L:(Lke/t3;Ljava/util/List;)V
        //  6054: goto            6153
        //  6057: iconst_0       
        //  6058: istore          12
        //  6060: iload           12
        //  6062: aload           36
        //  6064: invokevirtual   ke/t3.r:()I
        //  6067: if_icmpge       6105
        //  6070: aload_3        
        //  6071: aload           36
        //  6073: iload           12
        //  6075: invokevirtual   ke/t3.v:(I)Lke/c3;
        //  6078: invokevirtual   ke/c3.r:()I
        //  6081: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6084: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  6089: ifeq            6099
        //  6092: aload           35
        //  6094: iload           12
        //  6096: invokevirtual   ke/s3.q:(I)V
        //  6099: iinc            12, 1
        //  6102: goto            6060
        //  6105: iconst_0       
        //  6106: istore          12
        //  6108: iload           12
        //  6110: aload           36
        //  6112: invokevirtual   ke/t3.t:()I
        //  6115: if_icmpge       6153
        //  6118: aload_3        
        //  6119: aload           36
        //  6121: iload           12
        //  6123: invokevirtual   ke/t3.z:(I)Lke/v3;
        //  6126: invokevirtual   ke/v3.s:()I
        //  6129: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6132: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  6137: ifeq            6147
        //  6140: aload           35
        //  6142: iload           12
        //  6144: invokevirtual   ke/s3.r:(I)V
        //  6147: iinc            12, 1
        //  6150: goto            6108
        //  6153: aload           24
        //  6155: iload           10
        //  6157: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6160: aload           35
        //  6162: invokevirtual   ke/z5.j:()Lke/c6;
        //  6165: checkcast       Lke/t3;
        //  6168: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6171: pop            
        //  6172: goto            6188
        //  6175: goto            5595
        //  6178: aload           24
        //  6180: aload           17
        //  6182: aload           36
        //  6184: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6187: pop            
        //  6188: goto            5595
        //  6191: astore          6
        //  6193: aload           18
        //  6195: astore          14
        //  6197: aload           14
        //  6199: ifnull          6209
        //  6202: aload           14
        //  6204: invokeinterface android/database/Cursor.close:()V
        //  6209: aload           6
        //  6211: athrow         
        //  6212: ldc_w           "Failed to merge filter. appId"
        //  6215: astore          5
        //  6217: aload           19
        //  6219: astore          17
        //  6221: aload           34
        //  6223: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  6226: astore          18
        //  6228: aload           20
        //  6230: astore          6
        //  6232: aload           6
        //  6234: astore          20
        //  6236: aload           5
        //  6238: astore_3       
        //  6239: aload           18
        //  6241: invokeinterface java/util/Iterator.hasNext:()Z
        //  6246: ifeq            5180
        //  6249: aload           18
        //  6251: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  6256: checkcast       Ljava/lang/Integer;
        //  6259: invokevirtual   java/lang/Integer.intValue:()I
        //  6262: istore          10
        //  6264: aload           17
        //  6266: iload           10
        //  6268: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6271: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  6276: checkcast       Lke/t3;
        //  6279: astore          37
        //  6281: new             Ljava/util/BitSet;
        //  6284: astore          34
        //  6286: aload           34
        //  6288: invokespecial   java/util/BitSet.<init>:()V
        //  6291: new             Ljava/util/BitSet;
        //  6294: astore          35
        //  6296: aload           35
        //  6298: invokespecial   java/util/BitSet.<init>:()V
        //  6301: new             Lj0/b;
        //  6304: astore          36
        //  6306: aload           36
        //  6308: invokespecial   j0/b.<init>:()V
        //  6311: aload           17
        //  6313: astore_3       
        //  6314: aload           37
        //  6316: ifnull          6417
        //  6319: aload           37
        //  6321: invokevirtual   ke/t3.r:()I
        //  6324: ifne            6333
        //  6327: aload           17
        //  6329: astore_3       
        //  6330: goto            6417
        //  6333: aload           37
        //  6335: invokevirtual   ke/t3.A:()Lke/h6;
        //  6338: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  6343: astore          20
        //  6345: aload           17
        //  6347: astore_3       
        //  6348: aload           20
        //  6350: invokeinterface java/util/Iterator.hasNext:()Z
        //  6355: ifeq            6417
        //  6358: aload           20
        //  6360: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  6365: checkcast       Lke/c3;
        //  6368: astore_3       
        //  6369: aload_3        
        //  6370: invokevirtual   ke/c3.y:()Z
        //  6373: ifeq            6345
        //  6376: aload_3        
        //  6377: invokevirtual   ke/c3.r:()I
        //  6380: istore          12
        //  6382: aload_3        
        //  6383: invokevirtual   ke/c3.x:()Z
        //  6386: ifeq            6400
        //  6389: aload_3        
        //  6390: invokevirtual   ke/c3.s:()J
        //  6393: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6396: astore_3       
        //  6397: goto            6402
        //  6400: aconst_null    
        //  6401: astore_3       
        //  6402: aload           36
        //  6404: iload           12
        //  6406: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6409: aload_3        
        //  6410: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6413: pop            
        //  6414: goto            6345
        //  6417: new             Lj0/b;
        //  6420: astore          24
        //  6422: aload           24
        //  6424: invokespecial   j0/b.<init>:()V
        //  6427: aload           18
        //  6429: astore          17
        //  6431: aload           37
        //  6433: ifnull          6544
        //  6436: aload           37
        //  6438: invokevirtual   ke/t3.t:()I
        //  6441: istore          12
        //  6443: iload           12
        //  6445: ifne            6455
        //  6448: aload           18
        //  6450: astore          17
        //  6452: goto            6544
        //  6455: aload           37
        //  6457: invokevirtual   ke/t3.C:()Lke/h6;
        //  6460: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  6465: astore          20
        //  6467: aload           18
        //  6469: astore          17
        //  6471: aload           20
        //  6473: invokeinterface java/util/Iterator.hasNext:()Z
        //  6478: ifeq            6544
        //  6481: aload           20
        //  6483: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  6488: checkcast       Lke/v3;
        //  6491: astore          17
        //  6493: aload           17
        //  6495: invokevirtual   ke/v3.z:()Z
        //  6498: ifeq            6541
        //  6501: aload           17
        //  6503: invokevirtual   ke/v3.r:()I
        //  6506: ifle            6541
        //  6509: aload           24
        //  6511: aload           17
        //  6513: invokevirtual   ke/v3.s:()I
        //  6516: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6519: aload           17
        //  6521: aload           17
        //  6523: invokevirtual   ke/v3.r:()I
        //  6526: iconst_1       
        //  6527: isub           
        //  6528: invokevirtual   ke/v3.t:(I)J
        //  6531: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6534: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6537: pop            
        //  6538: goto            6467
        //  6541: goto            6467
        //  6544: aload           24
        //  6546: astore          20
        //  6548: aload           6
        //  6550: astore          18
        //  6552: aload           37
        //  6554: ifnull          6677
        //  6557: iconst_0       
        //  6558: istore          12
        //  6560: aload           24
        //  6562: astore          20
        //  6564: aload           6
        //  6566: astore          18
        //  6568: iload           12
        //  6570: aload           37
        //  6572: invokevirtual   ke/t3.u:()I
        //  6575: bipush          64
        //  6577: imul           
        //  6578: if_icmpge       6677
        //  6581: iload           12
        //  6583: aload           37
        //  6585: invokevirtual   ke/t3.D:()Ljava/util/List;
        //  6588: checkcast       Lke/g6;
        //  6591: invokestatic    re/i7.X:(ILke/g6;)Z
        //  6594: ifeq            6660
        //  6597: aload           27
        //  6599: getfield        u5/w.f:Ljava/lang/Object;
        //  6602: checkcast       Lre/h4;
        //  6605: invokevirtual   re/h4.f:()Lre/c3;
        //  6608: invokevirtual   re/c3.E:()Lre/a3;
        //  6611: iload           10
        //  6613: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6616: ldc_w           "Filter already evaluated. audience ID, filter ID"
        //  6619: iload           12
        //  6621: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6624: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  6627: aload           35
        //  6629: iload           12
        //  6631: invokevirtual   java/util/BitSet.set:(I)V
        //  6634: iload           12
        //  6636: aload           37
        //  6638: invokevirtual   ke/t3.B:()Ljava/util/List;
        //  6641: checkcast       Lke/g6;
        //  6644: invokestatic    re/i7.X:(ILke/g6;)Z
        //  6647: ifeq            6660
        //  6650: aload           34
        //  6652: iload           12
        //  6654: invokevirtual   java/util/BitSet.set:(I)V
        //  6657: goto            6671
        //  6660: aload           36
        //  6662: iload           12
        //  6664: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6667: invokevirtual   j0/i.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //  6670: pop            
        //  6671: iinc            12, 1
        //  6674: goto            6560
        //  6677: iload           10
        //  6679: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6682: astore          37
        //  6684: aload           19
        //  6686: aload           37
        //  6688: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  6693: checkcast       Lke/t3;
        //  6696: astore          24
        //  6698: aload           20
        //  6700: astore          6
        //  6702: iload           29
        //  6704: ifeq            6896
        //  6707: aload           20
        //  6709: astore          6
        //  6711: iload           9
        //  6713: ifeq            6896
        //  6716: aload           32
        //  6718: aload           37
        //  6720: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  6725: checkcast       Ljava/util/List;
        //  6728: astore          37
        //  6730: aload           20
        //  6732: astore          6
        //  6734: aload           37
        //  6736: ifnull          6896
        //  6739: aload           20
        //  6741: astore          6
        //  6743: aload           27
        //  6745: getfield        re/b.m:Ljava/lang/Long;
        //  6748: ifnull          6896
        //  6751: aload           27
        //  6753: getfield        re/b.l:Ljava/lang/Long;
        //  6756: ifnonnull       6766
        //  6759: aload           20
        //  6761: astore          6
        //  6763: goto            6896
        //  6766: aload           37
        //  6768: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  6773: astore          37
        //  6775: aload           20
        //  6777: astore          6
        //  6779: aload           37
        //  6781: invokeinterface java/util/Iterator.hasNext:()Z
        //  6786: ifeq            6896
        //  6789: aload           37
        //  6791: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  6796: checkcast       Lke/b2;
        //  6799: astore          6
        //  6801: aload           6
        //  6803: invokevirtual   ke/b2.s:()I
        //  6806: istore          12
        //  6808: aload           27
        //  6810: getfield        re/b.m:Ljava/lang/Long;
        //  6813: invokevirtual   java/lang/Long.longValue:()J
        //  6816: ldc2_w          1000
        //  6819: ldiv           
        //  6820: lstore_1       
        //  6821: aload           6
        //  6823: invokevirtual   ke/b2.C:()Z
        //  6826: ifeq            6842
        //  6829: aload           27
        //  6831: getfield        re/b.l:Ljava/lang/Long;
        //  6834: invokevirtual   java/lang/Long.longValue:()J
        //  6837: ldc2_w          1000
        //  6840: ldiv           
        //  6841: lstore_1       
        //  6842: iload           12
        //  6844: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6847: astore          6
        //  6849: aload           36
        //  6851: aload           6
        //  6853: invokevirtual   j0/i.containsKey:(Ljava/lang/Object;)Z
        //  6856: ifeq            6871
        //  6859: aload           36
        //  6861: aload           6
        //  6863: lload_1        
        //  6864: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6867: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6870: pop            
        //  6871: aload           20
        //  6873: aload           6
        //  6875: invokevirtual   j0/i.containsKey:(Ljava/lang/Object;)Z
        //  6878: ifeq            6893
        //  6881: aload           20
        //  6883: aload           6
        //  6885: lload_1        
        //  6886: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  6889: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6892: pop            
        //  6893: goto            6775
        //  6896: new             Lre/t7;
        //  6899: astore          20
        //  6901: aload           20
        //  6903: aload           27
        //  6905: aload           27
        //  6907: getfield        re/b.i:Ljava/lang/String;
        //  6910: aload           24
        //  6912: aload           34
        //  6914: aload           35
        //  6916: aload           36
        //  6918: aload           6
        //  6920: invokespecial   re/t7.<init>:(Lre/b;Ljava/lang/String;Lke/t3;Ljava/util/BitSet;Ljava/util/BitSet;Lj0/b;Lj0/b;)V
        //  6923: aload           27
        //  6925: getfield        re/b.k:Lj0/b;
        //  6928: iload           10
        //  6930: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  6933: aload           20
        //  6935: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  6938: pop            
        //  6939: aload           17
        //  6941: astore          6
        //  6943: aload           18
        //  6945: astore          20
        //  6947: aload_3        
        //  6948: astore          17
        //  6950: aload           6
        //  6952: astore          18
        //  6954: aload           20
        //  6956: astore          6
        //  6958: goto            6232
        //  6961: aload           31
        //  6963: invokeinterface java/util/List.isEmpty:()Z
        //  6968: istore          9
        //  6970: ldc_w           "Skipping failed audience ID"
        //  6973: astore          32
        //  6975: iload           9
        //  6977: ifeq            7001
        //  6980: aload           19
        //  6982: astore          24
        //  6984: aload           30
        //  6986: astore          17
        //  6988: aload           32
        //  6990: astore_3       
        //  6991: aload_3        
        //  6992: astore          5
        //  6994: aload           17
        //  6996: astore          18
        //  6998: goto            8428
        //  7001: new             Lre/u7;
        //  7004: astore          36
        //  7006: aload           36
        //  7008: aload           27
        //  7010: invokespecial   re/u7.<init>:(Lre/b;)V
        //  7013: new             Lj0/b;
        //  7016: astore          37
        //  7018: aload           37
        //  7020: invokespecial   j0/b.<init>:()V
        //  7023: aload           31
        //  7025: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  7030: astore          35
        //  7032: aload_3        
        //  7033: astore          6
        //  7035: aload           14
        //  7037: astore          5
        //  7039: aload           30
        //  7041: astore          18
        //  7043: aload           32
        //  7045: astore_3       
        //  7046: aload           18
        //  7048: astore          17
        //  7050: aload           5
        //  7052: astore          14
        //  7054: aload           19
        //  7056: astore          24
        //  7058: aload           35
        //  7060: invokeinterface java/util/Iterator.hasNext:()Z
        //  7065: ifeq            6991
        //  7068: aload           35
        //  7070: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  7075: checkcast       Lke/e3;
        //  7078: astore_3       
        //  7079: aload           36
        //  7081: aload_3        
        //  7082: aload           27
        //  7084: getfield        re/b.i:Ljava/lang/String;
        //  7087: invokevirtual   re/u7.a:(Lke/e3;Ljava/lang/String;)Lke/e3;
        //  7090: astore          39
        //  7092: aload           39
        //  7094: ifnull          7043
        //  7097: aload           27
        //  7099: getfield        re/a7.g:Lre/g7;
        //  7102: invokevirtual   re/g7.L:()Lre/j;
        //  7105: astore          24
        //  7107: aload           27
        //  7109: getfield        re/b.i:Ljava/lang/String;
        //  7112: astore          17
        //  7114: aload           39
        //  7116: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  7119: astore          20
        //  7121: aload           24
        //  7123: aload           17
        //  7125: aload_3        
        //  7126: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  7129: invokevirtual   re/j.W:(Ljava/lang/String;Ljava/lang/String;)Lre/p;
        //  7132: astore          14
        //  7134: aload           14
        //  7136: ifnonnull       7211
        //  7139: aload           24
        //  7141: getfield        u5/w.f:Ljava/lang/Object;
        //  7144: checkcast       Lre/h4;
        //  7147: invokevirtual   re/h4.f:()Lre/c3;
        //  7150: invokevirtual   re/c3.F:()Lre/a3;
        //  7153: aload           17
        //  7155: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  7158: ldc_w           "Event aggregate wasn't created during raw event logging. appId, event"
        //  7161: aload           24
        //  7163: getfield        u5/w.f:Ljava/lang/Object;
        //  7166: checkcast       Lre/h4;
        //  7169: invokevirtual   re/h4.r:()Lre/x2;
        //  7172: aload           20
        //  7174: invokevirtual   re/x2.d:(Ljava/lang/String;)Ljava/lang/String;
        //  7177: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  7180: new             Lre/p;
        //  7183: astore          14
        //  7185: aload           14
        //  7187: aload           17
        //  7189: aload_3        
        //  7190: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  7193: lconst_1       
        //  7194: lconst_1       
        //  7195: lconst_1       
        //  7196: aload_3        
        //  7197: invokevirtual   ke/e3.u:()J
        //  7200: lconst_0       
        //  7201: aconst_null    
        //  7202: aconst_null    
        //  7203: aconst_null    
        //  7204: aconst_null    
        //  7205: invokespecial   re/p.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  7208: goto            7281
        //  7211: new             Lre/p;
        //  7214: dup            
        //  7215: aload           14
        //  7217: getfield        re/p.a:Ljava/lang/String;
        //  7220: aload           14
        //  7222: getfield        re/p.b:Ljava/lang/String;
        //  7225: aload           14
        //  7227: getfield        re/p.c:J
        //  7230: lconst_1       
        //  7231: ladd           
        //  7232: aload           14
        //  7234: getfield        re/p.d:J
        //  7237: lconst_1       
        //  7238: ladd           
        //  7239: aload           14
        //  7241: getfield        re/p.e:J
        //  7244: lconst_1       
        //  7245: ladd           
        //  7246: aload           14
        //  7248: getfield        re/p.f:J
        //  7251: aload           14
        //  7253: getfield        re/p.g:J
        //  7256: aload           14
        //  7258: getfield        re/p.h:Ljava/lang/Long;
        //  7261: aload           14
        //  7263: getfield        re/p.i:Ljava/lang/Long;
        //  7266: aload           14
        //  7268: getfield        re/p.j:Ljava/lang/Long;
        //  7271: aload           14
        //  7273: getfield        re/p.k:Ljava/lang/Boolean;
        //  7276: invokespecial   re/p.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        //  7279: astore          14
        //  7281: aload           27
        //  7283: getfield        re/a7.g:Lre/g7;
        //  7286: invokevirtual   re/g7.L:()Lre/j;
        //  7289: aload           14
        //  7291: invokevirtual   re/j.F:(Lre/p;)V
        //  7294: aload           14
        //  7296: getfield        re/p.c:J
        //  7299: lstore_1       
        //  7300: aload           39
        //  7302: invokevirtual   ke/e3.y:()Ljava/lang/String;
        //  7305: astore          40
        //  7307: aload           37
        //  7309: aload           40
        //  7311: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  7314: checkcast       Ljava/util/Map;
        //  7317: astore          30
        //  7319: aload           30
        //  7321: ifnonnull       8060
        //  7324: aload           27
        //  7326: getfield        re/a7.g:Lre/g7;
        //  7329: invokevirtual   re/g7.L:()Lre/j;
        //  7332: astore          41
        //  7334: aload           27
        //  7336: getfield        re/b.i:Ljava/lang/String;
        //  7339: astore          42
        //  7341: aload           41
        //  7343: invokevirtual   re/b7.z:()V
        //  7346: aload           41
        //  7348: invokevirtual   u5/w.y:()V
        //  7351: aload           42
        //  7353: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  7356: aload           40
        //  7358: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  7361: new             Lj0/b;
        //  7364: astore          43
        //  7366: aload           43
        //  7368: invokespecial   j0/b.<init>:()V
        //  7371: aload           41
        //  7373: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  7376: astore_3       
        //  7377: aload           18
        //  7379: astore          17
        //  7381: aload_3        
        //  7382: ldc_w           "event_filters"
        //  7385: iconst_2       
        //  7386: anewarray       Ljava/lang/String;
        //  7389: dup            
        //  7390: iconst_0       
        //  7391: aload           19
        //  7393: aastore        
        //  7394: dup            
        //  7395: iconst_1       
        //  7396: aload           17
        //  7398: aastore        
        //  7399: ldc_w           "app_id=? AND event_name=?"
        //  7402: iconst_2       
        //  7403: anewarray       Ljava/lang/String;
        //  7406: dup            
        //  7407: iconst_0       
        //  7408: aload           42
        //  7410: aastore        
        //  7411: dup            
        //  7412: iconst_1       
        //  7413: aload           40
        //  7415: aastore        
        //  7416: aconst_null    
        //  7417: aconst_null    
        //  7418: aconst_null    
        //  7419: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  7422: astore          24
        //  7424: aload           24
        //  7426: astore          30
        //  7428: aload           24
        //  7430: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  7435: istore          9
        //  7437: iload           9
        //  7439: ifeq            7801
        //  7442: aload           6
        //  7444: astore          18
        //  7446: aload           14
        //  7448: astore          6
        //  7450: aload           17
        //  7452: astore          14
        //  7454: aload           24
        //  7456: astore          30
        //  7458: aload           24
        //  7460: iconst_1       
        //  7461: invokeinterface android/database/Cursor.getBlob:(I)[B
        //  7466: astore          17
        //  7468: aload           24
        //  7470: astore          30
        //  7472: invokestatic    ke/b2.t:()Lke/a2;
        //  7475: aload           17
        //  7477: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //  7480: checkcast       Lke/a2;
        //  7483: invokevirtual   ke/z5.j:()Lke/c6;
        //  7486: checkcast       Lke/b2;
        //  7489: astore_3       
        //  7490: aload           24
        //  7492: astore          30
        //  7494: aload           24
        //  7496: iconst_0       
        //  7497: invokeinterface android/database/Cursor.getInt:(I)I
        //  7502: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  7505: astore          20
        //  7507: aload           24
        //  7509: astore          30
        //  7511: aload           43
        //  7513: aload           20
        //  7515: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  7518: checkcast       Ljava/util/List;
        //  7521: astore          17
        //  7523: aload           17
        //  7525: ifnonnull       7563
        //  7528: aload           24
        //  7530: astore          30
        //  7532: new             Ljava/util/ArrayList;
        //  7535: astore          17
        //  7537: aload           24
        //  7539: astore          30
        //  7541: aload           17
        //  7543: invokespecial   java/util/ArrayList.<init>:()V
        //  7546: aload           24
        //  7548: astore          30
        //  7550: aload           43
        //  7552: aload           20
        //  7554: aload           17
        //  7556: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  7559: pop            
        //  7560: goto            7563
        //  7563: aload           24
        //  7565: astore          30
        //  7567: aload           17
        //  7569: aload_3        
        //  7570: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  7575: pop            
        //  7576: goto            7678
        //  7579: astore          17
        //  7581: goto            7586
        //  7584: astore          17
        //  7586: aload           6
        //  7588: astore_3       
        //  7589: aload           18
        //  7591: astore          6
        //  7593: aload           17
        //  7595: astore          20
        //  7597: aload           24
        //  7599: astore          17
        //  7601: aload_3        
        //  7602: astore          18
        //  7604: goto            7918
        //  7607: astore          44
        //  7609: aload           19
        //  7611: astore          34
        //  7613: aload           24
        //  7615: astore          30
        //  7617: aload           41
        //  7619: getfield        u5/w.f:Ljava/lang/Object;
        //  7622: checkcast       Lre/h4;
        //  7625: invokevirtual   re/h4.f:()Lre/c3;
        //  7628: invokevirtual   re/c3.D:()Lre/a3;
        //  7631: astore          45
        //  7633: aload           24
        //  7635: astore          30
        //  7637: aload           42
        //  7639: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  7642: astore          46
        //  7644: aload           6
        //  7646: astore          20
        //  7648: aload           18
        //  7650: astore          38
        //  7652: aload           38
        //  7654: astore_3       
        //  7655: aload           14
        //  7657: astore          31
        //  7659: aload           34
        //  7661: astore          17
        //  7663: aload           24
        //  7665: astore          30
        //  7667: aload           45
        //  7669: aload           46
        //  7671: aload           38
        //  7673: aload           44
        //  7675: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  7678: aload           18
        //  7680: astore_3       
        //  7681: aload           6
        //  7683: astore          20
        //  7685: aload           14
        //  7687: astore          31
        //  7689: aload           19
        //  7691: astore          17
        //  7693: aload           24
        //  7695: astore          30
        //  7697: aload           24
        //  7699: invokeinterface android/database/Cursor.moveToNext:()Z
        //  7704: istore          9
        //  7706: iload           9
        //  7708: ifne            7740
        //  7711: aload           24
        //  7713: invokeinterface android/database/Cursor.close:()V
        //  7718: aload           43
        //  7720: astore          30
        //  7722: aload           18
        //  7724: astore          31
        //  7726: aload           6
        //  7728: astore          24
        //  7730: aload           14
        //  7732: astore          20
        //  7734: aload           19
        //  7736: astore_3       
        //  7737: goto            8011
        //  7740: aload           14
        //  7742: astore          17
        //  7744: goto            7450
        //  7747: astore          19
        //  7749: aload           6
        //  7751: astore          17
        //  7753: aload           34
        //  7755: astore          6
        //  7757: goto            7772
        //  7760: astore_3       
        //  7761: aload           6
        //  7763: astore          17
        //  7765: aload           19
        //  7767: astore          6
        //  7769: aload_3        
        //  7770: astore          19
        //  7772: aload           18
        //  7774: astore          20
        //  7776: aload           6
        //  7778: astore_3       
        //  7779: aload           17
        //  7781: astore          18
        //  7783: aload           20
        //  7785: astore          6
        //  7787: aload           19
        //  7789: astore          20
        //  7791: aload           24
        //  7793: astore          17
        //  7795: aload_3        
        //  7796: astore          19
        //  7798: goto            7918
        //  7801: aload           17
        //  7803: astore          18
        //  7805: aload           6
        //  7807: astore_3       
        //  7808: aload           14
        //  7810: astore          20
        //  7812: aload           18
        //  7814: astore          31
        //  7816: aload           19
        //  7818: astore          17
        //  7820: aload           24
        //  7822: astore          30
        //  7824: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  7827: astore          34
        //  7829: aload           34
        //  7831: astore          30
        //  7833: aload           24
        //  7835: astore          17
        //  7837: aload           18
        //  7839: astore          20
        //  7841: goto            7993
        //  7844: astore          19
        //  7846: aload_3        
        //  7847: astore          6
        //  7849: aload           20
        //  7851: astore          18
        //  7853: aload           31
        //  7855: astore          14
        //  7857: aload           17
        //  7859: astore_3       
        //  7860: goto            7787
        //  7863: astore          18
        //  7865: aload           14
        //  7867: astore          20
        //  7869: aload           17
        //  7871: astore          14
        //  7873: aload           19
        //  7875: astore_3       
        //  7876: aload           18
        //  7878: astore          19
        //  7880: aload           20
        //  7882: astore          17
        //  7884: aload           6
        //  7886: astore          18
        //  7888: aload_3        
        //  7889: astore          6
        //  7891: goto            7772
        //  7894: astore          20
        //  7896: aload           14
        //  7898: astore          18
        //  7900: aload           17
        //  7902: astore          14
        //  7904: goto            7915
        //  7907: astore          6
        //  7909: aconst_null    
        //  7910: astore          14
        //  7912: goto            8045
        //  7915: aconst_null    
        //  7916: astore          17
        //  7918: aload           17
        //  7920: astore          30
        //  7922: aload           41
        //  7924: getfield        u5/w.f:Ljava/lang/Object;
        //  7927: checkcast       Lre/h4;
        //  7930: invokevirtual   re/h4.f:()Lre/c3;
        //  7933: invokevirtual   re/c3.D:()Lre/a3;
        //  7936: aload           42
        //  7938: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  7941: aload           5
        //  7943: aload           20
        //  7945: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  7948: aload           17
        //  7950: astore          30
        //  7952: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  7955: astore          34
        //  7957: aload           6
        //  7959: astore          31
        //  7961: aload           34
        //  7963: astore          30
        //  7965: aload           18
        //  7967: astore          24
        //  7969: aload           14
        //  7971: astore          20
        //  7973: aload           19
        //  7975: astore_3       
        //  7976: aload           17
        //  7978: ifnull          8011
        //  7981: aload           14
        //  7983: astore          20
        //  7985: aload           18
        //  7987: astore          14
        //  7989: aload           34
        //  7991: astore          30
        //  7993: aload           17
        //  7995: invokeinterface android/database/Cursor.close:()V
        //  8000: aload           19
        //  8002: astore_3       
        //  8003: aload           14
        //  8005: astore          24
        //  8007: aload           6
        //  8009: astore          31
        //  8011: aload           37
        //  8013: aload           40
        //  8015: aload           30
        //  8017: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  8020: pop            
        //  8021: aload           31
        //  8023: astore          6
        //  8025: aload           24
        //  8027: astore          31
        //  8029: aload           20
        //  8031: astore          18
        //  8033: aload_3        
        //  8034: astore          19
        //  8036: goto            8064
        //  8039: astore          6
        //  8041: aload           30
        //  8043: astore          14
        //  8045: aload           14
        //  8047: ifnull          8057
        //  8050: aload           14
        //  8052: invokeinterface android/database/Cursor.close:()V
        //  8057: aload           6
        //  8059: athrow         
        //  8060: aload           14
        //  8062: astore          31
        //  8064: aload           5
        //  8066: astore          14
        //  8068: aload           30
        //  8070: astore          24
        //  8072: aload           24
        //  8074: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  8079: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  8084: astore          30
        //  8086: aload           39
        //  8088: astore          5
        //  8090: aload           37
        //  8092: astore          17
        //  8094: aload           30
        //  8096: invokeinterface java/util/Iterator.hasNext:()Z
        //  8101: ifeq            8417
        //  8104: aload           30
        //  8106: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  8111: checkcast       Ljava/lang/Integer;
        //  8114: invokevirtual   java/lang/Integer.intValue:()I
        //  8117: istore          12
        //  8119: aload           27
        //  8121: getfield        re/b.j:Ljava/util/HashSet;
        //  8124: astore          20
        //  8126: iload           12
        //  8128: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8131: astore_3       
        //  8132: aload           20
        //  8134: aload_3        
        //  8135: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //  8138: ifeq            8164
        //  8141: aload           27
        //  8143: getfield        u5/w.f:Ljava/lang/Object;
        //  8146: checkcast       Lre/h4;
        //  8149: invokevirtual   re/h4.f:()Lre/c3;
        //  8152: invokevirtual   re/c3.E:()Lre/a3;
        //  8155: aload_3        
        //  8156: aload           32
        //  8158: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  8161: goto            8094
        //  8164: aload           24
        //  8166: aload_3        
        //  8167: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  8172: checkcast       Ljava/util/List;
        //  8175: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  8180: astore          34
        //  8182: iconst_1       
        //  8183: istore          9
        //  8185: aload           19
        //  8187: astore          20
        //  8189: aload           18
        //  8191: astore_3       
        //  8192: aload           14
        //  8194: astore          19
        //  8196: aload           24
        //  8198: astore          14
        //  8200: aload           5
        //  8202: astore          18
        //  8204: aload           34
        //  8206: invokeinterface java/util/Iterator.hasNext:()Z
        //  8211: ifeq            8376
        //  8214: aload           34
        //  8216: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  8221: checkcast       Lke/b2;
        //  8224: astore          38
        //  8226: new             Lre/v7;
        //  8229: astore          37
        //  8231: aload           37
        //  8233: aload           27
        //  8235: aload           27
        //  8237: getfield        re/b.i:Ljava/lang/String;
        //  8240: iload           12
        //  8242: aload           38
        //  8244: invokespecial   re/v7.<init>:(Lre/b;Ljava/lang/String;ILke/b2;)V
        //  8247: aload           27
        //  8249: getfield        re/b.l:Ljava/lang/Long;
        //  8252: astore          5
        //  8254: aload           27
        //  8256: getfield        re/b.m:Ljava/lang/Long;
        //  8259: astore          24
        //  8261: aload           38
        //  8263: invokevirtual   ke/b2.s:()I
        //  8266: istore          10
        //  8268: aload           27
        //  8270: getfield        re/b.k:Lj0/b;
        //  8273: iload           12
        //  8275: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8278: aconst_null    
        //  8279: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  8282: checkcast       Lre/t7;
        //  8285: astore          38
        //  8287: aload           38
        //  8289: ifnonnull       8298
        //  8292: iconst_0       
        //  8293: istore          9
        //  8295: goto            8310
        //  8298: aload           38
        //  8300: getfield        re/t7.d:Ljava/util/BitSet;
        //  8303: iload           10
        //  8305: invokevirtual   java/util/BitSet.get:(I)Z
        //  8308: istore          9
        //  8310: iload           12
        //  8312: istore          10
        //  8314: aload           37
        //  8316: aload           5
        //  8318: aload           24
        //  8320: aload           18
        //  8322: lload_1        
        //  8323: aload           31
        //  8325: iload           9
        //  8327: invokevirtual   re/v7.g:(Ljava/lang/Long;Ljava/lang/Long;Lke/e3;JLre/p;Z)Z
        //  8330: istore          9
        //  8332: iload           9
        //  8334: ifeq            8359
        //  8337: aload           27
        //  8339: iload           10
        //  8341: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8344: invokevirtual   re/b.C:(Ljava/lang/Integer;)Lre/t7;
        //  8347: aload           37
        //  8349: invokevirtual   re/t7.b:(Lre/w7;)V
        //  8352: iload           10
        //  8354: istore          12
        //  8356: goto            8204
        //  8359: aload           27
        //  8361: getfield        re/b.j:Ljava/util/HashSet;
        //  8364: iload           10
        //  8366: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8369: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  8372: pop            
        //  8373: goto            8376
        //  8376: iload           9
        //  8378: ifne            8395
        //  8381: aload           27
        //  8383: getfield        re/b.j:Ljava/util/HashSet;
        //  8386: iload           12
        //  8388: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8391: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  8394: pop            
        //  8395: aload           18
        //  8397: astore          5
        //  8399: aload           14
        //  8401: astore          24
        //  8403: aload           19
        //  8405: astore          14
        //  8407: aload_3        
        //  8408: astore          18
        //  8410: aload           20
        //  8412: astore          19
        //  8414: goto            8094
        //  8417: aload           17
        //  8419: astore          37
        //  8421: aload           14
        //  8423: astore          5
        //  8425: goto            7043
        //  8428: aload           28
        //  8430: invokeinterface java/util/List.isEmpty:()Z
        //  8435: ifeq            8441
        //  8438: goto            9597
        //  8441: new             Lj0/b;
        //  8444: astore          19
        //  8446: aload           19
        //  8448: invokespecial   j0/b.<init>:()V
        //  8451: aload           28
        //  8453: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  8458: astore          6
        //  8460: aload           14
        //  8462: astore          17
        //  8464: aload           6
        //  8466: invokeinterface java/util/Iterator.hasNext:()Z
        //  8471: istore          9
        //  8473: iload           9
        //  8475: ifeq            9597
        //  8478: aload           6
        //  8480: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  8485: checkcast       Lke/x3;
        //  8488: astore          34
        //  8490: aload           34
        //  8492: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //  8495: astore          35
        //  8497: aload           19
        //  8499: aload           35
        //  8501: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  8504: checkcast       Ljava/util/Map;
        //  8507: astore          20
        //  8509: aload           20
        //  8511: ifnonnull       9042
        //  8514: aload           27
        //  8516: getfield        re/a7.g:Lre/g7;
        //  8519: invokevirtual   re/g7.L:()Lre/j;
        //  8522: astore          37
        //  8524: aload           27
        //  8526: getfield        re/b.i:Ljava/lang/String;
        //  8529: astore          36
        //  8531: aload           37
        //  8533: invokevirtual   re/b7.z:()V
        //  8536: aload           37
        //  8538: invokevirtual   u5/w.y:()V
        //  8541: aload           36
        //  8543: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  8546: aload           35
        //  8548: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  8551: new             Lj0/b;
        //  8554: astore          31
        //  8556: aload           31
        //  8558: invokespecial   j0/b.<init>:()V
        //  8561: aload           37
        //  8563: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  8566: astore          14
        //  8568: aload           14
        //  8570: ldc_w           "property_filters"
        //  8573: iconst_2       
        //  8574: anewarray       Ljava/lang/String;
        //  8577: dup            
        //  8578: iconst_0       
        //  8579: aload           24
        //  8581: aastore        
        //  8582: dup            
        //  8583: iconst_1       
        //  8584: aload           18
        //  8586: aastore        
        //  8587: ldc_w           "app_id=? AND property_name=?"
        //  8590: iconst_2       
        //  8591: anewarray       Ljava/lang/String;
        //  8594: dup            
        //  8595: iconst_0       
        //  8596: aload           36
        //  8598: aastore        
        //  8599: dup            
        //  8600: iconst_1       
        //  8601: aload           35
        //  8603: aastore        
        //  8604: aconst_null    
        //  8605: aconst_null    
        //  8606: aconst_null    
        //  8607: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //  8610: astore_3       
        //  8611: aload           6
        //  8613: astore          14
        //  8615: aload_3        
        //  8616: astore          20
        //  8618: aload_3        
        //  8619: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  8624: ifeq            8860
        //  8627: aload           6
        //  8629: astore          14
        //  8631: aload_3        
        //  8632: astore          20
        //  8634: aload_3        
        //  8635: iconst_1       
        //  8636: invokeinterface android/database/Cursor.getBlob:(I)[B
        //  8641: astore          30
        //  8643: aload           6
        //  8645: astore          14
        //  8647: aload_3        
        //  8648: astore          20
        //  8650: invokestatic    ke/i2.t:()Lke/h2;
        //  8653: aload           30
        //  8655: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //  8658: checkcast       Lke/h2;
        //  8661: invokevirtual   ke/z5.j:()Lke/c6;
        //  8664: checkcast       Lke/i2;
        //  8667: astore          28
        //  8669: aload           6
        //  8671: astore          14
        //  8673: aload_3        
        //  8674: astore          20
        //  8676: aload_3        
        //  8677: iconst_0       
        //  8678: invokeinterface android/database/Cursor.getInt:(I)I
        //  8683: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  8686: astore          38
        //  8688: aload           6
        //  8690: astore          14
        //  8692: aload_3        
        //  8693: astore          20
        //  8695: aload           31
        //  8697: aload           38
        //  8699: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  8702: checkcast       Ljava/util/List;
        //  8705: astore          32
        //  8707: aload           32
        //  8709: astore          30
        //  8711: aload           32
        //  8713: ifnonnull       8757
        //  8716: aload           6
        //  8718: astore          14
        //  8720: aload_3        
        //  8721: astore          20
        //  8723: new             Ljava/util/ArrayList;
        //  8726: astore          30
        //  8728: aload           6
        //  8730: astore          14
        //  8732: aload_3        
        //  8733: astore          20
        //  8735: aload           30
        //  8737: invokespecial   java/util/ArrayList.<init>:()V
        //  8740: aload           6
        //  8742: astore          14
        //  8744: aload_3        
        //  8745: astore          20
        //  8747: aload           31
        //  8749: aload           38
        //  8751: aload           30
        //  8753: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  8756: pop            
        //  8757: aload           6
        //  8759: astore          14
        //  8761: aload_3        
        //  8762: astore          20
        //  8764: aload           30
        //  8766: aload           28
        //  8768: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  8773: pop            
        //  8774: goto            8824
        //  8777: astore          30
        //  8779: aload           6
        //  8781: astore          14
        //  8783: aload_3        
        //  8784: astore          20
        //  8786: aload           37
        //  8788: getfield        u5/w.f:Ljava/lang/Object;
        //  8791: checkcast       Lre/h4;
        //  8794: invokevirtual   re/h4.f:()Lre/c3;
        //  8797: invokevirtual   re/c3.D:()Lre/a3;
        //  8800: astore          32
        //  8802: aload           6
        //  8804: astore          14
        //  8806: aload_3        
        //  8807: astore          20
        //  8809: aload           32
        //  8811: aload           36
        //  8813: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  8816: ldc_w           "Failed to merge filter"
        //  8819: aload           30
        //  8821: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  8824: aload           6
        //  8826: astore          14
        //  8828: aload_3        
        //  8829: astore          20
        //  8831: aload_3        
        //  8832: invokeinterface android/database/Cursor.moveToNext:()Z
        //  8837: istore          9
        //  8839: iload           9
        //  8841: ifne            8857
        //  8844: aload_3        
        //  8845: invokeinterface android/database/Cursor.close:()V
        //  8850: aload           31
        //  8852: astore          14
        //  8854: goto            9001
        //  8857: goto            8627
        //  8860: aload           6
        //  8862: astore          14
        //  8864: aload_3        
        //  8865: astore          20
        //  8867: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  8870: astore          30
        //  8872: aload           30
        //  8874: astore          14
        //  8876: aload_3        
        //  8877: astore          20
        //  8879: aload           6
        //  8881: astore_3       
        //  8882: goto            8983
        //  8885: astore          6
        //  8887: aload           6
        //  8889: astore          30
        //  8891: aload_3        
        //  8892: astore          6
        //  8894: goto            8921
        //  8897: astore          6
        //  8899: goto            8887
        //  8902: astore          6
        //  8904: aconst_null    
        //  8905: astore          14
        //  8907: goto            9027
        //  8910: astore          30
        //  8912: aconst_null    
        //  8913: astore_3       
        //  8914: aload           6
        //  8916: astore          14
        //  8918: aload_3        
        //  8919: astore          6
        //  8921: aload           6
        //  8923: astore          20
        //  8925: aload           37
        //  8927: getfield        u5/w.f:Ljava/lang/Object;
        //  8930: checkcast       Lre/h4;
        //  8933: invokevirtual   re/h4.f:()Lre/c3;
        //  8936: invokevirtual   re/c3.D:()Lre/a3;
        //  8939: aload           36
        //  8941: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  8944: aload           17
        //  8946: aload           30
        //  8948: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  8951: aload           6
        //  8953: astore          20
        //  8955: invokestatic    java/util/Collections.emptyMap:()Ljava/util/Map;
        //  8958: astore          30
        //  8960: aload           30
        //  8962: astore          20
        //  8964: aload           14
        //  8966: astore_3       
        //  8967: aload           6
        //  8969: ifnull          8994
        //  8972: aload           14
        //  8974: astore_3       
        //  8975: aload           6
        //  8977: astore          20
        //  8979: aload           30
        //  8981: astore          14
        //  8983: aload           20
        //  8985: invokeinterface android/database/Cursor.close:()V
        //  8990: aload           14
        //  8992: astore          20
        //  8994: aload           20
        //  8996: astore          14
        //  8998: aload_3        
        //  8999: astore          6
        //  9001: aload           19
        //  9003: aload           35
        //  9005: aload           14
        //  9007: invokevirtual   j0/i.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  9010: pop            
        //  9011: aload           14
        //  9013: astore          20
        //  9015: aload           6
        //  9017: astore_3       
        //  9018: goto            9045
        //  9021: astore          6
        //  9023: aload           20
        //  9025: astore          14
        //  9027: aload           14
        //  9029: ifnull          9039
        //  9032: aload           14
        //  9034: invokeinterface android/database/Cursor.close:()V
        //  9039: aload           6
        //  9041: athrow         
        //  9042: aload           6
        //  9044: astore_3       
        //  9045: aload           20
        //  9047: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //  9052: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //  9057: astore          6
        //  9059: aload           17
        //  9061: astore          14
        //  9063: aload           6
        //  9065: astore          17
        //  9067: aload           19
        //  9069: astore          6
        //  9071: aload           17
        //  9073: invokeinterface java/util/Iterator.hasNext:()Z
        //  9078: ifeq            9578
        //  9081: aload           17
        //  9083: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  9088: checkcast       Ljava/lang/Integer;
        //  9091: invokevirtual   java/lang/Integer.intValue:()I
        //  9094: istore          10
        //  9096: aload           27
        //  9098: getfield        re/b.j:Ljava/util/HashSet;
        //  9101: astore          19
        //  9103: iload           10
        //  9105: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9108: astore          30
        //  9110: aload           19
        //  9112: aload           30
        //  9114: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //  9117: ifeq            9144
        //  9120: aload           27
        //  9122: getfield        u5/w.f:Ljava/lang/Object;
        //  9125: checkcast       Lre/h4;
        //  9128: invokevirtual   re/h4.f:()Lre/c3;
        //  9131: invokevirtual   re/c3.E:()Lre/a3;
        //  9134: aload           30
        //  9136: aload           5
        //  9138: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  9141: goto            9578
        //  9144: aload           20
        //  9146: aload           30
        //  9148: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  9153: checkcast       Ljava/util/List;
        //  9156: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  9161: astore          30
        //  9163: iconst_1       
        //  9164: istore          9
        //  9166: aload           17
        //  9168: astore          19
        //  9170: aload           30
        //  9172: invokeinterface java/util/Iterator.hasNext:()Z
        //  9177: ifeq            9552
        //  9180: aload           30
        //  9182: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  9187: checkcast       Lke/i2;
        //  9190: astore          31
        //  9192: aload           27
        //  9194: getfield        u5/w.f:Ljava/lang/Object;
        //  9197: checkcast       Lre/h4;
        //  9200: invokevirtual   re/h4.f:()Lre/c3;
        //  9203: invokevirtual   re/c3.K:()Ljava/lang/String;
        //  9206: iconst_2       
        //  9207: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  9210: ifeq            9323
        //  9213: aload           27
        //  9215: getfield        u5/w.f:Ljava/lang/Object;
        //  9218: checkcast       Lre/h4;
        //  9221: invokevirtual   re/h4.f:()Lre/c3;
        //  9224: invokevirtual   re/c3.E:()Lre/a3;
        //  9227: astore          32
        //  9229: aload           31
        //  9231: invokevirtual   ke/i2.A:()Z
        //  9234: ifeq            9250
        //  9237: aload           31
        //  9239: invokevirtual   ke/i2.r:()I
        //  9242: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9245: astore          17
        //  9247: goto            9253
        //  9250: aconst_null    
        //  9251: astore          17
        //  9253: aload           32
        //  9255: iload           10
        //  9257: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9260: ldc_w           "Evaluating filter. audience, filter, property"
        //  9263: aload           17
        //  9265: aload           27
        //  9267: getfield        u5/w.f:Ljava/lang/Object;
        //  9270: checkcast       Lre/h4;
        //  9273: invokevirtual   re/h4.r:()Lre/x2;
        //  9276: aload           31
        //  9278: invokevirtual   ke/i2.v:()Ljava/lang/String;
        //  9281: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //  9284: invokevirtual   re/a3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  9287: aload           27
        //  9289: getfield        u5/w.f:Ljava/lang/Object;
        //  9292: checkcast       Lre/h4;
        //  9295: invokevirtual   re/h4.f:()Lre/c3;
        //  9298: invokevirtual   re/c3.E:()Lre/a3;
        //  9301: aload           27
        //  9303: getfield        re/a7.g:Lre/g7;
        //  9306: invokevirtual   re/g7.O:()Lre/i7;
        //  9309: aload           31
        //  9311: invokevirtual   re/i7.T:(Lke/i2;)Ljava/lang/String;
        //  9314: ldc_w           "Filter definition"
        //  9317: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  9320: goto            9323
        //  9323: aload           31
        //  9325: invokevirtual   ke/i2.A:()Z
        //  9328: ifeq            9484
        //  9331: aload           31
        //  9333: invokevirtual   ke/i2.r:()I
        //  9336: sipush          256
        //  9339: if_icmple       9345
        //  9342: goto            9484
        //  9345: new             Lre/x7;
        //  9348: astore          32
        //  9350: aload           32
        //  9352: aload           27
        //  9354: aload           27
        //  9356: getfield        re/b.i:Ljava/lang/String;
        //  9359: iload           10
        //  9361: aload           31
        //  9363: invokespecial   re/x7.<init>:(Lre/b;Ljava/lang/String;ILke/i2;)V
        //  9366: aload           27
        //  9368: getfield        re/b.l:Ljava/lang/Long;
        //  9371: astore          17
        //  9373: aload           27
        //  9375: getfield        re/b.m:Ljava/lang/Long;
        //  9378: astore          35
        //  9380: aload           31
        //  9382: invokevirtual   ke/i2.r:()I
        //  9385: istore          12
        //  9387: aload           27
        //  9389: getfield        re/b.k:Lj0/b;
        //  9392: iload           10
        //  9394: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9397: aconst_null    
        //  9398: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  9401: checkcast       Lre/t7;
        //  9404: astore          31
        //  9406: aload           31
        //  9408: ifnonnull       9417
        //  9411: iconst_0       
        //  9412: istore          9
        //  9414: goto            9429
        //  9417: aload           31
        //  9419: getfield        re/t7.d:Ljava/util/BitSet;
        //  9422: iload           12
        //  9424: invokevirtual   java/util/BitSet.get:(I)Z
        //  9427: istore          9
        //  9429: aload           32
        //  9431: aload           17
        //  9433: aload           35
        //  9435: aload           34
        //  9437: iload           9
        //  9439: invokevirtual   re/x7.g:(Ljava/lang/Long;Ljava/lang/Long;Lke/x3;Z)Z
        //  9442: istore          9
        //  9444: iload           9
        //  9446: ifeq            9467
        //  9449: aload           27
        //  9451: iload           10
        //  9453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9456: invokevirtual   re/b.C:(Ljava/lang/Integer;)Lre/t7;
        //  9459: aload           32
        //  9461: invokevirtual   re/t7.b:(Lre/w7;)V
        //  9464: goto            9170
        //  9467: aload           27
        //  9469: getfield        re/b.j:Ljava/util/HashSet;
        //  9472: iload           10
        //  9474: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9477: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  9480: pop            
        //  9481: goto            9552
        //  9484: aload           27
        //  9486: getfield        u5/w.f:Ljava/lang/Object;
        //  9489: checkcast       Lre/h4;
        //  9492: invokevirtual   re/h4.f:()Lre/c3;
        //  9495: invokevirtual   re/c3.F:()Lre/a3;
        //  9498: astore          30
        //  9500: aload           27
        //  9502: getfield        re/b.i:Ljava/lang/String;
        //  9505: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  9508: astore          32
        //  9510: aload           31
        //  9512: invokevirtual   ke/i2.A:()Z
        //  9515: ifeq            9531
        //  9518: aload           31
        //  9520: invokevirtual   ke/i2.r:()I
        //  9523: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9526: astore          17
        //  9528: goto            9534
        //  9531: aconst_null    
        //  9532: astore          17
        //  9534: aload           30
        //  9536: aload           32
        //  9538: ldc_w           "Invalid property filter ID. appId, id"
        //  9541: aload           17
        //  9543: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  9546: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  9549: goto            9557
        //  9552: iload           9
        //  9554: ifne            9571
        //  9557: aload           27
        //  9559: getfield        re/b.j:Ljava/util/HashSet;
        //  9562: iload           10
        //  9564: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9567: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  9570: pop            
        //  9571: aload           19
        //  9573: astore          17
        //  9575: goto            9071
        //  9578: aload           6
        //  9580: astore          19
        //  9582: aload_3        
        //  9583: astore          6
        //  9585: aload           14
        //  9587: astore          17
        //  9589: goto            8464
        //  9592: astore          6
        //  9594: goto            9940
        //  9597: new             Ljava/util/ArrayList;
        //  9600: astore          14
        //  9602: aload           14
        //  9604: invokespecial   java/util/ArrayList.<init>:()V
        //  9607: aload           27
        //  9609: getfield        re/b.k:Lj0/b;
        //  9612: invokevirtual   j0/b.keySet:()Ljava/util/Set;
        //  9615: astore          19
        //  9617: aload           27
        //  9619: getfield        re/b.j:Ljava/util/HashSet;
        //  9622: astore          6
        //  9624: aload           19
        //  9626: checkcast       Lj0/h$c;
        //  9629: astore          19
        //  9631: aload           19
        //  9633: aload           6
        //  9635: invokevirtual   j0/h$c.removeAll:(Ljava/util/Collection;)Z
        //  9638: pop            
        //  9639: aload           19
        //  9641: invokevirtual   j0/h$c.iterator:()Ljava/util/Iterator;
        //  9644: astore          17
        //  9646: aload           17
        //  9648: checkcast       Lj0/h$a;
        //  9651: astore          6
        //  9653: aload           6
        //  9655: invokevirtual   j0/h$a.hasNext:()Z
        //  9658: istore          9
        //  9660: ldc_w           "app_id"
        //  9663: astore          19
        //  9665: iload           9
        //  9667: ifeq            9902
        //  9670: aload           6
        //  9672: invokevirtual   j0/h$a.next:()Ljava/lang/Object;
        //  9675: checkcast       Ljava/lang/Integer;
        //  9678: invokevirtual   java/lang/Integer.intValue:()I
        //  9681: istore          12
        //  9683: aload           27
        //  9685: getfield        re/b.k:Lj0/b;
        //  9688: astore          19
        //  9690: iload           12
        //  9692: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  9695: astore          6
        //  9697: aload           19
        //  9699: aload           6
        //  9701: invokevirtual   j0/i.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  9704: checkcast       Lre/t7;
        //  9707: astore          19
        //  9709: aload           19
        //  9711: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //  9714: aload           19
        //  9716: iload           12
        //  9718: invokevirtual   re/t7.a:(I)Lke/a3;
        //  9721: astore_3       
        //  9722: aload           14
        //  9724: aload_3        
        //  9725: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  9728: pop            
        //  9729: aload           27
        //  9731: getfield        re/a7.g:Lre/g7;
        //  9734: invokevirtual   re/g7.L:()Lre/j;
        //  9737: astore          19
        //  9739: aload           27
        //  9741: getfield        re/b.i:Ljava/lang/String;
        //  9744: astore          5
        //  9746: aload_3        
        //  9747: invokevirtual   ke/a3.u:()Lke/t3;
        //  9750: astore_3       
        //  9751: aload           19
        //  9753: invokevirtual   re/b7.z:()V
        //  9756: aload           19
        //  9758: invokevirtual   u5/w.y:()V
        //  9761: aload           5
        //  9763: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //  9766: aload_3        
        //  9767: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        //  9770: aload_3        
        //  9771: invokevirtual   com/google/android/gms/internal/measurement/b.i:()[B
        //  9774: astore          20
        //  9776: new             Landroid/content/ContentValues;
        //  9779: astore_3       
        //  9780: aload_3        
        //  9781: invokespecial   android/content/ContentValues.<init>:()V
        //  9784: aload_3        
        //  9785: ldc_w           "app_id"
        //  9788: aload           5
        //  9790: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        //  9793: aload_3        
        //  9794: aload           24
        //  9796: aload           6
        //  9798: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        //  9801: aload_3        
        //  9802: aload           4
        //  9804: aload           20
        //  9806: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        //  9809: aload           19
        //  9811: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  9814: astore          6
        //  9816: aload           6
        //  9818: ldc_w           "audience_filter_values"
        //  9821: aconst_null    
        //  9822: aload_3        
        //  9823: iconst_5       
        //  9824: invokevirtual   android/database/sqlite/SQLiteDatabase.insertWithOnConflict:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
        //  9827: ldc2_w          -1
        //  9830: lcmp           
        //  9831: ifne            9899
        //  9834: aload           19
        //  9836: getfield        u5/w.f:Ljava/lang/Object;
        //  9839: checkcast       Lre/h4;
        //  9842: invokevirtual   re/h4.f:()Lre/c3;
        //  9845: invokevirtual   re/c3.D:()Lre/a3;
        //  9848: aload           5
        //  9850: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  9853: ldc_w           "Failed to insert filter results (got -1). appId"
        //  9856: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  9859: goto            9899
        //  9862: astore          6
        //  9864: goto            9872
        //  9867: astore          6
        //  9869: goto            9864
        //  9872: aload           19
        //  9874: getfield        u5/w.f:Ljava/lang/Object;
        //  9877: checkcast       Lre/h4;
        //  9880: invokevirtual   re/h4.f:()Lre/c3;
        //  9883: invokevirtual   re/c3.D:()Lre/a3;
        //  9886: aload           5
        //  9888: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  9891: ldc_w           "Error storing filter results. appId"
        //  9894: aload           6
        //  9896: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  9899: goto            9646
        //  9902: aload           8
        //  9904: astore          6
        //  9906: aload           6
        //  9908: getfield        ke/z5.h:Z
        //  9911: istore          9
        //  9913: iload           9
        //  9915: ifeq            9943
        //  9918: aload           6
        //  9920: invokevirtual   ke/z5.l:()V
        //  9923: aload           6
        //  9925: iconst_0       
        //  9926: putfield        ke/z5.h:Z
        //  9929: goto            9943
        //  9932: goto            9940
        //  9935: astore          6
        //  9937: goto            9932
        //  9940: goto            11391
        //  9943: aload           6
        //  9945: getfield        ke/z5.g:Lke/c6;
        //  9948: checkcast       Lke/o3;
        //  9951: aload           14
        //  9953: invokestatic    ke/o3.g0:(Lke/o3;Ljava/util/ArrayList;)V
        //  9956: aload_0        
        //  9957: invokevirtual   re/g7.J:()Lre/f;
        //  9960: aload           7
        //  9962: getfield        re/e7.a:Lke/o3;
        //  9965: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  9968: invokevirtual   re/f.K:(Ljava/lang/String;)Z
        //  9971: ifeq            11402
        //  9974: new             Ljava/util/HashMap;
        //  9977: astore_3       
        //  9978: aload_3        
        //  9979: invokespecial   java/util/HashMap.<init>:()V
        //  9982: new             Ljava/util/ArrayList;
        //  9985: astore          5
        //  9987: aload           5
        //  9989: invokespecial   java/util/ArrayList.<init>:()V
        //  9992: aload_0        
        //  9993: invokevirtual   re/g7.P:()Lre/n7;
        //  9996: invokevirtual   re/n7.H:()Ljava/security/SecureRandom;
        //  9999: astore          8
        // 10001: iconst_0       
        // 10002: istore          12
        // 10004: aload           6
        // 10006: getfield        ke/z5.g:Lke/c6;
        // 10009: astore          14
        // 10011: aload           14
        // 10013: checkcast       Lke/o3;
        // 10016: invokevirtual   ke/o3.k1:()I
        // 10019: istore          10
        // 10021: iload           12
        // 10023: iload           10
        // 10025: if_icmpge       11230
        // 10028: aload           6
        // 10030: getfield        ke/z5.g:Lke/c6;
        // 10033: astore          14
        // 10035: aload           14
        // 10037: checkcast       Lke/o3;
        // 10040: iload           12
        // 10042: invokevirtual   ke/o3.z1:(I)Lke/e3;
        // 10045: astore          14
        // 10047: aload           14
        // 10049: invokevirtual   ke/c6.o:()Lke/z5;
        // 10052: checkcast       Lke/d3;
        // 10055: astore          20
        // 10057: aload           20
        // 10059: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10062: ldc_w           "_ep"
        // 10065: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        // 10068: istore          9
        // 10070: iload           9
        // 10072: ifeq            10315
        // 10075: aload_0        
        // 10076: astore          17
        // 10078: aload           17
        // 10080: getfield        re/g7.l:Lre/i7;
        // 10083: invokestatic    re/g7.H:(Lre/b7;)V
        // 10086: aload           20
        // 10088: invokevirtual   ke/z5.j:()Lke/c6;
        // 10091: checkcast       Lke/e3;
        // 10094: ldc_w           "_en"
        // 10097: invokestatic    re/i7.D:(Lke/e3;Ljava/lang/String;)Ljava/io/Serializable;
        // 10100: checkcast       Ljava/lang/String;
        // 10103: astore          24
        // 10105: aload_3        
        // 10106: aload           24
        // 10108: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        // 10111: checkcast       Lre/p;
        // 10114: astore          4
        // 10116: aload           4
        // 10118: astore          14
        // 10120: aload           4
        // 10122: ifnonnull       10185
        // 10125: aload           17
        // 10127: getfield        re/g7.h:Lre/j;
        // 10130: astore          4
        // 10132: aload           4
        // 10134: invokestatic    re/g7.H:(Lre/b7;)V
        // 10137: aload           7
        // 10139: getfield        re/e7.a:Lke/o3;
        // 10142: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10145: astore          14
        // 10147: aload           24
        // 10149: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        // 10152: aload           4
        // 10154: aload           14
        // 10156: aload           24
        // 10158: invokevirtual   re/j.W:(Ljava/lang/String;Ljava/lang/String;)Lre/p;
        // 10161: astore          4
        // 10163: aload           4
        // 10165: astore          14
        // 10167: aload           4
        // 10169: ifnull          10185
        // 10172: aload_3        
        // 10173: aload           24
        // 10175: aload           4
        // 10177: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 10180: pop            
        // 10181: aload           4
        // 10183: astore          14
        // 10185: aload           14
        // 10187: ifnull          10295
        // 10190: aload           14
        // 10192: getfield        re/p.i:Ljava/lang/Long;
        // 10195: ifnonnull       10295
        // 10198: aload           14
        // 10200: getfield        re/p.j:Ljava/lang/Long;
        // 10203: astore          4
        // 10205: aload           4
        // 10207: ifnull          10241
        // 10210: aload           4
        // 10212: invokevirtual   java/lang/Long.longValue:()J
        // 10215: lconst_1       
        // 10216: lcmp           
        // 10217: ifle            10241
        // 10220: aload           17
        // 10222: getfield        re/g7.l:Lre/i7;
        // 10225: invokestatic    re/g7.H:(Lre/b7;)V
        // 10228: aload           20
        // 10230: ldc_w           "_sr"
        // 10233: aload           14
        // 10235: getfield        re/p.j:Ljava/lang/Long;
        // 10238: invokestatic    re/i7.b0:(Lke/d3;Ljava/lang/String;Ljava/lang/Long;)V
        // 10241: aload           14
        // 10243: getfield        re/p.k:Ljava/lang/Boolean;
        // 10246: astore          14
        // 10248: aload           14
        // 10250: ifnull          10281
        // 10253: aload           14
        // 10255: invokevirtual   java/lang/Boolean.booleanValue:()Z
        // 10258: ifeq            10281
        // 10261: aload           17
        // 10263: getfield        re/g7.l:Lre/i7;
        // 10266: invokestatic    re/g7.H:(Lre/b7;)V
        // 10269: aload           20
        // 10271: ldc_w           "_efs"
        // 10274: lconst_1       
        // 10275: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 10278: invokestatic    re/i7.b0:(Lke/d3;Ljava/lang/String;Ljava/lang/Long;)V
        // 10281: aload           5
        // 10283: aload           20
        // 10285: invokevirtual   ke/z5.j:()Lke/c6;
        // 10288: checkcast       Lke/e3;
        // 10291: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        // 10294: pop            
        // 10295: aload           6
        // 10297: iload           12
        // 10299: aload           20
        // 10301: invokevirtual   ke/n3.o:(ILke/d3;)V
        // 10304: goto            10888
        // 10307: astore          6
        // 10309: aload_0        
        // 10310: astore          14
        // 10312: goto            13036
        // 10315: aload_0        
        // 10316: astore          17
        // 10318: aload           17
        // 10320: getfield        re/g7.f:Lre/b4;
        // 10323: astore          14
        // 10325: aload           14
        // 10327: invokestatic    re/g7.H:(Lre/b7;)V
        // 10330: aload           7
        // 10332: getfield        re/e7.a:Lke/o3;
        // 10335: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10338: astore          4
        // 10340: aload           14
        // 10342: aload           4
        // 10344: ldc_w           "measurement.account.time_zone_offset_minutes"
        // 10347: invokevirtual   re/b4.j:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        // 10350: astore          24
        // 10352: aload           24
        // 10354: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        // 10357: istore          9
        // 10359: iload           9
        // 10361: ifne            10405
        // 10364: aload           24
        // 10366: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        // 10369: lstore_1       
        // 10370: goto            10407
        // 10373: astore          24
        // 10375: aload           14
        // 10377: getfield        u5/w.f:Ljava/lang/Object;
        // 10380: checkcast       Lre/h4;
        // 10383: invokevirtual   re/h4.f:()Lre/c3;
        // 10386: invokevirtual   re/c3.F:()Lre/a3;
        // 10389: aload           4
        // 10391: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 10394: ldc_w           "Unable to parse timezone offset. appId"
        // 10397: aload           24
        // 10399: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 10402: goto            10405
        // 10405: lconst_0       
        // 10406: lstore_1       
        // 10407: aload_0        
        // 10408: invokevirtual   re/g7.P:()Lre/n7;
        // 10411: astore          14
        // 10413: aload           20
        // 10415: invokevirtual   ke/d3.n:()J
        // 10418: lstore          25
        // 10420: aload           14
        // 10422: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        // 10425: pop            
        // 10426: lload_1        
        // 10427: ldc2_w          60000
        // 10430: lmul           
        // 10431: lstore_1       
        // 10432: lload           25
        // 10434: lload_1        
        // 10435: ladd           
        // 10436: ldc2_w          86400000
        // 10439: ldiv           
        // 10440: lstore          25
        // 10442: aload           20
        // 10444: invokevirtual   ke/z5.j:()Lke/c6;
        // 10447: checkcast       Lke/e3;
        // 10450: astore          14
        // 10452: ldc_w           "_dbg"
        // 10455: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        // 10458: istore          9
        // 10460: iload           9
        // 10462: ifne            10547
        // 10465: aload           14
        // 10467: invokevirtual   ke/e3.z:()Lke/h6;
        // 10470: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        // 10475: astore          14
        // 10477: aload           14
        // 10479: invokeinterface java/util/Iterator.hasNext:()Z
        // 10484: ifeq            10547
        // 10487: aload           14
        // 10489: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        // 10494: checkcast       Lke/i3;
        // 10497: astore          4
        // 10499: ldc_w           "_dbg"
        // 10502: aload           4
        // 10504: invokevirtual   ke/i3.x:()Ljava/lang/String;
        // 10507: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        // 10510: ifeq            10544
        // 10513: lconst_1       
        // 10514: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 10517: aload           4
        // 10519: invokevirtual   ke/i3.u:()J
        // 10522: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 10525: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        // 10528: istore          9
        // 10530: iload           9
        // 10532: ifne            10538
        // 10535: goto            10547
        // 10538: iconst_1       
        // 10539: istore          10
        // 10541: goto            10579
        // 10544: goto            10477
        // 10547: aload           17
        // 10549: getfield        re/g7.f:Lre/b4;
        // 10552: astore          14
        // 10554: aload           14
        // 10556: invokestatic    re/g7.H:(Lre/b7;)V
        // 10559: aload           14
        // 10561: aload           7
        // 10563: getfield        re/e7.a:Lke/o3;
        // 10566: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10569: aload           20
        // 10571: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10574: invokevirtual   re/b4.H:(Ljava/lang/String;Ljava/lang/String;)I
        // 10577: istore          10
        // 10579: iload           10
        // 10581: ifgt            10633
        // 10584: aload_0        
        // 10585: invokevirtual   re/g7.f:()Lre/c3;
        // 10588: invokevirtual   re/c3.F:()Lre/a3;
        // 10591: aload           20
        // 10593: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10596: ldc_w           "Sample rate must be positive. event, rate"
        // 10599: iload           10
        // 10601: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 10604: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 10607: aload           5
        // 10609: aload           20
        // 10611: invokevirtual   ke/z5.j:()Lke/c6;
        // 10614: checkcast       Lke/e3;
        // 10617: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        // 10620: pop            
        // 10621: aload           6
        // 10623: iload           12
        // 10625: aload           20
        // 10627: invokevirtual   ke/n3.o:(ILke/d3;)V
        // 10630: goto            10888
        // 10633: aload_3        
        // 10634: aload           20
        // 10636: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10639: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        // 10642: checkcast       Lre/p;
        // 10645: astore          14
        // 10647: aload           14
        // 10649: ifnonnull       10757
        // 10652: aload           17
        // 10654: getfield        re/g7.h:Lre/j;
        // 10657: astore          14
        // 10659: aload           14
        // 10661: invokestatic    re/g7.H:(Lre/b7;)V
        // 10664: aload           14
        // 10666: aload           7
        // 10668: getfield        re/e7.a:Lke/o3;
        // 10671: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10674: aload           20
        // 10676: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10679: invokevirtual   re/j.W:(Ljava/lang/String;Ljava/lang/String;)Lre/p;
        // 10682: astore          14
        // 10684: aload           14
        // 10686: ifnonnull       10754
        // 10689: aload_0        
        // 10690: invokevirtual   re/g7.f:()Lre/c3;
        // 10693: invokevirtual   re/c3.F:()Lre/a3;
        // 10696: aload           7
        // 10698: getfield        re/e7.a:Lke/o3;
        // 10701: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10704: ldc_w           "Event being bundled has no eventAggregate. appId, eventName"
        // 10707: aload           20
        // 10709: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10712: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 10715: new             Lre/p;
        // 10718: astore          14
        // 10720: aload           14
        // 10722: aload           7
        // 10724: getfield        re/e7.a:Lke/o3;
        // 10727: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 10730: aload           20
        // 10732: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10735: lconst_1       
        // 10736: lconst_1       
        // 10737: lconst_1       
        // 10738: aload           20
        // 10740: invokevirtual   ke/d3.n:()J
        // 10743: lconst_0       
        // 10744: aconst_null    
        // 10745: aconst_null    
        // 10746: aconst_null    
        // 10747: aconst_null    
        // 10748: invokespecial   re/p.<init>:(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
        // 10751: goto            10757
        // 10754: goto            10757
        // 10757: aload           17
        // 10759: getfield        re/g7.l:Lre/i7;
        // 10762: invokestatic    re/g7.H:(Lre/b7;)V
        // 10765: aload           20
        // 10767: invokevirtual   ke/z5.j:()Lke/c6;
        // 10770: checkcast       Lke/e3;
        // 10773: ldc_w           "_eid"
        // 10776: invokestatic    re/i7.D:(Lke/e3;Ljava/lang/String;)Ljava/io/Serializable;
        // 10779: checkcast       Ljava/lang/Long;
        // 10782: astore          24
        // 10784: aload           24
        // 10786: ifnull          10795
        // 10789: iconst_1       
        // 10790: istore          9
        // 10792: goto            10798
        // 10795: iconst_0       
        // 10796: istore          9
        // 10798: iload           9
        // 10800: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        // 10803: astore          4
        // 10805: iload           10
        // 10807: iconst_1       
        // 10808: if_icmpne       10891
        // 10811: aload           5
        // 10813: aload           20
        // 10815: invokevirtual   ke/z5.j:()Lke/c6;
        // 10818: checkcast       Lke/e3;
        // 10821: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        // 10824: pop            
        // 10825: aload           4
        // 10827: invokevirtual   java/lang/Boolean.booleanValue:()Z
        // 10830: ifeq            10879
        // 10833: aload           14
        // 10835: getfield        re/p.i:Ljava/lang/Long;
        // 10838: ifnonnull       10857
        // 10841: aload           14
        // 10843: getfield        re/p.j:Ljava/lang/Long;
        // 10846: ifnonnull       10857
        // 10849: aload           14
        // 10851: getfield        re/p.k:Ljava/lang/Boolean;
        // 10854: ifnull          10879
        // 10857: aload           14
        // 10859: aconst_null    
        // 10860: aconst_null    
        // 10861: aconst_null    
        // 10862: invokevirtual   re/p.a:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lre/p;
        // 10865: astore          14
        // 10867: aload_3        
        // 10868: aload           20
        // 10870: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10873: aload           14
        // 10875: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 10878: pop            
        // 10879: aload           6
        // 10881: iload           12
        // 10883: aload           20
        // 10885: invokevirtual   ke/n3.o:(ILke/d3;)V
        // 10888: goto            11195
        // 10891: aload           8
        // 10893: iload           10
        // 10895: invokevirtual   java/util/Random.nextInt:(I)I
        // 10898: istore          13
        // 10900: iload           13
        // 10902: ifne            10993
        // 10905: aload           17
        // 10907: getfield        re/g7.l:Lre/i7;
        // 10910: invokestatic    re/g7.H:(Lre/b7;)V
        // 10913: iload           10
        // 10915: i2l            
        // 10916: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 10919: astore          24
        // 10921: aload           20
        // 10923: ldc_w           "_sr"
        // 10926: aload           24
        // 10928: invokestatic    re/i7.b0:(Lke/d3;Ljava/lang/String;Ljava/lang/Long;)V
        // 10931: aload           5
        // 10933: aload           20
        // 10935: invokevirtual   ke/z5.j:()Lke/c6;
        // 10938: checkcast       Lke/e3;
        // 10941: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        // 10944: pop            
        // 10945: aload           14
        // 10947: astore          17
        // 10949: aload           4
        // 10951: invokevirtual   java/lang/Boolean.booleanValue:()Z
        // 10954: ifeq            10968
        // 10957: aload           14
        // 10959: aconst_null    
        // 10960: aload           24
        // 10962: aconst_null    
        // 10963: invokevirtual   re/p.a:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lre/p;
        // 10966: astore          17
        // 10968: aload_3        
        // 10969: aload           20
        // 10971: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 10974: aload           17
        // 10976: aload           20
        // 10978: invokevirtual   ke/d3.n:()J
        // 10981: lload           25
        // 10983: invokevirtual   re/p.b:(JJ)Lre/p;
        // 10986: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 10989: pop            
        // 10990: goto            11186
        // 10993: aload           14
        // 10995: getfield        re/p.h:Ljava/lang/Long;
        // 10998: astore          30
        // 11000: aload           30
        // 11002: ifnull          11014
        // 11005: aload           30
        // 11007: invokevirtual   java/lang/Long.longValue:()J
        // 11010: lstore_1       
        // 11011: goto            11042
        // 11014: aload_0        
        // 11015: invokevirtual   re/g7.P:()Lre/n7;
        // 11018: astore          30
        // 11020: aload           20
        // 11022: invokevirtual   ke/d3.m:()J
        // 11025: lstore          47
        // 11027: aload           30
        // 11029: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        // 11032: pop            
        // 11033: lload_1        
        // 11034: lload           47
        // 11036: ladd           
        // 11037: ldc2_w          86400000
        // 11040: ldiv           
        // 11041: lstore_1       
        // 11042: lload_1        
        // 11043: lload           25
        // 11045: lcmp           
        // 11046: ifeq            11159
        // 11049: aload           17
        // 11051: getfield        re/g7.l:Lre/i7;
        // 11054: invokestatic    re/g7.H:(Lre/b7;)V
        // 11057: aload           20
        // 11059: ldc_w           "_efs"
        // 11062: lconst_1       
        // 11063: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 11066: invokestatic    re/i7.b0:(Lke/d3;Ljava/lang/String;Ljava/lang/Long;)V
        // 11069: aload           17
        // 11071: getfield        re/g7.l:Lre/i7;
        // 11074: invokestatic    re/g7.H:(Lre/b7;)V
        // 11077: iload           10
        // 11079: i2l            
        // 11080: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 11083: astore          24
        // 11085: aload           20
        // 11087: ldc_w           "_sr"
        // 11090: aload           24
        // 11092: invokestatic    re/i7.b0:(Lke/d3;Ljava/lang/String;Ljava/lang/Long;)V
        // 11095: aload           5
        // 11097: aload           20
        // 11099: invokevirtual   ke/z5.j:()Lke/c6;
        // 11102: checkcast       Lke/e3;
        // 11105: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        // 11108: pop            
        // 11109: aload           14
        // 11111: astore          17
        // 11113: aload           4
        // 11115: invokevirtual   java/lang/Boolean.booleanValue:()Z
        // 11118: ifeq            11134
        // 11121: aload           14
        // 11123: aconst_null    
        // 11124: aload           24
        // 11126: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        // 11129: invokevirtual   re/p.a:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lre/p;
        // 11132: astore          17
        // 11134: aload_3        
        // 11135: aload           20
        // 11137: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 11140: aload           17
        // 11142: aload           20
        // 11144: invokevirtual   ke/d3.n:()J
        // 11147: lload           25
        // 11149: invokevirtual   re/p.b:(JJ)Lre/p;
        // 11152: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 11155: pop            
        // 11156: goto            11186
        // 11159: aload           4
        // 11161: invokevirtual   java/lang/Boolean.booleanValue:()Z
        // 11164: ifeq            11186
        // 11167: aload_3        
        // 11168: aload           20
        // 11170: invokevirtual   ke/d3.t:()Ljava/lang/String;
        // 11173: aload           14
        // 11175: aload           24
        // 11177: aconst_null    
        // 11178: aconst_null    
        // 11179: invokevirtual   re/p.a:(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lre/p;
        // 11182: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        // 11185: pop            
        // 11186: aload           6
        // 11188: iload           12
        // 11190: aload           20
        // 11192: invokevirtual   ke/n3.o:(ILke/d3;)V
        // 11195: iinc            12, 1
        // 11198: goto            10004
        // 11201: astore          6
        // 11203: goto            11224
        // 11206: astore          6
        // 11208: goto            11224
        // 11211: goto            11219
        // 11214: astore          6
        // 11216: goto            11211
        // 11219: goto            11224
        // 11222: astore          6
        // 11224: aload_0        
        // 11225: astore          14
        // 11227: goto            13036
        // 11230: aload           18
        // 11232: astore          14
        // 11234: aload           19
        // 11236: astore          18
        // 11238: aload           5
        // 11240: invokevirtual   java/util/ArrayList.size:()I
        // 11243: istore          10
        // 11245: aload           6
        // 11247: getfield        ke/z5.g:Lke/c6;
        // 11250: astore          19
        // 11252: aload           19
        // 11254: checkcast       Lke/o3;
        // 11257: invokevirtual   ke/o3.k1:()I
        // 11260: istore          12
        // 11262: iload           10
        // 11264: iload           12
        // 11266: if_icmpge       11318
        // 11269: aload           6
        // 11271: getfield        ke/z5.h:Z
        // 11274: istore          9
        // 11276: iload           9
        // 11278: ifeq            11292
        // 11281: aload           6
        // 11283: invokevirtual   ke/z5.l:()V
        // 11286: aload           6
        // 11288: iconst_0       
        // 11289: putfield        ke/z5.h:Z
        // 11292: aload           6
        // 11294: getfield        ke/z5.g:Lke/c6;
        // 11297: checkcast       Lke/o3;
        // 11300: invokestatic    ke/o3.u0:(Lke/o3;)V
        // 11303: aload           6
        // 11305: aload           5
        // 11307: invokevirtual   ke/n3.t:(Ljava/util/ArrayList;)V
        // 11310: goto            11318
        // 11313: astore          6
        // 11315: goto            11219
        // 11318: aload_3        
        // 11319: invokevirtual   java/util/HashMap.entrySet:()Ljava/util/Set;
        // 11322: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        // 11327: astore          17
        // 11329: aload           17
        // 11331: invokeinterface java/util/Iterator.hasNext:()Z
        // 11336: ifeq            11380
        // 11339: aload           17
        // 11341: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        // 11346: checkcast       Ljava/util/Map$Entry;
        // 11349: astore          19
        // 11351: aload_0        
        // 11352: getfield        re/g7.h:Lre/j;
        // 11355: astore          8
        // 11357: aload           8
        // 11359: invokestatic    re/g7.H:(Lre/b7;)V
        // 11362: aload           8
        // 11364: aload           19
        // 11366: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        // 11371: checkcast       Lre/p;
        // 11374: invokevirtual   re/j.F:(Lre/p;)V
        // 11377: goto            11329
        // 11380: goto            11411
        // 11383: goto            11391
        // 11386: astore          6
        // 11388: goto            11383
        // 11391: aload_0        
        // 11392: astore          14
        // 11394: goto            13036
        // 11397: astore          6
        // 11399: goto            11383
        // 11402: aload           18
        // 11404: astore          14
        // 11406: ldc_w           "app_id"
        // 11409: astore          18
        // 11411: aload_0        
        // 11412: astore          19
        // 11414: aload           7
        // 11416: getfield        re/e7.a:Lke/o3;
        // 11419: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 11422: astore          8
        // 11424: aload           19
        // 11426: getfield        re/g7.h:Lre/j;
        // 11429: astore          17
        // 11431: aload           17
        // 11433: invokestatic    re/g7.H:(Lre/b7;)V
        // 11436: aload           17
        // 11438: aload           8
        // 11440: invokevirtual   re/j.S:(Ljava/lang/String;)Lre/v4;
        // 11443: astore          17
        // 11445: aload           17
        // 11447: ifnonnull       11477
        // 11450: aload_0        
        // 11451: invokevirtual   re/g7.f:()Lre/c3;
        // 11454: invokevirtual   re/c3.D:()Lre/a3;
        // 11457: aload           7
        // 11459: getfield        re/e7.a:Lke/o3;
        // 11462: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 11465: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 11468: ldc_w           "Bundling raw events w/o app info. appId"
        // 11471: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        // 11474: goto            11926
        // 11477: aload           6
        // 11479: getfield        ke/z5.g:Lke/c6;
        // 11482: astore          4
        // 11484: aload           4
        // 11486: checkcast       Lke/o3;
        // 11489: invokevirtual   ke/o3.k1:()I
        // 11492: istore          12
        // 11494: iload           12
        // 11496: ifle            11926
        // 11499: aload           17
        // 11501: getfield        re/v4.a:Lre/h4;
        // 11504: astore          4
        // 11506: aload           4
        // 11508: invokevirtual   re/h4.a:()Lre/g4;
        // 11511: invokevirtual   re/g4.y:()V
        // 11514: aload           17
        // 11516: getfield        re/v4.i:J
        // 11519: lstore          25
        // 11521: lload           25
        // 11523: lconst_0       
        // 11524: lcmp           
        // 11525: ifeq            11572
        // 11528: aload           6
        // 11530: getfield        ke/z5.h:Z
        // 11533: istore          9
        // 11535: iload           9
        // 11537: ifeq            11551
        // 11540: aload           6
        // 11542: invokevirtual   ke/z5.l:()V
        // 11545: aload           6
        // 11547: iconst_0       
        // 11548: putfield        ke/z5.h:Z
        // 11551: aload           6
        // 11553: getfield        ke/z5.g:Lke/c6;
        // 11556: checkcast       Lke/o3;
        // 11559: lload           25
        // 11561: invokestatic    ke/o3.F0:(Lke/o3;J)V
        // 11564: goto            11577
        // 11567: astore          6
        // 11569: goto            11383
        // 11572: aload           6
        // 11574: invokevirtual   ke/n3.z:()V
        // 11577: aload           17
        // 11579: getfield        re/v4.a:Lre/h4;
        // 11582: astore          4
        // 11584: aload           4
        // 11586: invokevirtual   re/h4.a:()Lre/g4;
        // 11589: invokevirtual   re/g4.y:()V
        // 11592: aload           17
        // 11594: getfield        re/v4.h:J
        // 11597: lstore_1       
        // 11598: lload_1        
        // 11599: lconst_0       
        // 11600: lcmp           
        // 11601: ifne            11610
        // 11604: lload           25
        // 11606: lstore_1       
        // 11607: goto            11610
        // 11610: lload_1        
        // 11611: lconst_0       
        // 11612: lcmp           
        // 11613: ifeq            11659
        // 11616: aload           6
        // 11618: getfield        ke/z5.h:Z
        // 11621: istore          9
        // 11623: iload           9
        // 11625: ifeq            11639
        // 11628: aload           6
        // 11630: invokevirtual   ke/z5.l:()V
        // 11633: aload           6
        // 11635: iconst_0       
        // 11636: putfield        ke/z5.h:Z
        // 11639: aload           6
        // 11641: getfield        ke/z5.g:Lke/c6;
        // 11644: checkcast       Lke/o3;
        // 11647: lload_1        
        // 11648: invokestatic    ke/o3.D0:(Lke/o3;J)V
        // 11651: goto            11664
        // 11654: astore          6
        // 11656: goto            11383
        // 11659: aload           6
        // 11661: invokevirtual   ke/n3.A:()V
        // 11664: aload           17
        // 11666: getfield        re/v4.a:Lre/h4;
        // 11669: astore          4
        // 11671: aload           4
        // 11673: invokevirtual   re/h4.a:()Lre/g4;
        // 11676: invokevirtual   re/g4.y:()V
        // 11679: aload           17
        // 11681: getfield        re/v4.g:J
        // 11684: lconst_1       
        // 11685: ladd           
        // 11686: lstore_1       
        // 11687: lload_1        
        // 11688: ldc2_w          2147483647
        // 11691: lcmp           
        // 11692: ifle            11725
        // 11695: aload           17
        // 11697: getfield        re/v4.a:Lre/h4;
        // 11700: invokevirtual   re/h4.f:()Lre/c3;
        // 11703: getfield        re/c3.n:Lre/a3;
        // 11706: aload           17
        // 11708: getfield        re/v4.b:Ljava/lang/String;
        // 11711: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 11714: ldc_w           "Bundle index overflow. appId"
        // 11717: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        // 11720: lconst_0       
        // 11721: lstore_1       
        // 11722: goto            11725
        // 11725: aload           17
        // 11727: iconst_1       
        // 11728: putfield        re/v4.C:Z
        // 11731: aload           17
        // 11733: lload_1        
        // 11734: putfield        re/v4.g:J
        // 11737: aload           17
        // 11739: getfield        re/v4.a:Lre/h4;
        // 11742: astore          4
        // 11744: aload           4
        // 11746: invokevirtual   re/h4.a:()Lre/g4;
        // 11749: invokevirtual   re/g4.y:()V
        // 11752: aload           17
        // 11754: getfield        re/v4.g:J
        // 11757: lstore_1       
        // 11758: lload_1        
        // 11759: l2i            
        // 11760: istore          12
        // 11762: aload           6
        // 11764: getfield        ke/z5.h:Z
        // 11767: istore          9
        // 11769: iload           9
        // 11771: ifeq            11785
        // 11774: aload           6
        // 11776: invokevirtual   ke/z5.l:()V
        // 11779: aload           6
        // 11781: iconst_0       
        // 11782: putfield        ke/z5.h:Z
        // 11785: aload           6
        // 11787: getfield        ke/z5.g:Lke/c6;
        // 11790: checkcast       Lke/o3;
        // 11793: iload           12
        // 11795: invokestatic    ke/o3.b0:(Lke/o3;I)V
        // 11798: aload           6
        // 11800: getfield        ke/z5.g:Lke/c6;
        // 11803: astore          4
        // 11805: aload           4
        // 11807: checkcast       Lke/o3;
        // 11810: invokevirtual   ke/o3.w1:()J
        // 11813: lstore_1       
        // 11814: aload           17
        // 11816: lload_1        
        // 11817: invokevirtual   re/v4.o:(J)V
        // 11820: aload           6
        // 11822: getfield        ke/z5.g:Lke/c6;
        // 11825: astore          4
        // 11827: aload           4
        // 11829: checkcast       Lke/o3;
        // 11832: invokevirtual   ke/o3.s1:()J
        // 11835: lstore_1       
        // 11836: aload           17
        // 11838: lload_1        
        // 11839: invokevirtual   re/v4.m:(J)V
        // 11842: aload           17
        // 11844: invokevirtual   re/v4.u:()Ljava/lang/String;
        // 11847: astore          4
        // 11849: aload           4
        // 11851: ifnull          11864
        // 11854: aload           6
        // 11856: aload           4
        // 11858: invokevirtual   ke/n3.p:(Ljava/lang/String;)V
        // 11861: goto            11869
        // 11864: aload           6
        // 11866: invokevirtual   ke/n3.x:()V
        // 11869: aload           19
        // 11871: getfield        re/g7.h:Lre/j;
        // 11874: astore          4
        // 11876: aload           4
        // 11878: invokestatic    re/g7.H:(Lre/b7;)V
        // 11881: aload           4
        // 11883: aload           17
        // 11885: invokevirtual   re/j.E:(Lre/v4;)V
        // 11888: goto            11926
        // 11891: astore          6
        // 11893: goto            11383
        // 11896: astore          6
        // 11898: goto            11383
        // 11901: astore          6
        // 11903: goto            11383
        // 11906: astore          6
        // 11908: goto            11383
        // 11911: astore          6
        // 11913: goto            11383
        // 11916: astore          6
        // 11918: goto            11383
        // 11921: astore          6
        // 11923: goto            11383
        // 11926: aload           6
        // 11928: getfield        ke/z5.g:Lke/c6;
        // 11931: astore          17
        // 11933: aload           17
        // 11935: checkcast       Lke/o3;
        // 11938: invokevirtual   ke/o3.k1:()I
        // 11941: istore          12
        // 11943: iload           12
        // 11945: ifle            12614
        // 11948: aload           19
        // 11950: getfield        re/g7.q:Lre/h4;
        // 11953: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        // 11956: pop            
        // 11957: aload           19
        // 11959: getfield        re/g7.f:Lre/b4;
        // 11962: astore          17
        // 11964: aload           17
        // 11966: invokestatic    re/g7.H:(Lre/b7;)V
        // 11969: aload           17
        // 11971: aload           7
        // 11973: getfield        re/e7.a:Lke/o3;
        // 11976: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 11979: invokevirtual   re/b4.I:(Ljava/lang/String;)Lke/s2;
        // 11982: astore          17
        // 11984: aload           17
        // 11986: ifnull          12049
        // 11989: aload           17
        // 11991: invokevirtual   ke/s2.I:()Z
        // 11994: ifne            12000
        // 11997: goto            12049
        // 12000: aload           17
        // 12002: invokevirtual   ke/s2.t:()J
        // 12005: lstore_1       
        // 12006: aload           6
        // 12008: getfield        ke/z5.h:Z
        // 12011: istore          9
        // 12013: iload           9
        // 12015: ifeq            12029
        // 12018: aload           6
        // 12020: invokevirtual   ke/z5.l:()V
        // 12023: aload           6
        // 12025: iconst_0       
        // 12026: putfield        ke/z5.h:Z
        // 12029: aload           6
        // 12031: getfield        ke/z5.g:Lke/c6;
        // 12034: checkcast       Lke/o3;
        // 12037: lload_1        
        // 12038: invokestatic    ke/o3.m0:(Lke/o3;J)V
        // 12041: goto            12132
        // 12044: astore          6
        // 12046: goto            11383
        // 12049: aload           7
        // 12051: getfield        re/e7.a:Lke/o3;
        // 12054: invokevirtual   ke/o3.w:()Ljava/lang/String;
        // 12057: invokevirtual   java/lang/String.isEmpty:()Z
        // 12060: ifeq            12108
        // 12063: aload           6
        // 12065: getfield        ke/z5.h:Z
        // 12068: istore          9
        // 12070: iload           9
        // 12072: ifeq            12086
        // 12075: aload           6
        // 12077: invokevirtual   ke/z5.l:()V
        // 12080: aload           6
        // 12082: iconst_0       
        // 12083: putfield        ke/z5.h:Z
        // 12086: aload           6
        // 12088: getfield        ke/z5.g:Lke/c6;
        // 12091: checkcast       Lke/o3;
        // 12094: ldc2_w          -1
        // 12097: invokestatic    ke/o3.m0:(Lke/o3;J)V
        // 12100: goto            12132
        // 12103: astore          6
        // 12105: goto            11383
        // 12108: aload_0        
        // 12109: invokevirtual   re/g7.f:()Lre/c3;
        // 12112: invokevirtual   re/c3.F:()Lre/a3;
        // 12115: aload           7
        // 12117: getfield        re/e7.a:Lke/o3;
        // 12120: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12123: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12126: ldc_w           "Did not find measurement config or missing version info. appId"
        // 12129: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        // 12132: aload           19
        // 12134: getfield        re/g7.h:Lre/j;
        // 12137: astore          17
        // 12139: aload           17
        // 12141: invokestatic    re/g7.H:(Lre/b7;)V
        // 12144: aload           6
        // 12146: invokevirtual   ke/z5.j:()Lke/c6;
        // 12149: checkcast       Lke/o3;
        // 12152: astore          6
        // 12154: aload           17
        // 12156: invokevirtual   u5/w.y:()V
        // 12159: aload           17
        // 12161: invokevirtual   re/b7.z:()V
        // 12164: aload           6
        // 12166: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12169: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        // 12172: aload           6
        // 12174: invokevirtual   ke/o3.X0:()Z
        // 12177: invokestatic    yd/a.V0:(Z)V
        // 12180: aload           17
        // 12182: invokevirtual   re/j.h0:()V
        // 12185: aload           17
        // 12187: getfield        u5/w.f:Ljava/lang/Object;
        // 12190: checkcast       Lre/h4;
        // 12193: invokevirtual   re/h4.g:()Lwd/c;
        // 12196: checkcast       Lkz0/k;
        // 12199: invokevirtual   kz0/k.h0:()J
        // 12202: lstore_1       
        // 12203: aload           6
        // 12205: invokevirtual   ke/o3.s1:()J
        // 12208: lstore          25
        // 12210: aload           17
        // 12212: getfield        u5/w.f:Ljava/lang/Object;
        // 12215: checkcast       Lre/h4;
        // 12218: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        // 12221: pop            
        // 12222: getstatic       re/q2.D:Lre/p2;
        // 12225: astore          4
        // 12227: aload           4
        // 12229: aconst_null    
        // 12230: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        // 12233: checkcast       Ljava/lang/Long;
        // 12236: invokevirtual   java/lang/Long.longValue:()J
        // 12239: lstore          47
        // 12241: lload           25
        // 12243: lload_1        
        // 12244: lload           47
        // 12246: lsub           
        // 12247: lcmp           
        // 12248: iflt            12306
        // 12251: aload           6
        // 12253: invokevirtual   ke/o3.s1:()J
        // 12256: lstore          25
        // 12258: aload           17
        // 12260: getfield        u5/w.f:Ljava/lang/Object;
        // 12263: checkcast       Lre/h4;
        // 12266: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        // 12269: pop            
        // 12270: aload           4
        // 12272: aconst_null    
        // 12273: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        // 12276: astore          4
        // 12278: aload           4
        // 12280: checkcast       Ljava/lang/Long;
        // 12283: invokevirtual   java/lang/Long.longValue:()J
        // 12286: lstore          47
        // 12288: lload           25
        // 12290: lload           47
        // 12292: lload_1        
        // 12293: ladd           
        // 12294: lcmp           
        // 12295: ifle            12346
        // 12298: goto            12306
        // 12301: astore          6
        // 12303: goto            11383
        // 12306: aload           17
        // 12308: getfield        u5/w.f:Ljava/lang/Object;
        // 12311: checkcast       Lre/h4;
        // 12314: invokevirtual   re/h4.f:()Lre/c3;
        // 12317: invokevirtual   re/c3.F:()Lre/a3;
        // 12320: aload           6
        // 12322: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12325: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12328: ldc_w           "Storing bundle outside of the max uploading time span. appId, now, timestamp"
        // 12331: lload_1        
        // 12332: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 12335: aload           6
        // 12337: invokevirtual   ke/o3.s1:()J
        // 12340: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 12343: invokevirtual   re/a3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        // 12346: aload           6
        // 12348: invokevirtual   com/google/android/gms/internal/measurement/b.i:()[B
        // 12351: astore          5
        // 12353: aload           17
        // 12355: getfield        re/a7.g:Lre/g7;
        // 12358: getfield        re/g7.l:Lre/i7;
        // 12361: astore          4
        // 12363: aload           4
        // 12365: invokestatic    re/g7.H:(Lre/b7;)V
        // 12368: aload           4
        // 12370: aload           5
        // 12372: invokevirtual   re/i7.a0:([B)[B
        // 12375: astore          4
        // 12377: aload           17
        // 12379: getfield        u5/w.f:Ljava/lang/Object;
        // 12382: checkcast       Lre/h4;
        // 12385: invokevirtual   re/h4.f:()Lre/c3;
        // 12388: invokevirtual   re/c3.E:()Lre/a3;
        // 12391: aload           4
        // 12393: arraylength    
        // 12394: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 12397: ldc_w           "Saving bundle, size"
        // 12400: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        // 12403: new             Landroid/content/ContentValues;
        // 12406: astore          5
        // 12408: aload           5
        // 12410: invokespecial   android/content/ContentValues.<init>:()V
        // 12413: aload           5
        // 12415: aload           18
        // 12417: aload           6
        // 12419: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12422: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/String;)V
        // 12425: aload           5
        // 12427: ldc_w           "bundle_end_timestamp"
        // 12430: aload           6
        // 12432: invokevirtual   ke/o3.s1:()J
        // 12435: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        // 12438: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Long;)V
        // 12441: aload           5
        // 12443: aload           14
        // 12445: aload           4
        // 12447: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;[B)V
        // 12450: aload           5
        // 12452: ldc_w           "has_realtime"
        // 12455: iload           11
        // 12457: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 12460: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        // 12463: aload           6
        // 12465: invokevirtual   ke/o3.d1:()Z
        // 12468: ifeq            12487
        // 12471: aload           5
        // 12473: ldc_w           "retry_count"
        // 12476: aload           6
        // 12478: invokevirtual   ke/o3.m1:()I
        // 12481: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 12484: invokevirtual   android/content/ContentValues.put:(Ljava/lang/String;Ljava/lang/Integer;)V
        // 12487: aload           17
        // 12489: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        // 12492: ldc_w           "queue"
        // 12495: aconst_null    
        // 12496: aload           5
        // 12498: invokevirtual   android/database/sqlite/SQLiteDatabase.insert:(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        // 12501: ldc2_w          -1
        // 12504: lcmp           
        // 12505: ifne            12614
        // 12508: aload           17
        // 12510: getfield        u5/w.f:Ljava/lang/Object;
        // 12513: checkcast       Lre/h4;
        // 12516: invokevirtual   re/h4.f:()Lre/c3;
        // 12519: invokevirtual   re/c3.D:()Lre/a3;
        // 12522: aload           6
        // 12524: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12527: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12530: ldc_w           "Failed to insert bundle (got -1). appId"
        // 12533: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        // 12536: goto            12614
        // 12539: astore          14
        // 12541: aload           17
        // 12543: getfield        u5/w.f:Ljava/lang/Object;
        // 12546: checkcast       Lre/h4;
        // 12549: invokevirtual   re/h4.f:()Lre/c3;
        // 12552: invokevirtual   re/c3.D:()Lre/a3;
        // 12555: aload           6
        // 12557: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12560: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12563: ldc_w           "Error storing bundle. appId"
        // 12566: aload           14
        // 12568: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 12571: goto            12614
        // 12574: astore          14
        // 12576: aload           17
        // 12578: getfield        u5/w.f:Ljava/lang/Object;
        // 12581: checkcast       Lre/h4;
        // 12584: invokevirtual   re/h4.f:()Lre/c3;
        // 12587: invokevirtual   re/c3.D:()Lre/a3;
        // 12590: aload           6
        // 12592: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        // 12595: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12598: ldc_w           "Data loss. Failed to serialize bundle. appId"
        // 12601: aload           14
        // 12603: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 12606: goto            12614
        // 12609: astore          6
        // 12611: goto            11383
        // 12614: aload           19
        // 12616: getfield        re/g7.h:Lre/j;
        // 12619: astore          6
        // 12621: aload           6
        // 12623: invokestatic    re/g7.H:(Lre/b7;)V
        // 12626: aload           7
        // 12628: getfield        re/e7.b:Ljava/util/ArrayList;
        // 12631: astore          18
        // 12633: aload           18
        // 12635: invokestatic    yd/a.S0:(Ljava/lang/Object;)V
        // 12638: aload           6
        // 12640: invokevirtual   u5/w.y:()V
        // 12643: aload           6
        // 12645: invokevirtual   re/b7.z:()V
        // 12648: new             Ljava/lang/StringBuilder;
        // 12651: astore          14
        // 12653: aload           14
        // 12655: ldc_w           "rowid in ("
        // 12658: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        // 12661: iconst_0       
        // 12662: istore          12
        // 12664: iload           12
        // 12666: aload           18
        // 12668: invokevirtual   java/util/ArrayList.size:()I
        // 12671: if_icmpge       12713
        // 12674: iload           12
        // 12676: ifeq            12688
        // 12679: aload           14
        // 12681: ldc_w           ","
        // 12684: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 12687: pop            
        // 12688: aload           14
        // 12690: aload           18
        // 12692: iload           12
        // 12694: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        // 12697: checkcast       Ljava/lang/Long;
        // 12700: invokevirtual   java/lang/Long.longValue:()J
        // 12703: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        // 12706: pop            
        // 12707: iinc            12, 1
        // 12710: goto            12664
        // 12713: aload           14
        // 12715: ldc_w           ")"
        // 12718: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        // 12721: pop            
        // 12722: aload           6
        // 12724: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        // 12727: ldc_w           "raw_events"
        // 12730: aload           14
        // 12732: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        // 12735: aconst_null    
        // 12736: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        // 12739: istore          12
        // 12741: iload           12
        // 12743: aload           18
        // 12745: invokevirtual   java/util/ArrayList.size:()I
        // 12748: if_icmpeq       12784
        // 12751: aload           6
        // 12753: getfield        u5/w.f:Ljava/lang/Object;
        // 12756: checkcast       Lre/h4;
        // 12759: invokevirtual   re/h4.f:()Lre/c3;
        // 12762: invokevirtual   re/c3.D:()Lre/a3;
        // 12765: iload           12
        // 12767: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 12770: ldc_w           "Deleted fewer rows from raw events table than expected"
        // 12773: aload           18
        // 12775: invokevirtual   java/util/ArrayList.size:()I
        // 12778: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        // 12781: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 12784: aload           19
        // 12786: getfield        re/g7.h:Lre/j;
        // 12789: astore          6
        // 12791: aload           6
        // 12793: invokestatic    re/g7.H:(Lre/b7;)V
        // 12796: aload           6
        // 12798: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        // 12801: astore          14
        // 12803: aload           14
        // 12805: ldc_w           "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
        // 12808: iconst_2       
        // 12809: anewarray       Ljava/lang/String;
        // 12812: dup            
        // 12813: iconst_0       
        // 12814: aload           8
        // 12816: aastore        
        // 12817: dup            
        // 12818: iconst_1       
        // 12819: aload           8
        // 12821: aastore        
        // 12822: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        // 12825: goto            12857
        // 12828: astore          14
        // 12830: aload           6
        // 12832: getfield        u5/w.f:Ljava/lang/Object;
        // 12835: checkcast       Lre/h4;
        // 12838: invokevirtual   re/h4.f:()Lre/c3;
        // 12841: invokevirtual   re/c3.D:()Lre/a3;
        // 12844: aload           8
        // 12846: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        // 12849: ldc_w           "Failed to remove unused event metadata. appId"
        // 12852: aload           14
        // 12854: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        // 12857: aload           19
        // 12859: getfield        re/g7.h:Lre/j;
        // 12862: astore          6
        // 12864: aload           6
        // 12866: invokestatic    re/g7.H:(Lre/b7;)V
        // 12869: aload           6
        // 12871: invokevirtual   re/j.D:()V
        // 12874: aload           19
        // 12876: getfield        re/g7.h:Lre/j;
        // 12879: astore          6
        // 12881: aload           6
        // 12883: invokestatic    re/g7.H:(Lre/b7;)V
        // 12886: aload           6
        // 12888: invokevirtual   re/j.f0:()V
        // 12891: iconst_1       
        // 12892: ireturn        
        // 12893: astore          6
        // 12895: goto            11383
        // 12898: astore          6
        // 12900: goto            11383
        // 12903: astore          6
        // 12905: goto            13033
        // 12908: astore          6
        // 12910: goto            11383
        // 12913: astore          6
        // 12915: goto            11383
        // 12918: astore          6
        // 12920: aload           17
        // 12922: astore          14
        // 12924: aload           14
        // 12926: ifnull          12944
        // 12929: aload           14
        // 12931: invokeinterface android/database/Cursor.close:()V
        // 12936: goto            12944
        // 12939: astore          6
        // 12941: goto            11383
        // 12944: aload           6
        // 12946: athrow         
        // 12947: astore          6
        // 12949: goto            11383
        // 12952: astore          6
        // 12954: goto            11383
        // 12957: astore          6
        // 12959: goto            11383
        // 12962: astore          6
        // 12964: goto            11383
        // 12967: astore          6
        // 12969: goto            11383
        // 12972: astore          6
        // 12974: goto            11383
        // 12977: astore          6
        // 12979: goto            11383
        // 12982: astore          6
        // 12984: goto            11383
        // 12987: aload_0        
        // 12988: astore          6
        // 12990: aload           6
        // 12992: getfield        re/g7.h:Lre/j;
        // 12995: astore          14
        // 12997: aload           14
        // 12999: invokestatic    re/g7.H:(Lre/b7;)V
        // 13002: aload           14
        // 13004: invokevirtual   re/j.D:()V
        // 13007: aload           6
        // 13009: getfield        re/g7.h:Lre/j;
        // 13012: astore          6
        // 13014: aload           6
        // 13016: invokestatic    re/g7.H:(Lre/b7;)V
        // 13019: aload           6
        // 13021: invokevirtual   re/j.f0:()V
        // 13024: iconst_0       
        // 13025: ireturn        
        // 13026: astore          6
        // 13028: goto            13033
        // 13031: astore          6
        // 13033: aload_0        
        // 13034: astore          14
        // 13036: aload           14
        // 13038: getfield        re/g7.h:Lre/j;
        // 13041: astore          14
        // 13043: aload           14
        // 13045: invokestatic    re/g7.H:(Lre/b7;)V
        // 13048: aload           14
        // 13050: invokevirtual   re/j.f0:()V
        // 13053: aload           6
        // 13055: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  30     71     13031  13033  Any
        //  76     84     13031  13033  Any
        //  87     107    13031  13033  Any
        //  112    123    126    131    Any
        //  131    142    13031  13033  Any
        //  177    187    13031  13033  Any
        //  199    251    2195   2197   Any
        //  256    316    2195   2197   Any
        //  316    332    463    468    Any
        //  337    358    2195   2197   Any
        //  358    374    447    452    Any
        //  382    444    2195   2197   Any
        //  468    475    2195   2197   Any
        //  475    488    2190   2195   Any
        //  488    531    2195   2197   Any
        //  539    552    632    637    Any
        //  559    626    2195   2197   Any
        //  637    668    2195   2197   Any
        //  673    699    2195   2197   Any
        //  837    850    2185   2190   Any
        //  857    912    2195   2197   Any
        //  922    977    2195   2197   Any
        //  1012   1066   2195   2197   Any
        //  1071   1125   2195   2197   Any
        //  1125   1189   2195   2197   Any
        //  1195   1206   2195   2197   Any
        //  1211   1291   2195   2197   Any
        //  1303   1316   1511   1516   Any
        //  1323   1356   2195   2197   Any
        //  1371   1384   2195   2197   Any
        //  1423   1430   2195   2197   Any
        //  1441   1481   2195   2197   Any
        //  1484   1508   2195   2197   Any
        //  1536   1551   2195   2197   Any
        //  1560   1567   2195   2197   Any
        //  1574   1596   2195   2197   Any
        //  1607   1629   2195   2197   Any
        //  1656   1726   2195   2197   Any
        //  1738   1762   2195   2197   Any
        //  1765   1802   2195   2197   Any
        //  1805   1843   2195   2197   Any
        //  1843   1881   2195   2197   Any
        //  1886   1937   2195   2197   Any
        //  1971   2008   2195   2197   Any
        //  2013   2064   2195   2197   Any
        //  2098   2117   2195   2197   Any
        //  2120   2139   2180   2185   Any
        //  2139   2158   2180   2185   Any
        //  2223   2238   2426   2431   Any
        //  2238   2277   2195   2197   Any
        //  2295   2312   2195   2197   Any
        //  2328   2346   2195   2197   Any
        //  2379   2396   2195   2197   Any
        //  2431   2446   13031  13033  Any
        //  2446   2459   12982  12987  Any
        //  2459   2468   13031  13033  Any
        //  2468   2477   13031  13033  Any
        //  2482   2528   2195   2197   Any
        //  2528   2538   13031  13033  Any
        //  2543   2551   2195   2197   Any
        //  2554   2564   13031  13033  Any
        //  2569   2588   2628   2633   Any
        //  2588   2601   2628   2633   Any
        //  2601   2625   2195   2197   Any
        //  2633   2691   13031  13033  Any
        //  2691   2700   12977  12982  Any
        //  2711   2718   12977  12982  Any
        //  2723   2750   2195   2197   Any
        //  2755   2773   3350   3355   Any
        //  2778   2791   2195   2197   Any
        //  2791   2835   3345   3350   Any
        //  2835   2842   3345   3350   Any
        //  2847   2901   3345   3350   Any
        //  2907   2934   3345   3350   Any
        //  2934   2967   3069   3074   Landroid/accounts/AuthenticatorException;
        //  2934   2967   3064   3069   Ljava/io/IOException;
        //  2934   2967   3059   3061   Landroid/accounts/OperationCanceledException;
        //  2934   2967   3345   3350   Any
        //  2972   2992   3069   3074   Landroid/accounts/AuthenticatorException;
        //  2972   2992   3064   3069   Ljava/io/IOException;
        //  2972   2992   3059   3061   Landroid/accounts/OperationCanceledException;
        //  2972   2992   3345   3350   Any
        //  2998   3031   3069   3074   Landroid/accounts/AuthenticatorException;
        //  2998   3031   3064   3069   Ljava/io/IOException;
        //  2998   3031   3059   3061   Landroid/accounts/OperationCanceledException;
        //  2998   3031   3345   3350   Any
        //  3036   3056   3069   3074   Landroid/accounts/AuthenticatorException;
        //  3036   3056   3064   3069   Ljava/io/IOException;
        //  3036   3056   3059   3061   Landroid/accounts/OperationCanceledException;
        //  3036   3056   3345   3350   Any
        //  3074   3096   3345   3350   Any
        //  3096   3110   3345   3350   Any
        //  3113   3120   3345   3350   Any
        //  3125   3192   2195   2197   Any
        //  3195   3208   3340   3345   Any
        //  3215   3230   3295   3300   Any
        //  3230   3242   2195   2197   Any
        //  3247   3266   3284   3289   Any
        //  3266   3281   3284   3289   Any
        //  3300   3319   3335   3340   Any
        //  3319   3332   3335   3340   Any
        //  3355   3362   13031  13033  Any
        //  3367   3378   3381   3386   Any
        //  3386   3407   13031  13033  Any
        //  3412   3423   3426   3431   Any
        //  3431   3445   13031  13033  Any
        //  3448   3455   13031  13033  Any
        //  3455   3465   12972  12977  Any
        //  3472   3487   3645   3650   Any
        //  3487   3494   2195   2197   Any
        //  3494   3506   3640   3645   Any
        //  3513   3519   2195   2197   Any
        //  3519   3538   3553   3558   Any
        //  3538   3550   3553   3558   Any
        //  3558   3564   2195   2197   Any
        //  3564   3577   3635   3640   Any
        //  3584   3590   2195   2197   Any
        //  3590   3609   3624   3629   Any
        //  3609   3621   3624   3629   Any
        //  3650   3685   13031  13033  Any
        //  3685   3698   12967  12972  Any
        //  3702   3709   13031  13033  Any
        //  3709   3722   12962  12967  Any
        //  3722   3729   13031  13033  Any
        //  3729   3739   12957  12962  Any
        //  3739   3746   13031  13033  Any
        //  3746   3755   12952  12957  Any
        //  3760   3844   12947  12952  Any
        //  3844   3876   12947  12952  Any
        //  3885   3939   12947  12952  Any
        //  3944   3998   12913  12918  Any
        //  3998   4005   4036   4038   Landroid/database/sqlite/SQLiteException;
        //  3998   4005   12913  12918  Any
        //  4005   4028   4031   4036   Landroid/database/sqlite/SQLiteException;
        //  4005   4028   12913  12918  Any
        //  4038   4065   12913  12918  Any
        //  4068   4073   12913  12918  Any
        //  4097   4136   12913  12918  Any
        //  4136   4177   4500   4505   Landroid/database/sqlite/SQLiteException;
        //  4136   4177   4505   4513   Any
        //  4181   4190   4479   4489   Landroid/database/sqlite/SQLiteException;
        //  4181   4190   4593   4599   Any
        //  4199   4209   4437   4450   Landroid/database/sqlite/SQLiteException;
        //  4199   4209   4593   4599   Any
        //  4213   4232   4361   4398   Ljava/io/IOException;
        //  4213   4232   4437   4450   Landroid/database/sqlite/SQLiteException;
        //  4213   4232   4593   4599   Any
        //  4236   4244   4437   4450   Landroid/database/sqlite/SQLiteException;
        //  4236   4244   4593   4599   Any
        //  4251   4264   4437   4450   Landroid/database/sqlite/SQLiteException;
        //  4251   4264   4593   4599   Any
        //  4268   4280   4437   4450   Landroid/database/sqlite/SQLiteException;
        //  4268   4280   4593   4599   Any
        //  4297   4302   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4297   4302   4593   4599   Any
        //  4310   4315   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4310   4315   4593   4599   Any
        //  4323   4333   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4323   4333   4593   4599   Any
        //  4348   4358   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4348   4358   4593   4599   Any
        //  4371   4398   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4371   4398   4593   4599   Any
        //  4406   4415   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4406   4415   4593   4599   Any
        //  4420   4427   9592   9597   Any
        //  4458   4463   4474   4479   Landroid/database/sqlite/SQLiteException;
        //  4458   4463   4593   4599   Any
        //  4522   4549   4593   4599   Any
        //  4553   4558   4593   4599   Any
        //  4579   4586   12913  12918  Any
        //  4604   4611   12913  12918  Any
        //  4611   4614   12913  12918  Any
        //  4631   4670   12913  12918  Any
        //  4670   4711   5075   5090   Landroid/database/sqlite/SQLiteException;
        //  4670   4711   5067   5075   Any
        //  4723   4732   5054   5067   Landroid/database/sqlite/SQLiteException;
        //  4723   4732   12918  12924  Any
        //  4741   4746   4766   4785   Landroid/database/sqlite/SQLiteException;
        //  4741   4746   12918  12924  Any
        //  4746   4753   12913  12918  Any
        //  4797   4802   5054   5067   Landroid/database/sqlite/SQLiteException;
        //  4797   4802   12918  12924  Any
        //  4814   4819   5054   5067   Landroid/database/sqlite/SQLiteException;
        //  4814   4819   12918  12924  Any
        //  4839   4849   5054   5067   Landroid/database/sqlite/SQLiteException;
        //  4839   4849   12918  12924  Any
        //  4853   4863   5041   5054   Landroid/database/sqlite/SQLiteException;
        //  4853   4863   12918  12924  Any
        //  4867   4886   4923   4969   Ljava/io/IOException;
        //  4867   4886   4906   4923   Landroid/database/sqlite/SQLiteException;
        //  4867   4886   12918  12924  Any
        //  4890   4903   4906   4923   Landroid/database/sqlite/SQLiteException;
        //  4890   4903   12918  12924  Any
        //  4929   4945   5041   5054   Landroid/database/sqlite/SQLiteException;
        //  4929   4945   12918  12924  Any
        //  4949   4969   5020   5026   Landroid/database/sqlite/SQLiteException;
        //  4949   4969   12918  12924  Any
        //  4977   4986   5020   5026   Landroid/database/sqlite/SQLiteException;
        //  4977   4986   12918  12924  Any
        //  4991   4998   9592   9597   Any
        //  5094   5121   12918  12924  Any
        //  5125   5130   12918  12924  Any
        //  5147   5154   12913  12918  Any
        //  5166   5176   12913  12918  Any
        //  5187   5204   12913  12918  Any
        //  5209   5265   12913  12918  Any
        //  5265   5289   5458   5463   Landroid/database/sqlite/SQLiteException;
        //  5265   5289   5450   5458   Any
        //  5293   5303   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5293   5303   6191   6197   Any
        //  5307   5320   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5307   5320   6191   6197   Any
        //  5324   5336   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5324   5336   6191   6197   Any
        //  5349   5354   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5349   5354   6191   6197   Any
        //  5358   5363   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5358   5363   6191   6197   Any
        //  5367   5377   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5367   5377   6191   6197   Any
        //  5381   5400   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5381   5400   6191   6197   Any
        //  5404   5414   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5404   5414   6191   6197   Any
        //  5429   5434   5441   5450   Landroid/database/sqlite/SQLiteException;
        //  5429   5434   6191   6197   Any
        //  5467   5494   6191   6197   Any
        //  5498   5503   6191   6197   Any
        //  5520   5527   9592   9597   Any
        //  5531   5556   9592   9597   Any
        //  5570   5584   9592   9597   Any
        //  5599   5658   9592   9597   Any
        //  5662   5671   9592   9597   Any
        //  5674   5740   9592   9597   Any
        //  5740   5799   9592   9597   Any
        //  5799   5858   9592   9597   Any
        //  5858   5905   9592   9597   Any
        //  5908   5932   9592   9597   Any
        //  5932   5967   9592   9597   Any
        //  5967   6014   9592   9597   Any
        //  6017   6041   9592   9597   Any
        //  6041   6054   9592   9597   Any
        //  6060   6099   9592   9597   Any
        //  6108   6147   9592   9597   Any
        //  6153   6172   9592   9597   Any
        //  6178   6188   9592   9597   Any
        //  6202   6209   12913  12918  Any
        //  6209   6212   12913  12918  Any
        //  6221   6228   12913  12918  Any
        //  6239   6311   12913  12918  Any
        //  6319   6327   12913  12918  Any
        //  6333   6345   12913  12918  Any
        //  6348   6397   9592   9597   Any
        //  6402   6414   9592   9597   Any
        //  6417   6427   12913  12918  Any
        //  6436   6443   12913  12918  Any
        //  6455   6467   9592   9597   Any
        //  6471   6538   9592   9597   Any
        //  6568   6657   9592   9597   Any
        //  6660   6671   9592   9597   Any
        //  6677   6698   9592   9597   Any
        //  6716   6730   9592   9597   Any
        //  6743   6759   9592   9597   Any
        //  6766   6775   9592   9597   Any
        //  6779   6821   9592   9597   Any
        //  6821   6842   9592   9597   Any
        //  6842   6871   9592   9597   Any
        //  6871   6893   9592   9597   Any
        //  6896   6939   9592   9597   Any
        //  6961   6970   12913  12918  Any
        //  7001   7032   12913  12918  Any
        //  7058   7092   12913  12918  Any
        //  7097   7134   12913  12918  Any
        //  7139   7208   9592   9597   Any
        //  7211   7281   9592   9597   Any
        //  7281   7319   9592   9597   Any
        //  7324   7377   9592   9597   Any
        //  7381   7424   7894   7907   Landroid/database/sqlite/SQLiteException;
        //  7381   7424   7907   7915   Any
        //  7428   7437   7863   7894   Landroid/database/sqlite/SQLiteException;
        //  7428   7437   8039   8045   Any
        //  7458   7468   7760   7772   Landroid/database/sqlite/SQLiteException;
        //  7458   7468   8039   8045   Any
        //  7472   7490   7607   7678   Ljava/io/IOException;
        //  7472   7490   7584   7586   Landroid/database/sqlite/SQLiteException;
        //  7472   7490   8039   8045   Any
        //  7494   7507   7584   7586   Landroid/database/sqlite/SQLiteException;
        //  7494   7507   8039   8045   Any
        //  7511   7523   7584   7586   Landroid/database/sqlite/SQLiteException;
        //  7511   7523   8039   8045   Any
        //  7532   7537   7579   7584   Landroid/database/sqlite/SQLiteException;
        //  7532   7537   8039   8045   Any
        //  7541   7546   7579   7584   Landroid/database/sqlite/SQLiteException;
        //  7541   7546   8039   8045   Any
        //  7550   7560   7579   7584   Landroid/database/sqlite/SQLiteException;
        //  7550   7560   8039   8045   Any
        //  7567   7576   7579   7584   Landroid/database/sqlite/SQLiteException;
        //  7567   7576   8039   8045   Any
        //  7617   7633   7747   7760   Landroid/database/sqlite/SQLiteException;
        //  7617   7633   8039   8045   Any
        //  7637   7644   7747   7760   Landroid/database/sqlite/SQLiteException;
        //  7637   7644   8039   8045   Any
        //  7667   7678   7844   7863   Landroid/database/sqlite/SQLiteException;
        //  7667   7678   8039   8045   Any
        //  7697   7706   7844   7863   Landroid/database/sqlite/SQLiteException;
        //  7697   7706   8039   8045   Any
        //  7711   7718   9592   9597   Any
        //  7824   7829   7844   7863   Landroid/database/sqlite/SQLiteException;
        //  7824   7829   8039   8045   Any
        //  7922   7948   8039   8045   Any
        //  7952   7957   8039   8045   Any
        //  7993   8000   9592   9597   Any
        //  8011   8021   9592   9597   Any
        //  8050   8057   9592   9597   Any
        //  8057   8060   9592   9597   Any
        //  8072   8086   9592   9597   Any
        //  8094   8161   9592   9597   Any
        //  8164   8182   9592   9597   Any
        //  8204   8287   9592   9597   Any
        //  8298   8310   9592   9597   Any
        //  8314   8332   9592   9597   Any
        //  8337   8352   9592   9597   Any
        //  8359   8373   9592   9597   Any
        //  8381   8395   9592   9597   Any
        //  8428   8438   12913  12918  Any
        //  8441   8460   12913  12918  Any
        //  8464   8473   12913  12918  Any
        //  8478   8509   9592   9597   Any
        //  8514   8568   9592   9597   Any
        //  8568   8611   8910   8921   Landroid/database/sqlite/SQLiteException;
        //  8568   8611   8902   8910   Any
        //  8618   8627   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8618   8627   9021   9027   Any
        //  8634   8643   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8634   8643   9021   9027   Any
        //  8650   8669   8777   8824   Ljava/io/IOException;
        //  8650   8669   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8650   8669   9021   9027   Any
        //  8676   8688   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8676   8688   9021   9027   Any
        //  8695   8707   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8695   8707   9021   9027   Any
        //  8723   8728   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8723   8728   9021   9027   Any
        //  8735   8740   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8735   8740   9021   9027   Any
        //  8747   8757   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8747   8757   9021   9027   Any
        //  8764   8774   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8764   8774   9021   9027   Any
        //  8786   8802   8897   8902   Landroid/database/sqlite/SQLiteException;
        //  8786   8802   9021   9027   Any
        //  8809   8824   8885   8887   Landroid/database/sqlite/SQLiteException;
        //  8809   8824   9021   9027   Any
        //  8831   8839   8885   8887   Landroid/database/sqlite/SQLiteException;
        //  8831   8839   9021   9027   Any
        //  8844   8850   9592   9597   Any
        //  8867   8872   8885   8887   Landroid/database/sqlite/SQLiteException;
        //  8867   8872   9021   9027   Any
        //  8925   8951   9021   9027   Any
        //  8955   8960   9021   9027   Any
        //  8983   8990   9592   9597   Any
        //  9001   9011   9592   9597   Any
        //  9032   9039   9592   9597   Any
        //  9039   9042   9592   9597   Any
        //  9045   9059   9592   9597   Any
        //  9071   9141   9592   9597   Any
        //  9144   9163   9592   9597   Any
        //  9170   9247   9592   9597   Any
        //  9253   9320   9592   9597   Any
        //  9323   9342   9592   9597   Any
        //  9345   9406   9592   9597   Any
        //  9417   9429   9592   9597   Any
        //  9429   9444   9592   9597   Any
        //  9449   9464   9592   9597   Any
        //  9467   9481   9592   9597   Any
        //  9484   9528   9592   9597   Any
        //  9534   9549   9592   9597   Any
        //  9557   9571   9592   9597   Any
        //  9597   9646   12913  12918  Any
        //  9646   9660   12913  12918  Any
        //  9670   9809   9592   9597   Any
        //  9809   9816   9867   9872   Landroid/database/sqlite/SQLiteException;
        //  9809   9816   9592   9597   Any
        //  9816   9859   9862   9864   Landroid/database/sqlite/SQLiteException;
        //  9816   9859   9592   9597   Any
        //  9872   9899   9592   9597   Any
        //  9906   9913   12903  12908  Any
        //  9918   9929   9935   9940   Any
        //  9943   9956   12908  12913  Any
        //  9956   10001  12903  12908  Any
        //  10004  10011  12903  12908  Any
        //  10011  10021  11397  11402  Any
        //  10028  10035  11222  11224  Any
        //  10035  10047  11214  11219  Any
        //  10047  10070  12903  12908  Any
        //  10078  10116  10307  10315  Any
        //  10125  10163  10307  10315  Any
        //  10172  10181  10307  10315  Any
        //  10190  10205  10307  10315  Any
        //  10210  10241  10307  10315  Any
        //  10241  10248  10307  10315  Any
        //  10253  10281  10307  10315  Any
        //  10281  10295  10307  10315  Any
        //  10295  10304  10307  10315  Any
        //  10318  10359  12903  12908  Any
        //  10364  10370  10373  10405  Ljava/lang/NumberFormatException;
        //  10364  10370  10307  10315  Any
        //  10375  10402  10307  10315  Any
        //  10407  10420  12903  12908  Any
        //  10420  10426  11206  11211  Any
        //  10432  10442  11206  11211  Any
        //  10442  10460  12903  12908  Any
        //  10465  10477  10307  10315  Any
        //  10477  10530  10307  10315  Any
        //  10547  10579  12903  12908  Any
        //  10584  10630  10307  10315  Any
        //  10633  10647  12903  12908  Any
        //  10652  10684  10307  10315  Any
        //  10689  10751  10307  10315  Any
        //  10757  10784  12903  12908  Any
        //  10798  10805  12903  12908  Any
        //  10811  10857  10307  10315  Any
        //  10857  10879  10307  10315  Any
        //  10879  10888  10307  10315  Any
        //  10891  10900  12903  12908  Any
        //  10905  10945  10307  10315  Any
        //  10949  10968  10307  10315  Any
        //  10968  10990  10307  10315  Any
        //  10993  11000  12903  12908  Any
        //  11005  11011  10307  10315  Any
        //  11014  11027  12903  12908  Any
        //  11027  11042  11201  11206  Any
        //  11049  11109  12903  12908  Any
        //  11113  11134  12903  12908  Any
        //  11134  11156  12903  12908  Any
        //  11159  11186  12903  12908  Any
        //  11186  11195  12903  12908  Any
        //  11238  11252  12903  12908  Any
        //  11252  11262  11386  11391  Any
        //  11269  11276  11222  11224  Any
        //  11281  11292  11313  11318  Any
        //  11292  11303  11313  11318  Any
        //  11303  11310  12903  12908  Any
        //  11318  11329  12903  12908  Any
        //  11329  11351  12903  12908  Any
        //  11351  11377  13026  13031  Any
        //  11414  11445  13026  13031  Any
        //  11450  11474  13026  13031  Any
        //  11477  11484  13026  13031  Any
        //  11484  11494  12898  12903  Any
        //  11499  11506  13026  13031  Any
        //  11506  11521  11921  11926  Any
        //  11528  11535  13026  13031  Any
        //  11540  11551  11567  11572  Any
        //  11551  11564  11567  11572  Any
        //  11572  11577  13026  13031  Any
        //  11577  11584  13026  13031  Any
        //  11584  11598  11916  11921  Any
        //  11616  11623  13026  13031  Any
        //  11628  11639  11654  11659  Any
        //  11639  11651  11654  11659  Any
        //  11659  11664  13026  13031  Any
        //  11664  11671  13026  13031  Any
        //  11671  11687  11911  11916  Any
        //  11695  11720  11911  11916  Any
        //  11725  11737  11911  11916  Any
        //  11737  11744  13026  13031  Any
        //  11744  11758  11906  11911  Any
        //  11762  11769  13026  13031  Any
        //  11774  11785  11901  11906  Any
        //  11785  11798  11901  11906  Any
        //  11798  11805  13026  13031  Any
        //  11805  11814  11896  11901  Any
        //  11814  11827  13026  13031  Any
        //  11827  11836  11891  11896  Any
        //  11836  11849  13026  13031  Any
        //  11854  11861  13026  13031  Any
        //  11864  11869  13026  13031  Any
        //  11869  11888  13026  13031  Any
        //  11926  11933  13026  13031  Any
        //  11933  11943  12893  12898  Any
        //  11948  11984  13026  13031  Any
        //  11989  11997  13026  13031  Any
        //  12000  12013  13026  13031  Any
        //  12018  12029  12044  12049  Any
        //  12029  12041  12044  12049  Any
        //  12049  12070  13026  13031  Any
        //  12075  12086  12103  12108  Any
        //  12086  12100  12103  12108  Any
        //  12108  12132  13026  13031  Any
        //  12132  12227  13026  13031  Any
        //  12227  12241  12609  12614  Any
        //  12251  12278  13026  13031  Any
        //  12278  12288  12301  12306  Any
        //  12306  12346  13026  13031  Any
        //  12346  12353  13026  13031  Any
        //  12353  12377  12574  12609  Ljava/io/IOException;
        //  12353  12377  13026  13031  Any
        //  12377  12487  13026  13031  Any
        //  12487  12536  12539  12574  Landroid/database/sqlite/SQLiteException;
        //  12487  12536  13026  13031  Any
        //  12541  12571  13026  13031  Any
        //  12576  12606  13026  13031  Any
        //  12614  12661  13026  13031  Any
        //  12664  12674  13026  13031  Any
        //  12679  12688  13026  13031  Any
        //  12688  12707  13026  13031  Any
        //  12713  12784  13026  13031  Any
        //  12784  12803  13026  13031  Any
        //  12803  12825  12828  12857  Landroid/database/sqlite/SQLiteException;
        //  12803  12825  13026  13031  Any
        //  12830  12857  13026  13031  Any
        //  12857  12874  13026  13031  Any
        //  12929  12936  12939  12944  Any
        //  12944  12947  12939  12944  Any
        //  12990  13007  13026  13031  Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 5551, Size: 5551
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
    
    public final boolean E() {
        this.a().y();
        this.c();
        final j h = this.h;
        H((b7)h);
        if (h.M("select count(1) > 0 from raw_events", (String[])null) == 0L) {
            final j h2 = this.h;
            H((b7)h2);
            if (TextUtils.isEmpty((CharSequence)h2.Z())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean F(final d3 d3, final d3 d4) {
        a.K0("_e".equals(d3.t()));
        H((b7)this.l);
        final ke.i3 c = i7.C((e3)d3.j(), "_sc");
        String y = null;
        Object y2;
        if (c == null) {
            y2 = null;
        }
        else {
            y2 = c.y();
        }
        H((b7)this.l);
        final ke.i3 c2 = i7.C((e3)d4.j(), "_pc");
        if (c2 != null) {
            y = c2.y();
        }
        if (y != null && y.equals(y2)) {
            a.K0("_e".equals(d3.t()));
            H((b7)this.l);
            final ke.i3 c3 = i7.C((e3)d3.j(), "_et");
            if (c3 != null && c3.M()) {
                if (c3.u() > 0L) {
                    final long u = c3.u();
                    H((b7)this.l);
                    final ke.i3 c4 = i7.C((e3)d4.j(), "_et");
                    long n = u;
                    if (c4 != null) {
                        n = u;
                        if (c4.u() > 0L) {
                            n = u + c4.u();
                        }
                    }
                    H((b7)this.l);
                    i7.b0(d4, "_et", Long.valueOf(n));
                    H((b7)this.l);
                    i7.b0(d3, "_fr", Long.valueOf(1L));
                }
            }
            return true;
        }
        return false;
    }
    
    public final v4 I(final q7 q7) {
        this.a().y();
        this.c();
        a.S0((Object)q7);
        a.P0(q7.f);
        com.google.android.gms.internal.measurement.w.b();
        if (this.J().H(q7.f, q2.v0) && !q7.B.isEmpty()) {
            this.G.put(q7.f, new f7(this, q7.B));
        }
        final j h = this.h;
        H((b7)h);
        final v4 s = h.S(q7.f);
        final g c = this.K(q7.f).c(re.g.b(q7.A));
        final zzah zza = zzah.zza;
        String d;
        if (c.f(zza)) {
            d = this.n.D(q7.f, q7.t);
        }
        else {
            d = "";
        }
        v4 v5 = null;
        Label_0518: {
            if (s == null) {
                final v4 v4 = new v4(this.q, q7.f);
                if (c.f(zzah.zzb)) {
                    v4.b(this.Q(c));
                }
                v5 = v4;
                if (c.f(zza)) {
                    v4.q(d);
                    v5 = v4;
                }
            }
            else {
                if (c.f(zza) && d != null) {
                    s.a.a().y();
                    if (!d.equals(s.e)) {
                        s.q(d);
                        if (this.J().H((String)null, q2.g0)) {
                            v5 = s;
                            if (!q7.t) {
                                break Label_0518;
                            }
                        }
                        final o6 n = this.n;
                        final String f = q7.f;
                        n.getClass();
                        Pair c2;
                        if (c.f(zza)) {
                            c2 = n.C(f);
                        }
                        else {
                            c2 = new Pair((Object)"", (Object)Boolean.FALSE);
                        }
                        v5 = s;
                        if ("00000000-0000-0000-0000-000000000000".equals(c2.first)) {
                            break Label_0518;
                        }
                        s.b(this.Q(c));
                        final j h2 = this.h;
                        H((b7)h2);
                        v5 = s;
                        if (h2.X(q7.f, "_id") == null) {
                            break Label_0518;
                        }
                        final j h3 = this.h;
                        H((b7)h3);
                        v5 = s;
                        if (h3.X(q7.f, "_lair") == null) {
                            ((k)this.g()).getClass();
                            final l7 l7 = new l7(q7.f, "auto", System.currentTimeMillis(), "_lair", (Object)1L);
                            final j h4 = this.h;
                            H((b7)h4);
                            h4.J(l7);
                            v5 = s;
                        }
                        break Label_0518;
                    }
                }
                v5 = s;
                if (TextUtils.isEmpty((CharSequence)s.w())) {
                    v5 = s;
                    if (c.f(zzah.zzb)) {
                        s.b(this.Q(c));
                        v5 = s;
                    }
                }
            }
        }
        v5.j(q7.g);
        v5.a(q7.v);
        if (!TextUtils.isEmpty((CharSequence)q7.p)) {
            v5.i(q7.p);
        }
        final long j = q7.j;
        if (j != 0L) {
            v5.k(j);
        }
        if (!TextUtils.isEmpty((CharSequence)q7.h)) {
            v5.d(q7.h);
        }
        v5.e(q7.o);
        final String i = q7.i;
        if (i != null) {
            v5.c(i);
        }
        v5.g(q7.k);
        v5.p(q7.m);
        if (!TextUtils.isEmpty((CharSequence)q7.l)) {
            v5.l(q7.l);
        }
        final boolean t = q7.t;
        v5.a.a().y();
        v5.C |= (v5.p != t);
        v5.p = t;
        final Boolean w = q7.w;
        v5.a.a().y();
        v5.C |= (e.q((Object)v5.r, (Object)w) ^ true);
        v5.r = w;
        v5.h(q7.x);
        com.google.android.gms.internal.measurement.y.a();
        if (this.J().H((String)null, q2.t0)) {
            final String c3 = q7.C;
            v5.a.a().y();
            v5.C |= (e.q((Object)v5.u, (Object)c3) ^ true);
            v5.u = c3;
        }
        final m g = com.google.android.gms.internal.measurement.m.g;
        ((t8)g.f.zza()).zza();
        if (this.J().H((String)null, q2.l0)) {
            v5.r(q7.y);
        }
        else {
            ((t8)g.f.zza()).zza();
            if (this.J().H((String)null, q2.k0)) {
                v5.r((List)null);
            }
        }
        v5.a.a().y();
        if (v5.C) {
            final j h5 = this.h;
            H((b7)h5);
            h5.E(v5);
        }
        return v5;
    }
    
    public final f J() {
        final h4 q = this.q;
        a.S0((Object)q);
        return q.l;
    }
    
    public final g K(final String s) {
        final g b = re.g.b;
        this.a().y();
        this.c();
        Object o;
        if ((o = this.F.get(s)) == null) {
            final j h = this.h;
            H((b7)h);
            a.S0((Object)s);
            ((u5.w)h).y();
            ((b7)h).z();
            final SQLiteDatabase r = h.R();
            o = null;
            try {
                try {
                    final Cursor cursor = (Cursor)(o = r.rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[] { s }));
                    if (cursor.moveToFirst()) {
                        o = cursor;
                        final String string = cursor.getString(0);
                        cursor.close();
                        o = string;
                    }
                    else {
                        cursor.close();
                        o = "G1";
                    }
                    o = re.g.b((String)o);
                    this.r(s, (g)o);
                }
                finally {
                    if (o != null) {
                        ((Cursor)o).close();
                    }
                }
            }
            catch (final SQLiteException ex) {}
        }
        return (g)o;
    }
    
    public final j L() {
        final j h = this.h;
        H((b7)h);
        return h;
    }
    
    public final k3 M() {
        final k3 i = this.i;
        if (i != null) {
            return i;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }
    
    public final i7 O() {
        final i7 l = this.l;
        H((b7)l);
        return l;
    }
    
    public final n7 P() {
        final h4 q = this.q;
        a.S0((Object)q);
        return q.y();
    }
    
    public final String Q(final g g) {
        if (g.f(zzah.zzb)) {
            final byte[] array = new byte[16];
            this.P().H().nextBytes(array);
            return String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        return null;
    }
    
    public final g4 a() {
        final h4 q = this.q;
        a.S0((Object)q);
        return q.a();
    }
    
    public final void b() {
        this.a().y();
        this.c();
        if (!this.s) {
            this.s = true;
            this.a().y();
            final FileLock a = this.A;
            final int n = 0;
            boolean b = false;
            Label_0227: {
                Label_0151: {
                    if (a != null && a.isValid()) {
                        this.f().s.a("Storage concurrent access okay");
                        break Label_0151;
                    }
                    ((u5.w)this.h).f.getClass();
                    final File file = new File(this.q.f.getFilesDir(), "google_app_measurement.db");
                    try {
                        final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                        this.B = channel;
                        final FileLock tryLock = channel.tryLock();
                        this.A = tryLock;
                        if (tryLock != null) {
                            this.f().s.a("Storage concurrent access okay");
                            b = true;
                            break Label_0227;
                        }
                        this.f().k.a("Storage concurrent data access panic");
                    }
                    catch (final OverlappingFileLockException ex) {
                        this.f().n.b(ex, "Storage lock already acquired");
                    }
                    catch (final IOException ex2) {
                        this.f().k.b(ex2, "Failed to access storage lock file");
                    }
                    catch (final FileNotFoundException ex3) {
                        this.f().k.b(ex3, "Failed to acquire storage lock");
                    }
                }
                b = false;
            }
            if (b) {
                final FileChannel b2 = this.B;
                this.a().y();
                int int1;
                if (b2 != null && b2.isOpen()) {
                    final ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        b2.position(0L);
                        final int read = b2.read(allocate);
                        if (read != 4) {
                            int1 = n;
                            if (read != -1) {
                                this.f().n.b(read, "Unexpected data length. Bytes read");
                                int1 = n;
                            }
                        }
                        else {
                            allocate.flip();
                            int1 = allocate.getInt();
                        }
                    }
                    catch (final IOException ex4) {
                        this.f().k.b(ex4, "Failed to read from channel");
                        int1 = n;
                    }
                }
                else {
                    this.f().k.a("Bad channel to read from");
                    int1 = n;
                }
                final u2 o = this.q.o();
                ((re.h3)o).z();
                final int j = o.j;
                this.a().y();
                if (int1 > j) {
                    this.f().k.c(int1, "Panic: can't downgrade version. Previous, current version", j);
                    return;
                }
                if (int1 < j) {
                    final FileChannel b3 = this.B;
                    this.a().y();
                    Label_0569: {
                        if (b3 != null) {
                            if (b3.isOpen()) {
                                final ByteBuffer allocate2 = ByteBuffer.allocate(4);
                                allocate2.putInt(j);
                                allocate2.flip();
                                try {
                                    b3.truncate(0L);
                                    b3.write(allocate2);
                                    b3.force(true);
                                    if (b3.size() != 4L) {
                                        this.f().k.b(b3.size(), "Error writing to channel. Bytes written");
                                    }
                                    this.f().s.c(int1, "Storage version upgraded. Previous, current version", j);
                                    return;
                                }
                                catch (final IOException ex5) {
                                    this.f().k.b(ex5, "Failed to write to channel");
                                    break Label_0569;
                                }
                            }
                        }
                        this.f().k.a("Bad channel to read from");
                    }
                    this.f().k.c(int1, "Storage version upgrade failed. Previous, current version", j);
                }
            }
        }
    }
    
    public final void c() {
        if (this.r) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }
    
    public final void d(final v4 v4) {
        this.a().y();
        if (TextUtils.isEmpty((CharSequence)v4.z()) && TextUtils.isEmpty((CharSequence)v4.t())) {
            final String v5 = v4.v();
            a.S0((Object)v5);
            this.k(v5, 204, null, null, null);
            return;
        }
        final c7 o = this.o;
        final Uri$Builder uri$Builder = new Uri$Builder();
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = v4.z()))) {
            s = v4.t();
        }
        final p2 f = q2.f;
        final Map<String, String> map = null;
        final Uri$Builder appendQueryParameter = uri$Builder.scheme((String)f.a((Object)null)).encodedAuthority((String)q2.g.a((Object)null)).path("config/app/".concat(String.valueOf(s))).appendQueryParameter("platform", "android");
        ((h4)((u5.w)o).f).l.D();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(68000L)).appendQueryParameter("runtime_version", "0");
        com.google.android.gms.internal.measurement.w.b();
        if (!((h4)((u5.w)o).f).l.H(v4.v(), q2.m0)) {
            uri$Builder.appendQueryParameter("app_instance_id", v4.w());
        }
        final String string = uri$Builder.build().toString();
        try {
            final String v6 = v4.v();
            a.S0((Object)v6);
            final URL url = new URL(string);
            this.f().s.b(v6, "Fetching remote configuration");
            final b4 f2 = this.f;
            H((b7)f2);
            final s2 i = f2.I(v6);
            final b4 f3 = this.f;
            H((b7)f3);
            ((u5.w)f3).y();
            final String s2 = (String)((i)f3.r).getOrDefault((Object)v6, (Object)null);
            Object o2 = map;
            if (i != null) {
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    o2 = new j0.b();
                    ((i)o2).put((Object)"If-Modified-Since", (Object)s2);
                }
                else {
                    o2 = null;
                }
                com.google.android.gms.internal.measurement.w.b();
                if (this.J().H((String)null, q2.y0)) {
                    final b4 f4 = this.f;
                    H((b7)f4);
                    ((u5.w)f4).y();
                    final String s3 = (String)((i)f4.s).getOrDefault((Object)v6, (Object)null);
                    if (!TextUtils.isEmpty((CharSequence)s3)) {
                        Object o3;
                        if ((o3 = o2) == null) {
                            o3 = new j0.b();
                        }
                        o2 = o3;
                        ((Map<String, String>)o2).put("If-None-Match", s3);
                    }
                }
            }
            this.x = true;
            final i3 g = this.g;
            H((b7)g);
            final u5.w w = new u5.w(this);
            ((u5.w)g).y();
            ((b7)g).z();
            ((h4)((u5.w)g).f).a().F((Runnable)new g3(g, v6, url, (byte[])null, (j0.b)o2, (re.e3)w));
        }
        catch (final MalformedURLException ex) {
            this.f().k.c(c3.H(v4.v()), "Failed to parse config URL. Not fetching. appId", string);
        }
    }
    
    public final void e(t t, final q7 q7) {
        a.S0((Object)q7);
        a.P0(q7.f);
        this.a().y();
        this.c();
        final String f = q7.f;
        t a = t;
        final long i = a.i;
        ((q9)com.google.android.gms.internal.measurement.x.g.f.zza()).zza();
        final f j = this.J();
        final p2 h0 = q2.h0;
        final t5 t2 = null;
        if (j.H((String)null, h0)) {
            final re.d3 b = re.d3.b(t);
            this.a().y();
            t5 h2 = t2;
            if (this.H != null) {
                final String k = this.I;
                h2 = t2;
                if (k != null) {
                    if (!k.equals(f)) {
                        h2 = t2;
                    }
                    else {
                        h2 = this.H;
                    }
                }
            }
            n7.L(h2, b.d, false);
            a = b.a();
        }
        H((b7)this.l);
        if (TextUtils.isEmpty((CharSequence)q7.g) && TextUtils.isEmpty((CharSequence)q7.v)) {
            return;
        }
        if (!q7.m) {
            this.I(q7);
            return;
        }
        final List y = q7.y;
        if (y != null) {
            if (!y.contains(a.f)) {
                this.f().r.d(f, "Dropping non-safelisted event. appId, event name, origin", a.f, a.h);
                return;
            }
            final Bundle f2 = a.g.f();
            ((BaseBundle)f2).putLong("ga_safelisted", 1L);
            t = new t(a.f, new r(f2), a.h, a.i);
        }
        else {
            t = a;
        }
        final j h3 = this.h;
        H((b7)h3);
        h3.e0();
        try {
            final j h4 = this.h;
            H((b7)h4);
            yd.a.P0(f);
            ((u5.w)h4).y();
            ((b7)h4).z();
            final long n = lcmp(i, 0L);
            List<re.c> list;
            if (n < 0) {
                ((h4)((u5.w)h4).f).f().n.c(c3.H(f), "Invalid time querying timed out conditional properties", i);
                list = Collections.emptyList();
            }
            else {
                list = h4.b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { f, String.valueOf(i) });
            }
            for (final re.c c : list) {
                if (c != null) {
                    this.f().s.d(c.f, "User property timed out", this.q.r.f(c.h.g), c.h.f());
                    final t l = c.l;
                    if (l != null) {
                        this.u(new t(l, i), q7);
                    }
                    final j h5 = this.h;
                    H((b7)h5);
                    h5.N(f, c.h.g);
                }
            }
            final j h6 = this.h;
            H((b7)h6);
            yd.a.P0(f);
            ((u5.w)h6).y();
            ((b7)h6).z();
            List<Object> list2;
            if (n < 0) {
                ((h4)((u5.w)h6).f).f().n.c(c3.H(f), "Invalid time querying expired conditional properties", i);
                list2 = Collections.emptyList();
            }
            else {
                list2 = h6.b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { f, String.valueOf(i) });
            }
            final ArrayList list3 = new ArrayList<t>(list2.size());
            for (final re.c c2 : list2) {
                if (c2 != null) {
                    this.f().s.d(c2.f, "User property expired", this.q.r.f(c2.h.g), c2.h.f());
                    final j h7 = this.h;
                    H((b7)h7);
                    h7.C(f, c2.h.g);
                    final t p2 = c2.p;
                    if (p2 != null) {
                        list3.add(p2);
                    }
                    final j h8 = this.h;
                    H((b7)h8);
                    h8.N(f, c2.h.g);
                }
            }
            final Iterator<t> iterator3 = list3.iterator();
            while (iterator3.hasNext()) {
                this.u(new t((t)iterator3.next(), i), q7);
            }
            final j h9 = this.h;
            H((b7)h9);
            final String f3 = t.f;
            yd.a.P0(f);
            yd.a.P0(f3);
            ((u5.w)h9).y();
            ((b7)h9).z();
            List<Object> list4;
            if (n < 0) {
                ((h4)((u5.w)h9).f).f().n.d(c3.H(f), "Invalid time querying triggered conditional properties", ((h4)((u5.w)h9).f).r.d(f3), i);
                list4 = Collections.emptyList();
            }
            else {
                list4 = h9.b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { f, f3, String.valueOf(i) });
            }
            final ArrayList list5 = new ArrayList<t>(list4.size());
            for (final re.c c3 : list4) {
                if (c3 != null) {
                    final j7 h10 = c3.h;
                    final String f4 = c3.f;
                    yd.a.S0((Object)f4);
                    final String g = c3.g;
                    final String g2 = h10.g;
                    final Object f5 = h10.f();
                    yd.a.S0(f5);
                    final l7 l2 = new l7(f4, g, i, g2, f5);
                    final j h11 = this.h;
                    H((b7)h11);
                    if (h11.J(l2)) {
                        this.f().s.d(c3.f, "User property triggered", this.q.r.f(l2.c), l2.e);
                    }
                    else {
                        this.f().k.d(c3.H(c3.f), "Too many active user properties, ignoring", this.q.r.f(l2.c), l2.e);
                    }
                    final t n2 = c3.n;
                    if (n2 != null) {
                        list5.add(n2);
                    }
                    c3.h = new j7(l2);
                    c3.j = true;
                    final j h12 = this.h;
                    H((b7)h12);
                    h12.I(c3);
                }
            }
            this.u(t, q7);
            final Iterator<t> iterator5 = list5.iterator();
            while (iterator5.hasNext()) {
                t = iterator5.next();
                this.u(new t(t, i), q7);
            }
            final j h13 = this.h;
            H((b7)h13);
            h13.D();
        }
        finally {
            final j h14 = this.h;
            H((b7)h14);
            h14.f0();
        }
    }
    
    public final c3 f() {
        final h4 q = this.q;
        a.S0((Object)q);
        return q.f();
    }
    
    public final wd.c g() {
        final h4 q = this.q;
        a.S0((Object)q);
        return (wd.c)q.s;
    }
    
    public final void h(final t t, final String s) {
        final j h = this.h;
        H((b7)h);
        final v4 s2 = h.S(s);
        if (s2 != null && !TextUtils.isEmpty((CharSequence)s2.x())) {
            final Boolean z = this.z(s2);
            if (z == null) {
                if (!"_ui".equals(t.f)) {
                    this.f().n.b(c3.H(s), "Could not find package. appId");
                }
            }
            else if (!z) {
                this.f().k.b(c3.H(s), "App version does not match; dropping event. appId");
                return;
            }
            final String z2 = s2.z();
            final String x = s2.x();
            final long s3 = s2.s();
            s2.a.a().y();
            final String l = s2.l;
            s2.a.a().y();
            final long m = s2.m;
            s2.a.a().y();
            final long n = s2.n;
            s2.a.a().y();
            final boolean o = s2.o;
            final String y = s2.y();
            s2.a.a().y();
            s2.a.a().y();
            final boolean p2 = s2.p;
            final String t2 = s2.t();
            s2.a.a().y();
            final Boolean r = s2.r;
            s2.a.a().y();
            final long s4 = s2.s;
            s2.a.a().y();
            this.j(t, new q7(s, z2, x, s3, l, m, n, (String)null, o, false, y, 0L, 0, p2, false, t2, r, s4, (List)s2.t, this.K(s).e(), "", (String)null));
            return;
        }
        this.f().r.b(s, "No app data available; dropping event");
    }
    
    public final v7.a i() {
        throw null;
    }
    
    public final void j(final t p0, final q7 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        re/q7.f:Ljava/lang/String;
        //     4: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //     7: aload_1        
        //     8: invokestatic    re/d3.b:(Lre/t;)Lre/d3;
        //    11: astore_3       
        //    12: aload_0        
        //    13: invokevirtual   re/g7.P:()Lre/n7;
        //    16: astore          4
        //    18: aload_3        
        //    19: getfield        re/d3.d:Landroid/os/Bundle;
        //    22: astore          5
        //    24: aload_0        
        //    25: getfield        re/g7.h:Lre/j;
        //    28: astore          6
        //    30: aload           6
        //    32: invokestatic    re/g7.H:(Lre/b7;)V
        //    35: aload_2        
        //    36: getfield        re/q7.f:Ljava/lang/String;
        //    39: astore          7
        //    41: aload           6
        //    43: invokevirtual   u5/w.y:()V
        //    46: aload           6
        //    48: invokevirtual   re/b7.z:()V
        //    51: aconst_null    
        //    52: astore          8
        //    54: aconst_null    
        //    55: astore          9
        //    57: aload           6
        //    59: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //    62: ldc_w           "select parameters from default_event_params where app_id=?"
        //    65: iconst_1       
        //    66: anewarray       Ljava/lang/String;
        //    69: dup            
        //    70: iconst_0       
        //    71: aload           7
        //    73: aastore        
        //    74: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    77: astore_1       
        //    78: aload_1        
        //    79: astore          8
        //    81: aload_1        
        //    82: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    87: ifne            116
        //    90: aload_1        
        //    91: astore          8
        //    93: aload           6
        //    95: getfield        u5/w.f:Ljava/lang/Object;
        //    98: checkcast       Lre/h4;
        //   101: invokevirtual   re/h4.f:()Lre/c3;
        //   104: getfield        re/c3.s:Lre/a3;
        //   107: ldc_w           "Default event parameters not found"
        //   110: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   113: goto            448
        //   116: aload_1        
        //   117: astore          8
        //   119: aload_1        
        //   120: iconst_0       
        //   121: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   126: astore          10
        //   128: aload_1        
        //   129: astore          8
        //   131: invokestatic    ke/e3.v:()Lke/d3;
        //   134: aload           10
        //   136: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //   139: checkcast       Lke/d3;
        //   142: invokevirtual   ke/z5.j:()Lke/c6;
        //   145: checkcast       Lke/e3;
        //   148: astore          10
        //   150: aload_1        
        //   151: astore          8
        //   153: aload           6
        //   155: getfield        re/a7.g:Lre/g7;
        //   158: invokevirtual   re/g7.O:()Lre/i7;
        //   161: pop            
        //   162: aload_1        
        //   163: astore          8
        //   165: aload           10
        //   167: invokevirtual   ke/e3.z:()Lke/h6;
        //   170: astore          10
        //   172: aload_1        
        //   173: astore          8
        //   175: new             Landroid/os/Bundle;
        //   178: astore          7
        //   180: aload_1        
        //   181: astore          8
        //   183: aload           7
        //   185: invokespecial   android/os/Bundle.<init>:()V
        //   188: aload_1        
        //   189: astore          8
        //   191: aload           10
        //   193: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   198: astore          11
        //   200: aload_1        
        //   201: astore          8
        //   203: aload           11
        //   205: invokeinterface java/util/Iterator.hasNext:()Z
        //   210: ifeq            354
        //   213: aload_1        
        //   214: astore          8
        //   216: aload           11
        //   218: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   223: checkcast       Lke/i3;
        //   226: astore          12
        //   228: aload_1        
        //   229: astore          8
        //   231: aload           12
        //   233: invokevirtual   ke/i3.x:()Ljava/lang/String;
        //   236: astore          10
        //   238: aload_1        
        //   239: astore          8
        //   241: aload           12
        //   243: invokevirtual   ke/i3.K:()Z
        //   246: ifeq            267
        //   249: aload_1        
        //   250: astore          8
        //   252: aload           7
        //   254: aload           10
        //   256: aload           12
        //   258: invokevirtual   ke/i3.r:()D
        //   261: invokevirtual   android/os/BaseBundle.putDouble:(Ljava/lang/String;D)V
        //   264: goto            200
        //   267: aload_1        
        //   268: astore          8
        //   270: aload           12
        //   272: invokevirtual   ke/i3.L:()Z
        //   275: ifeq            296
        //   278: aload_1        
        //   279: astore          8
        //   281: aload           7
        //   283: aload           10
        //   285: aload           12
        //   287: invokevirtual   ke/i3.s:()F
        //   290: invokevirtual   android/os/Bundle.putFloat:(Ljava/lang/String;F)V
        //   293: goto            200
        //   296: aload_1        
        //   297: astore          8
        //   299: aload           12
        //   301: invokevirtual   ke/i3.O:()Z
        //   304: ifeq            325
        //   307: aload_1        
        //   308: astore          8
        //   310: aload           7
        //   312: aload           10
        //   314: aload           12
        //   316: invokevirtual   ke/i3.y:()Ljava/lang/String;
        //   319: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   322: goto            200
        //   325: aload_1        
        //   326: astore          8
        //   328: aload           12
        //   330: invokevirtual   ke/i3.M:()Z
        //   333: ifeq            200
        //   336: aload_1        
        //   337: astore          8
        //   339: aload           7
        //   341: aload           10
        //   343: aload           12
        //   345: invokevirtual   ke/i3.u:()J
        //   348: invokevirtual   android/os/BaseBundle.putLong:(Ljava/lang/String;J)V
        //   351: goto            200
        //   354: aload_1        
        //   355: invokeinterface android/database/Cursor.close:()V
        //   360: aload           7
        //   362: astore          8
        //   364: goto            458
        //   367: astore          10
        //   369: aload_1        
        //   370: astore          8
        //   372: aload           6
        //   374: getfield        u5/w.f:Ljava/lang/Object;
        //   377: checkcast       Lre/h4;
        //   380: invokevirtual   re/h4.f:()Lre/c3;
        //   383: getfield        re/c3.k:Lre/a3;
        //   386: aload           7
        //   388: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //   391: ldc_w           "Failed to retrieve default event parameters. appId"
        //   394: aload           10
        //   396: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   399: goto            448
        //   402: astore          7
        //   404: goto            415
        //   407: astore_1       
        //   408: goto            615
        //   411: astore          7
        //   413: aconst_null    
        //   414: astore_1       
        //   415: aload_1        
        //   416: astore          8
        //   418: aload           6
        //   420: getfield        u5/w.f:Ljava/lang/Object;
        //   423: checkcast       Lre/h4;
        //   426: invokevirtual   re/h4.f:()Lre/c3;
        //   429: getfield        re/c3.k:Lre/a3;
        //   432: aload           7
        //   434: ldc_w           "Error selecting default event parameters"
        //   437: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   440: aload           9
        //   442: astore          8
        //   444: aload_1        
        //   445: ifnull          458
        //   448: aload_1        
        //   449: invokeinterface android/database/Cursor.close:()V
        //   454: aload           9
        //   456: astore          8
        //   458: aload           4
        //   460: aload           5
        //   462: aload           8
        //   464: invokevirtual   re/n7.M:(Landroid/os/Bundle;Landroid/os/Bundle;)V
        //   467: aload_0        
        //   468: invokevirtual   re/g7.P:()Lre/n7;
        //   471: astore          8
        //   473: aload_0        
        //   474: invokevirtual   re/g7.J:()Lre/f;
        //   477: astore_1       
        //   478: aload_2        
        //   479: getfield        re/q7.f:Ljava/lang/String;
        //   482: astore          7
        //   484: aload_1        
        //   485: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   488: pop            
        //   489: aload           8
        //   491: aload_3        
        //   492: aload_1        
        //   493: aload           7
        //   495: getstatic       re/q2.I:Lre/p2;
        //   498: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //   501: bipush          100
        //   503: invokestatic    java/lang/Math.min:(II)I
        //   506: bipush          25
        //   508: invokestatic    java/lang/Math.max:(II)I
        //   511: invokevirtual   re/n7.N:(Lre/d3;I)V
        //   514: aload_3        
        //   515: invokevirtual   re/d3.a:()Lre/t;
        //   518: astore          8
        //   520: ldc_w           "_cmp"
        //   523: aload           8
        //   525: getfield        re/t.f:Ljava/lang/String;
        //   528: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   531: ifne            537
        //   534: goto            606
        //   537: ldc_w           "referrer API v2"
        //   540: aload           8
        //   542: getfield        re/t.g:Lre/r;
        //   545: getfield        re/r.f:Landroid/os/Bundle;
        //   548: ldc_w           "_cis"
        //   551: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   554: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   557: ifeq            606
        //   560: aload           8
        //   562: getfield        re/t.g:Lre/r;
        //   565: getfield        re/r.f:Landroid/os/Bundle;
        //   568: ldc_w           "gclid"
        //   571: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   574: astore_1       
        //   575: aload_1        
        //   576: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   579: ifne            606
        //   582: aload_0        
        //   583: new             Lre/j7;
        //   586: dup            
        //   587: aload           8
        //   589: getfield        re/t.i:J
        //   592: aload_1        
        //   593: ldc_w           "_lgclid"
        //   596: ldc_w           "auto"
        //   599: invokespecial   re/j7.<init>:(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
        //   602: aload_2        
        //   603: invokevirtual   re/g7.s:(Lre/j7;Lre/q7;)V
        //   606: aload_0        
        //   607: aload           8
        //   609: aload_2        
        //   610: invokevirtual   re/g7.e:(Lre/t;Lre/q7;)V
        //   613: return         
        //   614: astore_1       
        //   615: aload           8
        //   617: ifnull          627
        //   620: aload           8
        //   622: invokeinterface android/database/Cursor.close:()V
        //   627: aload_1        
        //   628: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  57     78     411    415    Landroid/database/sqlite/SQLiteException;
        //  57     78     407    411    Any
        //  81     90     402    407    Landroid/database/sqlite/SQLiteException;
        //  81     90     614    615    Any
        //  93     113    402    407    Landroid/database/sqlite/SQLiteException;
        //  93     113    614    615    Any
        //  119    128    402    407    Landroid/database/sqlite/SQLiteException;
        //  119    128    614    615    Any
        //  131    150    367    402    Ljava/io/IOException;
        //  131    150    402    407    Landroid/database/sqlite/SQLiteException;
        //  131    150    614    615    Any
        //  153    162    402    407    Landroid/database/sqlite/SQLiteException;
        //  153    162    614    615    Any
        //  165    172    402    407    Landroid/database/sqlite/SQLiteException;
        //  165    172    614    615    Any
        //  175    180    402    407    Landroid/database/sqlite/SQLiteException;
        //  175    180    614    615    Any
        //  183    188    402    407    Landroid/database/sqlite/SQLiteException;
        //  183    188    614    615    Any
        //  191    200    402    407    Landroid/database/sqlite/SQLiteException;
        //  191    200    614    615    Any
        //  203    213    402    407    Landroid/database/sqlite/SQLiteException;
        //  203    213    614    615    Any
        //  216    228    402    407    Landroid/database/sqlite/SQLiteException;
        //  216    228    614    615    Any
        //  231    238    402    407    Landroid/database/sqlite/SQLiteException;
        //  231    238    614    615    Any
        //  241    249    402    407    Landroid/database/sqlite/SQLiteException;
        //  241    249    614    615    Any
        //  252    264    402    407    Landroid/database/sqlite/SQLiteException;
        //  252    264    614    615    Any
        //  270    278    402    407    Landroid/database/sqlite/SQLiteException;
        //  270    278    614    615    Any
        //  281    293    402    407    Landroid/database/sqlite/SQLiteException;
        //  281    293    614    615    Any
        //  299    307    402    407    Landroid/database/sqlite/SQLiteException;
        //  299    307    614    615    Any
        //  310    322    402    407    Landroid/database/sqlite/SQLiteException;
        //  310    322    614    615    Any
        //  328    336    402    407    Landroid/database/sqlite/SQLiteException;
        //  328    336    614    615    Any
        //  339    351    402    407    Landroid/database/sqlite/SQLiteException;
        //  339    351    614    615    Any
        //  372    399    402    407    Landroid/database/sqlite/SQLiteException;
        //  372    399    614    615    Any
        //  418    440    614    615    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0116:
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
    
    public final void k(String s, int n, final Throwable t, final byte[] array, final Map map) {
        this.a().y();
        this.c();
        a.P0(s);
        byte[] array2 = array;
        Label_0029: {
            if (array != null) {
                break Label_0029;
            }
            try {
                array2 = new byte[0];
                final a3 s2 = this.f().s;
                final Integer value = array2.length;
                s2.b(value, "onConfigFetched. Response size");
                final j h = this.h;
                H((b7)h);
                h.e0();
                Label_0753: {
                    Label_0717: {
                        v4 s3;
                        int n3;
                        try {
                            final j h2 = this.h;
                            H((b7)h2);
                            s3 = h2.S(s);
                            final int n2 = 1;
                            n3 = n;
                            Label_0148: {
                                int n4 = 0;
                                Label_0142: {
                                    if (n != 200 && (n3 = n) != 204) {
                                        if ((n4 = n) != 304) {
                                            break Label_0142;
                                        }
                                        n3 = 304;
                                    }
                                    n4 = n3;
                                    if (t == null) {
                                        n = 1;
                                        break Label_0148;
                                    }
                                }
                                n = 0;
                                n3 = n4;
                            }
                            if (s3 == null) {
                                this.f().n.b(c3.H(s), "App does not exist in onConfigFetched. appId");
                                break Label_0717;
                            }
                            if (n == 0) {
                                if (n3 != 404) {
                                    ((k)this.g()).getClass();
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    s3.a.a().y();
                                    final boolean c = s3.C;
                                    if (s3.E != currentTimeMillis) {
                                        n = n2;
                                    }
                                    else {
                                        n = 0;
                                    }
                                    s3.C = (((c ? 1 : 0) | n) != 0x0);
                                    s3.E = currentTimeMillis;
                                    final j h3 = this.h;
                                    H((b7)h3);
                                    h3.E(s3);
                                    this.f().s.c(n3, "Fetching config failed. code, error", t);
                                    final b4 f = this.f;
                                    H((b7)f);
                                    ((u5.w)f).y();
                                    ((i)f.r).put((Object)s, (Object)null);
                                    s = (String)this.n.m;
                                    ((k)this.g()).getClass();
                                    ((re.n3)s).b(System.currentTimeMillis());
                                    if (n3 == 503 || n3 == 429) {
                                        s = (String)this.n.k;
                                        ((k)this.g()).getClass();
                                        ((re.n3)s).b(System.currentTimeMillis());
                                    }
                                    this.C();
                                    break Label_0717;
                                }
                            }
                        }
                        finally {
                            break Label_0753;
                        }
                        List list;
                        if (map != null) {
                            list = map.get("Last-Modified");
                        }
                        else {
                            list = null;
                        }
                        String s4;
                        if (list != null && !list.isEmpty()) {
                            s4 = (String)list.get(0);
                        }
                        else {
                            s4 = null;
                        }
                        com.google.android.gms.internal.measurement.w.b();
                        String s5 = null;
                        Label_0526: {
                            if (this.J().H((String)null, q2.y0)) {
                                List list2;
                                if (map != null) {
                                    list2 = map.get("ETag");
                                }
                                else {
                                    list2 = null;
                                }
                                if (list2 != null && !list2.isEmpty()) {
                                    s5 = (String)list2.get(0);
                                    break Label_0526;
                                }
                            }
                            s5 = null;
                        }
                        if (n3 != 404 && n3 != 304) {
                            final b4 f2 = this.f;
                            H((b7)f2);
                            f2.N(s, s4, s5, array2);
                        }
                        else {
                            final b4 f3 = this.f;
                            H((b7)f3);
                            if (f3.I(s) == null) {
                                final b4 f4 = this.f;
                                H((b7)f4);
                                f4.N(s, (String)null, (String)null, (byte[])null);
                            }
                        }
                        ((k)this.g()).getClass();
                        s3.f(System.currentTimeMillis());
                        final j h4 = this.h;
                        H((b7)h4);
                        h4.E(s3);
                        if (n3 == 404) {
                            this.f().p.b(s, "Config not found. Using empty config. appId");
                        }
                        else {
                            this.f().s.c(n3, "Successfully fetched config. Got network response. code, size", value);
                        }
                        final i3 g = this.g;
                        H((b7)g);
                        if (g.C() && this.E()) {
                            this.t();
                        }
                        else {
                            this.C();
                        }
                    }
                    final j h5 = this.h;
                    H((b7)h5);
                    h5.D();
                    final j h6 = this.h;
                    H((b7)h6);
                    h6.f0();
                    return;
                }
                final j h7 = this.h;
                H((b7)h7);
                h7.f0();
            }
            finally {
                this.x = false;
                this.A();
            }
        }
    }
    
    public final void l(final q7 q7) {
        this.a().y();
        this.c();
        a.S0((Object)q7);
        a.P0(q7.f);
        if (G(q7)) {
            final j h = this.h;
            H((b7)h);
            final v4 s = h.S(q7.f);
            if (s != null && TextUtils.isEmpty((CharSequence)s.z()) && !TextUtils.isEmpty((CharSequence)q7.g)) {
                s.f(0L);
                final j h2 = this.h;
                H((b7)h2);
                h2.E(s);
                final b4 f = this.f;
                H((b7)f);
                final String f2 = q7.f;
                ((u5.w)f).y();
                ((i)f.m).remove((Object)f2);
            }
            if (!q7.m) {
                this.I(q7);
                return;
            }
            long n;
            if ((n = q7.r) == 0L) {
                ((k)this.g()).getClass();
                n = System.currentTimeMillis();
            }
            final n n2 = this.q.n();
            ((u5.w)n2).y();
            n2.k = null;
            n2.l = 0L;
            int s2;
            final int n3 = s2 = q7.s;
            if (n3 != 0 && (s2 = n3) != 1) {
                this.f().n.c(c3.H(q7.f), "Incorrect app type, assuming installed app. appId, appType", n3);
                s2 = 0;
            }
            final j h3 = this.h;
            H((b7)h3);
            h3.e0();
            try {
                final j h4 = this.h;
                H((b7)h4);
                final l7 x = h4.X(q7.f, "_npa");
                if (x == null || "auto".equals(x.b)) {
                    final Boolean w = q7.w;
                    if (w != null) {
                        long n4;
                        if (!w) {
                            n4 = 0L;
                        }
                        else {
                            n4 = 1L;
                        }
                        final j7 j7 = new j7(n, (Object)n4, "_npa", "auto");
                        if (x == null || !x.e.equals(j7.i)) {
                            this.s(j7, q7);
                        }
                    }
                    else if (x != null) {
                        this.n(new j7(n, (Object)null, "_npa", "auto"), q7);
                    }
                }
                final j h5 = this.h;
                H((b7)h5);
                final String f3 = q7.f;
                a.S0((Object)f3);
                final v4 s3 = h5.S(f3);
                v4 v4;
                if ((v4 = s3) != null) {
                    final n7 p = this.P();
                    final String g = q7.g;
                    final String z = s3.z();
                    final String v5 = q7.v;
                    final String t = s3.t();
                    p.getClass();
                    v4 = s3;
                    if (n7.n0(g, z, v5, t)) {
                        this.f().n.b(c3.H(s3.v()), "New GMP App Id passed in. Removing cached database data. appId");
                        final j h6 = this.h;
                        H((b7)h6);
                        final String v6 = s3.v();
                        ((b7)h6).z();
                        ((u5.w)h6).y();
                        a.P0(v6);
                        try {
                            final SQLiteDatabase r = h6.R();
                            final String[] array = { v6 };
                            final int n5 = r.delete("events", "app_id=?", array) + r.delete("user_attributes", "app_id=?", array) + r.delete("conditional_properties", "app_id=?", array) + r.delete("apps", "app_id=?", array) + r.delete("raw_events", "app_id=?", array) + r.delete("raw_events_metadata", "app_id=?", array) + r.delete("event_filters", "app_id=?", array) + r.delete("property_filters", "app_id=?", array) + r.delete("audience_filter_values", "app_id=?", array) + r.delete("consent_settings", "app_id=?", array);
                            if (n5 > 0) {
                                ((h4)((u5.w)h6).f).f().s.c(v6, "Deleted application data. app, records", n5);
                            }
                        }
                        catch (final SQLiteException ex) {
                            ((h4)((u5.w)h6).f).f().k.c(c3.H(v6), "Error deleting application data. appId, error", ex);
                        }
                        v4 = null;
                    }
                }
                if (v4 != null) {
                    final boolean b = v4.s() != -2147483648L && v4.s() != q7.o;
                    final String x2 = v4.x();
                    if (b | (v4.s() == -2147483648L && x2 != null && !x2.equals(q7.h))) {
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("_pv", x2);
                        this.e(new t("_au", new r(bundle), "auto", n), q7);
                    }
                }
                this.I(q7);
                p p2;
                boolean b2;
                if (s2 == 0) {
                    final j h7 = this.h;
                    H((b7)h7);
                    p2 = h7.W(q7.f, "_f");
                    b2 = false;
                }
                else {
                    final j h8 = this.h;
                    H((b7)h8);
                    p2 = h8.W(q7.f, "_v");
                    b2 = true;
                }
                if (p2 == null) {
                    final long n6 = (n / 3600000L + 1L) * 3600000L;
                    if (!b2) {
                        this.s(new j7(n, (Object)n6, "_fot", "auto"), q7);
                        this.a().y();
                        final t3 p3 = this.p;
                        a.S0((Object)p3);
                        final String f4 = q7.f;
                        if (f4 != null && !f4.isEmpty()) {
                            p3.a.a().y();
                            if (!p3.a()) {
                                p3.a.f().q.a("Install Referrer Reporter is not available");
                            }
                            else {
                                final s3 s4 = new s3(p3, f4);
                                p3.a.a().y();
                                final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                final PackageManager packageManager = p3.a.f.getPackageManager();
                                if (packageManager == null) {
                                    p3.a.f().o.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                                else {
                                    final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                        final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            final String packageName = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(packageName) && p3.a()) {
                                                final Intent intent2 = new Intent(intent);
                                                try {
                                                    final boolean a = vd.a.b().a(p3.a.f, intent2, (ServiceConnection)s4, 1);
                                                    final a3 s5 = p3.a.f().s;
                                                    String s6;
                                                    if (!a) {
                                                        s6 = "not available";
                                                    }
                                                    else {
                                                        s6 = "available";
                                                    }
                                                    s5.b(s6, "Install Referrer Service is");
                                                }
                                                catch (final RuntimeException ex2) {
                                                    p3.a.f().k.b(ex2.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                }
                                            }
                                            else {
                                                p3.a.f().n.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                    else {
                                        p3.a.f().q.a("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                }
                            }
                        }
                        else {
                            p3.a.f().o.a("Install Referrer Reporter was called with invalid app package name");
                        }
                        this.a().y();
                        this.c();
                        final Bundle bundle2 = new Bundle();
                        ((BaseBundle)bundle2).putLong("_c", 1L);
                        ((BaseBundle)bundle2).putLong("_r", 1L);
                        ((BaseBundle)bundle2).putLong("_uwa", 0L);
                        ((BaseBundle)bundle2).putLong("_pfo", 0L);
                        ((BaseBundle)bundle2).putLong("_sys", 0L);
                        ((BaseBundle)bundle2).putLong("_sysu", 0L);
                        ((BaseBundle)bundle2).putLong("_et", 1L);
                        if (q7.u) {
                            ((BaseBundle)bundle2).putLong("_dac", 1L);
                        }
                        final String f5 = q7.f;
                        a.S0((Object)f5);
                        final j h9 = this.h;
                        H((b7)h9);
                        a.P0(f5);
                        ((u5.w)h9).y();
                        ((b7)h9).z();
                        long p4 = h9.P(f5);
                        long n7;
                        if (this.q.f.getPackageManager() == null) {
                            this.f().k.b(c3.H(f5), "PackageManager is null, first open report might be inaccurate. appId");
                            n7 = p4;
                        }
                        else {
                            Object o;
                            try {
                                o = yd.c.a(this.q.f).b(0, f5);
                            }
                            catch (final PackageManager$NameNotFoundException ex3) {
                                this.f().k.c(c3.H(f5), "Package info is null, first open report might be inaccurate. appId", ex3);
                                o = null;
                            }
                            if (o != null) {
                                final long firstInstallTime = ((PackageInfo)o).firstInstallTime;
                                if (firstInstallTime != 0L) {
                                    boolean b3;
                                    if (firstInstallTime != ((PackageInfo)o).lastUpdateTime) {
                                        long n8;
                                        if (this.J().H((String)null, q2.b0)) {
                                            n8 = p4;
                                            if (p4 == 0L) {
                                                ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                                n8 = 0L;
                                            }
                                        }
                                        else {
                                            ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                            n8 = p4;
                                        }
                                        b3 = false;
                                        p4 = n8;
                                    }
                                    else {
                                        b3 = true;
                                    }
                                    o = new(re.j7.class)();
                                    long n9;
                                    if (!b3) {
                                        n9 = 0L;
                                    }
                                    else {
                                        n9 = 1L;
                                    }
                                    new j7(n, (Object)n9, "_fi", "auto");
                                    this.s((j7)o, q7);
                                }
                            }
                            try {
                                o = yd.c.a(this.q.f);
                                try {
                                    final ApplicationInfo a2 = ((yd.b)o).a(0, f5);
                                }
                                catch (final PackageManager$NameNotFoundException o) {}
                            }
                            catch (final PackageManager$NameNotFoundException ex4) {}
                            this.f().k.c(c3.H(f5), "Application info is null, first open report might be inaccurate. appId", o);
                            final ApplicationInfo a2 = null;
                            n7 = p4;
                            if (a2 != null) {
                                if ((a2.flags & 0x1) != 0x0) {
                                    ((BaseBundle)bundle2).putLong("_sys", 1L);
                                }
                                n7 = p4;
                                if ((a2.flags & 0x80) != 0x0) {
                                    ((BaseBundle)bundle2).putLong("_sysu", 1L);
                                    n7 = p4;
                                }
                            }
                        }
                        if (n7 >= 0L) {
                            ((BaseBundle)bundle2).putLong("_pfo", n7);
                        }
                        this.j(new t("_f", new r(bundle2), "auto", n), q7);
                    }
                    else {
                        this.s(new j7(n, (Object)n6, "_fvt", "auto"), q7);
                        this.a().y();
                        this.c();
                        final Bundle bundle3 = new Bundle();
                        ((BaseBundle)bundle3).putLong("_c", 1L);
                        ((BaseBundle)bundle3).putLong("_r", 1L);
                        ((BaseBundle)bundle3).putLong("_et", 1L);
                        if (q7.u) {
                            ((BaseBundle)bundle3).putLong("_dac", 1L);
                        }
                        this.j(new t("_v", new r(bundle3), "auto", n), q7);
                    }
                }
                else if (q7.n) {
                    this.j(new t("_cd", new r(new Bundle()), "auto", n), q7);
                }
                final j h10 = this.h;
                H((b7)h10);
                h10.D();
            }
            finally {
                final j h11 = this.h;
                H((b7)h11);
                h11.f0();
            }
        }
    }
    
    public final void m(final re.c c, final q7 q7) {
        a.S0((Object)c);
        a.P0(c.f);
        a.S0((Object)c.h);
        a.P0(c.h.g);
        this.a().y();
        this.c();
        if (!G(q7)) {
            return;
        }
        if (q7.m) {
            final j h = this.h;
            H((b7)h);
            h.e0();
            try {
                this.I(q7);
                final String f = c.f;
                a.S0((Object)f);
                final j h2 = this.h;
                H((b7)h2);
                final re.c t = h2.T(f, c.h.g);
                if (t != null) {
                    this.f().r.c(c.f, "Removing conditional user property", this.q.r.f(c.h.g));
                    final j h3 = this.h;
                    H((b7)h3);
                    h3.N(f, c.h.g);
                    if (t.j) {
                        final j h4 = this.h;
                        H((b7)h4);
                        h4.C(f, c.h.g);
                    }
                    final t p2 = c.p;
                    if (p2 != null) {
                        final r g = p2.g;
                        Bundle f2;
                        if (g != null) {
                            f2 = g.f();
                        }
                        else {
                            f2 = null;
                        }
                        final n7 p3 = this.P();
                        final t p4 = c.p;
                        a.S0((Object)p4);
                        final t e0 = p3.E0(p4.f, f2, t.g, c.p.i, true);
                        a.S0((Object)e0);
                        this.u(e0, q7);
                    }
                }
                else {
                    this.f().n.c(c3.H(c.f), "Conditional user property doesn't exist", this.q.r.f(c.h.g));
                }
                final j h5 = this.h;
                H((b7)h5);
                h5.D();
                return;
            }
            finally {
                final j h6 = this.h;
                H((b7)h6);
                h6.f0();
            }
        }
        this.I(q7);
    }
    
    public final void n(final j7 j7, final q7 q7) {
        this.a().y();
        this.c();
        if (!G(q7)) {
            return;
        }
        if (!q7.m) {
            this.I(q7);
            return;
        }
        if ("_npa".equals(j7.g) && q7.w != null) {
            this.f().r.a("Falling back to manifest metadata value for ad personalization");
            ((k)this.g()).getClass();
            final long currentTimeMillis = System.currentTimeMillis();
            long n;
            if (!q7.w) {
                n = 0L;
            }
            else {
                n = 1L;
            }
            this.s(new j7(currentTimeMillis, (Object)n, "_npa", "auto"), q7);
            return;
        }
        this.f().r.b(this.q.r.f(j7.g), "Removing user property");
        final j h = this.h;
        H((b7)h);
        h.e0();
        try {
            this.I(q7);
            if ("_id".equals(j7.g)) {
                final j h2 = this.h;
                H((b7)h2);
                final String f = q7.f;
                a.S0((Object)f);
                h2.C(f, "_lair");
            }
            final j h3 = this.h;
            H((b7)h3);
            final String f2 = q7.f;
            a.S0((Object)f2);
            h3.C(f2, j7.g);
            final j h4 = this.h;
            H((b7)h4);
            h4.D();
            this.f().r.b(this.q.r.f(j7.g), "User property removed");
        }
        finally {
            final j h5 = this.h;
            H((b7)h5);
            h5.f0();
        }
    }
    
    public final void o(final q7 q7) {
        if (this.C != null) {
            (this.D = new ArrayList()).addAll(this.C);
        }
        final j h = this.h;
        H((b7)h);
        final String f = q7.f;
        a.S0((Object)f);
        a.P0(f);
        ((u5.w)h).y();
        ((b7)h).z();
        try {
            final SQLiteDatabase r = h.R();
            final String[] array = { f };
            final int n = r.delete("apps", "app_id=?", array) + r.delete("events", "app_id=?", array) + r.delete("user_attributes", "app_id=?", array) + r.delete("conditional_properties", "app_id=?", array) + r.delete("raw_events", "app_id=?", array) + r.delete("raw_events_metadata", "app_id=?", array) + r.delete("queue", "app_id=?", array) + r.delete("audience_filter_values", "app_id=?", array) + r.delete("main_event_params", "app_id=?", array) + r.delete("default_event_params", "app_id=?", array);
            if (n > 0) {
                ((h4)((u5.w)h).f).f().s.c(f, "Reset analytics data. app, records", n);
            }
        }
        catch (final SQLiteException ex) {
            ((h4)((u5.w)h).f).f().k.c(c3.H(f), "Error resetting analytics data. appId, error", ex);
        }
        if (q7.m) {
            this.l(q7);
        }
    }
    
    public final void p(re.c c, final q7 q7) {
        a.S0((Object)c);
        a.P0(c.f);
        a.S0((Object)c.g);
        a.S0((Object)c.h);
        a.P0(c.h.g);
        this.a().y();
        this.c();
        if (!G(q7)) {
            return;
        }
        if (!q7.m) {
            this.I(q7);
            return;
        }
        c = new re.c(c);
        boolean b = false;
        c.j = false;
        final j h = this.h;
        H((b7)h);
        h.e0();
        try {
            final j h2 = this.h;
            H((b7)h2);
            final String f = c.f;
            a.S0((Object)f);
            final re.c t = h2.T(f, c.h.g);
            if (t != null && !t.g.equals(c.g)) {
                this.f().n.d(this.q.r.f(c.h.g), "Updating a conditional user property with different origin. name, origin, origin (from DB)", c.g, t.g);
            }
            if (t != null && t.j) {
                c.g = t.g;
                c.i = t.i;
                c.m = t.m;
                c.k = t.k;
                c.n = t.n;
                c.j = true;
                final j7 h3 = c.h;
                c.h = new j7(t.h.h, h3.f(), h3.g, t.h.k);
            }
            else if (TextUtils.isEmpty((CharSequence)c.k)) {
                final j7 h4 = c.h;
                c.h = new j7(c.i, h4.f(), h4.g, c.h.k);
                c.j = true;
                b = true;
            }
            if (c.j) {
                final j7 h5 = c.h;
                final String f2 = c.f;
                a.S0((Object)f2);
                final String g = c.g;
                final String g2 = h5.g;
                final long h6 = h5.h;
                final Object f3 = h5.f();
                a.S0(f3);
                final l7 l7 = new l7(f2, g, h6, g2, f3);
                final j h7 = this.h;
                H((b7)h7);
                if (h7.J(l7)) {
                    this.f().r.d(c.f, "User property updated immediately", this.q.r.f(l7.c), l7.e);
                }
                else {
                    this.f().k.d(c3.H(c.f), "(2)Too many active user properties, ignoring", this.q.r.f(l7.c), l7.e);
                }
                if (b) {
                    final t n = c.n;
                    if (n != null) {
                        this.u(new t(n, c.i), q7);
                    }
                }
            }
            final j h8 = this.h;
            H((b7)h8);
            if (h8.I(c)) {
                this.f().r.d(c.f, "Conditional property added", this.q.r.f(c.h.g), c.h.f());
            }
            else {
                this.f().k.d(c3.H(c.f), "Too many conditional properties, ignoring", this.q.r.f(c.h.g), c.h.f());
            }
            final j h9 = this.h;
            H((b7)h9);
            h9.D();
        }
        finally {
            final j h10 = this.h;
            H((b7)h10);
            h10.f0();
        }
    }
    
    public final Context q() {
        return this.q.f;
    }
    
    public final void r(final String s, final g g) {
        this.a().y();
        this.c();
        this.F.put(s, g);
        final j h = this.h;
        H((b7)h);
        a.S0((Object)s);
        ((u5.w)h).y();
        ((b7)h).z();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("consent_state", g.e());
        try {
            if (h.R().insertWithOnConflict("consent_settings", (String)null, contentValues, 5) == -1L) {
                ((h4)((u5.w)h).f).f().k.b(c3.H(s), "Failed to insert/update consent setting (got -1). appId");
            }
        }
        catch (final SQLiteException ex) {
            ((h4)((u5.w)h).f).f().k.c(c3.H(s), "Error storing consent setting. appId, error", ex);
        }
    }
    
    public final void s(final j7 j7, final q7 q7) {
        this.a().y();
        this.c();
        if (!G(q7)) {
            return;
        }
        if (!q7.m) {
            this.I(q7);
            return;
        }
        final int x0 = this.P().x0(j7.g);
        final int n = 0;
        if (x0 != 0) {
            final n7 p2 = this.P();
            final String g = j7.g;
            this.J();
            p2.getClass();
            final String f = n7.F(24, g, true);
            final String g2 = j7.g;
            int length;
            if (g2 != null) {
                length = g2.length();
            }
            else {
                length = 0;
            }
            final n7 p3 = this.P();
            final c i = this.J;
            final String f2 = q7.f;
            p3.getClass();
            n7.O((m7)i, f2, x0, "_ev", f, length);
            return;
        }
        final int t0 = this.P().t0(j7.f(), j7.g);
        if (t0 != 0) {
            final n7 p4 = this.P();
            final String g3 = j7.g;
            this.J();
            p4.getClass();
            final String f3 = n7.F(24, g3, true);
            final Object f4 = j7.f();
            int length2 = n;
            Label_0242: {
                if (f4 != null) {
                    if (!(f4 instanceof String)) {
                        length2 = n;
                        if (!(f4 instanceof CharSequence)) {
                            break Label_0242;
                        }
                    }
                    length2 = f4.toString().length();
                }
            }
            final n7 p5 = this.P();
            final c k = this.J;
            final String f5 = q7.f;
            p5.getClass();
            n7.O((m7)k, f5, t0, "_ev", f3, length2);
            return;
        }
        final Object d = this.P().D(j7.f(), j7.g);
        if (d == null) {
            return;
        }
        if ("_sid".equals(j7.g)) {
            final long h = j7.h;
            final String l = j7.k;
            final String f6 = q7.f;
            a.S0((Object)f6);
            final j h2 = this.h;
            H((b7)h2);
            final l7 x2 = h2.X(f6, "_sno");
            long n2 = 0L;
            Label_0482: {
                if (x2 != null) {
                    final Object e = x2.e;
                    if (e instanceof Long) {
                        n2 = (long)e;
                        break Label_0482;
                    }
                }
                if (x2 != null) {
                    this.f().n.b(x2.e, "Retrieved last session number from database does not contain a valid (long) value");
                }
                final j h3 = this.h;
                H((b7)h3);
                final p w = h3.W(f6, "_s");
                if (w != null) {
                    n2 = w.c;
                    this.f().s.b(n2, "Backfill the session number. Last used session number");
                }
                else {
                    n2 = 0L;
                }
            }
            this.s(new j7(h, (Object)(n2 + 1L), "_sno", l), q7);
        }
        final String f7 = q7.f;
        a.S0((Object)f7);
        final String m = j7.k;
        a.S0((Object)m);
        final l7 l2 = new l7(f7, m, j7.h, j7.g, d);
        this.f().s.c(this.q.r.f(l2.c), "Setting user property", d);
        final j h4 = this.h;
        H((b7)h4);
        h4.e0();
        try {
            if ("_id".equals(l2.c)) {
                final j h5 = this.h;
                H((b7)h5);
                final l7 x3 = h5.X(q7.f, "_id");
                if (x3 != null && !l2.e.equals(x3.e)) {
                    final j h6 = this.h;
                    H((b7)h6);
                    h6.C(q7.f, "_lair");
                }
            }
            this.I(q7);
            final j h7 = this.h;
            H((b7)h7);
            final boolean j8 = h7.J(l2);
            final j h8 = this.h;
            H((b7)h8);
            h8.D();
            if (!j8) {
                this.f().k.c(this.q.r.f(l2.c), "Too many unique user properties are set. Ignoring user property", l2.e);
                final n7 p6 = this.P();
                final c j9 = this.J;
                final String f8 = q7.f;
                p6.getClass();
                n7.O((m7)j9, f8, 9, null, null, 0);
            }
        }
        finally {
            final j h9 = this.h;
            H((b7)h9);
            h9.f0();
        }
    }
    
    public final void t() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   re/g7.a:()Lre/g4;
        //     4: invokevirtual   re/g4.y:()V
        //     7: aload_0        
        //     8: invokevirtual   re/g7.c:()V
        //    11: aload_0        
        //    12: iconst_1       
        //    13: putfield        re/g7.z:Z
        //    16: aload_0        
        //    17: getfield        re/g7.q:Lre/h4;
        //    20: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    23: pop            
        //    24: aload_0        
        //    25: getfield        re/g7.q:Lre/h4;
        //    28: invokevirtual   re/h4.w:()Lre/l6;
        //    31: invokevirtual   re/l6.L:()Ljava/lang/Boolean;
        //    34: astore_1       
        //    35: aload_1        
        //    36: ifnonnull       60
        //    39: aload_0        
        //    40: invokevirtual   re/g7.f:()Lre/c3;
        //    43: invokevirtual   re/c3.F:()Lre/a3;
        //    46: ldc_w           "Upload data called on the client side before use of service was decided"
        //    49: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //    52: aload_0        
        //    53: iconst_0       
        //    54: putfield        re/g7.z:Z
        //    57: goto            3744
        //    60: aload_1        
        //    61: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    64: ifeq            88
        //    67: aload_0        
        //    68: invokevirtual   re/g7.f:()Lre/c3;
        //    71: invokevirtual   re/c3.D:()Lre/a3;
        //    74: ldc_w           "Upload called in the client side when service should be used"
        //    77: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //    80: aload_0        
        //    81: iconst_0       
        //    82: putfield        re/g7.z:Z
        //    85: goto            3744
        //    88: aload_0        
        //    89: getfield        re/g7.t:J
        //    92: lconst_0       
        //    93: lcmp           
        //    94: ifle            109
        //    97: aload_0        
        //    98: invokevirtual   re/g7.C:()V
        //   101: aload_0        
        //   102: iconst_0       
        //   103: putfield        re/g7.z:Z
        //   106: goto            3744
        //   109: aload_0        
        //   110: invokevirtual   re/g7.a:()Lre/g4;
        //   113: invokevirtual   re/g4.y:()V
        //   116: aload_0        
        //   117: getfield        re/g7.C:Ljava/util/ArrayList;
        //   120: ifnull          144
        //   123: aload_0        
        //   124: invokevirtual   re/g7.f:()Lre/c3;
        //   127: invokevirtual   re/c3.E:()Lre/a3;
        //   130: ldc_w           "Uploading requested multiple times"
        //   133: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   136: aload_0        
        //   137: iconst_0       
        //   138: putfield        re/g7.z:Z
        //   141: goto            3744
        //   144: aload_0        
        //   145: getfield        re/g7.g:Lre/i3;
        //   148: astore_1       
        //   149: aload_1        
        //   150: invokestatic    re/g7.H:(Lre/b7;)V
        //   153: aload_1        
        //   154: invokevirtual   re/i3.C:()Z
        //   157: ifne            185
        //   160: aload_0        
        //   161: invokevirtual   re/g7.f:()Lre/c3;
        //   164: invokevirtual   re/c3.E:()Lre/a3;
        //   167: ldc_w           "Network not connected, ignoring upload request"
        //   170: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //   173: aload_0        
        //   174: invokevirtual   re/g7.C:()V
        //   177: aload_0        
        //   178: iconst_0       
        //   179: putfield        re/g7.z:Z
        //   182: goto            3744
        //   185: aload_0        
        //   186: invokevirtual   re/g7.g:()Lwd/c;
        //   189: astore_1       
        //   190: aload_1        
        //   191: checkcast       Lkz0/k;
        //   194: invokevirtual   kz0/k.h0:()J
        //   197: lstore_2       
        //   198: aload_0        
        //   199: invokevirtual   re/g7.J:()Lre/f;
        //   202: astore_1       
        //   203: getstatic       re/q2.Q:Lre/p2;
        //   206: astore          4
        //   208: aconst_null    
        //   209: astore          5
        //   211: aload_1        
        //   212: aconst_null    
        //   213: aload           4
        //   215: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //   218: istore          6
        //   220: aload_0        
        //   221: invokevirtual   re/g7.J:()Lre/f;
        //   224: pop            
        //   225: getstatic       re/q2.e:Lre/p2;
        //   228: aconst_null    
        //   229: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   232: checkcast       Ljava/lang/Long;
        //   235: invokevirtual   java/lang/Long.longValue:()J
        //   238: lstore          7
        //   240: iconst_0       
        //   241: istore          9
        //   243: iload           9
        //   245: iload           6
        //   247: if_icmpge       267
        //   250: aload_0        
        //   251: lload_2        
        //   252: lload           7
        //   254: lsub           
        //   255: invokevirtual   re/g7.D:(J)Z
        //   258: ifeq            267
        //   261: iinc            9, 1
        //   264: goto            243
        //   267: aload_0        
        //   268: getfield        re/g7.n:Lre/o6;
        //   271: getfield        re/o6.l:Lre/n3;
        //   274: invokevirtual   re/n3.a:()J
        //   277: lstore          7
        //   279: lload           7
        //   281: lconst_0       
        //   282: lcmp           
        //   283: ifeq            309
        //   286: aload_0        
        //   287: invokevirtual   re/g7.f:()Lre/c3;
        //   290: invokevirtual   re/c3.C:()Lre/a3;
        //   293: lload_2        
        //   294: lload           7
        //   296: lsub           
        //   297: invokestatic    java/lang/Math.abs:(J)J
        //   300: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   303: ldc_w           "Uploading events. Elapsed time since last upload attempt (ms)"
        //   306: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   309: aload_0        
        //   310: getfield        re/g7.h:Lre/j;
        //   313: astore_1       
        //   314: aload_1        
        //   315: invokestatic    re/g7.H:(Lre/b7;)V
        //   318: aload_1        
        //   319: invokevirtual   re/j.Z:()Ljava/lang/String;
        //   322: astore          10
        //   324: aload           10
        //   326: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   329: istore          11
        //   331: ldc2_w          -1
        //   334: lstore          7
        //   336: iload           11
        //   338: ifne            3516
        //   341: aload_0        
        //   342: getfield        re/g7.E:J
        //   345: ldc2_w          -1
        //   348: lcmp           
        //   349: ifne            490
        //   352: aload_0        
        //   353: getfield        re/g7.h:Lre/j;
        //   356: astore          12
        //   358: aload           12
        //   360: invokestatic    re/g7.H:(Lre/b7;)V
        //   363: aload           12
        //   365: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //   368: ldc_w           "select rowid from raw_events order by rowid desc limit 1;"
        //   371: aconst_null    
        //   372: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   375: astore_1       
        //   376: aload_1        
        //   377: astore          5
        //   379: aload_1        
        //   380: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   385: ifne            391
        //   388: goto            456
        //   391: aload_1        
        //   392: astore          5
        //   394: aload_1        
        //   395: iconst_0       
        //   396: invokeinterface android/database/Cursor.getLong:(I)J
        //   401: lstore          13
        //   403: lload           13
        //   405: lstore          7
        //   407: goto            456
        //   410: astore          4
        //   412: goto            423
        //   415: astore_1       
        //   416: goto            476
        //   419: astore          4
        //   421: aconst_null    
        //   422: astore_1       
        //   423: aload_1        
        //   424: astore          5
        //   426: aload           12
        //   428: getfield        u5/w.f:Ljava/lang/Object;
        //   431: checkcast       Lre/h4;
        //   434: invokevirtual   re/h4.f:()Lre/c3;
        //   437: invokevirtual   re/c3.D:()Lre/a3;
        //   440: aload           4
        //   442: ldc_w           "Error querying raw events"
        //   445: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   448: lload           7
        //   450: lstore          13
        //   452: aload_1        
        //   453: ifnull          466
        //   456: aload_1        
        //   457: invokeinterface android/database/Cursor.close:()V
        //   462: lload           7
        //   464: lstore          13
        //   466: aload_0        
        //   467: lload           13
        //   469: putfield        re/g7.E:J
        //   472: goto            490
        //   475: astore_1       
        //   476: aload           5
        //   478: ifnull          488
        //   481: aload           5
        //   483: invokeinterface android/database/Cursor.close:()V
        //   488: aload_1        
        //   489: athrow         
        //   490: aload_0        
        //   491: invokevirtual   re/g7.J:()Lre/f;
        //   494: aload           10
        //   496: getstatic       re/q2.h:Lre/p2;
        //   499: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //   502: istore          9
        //   504: iconst_0       
        //   505: aload_0        
        //   506: invokevirtual   re/g7.J:()Lre/f;
        //   509: aload           10
        //   511: getstatic       re/q2.i:Lre/p2;
        //   514: invokevirtual   re/f.C:(Ljava/lang/String;Lre/p2;)I
        //   517: invokestatic    java/lang/Math.max:(II)I
        //   520: istore          6
        //   522: aload_0        
        //   523: getfield        re/g7.h:Lre/j;
        //   526: astore          15
        //   528: aload           15
        //   530: invokestatic    re/g7.H:(Lre/b7;)V
        //   533: aload           15
        //   535: invokevirtual   u5/w.y:()V
        //   538: aload           15
        //   540: invokevirtual   re/b7.z:()V
        //   543: iload           9
        //   545: ifle            554
        //   548: iconst_1       
        //   549: istore          11
        //   551: goto            557
        //   554: iconst_0       
        //   555: istore          11
        //   557: iload           11
        //   559: invokestatic    yd/a.K0:(Z)V
        //   562: iload           6
        //   564: ifle            573
        //   567: iconst_1       
        //   568: istore          11
        //   570: goto            576
        //   573: iconst_0       
        //   574: istore          11
        //   576: iload           11
        //   578: invokestatic    yd/a.K0:(Z)V
        //   581: aload           10
        //   583: invokestatic    yd/a.P0:(Ljava/lang/String;)V
        //   586: aload           15
        //   588: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //   591: ldc_w           "queue"
        //   594: iconst_3       
        //   595: anewarray       Ljava/lang/String;
        //   598: dup            
        //   599: iconst_0       
        //   600: ldc_w           "rowid"
        //   603: aastore        
        //   604: dup            
        //   605: iconst_1       
        //   606: ldc_w           "data"
        //   609: aastore        
        //   610: dup            
        //   611: iconst_2       
        //   612: ldc_w           "retry_count"
        //   615: aastore        
        //   616: ldc_w           "app_id=?"
        //   619: iconst_1       
        //   620: anewarray       Ljava/lang/String;
        //   623: dup            
        //   624: iconst_0       
        //   625: aload           10
        //   627: aastore        
        //   628: aconst_null    
        //   629: aconst_null    
        //   630: ldc_w           "rowid"
        //   633: iload           9
        //   635: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   638: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   641: astore          5
        //   643: lload_2        
        //   644: lstore          7
        //   646: aload           5
        //   648: astore_1       
        //   649: aload           5
        //   651: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   656: istore          11
        //   658: iload           11
        //   660: ifne            692
        //   663: aload           5
        //   665: astore_1       
        //   666: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   669: astore          4
        //   671: aload           5
        //   673: invokeinterface android/database/Cursor.close:()V
        //   678: aload           4
        //   680: astore_1       
        //   681: lload_2        
        //   682: lstore          7
        //   684: goto            1282
        //   687: astore          4
        //   689: goto            1220
        //   692: lload_2        
        //   693: lstore          7
        //   695: aload           5
        //   697: astore_1       
        //   698: new             Ljava/util/ArrayList;
        //   701: astore          12
        //   703: lload_2        
        //   704: lstore          7
        //   706: aload           5
        //   708: astore_1       
        //   709: aload           12
        //   711: invokespecial   java/util/ArrayList.<init>:()V
        //   714: iconst_0       
        //   715: istore          9
        //   717: lload_2        
        //   718: lstore          7
        //   720: aload           5
        //   722: astore_1       
        //   723: aload           5
        //   725: iconst_0       
        //   726: invokeinterface android/database/Cursor.getLong:(I)J
        //   731: lstore          13
        //   733: lload_2        
        //   734: lstore          7
        //   736: aload           5
        //   738: astore_1       
        //   739: aload           5
        //   741: iconst_1       
        //   742: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   747: astore          16
        //   749: lload_2        
        //   750: lstore          7
        //   752: aload           5
        //   754: astore_1       
        //   755: aload           15
        //   757: getfield        re/a7.g:Lre/g7;
        //   760: getfield        re/g7.l:Lre/i7;
        //   763: astore          17
        //   765: lload_2        
        //   766: lstore          7
        //   768: aload           5
        //   770: astore_1       
        //   771: aload           17
        //   773: invokestatic    re/g7.H:(Lre/b7;)V
        //   776: lload_2        
        //   777: lstore          7
        //   779: aload           5
        //   781: astore_1       
        //   782: new             Ljava/io/ByteArrayInputStream;
        //   785: astore          4
        //   787: lload_2        
        //   788: lstore          7
        //   790: aload           5
        //   792: astore_1       
        //   793: aload           4
        //   795: aload           16
        //   797: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   800: lload_2        
        //   801: lstore          7
        //   803: aload           5
        //   805: astore_1       
        //   806: new             Ljava/util/zip/GZIPInputStream;
        //   809: astore          18
        //   811: lload_2        
        //   812: lstore          7
        //   814: aload           5
        //   816: astore_1       
        //   817: aload           18
        //   819: aload           4
        //   821: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   824: lload_2        
        //   825: lstore          7
        //   827: aload           5
        //   829: astore_1       
        //   830: new             Ljava/io/ByteArrayOutputStream;
        //   833: astore          19
        //   835: lload_2        
        //   836: lstore          7
        //   838: aload           5
        //   840: astore_1       
        //   841: aload           19
        //   843: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   846: aload           5
        //   848: astore_1       
        //   849: sipush          1024
        //   852: newarray        B
        //   854: astore          16
        //   856: aload           5
        //   858: astore_1       
        //   859: aload           18
        //   861: aload           16
        //   863: invokevirtual   java/io/InputStream.read:([B)I
        //   866: istore          20
        //   868: iload           20
        //   870: ifgt            1051
        //   873: aload           5
        //   875: astore_1       
        //   876: aload           18
        //   878: invokevirtual   java/util/zip/GZIPInputStream.close:()V
        //   881: aload           5
        //   883: astore_1       
        //   884: aload           4
        //   886: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   889: aload           5
        //   891: astore_1       
        //   892: aload           19
        //   894: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   897: astore          4
        //   899: aload           5
        //   901: astore_1       
        //   902: aload           12
        //   904: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   907: ifne            931
        //   910: aload           5
        //   912: astore_1       
        //   913: aload           4
        //   915: arraylength    
        //   916: istore          20
        //   918: iload           20
        //   920: iload           9
        //   922: iadd           
        //   923: iload           6
        //   925: if_icmple       931
        //   928: goto            1178
        //   931: aload           5
        //   933: astore_1       
        //   934: invokestatic    ke/o3.A1:()Lke/n3;
        //   937: aload           4
        //   939: invokestatic    re/i7.R:(Lke/z5;[B)Lke/z5;
        //   942: checkcast       Lke/n3;
        //   945: astore          17
        //   947: aload           5
        //   949: astore_1       
        //   950: aload           5
        //   952: iconst_2       
        //   953: invokeinterface android/database/Cursor.isNull:(I)Z
        //   958: ifne            977
        //   961: aload           5
        //   963: astore_1       
        //   964: aload           17
        //   966: aload           5
        //   968: iconst_2       
        //   969: invokeinterface android/database/Cursor.getInt:(I)I
        //   974: invokevirtual   ke/n3.q:(I)V
        //   977: aload           5
        //   979: astore_1       
        //   980: iload           9
        //   982: aload           4
        //   984: arraylength    
        //   985: iadd           
        //   986: istore          9
        //   988: aload           5
        //   990: astore_1       
        //   991: aload           12
        //   993: aload           17
        //   995: invokevirtual   ke/z5.j:()Lke/c6;
        //   998: checkcast       Lke/o3;
        //  1001: lload           13
        //  1003: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1006: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //  1009: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1012: pop            
        //  1013: goto            1148
        //  1016: astore          4
        //  1018: aload           5
        //  1020: astore_1       
        //  1021: aload           15
        //  1023: getfield        u5/w.f:Ljava/lang/Object;
        //  1026: checkcast       Lre/h4;
        //  1029: invokevirtual   re/h4.f:()Lre/c3;
        //  1032: invokevirtual   re/c3.D:()Lre/a3;
        //  1035: aload           10
        //  1037: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  1040: ldc_w           "Failed to merge queued bundle. appId"
        //  1043: aload           4
        //  1045: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1048: goto            1148
        //  1051: aload           5
        //  1053: astore_1       
        //  1054: aload           19
        //  1056: aload           16
        //  1058: iconst_0       
        //  1059: iload           20
        //  1061: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //  1064: goto            856
        //  1067: astore          4
        //  1069: goto            1077
        //  1072: astore          4
        //  1074: goto            1069
        //  1077: aload           5
        //  1079: astore_1       
        //  1080: aload           17
        //  1082: getfield        u5/w.f:Ljava/lang/Object;
        //  1085: checkcast       Lre/h4;
        //  1088: invokevirtual   re/h4.f:()Lre/c3;
        //  1091: invokevirtual   re/c3.D:()Lre/a3;
        //  1094: aload           4
        //  1096: ldc_w           "Failed to ungzip content"
        //  1099: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1102: aload           5
        //  1104: astore_1       
        //  1105: aload           4
        //  1107: athrow         
        //  1108: astore          4
        //  1110: goto            1118
        //  1113: astore          4
        //  1115: goto            1110
        //  1118: aload           5
        //  1120: astore_1       
        //  1121: aload           15
        //  1123: getfield        u5/w.f:Ljava/lang/Object;
        //  1126: checkcast       Lre/h4;
        //  1129: invokevirtual   re/h4.f:()Lre/c3;
        //  1132: invokevirtual   re/c3.D:()Lre/a3;
        //  1135: aload           10
        //  1137: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  1140: ldc_w           "Failed to unzip queued bundle. appId"
        //  1143: aload           4
        //  1145: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1148: aload           5
        //  1150: astore_1       
        //  1151: aload           5
        //  1153: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1158: istore          11
        //  1160: iload           11
        //  1162: ifeq            1178
        //  1165: iload           9
        //  1167: iload           6
        //  1169: if_icmple       1175
        //  1172: goto            1178
        //  1175: goto            717
        //  1178: aload           5
        //  1180: invokeinterface android/database/Cursor.close:()V
        //  1185: aload           12
        //  1187: astore_1       
        //  1188: lload_2        
        //  1189: lstore          7
        //  1191: goto            1282
        //  1194: astore_1       
        //  1195: aload_1        
        //  1196: astore          4
        //  1198: goto            1220
        //  1201: astore_1       
        //  1202: lload           7
        //  1204: lstore_2       
        //  1205: goto            1195
        //  1208: astore          5
        //  1210: aconst_null    
        //  1211: astore_1       
        //  1212: goto            3503
        //  1215: astore          4
        //  1217: aconst_null    
        //  1218: astore          5
        //  1220: aload           5
        //  1222: astore_1       
        //  1223: aload           15
        //  1225: getfield        u5/w.f:Ljava/lang/Object;
        //  1228: checkcast       Lre/h4;
        //  1231: invokevirtual   re/h4.f:()Lre/c3;
        //  1234: invokevirtual   re/c3.D:()Lre/a3;
        //  1237: aload           10
        //  1239: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  1242: ldc_w           "Error querying bundles. appId"
        //  1245: aload           4
        //  1247: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  1250: aload           5
        //  1252: astore_1       
        //  1253: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1256: astore          4
        //  1258: aload           4
        //  1260: astore_1       
        //  1261: lload_2        
        //  1262: lstore          7
        //  1264: aload           5
        //  1266: ifnull          1282
        //  1269: aload           5
        //  1271: invokeinterface android/database/Cursor.close:()V
        //  1276: lload_2        
        //  1277: lstore          7
        //  1279: aload           4
        //  1281: astore_1       
        //  1282: aload_1        
        //  1283: invokeinterface java/util/List.isEmpty:()Z
        //  1288: ifne            3739
        //  1291: aload_1        
        //  1292: astore          5
        //  1294: aload_0        
        //  1295: aload           10
        //  1297: invokevirtual   re/g7.K:(Ljava/lang/String;)Lre/g;
        //  1300: getstatic       com/google/android/gms/measurement/internal/zzah.zza:Lcom/google/android/gms/measurement/internal/zzah;
        //  1303: invokevirtual   re/g.f:(Lcom/google/android/gms/measurement/internal/zzah;)Z
        //  1306: ifeq            1468
        //  1309: aload_1        
        //  1310: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1315: astore          5
        //  1317: aload           5
        //  1319: invokeinterface java/util/Iterator.hasNext:()Z
        //  1324: ifeq            1366
        //  1327: aload           5
        //  1329: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1334: checkcast       Landroid/util/Pair;
        //  1337: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1340: checkcast       Lke/o3;
        //  1343: astore          4
        //  1345: aload           4
        //  1347: invokevirtual   ke/o3.A:()Ljava/lang/String;
        //  1350: invokevirtual   java/lang/String.isEmpty:()Z
        //  1353: ifne            1317
        //  1356: aload           4
        //  1358: invokevirtual   ke/o3.A:()Ljava/lang/String;
        //  1361: astore          4
        //  1363: goto            1369
        //  1366: aconst_null    
        //  1367: astore          4
        //  1369: aload_1        
        //  1370: astore          5
        //  1372: aload           4
        //  1374: ifnull          1468
        //  1377: iconst_0       
        //  1378: istore          9
        //  1380: aload_1        
        //  1381: astore          5
        //  1383: iload           9
        //  1385: aload_1        
        //  1386: invokeinterface java/util/List.size:()I
        //  1391: if_icmpge       1468
        //  1394: aload_1        
        //  1395: iload           9
        //  1397: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1402: checkcast       Landroid/util/Pair;
        //  1405: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1408: checkcast       Lke/o3;
        //  1411: astore          5
        //  1413: aload           5
        //  1415: invokevirtual   ke/o3.A:()Ljava/lang/String;
        //  1418: invokevirtual   java/lang/String.isEmpty:()Z
        //  1421: ifeq            1427
        //  1424: goto            1462
        //  1427: aload           5
        //  1429: invokevirtual   ke/o3.A:()Ljava/lang/String;
        //  1432: aload           4
        //  1434: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1437: istore          11
        //  1439: iload           11
        //  1441: ifne            1462
        //  1444: aload_1        
        //  1445: iconst_0       
        //  1446: iload           9
        //  1448: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //  1453: astore          5
        //  1455: goto            1468
        //  1458: astore_1       
        //  1459: goto            3772
        //  1462: iinc            9, 1
        //  1465: goto            1380
        //  1468: invokestatic    ke/m3.r:()Lke/l3;
        //  1471: astore          12
        //  1473: aload           5
        //  1475: invokeinterface java/util/List.size:()I
        //  1480: istore          21
        //  1482: new             Ljava/util/ArrayList;
        //  1485: astore          4
        //  1487: aload           4
        //  1489: aload           5
        //  1491: invokeinterface java/util/List.size:()I
        //  1496: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1499: ldc_w           "1"
        //  1502: aload_0        
        //  1503: invokevirtual   re/g7.J:()Lre/f;
        //  1506: getfield        re/f.h:Lre/e;
        //  1509: aload           10
        //  1511: ldc_w           "gaia_collection_enabled"
        //  1514: invokeinterface re/e.j:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  1519: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1522: ifeq            1546
        //  1525: aload_0        
        //  1526: aload           10
        //  1528: invokevirtual   re/g7.K:(Ljava/lang/String;)Lre/g;
        //  1531: getstatic       com/google/android/gms/measurement/internal/zzah.zza:Lcom/google/android/gms/measurement/internal/zzah;
        //  1534: invokevirtual   re/g.f:(Lcom/google/android/gms/measurement/internal/zzah;)Z
        //  1537: ifeq            1546
        //  1540: iconst_1       
        //  1541: istore          9
        //  1543: goto            1549
        //  1546: iconst_0       
        //  1547: istore          9
        //  1549: aload_0        
        //  1550: aload           10
        //  1552: invokevirtual   re/g7.K:(Ljava/lang/String;)Lre/g;
        //  1555: getstatic       com/google/android/gms/measurement/internal/zzah.zza:Lcom/google/android/gms/measurement/internal/zzah;
        //  1558: invokevirtual   re/g.f:(Lcom/google/android/gms/measurement/internal/zzah;)Z
        //  1561: istore          22
        //  1563: aload_0        
        //  1564: aload           10
        //  1566: invokevirtual   re/g7.K:(Ljava/lang/String;)Lre/g;
        //  1569: getstatic       com/google/android/gms/measurement/internal/zzah.zzb:Lcom/google/android/gms/measurement/internal/zzah;
        //  1572: invokevirtual   re/g.f:(Lcom/google/android/gms/measurement/internal/zzah;)Z
        //  1575: istore          11
        //  1577: invokestatic    com/google/android/gms/internal/measurement/y.a:()V
        //  1580: aload_0        
        //  1581: invokevirtual   re/g7.J:()Lre/f;
        //  1584: aconst_null    
        //  1585: getstatic       re/q2.t0:Lre/p2;
        //  1588: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  1591: istore          23
        //  1593: iconst_0       
        //  1594: istore          6
        //  1596: iload           6
        //  1598: iload           21
        //  1600: if_icmpge       3043
        //  1603: aload           5
        //  1605: iload           6
        //  1607: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1612: checkcast       Landroid/util/Pair;
        //  1615: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1618: checkcast       Lke/o3;
        //  1621: invokevirtual   ke/c6.o:()Lke/z5;
        //  1624: checkcast       Lke/n3;
        //  1627: astore          15
        //  1629: aload           4
        //  1631: aload           5
        //  1633: iload           6
        //  1635: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1640: checkcast       Landroid/util/Pair;
        //  1643: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1646: checkcast       Ljava/lang/Long;
        //  1649: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1652: pop            
        //  1653: aload_0        
        //  1654: invokevirtual   re/g7.J:()Lre/f;
        //  1657: invokevirtual   re/f.D:()V
        //  1660: aload           15
        //  1662: getfield        ke/z5.h:Z
        //  1665: ifeq            1679
        //  1668: aload           15
        //  1670: invokevirtual   ke/z5.l:()V
        //  1673: aload           15
        //  1675: iconst_0       
        //  1676: putfield        ke/z5.h:Z
        //  1679: aload           15
        //  1681: getfield        ke/z5.g:Lke/c6;
        //  1684: checkcast       Lke/o3;
        //  1687: invokestatic    ke/o3.T:(Lke/o3;)V
        //  1690: aload           15
        //  1692: getfield        ke/z5.h:Z
        //  1695: ifeq            1709
        //  1698: aload           15
        //  1700: invokevirtual   ke/z5.l:()V
        //  1703: aload           15
        //  1705: iconst_0       
        //  1706: putfield        ke/z5.h:Z
        //  1709: aload           15
        //  1711: getfield        ke/z5.g:Lke/c6;
        //  1714: checkcast       Lke/o3;
        //  1717: lload           7
        //  1719: invokestatic    ke/o3.A0:(Lke/o3;J)V
        //  1722: aload_0        
        //  1723: getfield        re/g7.q:Lre/h4;
        //  1726: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1729: pop            
        //  1730: aload           15
        //  1732: getfield        ke/z5.h:Z
        //  1735: ifeq            1756
        //  1738: aload           15
        //  1740: invokevirtual   ke/z5.l:()V
        //  1743: aload           15
        //  1745: iconst_0       
        //  1746: putfield        ke/z5.h:Z
        //  1749: goto            1756
        //  1752: astore_1       
        //  1753: goto            1459
        //  1756: aload           15
        //  1758: getfield        ke/z5.g:Lke/c6;
        //  1761: checkcast       Lke/o3;
        //  1764: invokestatic    ke/o3.f0:(Lke/o3;)V
        //  1767: iload           9
        //  1769: ifne            1802
        //  1772: aload           15
        //  1774: getfield        ke/z5.h:Z
        //  1777: ifeq            1791
        //  1780: aload           15
        //  1782: invokevirtual   ke/z5.l:()V
        //  1785: aload           15
        //  1787: iconst_0       
        //  1788: putfield        ke/z5.h:Z
        //  1791: aload           15
        //  1793: getfield        ke/z5.g:Lke/c6;
        //  1796: checkcast       Lke/o3;
        //  1799: invokestatic    ke/o3.G:(Lke/o3;)V
        //  1802: iload           22
        //  1804: ifne            1817
        //  1807: aload           15
        //  1809: invokevirtual   ke/n3.B:()V
        //  1812: aload           15
        //  1814: invokevirtual   ke/n3.y:()V
        //  1817: iload           11
        //  1819: ifne            1852
        //  1822: aload           15
        //  1824: getfield        ke/z5.h:Z
        //  1827: ifeq            1841
        //  1830: aload           15
        //  1832: invokevirtual   ke/z5.l:()V
        //  1835: aload           15
        //  1837: iconst_0       
        //  1838: putfield        ke/z5.h:Z
        //  1841: aload           15
        //  1843: getfield        ke/z5.g:Lke/c6;
        //  1846: checkcast       Lke/o3;
        //  1849: invokestatic    ke/o3.Z:(Lke/o3;)V
        //  1852: invokestatic    com/google/android/gms/internal/measurement/w.b:()V
        //  1855: aload_0        
        //  1856: invokevirtual   re/g7.J:()Lre/f;
        //  1859: aload           10
        //  1861: getstatic       re/q2.o0:Lre/p2;
        //  1864: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  1867: ifeq            1938
        //  1870: aload_0        
        //  1871: getfield        re/g7.f:Lre/b4;
        //  1874: astore_1       
        //  1875: aload_1        
        //  1876: invokestatic    re/g7.H:(Lre/b7;)V
        //  1879: aload_1        
        //  1880: invokevirtual   u5/w.y:()V
        //  1883: aload_1        
        //  1884: aload           10
        //  1886: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  1889: aload_1        
        //  1890: getfield        re/b4.j:Lj0/b;
        //  1893: aload           10
        //  1895: aconst_null    
        //  1896: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1899: checkcast       Ljava/util/Set;
        //  1902: astore_1       
        //  1903: aload_1        
        //  1904: ifnull          1938
        //  1907: aload           15
        //  1909: getfield        ke/z5.h:Z
        //  1912: ifeq            1926
        //  1915: aload           15
        //  1917: invokevirtual   ke/z5.l:()V
        //  1920: aload           15
        //  1922: iconst_0       
        //  1923: putfield        ke/z5.h:Z
        //  1926: aload           15
        //  1928: getfield        ke/z5.g:Lke/c6;
        //  1931: checkcast       Lke/o3;
        //  1934: aload_1        
        //  1935: invokestatic    ke/o3.t0:(Lke/o3;Ljava/util/Set;)V
        //  1938: aload_0        
        //  1939: invokevirtual   re/g7.J:()Lre/f;
        //  1942: aload           10
        //  1944: getstatic       re/q2.q0:Lre/p2;
        //  1947: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  1950: ifeq            2301
        //  1953: aload_0        
        //  1954: getfield        re/g7.f:Lre/b4;
        //  1957: astore_1       
        //  1958: aload_1        
        //  1959: invokestatic    re/g7.H:(Lre/b7;)V
        //  1962: aload_1        
        //  1963: invokevirtual   u5/w.y:()V
        //  1966: aload_1        
        //  1967: aload           10
        //  1969: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  1972: aload_1        
        //  1973: getfield        re/b4.j:Lj0/b;
        //  1976: aload           10
        //  1978: aconst_null    
        //  1979: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1982: ifnull          2042
        //  1985: aload_1        
        //  1986: getfield        re/b4.j:Lj0/b;
        //  1989: aload           10
        //  1991: aconst_null    
        //  1992: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1995: checkcast       Ljava/util/Set;
        //  1998: ldc_w           "device_model"
        //  2001: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2006: ifne            2036
        //  2009: aload_1        
        //  2010: getfield        re/b4.j:Lj0/b;
        //  2013: aload           10
        //  2015: aconst_null    
        //  2016: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2019: checkcast       Ljava/util/Set;
        //  2022: ldc_w           "device_info"
        //  2025: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2030: ifne            2036
        //  2033: goto            2042
        //  2036: iconst_1       
        //  2037: istore          20
        //  2039: goto            2045
        //  2042: iconst_0       
        //  2043: istore          20
        //  2045: iload           20
        //  2047: ifeq            2080
        //  2050: aload           15
        //  2052: getfield        ke/z5.h:Z
        //  2055: ifeq            2069
        //  2058: aload           15
        //  2060: invokevirtual   ke/z5.l:()V
        //  2063: aload           15
        //  2065: iconst_0       
        //  2066: putfield        ke/z5.h:Z
        //  2069: aload           15
        //  2071: getfield        ke/z5.g:Lke/c6;
        //  2074: checkcast       Lke/o3;
        //  2077: invokestatic    ke/o3.L0:(Lke/o3;)V
        //  2080: aload_0        
        //  2081: getfield        re/g7.f:Lre/b4;
        //  2084: astore_1       
        //  2085: aload_1        
        //  2086: invokestatic    re/g7.H:(Lre/b7;)V
        //  2089: aload_1        
        //  2090: invokevirtual   u5/w.y:()V
        //  2093: aload_1        
        //  2094: aload           10
        //  2096: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  2099: aload_1        
        //  2100: getfield        re/b4.j:Lj0/b;
        //  2103: aload           10
        //  2105: aconst_null    
        //  2106: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2109: ifnull          2169
        //  2112: aload_1        
        //  2113: getfield        re/b4.j:Lj0/b;
        //  2116: aload           10
        //  2118: aconst_null    
        //  2119: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2122: checkcast       Ljava/util/Set;
        //  2125: ldc_w           "os_version"
        //  2128: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2133: ifne            2163
        //  2136: aload_1        
        //  2137: getfield        re/b4.j:Lj0/b;
        //  2140: aload           10
        //  2142: aconst_null    
        //  2143: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2146: checkcast       Ljava/util/Set;
        //  2149: ldc_w           "device_info"
        //  2152: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2157: ifne            2163
        //  2160: goto            2169
        //  2163: iconst_1       
        //  2164: istore          20
        //  2166: goto            2172
        //  2169: iconst_0       
        //  2170: istore          20
        //  2172: iload           20
        //  2174: ifeq            2301
        //  2177: aload_0        
        //  2178: invokevirtual   re/g7.J:()Lre/f;
        //  2181: aload           10
        //  2183: getstatic       re/q2.A0:Lre/p2;
        //  2186: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2189: ifeq            2268
        //  2192: aload           15
        //  2194: getfield        ke/z5.g:Lke/c6;
        //  2197: checkcast       Lke/o3;
        //  2200: invokevirtual   ke/o3.y:()Ljava/lang/String;
        //  2203: astore_1       
        //  2204: aload_1        
        //  2205: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2208: ifne            2301
        //  2211: aload_1        
        //  2212: ldc_w           "."
        //  2215: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //  2218: istore          20
        //  2220: iload           20
        //  2222: iconst_m1      
        //  2223: if_icmpeq       2301
        //  2226: aload_1        
        //  2227: iconst_0       
        //  2228: iload           20
        //  2230: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  2233: astore_1       
        //  2234: aload           15
        //  2236: getfield        ke/z5.h:Z
        //  2239: ifeq            2253
        //  2242: aload           15
        //  2244: invokevirtual   ke/z5.l:()V
        //  2247: aload           15
        //  2249: iconst_0       
        //  2250: putfield        ke/z5.h:Z
        //  2253: aload           15
        //  2255: getfield        ke/z5.g:Lke/c6;
        //  2258: checkcast       Lke/o3;
        //  2261: aload_1        
        //  2262: invokestatic    ke/o3.I0:(Lke/o3;Ljava/lang/String;)V
        //  2265: goto            2301
        //  2268: aload           15
        //  2270: getfield        ke/z5.h:Z
        //  2273: ifeq            2287
        //  2276: aload           15
        //  2278: invokevirtual   ke/z5.l:()V
        //  2281: aload           15
        //  2283: iconst_0       
        //  2284: putfield        ke/z5.h:Z
        //  2287: aload           15
        //  2289: getfield        ke/z5.g:Lke/c6;
        //  2292: checkcast       Lke/o3;
        //  2295: invokestatic    ke/o3.J0:(Lke/o3;)V
        //  2298: goto            2301
        //  2301: aload_0        
        //  2302: invokevirtual   re/g7.J:()Lre/f;
        //  2305: aload           10
        //  2307: getstatic       re/q2.r0:Lre/p2;
        //  2310: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2313: ifeq            2434
        //  2316: aload_0        
        //  2317: getfield        re/g7.f:Lre/b4;
        //  2320: astore_1       
        //  2321: aload_1        
        //  2322: invokestatic    re/g7.H:(Lre/b7;)V
        //  2325: aload_1        
        //  2326: invokevirtual   u5/w.y:()V
        //  2329: aload_1        
        //  2330: aload           10
        //  2332: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  2335: aload_1        
        //  2336: getfield        re/b4.j:Lj0/b;
        //  2339: aload           10
        //  2341: aconst_null    
        //  2342: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2345: ifnull          2378
        //  2348: aload_1        
        //  2349: getfield        re/b4.j:Lj0/b;
        //  2352: aload           10
        //  2354: aconst_null    
        //  2355: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2358: checkcast       Ljava/util/Set;
        //  2361: ldc_w           "user_id"
        //  2364: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2369: ifeq            2378
        //  2372: iconst_1       
        //  2373: istore          20
        //  2375: goto            2381
        //  2378: iconst_0       
        //  2379: istore          20
        //  2381: iload           20
        //  2383: ifeq            2434
        //  2386: aload           15
        //  2388: ldc_w           "_id"
        //  2391: invokestatic    re/i7.L:(Lke/n3;Ljava/lang/String;)I
        //  2394: istore          20
        //  2396: iload           20
        //  2398: iconst_m1      
        //  2399: if_icmpeq       2434
        //  2402: aload           15
        //  2404: getfield        ke/z5.h:Z
        //  2407: ifeq            2421
        //  2410: aload           15
        //  2412: invokevirtual   ke/z5.l:()V
        //  2415: aload           15
        //  2417: iconst_0       
        //  2418: putfield        ke/z5.h:Z
        //  2421: aload           15
        //  2423: getfield        ke/z5.g:Lke/c6;
        //  2426: checkcast       Lke/o3;
        //  2429: iload           20
        //  2431: invokestatic    ke/o3.z0:(Lke/o3;I)V
        //  2434: aload_0        
        //  2435: invokevirtual   re/g7.J:()Lre/f;
        //  2438: aload           10
        //  2440: getstatic       re/q2.s0:Lre/p2;
        //  2443: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2446: ifeq            2549
        //  2449: aload_0        
        //  2450: getfield        re/g7.f:Lre/b4;
        //  2453: astore_1       
        //  2454: aload_1        
        //  2455: invokestatic    re/g7.H:(Lre/b7;)V
        //  2458: aload_1        
        //  2459: invokevirtual   u5/w.y:()V
        //  2462: aload_1        
        //  2463: aload           10
        //  2465: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  2468: aload_1        
        //  2469: getfield        re/b4.j:Lj0/b;
        //  2472: aload           10
        //  2474: aconst_null    
        //  2475: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2478: ifnull          2511
        //  2481: aload_1        
        //  2482: getfield        re/b4.j:Lj0/b;
        //  2485: aload           10
        //  2487: aconst_null    
        //  2488: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2491: checkcast       Ljava/util/Set;
        //  2494: ldc_w           "google_signals"
        //  2497: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2502: ifeq            2511
        //  2505: iconst_1       
        //  2506: istore          20
        //  2508: goto            2514
        //  2511: iconst_0       
        //  2512: istore          20
        //  2514: iload           20
        //  2516: ifeq            2549
        //  2519: aload           15
        //  2521: getfield        ke/z5.h:Z
        //  2524: ifeq            2538
        //  2527: aload           15
        //  2529: invokevirtual   ke/z5.l:()V
        //  2532: aload           15
        //  2534: iconst_0       
        //  2535: putfield        ke/z5.h:Z
        //  2538: aload           15
        //  2540: getfield        ke/z5.g:Lke/c6;
        //  2543: checkcast       Lke/o3;
        //  2546: invokestatic    ke/o3.G:(Lke/o3;)V
        //  2549: aload_0        
        //  2550: invokevirtual   re/g7.J:()Lre/f;
        //  2553: aload           10
        //  2555: getstatic       re/q2.v0:Lre/p2;
        //  2558: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2561: ifeq            2800
        //  2564: aload_0        
        //  2565: getfield        re/g7.f:Lre/b4;
        //  2568: astore_1       
        //  2569: aload_1        
        //  2570: invokestatic    re/g7.H:(Lre/b7;)V
        //  2573: aload_1        
        //  2574: invokevirtual   u5/w.y:()V
        //  2577: aload_1        
        //  2578: aload           10
        //  2580: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  2583: aload_1        
        //  2584: getfield        re/b4.j:Lj0/b;
        //  2587: aload           10
        //  2589: aconst_null    
        //  2590: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2593: ifnull          2626
        //  2596: aload_1        
        //  2597: getfield        re/b4.j:Lj0/b;
        //  2600: aload           10
        //  2602: aconst_null    
        //  2603: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2606: checkcast       Ljava/util/Set;
        //  2609: ldc_w           "app_instance_id"
        //  2612: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2617: ifeq            2626
        //  2620: iconst_1       
        //  2621: istore          20
        //  2623: goto            2629
        //  2626: iconst_0       
        //  2627: istore          20
        //  2629: iload           20
        //  2631: ifeq            2800
        //  2634: aload           15
        //  2636: getfield        ke/z5.h:Z
        //  2639: ifeq            2653
        //  2642: aload           15
        //  2644: invokevirtual   ke/z5.l:()V
        //  2647: aload           15
        //  2649: iconst_0       
        //  2650: putfield        ke/z5.h:Z
        //  2653: aload           15
        //  2655: getfield        ke/z5.g:Lke/c6;
        //  2658: checkcast       Lke/o3;
        //  2661: invokestatic    ke/o3.Z:(Lke/o3;)V
        //  2664: aload_0        
        //  2665: invokevirtual   re/g7.J:()Lre/f;
        //  2668: aload           10
        //  2670: getstatic       re/q2.w0:Lre/p2;
        //  2673: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2676: ifeq            2800
        //  2679: aload_0        
        //  2680: getfield        re/g7.G:Ljava/util/HashMap;
        //  2683: aload           10
        //  2685: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2688: checkcast       Lre/f7;
        //  2691: astore_1       
        //  2692: aload_1        
        //  2693: ifnull          2737
        //  2696: aload_1        
        //  2697: getfield        re/f7.b:J
        //  2700: lstore          13
        //  2702: aload_0        
        //  2703: invokevirtual   re/g7.J:()Lre/f;
        //  2706: aload           10
        //  2708: getstatic       re/q2.S:Lre/p2;
        //  2711: invokevirtual   re/f.E:(Ljava/lang/String;Lre/p2;)J
        //  2714: lstore_2       
        //  2715: aload_0        
        //  2716: invokevirtual   re/g7.g:()Lwd/c;
        //  2719: checkcast       Lkz0/k;
        //  2722: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2725: pop            
        //  2726: lload_2        
        //  2727: lload           13
        //  2729: ladd           
        //  2730: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  2733: lcmp           
        //  2734: ifge            2764
        //  2737: new             Lre/f7;
        //  2740: astore_1       
        //  2741: aload_1        
        //  2742: aload_0        
        //  2743: aload_0        
        //  2744: invokevirtual   re/g7.P:()Lre/n7;
        //  2747: invokevirtual   re/n7.E:()Ljava/lang/String;
        //  2750: invokespecial   re/f7.<init>:(Lre/g7;Ljava/lang/String;)V
        //  2753: aload_0        
        //  2754: getfield        re/g7.G:Ljava/util/HashMap;
        //  2757: aload           10
        //  2759: aload_1        
        //  2760: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2763: pop            
        //  2764: aload_1        
        //  2765: getfield        re/f7.a:Ljava/lang/String;
        //  2768: astore_1       
        //  2769: aload           15
        //  2771: getfield        ke/z5.h:Z
        //  2774: ifeq            2788
        //  2777: aload           15
        //  2779: invokevirtual   ke/z5.l:()V
        //  2782: aload           15
        //  2784: iconst_0       
        //  2785: putfield        ke/z5.h:Z
        //  2788: aload           15
        //  2790: getfield        ke/z5.g:Lke/c6;
        //  2793: checkcast       Lke/o3;
        //  2796: aload_1        
        //  2797: invokestatic    ke/o3.v0:(Lke/o3;Ljava/lang/String;)V
        //  2800: aload_0        
        //  2801: invokevirtual   re/g7.J:()Lre/f;
        //  2804: aload           10
        //  2806: getstatic       re/q2.x0:Lre/p2;
        //  2809: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2812: ifeq            2915
        //  2815: aload_0        
        //  2816: getfield        re/g7.f:Lre/b4;
        //  2819: astore_1       
        //  2820: aload_1        
        //  2821: invokestatic    re/g7.H:(Lre/b7;)V
        //  2824: aload_1        
        //  2825: invokevirtual   u5/w.y:()V
        //  2828: aload_1        
        //  2829: aload           10
        //  2831: invokevirtual   re/b4.E:(Ljava/lang/String;)V
        //  2834: aload_1        
        //  2835: getfield        re/b4.j:Lj0/b;
        //  2838: aload           10
        //  2840: aconst_null    
        //  2841: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2844: ifnull          2877
        //  2847: aload_1        
        //  2848: getfield        re/b4.j:Lj0/b;
        //  2851: aload           10
        //  2853: aconst_null    
        //  2854: invokevirtual   j0/i.getOrDefault:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2857: checkcast       Ljava/util/Set;
        //  2860: ldc_w           "enhanced_user_id"
        //  2863: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //  2868: ifeq            2877
        //  2871: iconst_1       
        //  2872: istore          20
        //  2874: goto            2880
        //  2877: iconst_0       
        //  2878: istore          20
        //  2880: iload           20
        //  2882: ifeq            2915
        //  2885: aload           15
        //  2887: getfield        ke/z5.h:Z
        //  2890: ifeq            2904
        //  2893: aload           15
        //  2895: invokevirtual   ke/z5.l:()V
        //  2898: aload           15
        //  2900: iconst_0       
        //  2901: putfield        ke/z5.h:Z
        //  2904: aload           15
        //  2906: getfield        ke/z5.g:Lke/c6;
        //  2909: checkcast       Lke/o3;
        //  2912: invokestatic    ke/o3.s0:(Lke/o3;)V
        //  2915: iload           23
        //  2917: ifne            2950
        //  2920: aload           15
        //  2922: getfield        ke/z5.h:Z
        //  2925: ifeq            2939
        //  2928: aload           15
        //  2930: invokevirtual   ke/z5.l:()V
        //  2933: aload           15
        //  2935: iconst_0       
        //  2936: putfield        ke/z5.h:Z
        //  2939: aload           15
        //  2941: getfield        ke/z5.g:Lke/c6;
        //  2944: checkcast       Lke/o3;
        //  2947: invokestatic    ke/o3.s0:(Lke/o3;)V
        //  2950: aload_0        
        //  2951: invokevirtual   re/g7.J:()Lre/f;
        //  2954: aload           10
        //  2956: getstatic       re/q2.T:Lre/p2;
        //  2959: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  2962: ifeq            2999
        //  2965: aload           15
        //  2967: invokevirtual   ke/z5.j:()Lke/c6;
        //  2970: checkcast       Lke/o3;
        //  2973: invokevirtual   com/google/android/gms/internal/measurement/b.i:()[B
        //  2976: astore_1       
        //  2977: aload_0        
        //  2978: getfield        re/g7.l:Lre/i7;
        //  2981: astore          17
        //  2983: aload           17
        //  2985: invokestatic    re/g7.H:(Lre/b7;)V
        //  2988: aload           15
        //  2990: aload           17
        //  2992: aload_1        
        //  2993: invokevirtual   re/i7.M:([B)J
        //  2996: invokevirtual   ke/n3.n:(J)V
        //  2999: aload           12
        //  3001: getfield        ke/z5.h:Z
        //  3004: ifeq            3018
        //  3007: aload           12
        //  3009: invokevirtual   ke/z5.l:()V
        //  3012: aload           12
        //  3014: iconst_0       
        //  3015: putfield        ke/z5.h:Z
        //  3018: aload           12
        //  3020: getfield        ke/z5.g:Lke/c6;
        //  3023: checkcast       Lke/m3;
        //  3026: aload           15
        //  3028: invokevirtual   ke/z5.j:()Lke/c6;
        //  3031: checkcast       Lke/o3;
        //  3034: invokestatic    ke/m3.v:(Lke/m3;Lke/o3;)V
        //  3037: iinc            6, 1
        //  3040: goto            1596
        //  3043: aload_0        
        //  3044: invokevirtual   re/g7.f:()Lre/c3;
        //  3047: invokevirtual   re/c3.K:()Ljava/lang/String;
        //  3050: iconst_2       
        //  3051: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  3054: ifeq            3083
        //  3057: aload_0        
        //  3058: getfield        re/g7.l:Lre/i7;
        //  3061: astore_1       
        //  3062: aload_1        
        //  3063: invokestatic    re/g7.H:(Lre/b7;)V
        //  3066: aload_1        
        //  3067: aload           12
        //  3069: invokevirtual   ke/z5.j:()Lke/c6;
        //  3072: checkcast       Lke/m3;
        //  3075: invokevirtual   re/i7.S:(Lke/m3;)Ljava/lang/String;
        //  3078: astore          5
        //  3080: goto            3086
        //  3083: aconst_null    
        //  3084: astore          5
        //  3086: aload_0        
        //  3087: getfield        re/g7.l:Lre/i7;
        //  3090: invokestatic    re/g7.H:(Lre/b7;)V
        //  3093: aload           12
        //  3095: invokevirtual   ke/z5.j:()Lke/c6;
        //  3098: checkcast       Lke/m3;
        //  3101: invokevirtual   com/google/android/gms/internal/measurement/b.i:()[B
        //  3104: astore          15
        //  3106: aload_0        
        //  3107: getfield        re/g7.o:Lre/c7;
        //  3110: astore_1       
        //  3111: invokestatic    com/google/android/gms/internal/measurement/w.b:()V
        //  3114: aload_1        
        //  3115: getfield        u5/w.f:Ljava/lang/Object;
        //  3118: checkcast       Lre/h4;
        //  3121: invokevirtual   re/h4.m:()Lre/f;
        //  3124: aload           10
        //  3126: getstatic       re/q2.p0:Lre/p2;
        //  3129: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //  3132: ifeq            3261
        //  3135: aload_1        
        //  3136: getfield        re/a7.g:Lre/g7;
        //  3139: getfield        re/g7.f:Lre/b4;
        //  3142: astore_1       
        //  3143: aload_1        
        //  3144: invokestatic    re/g7.H:(Lre/b7;)V
        //  3147: aload_1        
        //  3148: aload           10
        //  3150: invokevirtual   re/b4.J:(Ljava/lang/String;)Ljava/lang/String;
        //  3153: astore          17
        //  3155: aload           17
        //  3157: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3160: ifne            3247
        //  3163: getstatic       re/q2.r:Lre/p2;
        //  3166: aconst_null    
        //  3167: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3170: checkcast       Ljava/lang/String;
        //  3173: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //  3176: astore          16
        //  3178: aload           16
        //  3180: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //  3183: astore_1       
        //  3184: aload           16
        //  3186: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //  3189: astore          19
        //  3191: new             Ljava/lang/StringBuilder;
        //  3194: astore          16
        //  3196: aload           16
        //  3198: invokespecial   java/lang/StringBuilder.<init>:()V
        //  3201: aload           16
        //  3203: aload           17
        //  3205: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3208: pop            
        //  3209: aload           16
        //  3211: ldc_w           "."
        //  3214: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3217: pop            
        //  3218: aload           16
        //  3220: aload           19
        //  3222: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3225: pop            
        //  3226: aload_1        
        //  3227: aload           16
        //  3229: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3232: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3235: pop            
        //  3236: aload_1        
        //  3237: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  3240: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  3243: astore_1       
        //  3244: goto            3272
        //  3247: getstatic       re/q2.r:Lre/p2;
        //  3250: aconst_null    
        //  3251: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3254: checkcast       Ljava/lang/String;
        //  3257: astore_1       
        //  3258: goto            3272
        //  3261: getstatic       re/q2.r:Lre/p2;
        //  3264: aconst_null    
        //  3265: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3268: checkcast       Ljava/lang/String;
        //  3271: astore_1       
        //  3272: new             Ljava/net/URL;
        //  3275: astore          17
        //  3277: aload           17
        //  3279: aload_1        
        //  3280: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //  3283: aload           4
        //  3285: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  3288: iconst_1       
        //  3289: ixor           
        //  3290: invokestatic    yd/a.K0:(Z)V
        //  3293: aload_0        
        //  3294: getfield        re/g7.C:Ljava/util/ArrayList;
        //  3297: ifnull          3316
        //  3300: aload_0        
        //  3301: invokevirtual   re/g7.f:()Lre/c3;
        //  3304: invokevirtual   re/c3.D:()Lre/a3;
        //  3307: ldc_w           "Set uploading progress before finishing the previous upload"
        //  3310: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  3313: goto            3334
        //  3316: new             Ljava/util/ArrayList;
        //  3319: astore          16
        //  3321: aload           16
        //  3323: aload           4
        //  3325: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  3328: aload_0        
        //  3329: aload           16
        //  3331: putfield        re/g7.C:Ljava/util/ArrayList;
        //  3334: aload_0        
        //  3335: getfield        re/g7.n:Lre/o6;
        //  3338: getfield        re/o6.m:Lre/n3;
        //  3341: lload           7
        //  3343: invokevirtual   re/n3.b:(J)V
        //  3346: ldc_w           "?"
        //  3349: astore          4
        //  3351: iload           21
        //  3353: ifle            3370
        //  3356: aload           12
        //  3358: invokevirtual   ke/l3.m:()Lke/o3;
        //  3361: astore          4
        //  3363: aload           4
        //  3365: invokevirtual   ke/o3.E1:()Ljava/lang/String;
        //  3368: astore          4
        //  3370: aload_0        
        //  3371: invokevirtual   re/g7.f:()Lre/c3;
        //  3374: invokevirtual   re/c3.E:()Lre/a3;
        //  3377: aload           4
        //  3379: ldc_w           "Uploading data. app, uncompressed size, data"
        //  3382: aload           15
        //  3384: arraylength    
        //  3385: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3388: aload           5
        //  3390: invokevirtual   re/a3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  3393: aload_0        
        //  3394: iconst_1       
        //  3395: putfield        re/g7.y:Z
        //  3398: aload_0        
        //  3399: getfield        re/g7.g:Lre/i3;
        //  3402: astore          12
        //  3404: aload           12
        //  3406: invokestatic    re/g7.H:(Lre/b7;)V
        //  3409: new             Lcom/android/billingclient/api/d0;
        //  3412: astore          5
        //  3414: aload           5
        //  3416: aload_0        
        //  3417: aload           10
        //  3419: iconst_4       
        //  3420: invokespecial   com/android/billingclient/api/d0.<init>:(Ljava/lang/Object;Ljava/lang/Object;I)V
        //  3423: aload           12
        //  3425: invokevirtual   u5/w.y:()V
        //  3428: aload           12
        //  3430: invokevirtual   re/b7.z:()V
        //  3433: aload           12
        //  3435: getfield        u5/w.f:Ljava/lang/Object;
        //  3438: checkcast       Lre/h4;
        //  3441: invokevirtual   re/h4.a:()Lre/g4;
        //  3444: astore          16
        //  3446: new             Lre/g3;
        //  3449: astore          4
        //  3451: aload           4
        //  3453: aload           12
        //  3455: aload           10
        //  3457: aload           17
        //  3459: aload           15
        //  3461: aconst_null    
        //  3462: aload           5
        //  3464: invokespecial   re/g3.<init>:(Lre/i3;Ljava/lang/String;Ljava/net/URL;[BLj0/b;Lre/e3;)V
        //  3467: aload           16
        //  3469: aload           4
        //  3471: invokevirtual   re/g4.F:(Ljava/lang/Runnable;)V
        //  3474: goto            3739
        //  3477: astore          5
        //  3479: aload_0        
        //  3480: invokevirtual   re/g7.f:()Lre/c3;
        //  3483: invokevirtual   re/c3.D:()Lre/a3;
        //  3486: aload           10
        //  3488: invokestatic    re/c3.H:(Ljava/lang/String;)Lre/b3;
        //  3491: ldc_w           "Failed to parse upload URL. Not uploading. appId"
        //  3494: aload_1        
        //  3495: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //  3498: goto            3739
        //  3501: astore          5
        //  3503: aload_1        
        //  3504: ifnull          3513
        //  3507: aload_1        
        //  3508: invokeinterface android/database/Cursor.close:()V
        //  3513: aload           5
        //  3515: athrow         
        //  3516: aload_0        
        //  3517: ldc2_w          -1
        //  3520: putfield        re/g7.E:J
        //  3523: aload_0        
        //  3524: getfield        re/g7.h:Lre/j;
        //  3527: astore          12
        //  3529: aload           12
        //  3531: invokestatic    re/g7.H:(Lre/b7;)V
        //  3534: aload_0        
        //  3535: invokevirtual   re/g7.J:()Lre/f;
        //  3538: pop            
        //  3539: getstatic       re/q2.e:Lre/p2;
        //  3542: aconst_null    
        //  3543: invokevirtual   re/p2.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  3546: checkcast       Ljava/lang/Long;
        //  3549: invokevirtual   java/lang/Long.longValue:()J
        //  3552: lstore          7
        //  3554: aload           12
        //  3556: invokevirtual   u5/w.y:()V
        //  3559: aload           12
        //  3561: invokevirtual   re/b7.z:()V
        //  3564: aload           12
        //  3566: invokevirtual   re/j.R:()Landroid/database/sqlite/SQLiteDatabase;
        //  3569: ldc_w           "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
        //  3572: iconst_1       
        //  3573: anewarray       Ljava/lang/String;
        //  3576: dup            
        //  3577: iconst_0       
        //  3578: lload_2        
        //  3579: lload           7
        //  3581: lsub           
        //  3582: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  3585: aastore        
        //  3586: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //  3589: astore_1       
        //  3590: aload_1        
        //  3591: astore          5
        //  3593: aload_1        
        //  3594: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  3599: ifne            3628
        //  3602: aload_1        
        //  3603: astore          5
        //  3605: aload           12
        //  3607: getfield        u5/w.f:Ljava/lang/Object;
        //  3610: checkcast       Lre/h4;
        //  3613: invokevirtual   re/h4.f:()Lre/c3;
        //  3616: invokevirtual   re/c3.E:()Lre/a3;
        //  3619: ldc_w           "No expired configs for apps with pending events"
        //  3622: invokevirtual   re/a3.a:(Ljava/lang/String;)V
        //  3625: goto            3697
        //  3628: aload_1        
        //  3629: astore          5
        //  3631: aload_1        
        //  3632: iconst_0       
        //  3633: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  3638: astore          4
        //  3640: aload_1        
        //  3641: invokeinterface android/database/Cursor.close:()V
        //  3646: aload           4
        //  3648: astore_1       
        //  3649: goto            3705
        //  3652: astore          4
        //  3654: goto            3668
        //  3657: astore_1       
        //  3658: aconst_null    
        //  3659: astore          5
        //  3661: goto            3750
        //  3664: astore          4
        //  3666: aconst_null    
        //  3667: astore_1       
        //  3668: aload_1        
        //  3669: astore          5
        //  3671: aload           12
        //  3673: getfield        u5/w.f:Ljava/lang/Object;
        //  3676: checkcast       Lre/h4;
        //  3679: invokevirtual   re/h4.f:()Lre/c3;
        //  3682: invokevirtual   re/c3.D:()Lre/a3;
        //  3685: aload           4
        //  3687: ldc_w           "Error selecting expired configs"
        //  3690: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  3693: aload_1        
        //  3694: ifnull          3703
        //  3697: aload_1        
        //  3698: invokeinterface android/database/Cursor.close:()V
        //  3703: aconst_null    
        //  3704: astore_1       
        //  3705: aload_1        
        //  3706: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3709: ifne            3739
        //  3712: aload_0        
        //  3713: getfield        re/g7.h:Lre/j;
        //  3716: astore          5
        //  3718: aload           5
        //  3720: invokestatic    re/g7.H:(Lre/b7;)V
        //  3723: aload           5
        //  3725: aload_1        
        //  3726: invokevirtual   re/j.S:(Ljava/lang/String;)Lre/v4;
        //  3729: astore_1       
        //  3730: aload_1        
        //  3731: ifnull          3739
        //  3734: aload_0        
        //  3735: aload_1        
        //  3736: invokevirtual   re/g7.d:(Lre/v4;)V
        //  3739: aload_0        
        //  3740: iconst_0       
        //  3741: putfield        re/g7.z:Z
        //  3744: aload_0        
        //  3745: invokevirtual   re/g7.A:()V
        //  3748: return         
        //  3749: astore_1       
        //  3750: aload           5
        //  3752: ifnull          3762
        //  3755: aload           5
        //  3757: invokeinterface android/database/Cursor.close:()V
        //  3762: aload_1        
        //  3763: athrow         
        //  3764: astore_1       
        //  3765: goto            1459
        //  3768: astore_1       
        //  3769: goto            1459
        //  3772: aload_0        
        //  3773: iconst_0       
        //  3774: putfield        re/g7.z:Z
        //  3777: aload_0        
        //  3778: invokevirtual   re/g7.A:()V
        //  3781: aload_1        
        //  3782: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  16     35     3768   3772   Any
        //  39     52     3768   3772   Any
        //  60     80     3768   3772   Any
        //  88     101    3768   3772   Any
        //  109    136    3768   3772   Any
        //  144    177    3768   3772   Any
        //  185    190    3768   3772   Any
        //  190    198    3764   3768   Any
        //  198    208    3768   3772   Any
        //  211    240    3768   3772   Any
        //  250    261    3768   3772   Any
        //  267    279    3768   3772   Any
        //  286    309    3768   3772   Any
        //  309    331    3768   3772   Any
        //  341    363    3768   3772   Any
        //  363    376    419    423    Landroid/database/sqlite/SQLiteException;
        //  363    376    415    419    Any
        //  379    388    410    415    Landroid/database/sqlite/SQLiteException;
        //  379    388    475    476    Any
        //  394    403    410    415    Landroid/database/sqlite/SQLiteException;
        //  394    403    475    476    Any
        //  426    448    475    476    Any
        //  456    462    3768   3772   Any
        //  466    472    3768   3772   Any
        //  481    488    3768   3772   Any
        //  488    490    3768   3772   Any
        //  490    543    3768   3772   Any
        //  557    562    3768   3772   Any
        //  576    586    3768   3772   Any
        //  586    643    1215   1220   Landroid/database/sqlite/SQLiteException;
        //  586    643    1208   1215   Any
        //  649    658    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  649    658    3501   3503   Any
        //  666    671    687    692    Landroid/database/sqlite/SQLiteException;
        //  666    671    3501   3503   Any
        //  671    678    3768   3772   Any
        //  698    703    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  698    703    3501   3503   Any
        //  709    714    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  709    714    3501   3503   Any
        //  723    733    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  723    733    3501   3503   Any
        //  739    749    1113   1118   Ljava/io/IOException;
        //  739    749    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  739    749    3501   3503   Any
        //  755    765    1113   1118   Ljava/io/IOException;
        //  755    765    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  755    765    3501   3503   Any
        //  771    776    1113   1118   Ljava/io/IOException;
        //  771    776    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  771    776    3501   3503   Any
        //  782    787    1072   1077   Ljava/io/IOException;
        //  782    787    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  782    787    3501   3503   Any
        //  793    800    1072   1077   Ljava/io/IOException;
        //  793    800    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  793    800    3501   3503   Any
        //  806    811    1072   1077   Ljava/io/IOException;
        //  806    811    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  806    811    3501   3503   Any
        //  817    824    1072   1077   Ljava/io/IOException;
        //  817    824    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  817    824    3501   3503   Any
        //  830    835    1072   1077   Ljava/io/IOException;
        //  830    835    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  830    835    3501   3503   Any
        //  841    846    1072   1077   Ljava/io/IOException;
        //  841    846    1201   1208   Landroid/database/sqlite/SQLiteException;
        //  841    846    3501   3503   Any
        //  849    856    1067   1069   Ljava/io/IOException;
        //  849    856    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  849    856    3501   3503   Any
        //  859    868    1067   1069   Ljava/io/IOException;
        //  859    868    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  859    868    3501   3503   Any
        //  876    881    1067   1069   Ljava/io/IOException;
        //  876    881    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  876    881    3501   3503   Any
        //  884    889    1067   1069   Ljava/io/IOException;
        //  884    889    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  884    889    3501   3503   Any
        //  892    899    1067   1069   Ljava/io/IOException;
        //  892    899    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  892    899    3501   3503   Any
        //  902    910    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  902    910    3501   3503   Any
        //  913    918    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  913    918    3501   3503   Any
        //  934    947    1016   1051   Ljava/io/IOException;
        //  934    947    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  934    947    3501   3503   Any
        //  950    961    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  950    961    3501   3503   Any
        //  964    977    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  964    977    3501   3503   Any
        //  980    988    1194   1195   Landroid/database/sqlite/SQLiteException;
        //  980    988    3501   3503   Any
        //  991    1013   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  991    1013   3501   3503   Any
        //  1021   1048   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1021   1048   3501   3503   Any
        //  1054   1064   1067   1069   Ljava/io/IOException;
        //  1054   1064   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1054   1064   3501   3503   Any
        //  1080   1102   1108   1110   Ljava/io/IOException;
        //  1080   1102   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1080   1102   3501   3503   Any
        //  1105   1108   1108   1110   Ljava/io/IOException;
        //  1105   1108   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1105   1108   3501   3503   Any
        //  1121   1148   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1121   1148   3501   3503   Any
        //  1151   1160   1194   1195   Landroid/database/sqlite/SQLiteException;
        //  1151   1160   3501   3503   Any
        //  1178   1185   3764   3768   Any
        //  1223   1250   3501   3503   Any
        //  1253   1258   3501   3503   Any
        //  1269   1276   3764   3768   Any
        //  1282   1291   3764   3768   Any
        //  1294   1317   3764   3768   Any
        //  1317   1363   3764   3768   Any
        //  1383   1424   3764   3768   Any
        //  1427   1439   3764   3768   Any
        //  1444   1455   1458   1459   Any
        //  1468   1540   3764   3768   Any
        //  1549   1593   3764   3768   Any
        //  1603   1679   3764   3768   Any
        //  1679   1709   3764   3768   Any
        //  1709   1730   3764   3768   Any
        //  1730   1749   1752   1756   Any
        //  1756   1767   1752   1756   Any
        //  1772   1791   3764   3768   Any
        //  1791   1802   3764   3768   Any
        //  1807   1817   3764   3768   Any
        //  1822   1841   3764   3768   Any
        //  1841   1852   3764   3768   Any
        //  1852   1903   3764   3768   Any
        //  1907   1926   3764   3768   Any
        //  1926   1938   3764   3768   Any
        //  1938   2033   3764   3768   Any
        //  2050   2069   3764   3768   Any
        //  2069   2080   3764   3768   Any
        //  2080   2160   3764   3768   Any
        //  2177   2220   3764   3768   Any
        //  2226   2253   3764   3768   Any
        //  2253   2265   3764   3768   Any
        //  2268   2287   3764   3768   Any
        //  2287   2298   3764   3768   Any
        //  2301   2372   3764   3768   Any
        //  2386   2396   3764   3768   Any
        //  2402   2421   3764   3768   Any
        //  2421   2434   3764   3768   Any
        //  2434   2505   3764   3768   Any
        //  2519   2538   3764   3768   Any
        //  2538   2549   3764   3768   Any
        //  2549   2620   3764   3768   Any
        //  2634   2653   3764   3768   Any
        //  2653   2692   3764   3768   Any
        //  2696   2726   3764   3768   Any
        //  2726   2737   3764   3768   Any
        //  2737   2764   3764   3768   Any
        //  2764   2788   3764   3768   Any
        //  2788   2800   3764   3768   Any
        //  2800   2871   3764   3768   Any
        //  2885   2904   3764   3768   Any
        //  2904   2915   3764   3768   Any
        //  2920   2939   3764   3768   Any
        //  2939   2950   3764   3768   Any
        //  2950   2999   3764   3768   Any
        //  2999   3018   3764   3768   Any
        //  3018   3037   3764   3768   Any
        //  3043   3080   3764   3768   Any
        //  3086   3244   3764   3768   Any
        //  3247   3258   3764   3768   Any
        //  3261   3272   3764   3768   Any
        //  3272   3313   3477   3501   Ljava/net/MalformedURLException;
        //  3272   3313   3764   3768   Any
        //  3316   3334   3477   3501   Ljava/net/MalformedURLException;
        //  3316   3334   3764   3768   Any
        //  3334   3346   3477   3501   Ljava/net/MalformedURLException;
        //  3334   3346   3764   3768   Any
        //  3356   3363   3477   3501   Ljava/net/MalformedURLException;
        //  3356   3363   3768   3772   Any
        //  3363   3370   3477   3501   Ljava/net/MalformedURLException;
        //  3363   3370   3764   3768   Any
        //  3370   3474   3477   3501   Ljava/net/MalformedURLException;
        //  3370   3474   3764   3768   Any
        //  3479   3498   3764   3768   Any
        //  3507   3513   3764   3768   Any
        //  3513   3516   3764   3768   Any
        //  3516   3564   3764   3768   Any
        //  3564   3590   3664   3668   Landroid/database/sqlite/SQLiteException;
        //  3564   3590   3657   3664   Any
        //  3593   3602   3652   3657   Landroid/database/sqlite/SQLiteException;
        //  3593   3602   3749   3750   Any
        //  3605   3625   3652   3657   Landroid/database/sqlite/SQLiteException;
        //  3605   3625   3749   3750   Any
        //  3631   3640   3652   3657   Landroid/database/sqlite/SQLiteException;
        //  3631   3640   3749   3750   Any
        //  3640   3646   3764   3768   Any
        //  3671   3693   3749   3750   Any
        //  3697   3703   3764   3768   Any
        //  3705   3730   3764   3768   Any
        //  3734   3739   3764   3768   Any
        //  3755   3762   3764   3768   Any
        //  3762   3764   3764   3768   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0391:
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
    
    public final void u(t ex, q7 ex2) {
        a.S0((Object)ex2);
        a.P0(((q7)ex2).f);
        final long nanoTime = System.nanoTime();
        this.a().y();
        this.c();
        final String f = ((q7)ex2).f;
        H((b7)this.l);
        final boolean empty = TextUtils.isEmpty((CharSequence)((q7)ex2).g);
        final int n = 1;
        if (empty && TextUtils.isEmpty((CharSequence)((q7)ex2).v)) {
            return;
        }
        if (!((q7)ex2).m) {
            this.I((q7)ex2);
            return;
        }
        final b4 f2 = this.f;
        H((b7)f2);
        if (f2.M(f, ((t)ex).f)) {
            this.f().F().c(c3.H(f), "Dropping blocked event. appId", this.q.r().d(((t)ex).f));
            final b4 f3 = this.f;
            H((b7)f3);
            if (!"1".equals(f3.j(f, "measurement.upload.blacklist_internal"))) {
                final b4 f4 = this.f;
                H((b7)f4);
                if (!"1".equals(f4.j(f, "measurement.upload.blacklist_public"))) {
                    if (!"_err".equals(((t)ex).f)) {
                        final n7 p = this.P();
                        final c j = this.J;
                        final String f5 = ((t)ex).f;
                        p.getClass();
                        n7.O((m7)j, f, 11, "_ev", f5, 0);
                    }
                    return;
                }
            }
            final j h = this.h;
            H((b7)h);
            final v4 s = h.S(f);
            if (s != null) {
                s.a.a().y();
                final long e = s.E;
                s.a.a().y();
                final long abs = Math.abs(((k)this.g()).h0() - Math.max(e, s.D));
                this.J();
                if (abs > (long)q2.z.a((Object)null)) {
                    this.f().C().a("Fetching config for blocked app");
                    this.d(s);
                }
            }
            return;
        }
        final re.d3 b = re.d3.b((t)ex);
        final n7 p2 = this.P();
        final f i = this.J();
        i.getClass();
        p2.N(b, Math.max(Math.min(i.C(f, q2.I), 100), 25));
        final t a = b.a();
        if (Log.isLoggable(this.f().K(), 2)) {
            this.f().E().b(this.q.r().c(a), "Logging event");
        }
        final j h2 = this.h;
        H((b7)h2);
        h2.e0();
        try {
            this.I((q7)ex2);
            boolean b2 = "ecommerce_purchase".equals(a.f) || "purchase".equals(a.f) || "refund".equals(a.f);
            String s3 = null;
        Label_1142:
            while (true) {
                Label_0579: {
                    if ("_iap".equals(a.f)) {
                        break Label_0579;
                    }
                    if (b2) {
                        b2 = true;
                        break Label_0579;
                    }
                    final String s2 = "_err";
                    s3 = s2;
                    break Label_1142;
                }
                final String string = ((BaseBundle)a.g.f).getString("currency");
                long n4;
                if (b2) {
                    double n2 = a.g.j() * 1000000.0;
                    if (n2 == 0.0) {
                        n2 = ((BaseBundle)a.g.f).getLong("value") * 1000000.0;
                    }
                    if (n2 > 9.223372036854776E18 || n2 < -9.223372036854776E18) {
                        this.f().F().c(c3.H(f), "Data lost. Currency value is too big. appId", n2);
                        final j h3 = this.h;
                        H((b7)h3);
                        h3.D();
                        final j h4 = this.h;
                        H((b7)h4);
                        h4.f0();
                        return;
                    }
                    final long n3 = n4 = Math.round(n2);
                    if ("refund".equals(a.f)) {
                        n4 = -n3;
                    }
                }
                else {
                    n4 = ((BaseBundle)a.g.f).getLong("value");
                }
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    final String upperCase = string.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        final String concat = "_ltv_".concat(upperCase);
                        final j h5 = this.h;
                        H((b7)h5);
                        ex = (SQLiteException)h5.X(f, concat);
                        l7 l7 = null;
                        Label_1037: {
                            if (ex != null) {
                                ex = (SQLiteException)((l7)ex).e;
                                if (ex instanceof Long) {
                                    l7 = new l7(f, a.h, ((k)this.g()).h0(), concat, (Object)((long)ex + n4));
                                    break Label_1037;
                                }
                            }
                            final j h6 = this.h;
                            H((b7)h6);
                            final int c = this.J().C(f, q2.E);
                            yd.a.P0(f);
                            ((u5.w)h6).y();
                            ((b7)h6).z();
                            try {
                                ex = (SQLiteException)h6.R();
                                try {
                                    ((SQLiteDatabase)ex).execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", (Object[])new String[] { f, f, String.valueOf(c - 1) });
                                }
                                catch (final SQLiteException ex) {}
                            }
                            catch (final SQLiteException ex3) {}
                            ((h4)((u5.w)h6).f).f().D().c(c3.H(f), "Error pruning currencies. appId", ex);
                            l7 = new l7(f, a.h, ((k)this.g()).h0(), concat, (Object)n4);
                        }
                        final String s4 = "_err";
                        final j h7 = this.h;
                        H((b7)h7);
                        s3 = s4;
                        if (!h7.J(l7)) {
                            this.f().D().d(c3.H(f), "Too many unique user properties are set. Ignoring user property. appId", this.q.r().f(l7.c), l7.e);
                            final n7 p3 = this.P();
                            final c k = this.J;
                            p3.getClass();
                            n7.O((m7)k, f, 9, null, null, 0);
                            s3 = s4;
                        }
                        break Label_1142;
                    }
                }
                final String s2 = "_err";
                continue;
            }
            final boolean l8 = n7.l0(a.f);
            final boolean equals = s3.equals(a.f);
            this.P();
            final r g = a.g;
            long n5;
            if (g == null) {
                n5 = 0L;
            }
            else {
                final q q = new q(g);
                long n6 = 0L;
                while (true) {
                    n5 = n6;
                    if (!q.hasNext()) {
                        break;
                    }
                    final Object value = ((BaseBundle)g.f).get((String)q.f.next());
                    if (!(value instanceof Parcelable[])) {
                        continue;
                    }
                    n6 += ((Parcelable[])value).length;
                }
            }
            final j h8 = this.h;
            H((b7)h8);
            ex = (SQLiteException)h8.V(this.v(), f, n5 + 1L, true, l8, false, equals, false);
            final long b3 = ((h)ex).b;
            this.J();
            final long n7 = b3 - (int)q2.l.a((Object)null);
            if (n7 > 0L) {
                if (n7 % 1000L == 1L) {
                    this.f().D().c(c3.H(f), "Data loss. Too many events logged. appId, count", ((h)ex).b);
                }
                final j h9 = this.h;
                H((b7)h9);
                h9.D();
                final j h10 = this.h;
                H((b7)h10);
                h10.f0();
                return;
            }
            if (l8) {
                final long a2 = ((h)ex).a;
                this.J();
                final long n8 = a2 - (int)q2.n.a((Object)null);
                if (n8 > 0L) {
                    if (n8 % 1000L == 1L) {
                        this.f().D().c(c3.H(f), "Data loss. Too many public events logged. appId, count", ((h)ex).a);
                    }
                    final n7 p4 = this.P();
                    final c m = this.J;
                    final String f6 = a.f;
                    p4.getClass();
                    re.n7.O((m7)m, f, 16, "_ev", f6, 0);
                    final j h11 = this.h;
                    H((b7)h11);
                    h11.D();
                    final j h12 = this.h;
                    H((b7)h12);
                    h12.f0();
                    return;
                }
            }
            if (equals) {
                final long n9 = ((h)ex).d - Math.max(0, Math.min(1000000, this.J().C(((q7)ex2).f, q2.m)));
                if (n9 > 0L) {
                    if (n9 == 1L) {
                        this.f().D().c(c3.H(f), "Too many error events logged. appId, count", ((h)ex).d);
                    }
                    final j h13 = this.h;
                    H((b7)h13);
                    h13.D();
                    final j h14 = this.h;
                    H((b7)h14);
                    h14.f0();
                    return;
                }
            }
            final Bundle f7 = a.g.f();
            this.P().P(f7, "_o", a.h);
            if (this.P().h0(f)) {
                final n7 p5 = this.P();
                ex = (SQLiteException)Long.valueOf(1L);
                p5.P(f7, "_dbg", ex);
                this.P().P(f7, "_r", ex);
            }
            if ("_s".equals(a.f)) {
                final j h15 = this.h;
                H((b7)h15);
                ex = (SQLiteException)h15.X(((q7)ex2).f, "_sno");
                if (ex != null && ((l7)ex).e instanceof Long) {
                    this.P().P(f7, "_sno", ((l7)ex).e);
                }
            }
            final j h16 = this.h;
            H((b7)h16);
            yd.a.P0(f);
            ((u5.w)h16).y();
            ((b7)h16).z();
            try {
                ex = (SQLiteException)h16.R();
                final int max = Math.max(0, Math.min(1000000, ((h4)((u5.w)h16).f).m().C(f, q2.q)));
                try {
                    final long n10 = ((SQLiteDatabase)ex).delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { f, String.valueOf(max) });
                }
                catch (final SQLiteException ex) {}
            }
            catch (final SQLiteException ex4) {}
            ((h4)((u5.w)h16).f).f().D().c(c3.H(f), "Error deleting over the limit events. appId", ex);
            final long n10 = 0L;
            if (n10 > 0L) {
                this.f().F().c(c3.H(f), "Data lost. Too many events stored on disk, deleted. appId", n10);
            }
            ex = (SQLiteException)new o(this.q, a.h, f, a.f, a.i, f7);
            final j h17 = this.h;
            H((b7)h17);
            final p w = h17.W(f, ((o)ex).b);
            Label_2324: {
                if (w == null) {
                    final j h18 = this.h;
                    H((b7)h18);
                    final long q2 = h18.Q(f);
                    final f j2 = this.J();
                    j2.getClass();
                    final p2 h19 = re.q2.H;
                    if (q2 >= Math.max(Math.min(j2.C(f, h19), 2000), 500) && l8) {
                        final a3 d = this.f().D();
                        final b3 h20 = c3.H(f);
                        final String d2 = this.q.r().d(((o)ex).b);
                        final f j3 = this.J();
                        j3.getClass();
                        d.d(h20, "Too many event names used, ignoring event. appId, name, supported count", d2, Math.max(Math.min(j3.C(f, h19), 2000), 500));
                        final n7 p6 = this.P();
                        final c j4 = this.J;
                        p6.getClass();
                        re.n7.O((m7)j4, f, 8, null, null, 0);
                        final j h21 = this.h;
                        H((b7)h21);
                        h21.f0();
                        return;
                    }
                    final p p7 = new p(f, ((o)ex).b, 0L, 0L, 0L, ((o)ex).d, 0L, (Long)null, (Long)null, (Long)null, (Boolean)null);
                    break Label_2324;
                }
                ex = (SQLiteException)((o)ex).a(this.q, w.f);
                final long d3 = ((o)ex).d;
                final String a3 = w.a;
                final String b4 = w.b;
                final long c2 = w.c;
                final long d4 = w.d;
                final long e2 = w.e;
                final long g2 = w.g;
                final Long h22 = w.h;
                try {
                    final p p7 = new p(a3, b4, c2, d4, e2, d3, g2, h22, w.i, w.j, w.k);
                    final Object o = "_r";
                    final j h23 = this.h;
                    H((b7)h23);
                    h23.F(p7);
                    this.a().y();
                    this.c();
                    yd.a.P0(((o)ex).a);
                    yd.a.K0(((o)ex).a.equals(((q7)ex2).f));
                    final n3 a4 = o3.A1();
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.k0((o3)a4.g);
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.H0((o3)a4.g);
                    if (!TextUtils.isEmpty((CharSequence)((q7)ex2).f)) {
                        final String f8 = ((q7)ex2).f;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.P0((o3)a4.g, f8);
                    }
                    if (!TextUtils.isEmpty((CharSequence)((q7)ex2).i)) {
                        final String i2 = ((q7)ex2).i;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.O0((o3)a4.g, i2);
                    }
                    if (!TextUtils.isEmpty((CharSequence)((q7)ex2).h)) {
                        final String h24 = ((q7)ex2).h;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.R((o3)a4.g, h24);
                    }
                    com.google.android.gms.internal.measurement.y.a();
                    if (this.J().H((String)null, q2.t0) && !TextUtils.isEmpty((CharSequence)((q7)ex2).C)) {
                        final String c3 = ((q7)ex2).C;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.r0((o3)a4.g, c3);
                    }
                    final long o2 = ((q7)ex2).o;
                    if (o2 != -2147483648L) {
                        final int n11 = (int)o2;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.j0((o3)a4.g, n11);
                    }
                    final long j5 = ((q7)ex2).j;
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.S((o3)a4.g, j5);
                    if (!TextUtils.isEmpty((CharSequence)((q7)ex2).g)) {
                        final String g3 = ((q7)ex2).g;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.e0((o3)a4.g, g3);
                    }
                    final String f9 = ((q7)ex2).f;
                    yd.a.S0((Object)f9);
                    final String e3 = this.K(f9).c(re.g.b(((q7)ex2).A)).e();
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.O((o3)a4.g, e3);
                    if (a4.s().isEmpty() && !TextUtils.isEmpty((CharSequence)((q7)ex2).v)) {
                        final String v = ((q7)ex2).v;
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.J((o3)a4.g, v);
                    }
                    final long k2 = ((q7)ex2).k;
                    if (k2 != 0L) {
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.a0((o3)a4.g, k2);
                    }
                    final long x = ((q7)ex2).x;
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.M((o3)a4.g, x);
                    final i7 l9 = this.l;
                    H((b7)l9);
                    final Map b5 = q2.b(((a7)l9).g.q.q());
                    ArrayList list2 = null;
                    Label_3242: {
                        if (b5 != null) {
                            if (!b5.isEmpty()) {
                                final ArrayList list = new ArrayList();
                                final int intValue = (int)q2.P.a((Object)null);
                                for (final Map.Entry<String, V> entry : b5.entrySet()) {
                                    if (entry.getKey().startsWith("measurement.id.")) {
                                        try {
                                            final int int1 = Integer.parseInt((String)entry.getValue());
                                            if (int1 == 0) {
                                                continue;
                                            }
                                            list.add(int1);
                                            if (list.size() < intValue) {
                                                continue;
                                            }
                                            ((h4)((u5.w)l9).f).f().F().b(list.size(), "Too many experiment IDs. Number of IDs");
                                        }
                                        catch (final NumberFormatException ex5) {
                                            ((h4)((u5.w)l9).f).f().F().b(ex5, "Experiment ID NumberFormatException");
                                            continue;
                                        }
                                        break;
                                    }
                                }
                                list2 = list;
                                if (!list.isEmpty()) {
                                    break Label_3242;
                                }
                            }
                        }
                        list2 = null;
                    }
                    if (list2 != null) {
                        a4.u(list2);
                    }
                    final String f10 = ((q7)ex2).f;
                    yd.a.S0((Object)f10);
                    final g c4 = this.K(f10).c(re.g.b(((q7)ex2).A));
                    final zzah zza = zzah.zza;
                    if (c4.f(zza) && (!this.J().H((String)null, q2.g0) || ((q7)ex2).t)) {
                        final o6 n12 = this.n;
                        final String f11 = ((q7)ex2).f;
                        n12.getClass();
                        Pair c5;
                        if (c4.f(zza)) {
                            c5 = n12.C(f11);
                        }
                        else {
                            c5 = new Pair((Object)"", (Object)Boolean.FALSE);
                        }
                        if (!TextUtils.isEmpty((CharSequence)c5.first) && ((q7)ex2).t) {
                            final String s5 = (String)c5.first;
                            if (a4.h) {
                                a4.l();
                                a4.h = false;
                            }
                            o3.U((o3)a4.g, s5);
                            final Object second = c5.second;
                            if (second != null) {
                                final boolean booleanValue = (boolean)second;
                                if (a4.h) {
                                    a4.l();
                                    a4.h = false;
                                }
                                o3.W((o3)a4.g, booleanValue);
                            }
                        }
                    }
                    this.q.n().A();
                    final String model = Build.MODEL;
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.K0((o3)a4.g, model);
                    this.q.n().A();
                    final String release = Build$VERSION.RELEASE;
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.I0((o3)a4.g, release);
                    final int n13 = (int)this.q.n().D();
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.N0((o3)a4.g, n13);
                    final String e4 = this.q.n().E();
                    if (a4.h) {
                        a4.l();
                        a4.h = false;
                    }
                    o3.M0((o3)a4.g, e4);
                    if (this.q.d()) {
                        a4.r();
                        if (!TextUtils.isEmpty((CharSequence)null)) {
                            if (a4.h) {
                                a4.l();
                                a4.h = false;
                            }
                            final o3 o3 = (o3)a4.g;
                            throw null;
                        }
                    }
                    final j h25 = this.h;
                    H((b7)h25);
                    v4 s6;
                    if ((s6 = h25.S(((q7)ex2).f)) == null) {
                        s6 = new v4(this.q, ((q7)ex2).f);
                        s6.b(this.Q(c4));
                        s6.i(((q7)ex2).p);
                        s6.j(((q7)ex2).g);
                        if (c4.f(zza)) {
                            s6.q(this.n.D(((q7)ex2).f, ((q7)ex2).t));
                        }
                        s6.n(0L);
                        s6.o(0L);
                        s6.m(0L);
                        s6.d(((q7)ex2).h);
                        s6.e(((q7)ex2).o);
                        s6.c(((q7)ex2).i);
                        s6.k(((q7)ex2).j);
                        s6.g(((q7)ex2).k);
                        s6.p(((q7)ex2).m);
                        s6.h(((q7)ex2).x);
                        final j h26 = this.h;
                        H((b7)h26);
                        h26.E(s6);
                    }
                    if (c4.f(zzah.zzb) && !TextUtils.isEmpty((CharSequence)s6.w())) {
                        final String w2 = s6.w();
                        yd.a.S0((Object)w2);
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.Y((o3)a4.g, w2);
                    }
                    if (!TextUtils.isEmpty((CharSequence)s6.y())) {
                        final String y = s6.y();
                        yd.a.S0((Object)y);
                        if (a4.h) {
                            a4.l();
                            a4.h = false;
                        }
                        o3.i0((o3)a4.g, y);
                    }
                    final j h27 = this.h;
                    H((b7)h27);
                    final List c6 = h27.c0(((q7)ex2).f);
                    for (int n14 = 0; n14 < c6.size(); ++n14) {
                        final w3 u = x3.u();
                        u.n(c6.get(n14).c);
                        u.o(c6.get(n14).d);
                        final i7 l10 = this.l;
                        H((b7)l10);
                        final Object e5 = c6.get(n14).e;
                        yd.a.S0(e5);
                        if (u.h) {
                            u.l();
                            u.h = false;
                        }
                        x3.B((x3)u.g);
                        if (u.h) {
                            u.l();
                            u.h = false;
                        }
                        x3.D((x3)u.g);
                        if (u.h) {
                            u.l();
                            u.h = false;
                        }
                        x3.F((x3)u.g);
                        if (e5 instanceof String) {
                            final String s7 = (String)e5;
                            if (u.h) {
                                u.l();
                                u.h = false;
                            }
                            x3.A((x3)u.g, s7);
                        }
                        else if (e5 instanceof Long) {
                            u.m((long)e5);
                        }
                        else if (e5 instanceof Double) {
                            final double doubleValue = (double)e5;
                            if (u.h) {
                                u.l();
                                u.h = false;
                            }
                            x3.E((x3)u.g, doubleValue);
                        }
                        else {
                            ((h4)((u5.w)l10).f).f().k.b(e5, "Ignoring invalid (type) user attribute value");
                        }
                        a4.v(u);
                    }
                    Label_4966: {
                        try {
                            ex2 = (SQLiteException)this.h;
                            H((b7)ex2);
                            Object h28 = a4.j();
                            ((u5.w)ex2).y();
                            ((b7)ex2).z();
                            yd.a.P0(((o3)h28).E1());
                            final byte[] i3 = ((com.google.android.gms.internal.measurement.b)h28).i();
                            final i7 l11 = ((a7)ex2).g.l;
                            H((b7)l11);
                            final long m2 = l11.M(i3);
                            final ContentValues contentValues = new ContentValues();
                            contentValues.put("app_id", ((o3)h28).E1());
                            contentValues.put("metadata_fingerprint", Long.valueOf(m2));
                            contentValues.put("metadata", i3);
                            try {
                                ((j)ex2).R().insertWithOnConflict("raw_events_metadata", (String)null, contentValues, 4);
                                h28 = this.h;
                                H((b7)h28);
                                ex2 = (SQLiteException)((o)ex).f;
                                final q q3 = new q((r)ex2);
                                ex2 = (SQLiteException)o;
                                while (true) {
                                    while (q3.hasNext()) {
                                        if (((String)ex2).equals(q3.f.next())) {
                                            final int n15 = n;
                                            ((u5.w)h28).y();
                                            ((b7)h28).z();
                                            yd.a.P0(((o)ex).a);
                                            ex2 = (SQLiteException)((a7)h28).g.l;
                                            H((b7)ex2);
                                            final byte[] i4 = ((i7)ex2).Q((o)ex).i();
                                            ex2 = (SQLiteException)new ContentValues();
                                            ((ContentValues)ex2).put("app_id", ((o)ex).a);
                                            ((ContentValues)ex2).put("name", ((o)ex).b);
                                            ((ContentValues)ex2).put("timestamp", Long.valueOf(((o)ex).d));
                                            ((ContentValues)ex2).put("metadata_fingerprint", Long.valueOf(m2));
                                            ((ContentValues)ex2).put("data", i4);
                                            ((ContentValues)ex2).put("realtime", Integer.valueOf(n15));
                                            try {
                                                if (((j)h28).R().insert("raw_events", (String)null, (ContentValues)ex2) == -1L) {
                                                    ((h4)((u5.w)h28).f).f().D().b(c3.H(((o)ex).a), "Failed to insert raw event (got -1). appId");
                                                }
                                                else {
                                                    this.t = 0L;
                                                }
                                            }
                                            catch (final SQLiteException ex2) {
                                                ((h4)((u5.w)h28).f).f().D().c(c3.H(((o)ex).a), "Error storing raw event. appId", ex2);
                                            }
                                            break Label_4966;
                                        }
                                    }
                                    ex2 = (SQLiteException)this.f;
                                    H((b7)ex2);
                                    final boolean l12 = ((b4)ex2).L(((o)ex).a, ((o)ex).b);
                                    ex2 = (SQLiteException)this.h;
                                    H((b7)ex2);
                                    ex2 = (SQLiteException)((j)ex2).U(this.v(), ((o)ex).a, false, false);
                                    if (l12 && ((h)ex2).e < this.J().C(((o)ex).a, q2.p)) {
                                        final int n15 = n;
                                        continue;
                                    }
                                    final int n15 = 0;
                                    continue;
                                }
                            }
                            catch (final SQLiteException ex6) {
                                ((h4)((u5.w)ex2).f).f().D().c(c3.H(((o3)h28).E1()), "Error storing raw event metadata. appId", ex6);
                                throw ex6;
                            }
                        }
                        catch (final IOException ex7) {
                            this.f().D().c(c3.H(a4.r()), "Data loss. Failed to insert raw event metadata. appId", ex7);
                        }
                    }
                    final j h29 = this.h;
                    H((b7)h29);
                    h29.D();
                    final j h30 = this.h;
                    H((b7)h30);
                    h30.f0();
                    this.C();
                    this.f().E().b((System.nanoTime() - nanoTime + 500000L) / 1000000L, "Background event processing time, ms");
                    return;
                }
                finally {}
            }
        }
        finally {}
        final j h31 = this.h;
        H((b7)h31);
        h31.f0();
    }
    
    public final long v() {
        ((k)this.g()).getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final o6 n = this.n;
        ((b7)n).z();
        ((u5.w)n).y();
        long a;
        if ((a = n.n.a()) == 0L) {
            a = ((h4)((u5.w)n).f).y().H().nextInt(86400000) + 1L;
            n.n.b(a);
        }
        return (currentTimeMillis + a) / 1000L / 60L / 60L / 24L;
    }
    
    public final q7 y(final String s) {
        final j h = this.h;
        H((b7)h);
        final v4 s2 = h.S(s);
        if (s2 == null || TextUtils.isEmpty((CharSequence)s2.x())) {
            this.f().r.b(s, "No app data available; dropping");
            return null;
        }
        final Boolean z = this.z(s2);
        if (z != null && !z) {
            this.f().k.b(c3.H(s), "App version does not match; dropping. appId");
            return null;
        }
        final String z2 = s2.z();
        final String x = s2.x();
        final long s3 = s2.s();
        s2.a.a().y();
        final String l = s2.l;
        s2.a.a().y();
        final long m = s2.m;
        s2.a.a().y();
        final long n = s2.n;
        s2.a.a().y();
        final boolean o = s2.o;
        final String y = s2.y();
        s2.a.a().y();
        s2.a.a().y();
        final boolean p = s2.p;
        final String t = s2.t();
        s2.a.a().y();
        final Boolean r = s2.r;
        s2.a.a().y();
        final long s4 = s2.s;
        s2.a.a().y();
        return new q7(s, z2, x, s3, l, m, n, (String)null, o, false, y, 0L, 0, p, false, t, r, s4, (List)s2.t, this.K(s).e(), "", (String)null);
    }
    
    public final Boolean z(final v4 v4) {
        try {
            if (v4.s() != -2147483648L) {
                if (v4.s() == yd.c.a(this.q.f).b(0, v4.v()).versionCode) {
                    return Boolean.TRUE;
                }
            }
            else {
                final String versionName = yd.c.a(this.q.f).b(0, v4.v()).versionName;
                final String x = v4.x();
                if (x != null && x.equals(versionName)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
}
