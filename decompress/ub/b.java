// 
// Decompiled by Procyon v0.6.0
// 

package ub;

import ak0.m;
import ak0.n;
import com.google.android.exoplayer2.r$a;
import java.util.List;
import java.util.Map;
import bd.c0;
import bd.d0;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import qb.a$b;

public final class b implements a$b
{
    public static final Parcelable$Creator<b> CREATOR;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final int k;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new b(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final int f, final String g, final String h, final String i, final boolean j, final int k) {
        d0.c(k == -1 || k > 0);
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public b(final Parcel parcel) {
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        final int a = c0.a;
        this.j = (parcel.readInt() != 0);
        this.k = parcel.readInt();
    }
    
    public static b a(final Map<String, List<String>> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "icy-br"
        //     3: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //     8: checkcast       Ljava/util/List;
        //    11: astore_1       
        //    12: iconst_m1      
        //    13: istore_2       
        //    14: iconst_1       
        //    15: istore_3       
        //    16: aload_1        
        //    17: ifnull          161
        //    20: aload_1        
        //    21: iconst_0       
        //    22: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    27: checkcast       Ljava/lang/String;
        //    30: astore          4
        //    32: aload           4
        //    34: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    37: istore          5
        //    39: iload           5
        //    41: sipush          1000
        //    44: imul           
        //    45: istore          6
        //    47: iload           6
        //    49: ifle            58
        //    52: iconst_1       
        //    53: istore          5
        //    55: goto            104
        //    58: aload           4
        //    60: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    63: astore_1       
        //    64: aload_1        
        //    65: invokevirtual   java/lang/String.length:()I
        //    68: ifeq            81
        //    71: ldc             "Invalid bitrate: "
        //    73: aload_1        
        //    74: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    77: astore_1       
        //    78: goto            91
        //    81: new             Ljava/lang/String;
        //    84: dup            
        //    85: ldc             "Invalid bitrate: "
        //    87: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //    90: astore_1       
        //    91: ldc             "IcyHeaders"
        //    93: aload_1        
        //    94: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    97: pop            
        //    98: iconst_m1      
        //    99: istore          6
        //   101: goto            155
        //   104: iload           6
        //   106: istore          7
        //   108: goto            167
        //   111: astore_1       
        //   112: iconst_m1      
        //   113: istore          6
        //   115: aload           4
        //   117: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   120: astore_1       
        //   121: aload_1        
        //   122: invokevirtual   java/lang/String.length:()I
        //   125: ifeq            138
        //   128: ldc             "Invalid bitrate header: "
        //   130: aload_1        
        //   131: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   134: astore_1       
        //   135: goto            148
        //   138: new             Ljava/lang/String;
        //   141: dup            
        //   142: ldc             "Invalid bitrate header: "
        //   144: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   147: astore_1       
        //   148: ldc             "IcyHeaders"
        //   150: aload_1        
        //   151: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   154: pop            
        //   155: iconst_0       
        //   156: istore          5
        //   158: goto            104
        //   161: iconst_m1      
        //   162: istore          7
        //   164: iconst_0       
        //   165: istore          5
        //   167: aload_0        
        //   168: ldc             "icy-genre"
        //   170: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   175: checkcast       Ljava/util/List;
        //   178: astore_1       
        //   179: aconst_null    
        //   180: astore          8
        //   182: aload_1        
        //   183: ifnull          203
        //   186: aload_1        
        //   187: iconst_0       
        //   188: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   193: checkcast       Ljava/lang/String;
        //   196: astore_1       
        //   197: iconst_1       
        //   198: istore          5
        //   200: goto            205
        //   203: aconst_null    
        //   204: astore_1       
        //   205: aload_0        
        //   206: ldc             "icy-name"
        //   208: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   213: checkcast       Ljava/util/List;
        //   216: astore          4
        //   218: aload           4
        //   220: ifnull          242
        //   223: aload           4
        //   225: iconst_0       
        //   226: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   231: checkcast       Ljava/lang/String;
        //   234: astore          4
        //   236: iconst_1       
        //   237: istore          5
        //   239: goto            245
        //   242: aconst_null    
        //   243: astore          4
        //   245: aload_0        
        //   246: ldc             "icy-url"
        //   248: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   253: checkcast       Ljava/util/List;
        //   256: astore          9
        //   258: aload           9
        //   260: ifnull          282
        //   263: aload           9
        //   265: iconst_0       
        //   266: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   271: checkcast       Ljava/lang/String;
        //   274: astore          9
        //   276: iconst_1       
        //   277: istore          5
        //   279: goto            285
        //   282: aconst_null    
        //   283: astore          9
        //   285: aload_0        
        //   286: ldc             "icy-pub"
        //   288: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   293: checkcast       Ljava/util/List;
        //   296: astore          10
        //   298: aload           10
        //   300: ifnull          327
        //   303: aload           10
        //   305: iconst_0       
        //   306: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   311: checkcast       Ljava/lang/String;
        //   314: ldc             "1"
        //   316: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   319: istore          11
        //   321: iconst_1       
        //   322: istore          5
        //   324: goto            330
        //   327: iconst_0       
        //   328: istore          11
        //   330: aload_0        
        //   331: ldc             "icy-metaint"
        //   333: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   338: checkcast       Ljava/util/List;
        //   341: astore_0       
        //   342: iload           5
        //   344: istore          12
        //   346: iload_2        
        //   347: istore          6
        //   349: aload_0        
        //   350: ifnull          487
        //   353: aload_0        
        //   354: iconst_0       
        //   355: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   360: checkcast       Ljava/lang/String;
        //   363: astore          10
        //   365: aload           10
        //   367: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   370: istore          6
        //   372: iload           6
        //   374: ifle            386
        //   377: iload           6
        //   379: istore_2       
        //   380: iload_3        
        //   381: istore          5
        //   383: goto            426
        //   386: aload           10
        //   388: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   391: astore_0       
        //   392: aload_0        
        //   393: invokevirtual   java/lang/String.length:()I
        //   396: ifeq            409
        //   399: ldc             "Invalid metadata interval: "
        //   401: aload_0        
        //   402: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   405: astore_0       
        //   406: goto            419
        //   409: new             Ljava/lang/String;
        //   412: dup            
        //   413: ldc             "Invalid metadata interval: "
        //   415: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   418: astore_0       
        //   419: ldc             "IcyHeaders"
        //   421: aload_0        
        //   422: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   425: pop            
        //   426: iload           5
        //   428: istore          12
        //   430: iload_2        
        //   431: istore          6
        //   433: goto            487
        //   436: astore_0       
        //   437: iload           6
        //   439: istore_2       
        //   440: aload           10
        //   442: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   445: astore_0       
        //   446: aload_0        
        //   447: invokevirtual   java/lang/String.length:()I
        //   450: ifeq            463
        //   453: ldc             "Invalid metadata interval: "
        //   455: aload_0        
        //   456: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   459: astore_0       
        //   460: goto            473
        //   463: new             Ljava/lang/String;
        //   466: dup            
        //   467: ldc             "Invalid metadata interval: "
        //   469: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   472: astore_0       
        //   473: ldc             "IcyHeaders"
        //   475: aload_0        
        //   476: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   479: pop            
        //   480: iload_2        
        //   481: istore          6
        //   483: iload           5
        //   485: istore          12
        //   487: aload           8
        //   489: astore_0       
        //   490: iload           12
        //   492: ifeq            514
        //   495: new             Lub/b;
        //   498: dup            
        //   499: iload           7
        //   501: aload_1        
        //   502: aload           4
        //   504: aload           9
        //   506: iload           11
        //   508: iload           6
        //   510: invokespecial   ub/b.<init>:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
        //   513: astore_0       
        //   514: aload_0        
        //   515: areturn        
        //   516: astore_1       
        //   517: goto            115
        //   520: astore_0       
        //   521: goto            440
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;)Lub/b;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  32     39     111    115    Ljava/lang/NumberFormatException;
        //  58     78     516    520    Ljava/lang/NumberFormatException;
        //  81     91     516    520    Ljava/lang/NumberFormatException;
        //  91     98     516    520    Ljava/lang/NumberFormatException;
        //  365    372    520    524    Ljava/lang/NumberFormatException;
        //  386    406    436    440    Ljava/lang/NumberFormatException;
        //  409    419    436    440    Ljava/lang/NumberFormatException;
        //  419    426    436    440    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public final void Q(final r$a r$a) {
        final String h = this.h;
        if (h != null) {
            r$a.E = h;
        }
        final String g = this.g;
        if (g != null) {
            r$a.C = g;
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && b.class == o.getClass()) {
            final b b2 = (b)o;
            if (this.f != b2.f || !c0.a(this.g, b2.g) || !c0.a(this.h, b2.h) || !c0.a(this.i, b2.i) || this.j != b2.j || this.k != b2.k) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f;
        final String g = this.g;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String h = this.h;
        int hashCode3;
        if (h != null) {
            hashCode3 = h.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (((((527 + f) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31 + (this.j ? 1 : 0)) * 31 + this.k;
    }
    
    @Override
    public final String toString() {
        final String h = this.h;
        final String g = this.g;
        final int f = this.f;
        final int k = this.k;
        final StringBuilder q = m.q(n.f(g, n.f(h, 80)), "IcyHeaders: name=\"", h, "\", genre=\"", g);
        q.append("\", bitrate=");
        q.append(f);
        q.append(", metadataInterval=");
        q.append(k);
        return q.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        final int j = this.j ? 1 : 0;
        a = c0.a;
        parcel.writeInt(j);
        parcel.writeInt(this.k);
    }
}
