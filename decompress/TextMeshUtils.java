// 
// Decompiled by Procyon v0.6.0
// 

package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Rect;
import android.graphics.Paint$Align;
import android.graphics.Paint$Style;
import android.text.TextPaint;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

public class TextMeshUtils
{
    static {
        Covode.recordClassIndex(2472);
    }
    
    public static Bitmap callIStaticGenerateBitmapForEmoji(final byte[] array, final int n) {
        MethodCollector.i(2466);
        final String s = new String(array);
        final TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float)n);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint$Style.FILL);
        textPaint.setTextAlign(Paint$Align.LEFT);
        final Rect rect = new Rect();
        textPaint.getTextBounds(s, 0, s.length(), rect);
        final Bitmap bitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        canvas.drawText(s, (float)(-rect.left), (float)(-rect.top), (Paint)textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.o(2466);
        return bitmap;
    }
    
    public static Bitmap callIStaticGenerateBitmapFromTextMesh(final byte[] array, final String s, int i, int length, int n, float top, int n2, float letterSpacing, final int color, float bottom, float letterSpacing2, final float n3, final int n4, final int n5, final int n6, final int n7) {
        MethodCollector.i(8097);
        final String s2 = new String(array);
        final Rect rect = new Rect(0, 0, n6, n7);
        final Bitmap bitmap = Bitmap.createBitmap(n6, n7, Bitmap$Config.ARGB_8888);
        final Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint$Style.FILL);
        final Canvas canvas = new Canvas(bitmap);
        final TextPaint textPaint = new TextPaint();
        textPaint.setColor(length);
        final float textSize = (float)i;
        textPaint.setTextSize(textSize);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint$Style.FILL);
        if (n5 == 0) {
            textPaint.setTextAlign(Paint$Align.LEFT);
        }
        else if (n5 == 1) {
            textPaint.setTextAlign(Paint$Align.CENTER);
        }
        else {
            textPaint.setTextAlign(Paint$Align.RIGHT);
        }
        if ((n2 & 0x10) == 0x10) {
            textPaint.setUnderlineText(true);
        }
        if ((n2 & 0x20) == 0x20) {
            textPaint.setStrikeThruText(true);
        }
        if ((n2 & 0x4) == 0x4) {
            textPaint.setTextSkewX(-top / 90.0f);
        }
        if ((n2 & 0x8) == 0x8) {
            textPaint.setFakeBoldText(true);
        }
        if ((n2 & 0x2) == 0x2) {
            textPaint.setShadowLayer(bottom, letterSpacing2, n3, n4);
        }
        final Paint$FontMetrics fontMetrics = textPaint.getFontMetrics();
        top = fontMetrics.top;
        bottom = fontMetrics.bottom;
        final String[] split = s2.split("\n");
        length = split.length;
        if ((n2 & 0x1) == 0x1) {
            final TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(color);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint$Style.STROKE);
            textPaint2.setStrokeWidth(5.0f * letterSpacing / textSize);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            letterSpacing2 = n / textSize;
            letterSpacing = -fontMetrics.ascent + fontMetrics.descent;
            for (i = 0; i < length; ++i) {
                n2 = (int)((int)(rect.centerY() - top / 2.0f - bottom / 2.0f) - ((length - 1) * 0.5 - i) * (letterSpacing * 0.1f + letterSpacing));
                textPaint2.setLetterSpacing(letterSpacing2);
                if (n5 == 0) {
                    canvas.drawText(split[i], (float)rect.left, (float)n2, (Paint)textPaint2);
                }
                else if (n5 == 1) {
                    canvas.drawText(split[i], (float)rect.centerX(), (float)n2, (Paint)textPaint2);
                }
                else {
                    canvas.drawText(split[i], (float)rect.right, (float)n2, (Paint)textPaint2);
                }
            }
        }
        letterSpacing = n / textSize;
        letterSpacing2 = -fontMetrics.ascent + fontMetrics.descent;
        for (i = 0; i < length; ++i) {
            n = (int)((int)(rect.centerY() - top / 2.0f - bottom / 2.0f) - ((length - 1) * 0.5 - i) * (0.1f * letterSpacing2 + letterSpacing2));
            textPaint.setLetterSpacing(letterSpacing);
            if (n5 == 0) {
                canvas.drawText(split[i], (float)rect.left, (float)n, (Paint)textPaint);
            }
            else if (n5 == 1) {
                canvas.drawText(split[i], (float)rect.centerX(), (float)n, (Paint)textPaint);
            }
            else {
                canvas.drawText(split[i], (float)rect.right, (float)n, (Paint)textPaint);
            }
        }
        canvas.save();
        canvas.restore();
        MethodCollector.o(8097);
        return bitmap;
    }
    
    public static Bitmap generateImage(final String s, float n, final byte[] array, final int color, final boolean b, float n2, final int color2, final boolean b2, float n3, float n4, final int n5, float n6) {
        MethodCollector.i(2526);
        final String s2 = new String(array);
        final TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(n);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint$Style.FILL);
        textPaint.setTextAlign(Paint$Align.LEFT);
        textPaint.setColor(color);
        final Rect rect = new Rect();
        textPaint.getTextWidths(s2, new float[s2.length()]);
        textPaint.getTextBounds(s2, 0, s2.length(), rect);
        final float n7 = 0.0f;
        if (!b) {
            n2 = 0.0f;
        }
        if (!b2) {
            n4 = 0.0f;
            n6 = 0.0f;
            n3 = n7;
        }
        final float n8 = Math.max(Math.abs(n3), Math.abs(n4)) + n2;
        final TextPaint textPaint2 = new TextPaint();
        if (b || b2) {
            textPaint2.setTextSize(n);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint$Style.STROKE);
            textPaint2.setTextAlign(Paint$Align.LEFT);
            textPaint2.setStrokeWidth(n2 * 2.0f * n);
            textPaint2.setColor(color2);
            if (b2) {
                textPaint2.setShadowLayer(n6 * n, n3 * n, n4 * n, n5);
            }
        }
        n2 = (float)rect.width();
        n3 = 2.0f * n8 * n;
        final Bitmap bitmap = Bitmap.createBitmap((int)(n2 + n3), (int)(rect.height() + n3), Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        if (b || b2) {
            n3 = (float)(-rect.left);
            n2 = n8 * n;
            canvas.drawText(s2, n3 + n2, -rect.top + n2, (Paint)textPaint2);
        }
        n2 = (float)(-rect.left);
        n *= n8;
        canvas.drawText(s2, n2 + n, -rect.top + n, (Paint)textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.o(2526);
        return bitmap;
    }
    
    public static float[] generateImageSize(final String s, final float textSize, final byte[] array, final int color, final boolean b, float n, final int n2, final boolean b2, float max, float n3, final int n4, final float n5) {
        final String s2 = new String(array);
        final TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(textSize);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint$Style.FILL);
        textPaint.setTextAlign(Paint$Align.LEFT);
        textPaint.setColor(color);
        final Rect rect = new Rect();
        final float[] array2 = new float[s2.length()];
        textPaint.getTextWidths(s2, array2);
        textPaint.getTextBounds(s2, 0, s2.length(), rect);
        if (!b) {
            n = 0.0f;
        }
        if (!b2) {
            max = 0.0f;
            n3 = 0.0f;
        }
        max = Math.max(Math.abs(max), Math.abs(n3));
        return new float[] { (float)rect.left, (float)rect.right, (float)(-rect.bottom), (float)(-rect.top), array2[0], (n + max) * textSize, textPaint.ascent(), textPaint.descent() };
    }
    
    public static String[] getAndroidSystemFontPaths() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: invokestatic    android/util/Xml.newPullParser:()Lorg/xmlpull/v1/XmlPullParser;
        //     9: astore_0       
        //    10: new             Ljava/io/File;
        //    13: astore_1       
        //    14: aload_1        
        //    15: ldc             "/system/etc/fonts.xml"
        //    17: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    20: new             Ljava/io/FileInputStream;
        //    23: astore_2       
        //    24: aload_2        
        //    25: aload_1        
        //    26: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    29: aload_0        
        //    30: aload_2        
        //    31: ldc_w           "utf-8"
        //    34: invokeinterface org/xmlpull/v1/XmlPullParser.setInput:(Ljava/io/InputStream;Ljava/lang/String;)V
        //    39: aload_0        
        //    40: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //    45: istore_3       
        //    46: new             Ljava/util/ArrayList;
        //    49: astore          4
        //    51: aload           4
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: new             Ljava/util/ArrayList;
        //    59: astore          5
        //    61: aload           5
        //    63: invokespecial   java/util/ArrayList.<init>:()V
        //    66: aconst_null    
        //    67: astore          6
        //    69: iload_3        
        //    70: iconst_1       
        //    71: if_icmpeq       344
        //    74: iload_3        
        //    75: iconst_2       
        //    76: if_icmpeq       293
        //    79: iload_3        
        //    80: iconst_3       
        //    81: if_icmpeq       95
        //    84: iload_3        
        //    85: iconst_4       
        //    86: if_icmpeq       324
        //    89: aload           6
        //    91: astore_1       
        //    92: goto            331
        //    95: ldc_w           "family"
        //    98: aload_0        
        //    99: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   104: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   107: ifeq            237
        //   110: iconst_m1      
        //   111: istore          7
        //   113: iconst_0       
        //   114: istore_3       
        //   115: iload           7
        //   117: istore          8
        //   119: iload_3        
        //   120: aload           5
        //   122: invokeinterface java/util/List.size:()I
        //   127: if_icmpge       162
        //   130: aload           5
        //   132: iload_3        
        //   133: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   138: checkcast       Ljava/lang/String;
        //   141: ldc_w           "Regular"
        //   144: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   147: ifeq            153
        //   150: goto            159
        //   153: iinc            3, 1
        //   156: goto            115
        //   159: iload_3        
        //   160: istore          8
        //   162: new             Ljava/lang/String;
        //   165: astore_1       
        //   166: aload_1        
        //   167: ldc_w           "/system/fonts/"
        //   170: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   173: iload           8
        //   175: iflt            208
        //   178: aload           4
        //   180: aload_1        
        //   181: aload           5
        //   183: iload           8
        //   185: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   190: checkcast       Ljava/lang/String;
        //   193: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   196: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   201: pop            
        //   202: aload           6
        //   204: astore_1       
        //   205: goto            331
        //   208: aload           4
        //   210: aload_1        
        //   211: aload           5
        //   213: iconst_0       
        //   214: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   219: checkcast       Ljava/lang/String;
        //   222: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   225: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   230: pop            
        //   231: aload           6
        //   233: astore_1       
        //   234: goto            331
        //   237: ldc_w           "font"
        //   240: aload_0        
        //   241: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   246: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   249: ifeq            268
        //   252: aload           5
        //   254: aload           6
        //   256: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   261: pop            
        //   262: aload           6
        //   264: astore_1       
        //   265: goto            331
        //   268: aload           6
        //   270: astore_1       
        //   271: ldc_w           "familyset"
        //   274: aload_0        
        //   275: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   280: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   283: ifeq            331
        //   286: ldc_w           "ending"
        //   289: astore_1       
        //   290: goto            331
        //   293: aload           6
        //   295: astore_1       
        //   296: ldc_w           "family"
        //   299: aload_0        
        //   300: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   305: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   308: ifeq            331
        //   311: aload           5
        //   313: invokeinterface java/util/List.clear:()V
        //   318: aload           6
        //   320: astore_1       
        //   321: goto            331
        //   324: aload_0        
        //   325: invokeinterface org/xmlpull/v1/XmlPullParser.getText:()Ljava/lang/String;
        //   330: astore_1       
        //   331: aload_0        
        //   332: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   337: istore_3       
        //   338: aload_1        
        //   339: astore          6
        //   341: goto            69
        //   344: aload           4
        //   346: invokeinterface java/util/List.size:()I
        //   351: anewarray       Ljava/lang/String;
        //   354: astore_1       
        //   355: aload           4
        //   357: aload_1        
        //   358: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   363: pop            
        //   364: aload_2        
        //   365: invokevirtual   java/io/FileInputStream.close:()V
        //   368: sipush          2603
        //   371: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   374: aload_1        
        //   375: areturn        
        //   376: astore_1       
        //   377: aconst_null    
        //   378: astore_2       
        //   379: goto            383
        //   382: astore_1       
        //   383: aload_2        
        //   384: ifnull          391
        //   387: aload_2        
        //   388: invokevirtual   java/io/FileInputStream.close:()V
        //   391: sipush          2603
        //   394: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   397: aload_1        
        //   398: athrow         
        //   399: astore_1       
        //   400: aconst_null    
        //   401: astore_2       
        //   402: aload_2        
        //   403: ifnull          410
        //   406: aload_2        
        //   407: invokevirtual   java/io/FileInputStream.close:()V
        //   410: sipush          2603
        //   413: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   416: aconst_null    
        //   417: areturn        
        //   418: astore_1       
        //   419: goto            402
        //   422: astore_2       
        //   423: goto            368
        //   426: astore_2       
        //   427: goto            391
        //   430: astore_1       
        //   431: goto            410
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      29     399    402    Ljava/lang/Exception;
        //  6      29     376    382    Any
        //  29     66     418    422    Ljava/lang/Exception;
        //  29     66     382    383    Any
        //  95     110    418    422    Ljava/lang/Exception;
        //  95     110    382    383    Any
        //  119    150    418    422    Ljava/lang/Exception;
        //  119    150    382    383    Any
        //  162    173    418    422    Ljava/lang/Exception;
        //  162    173    382    383    Any
        //  178    202    418    422    Ljava/lang/Exception;
        //  178    202    382    383    Any
        //  208    231    418    422    Ljava/lang/Exception;
        //  208    231    382    383    Any
        //  237    262    418    422    Ljava/lang/Exception;
        //  237    262    382    383    Any
        //  271    286    418    422    Ljava/lang/Exception;
        //  271    286    382    383    Any
        //  296    318    418    422    Ljava/lang/Exception;
        //  296    318    382    383    Any
        //  324    331    418    422    Ljava/lang/Exception;
        //  324    331    382    383    Any
        //  331    338    418    422    Ljava/lang/Exception;
        //  331    338    382    383    Any
        //  344    364    418    422    Ljava/lang/Exception;
        //  344    364    382    383    Any
        //  364    368    422    426    Ljava/lang/Exception;
        //  387    391    426    430    Ljava/lang/Exception;
        //  406    410    430    434    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 193, Size: 193
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
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
    
    public static float getDeviceDpi() {
        return (float)Resources.getSystem().getDisplayMetrics().densityDpi;
    }
}
