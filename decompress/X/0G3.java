// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.Arrays;
import kotlin.n.y;
import java.util.Map;
import java.util.Iterator;
import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;

public final class 0g3
{
    public static final 0g3 LIZ;
    
    static {
        Covode.recordClassIndex(6165);
        LIZ = new 0g3();
    }
    
    public static final float LIZ(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            return 0.0f;
        }
        return n3 * 1.0f / (n - n2);
    }
    
    public static final float LIZ(final Gaz gaz, final int n) {
        if (n == 0) {
            return 0.0f;
        }
        int n2 = 100;
        int n3;
        float n4;
        float n5;
        if (gaz != null) {
            final int ljiiiizz = gaz.LJIIIIZZ;
            final int ljiiiz = gaz.LJIIIZ;
            final float ljiij = gaz.LJIIJ;
            final float ljiijji = gaz.LJIIJJI;
            n3 = ljiiiz;
            n4 = ljiijji;
            n5 = ljiij;
            n2 = ljiiiizz;
            if (ljiiiz < 0) {
                if (n > 0) {
                    return n / (float)ljiiiizz * ljiij;
                }
                return n / (float)ljiiiz * ljiijji;
            }
        }
        else {
            n4 = 0.0f;
            n3 = 0;
            n5 = 1.0f;
        }
        return n * 1.0f / (n2 - n3) * (n5 - n4);
    }
    
    public static final float LIZ(final LiveEffect liveEffect, final int n) {
        CTM.LIZ((Object)liveEffect);
        return LIZ(liveEffect.getSmallItemConfig(), n);
    }
    
    public static final int LIZ(final int n, final int n2, final float n3) {
        if (n3 == 0.0f) {
            return 0;
        }
        return (int)(n3 * (n - n2));
    }
    
    public static final int LIZ(final Gaz gaz, float n) {
        if (n == 0.0f) {
            return 0;
        }
        int ljiiiizz = 100;
        Label_0129: {
            int ljiiiz;
            float n5;
            float n6;
            if (gaz != null) {
                ljiiiizz = gaz.LJIIIIZZ;
                ljiiiz = gaz.LJIIIZ;
                final float ljiij = gaz.LJIIJ;
                final float ljiijji = gaz.LJIIJJI;
                if (ljiiiz < 0) {
                    if (n <= 0.0f) {
                        float n2 = n;
                        if (n < ljiijji) {
                            n2 = ljiijji;
                        }
                        n = n2 / ljiijji;
                        final float n3 = (float)ljiiiz;
                        return (int)(n * n3);
                    }
                    if (ljiij == 0.0f) {
                        return 0;
                    }
                    float n4 = n;
                    if (n > ljiij) {
                        n4 = ljiij;
                    }
                    n = n4 / ljiij;
                    break Label_0129;
                }
                else {
                    n5 = ljiijji;
                    n6 = ljiij;
                    if (ljiij == ljiijji) {
                        return 0;
                    }
                }
            }
            else {
                n5 = 0.0f;
                ljiiiz = 0;
                n6 = 1.0f;
            }
            float n7;
            if (n > n6) {
                n7 = n6;
            }
            else {
                n7 = n;
                if (n < n5) {
                    n7 = n5;
                }
            }
            n = n7 / (n6 - n5);
            ljiiiizz -= ljiiiz;
        }
        final float n3 = (float)ljiiiizz;
        return (int)(n * n3);
    }
    
    public static final int LIZ(final LiveEffect liveEffect, final float n) {
        CTM.LIZ((Object)liveEffect);
        return LIZ(liveEffect.getSmallItemConfig(), n);
    }
    
    public final List<0hK> LIZ(final List<0hK> list) {
        public final class 0g0<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(6167);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)((0hK)t).LJ, (Comparable)((0hK)t2).LJ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: aload_1        
        //    14: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    17: pop            
        //    18: aload_2        
        //    19: invokeinterface java/util/List.size:()I
        //    24: iconst_1       
        //    25: if_icmple       39
        //    28: aload_2        
        //    29: new             LX/0g0;
        //    32: dup            
        //    33: invokespecial   X/0g0.<init>:()V
        //    36: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: astore_1       
        //    47: aload_2        
        //    48: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    53: astore_3       
        //    54: aload_3        
        //    55: invokeinterface java/util/Iterator.hasNext:()Z
        //    60: ifeq            142
        //    63: aload_3        
        //    64: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    69: astore_2       
        //    70: aload_2        
        //    71: checkcast       LX/0hK;
        //    74: astore          4
        //    76: aload           4
        //    78: getfield        X/0hK.LJII:Z
        //    81: ifeq            54
        //    84: aload           4
        //    86: getfield        X/0hK.LJ:J
        //    89: lstore          5
        //    91: getstatic       X/GST.LLLIIII:LX/44V;
        //    94: astore          4
        //    96: aload           4
        //    98: ldc             ""
        //   100: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   103: aload           4
        //   105: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   108: astore          4
        //   110: aload           4
        //   112: ldc             ""
        //   114: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   117: lload           5
        //   119: aload           4
        //   121: checkcast       Ljava/lang/Number;
        //   124: invokevirtual   java/lang/Number.longValue:()J
        //   127: lcmp           
        //   128: ifge            54
        //   131: aload_1        
        //   132: aload_2        
        //   133: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: goto            54
        //   142: aload_1        
        //   143: checkcast       Ljava/util/List;
        //   146: areturn        
        //    Signature:
        //  (Ljava/util/List<LX/0hK;>;)Ljava/util/List<LX/0hK;>;
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
    
    public final String[] LIZ(final 0hK 0hK) {
        CTM.LIZ((Object)0hK);
        final ArrayList list = new ArrayList();
        while (true) {
            for (final 0hL next : 0hK.LJI) {
                if (next.LIZ != null) {
                    if (next != null) {
                        final List<0hL> lji = 0hK.LJI;
                        final ArrayList list2 = new ArrayList();
                        for (final 0hL next2 : lji) {
                            if (next2.LIZ != null) {
                                list2.add(next2);
                            }
                        }
                        for (final 0hL 0hL : list2) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(0hK.LIZJ);
                            sb.append(':');
                            sb.append(0hL.LIZJ);
                            sb.append(':');
                            sb.append(0hL.LIZ);
                            list.add(sb.toString());
                        }
                        final Object[] array = list.toArray(new String[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        return (String[])array;
                    }
                    break;
                }
            }
            list.add(0hK.LIZJ);
            continue;
        }
    }
    
    public final String[] LIZ(final List<0hK> list, final boolean b) {
        public final class 0g1<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(6168);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)((0hK)t).LJ, (Comparable)((0hK)t2).LJ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_1        
        //    14: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    17: pop            
        //    18: aload_3        
        //    19: invokeinterface java/util/List.size:()I
        //    24: iconst_1       
        //    25: if_icmple       39
        //    28: aload_3        
        //    29: new             LX/0g1;
        //    32: dup            
        //    33: invokespecial   X/0g1.<init>:()V
        //    36: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: astore_1       
        //    47: new             Ljava/util/ArrayList;
        //    50: dup            
        //    51: invokespecial   java/util/ArrayList.<init>:()V
        //    54: astore          4
        //    56: aload_3        
        //    57: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    62: astore_3       
        //    63: aload_3        
        //    64: invokeinterface java/util/Iterator.hasNext:()Z
        //    69: ifeq            104
        //    72: aload_3        
        //    73: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    78: astore          5
        //    80: aload           5
        //    82: checkcast       LX/0hK;
        //    85: getfield        X/0hK.LJII:Z
        //    88: ifeq            63
        //    91: aload           4
        //    93: aload           5
        //    95: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   100: pop            
        //   101: goto            63
        //   104: aload           4
        //   106: checkcast       Ljava/util/List;
        //   109: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   114: astore          4
        //   116: aload           4
        //   118: invokeinterface java/util/Iterator.hasNext:()Z
        //   123: ifeq            445
        //   126: aload           4
        //   128: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   133: checkcast       LX/0hK;
        //   136: astore_3       
        //   137: aload_3        
        //   138: getfield        X/0hK.LJI:Ljava/util/List;
        //   141: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   146: astore          5
        //   148: aload           5
        //   150: invokeinterface java/util/Iterator.hasNext:()Z
        //   155: ifeq            433
        //   158: aload           5
        //   160: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   165: astore          6
        //   167: aload           6
        //   169: checkcast       LX/0hL;
        //   172: astore          7
        //   174: iload_2        
        //   175: ifne            186
        //   178: aload           7
        //   180: getfield        X/0hL.LIZ:Ljava/lang/Float;
        //   183: ifnull          148
        //   186: aload           6
        //   188: ifnull          433
        //   191: aload_3        
        //   192: getfield        X/0hK.LJI:Ljava/util/List;
        //   195: astore          7
        //   197: new             Ljava/util/ArrayList;
        //   200: dup            
        //   201: invokespecial   java/util/ArrayList.<init>:()V
        //   204: astore          5
        //   206: aload           7
        //   208: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   213: astore          7
        //   215: aload           7
        //   217: invokeinterface java/util/Iterator.hasNext:()Z
        //   222: ifeq            266
        //   225: aload           7
        //   227: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   232: astore          6
        //   234: aload           6
        //   236: checkcast       LX/0hL;
        //   239: astore          8
        //   241: iload_2        
        //   242: ifne            253
        //   245: aload           8
        //   247: getfield        X/0hL.LIZ:Ljava/lang/Float;
        //   250: ifnull          215
        //   253: aload           5
        //   255: aload           6
        //   257: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   262: pop            
        //   263: goto            215
        //   266: aload           5
        //   268: checkcast       Ljava/util/List;
        //   271: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   276: astore          5
        //   278: aload           5
        //   280: invokeinterface java/util/Iterator.hasNext:()Z
        //   285: ifeq            116
        //   288: aload           5
        //   290: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   295: checkcast       LX/0hL;
        //   298: astore          7
        //   300: iload_2        
        //   301: ifeq            363
        //   304: new             Ljava/lang/StringBuilder;
        //   307: dup            
        //   308: invokespecial   java/lang/StringBuilder.<init>:()V
        //   311: astore          6
        //   313: aload           6
        //   315: aload_3        
        //   316: getfield        X/0hK.LIZJ:Ljava/lang/String;
        //   319: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   322: pop            
        //   323: aload           6
        //   325: bipush          58
        //   327: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   330: pop            
        //   331: aload           6
        //   333: aload           7
        //   335: getfield        X/0hL.LIZJ:Ljava/lang/String;
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: pop            
        //   342: aload           6
        //   344: ldc             ":0"
        //   346: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   349: pop            
        //   350: aload_1        
        //   351: aload           6
        //   353: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   356: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   359: pop            
        //   360: goto            278
        //   363: new             Ljava/lang/StringBuilder;
        //   366: dup            
        //   367: invokespecial   java/lang/StringBuilder.<init>:()V
        //   370: astore          6
        //   372: aload           6
        //   374: aload_3        
        //   375: getfield        X/0hK.LIZJ:Ljava/lang/String;
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: pop            
        //   382: aload           6
        //   384: bipush          58
        //   386: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   389: pop            
        //   390: aload           6
        //   392: aload           7
        //   394: getfield        X/0hL.LIZJ:Ljava/lang/String;
        //   397: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   400: pop            
        //   401: aload           6
        //   403: bipush          58
        //   405: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   408: pop            
        //   409: aload           6
        //   411: aload           7
        //   413: getfield        X/0hL.LIZ:Ljava/lang/Float;
        //   416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   419: pop            
        //   420: aload_1        
        //   421: aload           6
        //   423: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   426: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   429: pop            
        //   430: goto            278
        //   433: aload_1        
        //   434: aload_3        
        //   435: getfield        X/0hK.LIZJ:Ljava/lang/String;
        //   438: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   441: pop            
        //   442: goto            116
        //   445: iconst_3       
        //   446: ldc             "LiveComposerManagerB"
        //   448: aload_1        
        //   449: invokevirtual   java/util/ArrayList.toString:()Ljava/lang/String;
        //   452: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   455: aload_1        
        //   456: iconst_0       
        //   457: anewarray       Ljava/lang/String;
        //   460: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   465: astore_1       
        //   466: aload_1        
        //   467: ldc             "null cannot be cast to non-null type kotlin.Array<T>"
        //   469: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   472: pop            
        //   473: aload_1        
        //   474: checkcast       [Ljava/lang/String;
        //   477: areturn        
        //    Signature:
        //  (Ljava/util/List<LX/0hK;>;Z)[Ljava/lang/String;
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
    
    public final String[] LIZ(final Map<String, List<LiveEffect>> map, final String[] array) {
        CTM.LIZ((Object)map, (Object)array);
        final ArrayList list = new ArrayList(array.length);
        final int length = array.length;
        int n = 0;
    Label_0147_Outer:
        while (true) {
            final String s = "";
            if (n < length) {
                final String s2 = array[n];
                final Iterator<List<LiveEffect>> iterator = map.values().iterator();
            Label_0147:
                while (true) {
                    Label_0162: {
                        String extra;
                        while (true) {
                            extra = s;
                            if (iterator.hasNext()) {
                                while (true) {
                                    for (final Object next : iterator.next()) {
                                        if (y.LIZIZ(s2, ((LiveEffect)next).unzipPath, false)) {
                                            final LiveEffect liveEffect = (LiveEffect)next;
                                            if (liveEffect == null) {
                                                continue Label_0147;
                                            }
                                            extra = liveEffect.extra;
                                            if (extra == null) {
                                                extra = s;
                                                break Label_0147;
                                            }
                                            break Label_0162;
                                        }
                                    }
                                    Object next = null;
                                    continue Label_0147_Outer;
                                }
                            }
                            break;
                        }
                        list.add(extra);
                        ++n;
                        continue Label_0147_Outer;
                    }
                    continue Label_0147;
                }
            }
            break;
        }
        final Object[] array2 = list.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        final String[] array3 = (String[])array2;
        final StringBuilder sb = new StringBuilder("effect extra list:");
        final String string = Arrays.toString(array3);
        kotlin.jvm.internal.n.LIZIZ((Object)string, "");
        sb.append(string);
        0ba.LIZ(3, "LiveComposerUtils", sb.toString());
        return array3;
    }
    
    public final List<0hK> LIZIZ(final List<0hK> list) {
        public final class 0fz<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(6166);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)((0hK)t).LJ, (Comparable)((0hK)t2).LJ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: aload_1        
        //    14: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    17: pop            
        //    18: aload_2        
        //    19: invokeinterface java/util/List.size:()I
        //    24: iconst_1       
        //    25: if_icmple       39
        //    28: aload_2        
        //    29: new             LX/0fz;
        //    32: dup            
        //    33: invokespecial   X/0fz.<init>:()V
        //    36: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: astore_1       
        //    47: aload_2        
        //    48: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    53: astore_2       
        //    54: aload_2        
        //    55: invokeinterface java/util/Iterator.hasNext:()Z
        //    60: ifeq            142
        //    63: aload_2        
        //    64: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    69: astore_3       
        //    70: aload_3        
        //    71: checkcast       LX/0hK;
        //    74: astore          4
        //    76: aload           4
        //    78: getfield        X/0hK.LJII:Z
        //    81: ifeq            54
        //    84: aload           4
        //    86: getfield        X/0hK.LJ:J
        //    89: lstore          5
        //    91: getstatic       X/GST.LLLIIII:LX/44V;
        //    94: astore          4
        //    96: aload           4
        //    98: ldc             ""
        //   100: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   103: aload           4
        //   105: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   108: astore          4
        //   110: aload           4
        //   112: ldc             ""
        //   114: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   117: lload           5
        //   119: aload           4
        //   121: checkcast       Ljava/lang/Number;
        //   124: invokevirtual   java/lang/Number.longValue:()J
        //   127: lcmp           
        //   128: iflt            54
        //   131: aload_1        
        //   132: aload_3        
        //   133: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: goto            54
        //   142: aload_1        
        //   143: checkcast       Ljava/util/List;
        //   146: areturn        
        //    Signature:
        //  (Ljava/util/List<LX/0hK;>;)Ljava/util/List<LX/0hK;>;
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
    
    public final List<0hK> LIZJ(final List<0hK> list) {
        public final class 0g2<T> implements Comparator
        {
            static {
                Covode.recordClassIndex(6169);
            }
            
            @Override
            public final int compare(final T t, final T t2) {
                return JwY.LIZ((Comparable)((0hK)t).LJ, (Comparable)((0hK)t2).LJ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             Ljava/util/ArrayList;
        //     7: dup            
        //     8: invokespecial   java/util/ArrayList.<init>:()V
        //    11: astore_2       
        //    12: aload_2        
        //    13: aload_1        
        //    14: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    17: pop            
        //    18: aload_2        
        //    19: invokeinterface java/util/List.size:()I
        //    24: iconst_1       
        //    25: if_icmple       39
        //    28: aload_2        
        //    29: new             LX/0g2;
        //    32: dup            
        //    33: invokespecial   X/0g2.<init>:()V
        //    36: invokestatic    X/F75.LIZ:(Ljava/util/List;Ljava/util/Comparator;)V
        //    39: new             Ljava/util/ArrayList;
        //    42: dup            
        //    43: invokespecial   java/util/ArrayList.<init>:()V
        //    46: astore_1       
        //    47: aload_2        
        //    48: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    53: astore_2       
        //    54: aload_2        
        //    55: invokeinterface java/util/Iterator.hasNext:()Z
        //    60: ifeq            91
        //    63: aload_2        
        //    64: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    69: astore_3       
        //    70: aload_3        
        //    71: checkcast       LX/0hK;
        //    74: getfield        X/0hK.LJII:Z
        //    77: ifeq            54
        //    80: aload_1        
        //    81: aload_3        
        //    82: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    87: pop            
        //    88: goto            54
        //    91: aload_1        
        //    92: checkcast       Ljava/util/List;
        //    95: areturn        
        //    Signature:
        //  (Ljava/util/List<LX/0hK;>;)Ljava/util/List<LX/0hK;>;
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
}
