// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources$Theme;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class 06i
{
    public final Shader LIZ;
    public int LIZIZ;
    public final ColorStateList LIZJ;
    
    static {
        Covode.recordClassIndex(744);
    }
    
    public 06i(final Shader liz, final ColorStateList lizj, final int liziz) {
        this.LIZ = liz;
        this.LIZJ = lizj;
        this.LIZIZ = liziz;
    }
    
    public static 06i LIZ(final int n) {
        return new 06i(null, null, n);
    }
    
    public static 06i LIZ(final Resources p0, final int p1, final Resources$Theme p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_1        
        //     2: invokevirtual   android/content/res/Resources.getXml:(I)Landroid/content/res/XmlResourceParser;
        //     5: astore_3       
        //     6: aload_3        
        //     7: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //    10: astore          4
        //    12: aload_3        
        //    13: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    18: istore_1       
        //    19: iload_1        
        //    20: iconst_2       
        //    21: if_icmpeq       41
        //    24: iload_1        
        //    25: iconst_1       
        //    26: if_icmpne       12
        //    29: new             Lorg/xmlpull/v1/XmlPullParserException;
        //    32: astore_0       
        //    33: aload_0        
        //    34: ldc             "No start tag found"
        //    36: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //    39: aload_0        
        //    40: athrow         
        //    41: aload_3        
        //    42: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    47: astore          5
        //    49: aload           5
        //    51: invokevirtual   java/lang/String.hashCode:()I
        //    54: istore_1       
        //    55: iload_1        
        //    56: ldc             89650992
        //    58: if_icmpeq       105
        //    61: iload_1        
        //    62: ldc             1191572447
        //    64: if_icmpeq       70
        //    67: goto            596
        //    70: aload           5
        //    72: ldc             "selector"
        //    74: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    77: ifeq            596
        //    80: aload_0        
        //    81: aload_3        
        //    82: aload           4
        //    84: aload_2        
        //    85: invokestatic    X/06h.LIZ:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
        //    88: astore_0       
        //    89: aload_0        
        //    90: invokevirtual   android/content/res/ColorStateList.getDefaultColor:()I
        //    93: istore_1       
        //    94: new             LX/06i;
        //    97: dup            
        //    98: aconst_null    
        //    99: aload_0        
        //   100: iload_1        
        //   101: invokespecial   X/06i.<init>:(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
        //   104: areturn        
        //   105: aload           5
        //   107: ldc             "gradient"
        //   109: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   112: ifeq            596
        //   115: aload_3        
        //   116: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   121: astore          5
        //   123: aload           5
        //   125: ldc             "gradient"
        //   127: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   130: ifeq            549
        //   133: aload_0        
        //   134: aload_2        
        //   135: aload           4
        //   137: bipush          12
        //   139: newarray        I
        //   141: dup            
        //   142: iconst_0       
        //   143: ldc             16843165
        //   145: iastore        
        //   146: dup            
        //   147: iconst_1       
        //   148: ldc             16843166
        //   150: iastore        
        //   151: dup            
        //   152: iconst_2       
        //   153: ldc             16843169
        //   155: iastore        
        //   156: dup            
        //   157: iconst_3       
        //   158: ldc             16843170
        //   160: iastore        
        //   161: dup            
        //   162: iconst_4       
        //   163: ldc             16843171
        //   165: iastore        
        //   166: dup            
        //   167: iconst_5       
        //   168: ldc             16843172
        //   170: iastore        
        //   171: dup            
        //   172: bipush          6
        //   174: ldc             16843265
        //   176: iastore        
        //   177: dup            
        //   178: bipush          7
        //   180: ldc             16843275
        //   182: iastore        
        //   183: dup            
        //   184: bipush          8
        //   186: ldc             16844048
        //   188: iastore        
        //   189: dup            
        //   190: bipush          9
        //   192: ldc             16844049
        //   194: iastore        
        //   195: dup            
        //   196: bipush          10
        //   198: ldc             16844050
        //   200: iastore        
        //   201: dup            
        //   202: bipush          11
        //   204: ldc             16844051
        //   206: iastore        
        //   207: invokestatic    X/06u.LIZ:(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //   210: astore          5
        //   212: aload           5
        //   214: aload_3        
        //   215: ldc             "startX"
        //   217: bipush          8
        //   219: fconst_0       
        //   220: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   223: fstore          6
        //   225: aload           5
        //   227: aload_3        
        //   228: ldc             "startY"
        //   230: bipush          9
        //   232: fconst_0       
        //   233: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   236: fstore          7
        //   238: aload           5
        //   240: aload_3        
        //   241: ldc             "endX"
        //   243: bipush          10
        //   245: fconst_0       
        //   246: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   249: fstore          8
        //   251: aload           5
        //   253: aload_3        
        //   254: ldc             "endY"
        //   256: bipush          11
        //   258: fconst_0       
        //   259: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   262: fstore          9
        //   264: aload           5
        //   266: aload_3        
        //   267: ldc             "centerX"
        //   269: iconst_3       
        //   270: fconst_0       
        //   271: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   274: fstore          10
        //   276: aload           5
        //   278: aload_3        
        //   279: ldc             "centerY"
        //   281: iconst_4       
        //   282: fconst_0       
        //   283: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   286: fstore          11
        //   288: aload           5
        //   290: aload_3        
        //   291: ldc             "type"
        //   293: iconst_2       
        //   294: iconst_0       
        //   295: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
        //   298: istore          12
        //   300: aload           5
        //   302: aload_3        
        //   303: ldc             "startColor"
        //   305: iconst_0       
        //   306: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //   309: istore          13
        //   311: aload_3        
        //   312: ldc             "centerColor"
        //   314: invokestatic    X/06u.LIZ:(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
        //   317: istore          14
        //   319: aload           5
        //   321: aload_3        
        //   322: ldc             "centerColor"
        //   324: bipush          7
        //   326: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //   329: istore_1       
        //   330: aload           5
        //   332: aload_3        
        //   333: ldc             "endColor"
        //   335: iconst_1       
        //   336: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)I
        //   339: istore          15
        //   341: aload           5
        //   343: aload_3        
        //   344: ldc             "tileMode"
        //   346: bipush          6
        //   348: iconst_0       
        //   349: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I
        //   352: istore          16
        //   354: aload           5
        //   356: aload_3        
        //   357: ldc             "gradientRadius"
        //   359: iconst_5       
        //   360: fconst_0       
        //   361: invokestatic    X/06u.LIZ:(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F
        //   364: fstore          17
        //   366: aload           5
        //   368: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   371: aload_0        
        //   372: aload_3        
        //   373: aload           4
        //   375: aload_2        
        //   376: invokestatic    X/06n.LIZ:(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)LX/06m;
        //   379: astore_0       
        //   380: aload_0        
        //   381: ifnull          387
        //   384: goto            420
        //   387: iload           14
        //   389: ifeq            408
        //   392: new             LX/06m;
        //   395: dup            
        //   396: iload           13
        //   398: iload_1        
        //   399: iload           15
        //   401: invokespecial   X/06m.<init>:(III)V
        //   404: astore_0       
        //   405: goto            420
        //   408: new             LX/06m;
        //   411: dup            
        //   412: iload           13
        //   414: iload           15
        //   416: invokespecial   X/06m.<init>:(II)V
        //   419: astore_0       
        //   420: iload           12
        //   422: iconst_1       
        //   423: if_icmpeq       458
        //   426: iload           12
        //   428: iconst_2       
        //   429: if_icmpeq       435
        //   432: goto            495
        //   435: new             Landroid/graphics/SweepGradient;
        //   438: dup            
        //   439: fload           10
        //   441: fload           11
        //   443: aload_0        
        //   444: getfield        X/06m.LIZ:[I
        //   447: aload_0        
        //   448: getfield        X/06m.LIZIZ:[F
        //   451: invokespecial   android/graphics/SweepGradient.<init>:(FF[I[F)V
        //   454: astore_0       
        //   455: goto            526
        //   458: fload           17
        //   460: fconst_0       
        //   461: fcmpg          
        //   462: ifle            537
        //   465: new             Landroid/graphics/RadialGradient;
        //   468: dup            
        //   469: fload           10
        //   471: fload           11
        //   473: fload           17
        //   475: aload_0        
        //   476: getfield        X/06m.LIZ:[I
        //   479: aload_0        
        //   480: getfield        X/06m.LIZIZ:[F
        //   483: iload           16
        //   485: invokestatic    X/06n.LIZ:(I)Landroid/graphics/Shader$TileMode;
        //   488: invokespecial   android/graphics/RadialGradient.<init>:(FFF[I[FLandroid/graphics/Shader$TileMode;)V
        //   491: astore_0       
        //   492: goto            526
        //   495: new             Landroid/graphics/LinearGradient;
        //   498: astore_2       
        //   499: aload_2        
        //   500: fload           6
        //   502: fload           7
        //   504: fload           8
        //   506: fload           9
        //   508: aload_0        
        //   509: getfield        X/06m.LIZ:[I
        //   512: aload_0        
        //   513: getfield        X/06m.LIZIZ:[F
        //   516: iload           16
        //   518: invokestatic    X/06n.LIZ:(I)Landroid/graphics/Shader$TileMode;
        //   521: invokespecial   android/graphics/LinearGradient.<init>:(FFFF[I[FLandroid/graphics/Shader$TileMode;)V
        //   524: aload_2        
        //   525: astore_0       
        //   526: new             LX/06i;
        //   529: dup            
        //   530: aload_0        
        //   531: aconst_null    
        //   532: iconst_0       
        //   533: invokespecial   X/06i.<init>:(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V
        //   536: areturn        
        //   537: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   540: astore_0       
        //   541: aload_0        
        //   542: ldc             "<gradient> tag requires 'gradientRadius' attribute with radial type"
        //   544: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   547: aload_0        
        //   548: athrow         
        //   549: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   552: astore_0       
        //   553: new             Ljava/lang/StringBuilder;
        //   556: astore_2       
        //   557: aload_2        
        //   558: invokespecial   java/lang/StringBuilder.<init>:()V
        //   561: aload_2        
        //   562: aload_3        
        //   563: invokeinterface org/xmlpull/v1/XmlPullParser.getPositionDescription:()Ljava/lang/String;
        //   568: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   571: pop            
        //   572: aload_2        
        //   573: ldc             ": invalid gradient color tag "
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: pop            
        //   579: aload_2        
        //   580: aload           5
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: pop            
        //   586: aload_0        
        //   587: aload_2        
        //   588: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   591: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   594: aload_0        
        //   595: athrow         
        //   596: new             Lorg/xmlpull/v1/XmlPullParserException;
        //   599: astore_0       
        //   600: new             Ljava/lang/StringBuilder;
        //   603: astore_2       
        //   604: aload_2        
        //   605: invokespecial   java/lang/StringBuilder.<init>:()V
        //   608: aload_2        
        //   609: aload_3        
        //   610: invokeinterface org/xmlpull/v1/XmlPullParser.getPositionDescription:()Ljava/lang/String;
        //   615: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   618: pop            
        //   619: aload_2        
        //   620: ldc             ": unsupported complex color tag "
        //   622: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   625: pop            
        //   626: aload_2        
        //   627: aload           5
        //   629: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   632: pop            
        //   633: aload_0        
        //   634: aload_2        
        //   635: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   638: invokespecial   org/xmlpull/v1/XmlPullParserException.<init>:(Ljava/lang/String;)V
        //   641: aload_0        
        //   642: athrow         
        //   643: astore_0       
        //   644: aconst_null    
        //   645: areturn        
        //   646: astore_0       
        //   647: goto            644
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      12     643    644    Ljava/lang/Exception;
        //  12     19     643    644    Ljava/lang/Exception;
        //  29     41     643    644    Ljava/lang/Exception;
        //  41     55     643    644    Ljava/lang/Exception;
        //  70     94     643    644    Ljava/lang/Exception;
        //  94     105    646    650    Ljava/lang/Exception;
        //  105    380    643    644    Ljava/lang/Exception;
        //  392    405    643    644    Ljava/lang/Exception;
        //  408    420    643    644    Ljava/lang/Exception;
        //  435    455    643    644    Ljava/lang/Exception;
        //  465    492    643    644    Ljava/lang/Exception;
        //  495    524    643    644    Ljava/lang/Exception;
        //  526    537    646    650    Ljava/lang/Exception;
        //  537    549    643    644    Ljava/lang/Exception;
        //  549    596    643    644    Ljava/lang/Exception;
        //  596    643    643    644    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
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
    
    public final boolean LIZ() {
        return this.LIZ != null;
    }
    
    public final boolean LIZ(final int[] array) {
        if (!this.LIZIZ()) {
            return false;
        }
        final ColorStateList lizj = this.LIZJ;
        final int colorForState = lizj.getColorForState(array, lizj.getDefaultColor());
        if (colorForState == this.LIZIZ) {
            return false;
        }
        boolean b = true;
        this.LIZIZ = colorForState;
        return b;
        b = false;
        return b;
    }
    
    public final boolean LIZIZ() {
        if (this.LIZ == null) {
            final ColorStateList lizj = this.LIZJ;
            if (lizj != null && lizj.isStateful()) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean LIZJ() {
        return this.LIZ() || this.LIZIZ != 0;
    }
}
