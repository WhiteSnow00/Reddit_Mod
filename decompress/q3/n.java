// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import java.io.InputStream;
import w3.m;
import android.graphics.Typeface;
import android.content.res.Resources;
import p3.d$c;
import android.content.Context;
import android.graphics.fonts.FontStyle;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;

public final class n extends p
{
    public static Font g(final FontFamily fontFamily, int i) {
        int n;
        if ((i & 0x1) != 0x0) {
            n = 700;
        }
        else {
            n = 400;
        }
        final int n2 = 1;
        if ((i & 0x2) != 0x0) {
            i = 1;
        }
        else {
            i = 0;
        }
        final FontStyle fontStyle = new FontStyle(n, i);
        Font font = fontFamily.getFont(0);
        int h = h(fontStyle, font.getStyle());
        Font font2;
        int h2;
        int n3;
        for (i = n2; i < fontFamily.getSize(); ++i, h = n3) {
            font2 = fontFamily.getFont(i);
            h2 = h(fontStyle, font2.getStyle());
            if (h2 < (n3 = h)) {
                font = font2;
                n3 = h2;
            }
        }
        return font;
    }
    
    public static int h(final FontStyle fontStyle, final FontStyle fontStyle2) {
        final int n = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        int n2;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            n2 = 0;
        }
        else {
            n2 = 2;
        }
        return n + n2;
    }
    
    public final Typeface a(final Context p0, final d$c p1, final Resources p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          8
        //     3: aload_2        
        //     4: getfield        p3/d$c.a:[Lp3/d$d;
        //     7: astore          9
        //     9: aload           9
        //    11: arraylength    
        //    12: istore          7
        //    14: aconst_null    
        //    15: astore_1       
        //    16: iconst_0       
        //    17: istore          5
        //    19: iload           5
        //    21: iload           7
        //    23: if_icmpge       132
        //    26: aload           9
        //    28: iload           5
        //    30: aaload         
        //    31: astore_2       
        //    32: new             Landroid/graphics/fonts/Font$Builder;
        //    35: astore          10
        //    37: aload           10
        //    39: aload_3        
        //    40: aload_2        
        //    41: getfield        p3/d$d.f:I
        //    44: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/content/res/Resources;I)V
        //    47: aload           10
        //    49: aload_2        
        //    50: getfield        p3/d$d.b:I
        //    53: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    56: astore          10
        //    58: aload_2        
        //    59: getfield        p3/d$d.c:Z
        //    62: ifeq            71
        //    65: iconst_1       
        //    66: istore          6
        //    68: goto            74
        //    71: iconst_0       
        //    72: istore          6
        //    74: aload           10
        //    76: iload           6
        //    78: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //    81: aload_2        
        //    82: getfield        p3/d$d.e:I
        //    85: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //    88: aload_2        
        //    89: getfield        p3/d$d.d:Ljava/lang/String;
        //    92: invokevirtual   android/graphics/fonts/Font$Builder.setFontVariationSettings:(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;
        //    95: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //    98: astore          10
        //   100: aload_1        
        //   101: ifnonnull       119
        //   104: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   107: astore_2       
        //   108: aload_2        
        //   109: aload           10
        //   111: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   114: aload_2        
        //   115: astore_1       
        //   116: goto            126
        //   119: aload_1        
        //   120: aload           10
        //   122: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   125: pop            
        //   126: iinc            5, 1
        //   129: goto            19
        //   132: aload_1        
        //   133: ifnonnull       138
        //   136: aconst_null    
        //   137: areturn        
        //   138: aload_1        
        //   139: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   142: astore_1       
        //   143: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   146: astore_2       
        //   147: aload_2        
        //   148: aload_1        
        //   149: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   152: aload_2        
        //   153: aload_1        
        //   154: iload           4
        //   156: invokestatic    q3/n.g:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   159: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   162: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   165: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   168: astore_1       
        //   169: aload_1        
        //   170: areturn        
        //   171: astore_1       
        //   172: aload           8
        //   174: astore_1       
        //   175: goto            169
        //   178: astore_2       
        //   179: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      14     171    178    Ljava/lang/Exception;
        //  32     65     178    182    Ljava/io/IOException;
        //  32     65     171    178    Ljava/lang/Exception;
        //  74     100    178    182    Ljava/io/IOException;
        //  74     100    171    178    Ljava/lang/Exception;
        //  104    114    178    182    Ljava/io/IOException;
        //  104    114    171    178    Ljava/lang/Exception;
        //  119    126    178    182    Ljava/io/IOException;
        //  119    126    171    178    Ljava/lang/Exception;
        //  138    169    171    178    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    public final Typeface b(final Context p0, final m[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //     4: astore          8
        //     6: aload_2        
        //     7: arraylength    
        //     8: istore          6
        //    10: aconst_null    
        //    11: astore_1       
        //    12: iconst_0       
        //    13: istore          4
        //    15: iload           4
        //    17: iload           6
        //    19: if_icmpge       202
        //    22: aload_2        
        //    23: iload           4
        //    25: aaload         
        //    26: astore          10
        //    28: aload_1        
        //    29: astore          7
        //    31: aload           8
        //    33: aload           10
        //    35: getfield        w3/m.a:Landroid/net/Uri;
        //    38: ldc             "r"
        //    40: aconst_null    
        //    41: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    44: astore          9
        //    46: aload           9
        //    48: ifnonnull       62
        //    51: aload_1        
        //    52: astore          7
        //    54: aload           9
        //    56: ifnull          193
        //    59: goto            151
        //    62: new             Landroid/graphics/fonts/Font$Builder;
        //    65: astore          7
        //    67: aload           7
        //    69: aload           9
        //    71: invokespecial   android/graphics/fonts/Font$Builder.<init>:(Landroid/os/ParcelFileDescriptor;)V
        //    74: aload           7
        //    76: aload           10
        //    78: getfield        w3/m.c:I
        //    81: invokevirtual   android/graphics/fonts/Font$Builder.setWeight:(I)Landroid/graphics/fonts/Font$Builder;
        //    84: astore          7
        //    86: aload           10
        //    88: getfield        w3/m.d:Z
        //    91: ifeq            100
        //    94: iconst_1       
        //    95: istore          5
        //    97: goto            103
        //   100: iconst_0       
        //   101: istore          5
        //   103: aload           7
        //   105: iload           5
        //   107: invokevirtual   android/graphics/fonts/Font$Builder.setSlant:(I)Landroid/graphics/fonts/Font$Builder;
        //   110: aload           10
        //   112: getfield        w3/m.b:I
        //   115: invokevirtual   android/graphics/fonts/Font$Builder.setTtcIndex:(I)Landroid/graphics/fonts/Font$Builder;
        //   118: invokevirtual   android/graphics/fonts/Font$Builder.build:()Landroid/graphics/fonts/Font;
        //   121: astore          7
        //   123: aload_1        
        //   124: ifnonnull       144
        //   127: new             Landroid/graphics/fonts/FontFamily$Builder;
        //   130: dup            
        //   131: aload           7
        //   133: invokespecial   android/graphics/fonts/FontFamily$Builder.<init>:(Landroid/graphics/fonts/Font;)V
        //   136: astore          7
        //   138: aload           7
        //   140: astore_1       
        //   141: goto            151
        //   144: aload_1        
        //   145: aload           7
        //   147: invokevirtual   android/graphics/fonts/FontFamily$Builder.addFont:(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
        //   150: pop            
        //   151: aload_1        
        //   152: astore          7
        //   154: aload           9
        //   156: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   159: aload_1        
        //   160: astore          7
        //   162: goto            193
        //   165: astore          10
        //   167: aload           9
        //   169: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   172: goto            187
        //   175: astore          9
        //   177: aload_1        
        //   178: astore          7
        //   180: aload           10
        //   182: aload           9
        //   184: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   187: aload_1        
        //   188: astore          7
        //   190: aload           10
        //   192: athrow         
        //   193: iinc            4, 1
        //   196: aload           7
        //   198: astore_1       
        //   199: goto            15
        //   202: aload_1        
        //   203: ifnonnull       208
        //   206: aconst_null    
        //   207: areturn        
        //   208: aload_1        
        //   209: invokevirtual   android/graphics/fonts/FontFamily$Builder.build:()Landroid/graphics/fonts/FontFamily;
        //   212: astore_2       
        //   213: new             Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   216: astore_1       
        //   217: aload_1        
        //   218: aload_2        
        //   219: invokespecial   android/graphics/Typeface$CustomFallbackBuilder.<init>:(Landroid/graphics/fonts/FontFamily;)V
        //   222: aload_1        
        //   223: aload_2        
        //   224: iload_3        
        //   225: invokestatic    q3/n.g:(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;
        //   228: invokevirtual   android/graphics/fonts/Font.getStyle:()Landroid/graphics/fonts/FontStyle;
        //   231: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.setStyle:(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;
        //   234: invokevirtual   android/graphics/Typeface$CustomFallbackBuilder.build:()Landroid/graphics/Typeface;
        //   237: astore_1       
        //   238: aload_1        
        //   239: areturn        
        //   240: astore_1       
        //   241: aconst_null    
        //   242: areturn        
        //   243: astore_1       
        //   244: goto            193
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      10     240    243    Ljava/lang/Exception;
        //  31     46     243    247    Ljava/io/IOException;
        //  31     46     240    243    Ljava/lang/Exception;
        //  62     94     165    193    Any
        //  103    123    165    193    Any
        //  127    138    165    193    Any
        //  144    151    165    193    Any
        //  154    159    243    247    Ljava/io/IOException;
        //  154    159    240    243    Ljava/lang/Exception;
        //  167    172    175    187    Any
        //  180    187    243    247    Ljava/io/IOException;
        //  180    187    240    243    Ljava/lang/Exception;
        //  190    193    243    247    Ljava/io/IOException;
        //  190    193    240    243    Ljava/lang/Exception;
        //  208    238    240    243    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
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
    
    public final Typeface c(final Context context, final InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
    
    public final Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        try {
            final Font build = new Font$Builder(resources, n).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily$Builder(build).build()).setStyle(build.getStyle()).build();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final m f(final int n, final m[] array) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
