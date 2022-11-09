// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import java.util.HashMap;
import java.nio.ByteBuffer;
import android.net.Uri;
import java.util.Map;
import android.os.CancellationSignal;
import android.content.pm.Signature;
import java.util.concurrent.Callable;
import android.os.Handler;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import android.content.res.Resources;
import android.text.TextUtils;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.ArrayList;
import android.graphics.Typeface;

public final class 075
{
    public static final 04w<String, Typeface> LIZ;
    public static final Object LIZIZ;
    public static final 050<String, ArrayList<07B.a<c>>> LIZJ;
    public static final 07B LIZLLL;
    public static final Comparator<byte[]> LJ;
    
    static {
        Covode.recordClassIndex(763);
        LIZ = new 04w<String, Typeface>(16);
        LIZLLL = new 07B("fonts");
        LIZIZ = new Object();
        LIZJ = new 050<String, ArrayList<07B.a<c>>>();
        LJ = new 071();
    }
    
    public static a LIZ(final Context context, final 06z 06z) {
        final ProviderInfo liz = LIZ(context.getPackageManager(), 06z, context.getResources());
        if (liz == null) {
            return new a(1, null);
        }
        return new a(0, LIZ(context, 06z, liz.authority));
    }
    
    public static c LIZ(final Context context, final 06z 06z, final int n) {
        try {
            final a liz = LIZ(context, 06z);
            final int liz2 = liz.LIZ;
            int n2 = -3;
            if (liz2 == 0) {
                final Typeface liz3 = 08a.LIZ(context, liz.LIZIZ, n);
                if (liz3 != null) {
                    n2 = 0;
                }
                return new c(liz3, n2);
            }
            if (liz.LIZ == 1) {
                n2 = -2;
            }
            return new c(null, n2);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return new c(null, -1);
        }
    }
    
    public static PackageInfo LIZ(final PackageManager packageManager, final String s) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ) {
            TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName());
        }
        if (6Tl.LJIIIZ) {
            TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName());
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName())) {
            if (6Tl.LJ == null) {
                6Tl.LJ = packageManager.getPackageInfo(s, 64);
            }
            return 6Tl.LJ;
        }
        if (6Tl.LJIIIZ) {
            TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName());
        }
        return packageManager.getPackageInfo(s, 64);
    }
    
    public static ProviderInfo LIZ(final PackageManager packageManager, final 06z 06z, final Resources resources) {
        final String liz = 06z.LIZ;
        int i = 0;
        final ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(liz, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager$NameNotFoundException("No package found for authority: ".concat(String.valueOf(liz)));
        }
        if (resolveContentProvider.packageName.equals(06z.LIZIZ)) {
            final List<byte[]> liz2 = LIZ(LIZ(packageManager, resolveContentProvider.packageName).signatures);
            Collections.sort((List<Object>)liz2, (Comparator<? super Object>)075.LJ);
            for (List<List<byte[]>> liz3 = LIZ(06z, resources); i < liz3.size(); ++i) {
                final ArrayList list = new ArrayList<byte[]>((Collection<? extends T>)liz3.get(i));
                Collections.sort((List<E>)list, (Comparator<? super E>)075.LJ);
                if (LIZ(liz2, (List<byte[]>)list)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
        final StringBuilder sb = new StringBuilder("Found content provider ");
        sb.append(liz);
        sb.append(", but package was not ");
        sb.append(06z.LIZIZ);
        throw new PackageManager$NameNotFoundException(sb.toString());
    }
    
    public static Typeface LIZ(final Context context, final 06z 06z, final 06s.a liziz, final Handler handler, final boolean b, final int n, final int n2) {
        public final class 14K implements 07B.a<c>
        {
            public final /* synthetic */ String LIZ;
            
            static {
                Covode.recordClassIndex(766);
            }
            
            public 14K(final String liz) {
                this.LIZ = liz;
            }
        }
        public final class 14J implements 07B.a<c>
        {
            public final /* synthetic */ 06s.a LIZ;
            public final /* synthetic */ Handler LIZIZ;
            
            static {
                Covode.recordClassIndex(765);
            }
            
            public 14J(final 06s.a liz, final Handler liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 070 implements Callable<c>
        {
            public final /* synthetic */ Context LIZ;
            public final /* synthetic */ 06z LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ String LIZLLL;
            
            static {
                Covode.recordClassIndex(764);
            }
            
            public 070(final Context liz, final 06z liziz, final int lizj, final String lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/lang/StringBuilder.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: aload_1        
        //    10: getfield        X/06z.LJFF:Ljava/lang/String;
        //    13: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    16: pop            
        //    17: aload_3        
        //    18: ldc             "-"
        //    20: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    23: pop            
        //    24: aload_3        
        //    25: iload           6
        //    27: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    30: pop            
        //    31: aload_3        
        //    32: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    35: astore_3       
        //    36: getstatic       X/075.LIZ:LX/04w;
        //    39: aload_3        
        //    40: invokevirtual   X/04w.LIZ:(Ljava/lang/Object;)Ljava/lang/Object;
        //    43: checkcast       Landroid/graphics/Typeface;
        //    46: astore          7
        //    48: aload           7
        //    50: ifnull          66
        //    53: aload_2        
        //    54: ifnull          63
        //    57: aload_2        
        //    58: aload           7
        //    60: invokevirtual   X/06r.LIZ:(Landroid/graphics/Typeface;)V
        //    63: aload           7
        //    65: areturn        
        //    66: iload           4
        //    68: ifeq            122
        //    71: iload           5
        //    73: iconst_m1      
        //    74: if_icmpne       122
        //    77: aload_0        
        //    78: aload_1        
        //    79: iload           6
        //    81: invokestatic    X/075.LIZ:(Landroid/content/Context;LX/06z;I)LX/074;
        //    84: astore_0       
        //    85: aload_2        
        //    86: ifnull          105
        //    89: aload_0        
        //    90: getfield        X/074.LIZIZ:I
        //    93: ifne            110
        //    96: aload_2        
        //    97: aload_0        
        //    98: getfield        X/074.LIZ:Landroid/graphics/Typeface;
        //   101: aconst_null    
        //   102: invokevirtual   X/06r.LIZ:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
        //   105: aload_0        
        //   106: getfield        X/074.LIZ:Landroid/graphics/Typeface;
        //   109: areturn        
        //   110: aload_2        
        //   111: aload_0        
        //   112: getfield        X/074.LIZIZ:I
        //   115: aconst_null    
        //   116: invokevirtual   X/06r.LIZ:(ILandroid/os/Handler;)V
        //   119: goto            105
        //   122: new             LX/070;
        //   125: dup            
        //   126: aload_0        
        //   127: aload_1        
        //   128: iload           6
        //   130: aload_3        
        //   131: invokespecial   X/070.<init>:(Landroid/content/Context;LX/06z;ILjava/lang/String;)V
        //   134: astore_1       
        //   135: iload           4
        //   137: ifeq            159
        //   140: getstatic       X/075.LIZLLL:LX/07B;
        //   143: aload_1        
        //   144: iload           5
        //   146: invokevirtual   X/07B.LIZ:(Ljava/util/concurrent/Callable;I)Ljava/lang/Object;
        //   149: checkcast       LX/074;
        //   152: getfield        X/074.LIZ:Landroid/graphics/Typeface;
        //   155: areturn        
        //   156: astore_0       
        //   157: aconst_null    
        //   158: areturn        
        //   159: aload_2        
        //   160: ifnonnull       174
        //   163: aconst_null    
        //   164: astore_0       
        //   165: getstatic       X/075.LIZIZ:Ljava/lang/Object;
        //   168: astore_2       
        //   169: aload_2        
        //   170: monitorenter   
        //   171: goto            187
        //   174: new             LX/14J;
        //   177: dup            
        //   178: aload_2        
        //   179: aconst_null    
        //   180: invokespecial   X/14J.<init>:(LX/06r;Landroid/os/Handler;)V
        //   183: astore_0       
        //   184: goto            165
        //   187: getstatic       X/075.LIZJ:LX/050;
        //   190: astore          7
        //   192: aload           7
        //   194: aload_3        
        //   195: invokevirtual   X/050.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   198: checkcast       Ljava/util/ArrayList;
        //   201: astore          8
        //   203: aload           8
        //   205: ifnull          223
        //   208: aload_0        
        //   209: ifnull          219
        //   212: aload           8
        //   214: aload_0        
        //   215: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   218: pop            
        //   219: aload_2        
        //   220: monitorexit    
        //   221: aconst_null    
        //   222: areturn        
        //   223: aload_0        
        //   224: ifnull          253
        //   227: new             Ljava/util/ArrayList;
        //   230: astore          8
        //   232: aload           8
        //   234: invokespecial   java/util/ArrayList.<init>:()V
        //   237: aload           8
        //   239: aload_0        
        //   240: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   243: pop            
        //   244: aload           7
        //   246: aload_3        
        //   247: aload           8
        //   249: invokevirtual   X/050.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   252: pop            
        //   253: aload_2        
        //   254: monitorexit    
        //   255: getstatic       X/075.LIZLLL:LX/07B;
        //   258: astore_0       
        //   259: new             LX/14K;
        //   262: dup            
        //   263: aload_3        
        //   264: invokespecial   X/14K.<init>:(Ljava/lang/String;)V
        //   267: astore_2       
        //   268: aload_0        
        //   269: new             LX/078;
        //   272: dup            
        //   273: aload_1        
        //   274: new             Landroid/os/Handler;
        //   277: dup            
        //   278: invokespecial   android/os/Handler.<init>:()V
        //   281: aload_2        
        //   282: invokespecial   X/078.<init>:(Ljava/util/concurrent/Callable;Landroid/os/Handler;LX/07A;)V
        //   285: invokevirtual   X/07B.LIZ:(Ljava/lang/Runnable;)V
        //   288: aconst_null    
        //   289: areturn        
        //   290: astore_0       
        //   291: aload_2        
        //   292: monitorexit    
        //   293: aload_0        
        //   294: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  140    156    156    159    Ljava/lang/InterruptedException;
        //  187    203    290    295    Any
        //  212    219    290    295    Any
        //  219    221    290    295    Any
        //  227    253    290    295    Any
        //  253    255    290    295    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public static List<List<byte[]>> LIZ(final 06z 06z, final Resources resources) {
        if (06z.LIZLLL != null) {
            return 06z.LIZLLL;
        }
        return 06l.LIZ(resources, 06z.LJ);
    }
    
    public static List<byte[]> LIZ(final Signature[] array) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < array.length; ++i) {
            list.add(array[i].toByteArray());
        }
        return list;
    }
    
    public static Map<Uri, ByteBuffer> LIZ(final Context context, final b[] array, final CancellationSignal cancellationSignal) {
        final HashMap hashMap = new HashMap();
        for (final b b : array) {
            if (b.LJ == 0) {
                final Uri liz = b.LIZ;
                if (!hashMap.containsKey(liz)) {
                    hashMap.put(liz, 08d.LIZ(context, cancellationSignal, liz));
                }
            }
        }
        return (Map<Uri, ByteBuffer>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public static boolean LIZ(final List<byte[]> list, final List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); ++i) {
            if (!Arrays.equals((byte[])list.get(i), (byte[])list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static b[] LIZ(final Context p0, final 06z p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_3       
        //     8: new             Landroid/net/Uri$Builder;
        //    11: dup            
        //    12: invokespecial   android/net/Uri$Builder.<init>:()V
        //    15: ldc_w           "content"
        //    18: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    21: aload_2        
        //    22: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    25: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    28: astore          4
        //    30: new             Landroid/net/Uri$Builder;
        //    33: dup            
        //    34: invokespecial   android/net/Uri$Builder.<init>:()V
        //    37: ldc_w           "content"
        //    40: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    43: aload_2        
        //    44: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    47: ldc_w           "file"
        //    50: invokevirtual   android/net/Uri$Builder.appendPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //    53: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //    56: astore          5
        //    58: aload_0        
        //    59: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    62: astore_0       
        //    63: bipush          7
        //    65: anewarray       Ljava/lang/String;
        //    68: astore          6
        //    70: aload           6
        //    72: iconst_0       
        //    73: ldc_w           "_id"
        //    76: aastore        
        //    77: aload           6
        //    79: iconst_1       
        //    80: ldc_w           "file_id"
        //    83: aastore        
        //    84: aload           6
        //    86: iconst_2       
        //    87: ldc_w           "font_ttc_index"
        //    90: aastore        
        //    91: aload           6
        //    93: iconst_3       
        //    94: ldc_w           "font_variation_settings"
        //    97: aastore        
        //    98: aload           6
        //   100: iconst_4       
        //   101: ldc_w           "font_weight"
        //   104: aastore        
        //   105: aload           6
        //   107: iconst_5       
        //   108: ldc_w           "font_italic"
        //   111: aastore        
        //   112: aload           6
        //   114: bipush          6
        //   116: ldc_w           "result_code"
        //   119: aastore        
        //   120: iconst_1       
        //   121: anewarray       Ljava/lang/String;
        //   124: astore_2       
        //   125: aload_2        
        //   126: iconst_0       
        //   127: aload_1        
        //   128: getfield        X/06z.LIZJ:Ljava/lang/String;
        //   131: aastore        
        //   132: new             LX/5aq;
        //   135: astore_1       
        //   136: aload_1        
        //   137: invokespecial   X/5aq.<init>:()V
        //   140: new             LX/5dv;
        //   143: astore          7
        //   145: aload           7
        //   147: iconst_0       
        //   148: invokespecial   X/5dv.<init>:(Z)V
        //   151: aload_1        
        //   152: ldc_w           240004
        //   155: ldc_w           "android/content/ContentResolver"
        //   158: ldc_w           "query"
        //   161: aload_0        
        //   162: bipush          6
        //   164: anewarray       Ljava/lang/Object;
        //   167: dup            
        //   168: iconst_0       
        //   169: aload           4
        //   171: aastore        
        //   172: dup            
        //   173: iconst_1       
        //   174: aload           6
        //   176: aastore        
        //   177: dup            
        //   178: iconst_2       
        //   179: ldc_w           "query = ?"
        //   182: aastore        
        //   183: dup            
        //   184: iconst_3       
        //   185: aload_2        
        //   186: aastore        
        //   187: dup            
        //   188: iconst_4       
        //   189: aconst_null    
        //   190: aastore        
        //   191: dup            
        //   192: iconst_5       
        //   193: aconst_null    
        //   194: aastore        
        //   195: ldc_w           "android.database.Cursor"
        //   198: aload           7
        //   200: invokevirtual   X/5aq.LIZ:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/String;LX/5dv;)LX/5an;
        //   203: astore_1       
        //   204: aload_1        
        //   205: getfield        X/5an.LIZ:Z
        //   208: ifeq            222
        //   211: aload_1        
        //   212: getfield        X/5an.LIZIZ:Ljava/lang/Object;
        //   215: checkcast       Landroid/database/Cursor;
        //   218: astore_1       
        //   219: goto            237
        //   222: aload_0        
        //   223: aload           4
        //   225: aload           6
        //   227: ldc_w           "query = ?"
        //   230: aload_2        
        //   231: aconst_null    
        //   232: aconst_null    
        //   233: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
        //   236: astore_1       
        //   237: aload_3        
        //   238: astore_0       
        //   239: aload_1        
        //   240: ifnull          503
        //   243: aload_3        
        //   244: astore_0       
        //   245: aload_1        
        //   246: invokeinterface android/database/Cursor.getCount:()I
        //   251: ifle            497
        //   254: aload_1        
        //   255: ldc_w           "result_code"
        //   258: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   263: istore          8
        //   265: new             Ljava/util/ArrayList;
        //   268: astore_2       
        //   269: aload_2        
        //   270: invokespecial   java/util/ArrayList.<init>:()V
        //   273: aload_1        
        //   274: ldc_w           "_id"
        //   277: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   282: istore          9
        //   284: aload_1        
        //   285: ldc_w           "file_id"
        //   288: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   293: istore          10
        //   295: aload_1        
        //   296: ldc_w           "font_ttc_index"
        //   299: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   304: istore          11
        //   306: aload_1        
        //   307: ldc_w           "font_weight"
        //   310: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   315: istore          12
        //   317: aload_1        
        //   318: ldc_w           "font_italic"
        //   321: invokeinterface android/database/Cursor.getColumnIndex:(Ljava/lang/String;)I
        //   326: istore          13
        //   328: aload_2        
        //   329: astore_0       
        //   330: aload_1        
        //   331: invokeinterface android/database/Cursor.moveToNext:()Z
        //   336: ifeq            497
        //   339: iload           8
        //   341: iconst_m1      
        //   342: if_icmpeq       358
        //   345: aload_1        
        //   346: iload           8
        //   348: invokeinterface android/database/Cursor.getInt:(I)I
        //   353: istore          14
        //   355: goto            361
        //   358: iconst_0       
        //   359: istore          14
        //   361: iload           11
        //   363: iconst_m1      
        //   364: if_icmpeq       380
        //   367: aload_1        
        //   368: iload           11
        //   370: invokeinterface android/database/Cursor.getInt:(I)I
        //   375: istore          15
        //   377: goto            383
        //   380: iconst_0       
        //   381: istore          15
        //   383: iload           10
        //   385: iconst_m1      
        //   386: if_icmpne       406
        //   389: aload           4
        //   391: aload_1        
        //   392: iload           9
        //   394: invokeinterface android/database/Cursor.getLong:(I)J
        //   399: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   402: astore_0       
        //   403: goto            420
        //   406: aload           5
        //   408: aload_1        
        //   409: iload           10
        //   411: invokeinterface android/database/Cursor.getLong:(I)J
        //   416: invokestatic    android/content/ContentUris.withAppendedId:(Landroid/net/Uri;J)Landroid/net/Uri;
        //   419: astore_0       
        //   420: iload           12
        //   422: iconst_m1      
        //   423: if_icmpeq       439
        //   426: aload_1        
        //   427: iload           12
        //   429: invokeinterface android/database/Cursor.getInt:(I)I
        //   434: istore          16
        //   436: goto            444
        //   439: sipush          400
        //   442: istore          16
        //   444: iload           13
        //   446: iconst_m1      
        //   447: if_icmpeq       468
        //   450: aload_1        
        //   451: iload           13
        //   453: invokeinterface android/database/Cursor.getInt:(I)I
        //   458: iconst_1       
        //   459: if_icmpne       468
        //   462: iconst_1       
        //   463: istore          17
        //   465: goto            471
        //   468: iconst_0       
        //   469: istore          17
        //   471: new             LX/073;
        //   474: astore_3       
        //   475: aload_3        
        //   476: aload_0        
        //   477: iload           15
        //   479: iload           16
        //   481: iload           17
        //   483: iload           14
        //   485: invokespecial   X/073.<init>:(Landroid/net/Uri;IIZI)V
        //   488: aload_2        
        //   489: aload_3        
        //   490: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   493: pop            
        //   494: goto            328
        //   497: aload_1        
        //   498: invokeinterface android/database/Cursor.close:()V
        //   503: aload_0        
        //   504: iconst_0       
        //   505: anewarray       LX/073;
        //   508: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   511: checkcast       [LX/073;
        //   514: areturn        
        //   515: astore_0       
        //   516: goto            526
        //   519: astore_0       
        //   520: aload_1        
        //   521: invokeinterface android/database/Cursor.close:()V
        //   526: aload_0        
        //   527: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  58     70     515    519    Any
        //  120    219    515    519    Any
        //  222    237    515    519    Any
        //  245    328    519    528    Any
        //  330    339    519    528    Any
        //  345    355    519    528    Any
        //  367    377    519    528    Any
        //  389    403    519    528    Any
        //  406    420    519    528    Any
        //  426    436    519    528    Any
        //  450    462    519    528    Any
        //  471    494    519    528    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0328:
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
    
    public static final class a
    {
        public final int LIZ;
        public final b[] LIZIZ;
        
        static {
            Covode.recordClassIndex(768);
        }
        
        public a(final int liz, final b[] liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
    
    public static final class b
    {
        public final Uri LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final boolean LIZLLL;
        public final int LJ;
        
        static {
            Covode.recordClassIndex(769);
        }
        
        public b(final Uri liz, final int liziz, final int lizj, final boolean lizlll, final int lj) {
            07U.LIZ(liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
    }
    
    public static final class c
    {
        public final Typeface LIZ;
        public final int LIZIZ;
        
        static {
            Covode.recordClassIndex(770);
        }
        
        public c(final Typeface liz, final int liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
}
