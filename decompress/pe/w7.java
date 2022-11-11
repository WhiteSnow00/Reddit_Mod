// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.Iterator;
import ie.j6;
import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Locale;
import lw0.b;
import ie.n2;
import ie.i2;
import java.math.BigDecimal;

public abstract class w7
{
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    
    public w7(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static Boolean d(final BigDecimal p0, final i2 p1, final double p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    lw0/b.R:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: invokevirtual   ie/i2.x:()Z
        //     8: istore          4
        //    10: aconst_null    
        //    11: astore          5
        //    13: iload           4
        //    15: ifeq            487
        //    18: aload_1        
        //    19: invokevirtual   ie/i2.C:()I
        //    22: istore          6
        //    24: iconst_1       
        //    25: istore          7
        //    27: iconst_1       
        //    28: istore          8
        //    30: iconst_1       
        //    31: istore          9
        //    33: iconst_1       
        //    34: istore          10
        //    36: iconst_1       
        //    37: istore          4
        //    39: iload           6
        //    41: iconst_1       
        //    42: if_icmpne       48
        //    45: goto            487
        //    48: aload_1        
        //    49: invokevirtual   ie/i2.C:()I
        //    52: iconst_5       
        //    53: if_icmpne       75
        //    56: aload_1        
        //    57: invokevirtual   ie/i2.B:()Z
        //    60: ifeq            73
        //    63: aload_1        
        //    64: invokevirtual   ie/i2.A:()Z
        //    67: ifeq            73
        //    70: goto            84
        //    73: aconst_null    
        //    74: areturn        
        //    75: aload_1        
        //    76: invokevirtual   ie/i2.y:()Z
        //    79: ifne            84
        //    82: aconst_null    
        //    83: areturn        
        //    84: aload_1        
        //    85: invokevirtual   ie/i2.C:()I
        //    88: istore          6
        //    90: aload_1        
        //    91: invokevirtual   ie/i2.C:()I
        //    94: iconst_5       
        //    95: if_icmpne       156
        //    98: aload_1        
        //    99: invokevirtual   ie/i2.v:()Ljava/lang/String;
        //   102: invokestatic    pe/i7.n0:(Ljava/lang/String;)Z
        //   105: ifeq            154
        //   108: aload_1        
        //   109: invokevirtual   ie/i2.u:()Ljava/lang/String;
        //   112: invokestatic    pe/i7.n0:(Ljava/lang/String;)Z
        //   115: ifne            121
        //   118: goto            154
        //   121: new             Ljava/math/BigDecimal;
        //   124: astore          11
        //   126: aload           11
        //   128: aload_1        
        //   129: invokevirtual   ie/i2.v:()Ljava/lang/String;
        //   132: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   135: new             Ljava/math/BigDecimal;
        //   138: dup            
        //   139: aload_1        
        //   140: invokevirtual   ie/i2.u:()Ljava/lang/String;
        //   143: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   146: astore          12
        //   148: aconst_null    
        //   149: astore          13
        //   151: goto            188
        //   154: aconst_null    
        //   155: areturn        
        //   156: aload_1        
        //   157: invokevirtual   ie/i2.t:()Ljava/lang/String;
        //   160: invokestatic    pe/i7.n0:(Ljava/lang/String;)Z
        //   163: ifne            168
        //   166: aconst_null    
        //   167: areturn        
        //   168: new             Ljava/math/BigDecimal;
        //   171: dup            
        //   172: aload_1        
        //   173: invokevirtual   ie/i2.t:()Ljava/lang/String;
        //   176: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   179: astore          13
        //   181: aconst_null    
        //   182: astore          11
        //   184: aload           11
        //   186: astore          12
        //   188: iload           6
        //   190: iconst_5       
        //   191: if_icmpne       205
        //   194: aload           5
        //   196: astore_1       
        //   197: aload           11
        //   199: ifnull          460
        //   202: goto            216
        //   205: aload           13
        //   207: ifnonnull       216
        //   210: aload           5
        //   212: astore_1       
        //   213: goto            460
        //   216: iinc            6, -1
        //   219: iload           6
        //   221: iconst_1       
        //   222: if_icmpeq       452
        //   225: iload           6
        //   227: iconst_2       
        //   228: if_icmpeq       416
        //   231: iload           6
        //   233: iconst_3       
        //   234: if_icmpeq       290
        //   237: iload           6
        //   239: iconst_4       
        //   240: if_icmpeq       249
        //   243: aload           5
        //   245: astore_1       
        //   246: goto            460
        //   249: aload           5
        //   251: astore_1       
        //   252: aload           11
        //   254: ifnull          460
        //   257: aload_0        
        //   258: aload           11
        //   260: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   263: iflt            278
        //   266: aload_0        
        //   267: aload           12
        //   269: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   272: ifgt            278
        //   275: goto            281
        //   278: iconst_0       
        //   279: istore          4
        //   281: iload           4
        //   283: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   286: astore_1       
        //   287: goto            460
        //   290: aload           13
        //   292: ifnonnull       301
        //   295: aload           5
        //   297: astore_1       
        //   298: goto            460
        //   301: dload_2        
        //   302: dconst_0       
        //   303: dcmpl          
        //   304: ifeq            388
        //   307: aload_0        
        //   308: aload           13
        //   310: new             Ljava/math/BigDecimal;
        //   313: dup            
        //   314: dload_2        
        //   315: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   318: new             Ljava/math/BigDecimal;
        //   321: dup            
        //   322: iconst_2       
        //   323: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   326: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   329: invokevirtual   java/math/BigDecimal.subtract:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   332: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   335: ifle            376
        //   338: aload_0        
        //   339: aload           13
        //   341: new             Ljava/math/BigDecimal;
        //   344: dup            
        //   345: dload_2        
        //   346: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   349: new             Ljava/math/BigDecimal;
        //   352: dup            
        //   353: iconst_2       
        //   354: invokespecial   java/math/BigDecimal.<init>:(I)V
        //   357: invokevirtual   java/math/BigDecimal.multiply:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   360: invokevirtual   java/math/BigDecimal.add:(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;
        //   363: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   366: ifge            376
        //   369: iload           7
        //   371: istore          4
        //   373: goto            379
        //   376: iconst_0       
        //   377: istore          4
        //   379: iload           4
        //   381: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   384: astore_1       
        //   385: goto            460
        //   388: aload_0        
        //   389: aload           13
        //   391: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   394: ifne            404
        //   397: iload           8
        //   399: istore          4
        //   401: goto            407
        //   404: iconst_0       
        //   405: istore          4
        //   407: iload           4
        //   409: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   412: astore_1       
        //   413: goto            460
        //   416: aload           13
        //   418: ifnonnull       427
        //   421: aload           5
        //   423: astore_1       
        //   424: goto            460
        //   427: aload_0        
        //   428: aload           13
        //   430: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   433: ifle            443
        //   436: iload           9
        //   438: istore          4
        //   440: goto            446
        //   443: iconst_0       
        //   444: istore          4
        //   446: iload           4
        //   448: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   451: areturn        
        //   452: aload           13
        //   454: ifnonnull       462
        //   457: aload           5
        //   459: astore_1       
        //   460: aload_1        
        //   461: areturn        
        //   462: aload_0        
        //   463: aload           13
        //   465: invokevirtual   java/math/BigDecimal.compareTo:(Ljava/math/BigDecimal;)I
        //   468: ifge            478
        //   471: iload           10
        //   473: istore          4
        //   475: goto            481
        //   478: iconst_0       
        //   479: istore          4
        //   481: iload           4
        //   483: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   486: areturn        
        //   487: aconst_null    
        //   488: areturn        
        //   489: astore_0       
        //   490: goto            154
        //   493: astore_0       
        //   494: goto            487
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  121    148    489    493    Ljava/lang/NumberFormatException;
        //  168    181    493    497    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0168:
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
    
    public static Boolean e(final String s, final n2 n2, final d3 d3) {
        b.R((Object)n2);
        final Boolean b = null;
        if (s == null) {
            return null;
        }
        Boolean b2 = b;
        if (n2.z()) {
            if (n2.A() == 1) {
                b2 = b;
            }
            else {
                if (n2.A() == 7) {
                    if (n2.r() == 0) {
                        return null;
                    }
                }
                else if (!n2.y()) {
                    return null;
                }
                final int a = n2.A();
                final boolean w = n2.w();
                String s2;
                if (!w && a != 2 && a != 7) {
                    s2 = n2.u().toUpperCase(Locale.ENGLISH);
                }
                else {
                    s2 = n2.u();
                }
                Object o;
                if (n2.r() == 0) {
                    o = null;
                }
                else {
                    final j6 j6 = (j6)(o = n2.v());
                    if (!w) {
                        final ArrayList list = new ArrayList<String>(((List)j6).size());
                        final Iterator iterator = ((List)j6).iterator();
                        while (iterator.hasNext()) {
                            list.add(((String)iterator.next()).toUpperCase(Locale.ENGLISH));
                        }
                        o = Collections.unmodifiableList((List<?>)list);
                    }
                }
                String s3;
                if (a == 2) {
                    s3 = s2;
                }
                else {
                    s3 = null;
                }
                if (a == 7) {
                    b2 = b;
                    if (o == null) {
                        return b2;
                    }
                    b2 = b;
                    if (((List)o).isEmpty()) {
                        return b2;
                    }
                }
                else if (s2 == null) {
                    b2 = b;
                    return b2;
                }
                String upperCase = s;
                if (!w) {
                    upperCase = s;
                    if (a != 2) {
                        upperCase = s.toUpperCase(Locale.ENGLISH);
                    }
                }
                switch (a - 1) {
                    default: {
                        b2 = b;
                        break;
                    }
                    case 6: {
                        if (o == null) {
                            b2 = b;
                            break;
                        }
                        b2 = ((List)o).contains(upperCase);
                        break;
                    }
                    case 5: {
                        b2 = upperCase.equals(s2);
                        break;
                    }
                    case 4: {
                        b2 = upperCase.contains(s2);
                        break;
                    }
                    case 3: {
                        b2 = upperCase.endsWith(s2);
                        break;
                    }
                    case 2: {
                        b2 = upperCase.startsWith(s2);
                        break;
                    }
                    case 1: {
                        if (s3 == null) {
                            b2 = b;
                            break;
                        }
                        int n3;
                        if (!w) {
                            n3 = 66;
                        }
                        else {
                            n3 = 0;
                        }
                        try {
                            b2 = Pattern.compile(s3, n3).matcher(upperCase).matches();
                        }
                        catch (final PatternSyntaxException ex) {
                            b2 = b;
                            if (d3 != null) {
                                d3.n.b((Object)s3, "Invalid regular expression in REGEXP audience filter. expression");
                                b2 = b;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return b2;
    }
    
    public static Boolean f(final Boolean b, final boolean b2) {
        if (b == null) {
            return null;
        }
        return b != b2;
    }
    
    public abstract int a();
    
    public abstract boolean b();
    
    public abstract boolean c();
}
