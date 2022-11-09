// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import android.os.BaseBundle;
import android.os.Parcelable;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.os.Bundle;
import android.util.Log;
import android.text.TextUtils;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import kotlin.NoWhenBranchMatchedException;
import ma0.b$a;
import ma0.b$b;
import kotlin.text.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import u2.k;
import u2.j;
import xe.g;
import qd.e1;
import qd.l0;
import xe.h;
import rd.q;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import s40.e;
import re.h4;
import ma0.d;
import java.util.Map;
import android.view.ViewGroup;
import android.os.Parcel;
import com.google.firebase.database.snapshot.f;
import java.util.ArrayList;
import xe.a;
import pg.l;
import qd.m;
import rd.c0;

public final class c implements b6.c, c0, m, xe.c, l, a, rk.a
{
    public Object f = f;
    
    public c(final int n, final int n2) {
        if (n == 9) {
            this.f = com.google.firebase.database.snapshot.f.j;
            return;
        }
        if (n != 11) {
            final Parcel obtain = Parcel.obtain();
            ah2.f.e((Object)obtain, "obtain()");
            this.f = obtain;
            return;
        }
    }
    
    public final String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface)this.f).getSupportedFeatures();
    }
    
    public final void accept(final Object o, Object obtain) {
        final q q = (q)this.f;
        final td.d d = (td.d)o;
        final h h = (h)obtain;
        final com.google.android.gms.common.api.a k = td.c.k;
        final td.a a = ((rd.b<td.a>)d).C();
        obtain = Parcel.obtain();
        ((Parcel)obtain).writeInterfaceToken(a.b);
        final int a2 = fe.c.a;
        if (q == null) {
            ((Parcel)obtain).writeInt(0);
        }
        else {
            ((Parcel)obtain).writeInt(1);
            ((Parcelable)q).writeToParcel((Parcel)obtain, 0);
        }
        try {
            a.a.transact(1, (Parcel)obtain, (Parcel)null, 1);
            ((Parcel)obtain).recycle();
            h.b(null);
        }
        finally {
            ((Parcel)obtain).recycle();
        }
    }
    
    public final boolean b() {
        final e1 i = ((l0)this.f).i;
        return i != null && i.g();
    }
    
    public final void c(final g p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        c1/c.f:Ljava/lang/Object;
        //     4: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //     7: invokevirtual   android/app/Activity.isDestroyed:()Z
        //    10: ifne            624
        //    13: aload_0        
        //    14: getfield        c1/c.f:Ljava/lang/Object;
        //    17: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //    20: invokevirtual   android/app/Activity.isFinishing:()Z
        //    23: ifeq            29
        //    26: goto            624
        //    29: aload_0        
        //    30: getfield        c1/c.f:Ljava/lang/Object;
        //    33: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //    36: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    39: astore_1       
        //    40: aload_0        
        //    41: getfield        c1/c.f:Ljava/lang/Object;
        //    44: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //    47: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.l:Lxe/x;
        //    50: invokevirtual   xe/x.n:()Z
        //    53: ifeq            73
        //    56: aload_0        
        //    57: getfield        c1/c.f:Ljava/lang/Object;
        //    60: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //    63: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.l:Lxe/x;
        //    66: invokevirtual   xe/x.j:()Ljava/lang/Object;
        //    69: checkcast       Ljava/lang/String;
        //    72: astore_1       
        //    73: aload_0        
        //    74: getfield        c1/c.f:Ljava/lang/Object;
        //    77: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //    80: astore_2       
        //    81: aload_2        
        //    82: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.m:Lte/c;
        //    85: astore_3       
        //    86: aload_2        
        //    87: aload_2        
        //    88: aload_1        
        //    89: invokestatic    te/c.b:(Landroidx/appcompat/app/f;Ljava/lang/String;)Ly0/f;
        //    92: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.n:Ly0/f;
        //    95: aload_0        
        //    96: getfield        c1/c.f:Ljava/lang/Object;
        //    99: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   102: astore_1       
        //   103: aload_1        
        //   104: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.m:Lte/c;
        //   107: astore_2       
        //   108: aload_1        
        //   109: invokevirtual   android/app/Activity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   112: astore_2       
        //   113: aload_0        
        //   114: getfield        c1/c.f:Ljava/lang/Object;
        //   117: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   120: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.n:Ly0/f;
        //   123: astore_3       
        //   124: aload_3        
        //   125: getfield        y0/f.g:Ljava/lang/Object;
        //   128: checkcast       Landroid/content/res/Resources;
        //   131: astore          4
        //   133: aload           4
        //   135: aload           4
        //   137: ldc             "libraries_social_licenses_license_activity"
        //   139: ldc             "layout"
        //   141: aload_3        
        //   142: getfield        y0/f.h:Ljava/lang/Object;
        //   145: checkcast       Ljava/lang/String;
        //   148: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   151: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //   154: astore          5
        //   156: aconst_null    
        //   157: astore          6
        //   159: aconst_null    
        //   160: astore          4
        //   162: aconst_null    
        //   163: astore          7
        //   165: aconst_null    
        //   166: astore_3       
        //   167: aload_1        
        //   168: aload_2        
        //   169: aload           5
        //   171: aconst_null    
        //   172: iconst_0       
        //   173: invokevirtual   android/view/LayoutInflater.inflate:(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;
        //   176: invokevirtual   androidx/appcompat/app/f.setContentView:(Landroid/view/View;)V
        //   179: aload_0        
        //   180: getfield        c1/c.f:Ljava/lang/Object;
        //   183: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   186: astore_1       
        //   187: aload_1        
        //   188: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.m:Lte/c;
        //   191: astore_2       
        //   192: aload_1        
        //   193: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.n:Ly0/f;
        //   196: astore_2       
        //   197: aload_1        
        //   198: aload_1        
        //   199: aload_2        
        //   200: getfield        y0/f.g:Ljava/lang/Object;
        //   203: checkcast       Landroid/content/res/Resources;
        //   206: ldc             "license_activity_scrollview"
        //   208: ldc             "id"
        //   210: aload_2        
        //   211: getfield        y0/f.h:Ljava/lang/Object;
        //   214: checkcast       Ljava/lang/String;
        //   217: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   220: invokevirtual   androidx/appcompat/app/f.findViewById:(I)Landroid/view/View;
        //   223: checkcast       Landroid/widget/ScrollView;
        //   226: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.h:Landroid/widget/ScrollView;
        //   229: aload_0        
        //   230: getfield        c1/c.f:Ljava/lang/Object;
        //   233: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   236: astore_1       
        //   237: aload_1        
        //   238: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.m:Lte/c;
        //   241: astore_2       
        //   242: aload_1        
        //   243: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.n:Ly0/f;
        //   246: astore_2       
        //   247: aload_1        
        //   248: aload_1        
        //   249: aload_2        
        //   250: getfield        y0/f.g:Ljava/lang/Object;
        //   253: checkcast       Landroid/content/res/Resources;
        //   256: ldc_w           "license_activity_textview"
        //   259: ldc             "id"
        //   261: aload_2        
        //   262: getfield        y0/f.h:Ljava/lang/Object;
        //   265: checkcast       Ljava/lang/String;
        //   268: invokevirtual   android/content/res/Resources.getIdentifier:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //   271: invokevirtual   androidx/appcompat/app/f.findViewById:(I)Landroid/view/View;
        //   274: checkcast       Landroid/widget/TextView;
        //   277: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.i:Landroid/widget/TextView;
        //   280: aload_0        
        //   281: getfield        c1/c.f:Ljava/lang/Object;
        //   284: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   287: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.k:Lxe/x;
        //   290: invokevirtual   xe/x.n:()Z
        //   293: ifeq            318
        //   296: aload_0        
        //   297: getfield        c1/c.f:Ljava/lang/Object;
        //   300: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   303: astore_1       
        //   304: aload_1        
        //   305: aload_1        
        //   306: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.k:Lxe/x;
        //   309: invokevirtual   xe/x.j:()Ljava/lang/Object;
        //   312: checkcast       Ljava/lang/String;
        //   315: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   318: aload_0        
        //   319: getfield        c1/c.f:Ljava/lang/Object;
        //   322: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   325: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   328: astore_1       
        //   329: aload_1        
        //   330: ifnull          340
        //   333: aload_1        
        //   334: invokevirtual   java/lang/String.isEmpty:()Z
        //   337: ifeq            468
        //   340: aload_0        
        //   341: getfield        c1/c.f:Ljava/lang/Object;
        //   344: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   347: astore          5
        //   349: aload           5
        //   351: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.f:Lle/b;
        //   354: astore_1       
        //   355: aload_1        
        //   356: getfield        le/b.g:J
        //   359: lstore          8
        //   361: aload_1        
        //   362: getfield        le/b.h:I
        //   365: istore          10
        //   367: aload_1        
        //   368: getfield        le/b.i:Ljava/lang/String;
        //   371: astore          11
        //   373: aload           11
        //   375: invokevirtual   java/lang/String.isEmpty:()Z
        //   378: ifeq            397
        //   381: iload           10
        //   383: lload           8
        //   385: aload           5
        //   387: ldc_w           "third_party_licenses"
        //   390: invokestatic    p2/e.n:(IJLandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //   393: astore_1       
        //   394: goto            462
        //   397: aload           6
        //   399: astore_1       
        //   400: new             Ljava/util/jar/JarFile;
        //   403: astore_2       
        //   404: aload           6
        //   406: astore_1       
        //   407: aload_2        
        //   408: aload           11
        //   410: invokespecial   java/util/jar/JarFile.<init>:(Ljava/lang/String;)V
        //   413: aload_2        
        //   414: ldc_w           "res/raw/third_party_licenses"
        //   417: invokevirtual   java/util/jar/JarFile.getJarEntry:(Ljava/lang/String;)Ljava/util/jar/JarEntry;
        //   420: astore_1       
        //   421: aload_1        
        //   422: ifnonnull       437
        //   425: aload           7
        //   427: astore_1       
        //   428: aload_2        
        //   429: invokevirtual   java/util/zip/ZipFile.close:()V
        //   432: aload_3        
        //   433: astore_1       
        //   434: goto            458
        //   437: aload_2        
        //   438: aload_1        
        //   439: invokevirtual   java/util/jar/JarFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   442: lload           8
        //   444: iload           10
        //   446: invokestatic    p2/e.p:(Ljava/io/InputStream;JI)Ljava/lang/String;
        //   449: astore_3       
        //   450: aload_3        
        //   451: astore_1       
        //   452: aload_2        
        //   453: invokevirtual   java/util/zip/ZipFile.close:()V
        //   456: aload_3        
        //   457: astore_1       
        //   458: aload_1        
        //   459: ifnull          547
        //   462: aload           5
        //   464: aload_1        
        //   465: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   468: aload_0        
        //   469: getfield        c1/c.f:Ljava/lang/Object;
        //   472: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   475: astore_1       
        //   476: aload_1        
        //   477: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   480: ifnonnull       494
        //   483: aload_1        
        //   484: aload_1        
        //   485: ldc_w           2131955358
        //   488: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   491: putfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   494: aload_0        
        //   495: getfield        c1/c.f:Ljava/lang/Object;
        //   498: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   501: astore_1       
        //   502: aload_1        
        //   503: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.i:Landroid/widget/TextView;
        //   506: aload_1        
        //   507: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.g:Ljava/lang/String;
        //   510: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   513: aload_0        
        //   514: getfield        c1/c.f:Ljava/lang/Object;
        //   517: checkcast       Lcom/google/android/gms/oss/licenses/OssLicensesActivity;
        //   520: astore_1       
        //   521: aload_1        
        //   522: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.j:I
        //   525: ifne            529
        //   528: return         
        //   529: aload_1        
        //   530: getfield        com/google/android/gms/oss/licenses/OssLicensesActivity.h:Landroid/widget/ScrollView;
        //   533: new             Lnd/k;
        //   536: dup            
        //   537: aload_0        
        //   538: iconst_1       
        //   539: invokespecial   nd/k.<init>:(Ljava/lang/Object;I)V
        //   542: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   545: pop            
        //   546: return         
        //   547: new             Ljava/lang/RuntimeException;
        //   550: dup            
        //   551: aload           11
        //   553: invokevirtual   java/lang/String.length:()I
        //   556: bipush          46
        //   558: iadd           
        //   559: aload           11
        //   561: ldc_w           " does not contain res/raw/third_party_licenses"
        //   564: invokestatic    a40/f.k:(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   567: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   570: athrow         
        //   571: astore_1       
        //   572: goto            614
        //   575: astore_3       
        //   576: goto            587
        //   579: astore_3       
        //   580: goto            610
        //   583: astore_3       
        //   584: aload           4
        //   586: astore_2       
        //   587: aload_2        
        //   588: astore_1       
        //   589: new             Ljava/lang/RuntimeException;
        //   592: astore          4
        //   594: aload_2        
        //   595: astore_1       
        //   596: aload           4
        //   598: ldc_w           "Failed to read license text."
        //   601: aload_3        
        //   602: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   605: aload_2        
        //   606: astore_1       
        //   607: aload           4
        //   609: athrow         
        //   610: aload_1        
        //   611: astore_2       
        //   612: aload_3        
        //   613: astore_1       
        //   614: aload_2        
        //   615: ifnull          622
        //   618: aload_2        
        //   619: invokevirtual   java/util/zip/ZipFile.close:()V
        //   622: aload_1        
        //   623: athrow         
        //   624: return         
        //   625: astore_2       
        //   626: goto            458
        //   629: astore_2       
        //   630: goto            622
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  400    404    583    587    Ljava/io/IOException;
        //  400    404    579    583    Any
        //  407    413    583    587    Ljava/io/IOException;
        //  407    413    579    583    Any
        //  413    421    575    579    Ljava/io/IOException;
        //  413    421    571    575    Any
        //  428    432    625    629    Ljava/io/IOException;
        //  437    450    575    579    Ljava/io/IOException;
        //  437    450    571    575    Any
        //  452    456    625    629    Ljava/io/IOException;
        //  589    594    579    583    Any
        //  596    605    579    583    Any
        //  607    610    579    583    Any
        //  618    622    629    633    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.util.ConcurrentModificationException
        //     at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
        //     at java.util.ArrayList$Itr.next(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2913)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2501)
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
    
    public final void d(final byte b) {
        ((Parcel)this.f).writeByte(b);
    }
    
    public final void e(final float n) {
        ((Parcel)this.f).writeFloat(n);
    }
    
    public final void f(final long n) {
        final long b = j.b(n);
        final boolean a = k.a(b, 0L);
        final byte b2 = 0;
        byte b3;
        if (a) {
            b3 = b2;
        }
        else if (k.a(b, 4294967296L)) {
            b3 = 1;
        }
        else {
            b3 = b2;
            if (k.a(b, 8589934592L)) {
                b3 = 2;
            }
        }
        this.d(b3);
        if (!k.a(j.b(n), 0L)) {
            this.e(j.c(n));
        }
    }
    
    public final String g(String s) {
        ah2.f.f((Object)s, "text");
        final ma0.c c = new ma0.c();
        final d d = (d)this.f;
        d.getClass();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final StringBuilder sb = new StringBuilder();
        final int length = s.length();
        int n = 0;
        String s2;
        while (true) {
            s2 = null;
            final Object o = null;
            if (n >= length) {
                break;
            }
            final char char1 = s.charAt(n);
            boolean b = true;
            if (char1 == '{') {
                ma0.d.a(sb, ref$ObjectRef);
                ma0.d.b(ref$BooleanRef, c, ref$ObjectRef);
                ref$BooleanRef.element = true;
            }
            else if (char1 == '}') {
                ma0.d.a(sb, ref$ObjectRef);
                Object resolve = o;
                if (ref$BooleanRef.element) {
                    final String s3 = (String)ref$ObjectRef.element;
                    if (s3 == null || !Character.isLetter(kj2.k.Y2(s3))) {
                        b = false;
                    }
                    resolve = o;
                    if (b) {
                        final Object element = ref$ObjectRef.element;
                        ah2.f.c(element);
                        resolve = o;
                        if (kotlin.text.b.o2((CharSequence)element, ' ', 0, false, 6) == -1) {
                            final ma0.e a = d.a;
                            final Object element2 = ref$ObjectRef.element;
                            ah2.f.c(element2);
                            resolve = a.resolve((String)element2);
                            if (resolve != null) {
                                final Object element3 = ref$ObjectRef.element;
                                ah2.f.c(element3);
                                final String s4 = (String)element3;
                                c.a(resolve);
                                ref$ObjectRef.element = null;
                            }
                            else {
                                ((ma0.f)c).a = new Error(a2.b.j(a.k("Variable "), (String)ref$ObjectRef.element, " not found"));
                            }
                        }
                    }
                }
                if (resolve == null) {
                    ma0.d.b(ref$BooleanRef, c, ref$ObjectRef);
                    c.b.append("}");
                }
                ref$BooleanRef.element = false;
            }
            else {
                sb.append(char1);
            }
            ++n;
        }
        ma0.d.a(sb, ref$ObjectRef);
        ma0.d.b(ref$BooleanRef, c, ref$ObjectRef);
        final Throwable a2 = ((ma0.f)c).a;
        Object o2;
        if (a2 == null) {
            s = c.b.toString();
            ah2.f.e((Object)s, "resultBuilder.toString()");
            o2 = new b$b(s);
        }
        else {
            final String string = c.b.toString();
            ah2.f.e((Object)string, "resultBuilder.toString()");
            o2 = new b$a(a2, string);
        }
        if (o2 instanceof b$b) {
            s = ((b$b)o2).a;
        }
        else {
            if (!(o2 instanceof b$a)) {
                throw new NoWhenBranchMatchedException();
            }
            s = s2;
        }
        return s;
    }
    
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface)fn2.a.a((Class)WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)this.f).getWebkitToCompatConverter());
    }
    
    public final Object h() {
        final Object f = this.f;
        return ((ArrayList<Object>)f).remove(((ArrayList<Object>)f).size() - 1);
    }
    
    public final void i(final Object o) {
        ((ArrayList)this.f).add(o);
    }
    
    public final boolean j() {
        return TextUtils.isEmpty((CharSequence)((h4)this.f).g) && Log.isLoggable(((h4)this.f).f().K(), 3);
    }
    
    public final Object then(final g g) {
        this.f.getClass();
        final Bundle bundle = g.k(IOException.class);
        if (bundle != null) {
            String s = ((BaseBundle)bundle).getString("registration_id");
            if (s == null) {
                s = ((BaseBundle)bundle).getString("unregistered");
                if (s == null) {
                    final String string = ((BaseBundle)bundle).getString("error");
                    if ("RST".equals(string)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string != null) {
                        throw new IOException(string);
                    }
                    final String value = String.valueOf(bundle);
                    Log.w("FirebaseInstanceId", a2.b.j(new StringBuilder(value.length() + 21), "Unexpected response: ", value), new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
            }
            return s;
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    
    public final void zza() {
        final pg.m m = (pg.m)this.f;
        int i = 0;
        String attributeValue2;
        String attributeValue = attributeValue2 = null;
        while (i < m.a.getAttributeCount()) {
            if ("module".equals(m.a.getAttributeName(i))) {
                attributeValue = m.a.getAttributeValue(i);
            }
            if ("errorCode".equals(m.a.getAttributeName(i))) {
                attributeValue2 = m.a.getAttributeValue(i);
            }
            ++i;
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), m.a, (Throwable)null);
        }
        final pg.b b = m.b;
        final int a = og.a.a(attributeValue2);
        final Map<String, Integer> b2 = b.b;
        if (b2 != null) {
            b2.put(attributeValue, a);
            while (m.a.next() != 3) {}
            return;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
