// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public class 1qk extends 1hx
{
    static {
        Covode.recordClassIndex(4650);
    }
    
    private void LIZ(final Map<String, String> p0, final String p1, final Hya p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   org/json/JSONObject.<init>:()V
        //     7: astore          4
        //     9: aload_1        
        //    10: ifnull          93
        //    13: new             Lorg/json/JSONObject;
        //    16: astore          5
        //    18: aload           5
        //    20: invokespecial   org/json/JSONObject.<init>:()V
        //    23: aload_1        
        //    24: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    29: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    34: astore          6
        //    36: aload           6
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            83
        //    46: aload           6
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: checkcast       Ljava/util/Map$Entry;
        //    56: astore_1       
        //    57: aload           5
        //    59: aload_1        
        //    60: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    65: checkcast       Ljava/lang/String;
        //    68: aload_1        
        //    69: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    74: checkcast       Ljava/lang/String;
        //    77: invokestatic    X/0UQ.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
        //    80: goto            36
        //    83: aload           4
        //    85: ldc             "header"
        //    87: aload           5
        //    89: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    92: pop            
        //    93: aload           4
        //    95: ldc             "response"
        //    97: aload_2        
        //    98: invokestatic    X/0UQ.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
        //   101: aload           4
        //   103: aload_3        
        //   104: invokestatic    X/0U7.LIZ:(Ljava/lang/Object;LX/Hya;)V
        //   107: return         
        //   108: astore_1       
        //   109: goto            101
        //   112: astore_1       
        //   113: goto            93
        //    Signature:
        //  (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;LX/Hya;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  13     36     108    112    Any
        //  36     80     108    112    Any
        //  83     93     112    116    Any
        //  93     101    108    112    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    @Override
    public final String LIZ() {
        return "pipo.fetch";
    }
    
    @Override
    public final void LIZ(final Pka lji, final Hya hya, final I0l i0l) {
        public final class 0Ts implements Runnable
        {
            public final /* synthetic */ String LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ Map LIZJ;
            public final /* synthetic */ Map LIZLLL;
            public final /* synthetic */ Hya LJ;
            public final /* synthetic */ Map LJFF;
            public final /* synthetic */ String LJI;
            public final /* synthetic */ 1qk LJII;
            
            static {
                Covode.recordClassIndex(4651);
            }
            
            public 0Ts(final 1qk ljii, final String liz, final String liziz, final Map lizj, final Map lizlll, final Hya lj, final Map ljff, final String lji) {
                this.LJII = ljii;
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
                this.LJFF = ljff;
                this.LJI = lji;
            }
            
            @Override
            public final void run() {
                if (TextUtils.equals((CharSequence)this.LIZ, (CharSequence)"GET")) {
                    this.LJII.LIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
                    return;
                }
                if (TextUtils.equals((CharSequence)this.LIZ, (CharSequence)"POST")) {
                    final Map ljff = this.LJFF;
                    if (ljff != null) {
                        this.LJII.LIZIZ(this.LIZIZ, this.LIZJ, ljff, this.LJ);
                        return;
                    }
                    this.LJII.LIZ(this.LIZIZ, this.LIZJ, this.LJI, this.LJ);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: invokespecial   X/1hx.LIZ:(LX/Pka;LX/Hya;LX/I0l;)V
        //     7: aload_1        
        //     8: ldc             "method"
        //    10: invokeinterface X/Pka.LJFF:(Ljava/lang/String;)Ljava/lang/String;
        //    15: astore          4
        //    17: aload_1        
        //    18: ldc             "url"
        //    20: invokeinterface X/Pka.LJFF:(Ljava/lang/String;)Ljava/lang/String;
        //    25: astore          5
        //    27: aload_1        
        //    28: ldc             "headers"
        //    30: invokeinterface X/Pka.LIZ:(Ljava/lang/String;)Z
        //    35: ifeq            127
        //    38: aload_1        
        //    39: ldc             "headers"
        //    41: invokeinterface X/Pka.LJII:(Ljava/lang/String;)LX/Pka;
        //    46: invokeinterface X/Pka.LIZIZ:()Ljava/util/Map;
        //    51: astore          6
        //    53: aload_1        
        //    54: ldc             "params"
        //    56: invokeinterface X/Pka.LIZ:(Ljava/lang/String;)Z
        //    61: ifeq            121
        //    64: aload_1        
        //    65: ldc             "params"
        //    67: invokeinterface X/Pka.LJII:(Ljava/lang/String;)LX/Pka;
        //    72: invokeinterface X/Pka.LIZIZ:()Ljava/util/Map;
        //    77: astore          7
        //    79: aload_1        
        //    80: ldc             "body"
        //    82: invokeinterface X/Pka.LJIIIIZZ:(Ljava/lang/String;)LX/Pjt;
        //    87: astore_1       
        //    88: aload_1        
        //    89: invokeinterface X/Pjt.LIZ:()LX/Pmz;
        //    94: getstatic       X/Pmz.Map:LX/Pmz;
        //    97: if_acmpne       140
        //   100: aload_1        
        //   101: invokeinterface X/Pjt.LJI:()LX/Pka;
        //   106: astore_1       
        //   107: aload_1        
        //   108: ifnull          133
        //   111: aload_1        
        //   112: invokeinterface X/Pka.LIZIZ:()Ljava/util/Map;
        //   117: astore_1       
        //   118: goto            135
        //   121: aconst_null    
        //   122: astore          7
        //   124: goto            79
        //   127: aconst_null    
        //   128: astore          6
        //   130: goto            53
        //   133: aconst_null    
        //   134: astore_1       
        //   135: aconst_null    
        //   136: astore_3       
        //   137: goto            161
        //   140: aload_1        
        //   141: invokeinterface X/Pjt.LIZ:()LX/Pmz;
        //   146: getstatic       X/Pmz.String:LX/Pmz;
        //   149: if_acmpne       173
        //   152: aload_1        
        //   153: invokeinterface X/Pjt.LJ:()Ljava/lang/String;
        //   158: astore_3       
        //   159: aconst_null    
        //   160: astore_1       
        //   161: aload           4
        //   163: ldc             "GET"
        //   165: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   168: istore          8
        //   170: goto            180
        //   173: aconst_null    
        //   174: astore_1       
        //   175: aload_1        
        //   176: astore_3       
        //   177: goto            161
        //   180: iload           8
        //   182: ifne            195
        //   185: aload           4
        //   187: ldc             "POST"
        //   189: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   192: ifeq            302
        //   195: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //   198: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //   201: if_acmpne       232
        //   204: new             LX/0Ts;
        //   207: astore          9
        //   209: aload           9
        //   211: aload_0        
        //   212: aload           4
        //   214: aload           5
        //   216: aload           6
        //   218: aload           7
        //   220: aload_2        
        //   221: aload_1        
        //   222: aload_3        
        //   223: invokespecial   X/0Ts.<init>:(LX/1qk;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;LX/Hya;Ljava/util/Map;Ljava/lang/String;)V
        //   226: aload           9
        //   228: invokestatic    X/6vJ.LIZ:(Ljava/lang/Runnable;)V
        //   231: return         
        //   232: aload           4
        //   234: ldc             "GET"
        //   236: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   239: ifeq            254
        //   242: aload_0        
        //   243: aload           5
        //   245: aload           6
        //   247: aload           7
        //   249: aload_2        
        //   250: invokevirtual   X/1qk.LIZ:(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;LX/Hya;)V
        //   253: return         
        //   254: aload           4
        //   256: ldc             "POST"
        //   258: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   261: ifeq            308
        //   264: aload_0        
        //   265: aload           5
        //   267: aload           6
        //   269: aload_1        
        //   270: aload_2        
        //   271: invokevirtual   X/1qk.LIZIZ:(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;LX/Hya;)V
        //   274: aload_1        
        //   275: ifnull          289
        //   278: aload_0        
        //   279: aload           5
        //   281: aload           6
        //   283: aload_1        
        //   284: aload_2        
        //   285: invokevirtual   X/1qk.LIZIZ:(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;LX/Hya;)V
        //   288: return         
        //   289: aload_0        
        //   290: aload           5
        //   292: aload           6
        //   294: aload_3        
        //   295: aload_2        
        //   296: invokevirtual   X/1qk.LIZ:(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;LX/Hya;)V
        //   299: goto            308
        //   302: ldc             "invalid request_method!"
        //   304: aload_2        
        //   305: invokestatic    X/0U7.LIZ:(Ljava/lang/String;LX/Hya;)V
        //   308: return         
        //   309: astore_1       
        //   310: aload_1        
        //   311: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   314: aload_2        
        //   315: invokestatic    X/0U7.LIZ:(Ljava/lang/String;LX/Hya;)V
        //   318: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  7      53     309    319    Any
        //  53     79     309    319    Any
        //  79     107    309    319    Any
        //  111    118    309    319    Any
        //  140    159    309    319    Any
        //  161    170    309    319    Any
        //  185    195    309    319    Any
        //  195    231    309    319    Any
        //  232    253    309    319    Any
        //  254    274    309    319    Any
        //  278    288    309    319    Any
        //  289    299    309    319    Any
        //  302    308    309    319    Any
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:479)
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
    
    public final void LIZ(String liz, final Map<String, Object> map, final String s, final Hya hya) {
        try {
            final 5zY 5zY = new 5zY();
            final HashMap hashMap = new HashMap();
            if (map != null) {
                for (final String s2 : map.keySet()) {
                    hashMap.put(s2, map.get(s2).toString());
                }
            }
            byte[] bytes;
            if (s == null) {
                bytes = null;
            }
            else {
                bytes = s.getBytes();
            }
            liz = 1EK.LIZ.LIZLLL().LJIIJJI.LIZ(liz, bytes, (Map)hashMap);
            this.LIZ(5zY.LIZ, liz, hya);
        }
        finally {
            final Throwable t;
            t.getMessage();
            final StringBuilder sb = new StringBuilder("post failed:");
            sb.append(t.getMessage());
            0U7.LIZ(sb.toString(), hya);
        }
    }
    
    public final void LIZ(String liz, final Map<String, Object> map, final Map<String, Object> map2, final Hya hya) {
        try {
            final 5zY 5zY = new 5zY();
            final ArrayList list = new ArrayList();
            if (map2 != null) {
                for (final String s : map2.keySet()) {
                    final Object value = map2.get(s);
                    if (value != null) {
                        list.add(new Pair((Object)s, (Object)value.toString()));
                    }
                }
            }
            String liz2 = liz;
            if (list.size() > 0) {
                liz2 = 0UR.LIZ(liz, list);
            }
            final HashMap hashMap = new HashMap();
            if (map != null) {
                for (final String s2 : map.keySet()) {
                    hashMap.put(s2, map.get(s2).toString());
                }
            }
            liz = 1EK.LIZ.LIZLLL().LJIIJJI.LIZ(liz2, (Map)hashMap);
            this.LIZ(5zY.LIZ, liz, hya);
        }
        finally {
            final Throwable t;
            t.getMessage();
            final StringBuilder sb = new StringBuilder("get failed:");
            sb.append(t.getMessage());
            0U7.LIZ(sb.toString(), hya);
        }
    }
    
    public final void LIZIZ(String liz, final Map<String, Object> map, final Map<String, Object> map2, final Hya hya) {
        try {
            final 5zY 5zY = new 5zY();
            final ArrayList list = new ArrayList();
            if (map2 != null) {
                for (final String s : map2.keySet()) {
                    list.add(new Pair((Object)s, (Object)map2.get(s).toString()));
                }
            }
            final HashMap hashMap = new HashMap();
            if (map != null) {
                for (final String s2 : map.keySet()) {
                    hashMap.put(s2, map.get(s2).toString());
                }
            }
            liz = 1EK.LIZ.LIZLLL().LJIIJJI.LIZ(liz, (List)list, (Map)hashMap);
            this.LIZ(5zY.LIZ, liz, hya);
        }
        finally {
            final Throwable t;
            t.getMessage();
            final StringBuilder sb = new StringBuilder("post failed:");
            sb.append(t.getMessage());
            0U7.LIZ(sb.toString(), hya);
        }
    }
}
