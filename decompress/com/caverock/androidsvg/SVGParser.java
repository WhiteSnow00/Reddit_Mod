// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

import org.xml.sax.ext.DefaultHandler2;
import b5.k;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import org.xml.sax.XMLReader;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.ContentHandler;
import javax.xml.parsers.SAXParserFactory;
import android.util.Log;
import java.io.InputStream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Collection;
import java.util.HashSet;
import org.xml.sax.Attributes;
import android.graphics.Matrix;
import java.util.HashMap;

public final class SVGParser
{
    public SVG a;
    public SVG.h0 b;
    public boolean c;
    public int d;
    public boolean e;
    public SVGElem f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;
    
    public SVGParser() {
        this.a = null;
        this.b = null;
        this.c = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
    }
    
    public static SVG.m0 A(final String s) {
        if (!s.startsWith("url(")) {
            return q(s);
        }
        final int index = s.indexOf(")");
        final SVG.m0 m0 = null;
        if (index != -1) {
            final String trim = s.substring(4, index).trim();
            final String trim2 = s.substring(index + 1).trim();
            SVG.m0 q = m0;
            if (trim2.length() > 0) {
                q = q(trim2);
            }
            return (SVG.m0)new SVG$t(trim, q);
        }
        return (SVG.m0)new SVG$t(s.substring(4).trim(), (SVG.m0)null);
    }
    
    public static void B(final SVG$n0 svg$n0, final String s) throws SVGParseException {
        final g g = new g(s);
        g.q();
        String s2;
        if ("defer".equals(s2 = g.l())) {
            g.q();
            s2 = g.l();
        }
        final PreserveAspectRatio.Alignment alignment = b.a.get(s2);
        PreserveAspectRatio.Scale scale = null;
        g.q();
        if (!g.f()) {
            final String l = g.l();
            l.getClass();
            if (!l.equals("meet")) {
                if (!l.equals("slice")) {
                    throw new SVGParseException(b.l("Invalid preserveAspectRatio definition: ", s));
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
            else {
                scale = PreserveAspectRatio.Scale.meet;
            }
        }
        svg$n0.o = new PreserveAspectRatio(alignment, scale);
    }
    
    public static HashMap C(final g g) {
        final HashMap hashMap = new HashMap();
        g.q();
        for (String s = g.m('=', false); s != null; s = g.m('=', false)) {
            g.d('=');
            hashMap.put(s, g.k());
            g.q();
        }
        return hashMap;
    }
    
    public static Matrix D(final String s) throws SVGParseException {
        final Matrix matrix = new Matrix();
        final g g = new g(s);
        g.q();
        while (!g.f()) {
            final boolean f = g.f();
            String substring = null;
            if (!f) {
                final int b = g.b;
                int n;
                for (n = g.a.charAt(b); (n >= 97 && n <= 122) || (n >= 65 && n <= 90); n = g.a()) {}
                final int b2 = g.b;
                while (SVGParser.g.g(n)) {
                    n = g.a();
                }
                if (n == 40) {
                    ++g.b;
                    substring = g.a.substring(b, b2);
                }
                else {
                    g.b = b;
                }
            }
            if (substring == null) {
                throw new SVGParseException(b.l("Bad transform function encountered in transform list: ", s));
            }
            int n2 = -1;
            switch (substring) {
                case "translate": {
                    n2 = 5;
                    break;
                }
                case "skewY": {
                    n2 = 4;
                    break;
                }
                case "skewX": {
                    n2 = 3;
                    break;
                }
                case "scale": {
                    n2 = 2;
                    break;
                }
                case "rotate": {
                    n2 = 1;
                    break;
                }
                case "matrix": {
                    n2 = 0;
                    break;
                }
                default:
                    break;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                if (n2 != 5) {
                                    throw new SVGParseException(a.n("Invalid transform list fn: ", substring, ")"));
                                }
                                g.q();
                                final float i = g.i();
                                final float o = g.o();
                                g.q();
                                if (Float.isNaN(i) || !g.d(')')) {
                                    throw new SVGParseException(b.l("Invalid transform list: ", s));
                                }
                                if (Float.isNaN(o)) {
                                    matrix.preTranslate(i, 0.0f);
                                }
                                else {
                                    matrix.preTranslate(i, o);
                                }
                            }
                            else {
                                g.q();
                                final float j = g.i();
                                g.q();
                                if (Float.isNaN(j) || !g.d(')')) {
                                    throw new SVGParseException(b.l("Invalid transform list: ", s));
                                }
                                matrix.preSkew(0.0f, (float)Math.tan(Math.toRadians(j)));
                            }
                        }
                        else {
                            g.q();
                            final float k = g.i();
                            g.q();
                            if (Float.isNaN(k) || !g.d(')')) {
                                throw new SVGParseException(b.l("Invalid transform list: ", s));
                            }
                            matrix.preSkew((float)Math.tan(Math.toRadians(k)), 0.0f);
                        }
                    }
                    else {
                        g.q();
                        final float l = g.i();
                        final float o2 = g.o();
                        g.q();
                        if (Float.isNaN(l) || !g.d(')')) {
                            throw new SVGParseException(b.l("Invalid transform list: ", s));
                        }
                        if (Float.isNaN(o2)) {
                            matrix.preScale(l, l);
                        }
                        else {
                            matrix.preScale(l, o2);
                        }
                    }
                }
                else {
                    g.q();
                    final float m = g.i();
                    final float o3 = g.o();
                    final float o4 = g.o();
                    g.q();
                    if (Float.isNaN(m) || !g.d(')')) {
                        throw new SVGParseException(b.l("Invalid transform list: ", s));
                    }
                    if (Float.isNaN(o3)) {
                        matrix.preRotate(m);
                    }
                    else {
                        if (Float.isNaN(o4)) {
                            throw new SVGParseException(b.l("Invalid transform list: ", s));
                        }
                        matrix.preRotate(m, o3, o4);
                    }
                }
            }
            else {
                g.q();
                final float i2 = g.i();
                g.p();
                final float i3 = g.i();
                g.p();
                final float i4 = g.i();
                g.p();
                final float i5 = g.i();
                g.p();
                final float i6 = g.i();
                g.p();
                final float i7 = g.i();
                g.q();
                if (Float.isNaN(i7) || !g.d(')')) {
                    throw new SVGParseException(b.l("Invalid transform list: ", s));
                }
                final Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[] { i2, i4, i6, i3, i5, i7, 0.0f, 0.0f, 1.0f });
                matrix.preConcat(matrix2);
            }
            if (g.f()) {
                break;
            }
            g.p();
        }
        return matrix;
    }
    
    public static void H(final SVG.Style p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/String.length:()I
        //     4: ifne            8
        //     7: return         
        //     8: aload_2        
        //     9: ldc_w           "inherit"
        //    12: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    15: ifeq            19
        //    18: return         
        //    19: getstatic       com/caverock/androidsvg/SVGParser$a.b:[I
        //    22: aload_1        
        //    23: invokestatic    com/caverock/androidsvg/SVGParser$SVGAttr.fromString:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVGParser$SVGAttr;
        //    26: invokevirtual   java/lang/Enum.ordinal:()I
        //    29: iaload         
        //    30: istore          7
        //    32: iconst_2       
        //    33: istore          4
        //    35: aconst_null    
        //    36: astore          16
        //    38: aconst_null    
        //    39: astore          17
        //    41: aconst_null    
        //    42: astore_1       
        //    43: aconst_null    
        //    44: astore          14
        //    46: aconst_null    
        //    47: astore          11
        //    49: aconst_null    
        //    50: astore          10
        //    52: aconst_null    
        //    53: astore          19
        //    55: aconst_null    
        //    56: astore          9
        //    58: aconst_null    
        //    59: astore          12
        //    61: aconst_null    
        //    62: astore          8
        //    64: aconst_null    
        //    65: astore          18
        //    67: aconst_null    
        //    68: astore          13
        //    70: aconst_null    
        //    71: astore          15
        //    73: aconst_null    
        //    74: astore          20
        //    76: iconst_0       
        //    77: istore          5
        //    79: iconst_0       
        //    80: istore          6
        //    82: iload           7
        //    84: tableswitch {
        //               94: 3117
        //               95: 3059
        //               96: 3030
        //               97: 3001
        //               98: 2972
        //               99: 2949
        //              100: 2874
        //              101: 2799
        //              102: 2773
        //              103: 2553
        //              104: 2530
        //              105: 2507
        //              106: 2484
        //              107: 2086
        //              108: 2057
        //              109: 2010
        //              110: 1975
        //              111: 1946
        //              112: 1693
        //              113: 1632
        //              114: 1461
        //              115: 1261
        //              116: 1226
        //              117: 1203
        //              118: 1180
        //              119: 1157
        //              120: 1073
        //              121: 991
        //              122: 933
        //              123: 910
        //              124: 755
        //              125: 732
        //              126: 678
        //              127: 655
        //              128: 597
        //              129: 574
        //              130: 516
        //              131: 493
        //              132: 432
        //              133: 263
        //          default: 260
        //        }
        //   260: goto            3141
        //   263: aload_2        
        //   264: invokevirtual   java/lang/String.hashCode:()I
        //   267: lookupswitch {
        //          -933002398: 338
        //          3005871: 319
        //          362741610: 306
        //          default: 300
        //        }
        //   300: iconst_m1      
        //   301: istore          4
        //   303: goto            354
        //   306: aload_2        
        //   307: ldc_w           "optimizeSpeed"
        //   310: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   313: ifne            354
        //   316: goto            300
        //   319: aload_2        
        //   320: ldc_w           "auto"
        //   323: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   326: ifne            332
        //   329: goto            300
        //   332: iconst_1       
        //   333: istore          4
        //   335: goto            354
        //   338: aload_2        
        //   339: ldc_w           "optimizeQuality"
        //   342: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   345: ifne            351
        //   348: goto            300
        //   351: iconst_0       
        //   352: istore          4
        //   354: iload           4
        //   356: tableswitch {
        //                0: 404
        //                1: 397
        //                2: 390
        //          default: 384
        //        }
        //   384: aload           20
        //   386: astore_1       
        //   387: goto            408
        //   390: getstatic       com/caverock/androidsvg/SVG$Style$RenderQuality.optimizeSpeed:Lcom/caverock/androidsvg/SVG$Style$RenderQuality;
        //   393: astore_1       
        //   394: goto            408
        //   397: getstatic       com/caverock/androidsvg/SVG$Style$RenderQuality.auto:Lcom/caverock/androidsvg/SVG$Style$RenderQuality;
        //   400: astore_1       
        //   401: goto            408
        //   404: getstatic       com/caverock/androidsvg/SVG$Style$RenderQuality.optimizeQuality:Lcom/caverock/androidsvg/SVG$Style$RenderQuality;
        //   407: astore_1       
        //   408: aload_0        
        //   409: aload_1        
        //   410: putfield        com/caverock/androidsvg/SVG$Style.R:Lcom/caverock/androidsvg/SVG$Style$RenderQuality;
        //   413: aload_1        
        //   414: ifnull          3141
        //   417: aload_0        
        //   418: aload_0        
        //   419: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   422: ldc2_w          137438953472
        //   425: lor            
        //   426: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   429: goto            3141
        //   432: aload_2        
        //   433: ldc_w           "none"
        //   436: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   439: ifne            465
        //   442: aload_2        
        //   443: ldc_w           "non-scaling-stroke"
        //   446: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   449: ifne            458
        //   452: aload           16
        //   454: astore_1       
        //   455: goto            469
        //   458: getstatic       com/caverock/androidsvg/SVG$Style$VectorEffect.NonScalingStroke:Lcom/caverock/androidsvg/SVG$Style$VectorEffect;
        //   461: astore_1       
        //   462: goto            469
        //   465: getstatic       com/caverock/androidsvg/SVG$Style$VectorEffect.None:Lcom/caverock/androidsvg/SVG$Style$VectorEffect;
        //   468: astore_1       
        //   469: aload_0        
        //   470: aload_1        
        //   471: putfield        com/caverock/androidsvg/SVG$Style.Q:Lcom/caverock/androidsvg/SVG$Style$VectorEffect;
        //   474: aload_1        
        //   475: ifnull          3141
        //   478: aload_0        
        //   479: aload_0        
        //   480: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   483: ldc2_w          34359738368
        //   486: lor            
        //   487: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   490: goto            3141
        //   493: aload_0        
        //   494: aload_2        
        //   495: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //   498: putfield        com/caverock/androidsvg/SVG$Style.P:Ljava/lang/Float;
        //   501: aload_0        
        //   502: aload_0        
        //   503: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   506: ldc2_w          17179869184
        //   509: lor            
        //   510: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   513: goto            3141
        //   516: aload_2        
        //   517: ldc_w           "currentColor"
        //   520: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   523: ifeq            536
        //   526: aload_0        
        //   527: getstatic       com/caverock/androidsvg/SVG$g.f:Lcom/caverock/androidsvg/SVG$g;
        //   530: putfield        com/caverock/androidsvg/SVG$Style.O:Lcom/caverock/androidsvg/SVG$m0;
        //   533: goto            544
        //   536: aload_0        
        //   537: aload_2        
        //   538: invokestatic    com/caverock/androidsvg/SVGParser.p:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$f;
        //   541: putfield        com/caverock/androidsvg/SVG$Style.O:Lcom/caverock/androidsvg/SVG$m0;
        //   544: aload_0        
        //   545: aload_0        
        //   546: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   549: ldc2_w          8589934592
        //   552: lor            
        //   553: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   556: goto            3141
        //   559: astore_0       
        //   560: ldc_w           "SVGParser"
        //   563: aload_0        
        //   564: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   567: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   570: pop            
        //   571: goto            3141
        //   574: aload_0        
        //   575: aload_2        
        //   576: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //   579: putfield        com/caverock/androidsvg/SVG$Style.N:Ljava/lang/Float;
        //   582: aload_0        
        //   583: aload_0        
        //   584: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   587: ldc2_w          4294967296
        //   590: lor            
        //   591: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   594: goto            3141
        //   597: aload_2        
        //   598: ldc_w           "currentColor"
        //   601: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   604: ifeq            617
        //   607: aload_0        
        //   608: getstatic       com/caverock/androidsvg/SVG$g.f:Lcom/caverock/androidsvg/SVG$g;
        //   611: putfield        com/caverock/androidsvg/SVG$Style.M:Lcom/caverock/androidsvg/SVG$m0;
        //   614: goto            625
        //   617: aload_0        
        //   618: aload_2        
        //   619: invokestatic    com/caverock/androidsvg/SVGParser.p:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$f;
        //   622: putfield        com/caverock/androidsvg/SVG$Style.M:Lcom/caverock/androidsvg/SVG$m0;
        //   625: aload_0        
        //   626: aload_0        
        //   627: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   630: ldc2_w          2147483648
        //   633: lor            
        //   634: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   637: goto            3141
        //   640: astore_0       
        //   641: ldc_w           "SVGParser"
        //   644: aload_0        
        //   645: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   648: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   651: pop            
        //   652: goto            3141
        //   655: aload_0        
        //   656: aload_2        
        //   657: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //   660: putfield        com/caverock/androidsvg/SVG$Style.L:Ljava/lang/String;
        //   663: aload_0        
        //   664: aload_0        
        //   665: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   668: ldc2_w          1073741824
        //   671: lor            
        //   672: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   675: goto            3141
        //   678: ldc_w           "nonzero"
        //   681: aload_2        
        //   682: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   685: ifeq            695
        //   688: getstatic       com/caverock/androidsvg/SVG$Style$FillRule.NonZero:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //   691: astore_1       
        //   692: goto            712
        //   695: aload           17
        //   697: astore_1       
        //   698: ldc_w           "evenodd"
        //   701: aload_2        
        //   702: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   705: ifeq            712
        //   708: getstatic       com/caverock/androidsvg/SVG$Style$FillRule.EvenOdd:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //   711: astore_1       
        //   712: aload_0        
        //   713: aload_1        
        //   714: putfield        com/caverock/androidsvg/SVG$Style.K:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //   717: aload_0        
        //   718: aload_0        
        //   719: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   722: ldc2_w          536870912
        //   725: lor            
        //   726: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   729: goto            3141
        //   732: aload_0        
        //   733: aload_2        
        //   734: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //   737: putfield        com/caverock/androidsvg/SVG$Style.J:Ljava/lang/String;
        //   740: aload_0        
        //   741: aload_0        
        //   742: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   745: ldc2_w          268435456
        //   748: lor            
        //   749: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   752: goto            3141
        //   755: ldc_w           "auto"
        //   758: aload_2        
        //   759: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   762: ifeq            768
        //   765: goto            886
        //   768: aload_2        
        //   769: ldc_w           "rect("
        //   772: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   775: ifne            781
        //   778: goto            886
        //   781: new             Lcom/caverock/androidsvg/SVGParser$g;
        //   784: dup            
        //   785: aload_2        
        //   786: iconst_5       
        //   787: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   790: invokespecial   com/caverock/androidsvg/SVGParser$g.<init>:(Ljava/lang/String;)V
        //   793: astore          8
        //   795: aload           8
        //   797: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //   800: aload           8
        //   802: invokestatic    com/caverock/androidsvg/SVGParser.y:(Lcom/caverock/androidsvg/SVGParser$g;)Lcom/caverock/androidsvg/SVG$o;
        //   805: astore          10
        //   807: aload           8
        //   809: invokevirtual   com/caverock/androidsvg/SVGParser$g.p:()Z
        //   812: pop            
        //   813: aload           8
        //   815: invokestatic    com/caverock/androidsvg/SVGParser.y:(Lcom/caverock/androidsvg/SVGParser$g;)Lcom/caverock/androidsvg/SVG$o;
        //   818: astore          9
        //   820: aload           8
        //   822: invokevirtual   com/caverock/androidsvg/SVGParser$g.p:()Z
        //   825: pop            
        //   826: aload           8
        //   828: invokestatic    com/caverock/androidsvg/SVGParser.y:(Lcom/caverock/androidsvg/SVGParser$g;)Lcom/caverock/androidsvg/SVG$o;
        //   831: astore_2       
        //   832: aload           8
        //   834: invokevirtual   com/caverock/androidsvg/SVGParser$g.p:()Z
        //   837: pop            
        //   838: aload           8
        //   840: invokestatic    com/caverock/androidsvg/SVGParser.y:(Lcom/caverock/androidsvg/SVGParser$g;)Lcom/caverock/androidsvg/SVG$o;
        //   843: astore          11
        //   845: aload           8
        //   847: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //   850: aload           8
        //   852: bipush          41
        //   854: invokevirtual   com/caverock/androidsvg/SVGParser$g.d:(C)Z
        //   857: ifne            871
        //   860: aload           8
        //   862: invokevirtual   com/caverock/androidsvg/SVGParser$g.f:()Z
        //   865: ifne            871
        //   868: goto            886
        //   871: new             Lcom/caverock/androidsvg/SVG$c;
        //   874: dup            
        //   875: aload           10
        //   877: aload           9
        //   879: aload_2        
        //   880: aload           11
        //   882: invokespecial   com/caverock/androidsvg/SVG$c.<init>:(Lcom/caverock/androidsvg/SVG$o;Lcom/caverock/androidsvg/SVG$o;Lcom/caverock/androidsvg/SVG$o;Lcom/caverock/androidsvg/SVG$o;)V
        //   885: astore_1       
        //   886: aload_0        
        //   887: aload_1        
        //   888: putfield        com/caverock/androidsvg/SVG$Style.B:Lcom/caverock/androidsvg/SVG$c;
        //   891: aload_1        
        //   892: ifnull          3141
        //   895: aload_0        
        //   896: aload_0        
        //   897: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   900: ldc2_w          1048576
        //   903: lor            
        //   904: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   907: goto            3141
        //   910: aload_0        
        //   911: aload_2        
        //   912: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //   915: putfield        com/caverock/androidsvg/SVG$Style.I:Ljava/lang/Float;
        //   918: aload_0        
        //   919: aload_0        
        //   920: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   923: ldc2_w          134217728
        //   926: lor            
        //   927: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   930: goto            3141
        //   933: aload_2        
        //   934: ldc_w           "currentColor"
        //   937: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   940: ifeq            953
        //   943: aload_0        
        //   944: getstatic       com/caverock/androidsvg/SVG$g.f:Lcom/caverock/androidsvg/SVG$g;
        //   947: putfield        com/caverock/androidsvg/SVG$Style.H:Lcom/caverock/androidsvg/SVG$m0;
        //   950: goto            961
        //   953: aload_0        
        //   954: aload_2        
        //   955: invokestatic    com/caverock/androidsvg/SVGParser.p:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$f;
        //   958: putfield        com/caverock/androidsvg/SVG$Style.H:Lcom/caverock/androidsvg/SVG$m0;
        //   961: aload_0        
        //   962: aload_0        
        //   963: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //   966: ldc2_w          67108864
        //   969: lor            
        //   970: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //   973: goto            3141
        //   976: astore_0       
        //   977: ldc_w           "SVGParser"
        //   980: aload_0        
        //   981: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   984: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   987: pop            
        //   988: goto            3141
        //   991: aload_2        
        //   992: bipush          124
        //   994: invokevirtual   java/lang/String.indexOf:(I)I
        //   997: ifge            3141
        //  1000: new             Ljava/lang/StringBuilder;
        //  1003: dup            
        //  1004: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1007: astore_1       
        //  1008: aload_1        
        //  1009: bipush          124
        //  1011: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1014: pop            
        //  1015: aload_1        
        //  1016: aload_2        
        //  1017: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1020: pop            
        //  1021: aload_1        
        //  1022: bipush          124
        //  1024: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1027: pop            
        //  1028: ldc_w           "|visible|hidden|collapse|"
        //  1031: aload_1        
        //  1032: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1035: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1038: ifne            1044
        //  1041: goto            3141
        //  1044: aload_0        
        //  1045: aload_2        
        //  1046: ldc_w           "visible"
        //  1049: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1052: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1055: putfield        com/caverock/androidsvg/SVG$Style.G:Ljava/lang/Boolean;
        //  1058: aload_0        
        //  1059: aload_0        
        //  1060: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1063: ldc2_w          33554432
        //  1066: lor            
        //  1067: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1070: goto            3141
        //  1073: aload_2        
        //  1074: bipush          124
        //  1076: invokevirtual   java/lang/String.indexOf:(I)I
        //  1079: ifge            3141
        //  1082: new             Ljava/lang/StringBuilder;
        //  1085: dup            
        //  1086: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1089: astore_1       
        //  1090: aload_1        
        //  1091: bipush          124
        //  1093: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1096: pop            
        //  1097: aload_1        
        //  1098: aload_2        
        //  1099: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1102: pop            
        //  1103: aload_1        
        //  1104: bipush          124
        //  1106: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1109: pop            
        //  1110: ldc_w           "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
        //  1113: aload_1        
        //  1114: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1117: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  1120: ifne            1126
        //  1123: goto            3141
        //  1126: aload_0        
        //  1127: aload_2        
        //  1128: ldc_w           "none"
        //  1131: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1134: iconst_1       
        //  1135: ixor           
        //  1136: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1139: putfield        com/caverock/androidsvg/SVG$Style.F:Ljava/lang/Boolean;
        //  1142: aload_0        
        //  1143: aload_0        
        //  1144: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1147: ldc2_w          16777216
        //  1150: lor            
        //  1151: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1154: goto            3141
        //  1157: aload_0        
        //  1158: aload_2        
        //  1159: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //  1162: putfield        com/caverock/androidsvg/SVG$Style.E:Ljava/lang/String;
        //  1165: aload_0        
        //  1166: aload_0        
        //  1167: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1170: ldc2_w          8388608
        //  1173: lor            
        //  1174: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1177: goto            3141
        //  1180: aload_0        
        //  1181: aload_2        
        //  1182: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //  1185: putfield        com/caverock/androidsvg/SVG$Style.D:Ljava/lang/String;
        //  1188: aload_0        
        //  1189: aload_0        
        //  1190: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1193: ldc2_w          4194304
        //  1196: lor            
        //  1197: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1200: goto            3141
        //  1203: aload_0        
        //  1204: aload_2        
        //  1205: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //  1208: putfield        com/caverock/androidsvg/SVG$Style.C:Ljava/lang/String;
        //  1211: aload_0        
        //  1212: aload_0        
        //  1213: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1216: ldc2_w          2097152
        //  1219: lor            
        //  1220: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1223: goto            3141
        //  1226: aload_2        
        //  1227: invokestatic    com/caverock/androidsvg/SVGParser.v:(Ljava/lang/String;)Ljava/lang/String;
        //  1230: astore_1       
        //  1231: aload_0        
        //  1232: aload_1        
        //  1233: putfield        com/caverock/androidsvg/SVG$Style.C:Ljava/lang/String;
        //  1236: aload_0        
        //  1237: aload_1        
        //  1238: putfield        com/caverock/androidsvg/SVG$Style.D:Ljava/lang/String;
        //  1241: aload_0        
        //  1242: aload_1        
        //  1243: putfield        com/caverock/androidsvg/SVG$Style.E:Ljava/lang/String;
        //  1246: aload_0        
        //  1247: aload_0        
        //  1248: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1251: ldc2_w          14680064
        //  1254: lor            
        //  1255: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1258: goto            3141
        //  1261: aload_2        
        //  1262: invokevirtual   java/lang/String.hashCode:()I
        //  1265: lookupswitch {
        //          -1217487446: 1371
        //          -907680051: 1352
        //          3005871: 1333
        //          466743410: 1314
        //          default: 1308
        //        }
        //  1308: iconst_m1      
        //  1309: istore          4
        //  1311: goto            1388
        //  1314: aload_2        
        //  1315: ldc_w           "visible"
        //  1318: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1321: ifne            1327
        //  1324: goto            1308
        //  1327: iconst_3       
        //  1328: istore          4
        //  1330: goto            1388
        //  1333: aload_2        
        //  1334: ldc_w           "auto"
        //  1337: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1340: ifne            1346
        //  1343: goto            1308
        //  1346: iconst_2       
        //  1347: istore          4
        //  1349: goto            1388
        //  1352: aload_2        
        //  1353: ldc_w           "scroll"
        //  1356: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1359: ifne            1365
        //  1362: goto            1308
        //  1365: iconst_1       
        //  1366: istore          4
        //  1368: goto            1388
        //  1371: iload           6
        //  1373: istore          4
        //  1375: aload_2        
        //  1376: ldc_w           "hidden"
        //  1379: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1382: ifne            1388
        //  1385: goto            1308
        //  1388: iload           4
        //  1390: tableswitch {
        //                0: 1433
        //                1: 1433
        //                2: 1426
        //                3: 1426
        //          default: 1420
        //        }
        //  1420: aload           14
        //  1422: astore_1       
        //  1423: goto            1437
        //  1426: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //  1429: astore_1       
        //  1430: goto            1437
        //  1433: getstatic       java/lang/Boolean.FALSE:Ljava/lang/Boolean;
        //  1436: astore_1       
        //  1437: aload_0        
        //  1438: aload_1        
        //  1439: putfield        com/caverock/androidsvg/SVG$Style.A:Ljava/lang/Boolean;
        //  1442: aload_1        
        //  1443: ifnull          3141
        //  1446: aload_0        
        //  1447: aload_0        
        //  1448: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1451: ldc2_w          524288
        //  1454: lor            
        //  1455: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1458: goto            3141
        //  1461: aload_2        
        //  1462: invokevirtual   java/lang/String.hashCode:()I
        //  1465: lookupswitch {
        //          -1074341483: 1538
        //           100571: 1519
        //          109757538: 1506
        //          default: 1500
        //        }
        //  1500: iconst_m1      
        //  1501: istore          4
        //  1503: goto            1554
        //  1506: aload_2        
        //  1507: ldc_w           "start"
        //  1510: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1513: ifne            1554
        //  1516: goto            1500
        //  1519: aload_2        
        //  1520: ldc_w           "end"
        //  1523: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1526: ifne            1532
        //  1529: goto            1500
        //  1532: iconst_1       
        //  1533: istore          4
        //  1535: goto            1554
        //  1538: aload_2        
        //  1539: ldc_w           "middle"
        //  1542: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1545: ifne            1551
        //  1548: goto            1500
        //  1551: iconst_0       
        //  1552: istore          4
        //  1554: iload           4
        //  1556: tableswitch {
        //                0: 1604
        //                1: 1597
        //                2: 1590
        //          default: 1584
        //        }
        //  1584: aload           11
        //  1586: astore_1       
        //  1587: goto            1608
        //  1590: getstatic       com/caverock/androidsvg/SVG$Style$TextAnchor.Start:Lcom/caverock/androidsvg/SVG$Style$TextAnchor;
        //  1593: astore_1       
        //  1594: goto            1608
        //  1597: getstatic       com/caverock/androidsvg/SVG$Style$TextAnchor.End:Lcom/caverock/androidsvg/SVG$Style$TextAnchor;
        //  1600: astore_1       
        //  1601: goto            1608
        //  1604: getstatic       com/caverock/androidsvg/SVG$Style$TextAnchor.Middle:Lcom/caverock/androidsvg/SVG$Style$TextAnchor;
        //  1607: astore_1       
        //  1608: aload_0        
        //  1609: aload_1        
        //  1610: putfield        com/caverock/androidsvg/SVG$Style.z:Lcom/caverock/androidsvg/SVG$Style$TextAnchor;
        //  1613: aload_1        
        //  1614: ifnull          3141
        //  1617: aload_0        
        //  1618: aload_0        
        //  1619: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1622: ldc2_w          262144
        //  1625: lor            
        //  1626: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1629: goto            3141
        //  1632: aload_2        
        //  1633: ldc_w           "ltr"
        //  1636: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1639: ifne            1665
        //  1642: aload_2        
        //  1643: ldc_w           "rtl"
        //  1646: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1649: ifne            1658
        //  1652: aload           10
        //  1654: astore_1       
        //  1655: goto            1669
        //  1658: getstatic       com/caverock/androidsvg/SVG$Style$TextDirection.RTL:Lcom/caverock/androidsvg/SVG$Style$TextDirection;
        //  1661: astore_1       
        //  1662: goto            1669
        //  1665: getstatic       com/caverock/androidsvg/SVG$Style$TextDirection.LTR:Lcom/caverock/androidsvg/SVG$Style$TextDirection;
        //  1668: astore_1       
        //  1669: aload_0        
        //  1670: aload_1        
        //  1671: putfield        com/caverock/androidsvg/SVG$Style.y:Lcom/caverock/androidsvg/SVG$Style$TextDirection;
        //  1674: aload_1        
        //  1675: ifnull          3141
        //  1678: aload_0        
        //  1679: aload_0        
        //  1680: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1683: ldc2_w          68719476736
        //  1686: lor            
        //  1687: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1690: goto            3141
        //  1693: aload_2        
        //  1694: invokevirtual   java/lang/String.hashCode:()I
        //  1697: lookupswitch {
        //          -1171789332: 1830
        //          -1026963764: 1811
        //          3387192: 1792
        //          93826908: 1773
        //          529818312: 1754
        //          default: 1748
        //        }
        //  1748: iconst_m1      
        //  1749: istore          4
        //  1751: goto            1847
        //  1754: aload_2        
        //  1755: ldc_w           "overline"
        //  1758: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1761: ifne            1767
        //  1764: goto            1748
        //  1767: iconst_4       
        //  1768: istore          4
        //  1770: goto            1847
        //  1773: aload_2        
        //  1774: ldc_w           "blink"
        //  1777: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1780: ifne            1786
        //  1783: goto            1748
        //  1786: iconst_3       
        //  1787: istore          4
        //  1789: goto            1847
        //  1792: aload_2        
        //  1793: ldc_w           "none"
        //  1796: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1799: ifne            1805
        //  1802: goto            1748
        //  1805: iconst_2       
        //  1806: istore          4
        //  1808: goto            1847
        //  1811: aload_2        
        //  1812: ldc_w           "underline"
        //  1815: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1818: ifne            1824
        //  1821: goto            1748
        //  1824: iconst_1       
        //  1825: istore          4
        //  1827: goto            1847
        //  1830: iload           5
        //  1832: istore          4
        //  1834: aload_2        
        //  1835: ldc_w           "line-through"
        //  1838: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1841: ifne            1847
        //  1844: goto            1748
        //  1847: iload           4
        //  1849: tableswitch {
        //                0: 1918
        //                1: 1911
        //                2: 1904
        //                3: 1897
        //                4: 1890
        //          default: 1884
        //        }
        //  1884: aload           19
        //  1886: astore_1       
        //  1887: goto            1922
        //  1890: getstatic       com/caverock/androidsvg/SVG$Style$TextDecoration.Overline:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1893: astore_1       
        //  1894: goto            1922
        //  1897: getstatic       com/caverock/androidsvg/SVG$Style$TextDecoration.Blink:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1900: astore_1       
        //  1901: goto            1922
        //  1904: getstatic       com/caverock/androidsvg/SVG$Style$TextDecoration.None:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1907: astore_1       
        //  1908: goto            1922
        //  1911: getstatic       com/caverock/androidsvg/SVG$Style$TextDecoration.Underline:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1914: astore_1       
        //  1915: goto            1922
        //  1918: getstatic       com/caverock/androidsvg/SVG$Style$TextDecoration.LineThrough:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1921: astore_1       
        //  1922: aload_0        
        //  1923: aload_1        
        //  1924: putfield        com/caverock/androidsvg/SVG$Style.x:Lcom/caverock/androidsvg/SVG$Style$TextDecoration;
        //  1927: aload_1        
        //  1928: ifnull          3141
        //  1931: aload_0        
        //  1932: aload_0        
        //  1933: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1936: ldc2_w          131072
        //  1939: lor            
        //  1940: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1943: goto            3141
        //  1946: aload_2        
        //  1947: invokestatic    com/caverock/androidsvg/SVGParser.u:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$Style$FontStyle;
        //  1950: astore_1       
        //  1951: aload_0        
        //  1952: aload_1        
        //  1953: putfield        com/caverock/androidsvg/SVG$Style.w:Lcom/caverock/androidsvg/SVG$Style$FontStyle;
        //  1956: aload_1        
        //  1957: ifnull          3141
        //  1960: aload_0        
        //  1961: aload_0        
        //  1962: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1965: ldc2_w          65536
        //  1968: lor            
        //  1969: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  1972: goto            3141
        //  1975: getstatic       com/caverock/androidsvg/SVGParser$e.a:Ljava/util/HashMap;
        //  1978: aload_2        
        //  1979: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1982: checkcast       Ljava/lang/Integer;
        //  1985: astore_1       
        //  1986: aload_0        
        //  1987: aload_1        
        //  1988: putfield        com/caverock/androidsvg/SVG$Style.v:Ljava/lang/Integer;
        //  1991: aload_1        
        //  1992: ifnull          3141
        //  1995: aload_0        
        //  1996: aload_0        
        //  1997: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2000: ldc2_w          32768
        //  2003: lor            
        //  2004: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2007: goto            3141
        //  2010: getstatic       com/caverock/androidsvg/SVGParser$d.a:Ljava/util/HashMap;
        //  2013: aload_2        
        //  2014: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2017: checkcast       Lcom/caverock/androidsvg/SVG$o;
        //  2020: astore_1       
        //  2021: aload_1        
        //  2022: ifnonnull       2033
        //  2025: aload_2        
        //  2026: invokestatic    com/caverock/androidsvg/SVGParser.w:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$o;
        //  2029: astore_1       
        //  2030: goto            2033
        //  2033: aload_0        
        //  2034: aload_1        
        //  2035: putfield        com/caverock/androidsvg/SVG$Style.u:Lcom/caverock/androidsvg/SVG$o;
        //  2038: aload_1        
        //  2039: ifnull          3141
        //  2042: aload_0        
        //  2043: aload_0        
        //  2044: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2047: ldc2_w          16384
        //  2050: lor            
        //  2051: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2054: goto            3141
        //  2057: aload_2        
        //  2058: invokestatic    com/caverock/androidsvg/SVGParser.t:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  2061: astore_1       
        //  2062: aload_0        
        //  2063: aload_1        
        //  2064: putfield        com/caverock/androidsvg/SVG$Style.t:Ljava/util/List;
        //  2067: aload_1        
        //  2068: ifnull          3141
        //  2071: aload_0        
        //  2072: aload_0        
        //  2073: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2076: ldc2_w          8192
        //  2079: lor            
        //  2080: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2083: goto            3141
        //  2086: new             Ljava/lang/StringBuilder;
        //  2089: dup            
        //  2090: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2093: astore_1       
        //  2094: aload_1        
        //  2095: bipush          124
        //  2097: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  2100: pop            
        //  2101: aload_1        
        //  2102: aload_2        
        //  2103: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2106: pop            
        //  2107: aload_1        
        //  2108: bipush          124
        //  2110: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  2113: pop            
        //  2114: ldc_w           "|caption|icon|menu|message-box|small-caption|status-bar|"
        //  2117: aload_1        
        //  2118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2121: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //  2124: ifne            2130
        //  2127: goto            3141
        //  2130: new             Lcom/caverock/androidsvg/SVGParser$g;
        //  2133: dup            
        //  2134: aload_2        
        //  2135: invokespecial   com/caverock/androidsvg/SVGParser$g.<init>:(Ljava/lang/String;)V
        //  2138: astore          14
        //  2140: aconst_null    
        //  2141: astore_2       
        //  2142: aconst_null    
        //  2143: astore_1       
        //  2144: aload_1        
        //  2145: astore          11
        //  2147: aload           14
        //  2149: bipush          47
        //  2151: iconst_0       
        //  2152: invokevirtual   com/caverock/androidsvg/SVGParser$g.m:(CZ)Ljava/lang/String;
        //  2155: astore          13
        //  2157: aload           14
        //  2159: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //  2162: aload           13
        //  2164: ifnonnull       2170
        //  2167: goto            3141
        //  2170: aload_2        
        //  2171: ifnull          2184
        //  2174: aload_1        
        //  2175: ifnull          2184
        //  2178: aload_2        
        //  2179: astore          10
        //  2181: goto            2296
        //  2184: aload           13
        //  2186: ldc_w           "normal"
        //  2189: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2192: ifeq            2198
        //  2195: goto            2147
        //  2198: aload_2        
        //  2199: astore          8
        //  2201: aload_2        
        //  2202: ifnonnull       2227
        //  2205: getstatic       com/caverock/androidsvg/SVGParser$e.a:Ljava/util/HashMap;
        //  2208: aload           13
        //  2210: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2213: checkcast       Ljava/lang/Integer;
        //  2216: astore_2       
        //  2217: aload_2        
        //  2218: astore          8
        //  2220: aload_2        
        //  2221: ifnull          2227
        //  2224: goto            2147
        //  2227: aload_1        
        //  2228: astore          9
        //  2230: aload_1        
        //  2231: ifnonnull       2253
        //  2234: aload           13
        //  2236: invokestatic    com/caverock/androidsvg/SVGParser.u:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$Style$FontStyle;
        //  2239: astore_1       
        //  2240: aload_1        
        //  2241: astore          9
        //  2243: aload_1        
        //  2244: ifnull          2253
        //  2247: aload           8
        //  2249: astore_2       
        //  2250: goto            2147
        //  2253: aload           8
        //  2255: astore          10
        //  2257: aload           9
        //  2259: astore_1       
        //  2260: aload           11
        //  2262: ifnonnull       2296
        //  2265: aload           8
        //  2267: astore          10
        //  2269: aload           9
        //  2271: astore_1       
        //  2272: aload           13
        //  2274: ldc_w           "small-caps"
        //  2277: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2280: ifeq            2296
        //  2283: aload           13
        //  2285: astore          11
        //  2287: aload           8
        //  2289: astore_2       
        //  2290: aload           9
        //  2292: astore_1       
        //  2293: goto            2147
        //  2296: getstatic       com/caverock/androidsvg/SVGParser$d.a:Ljava/util/HashMap;
        //  2299: aload           13
        //  2301: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2304: checkcast       Lcom/caverock/androidsvg/SVG$o;
        //  2307: astore          8
        //  2309: aload           8
        //  2311: astore_2       
        //  2312: aload           8
        //  2314: ifnonnull       2329
        //  2317: aload           13
        //  2319: invokestatic    com/caverock/androidsvg/SVGParser.w:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$o;
        //  2322: astore_2       
        //  2323: goto            2329
        //  2326: astore_2       
        //  2327: aconst_null    
        //  2328: astore_2       
        //  2329: aload           14
        //  2331: bipush          47
        //  2333: invokevirtual   com/caverock/androidsvg/SVGParser$g.d:(C)Z
        //  2336: ifeq            2367
        //  2339: aload           14
        //  2341: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //  2344: aload           14
        //  2346: invokevirtual   com/caverock/androidsvg/SVGParser$g.l:()Ljava/lang/String;
        //  2349: astore          8
        //  2351: aload           8
        //  2353: ifnull          2362
        //  2356: aload           8
        //  2358: invokestatic    com/caverock/androidsvg/SVGParser.w:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$o;
        //  2361: pop            
        //  2362: aload           14
        //  2364: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //  2367: aload           14
        //  2369: invokevirtual   com/caverock/androidsvg/SVGParser$g.f:()Z
        //  2372: ifeq            2382
        //  2375: aload           12
        //  2377: astore          8
        //  2379: goto            2411
        //  2382: aload           14
        //  2384: getfield        com/caverock/androidsvg/SVGParser$g.b:I
        //  2387: istore          4
        //  2389: aload           14
        //  2391: aload           14
        //  2393: getfield        com/caverock/androidsvg/SVGParser$g.c:I
        //  2396: putfield        com/caverock/androidsvg/SVGParser$g.b:I
        //  2399: aload           14
        //  2401: getfield        com/caverock/androidsvg/SVGParser$g.a:Ljava/lang/String;
        //  2404: iload           4
        //  2406: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  2409: astore          8
        //  2411: aload_0        
        //  2412: aload           8
        //  2414: invokestatic    com/caverock/androidsvg/SVGParser.t:(Ljava/lang/String;)Ljava/util/ArrayList;
        //  2417: putfield        com/caverock/androidsvg/SVG$Style.t:Ljava/util/List;
        //  2420: aload_0        
        //  2421: aload_2        
        //  2422: putfield        com/caverock/androidsvg/SVG$Style.u:Lcom/caverock/androidsvg/SVG$o;
        //  2425: aload           10
        //  2427: ifnonnull       2438
        //  2430: sipush          400
        //  2433: istore          4
        //  2435: goto            2445
        //  2438: aload           10
        //  2440: invokevirtual   java/lang/Integer.intValue:()I
        //  2443: istore          4
        //  2445: aload_0        
        //  2446: iload           4
        //  2448: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2451: putfield        com/caverock/androidsvg/SVG$Style.v:Ljava/lang/Integer;
        //  2454: aload_1        
        //  2455: astore_2       
        //  2456: aload_1        
        //  2457: ifnonnull       2464
        //  2460: getstatic       com/caverock/androidsvg/SVG$Style$FontStyle.Normal:Lcom/caverock/androidsvg/SVG$Style$FontStyle;
        //  2463: astore_2       
        //  2464: aload_0        
        //  2465: aload_2        
        //  2466: putfield        com/caverock/androidsvg/SVG$Style.w:Lcom/caverock/androidsvg/SVG$Style$FontStyle;
        //  2469: aload_0        
        //  2470: aload_0        
        //  2471: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2474: ldc2_w          122880
        //  2477: lor            
        //  2478: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2481: goto            3141
        //  2484: aload_0        
        //  2485: aload_2        
        //  2486: invokestatic    com/caverock/androidsvg/SVGParser.p:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$f;
        //  2489: putfield        com/caverock/androidsvg/SVG$Style.s:Lcom/caverock/androidsvg/SVG$f;
        //  2492: aload_0        
        //  2493: aload_0        
        //  2494: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2497: ldc2_w          4096
        //  2500: lor            
        //  2501: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2504: goto            3141
        //  2507: aload_0        
        //  2508: aload_2        
        //  2509: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //  2512: putfield        com/caverock/androidsvg/SVG$Style.r:Ljava/lang/Float;
        //  2515: aload_0        
        //  2516: aload_0        
        //  2517: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2520: ldc2_w          2048
        //  2523: lor            
        //  2524: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2527: goto            3141
        //  2530: aload_0        
        //  2531: aload_2        
        //  2532: invokestatic    com/caverock/androidsvg/SVGParser.w:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$o;
        //  2535: putfield        com/caverock/androidsvg/SVG$Style.q:Lcom/caverock/androidsvg/SVG$o;
        //  2538: aload_0        
        //  2539: aload_0        
        //  2540: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2543: ldc2_w          1024
        //  2546: lor            
        //  2547: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2550: goto            3141
        //  2553: ldc_w           "none"
        //  2556: aload_2        
        //  2557: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2560: ifeq            2583
        //  2563: aload_0        
        //  2564: aconst_null    
        //  2565: putfield        com/caverock/androidsvg/SVG$Style.p:[Lcom/caverock/androidsvg/SVG$o;
        //  2568: aload_0        
        //  2569: aload_0        
        //  2570: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2573: ldc2_w          512
        //  2576: lor            
        //  2577: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2580: goto            3141
        //  2583: new             Lcom/caverock/androidsvg/SVGParser$g;
        //  2586: dup            
        //  2587: aload_2        
        //  2588: invokespecial   com/caverock/androidsvg/SVGParser$g.<init>:(Ljava/lang/String;)V
        //  2591: astore_2       
        //  2592: aload_2        
        //  2593: invokevirtual   com/caverock/androidsvg/SVGParser$g.q:()V
        //  2596: aload_2        
        //  2597: invokevirtual   com/caverock/androidsvg/SVGParser$g.f:()Z
        //  2600: ifeq            2609
        //  2603: aload           8
        //  2605: astore_1       
        //  2606: goto            2749
        //  2609: aload_2        
        //  2610: invokevirtual   com/caverock/androidsvg/SVGParser$g.j:()Lcom/caverock/androidsvg/SVG$o;
        //  2613: astore          9
        //  2615: aload           9
        //  2617: ifnonnull       2626
        //  2620: aload           8
        //  2622: astore_1       
        //  2623: goto            2749
        //  2626: aload           9
        //  2628: invokevirtual   com/caverock/androidsvg/SVG$o.g:()Z
        //  2631: ifeq            2640
        //  2634: aload           8
        //  2636: astore_1       
        //  2637: goto            2749
        //  2640: aload           9
        //  2642: getfield        com/caverock/androidsvg/SVG$o.f:F
        //  2645: fstore_3       
        //  2646: new             Ljava/util/ArrayList;
        //  2649: dup            
        //  2650: invokespecial   java/util/ArrayList.<init>:()V
        //  2653: astore_1       
        //  2654: aload_1        
        //  2655: aload           9
        //  2657: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2660: pop            
        //  2661: aload_2        
        //  2662: invokevirtual   com/caverock/androidsvg/SVGParser$g.f:()Z
        //  2665: ifne            2722
        //  2668: aload_2        
        //  2669: invokevirtual   com/caverock/androidsvg/SVGParser$g.p:()Z
        //  2672: pop            
        //  2673: aload_2        
        //  2674: invokevirtual   com/caverock/androidsvg/SVGParser$g.j:()Lcom/caverock/androidsvg/SVG$o;
        //  2677: astore          9
        //  2679: aload           9
        //  2681: ifnonnull       2690
        //  2684: aload           8
        //  2686: astore_1       
        //  2687: goto            2749
        //  2690: aload           9
        //  2692: invokevirtual   com/caverock/androidsvg/SVG$o.g:()Z
        //  2695: ifeq            2704
        //  2698: aload           8
        //  2700: astore_1       
        //  2701: goto            2749
        //  2704: aload_1        
        //  2705: aload           9
        //  2707: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  2710: pop            
        //  2711: fload_3        
        //  2712: aload           9
        //  2714: getfield        com/caverock/androidsvg/SVG$o.f:F
        //  2717: fadd           
        //  2718: fstore_3       
        //  2719: goto            2661
        //  2722: fload_3        
        //  2723: fconst_0       
        //  2724: fcmpl          
        //  2725: ifne            2734
        //  2728: aload           8
        //  2730: astore_1       
        //  2731: goto            2749
        //  2734: aload_1        
        //  2735: aload_1        
        //  2736: invokevirtual   java/util/ArrayList.size:()I
        //  2739: anewarray       Lcom/caverock/androidsvg/SVG$o;
        //  2742: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //  2745: checkcast       [Lcom/caverock/androidsvg/SVG$o;
        //  2748: astore_1       
        //  2749: aload_0        
        //  2750: aload_1        
        //  2751: putfield        com/caverock/androidsvg/SVG$Style.p:[Lcom/caverock/androidsvg/SVG$o;
        //  2754: aload_1        
        //  2755: ifnull          3141
        //  2758: aload_0        
        //  2759: aload_0        
        //  2760: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2763: ldc2_w          512
        //  2766: lor            
        //  2767: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2770: goto            3141
        //  2773: aload_0        
        //  2774: aload_2        
        //  2775: invokestatic    com/caverock/androidsvg/SVGParser.s:(Ljava/lang/String;)F
        //  2778: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  2781: putfield        com/caverock/androidsvg/SVG$Style.o:Ljava/lang/Float;
        //  2784: aload_0        
        //  2785: aload_0        
        //  2786: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2789: ldc2_w          256
        //  2792: lor            
        //  2793: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2796: goto            3141
        //  2799: ldc_w           "miter"
        //  2802: aload_2        
        //  2803: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2806: ifeq            2816
        //  2809: getstatic       com/caverock/androidsvg/SVG$Style$LineJoin.Miter:Lcom/caverock/androidsvg/SVG$Style$LineJoin;
        //  2812: astore_1       
        //  2813: goto            2850
        //  2816: ldc_w           "round"
        //  2819: aload_2        
        //  2820: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2823: ifeq            2833
        //  2826: getstatic       com/caverock/androidsvg/SVG$Style$LineJoin.Round:Lcom/caverock/androidsvg/SVG$Style$LineJoin;
        //  2829: astore_1       
        //  2830: goto            2850
        //  2833: aload           18
        //  2835: astore_1       
        //  2836: ldc_w           "bevel"
        //  2839: aload_2        
        //  2840: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2843: ifeq            2850
        //  2846: getstatic       com/caverock/androidsvg/SVG$Style$LineJoin.Bevel:Lcom/caverock/androidsvg/SVG$Style$LineJoin;
        //  2849: astore_1       
        //  2850: aload_0        
        //  2851: aload_1        
        //  2852: putfield        com/caverock/androidsvg/SVG$Style.n:Lcom/caverock/androidsvg/SVG$Style$LineJoin;
        //  2855: aload_1        
        //  2856: ifnull          3141
        //  2859: aload_0        
        //  2860: aload_0        
        //  2861: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2864: ldc2_w          128
        //  2867: lor            
        //  2868: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2871: goto            3141
        //  2874: ldc_w           "butt"
        //  2877: aload_2        
        //  2878: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2881: ifeq            2891
        //  2884: getstatic       com/caverock/androidsvg/SVG$Style$LineCap.Butt:Lcom/caverock/androidsvg/SVG$Style$LineCap;
        //  2887: astore_1       
        //  2888: goto            2925
        //  2891: ldc_w           "round"
        //  2894: aload_2        
        //  2895: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2898: ifeq            2908
        //  2901: getstatic       com/caverock/androidsvg/SVG$Style$LineCap.Round:Lcom/caverock/androidsvg/SVG$Style$LineCap;
        //  2904: astore_1       
        //  2905: goto            2925
        //  2908: aload           13
        //  2910: astore_1       
        //  2911: ldc_w           "square"
        //  2914: aload_2        
        //  2915: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2918: ifeq            2925
        //  2921: getstatic       com/caverock/androidsvg/SVG$Style$LineCap.Square:Lcom/caverock/androidsvg/SVG$Style$LineCap;
        //  2924: astore_1       
        //  2925: aload_0        
        //  2926: aload_1        
        //  2927: putfield        com/caverock/androidsvg/SVG$Style.m:Lcom/caverock/androidsvg/SVG$Style$LineCap;
        //  2930: aload_1        
        //  2931: ifnull          3141
        //  2934: aload_0        
        //  2935: aload_0        
        //  2936: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2939: ldc2_w          64
        //  2942: lor            
        //  2943: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2946: goto            3141
        //  2949: aload_0        
        //  2950: aload_2        
        //  2951: invokestatic    com/caverock/androidsvg/SVGParser.w:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$o;
        //  2954: putfield        com/caverock/androidsvg/SVG$Style.l:Lcom/caverock/androidsvg/SVG$o;
        //  2957: aload_0        
        //  2958: aload_0        
        //  2959: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2962: ldc2_w          32
        //  2965: lor            
        //  2966: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2969: goto            3141
        //  2972: aload_2        
        //  2973: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //  2976: astore_1       
        //  2977: aload_0        
        //  2978: aload_1        
        //  2979: putfield        com/caverock/androidsvg/SVG$Style.k:Ljava/lang/Float;
        //  2982: aload_1        
        //  2983: ifnull          3141
        //  2986: aload_0        
        //  2987: aload_0        
        //  2988: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2991: ldc2_w          16
        //  2994: lor            
        //  2995: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  2998: goto            3141
        //  3001: aload_2        
        //  3002: invokestatic    com/caverock/androidsvg/SVGParser.A:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$m0;
        //  3005: astore_1       
        //  3006: aload_0        
        //  3007: aload_1        
        //  3008: putfield        com/caverock/androidsvg/SVG$Style.j:Lcom/caverock/androidsvg/SVG$m0;
        //  3011: aload_1        
        //  3012: ifnull          3141
        //  3015: aload_0        
        //  3016: aload_0        
        //  3017: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3020: ldc2_w          8
        //  3023: lor            
        //  3024: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3027: goto            3141
        //  3030: aload_2        
        //  3031: invokestatic    com/caverock/androidsvg/SVGParser.z:(Ljava/lang/String;)Ljava/lang/Float;
        //  3034: astore_1       
        //  3035: aload_0        
        //  3036: aload_1        
        //  3037: putfield        com/caverock/androidsvg/SVG$Style.i:Ljava/lang/Float;
        //  3040: aload_1        
        //  3041: ifnull          3141
        //  3044: aload_0        
        //  3045: aload_0        
        //  3046: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3049: ldc2_w          4
        //  3052: lor            
        //  3053: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3056: goto            3141
        //  3059: ldc_w           "nonzero"
        //  3062: aload_2        
        //  3063: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3066: ifeq            3076
        //  3069: getstatic       com/caverock/androidsvg/SVG$Style$FillRule.NonZero:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //  3072: astore_1       
        //  3073: goto            3093
        //  3076: aload           15
        //  3078: astore_1       
        //  3079: ldc_w           "evenodd"
        //  3082: aload_2        
        //  3083: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3086: ifeq            3093
        //  3089: getstatic       com/caverock/androidsvg/SVG$Style$FillRule.EvenOdd:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //  3092: astore_1       
        //  3093: aload_0        
        //  3094: aload_1        
        //  3095: putfield        com/caverock/androidsvg/SVG$Style.h:Lcom/caverock/androidsvg/SVG$Style$FillRule;
        //  3098: aload_1        
        //  3099: ifnull          3141
        //  3102: aload_0        
        //  3103: aload_0        
        //  3104: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3107: ldc2_w          2
        //  3110: lor            
        //  3111: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3114: goto            3141
        //  3117: aload_2        
        //  3118: invokestatic    com/caverock/androidsvg/SVGParser.A:(Ljava/lang/String;)Lcom/caverock/androidsvg/SVG$m0;
        //  3121: astore_1       
        //  3122: aload_0        
        //  3123: aload_1        
        //  3124: putfield        com/caverock/androidsvg/SVG$Style.g:Lcom/caverock/androidsvg/SVG$m0;
        //  3127: aload_1        
        //  3128: ifnull          3141
        //  3131: aload_0        
        //  3132: aload_0        
        //  3133: getfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3136: lconst_1       
        //  3137: lor            
        //  3138: putfield        com/caverock/androidsvg/SVG$Style.f:J
        //  3141: return         
        //  3142: astore_1       
        //  3143: aload           9
        //  3145: astore_1       
        //  3146: goto            2033
        //  3149: astore_0       
        //  3150: goto            3141
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  536    544    559    574    Lcom/caverock/androidsvg/SVGParseException;
        //  617    625    640    655    Lcom/caverock/androidsvg/SVGParseException;
        //  953    961    976    991    Lcom/caverock/androidsvg/SVGParseException;
        //  2010   2021   3142   3149   Lcom/caverock/androidsvg/SVGParseException;
        //  2025   2030   3142   3149   Lcom/caverock/androidsvg/SVGParseException;
        //  2296   2309   2326   2329   Lcom/caverock/androidsvg/SVGParseException;
        //  2317   2323   2326   2329   Lcom/caverock/androidsvg/SVGParseException;
        //  2356   2362   3149   3153   Lcom/caverock/androidsvg/SVGParseException;
        //  2484   2504   3149   3153   Lcom/caverock/androidsvg/SVGParseException;
        //  2530   2550   3149   3153   Lcom/caverock/androidsvg/SVGParseException;
        //  2773   2796   3149   3153   Lcom/caverock/androidsvg/SVGParseException;
        //  2949   2969   3149   3153   Lcom/caverock/androidsvg/SVGParseException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_2362:
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
    
    public static int b(final float n) {
        int round;
        if (n < 0.0f) {
            round = 0;
        }
        else if (n > 255.0f) {
            round = 255;
        }
        else {
            round = Math.round(n);
        }
        return round;
    }
    
    public static int d(float e, float e2, float e3) {
        final float n = 0.0f;
        final float n2 = e % 360.0f;
        if (e >= 0.0f) {
            e = n2;
        }
        else {
            e = n2 + 360.0f;
        }
        final float n3 = e / 60.0f;
        final float n4 = e2 / 100.0f;
        e2 = e3 / 100.0f;
        if (n4 < 0.0f) {
            e = 0.0f;
        }
        else {
            e = n4;
            if (n4 > 1.0f) {
                e = 1.0f;
            }
        }
        if (e2 < 0.0f) {
            e2 = n;
        }
        else if (e2 > 1.0f) {
            e2 = 1.0f;
        }
        if (e2 <= 0.5f) {
            e = (e + 1.0f) * e2;
        }
        else {
            e = e2 + e - e * e2;
        }
        final float n5 = e2 * 2.0f - e;
        e2 = e(n5, e, n3 + 2.0f);
        e3 = e(n5, e, n3);
        e = e(n5, e, n3 - 2.0f);
        return b(e * 256.0f) | (b(e2 * 256.0f) << 16 | b(e3 * 256.0f) << 8);
    }
    
    public static float e(final float n, final float n2, float n3) {
        float n4 = n3;
        if (n3 < 0.0f) {
            n4 = n3 + 6.0f;
        }
        n3 = n4;
        if (n4 >= 6.0f) {
            n3 = n4 - 6.0f;
        }
        if (n3 < 1.0f) {
            return d.b(n2, n, n3, n);
        }
        if (n3 < 3.0f) {
            return n2;
        }
        float b = n;
        if (n3 < 4.0f) {
            b = d.b(4.0f, n3, n2 - n, n);
        }
        return b;
    }
    
    public static void h(final SVG.e0 e0, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            final String trim = attributes.getValue(i).trim();
            switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 25: {
                    final ArrayList t = t(trim);
                    HashSet set;
                    if (t != null) {
                        set = new HashSet(t);
                    }
                    else {
                        set = new HashSet(0);
                    }
                    e0.k(set);
                    break;
                }
                case 24: {
                    final g g = new g(trim);
                    final HashSet<String> set2 = new HashSet<String>();
                    while (!g.f()) {
                        set2.add(g.l());
                        g.q();
                    }
                    e0.c(set2);
                    break;
                }
                case 23: {
                    final g g2 = new g(trim);
                    final HashSet<String> set3 = new HashSet<String>();
                    while (!g2.f()) {
                        final String l = g2.l();
                        final int index = l.indexOf(45);
                        String substring = l;
                        if (index != -1) {
                            substring = l.substring(0, index);
                        }
                        set3.add(new Locale(substring, "", "").getLanguage());
                        g2.q();
                    }
                    e0.i(set3);
                    break;
                }
                case 22: {
                    e0.l(trim);
                    break;
                }
                case 21: {
                    final g g3 = new g(trim);
                    final HashSet<String> set4 = new HashSet<String>();
                    while (!g3.f()) {
                        final String j = g3.l();
                        if (j.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            set4.add(j.substring(35));
                        }
                        else {
                            set4.add("UNSUPPORTED");
                        }
                        g3.q();
                    }
                    e0.f(set4);
                    break;
                }
            }
        }
    }
    
    public static void i(final SVG$j0 svg$j0, final Attributes attributes) throws SVGParseException {
        int i = 0;
        while (i < attributes.getLength()) {
            final String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svg$j0.c = attributes.getValue(i).trim();
                break;
            }
            if (qName.equals("xml:space")) {
                final String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    svg$j0.d = Boolean.FALSE;
                    break;
                }
                if ("preserve".equals(trim)) {
                    svg$j0.d = Boolean.TRUE;
                    break;
                }
                throw new SVGParseException(b.l("Invalid value for \"xml:space\" attribute: ", trim));
            }
            else {
                ++i;
            }
        }
    }
    
    public static void j(final SVG$j svg$j, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            final String trim = attributes.getValue(i).trim();
            final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (n != 6) {
                switch (n) {
                    case 34: {
                        try {
                            svg$j.k = SVG.GradientSpread.valueOf(trim);
                            break;
                        }
                        catch (final IllegalArgumentException ex) {
                            throw new SVGParseException(a.n("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                        }
                    }
                    case 33: {
                        svg$j.j = D(trim);
                        break;
                    }
                    case 32: {
                        if ("objectBoundingBox".equals(trim)) {
                            svg$j.i = Boolean.FALSE;
                            break;
                        }
                        if ("userSpaceOnUse".equals(trim)) {
                            svg$j.i = Boolean.TRUE;
                            break;
                        }
                        throw new SVGParseException("Invalid value for attribute gradientUnits");
                    }
                }
            }
            else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                svg$j.l = trim;
            }
        }
    }
    
    public static void k(final SVG$y svg$y, final Attributes attributes, final String s) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                final g g = new g(attributes.getValue(i));
                final ArrayList<Float> list = new ArrayList<Float>();
                g.q();
                while (!g.f()) {
                    final float j = g.i();
                    if (Float.isNaN(j)) {
                        throw new SVGParseException(a.n("Invalid <", s, "> points attribute. Non-coordinate content found in list."));
                    }
                    g.p();
                    final float k = g.i();
                    if (Float.isNaN(k)) {
                        throw new SVGParseException(a.n("Invalid <", s, "> points attribute. There should be an even number of coordinates."));
                    }
                    g.p();
                    list.add(j);
                    list.add(k);
                }
                svg$y.o = new float[list.size()];
                final Iterator<Float> iterator = list.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    svg$y.o[n] = iterator.next();
                    ++n;
                }
            }
        }
    }
    
    public static void l(final SVG$j0 svg$j0, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            final String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (n != 45) {
                    if (n != 46) {
                        if (svg$j0.e == null) {
                            svg$j0.e = new SVG.Style();
                        }
                        H(svg$j0.e, attributes.getLocalName(i), attributes.getValue(i).trim());
                    }
                    else {
                        final CSSParser$c cssParser$c = new CSSParser$c(trim);
                        ArrayList g = null;
                        while (!((g)cssParser$c).f()) {
                            final String l = ((g)cssParser$c).l();
                            if (l == null) {
                                continue;
                            }
                            ArrayList list;
                            if ((list = g) == null) {
                                list = new ArrayList();
                            }
                            list.add(l);
                            ((g)cssParser$c).q();
                            g = list;
                        }
                        svg$j0.g = g;
                    }
                }
                else {
                    final g g2 = new g(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        final String m = g2.m(':', false);
                        g2.q();
                        if (!g2.d(':')) {
                            break;
                        }
                        g2.q();
                        final String j = g2.m(';', true);
                        if (j == null) {
                            break;
                        }
                        g2.q();
                        if (!g2.f() && !g2.d(';')) {
                            continue;
                        }
                        if (svg$j0.f == null) {
                            svg$j0.f = new SVG.Style();
                        }
                        H(svg$j0.f, m, j);
                        g2.q();
                    }
                }
            }
        }
    }
    
    public static void m(final SVG$y0 svg$y0, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            final String trim = attributes.getValue(i).trim();
            final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 19) {
                        if (n == 20) {
                            svg$y0.r = x(trim);
                        }
                    }
                    else {
                        svg$y0.q = x(trim);
                    }
                }
                else {
                    svg$y0.p = x(trim);
                }
            }
            else {
                svg$y0.o = x(trim);
            }
        }
    }
    
    public static void n(final SVG.m m, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                m.m(D(attributes.getValue(i)));
            }
        }
    }
    
    public static void o(final SVG$p0 svg$p0, final Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); ++i) {
            final String trim = attributes.getValue(i).trim();
            final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (n != 7) {
                if (n == 87) {
                    final g g = new g(trim);
                    g.q();
                    final float j = g.i();
                    g.p();
                    final float k = g.i();
                    g.p();
                    final float l = g.i();
                    g.p();
                    final float m = g.i();
                    if (Float.isNaN(j) || Float.isNaN(k) || Float.isNaN(l) || Float.isNaN(m)) {
                        throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                    }
                    if (l < 0.0f) {
                        throw new SVGParseException("Invalid viewBox. width cannot be negative");
                    }
                    if (m < 0.0f) {
                        throw new SVGParseException("Invalid viewBox. height cannot be negative");
                    }
                    svg$p0.p = new SVG.b(j, k, l, m);
                }
            }
            else {
                B((SVG$n0)svg$p0, trim);
            }
        }
    }
    
    public static SVG$f p(final String s) throws SVGParseException {
        final char char1 = s.charAt(0);
        int n = 4;
        if (char1 == '#') {
            final int length = s.length();
            n9.a a = null;
            Label_0193: {
                if (1 < length) {
                    long n2 = 0L;
                    int i;
                    for (i = 1; i < length; ++i) {
                        int char2 = s.charAt(i);
                        if (char2 >= 48 && char2 <= 57) {
                            n2 = n2 * 16L + (char2 - 48);
                        }
                        else {
                            long n3;
                            if (char2 >= 65 && char2 <= 70) {
                                n3 = n2 * 16L;
                                char2 -= 65;
                            }
                            else {
                                if (char2 < 97 || char2 > 102) {
                                    break;
                                }
                                n3 = n2 * 16L;
                                char2 -= 97;
                            }
                            n2 = n3 + char2 + 10L;
                        }
                        if (n2 > 4294967295L) {
                            break Label_0193;
                        }
                    }
                    if (i != 1) {
                        a = new n9.a(n2, i);
                    }
                }
            }
            if (a == null) {
                throw new SVGParseException(b.l("Bad hex colour value: ", s));
            }
            final int a2 = a.a;
            if (a2 == 4) {
                final int n4 = (int)a.b;
                final int n5 = n4 & 0xF00;
                final int n6 = n4 & 0xF0;
                final int n7 = n4 & 0xF;
                return new SVG$f(n7 | (n5 << 8 | (0xFF000000 | n5 << 12) | n6 << 8 | n6 << 4 | n7 << 4));
            }
            if (a2 == 5) {
                final int n8 = (int)a.b;
                final int n9 = 0xF000 & n8;
                final int n10 = n8 & 0xF00;
                final int n11 = n8 & 0xF0;
                final int n12 = n8 & 0xF;
                return new SVG$f(n12 << 24 | n12 << 28 | n9 << 8 | n9 << 4 | n10 << 4 | n10 | n11 | n11 >> 4);
            }
            if (a2 == 7) {
                return new SVG$f((int)a.b | 0xFF000000);
            }
            if (a2 == 9) {
                final int n13 = (int)a.b;
                return new SVG$f(n13 >>> 8 | n13 << 24);
            }
            throw new SVGParseException(b.l("Bad hex colour value: ", s));
        }
        else {
            final String lowerCase = s.toLowerCase(Locale.US);
            final boolean startsWith = lowerCase.startsWith("rgba(");
            if (!startsWith && !lowerCase.startsWith("rgb(")) {
                final boolean startsWith2 = lowerCase.startsWith("hsla(");
                if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                    final Integer n14 = c.a.get(lowerCase);
                    if (n14 != null) {
                        return new SVG$f((int)n14);
                    }
                    throw new SVGParseException(b.l("Invalid colour keyword: ", lowerCase));
                }
                else {
                    if (startsWith2) {
                        n = 5;
                    }
                    final g g = new g(s.substring(n));
                    g.q();
                    final float j = g.i();
                    final float c = g.c(j);
                    if (!Float.isNaN(c)) {
                        g.d('%');
                    }
                    final float c2 = g.c(c);
                    if (!Float.isNaN(c2)) {
                        g.d('%');
                    }
                    if (startsWith2) {
                        final float c3 = g.c(c2);
                        g.q();
                        if (!Float.isNaN(c3) && g.d(')')) {
                            return new SVG$f(b(c3 * 256.0f) << 24 | d(j, c, c2));
                        }
                        throw new SVGParseException(b.l("Bad hsla() colour value: ", s));
                    }
                    else {
                        g.q();
                        if (!Float.isNaN(c2) && g.d(')')) {
                            return new SVG$f(d(j, c, c2) | 0xFF000000);
                        }
                        throw new SVGParseException(b.l("Bad hsl() colour value: ", s));
                    }
                }
            }
            else {
                if (startsWith) {
                    n = 5;
                }
                final g g2 = new g(s.substring(n));
                g2.q();
                float k;
                final float n15 = k = g2.i();
                if (!Float.isNaN(n15)) {
                    k = n15;
                    if (g2.d('%')) {
                        k = n15 * 256.0f / 100.0f;
                    }
                }
                float c4;
                final float n16 = c4 = g2.c(k);
                if (!Float.isNaN(n16)) {
                    c4 = n16;
                    if (g2.d('%')) {
                        c4 = n16 * 256.0f / 100.0f;
                    }
                }
                float c5;
                final float n17 = c5 = g2.c(c4);
                if (!Float.isNaN(n17)) {
                    c5 = n17;
                    if (g2.d('%')) {
                        c5 = n17 * 256.0f / 100.0f;
                    }
                }
                if (startsWith) {
                    final float c6 = g2.c(c5);
                    g2.q();
                    if (!Float.isNaN(c6) && g2.d(')')) {
                        return new SVG$f(b(c6 * 256.0f) << 24 | b(k) << 16 | b(c4) << 8 | b(c5));
                    }
                    throw new SVGParseException(b.l("Bad rgba() colour value: ", s));
                }
                else {
                    g2.q();
                    if (!Float.isNaN(c5) && g2.d(')')) {
                        return new SVG$f(b(k) << 16 | 0xFF000000 | b(c4) << 8 | b(c5));
                    }
                    throw new SVGParseException(b.l("Bad rgb() colour value: ", s));
                }
            }
        }
    }
    
    public static SVG.m0 q(final String s) {
        s.getClass();
        if (!s.equals("none")) {
            if (!s.equals("currentColor")) {
                try {
                    return (SVG.m0)p(s);
                }
                catch (final SVGParseException ex) {
                    return null;
                }
            }
            return (SVG.m0)SVG$g.f;
        }
        return (SVG.m0)SVG$f.h;
    }
    
    public static float r(final int n, final String s) throws SVGParseException {
        final float a = new fu.b().a(0, n, s);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new SVGParseException(b.l("Invalid float value: ", s));
    }
    
    public static float s(final String s) throws SVGParseException {
        final int length = s.length();
        if (length != 0) {
            return r(length, s);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }
    
    public static ArrayList t(final String s) {
        final g g = new g(s);
        ArrayList list = null;
        ArrayList list2;
        do {
            String s2;
            if ((s2 = g.k()) == null) {
                s2 = g.m(',', true);
            }
            if (s2 == null) {
                return list;
            }
            if ((list2 = list) == null) {
                list2 = new ArrayList();
            }
            list2.add(s2);
            g.p();
            list = list2;
        } while (!g.f());
        list = list2;
        return list;
    }
    
    public static SVG.Style.FontStyle u(final String s) {
        s.getClass();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case -1039745817: {
                if (!s.equals("normal")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1178781136: {
                if (!s.equals("italic")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1657669071: {
                if (!s.equals("oblique")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return SVG.Style.FontStyle.Normal;
            }
            case 1: {
                return SVG.Style.FontStyle.Italic;
            }
            case 0: {
                return SVG.Style.FontStyle.Oblique;
            }
        }
    }
    
    public static String v(final String s) {
        if (s.equals("none")) {
            return null;
        }
        if (!s.startsWith("url(")) {
            return null;
        }
        if (s.endsWith(")")) {
            return s.substring(4, s.length() - 1).trim();
        }
        return s.substring(4).trim();
    }
    
    public static SVG.o w(final String s) throws SVGParseException {
        if (s.length() != 0) {
            final int length = s.length();
            final SVG.Unit px = SVG.Unit.px;
            int n = length - 1;
            final char char1 = s.charAt(n);
            Enum<SVG.Unit> enum1;
            if (char1 == '%') {
                enum1 = SVG.Unit.percent;
            }
            else {
                n = length;
                enum1 = px;
                if (length > 2) {
                    n = length;
                    enum1 = px;
                    if (Character.isLetter(char1)) {
                        final int n2 = length - 2;
                        n = length;
                        enum1 = px;
                        if (Character.isLetter(s.charAt(n2))) {
                            final String substring = s.substring(n2);
                            try {
                                enum1 = SVG.Unit.valueOf(substring.toLowerCase(Locale.US));
                                n = n2;
                            }
                            catch (final IllegalArgumentException ex) {
                                throw new SVGParseException(b.l("Invalid length unit specifier: ", s));
                            }
                        }
                    }
                }
            }
            try {
                return new SVG.o(r(n, s), (SVG.Unit)enum1);
            }
            catch (final NumberFormatException ex2) {
                throw new SVGParseException(b.l("Invalid length value: ", s), ex2);
            }
        }
        throw new SVGParseException("Invalid length value (empty string)");
    }
    
    public static ArrayList x(String substring) throws SVGParseException {
        if (substring.length() != 0) {
            final ArrayList list = new ArrayList(1);
            final g g = new g(substring);
            g.q();
            while (!g.f()) {
                final float i = g.i();
                if (Float.isNaN(i)) {
                    final StringBuilder t = a.t("Invalid length list value: ");
                    final int b = g.b;
                    while (!g.f() && !SVGParser.g.g(g.a.charAt(g.b))) {
                        ++g.b;
                    }
                    substring = g.a.substring(b, g.b);
                    g.b = b;
                    t.append(substring);
                    throw new SVGParseException(t.toString());
                }
                Enum<SVG.Unit> enum1;
                if ((enum1 = g.n()) == null) {
                    enum1 = SVG.Unit.px;
                }
                list.add(new SVG.o(i, (SVG.Unit)enum1));
                g.p();
            }
            return list;
        }
        throw new SVGParseException("Invalid length list (empty string)");
    }
    
    public static SVG.o y(final g g) {
        if (g.e("auto")) {
            return new SVG.o(0.0f);
        }
        return g.j();
    }
    
    public static Float z(final String s) {
        try {
            final float s2 = s(s);
            float n;
            if (s2 < 0.0f) {
                n = 0.0f;
            }
            else {
                n = s2;
                if (s2 > 1.0f) {
                    n = 1.0f;
                }
            }
            return n;
        }
        catch (final SVGParseException ex) {
            return null;
        }
    }
    
    public final void E(final InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            final SAXParserFactory instance = SAXParserFactory.newInstance();
            instance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            instance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            final XMLReader xmlReader = instance.newSAXParser().getXMLReader();
            final f contentHandler = new f();
            xmlReader.setContentHandler(contentHandler);
            xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler", contentHandler);
            xmlReader.parse(new InputSource(inputStream));
        }
        catch (final IOException ex) {
            throw new SVGParseException("Stream error", ex);
        }
        catch (final SAXException ex2) {
            throw new SVGParseException("SVG parse error", ex2);
        }
        catch (final ParserConfigurationException ex3) {
            throw new SVGParseException("XML parser problem", ex3);
        }
    }
    
    public final void F(final InputStream inputStream) throws SVGParseException {
        try {
            final XmlPullParser pullParser = Xml.newPullParser();
            final h h = new h(pullParser);
            pullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            pullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            pullParser.setInput(inputStream, (String)null);
            for (int i = pullParser.getEventType(); i != 1; i = pullParser.nextToken()) {
                if (i != 0) {
                    if (i != 8) {
                        if (i != 10) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 5) {
                                            this.L(pullParser.getText());
                                        }
                                    }
                                    else {
                                        final int[] array = new int[2];
                                        this.M(pullParser.getTextCharacters(array), array[0], array[1]);
                                    }
                                }
                                else {
                                    String s = pullParser.getName();
                                    if (pullParser.getPrefix() != null) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(pullParser.getPrefix());
                                        sb.append(':');
                                        sb.append(s);
                                        s = sb.toString();
                                    }
                                    this.c(pullParser.getNamespace(), pullParser.getName(), s);
                                }
                            }
                            else {
                                String s2 = pullParser.getName();
                                if (pullParser.getPrefix() != null) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append(pullParser.getPrefix());
                                    sb2.append(':');
                                    sb2.append(s2);
                                    s2 = sb2.toString();
                                }
                                this.J(pullParser.getNamespace(), pullParser.getName(), s2, h);
                            }
                        }
                        else if (this.a.a == null && pullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                this.E(inputStream);
                            }
                            catch (final IOException ex) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            }
                            return;
                        }
                    }
                    else {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("PROC INSTR: ");
                        sb3.append(pullParser.getText());
                        Log.d("SVGParser", sb3.toString());
                        final g g = new g(pullParser.getText());
                        final String l = g.l();
                        C(g);
                        l.equals("xml-stylesheet");
                    }
                }
                else {
                    this.a = new SVG();
                }
            }
        }
        catch (final IOException ex2) {
            throw new SVGParseException("Stream error", ex2);
        }
        catch (final XmlPullParserException ex3) {
            throw new SVGParseException("XML parser problem", (Exception)ex3);
        }
    }
    
    public final void G(final Attributes attributes) throws SVGParseException {
        if (this.b != null) {
            final SVG$x b = new SVG$x();
            ((SVG.l0)b).a = this.a;
            ((SVG.l0)b).b = this.b;
            i((SVG$j0)b, attributes);
            l((SVG$j0)b, attributes);
            h((SVG.e0)b, attributes);
            o((SVG$p0)b, attributes);
            for (int i = 0; i < attributes.getLength(); ++i) {
                final String trim = attributes.getValue(i).trim();
                final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 6) {
                                    switch (n) {
                                        case 42: {
                                            b.s = D(trim);
                                            break;
                                        }
                                        case 41: {
                                            if ("objectBoundingBox".equals(trim)) {
                                                b.r = Boolean.FALSE;
                                                break;
                                            }
                                            if ("userSpaceOnUse".equals(trim)) {
                                                b.r = Boolean.TRUE;
                                                break;
                                            }
                                            throw new SVGParseException("Invalid value for attribute patternContentUnits");
                                        }
                                        case 40: {
                                            if ("objectBoundingBox".equals(trim)) {
                                                b.q = Boolean.FALSE;
                                                break;
                                            }
                                            if ("userSpaceOnUse".equals(trim)) {
                                                b.q = Boolean.TRUE;
                                                break;
                                            }
                                            throw new SVGParseException("Invalid value for attribute patternUnits");
                                        }
                                    }
                                }
                                else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                                    b.x = trim;
                                }
                            }
                            else {
                                final SVG.o w = w(trim);
                                b.w = w;
                                if (w.g()) {
                                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                                }
                            }
                        }
                        else {
                            final SVG.o w2 = w(trim);
                            b.v = w2;
                            if (w2.g()) {
                                throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                            }
                        }
                    }
                    else {
                        b.u = w(trim);
                    }
                }
                else {
                    b.t = w(trim);
                }
            }
            this.b.j((SVG.l0)b);
            this.b = (SVG.h0)b;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
    
    public final void I(final Attributes attributes) throws SVGParseException {
        if (this.b != null) {
            final SVG$b0 b = new SVG$b0();
            ((SVG.l0)b).a = this.a;
            ((SVG.l0)b).b = this.b;
            i((SVG$j0)b, attributes);
            l((SVG$j0)b, attributes);
            this.b.j((SVG.l0)b);
            this.b = (SVG.h0)b;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
    
    public final void J(String s, String p4, final String s2, final Attributes attributes) throws SVGParseException {
        if (this.c) {
            ++this.d;
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(s) && !"".equals(s)) {
            return;
        }
        if (p4.length() <= 0) {
            p4 = s2;
        }
        final SVGElem fromString = SVGElem.fromString(p4);
        final int n = SVGParser$a.a[fromString.ordinal()];
        float n2 = 0.0f;
        final int n3 = 0;
        final int n4 = 0;
        final int n5 = 0;
        final int n6 = 0;
        final int n7 = 0;
        int i = 0;
        final int n8 = 0;
        final int n9 = 0;
        final int n10 = 0;
        final int n11 = 0;
        switch (n) {
            default: {
                this.c = true;
                this.d = 1;
                break;
            }
            case 31: {
                this.I(attributes);
                break;
            }
            case 30: {
                this.K(attributes);
                break;
            }
            case 29: {
                this.g(attributes);
                break;
            }
            case 28: {
                if (this.b != null) {
                    final SVG$c1 b = new SVG$c1();
                    ((SVG.l0)b).a = this.a;
                    ((SVG.l0)b).b = this.b;
                    i((SVG$j0)b, attributes);
                    h((SVG.e0)b, attributes);
                    o((SVG$p0)b, attributes);
                    this.b.j((SVG.l0)b);
                    this.b = (SVG.h0)b;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 27: {
                this.f(attributes);
                break;
            }
            case 26: {
                this.G(attributes);
                break;
            }
            case 25: {
                if (this.b == null) {
                    throw new SVGParseException("Invalid document. Root element must be <svg>");
                }
                final SVG$x0 b2 = new SVG$x0();
                ((SVG.l0)b2).a = this.a;
                ((SVG.l0)b2).b = this.b;
                i((SVG$j0)b2, attributes);
                l((SVG$j0)b2, attributes);
                h((SVG.e0)b2, attributes);
                for (int j = n11; j < attributes.getLength(); ++j) {
                    p4 = attributes.getValue(j).trim();
                    final int n12 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(j)).ordinal()];
                    if (n12 != 6) {
                        if (n12 == 39) {
                            b2.p = w(p4);
                        }
                    }
                    else if ("".equals(attributes.getURI(j)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(j))) {
                        b2.o = p4;
                    }
                }
                this.b.j((SVG.l0)b2);
                this.b = (SVG.h0)b2;
                final SVG.h0 b3 = ((SVG.l0)b2).b;
                if (b3 instanceof SVG.z0) {
                    b2.q = (SVG.z0)b3;
                    break;
                }
                b2.q = ((SVG.v0)b3).b();
                break;
            }
            case 24: {
                if (this.b != null) {
                    final SVG$e b4 = new SVG$e();
                    ((SVG.l0)b4).a = this.a;
                    ((SVG.l0)b4).b = this.b;
                    i((SVG$j0)b4, attributes);
                    l((SVG$j0)b4, attributes);
                    n((SVG.m)b4, attributes);
                    h((SVG.e0)b4, attributes);
                    for (int k = n3; k < attributes.getLength(); ++k) {
                        s = attributes.getValue(k).trim();
                        if (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(k)).ordinal()] == 38) {
                            if ("objectBoundingBox".equals(s)) {
                                b4.p = Boolean.FALSE;
                            }
                            else {
                                if (!"userSpaceOnUse".equals(s)) {
                                    throw new SVGParseException("Invalid value for attribute clipPathUnits");
                                }
                                b4.p = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.j((SVG.l0)b4);
                    this.b = (SVG.h0)b4;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 22:
            case 23: {
                this.e = true;
                this.f = fromString;
                break;
            }
            case 21: {
                final SVG.h0 b5 = this.b;
                if (b5 == null) {
                    throw new SVGParseException("Invalid document. Root element must be <svg>");
                }
                if (b5 instanceof SVG$j) {
                    final SVG$c0 b6 = new SVG$c0();
                    ((SVG.l0)b6).a = this.a;
                    ((SVG.l0)b6).b = this.b;
                    i((SVG$j0)b6, attributes);
                    l((SVG$j0)b6, attributes);
                    int l = 0;
                    while (l < attributes.getLength()) {
                        s = attributes.getValue(l).trim();
                        Label_1037: {
                            if (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(l)).ordinal()] != 37) {
                                break Label_1037;
                            }
                            if (s.length() == 0) {
                                throw new SVGParseException("Invalid offset value in <stop> (empty string)");
                            }
                            int length = s.length();
                            boolean b7;
                            if (s.charAt(s.length() - 1) == '%') {
                                --length;
                                b7 = true;
                            }
                            else {
                                b7 = false;
                            }
                            try {
                                final float r = r(length, s);
                                final float n13 = 100.0f;
                                float n14 = r;
                                if (b7) {
                                    n14 = r / 100.0f;
                                }
                                if (n14 < 0.0f) {
                                    n14 = 0.0f;
                                }
                                else if (n14 > 100.0f) {
                                    n14 = n13;
                                }
                                b6.h = n14;
                                ++l;
                                continue;
                            }
                            catch (final NumberFormatException ex) {
                                throw new SVGParseException(b.l("Invalid offset value in <stop>: ", s), ex);
                            }
                        }
                        throw new SVGParseException("Invalid offset value in <stop> (empty string)");
                    }
                    this.b.j((SVG.l0)b6);
                    this.b = (SVG.h0)b6;
                    break;
                }
                throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
            }
            case 20: {
                if (this.b != null) {
                    final SVG.o0 b8 = new SVG.o0();
                    ((SVG.l0)b8).a = this.a;
                    ((SVG.l0)b8).b = this.b;
                    i((SVG$j0)b8, attributes);
                    l((SVG$j0)b8, attributes);
                    j(b8, attributes);
                    for (int n15 = n4; n15 < attributes.getLength(); ++n15) {
                        p4 = attributes.getValue(n15).trim();
                        final int n16 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n15)).ordinal()];
                        if (n16 != 35) {
                            if (n16 != 36) {
                                switch (n16) {
                                    case 14: {
                                        final SVG.o w = w(p4);
                                        b8.o = w;
                                        if (!w.g()) {
                                            break;
                                        }
                                        throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                                    }
                                    case 13: {
                                        b8.n = w(p4);
                                        break;
                                    }
                                    case 12: {
                                        b8.m = w(p4);
                                        break;
                                    }
                                }
                            }
                            else {
                                b8.q = w(p4);
                            }
                        }
                        else {
                            b8.p = w(p4);
                        }
                    }
                    this.b.j((SVG.l0)b8);
                    this.b = (SVG.h0)b8;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 19: {
                if (this.b != null) {
                    final SVG.k0 b9 = new SVG.k0();
                    ((SVG.l0)b9).a = this.a;
                    ((SVG.l0)b9).b = this.b;
                    i((SVG$j0)b9, attributes);
                    l((SVG$j0)b9, attributes);
                    j(b9, attributes);
                    for (int n17 = n5; n17 < attributes.getLength(); ++n17) {
                        p4 = attributes.getValue(n17).trim();
                        switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n17)).ordinal()]) {
                            case 18: {
                                b9.p = w(p4);
                                break;
                            }
                            case 17: {
                                b9.o = w(p4);
                                break;
                            }
                            case 16: {
                                b9.n = w(p4);
                                break;
                            }
                            case 15: {
                                b9.m = w(p4);
                                break;
                            }
                        }
                    }
                    this.b.j((SVG.l0)b9);
                    this.b = (SVG.h0)b9;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 18: {
                if (this.b != null) {
                    final SVG$q b10 = new SVG$q();
                    ((SVG.l0)b10).a = this.a;
                    ((SVG.l0)b10).b = this.b;
                    i((SVG$j0)b10, attributes);
                    l((SVG$j0)b10, attributes);
                    h((SVG.e0)b10, attributes);
                    o((SVG$p0)b10, attributes);
                    for (int n18 = 0; n18 < attributes.getLength(); ++n18) {
                        p4 = attributes.getValue(n18).trim();
                        switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n18)).ordinal()]) {
                            case 31: {
                                if ("auto".equals(p4)) {
                                    b10.v = Float.NaN;
                                    break;
                                }
                                b10.v = s(p4);
                                break;
                            }
                            case 30: {
                                if ("strokeWidth".equals(p4)) {
                                    b10.q = false;
                                    break;
                                }
                                if ("userSpaceOnUse".equals(p4)) {
                                    b10.q = true;
                                    break;
                                }
                                throw new SVGParseException("Invalid value for attribute markerUnits");
                            }
                            case 29: {
                                final SVG.o w2 = w(p4);
                                b10.u = w2;
                                if (!w2.g()) {
                                    break;
                                }
                                throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                            }
                            case 28: {
                                final SVG.o w3 = w(p4);
                                b10.t = w3;
                                if (!w3.g()) {
                                    break;
                                }
                                throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                            }
                            case 27: {
                                b10.s = w(p4);
                                break;
                            }
                            case 26: {
                                b10.r = w(p4);
                                break;
                            }
                        }
                    }
                    this.b.j((SVG.l0)b10);
                    this.b = (SVG.h0)b10;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 17: {
                if (this.b != null) {
                    final SVG$r0 b11 = new SVG$r0();
                    ((SVG.l0)b11).a = this.a;
                    ((SVG.l0)b11).b = this.b;
                    i((SVG$j0)b11, attributes);
                    l((SVG$j0)b11, attributes);
                    h((SVG.e0)b11, attributes);
                    o((SVG$p0)b11, attributes);
                    this.b.j((SVG.l0)b11);
                    this.b = (SVG.h0)b11;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 16: {
                if (this.b != null) {
                    final SVG$q0 b12 = new SVG$q0();
                    ((SVG.l0)b12).a = this.a;
                    ((SVG.l0)b12).b = this.b;
                    i((SVG$j0)b12, attributes);
                    l((SVG$j0)b12, attributes);
                    n((SVG.m)b12, attributes);
                    h((SVG.e0)b12, attributes);
                    this.b.j((SVG.l0)b12);
                    this.b = (SVG.h0)b12;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 15: {
                final SVG.h0 b13 = this.b;
                if (b13 == null) {
                    throw new SVGParseException("Invalid document. Root element must be <svg>");
                }
                if (!(b13 instanceof SVG$w0)) {
                    throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                }
                final SVG$s0 svg$s0 = new SVG$s0();
                ((SVG.l0)svg$s0).a = this.a;
                ((SVG.l0)svg$s0).b = this.b;
                i((SVG$j0)svg$s0, attributes);
                l((SVG$j0)svg$s0, attributes);
                h((SVG.e0)svg$s0, attributes);
                for (int n19 = n6; n19 < attributes.getLength(); ++n19) {
                    p4 = attributes.getValue(n19).trim();
                    if (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n19)).ordinal()] == 6) {
                        if ("".equals(attributes.getURI(n19)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(n19))) {
                            svg$s0.o = p4;
                        }
                    }
                }
                this.b.j((SVG.l0)svg$s0);
                final SVG.h0 b14 = ((SVG.l0)svg$s0).b;
                if (b14 instanceof SVG.z0) {
                    svg$s0.p = (SVG.z0)b14;
                    break;
                }
                svg$s0.p = ((SVG.v0)b14).b();
                break;
            }
            case 14: {
                final SVG.h0 b15 = this.b;
                if (b15 == null) {
                    throw new SVGParseException("Invalid document. Root element must be <svg>");
                }
                if (!(b15 instanceof SVG$w0)) {
                    throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                }
                final SVG$t0 b16 = new SVG$t0();
                ((SVG.l0)b16).a = this.a;
                ((SVG.l0)b16).b = this.b;
                i((SVG$j0)b16, attributes);
                l((SVG$j0)b16, attributes);
                h((SVG.e0)b16, attributes);
                m((SVG$y0)b16, attributes);
                this.b.j((SVG.l0)b16);
                this.b = (SVG.h0)b16;
                final SVG.h0 b17 = ((SVG.l0)b16).b;
                if (b17 instanceof SVG.z0) {
                    b16.s = (SVG.z0)b17;
                    break;
                }
                b16.s = ((SVG.v0)b17).b();
                break;
            }
            case 13: {
                if (this.b != null) {
                    final SVG$u0 b18 = new SVG$u0();
                    ((SVG.l0)b18).a = this.a;
                    ((SVG.l0)b18).b = this.b;
                    i((SVG$j0)b18, attributes);
                    l((SVG$j0)b18, attributes);
                    n((SVG.m)b18, attributes);
                    h((SVG.e0)b18, attributes);
                    m((SVG$y0)b18, attributes);
                    this.b.j((SVG.l0)b18);
                    this.b = (SVG.h0)b18;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 12: {
                if (this.b != null) {
                    final SVG$z svg$z = new SVG$z();
                    ((SVG.l0)svg$z).a = this.a;
                    ((SVG.l0)svg$z).b = this.b;
                    i((SVG$j0)svg$z, attributes);
                    l((SVG$j0)svg$z, attributes);
                    n((SVG.m)svg$z, attributes);
                    h((SVG.e0)svg$z, attributes);
                    k((SVG$y)svg$z, attributes, "polygon");
                    this.b.j((SVG.l0)svg$z);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 11: {
                if (this.b != null) {
                    final SVG$y svg$y = new SVG$y();
                    ((SVG.l0)svg$y).a = this.a;
                    ((SVG.l0)svg$y).b = this.b;
                    i((SVG$j0)svg$y, attributes);
                    l((SVG$j0)svg$y, attributes);
                    n((SVG.m)svg$y, attributes);
                    h((SVG.e0)svg$y, attributes);
                    k(svg$y, attributes, "polyline");
                    this.b.j((SVG.l0)svg$y);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 10: {
                if (this.b != null) {
                    final SVG$p svg$p = new SVG$p();
                    ((SVG.l0)svg$p).a = this.a;
                    ((SVG.l0)svg$p).b = this.b;
                    i((SVG$j0)svg$p, attributes);
                    l((SVG$j0)svg$p, attributes);
                    n((SVG.m)svg$p, attributes);
                    h((SVG.e0)svg$p, attributes);
                    for (int n20 = n7; n20 < attributes.getLength(); ++n20) {
                        p4 = attributes.getValue(n20).trim();
                        switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n20)).ordinal()]) {
                            case 18: {
                                svg$p.r = w(p4);
                                break;
                            }
                            case 17: {
                                svg$p.q = w(p4);
                                break;
                            }
                            case 16: {
                                svg$p.p = w(p4);
                                break;
                            }
                            case 15: {
                                svg$p.o = w(p4);
                                break;
                            }
                        }
                    }
                    this.b.j((SVG.l0)svg$p);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 9: {
                if (this.b != null) {
                    final SVG$i svg$i = new SVG$i();
                    ((SVG.l0)svg$i).a = this.a;
                    ((SVG.l0)svg$i).b = this.b;
                    i((SVG$j0)svg$i, attributes);
                    l((SVG$j0)svg$i, attributes);
                    n((SVG.m)svg$i, attributes);
                    h((SVG.e0)svg$i, attributes);
                    while (i < attributes.getLength()) {
                        p4 = attributes.getValue(i).trim();
                        switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                            case 13: {
                                svg$i.p = w(p4);
                                break;
                            }
                            case 12: {
                                svg$i.o = w(p4);
                                break;
                            }
                            case 11: {
                                final SVG.o w4 = w(p4);
                                svg$i.r = w4;
                                if (!w4.g()) {
                                    break;
                                }
                                throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                            }
                            case 10: {
                                final SVG.o w5 = w(p4);
                                svg$i.q = w5;
                                if (!w5.g()) {
                                    break;
                                }
                                throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                            }
                        }
                        ++i;
                    }
                    this.b.j((SVG.l0)svg$i);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 8: {
                if (this.b != null) {
                    final SVG$d svg$d = new SVG$d();
                    ((SVG.l0)svg$d).a = this.a;
                    ((SVG.l0)svg$d).b = this.b;
                    i((SVG$j0)svg$d, attributes);
                    l((SVG$j0)svg$d, attributes);
                    n((SVG.m)svg$d, attributes);
                    h((SVG.e0)svg$d, attributes);
                    for (int n21 = n8; n21 < attributes.getLength(); ++n21) {
                        p4 = attributes.getValue(n21).trim();
                        switch (SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n21)).ordinal()]) {
                            case 14: {
                                final SVG.o w6 = w(p4);
                                svg$d.q = w6;
                                if (!w6.g()) {
                                    break;
                                }
                                throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                            }
                            case 13: {
                                svg$d.p = w(p4);
                                break;
                            }
                            case 12: {
                                svg$d.o = w(p4);
                                break;
                            }
                        }
                    }
                    this.b.j((SVG.l0)svg$d);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 7: {
                if (this.b != null) {
                    final SVG$a0 svg$a0 = new SVG$a0();
                    ((SVG.l0)svg$a0).a = this.a;
                    ((SVG.l0)svg$a0).b = this.b;
                    i((SVG$j0)svg$a0, attributes);
                    l((SVG$j0)svg$a0, attributes);
                    n((SVG.m)svg$a0, attributes);
                    h((SVG.e0)svg$a0, attributes);
                    for (int n22 = n9; n22 < attributes.getLength(); ++n22) {
                        p4 = attributes.getValue(n22).trim();
                        final int n23 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n22)).ordinal()];
                        if (n23 != 1) {
                            if (n23 != 2) {
                                if (n23 != 3) {
                                    if (n23 != 4) {
                                        if (n23 != 10) {
                                            if (n23 == 11) {
                                                final SVG.o w7 = w(p4);
                                                svg$a0.t = w7;
                                                if (w7.g()) {
                                                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                                                }
                                            }
                                        }
                                        else {
                                            final SVG.o w8 = w(p4);
                                            svg$a0.s = w8;
                                            if (w8.g()) {
                                                throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                                            }
                                        }
                                    }
                                    else {
                                        final SVG.o w9 = w(p4);
                                        svg$a0.r = w9;
                                        if (w9.g()) {
                                            throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                                        }
                                    }
                                }
                                else {
                                    final SVG.o w10 = w(p4);
                                    svg$a0.q = w10;
                                    if (w10.g()) {
                                        throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                                    }
                                }
                            }
                            else {
                                svg$a0.p = w(p4);
                            }
                        }
                        else {
                            svg$a0.o = w(p4);
                        }
                    }
                    this.b.j((SVG.l0)svg$a0);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 6: {
                if (this.b != null) {
                    final SVG$u svg$u = new SVG$u();
                    ((SVG.l0)svg$u).a = this.a;
                    ((SVG.l0)svg$u).b = this.b;
                    i((SVG$j0)svg$u, attributes);
                    l((SVG$j0)svg$u, attributes);
                    n((SVG.m)svg$u, attributes);
                    h((SVG.e0)svg$u, attributes);
                    for (int n24 = n10; n24 < attributes.getLength(); ++n24) {
                        p4 = attributes.getValue(n24).trim();
                        final int n25 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n24)).ordinal()];
                        if (n25 != 8) {
                            if (n25 == 9) {
                                if (s(p4) < n2) {
                                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                                }
                            }
                        }
                        else {
                            final g g = new g(p4);
                            final SVG$v o = new SVG$v();
                            Label_5643: {
                                if (!g.f()) {
                                    int n26 = g.h();
                                    if (n26 == 77 || n26 == 109) {
                                        final float n27 = n2;
                                        float n29;
                                        float n28 = n29 = n27;
                                        float n31;
                                        float n30 = n31 = n29;
                                        float n32 = n2;
                                        float n33 = n27;
                                    Label_5640:
                                        while (true) {
                                            g.q();
                                            float n35 = 0.0f;
                                            float n41 = 0.0f;
                                            Label_5302: {
                                                float n34 = 0.0f;
                                                switch (n26) {
                                                    default: {
                                                        break Label_5640;
                                                    }
                                                    case 90:
                                                    case 122: {
                                                        o.close();
                                                        n34 = (n35 = n30);
                                                        n28 = n31;
                                                        break;
                                                    }
                                                    case 86:
                                                    case 118: {
                                                        final float m = g.i();
                                                        if (Float.isNaN(m)) {
                                                            final StringBuilder t = a.t("Bad path coords for ");
                                                            t.append((char)n26);
                                                            t.append(" path segment");
                                                            Log.e("SVGParser", t.toString());
                                                            break Label_5640;
                                                        }
                                                        float n36 = m;
                                                        if (n26 == 118) {
                                                            n36 = m + n28;
                                                        }
                                                        o.b(n32, n36);
                                                        n28 = n36;
                                                        n34 = n33;
                                                        n35 = n32;
                                                        break;
                                                    }
                                                    case 84:
                                                    case 116: {
                                                        final float n37 = n32 * 2.0f - n33;
                                                        final float n38 = n28 * 2.0f - n29;
                                                        final float i2 = g.i();
                                                        final float c = g.c(i2);
                                                        if (Float.isNaN(c)) {
                                                            final StringBuilder t2 = a.t("Bad path coords for ");
                                                            t2.append((char)n26);
                                                            t2.append(" path segment");
                                                            Log.e("SVGParser", t2.toString());
                                                            break Label_5640;
                                                        }
                                                        float n39 = i2;
                                                        float n40 = c;
                                                        if (n26 == 116) {
                                                            n39 = i2 + n32;
                                                            n40 = c + n28;
                                                        }
                                                        n28 = n40;
                                                        o.d(n37, n38, n39, n28);
                                                        n35 = n39;
                                                        n29 = n38;
                                                        n41 = n37;
                                                        break Label_5302;
                                                    }
                                                    case 83:
                                                    case 115: {
                                                        final float i3 = g.i();
                                                        final float c2 = g.c(i3);
                                                        final float c3 = g.c(c2);
                                                        final float c4 = g.c(c3);
                                                        if (Float.isNaN(c4)) {
                                                            final StringBuilder t3 = a.t("Bad path coords for ");
                                                            t3.append((char)n26);
                                                            t3.append(" path segment");
                                                            Log.e("SVGParser", t3.toString());
                                                            break Label_5640;
                                                        }
                                                        float n42 = c3;
                                                        float n43 = i3;
                                                        float n44 = c2;
                                                        float n45 = c4;
                                                        if (n26 == 115) {
                                                            n42 = c3 + n32;
                                                            n45 = c4 + n28;
                                                            n43 = i3 + n32;
                                                            n44 = c2 + n28;
                                                        }
                                                        o.c(n32 * 2.0f - n33, n28 * 2.0f - n29, n43, n44, n42, n45);
                                                        n35 = n42;
                                                        n29 = n44;
                                                        n28 = n45;
                                                        n41 = n43;
                                                        break Label_5302;
                                                    }
                                                    case 81:
                                                    case 113: {
                                                        final float i4 = g.i();
                                                        final float c5 = g.c(i4);
                                                        final float c6 = g.c(c5);
                                                        final float c7 = g.c(c6);
                                                        if (Float.isNaN(c7)) {
                                                            final StringBuilder t4 = a.t("Bad path coords for ");
                                                            t4.append((char)n26);
                                                            t4.append(" path segment");
                                                            Log.e("SVGParser", t4.toString());
                                                            break Label_5640;
                                                        }
                                                        float n46 = i4;
                                                        float n47 = c5;
                                                        n35 = c6;
                                                        float n48 = c7;
                                                        if (n26 == 113) {
                                                            n35 = c6 + n32;
                                                            n48 = c7 + n28;
                                                            n46 = i4 + n32;
                                                            n47 = c5 + n28;
                                                        }
                                                        n41 = n46;
                                                        n28 = n48;
                                                        n29 = n47;
                                                        o.d(n41, n29, n35, n28);
                                                        break Label_5302;
                                                    }
                                                    case 77:
                                                    case 109: {
                                                        final float i5 = g.i();
                                                        final float c8 = g.c(i5);
                                                        if (Float.isNaN(c8)) {
                                                            final StringBuilder t5 = a.t("Bad path coords for ");
                                                            t5.append((char)n26);
                                                            t5.append(" path segment");
                                                            Log.e("SVGParser", t5.toString());
                                                            break Label_5640;
                                                        }
                                                        float n49 = i5;
                                                        float n50 = c8;
                                                        if (n26 == 109) {
                                                            final boolean b19 = o.b == 0;
                                                            n49 = i5;
                                                            n50 = c8;
                                                            if (!b19) {
                                                                n49 = i5 + n32;
                                                                n50 = c8 + n28;
                                                            }
                                                        }
                                                        n28 = n50;
                                                        o.a(n49, n28);
                                                        if (n26 == 109) {
                                                            n26 = 108;
                                                        }
                                                        else {
                                                            n26 = 76;
                                                        }
                                                        n35 = n49;
                                                        n41 = (n30 = n35);
                                                        n29 = (n31 = n28);
                                                        break Label_5302;
                                                    }
                                                    case 76:
                                                    case 108: {
                                                        final float i6 = g.i();
                                                        final float c9 = g.c(i6);
                                                        if (Float.isNaN(c9)) {
                                                            final StringBuilder t6 = a.t("Bad path coords for ");
                                                            t6.append((char)n26);
                                                            t6.append(" path segment");
                                                            Log.e("SVGParser", t6.toString());
                                                            break Label_5640;
                                                        }
                                                        float n51 = i6;
                                                        float n52 = c9;
                                                        if (n26 == 108) {
                                                            n51 = i6 + n32;
                                                            n52 = c9 + n28;
                                                        }
                                                        o.b(n51, n52);
                                                        n28 = n52;
                                                        final float n53 = n51;
                                                        n35 = n51;
                                                        n34 = n53;
                                                        break;
                                                    }
                                                    case 72:
                                                    case 104: {
                                                        final float i7 = g.i();
                                                        if (Float.isNaN(i7)) {
                                                            final StringBuilder t7 = a.t("Bad path coords for ");
                                                            t7.append((char)n26);
                                                            t7.append(" path segment");
                                                            Log.e("SVGParser", t7.toString());
                                                            break Label_5640;
                                                        }
                                                        float n54 = i7;
                                                        if (n26 == 104) {
                                                            n54 = i7 + n32;
                                                        }
                                                        n41 = n54;
                                                        o.b(n41, n28);
                                                        n35 = n41;
                                                        break Label_5302;
                                                    }
                                                    case 67:
                                                    case 99: {
                                                        final float i8 = g.i();
                                                        final float c10 = g.c(i8);
                                                        final float c11 = g.c(c10);
                                                        final float c12 = g.c(c11);
                                                        final float c13 = g.c(c12);
                                                        final float c14 = g.c(c13);
                                                        if (Float.isNaN(c14)) {
                                                            final StringBuilder t8 = a.t("Bad path coords for ");
                                                            t8.append((char)n26);
                                                            t8.append(" path segment");
                                                            Log.e("SVGParser", t8.toString());
                                                            break Label_5640;
                                                        }
                                                        float n55 = i8;
                                                        float n56 = c10;
                                                        float n57 = c11;
                                                        float n58 = c12;
                                                        float n59 = c13;
                                                        float n60 = c14;
                                                        if (n26 == 99) {
                                                            n59 = c13 + n32;
                                                            n60 = c14 + n28;
                                                            n55 = i8 + n32;
                                                            n56 = c10 + n28;
                                                            n57 = c11 + n32;
                                                            n58 = c12 + n28;
                                                        }
                                                        o.c(n55, n56, n57, n58, n59, n60);
                                                        final float n61 = n58;
                                                        final float n62 = n59;
                                                        n41 = n57;
                                                        n29 = n61;
                                                        n28 = n60;
                                                        n35 = n62;
                                                        break Label_5302;
                                                    }
                                                    case 65:
                                                    case 97: {
                                                        final float i9 = g.i();
                                                        final float c15 = g.c(i9);
                                                        final float c16 = g.c(c15);
                                                        final Boolean b20 = g.b(c16);
                                                        final Boolean b21 = g.b(b20);
                                                        float i10;
                                                        if (b21 == null) {
                                                            i10 = Float.NaN;
                                                        }
                                                        else {
                                                            g.p();
                                                            i10 = g.i();
                                                        }
                                                        final float n63 = i10;
                                                        final float c17 = g.c(n63);
                                                        if (!Float.isNaN(c17) && i9 >= 0.0f && c15 >= 0.0f) {
                                                            n35 = n63;
                                                            float n64 = c17;
                                                            if (n26 == 97) {
                                                                n35 = n63 + n32;
                                                                n64 = c17 + n28;
                                                            }
                                                            o.e(i9, c15, c16, (boolean)b20, (boolean)b21, n35, n64);
                                                            n41 = n35;
                                                            n28 = (n29 = n64);
                                                            break Label_5302;
                                                        }
                                                        final StringBuilder t9 = a.t("Bad path coords for ");
                                                        t9.append((char)n26);
                                                        t9.append(" path segment");
                                                        Log.e("SVGParser", t9.toString());
                                                        n2 = 0.0f;
                                                        break Label_5643;
                                                    }
                                                }
                                                n41 = n34;
                                                n29 = n28;
                                            }
                                            final float n65 = 0.0f;
                                            g.p();
                                            if (g.f()) {
                                                n2 = n65;
                                                break Label_5643;
                                            }
                                            final int b22 = g.b;
                                            boolean b23 = false;
                                            Label_5570: {
                                                if (b22 != g.c) {
                                                    final char char1 = g.a.charAt(b22);
                                                    if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
                                                        b23 = true;
                                                        break Label_5570;
                                                    }
                                                }
                                                b23 = false;
                                            }
                                            if (b23) {
                                                n26 = g.h();
                                            }
                                            final float n66 = n35;
                                            n33 = n41;
                                            n32 = n66;
                                        }
                                        n2 = 0.0f;
                                    }
                                }
                            }
                            svg$u.o = o;
                        }
                    }
                    this.b.j((SVG.l0)svg$u);
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 5: {
                if (this.b != null) {
                    final SVG$b1 b24 = new SVG$b1();
                    ((SVG.l0)b24).a = this.a;
                    ((SVG.l0)b24).b = this.b;
                    i((SVG$j0)b24, attributes);
                    l((SVG$j0)b24, attributes);
                    n((SVG.m)b24, attributes);
                    h((SVG.e0)b24, attributes);
                    for (int n67 = 0; n67 < attributes.getLength(); ++n67) {
                        p4 = attributes.getValue(n67).trim();
                        final int n68 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n67)).ordinal()];
                        if (n68 != 1) {
                            if (n68 != 2) {
                                if (n68 != 3) {
                                    if (n68 != 4) {
                                        if (n68 == 6) {
                                            if ("".equals(attributes.getURI(n67)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(n67))) {
                                                b24.p = p4;
                                            }
                                        }
                                    }
                                    else {
                                        final SVG.o w11 = w(p4);
                                        b24.t = w11;
                                        if (w11.g()) {
                                            throw new SVGParseException("Invalid <use> element. height cannot be negative");
                                        }
                                    }
                                }
                                else {
                                    final SVG.o w12 = w(p4);
                                    b24.s = w12;
                                    if (w12.g()) {
                                        throw new SVGParseException("Invalid <use> element. width cannot be negative");
                                    }
                                }
                            }
                            else {
                                b24.r = w(p4);
                            }
                        }
                        else {
                            b24.q = w(p4);
                        }
                    }
                    this.b.j((SVG.l0)b24);
                    this.b = (SVG.h0)b24;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 4: {
                if (this.b != null) {
                    final SVG$h b25 = new SVG$h();
                    ((SVG.l0)b25).a = this.a;
                    ((SVG.l0)b25).b = this.b;
                    i((SVG$j0)b25, attributes);
                    l((SVG$j0)b25, attributes);
                    n((SVG.m)b25, attributes);
                    this.b.j((SVG.l0)b25);
                    this.b = (SVG.h0)b25;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 2:
            case 3: {
                if (this.b != null) {
                    final SVG$l b26 = new SVG$l();
                    ((SVG.l0)b26).a = this.a;
                    ((SVG.l0)b26).b = this.b;
                    i((SVG$j0)b26, attributes);
                    l((SVG$j0)b26, attributes);
                    n((SVG.m)b26, attributes);
                    h((SVG.e0)b26, attributes);
                    this.b.j((SVG.l0)b26);
                    this.b = (SVG.h0)b26;
                    break;
                }
                throw new SVGParseException("Invalid document. Root element must be <svg>");
            }
            case 1: {
                final SVG$d0 svg$d2 = new SVG$d0();
                ((SVG.l0)svg$d2).a = this.a;
                ((SVG.l0)svg$d2).b = this.b;
                i((SVG$j0)svg$d2, attributes);
                l((SVG$j0)svg$d2, attributes);
                h((SVG.e0)svg$d2, attributes);
                o((SVG$p0)svg$d2, attributes);
                for (int n69 = 0; n69 < attributes.getLength(); ++n69) {
                    p4 = attributes.getValue(n69).trim();
                    final int n70 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(n69)).ordinal()];
                    if (n70 != 1) {
                        if (n70 != 2) {
                            if (n70 != 3) {
                                if (n70 == 4) {
                                    final SVG.o w13 = w(p4);
                                    svg$d2.t = w13;
                                    if (w13.g()) {
                                        throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                                    }
                                }
                            }
                            else {
                                final SVG.o w14 = w(p4);
                                svg$d2.s = w14;
                                if (w14.g()) {
                                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                                }
                            }
                        }
                        else {
                            svg$d2.r = w(p4);
                        }
                    }
                    else {
                        svg$d2.q = w(p4);
                    }
                }
                final SVG.h0 b27 = this.b;
                if (b27 == null) {
                    this.a.a = svg$d2;
                }
                else {
                    b27.j((SVG.l0)svg$d2);
                }
                this.b = (SVG.h0)svg$d2;
                break;
            }
        }
    }
    
    public final void K(final Attributes attributes) throws SVGParseException {
        if (this.b != null) {
            final int n = 0;
            String s = "all";
            int i = 0;
            boolean equals = true;
            while (i < attributes.getLength()) {
                final String trim = attributes.getValue(i).trim();
                final int n2 = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (n2 != 88) {
                    if (n2 == 89) {
                        s = trim;
                    }
                }
                else {
                    equals = trim.equals("text/css");
                }
                ++i;
            }
            Label_0187: {
                if (equals) {
                    final CSSParser$MediaType screen = CSSParser$MediaType.screen;
                    final CSSParser$c cssParser$c = new CSSParser$c(s);
                    ((g)cssParser$c).q();
                    final Iterator iterator = CSSParser.c(cssParser$c).iterator();
                    while (true) {
                        CSSParser$MediaType cssParser$MediaType;
                        do {
                            final int n3 = n;
                            if (iterator.hasNext()) {
                                cssParser$MediaType = (CSSParser$MediaType)iterator.next();
                            }
                            else {
                                if (n3 != 0) {
                                    this.h = true;
                                    return;
                                }
                                break Label_0187;
                            }
                        } while (cssParser$MediaType != CSSParser$MediaType.all && cssParser$MediaType != screen);
                        final int n3 = 1;
                        continue;
                    }
                }
            }
            this.c = true;
            this.d = 1;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
    
    public final void L(final String s) throws SVGParseException {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(s.length());
            }
            this.g.append(s);
        }
        else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(s.length());
            }
            this.i.append(s);
        }
        else if (this.b instanceof SVG$w0) {
            this.a(s);
        }
    }
    
    public final void M(final char[] array, final int n, final int n2) throws SVGParseException {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(n2);
            }
            this.g.append(array, n, n2);
        }
        else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(n2);
            }
            this.i.append(array, n, n2);
        }
        else if (this.b instanceof SVG$w0) {
            this.a(new String(array, n, n2));
        }
    }
    
    public final void a(final String s) throws SVGParseException {
        final SVG.f0 f0 = (SVG.f0)this.b;
        final int size = f0.i.size();
        Object o;
        if (size == 0) {
            o = null;
        }
        else {
            o = f0.i.get(size - 1);
        }
        if (o instanceof SVG$a1) {
            final StringBuilder sb = new StringBuilder();
            final SVG$a1 svg$a1 = (SVG$a1)o;
            svg$a1.c = ph0.a.f(sb, svg$a1.c, s);
        }
        else {
            this.b.j((SVG.l0)new SVG$a1(s));
        }
    }
    
    public final void c(final String s, String s2, String string) throws SVGParseException {
        if (this.c && --this.d == 0) {
            this.c = false;
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(s) && !"".equals(s)) {
            return;
        }
        if (s2.length() <= 0) {
            s2 = string;
        }
        final int n = SVGParser$a.a[SVGElem.fromString(s2).ordinal()];
        if (n != 1 && n != 2 && n != 4 && n != 5 && n != 13 && n != 14) {
            switch (n) {
                default: {
                    return;
                }
                case 30: {
                    final StringBuilder i = this.i;
                    if (i != null) {
                        this.h = false;
                        string = i.toString();
                        final CSSParser cssParser = new CSSParser(CSSParser$MediaType.screen, CSSParser$Source.Document);
                        final SVG a = this.a;
                        final CSSParser.CSSParser$c cssParser$c = new CSSParser$c(string);
                        ((g)cssParser$c).q();
                        a.c.b(cssParser.e(cssParser$c));
                        this.i.setLength(0);
                    }
                    return;
                }
                case 22:
                case 23: {
                    this.e = false;
                    if (this.g != null) {
                        final SVGElem f = this.f;
                        if (f == SVGElem.title) {
                            this.a.getClass();
                        }
                        else if (f == SVGElem.desc) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    return;
                }
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 31: {
                    break;
                }
            }
        }
        this.b = ((SVG.l0)this.b).b;
    }
    
    public final void f(final Attributes attributes) throws SVGParseException {
        if (this.b != null) {
            final SVG$n b = new SVG$n();
            ((SVG.l0)b).a = this.a;
            ((SVG.l0)b).b = this.b;
            i((SVG$j0)b, attributes);
            l((SVG$j0)b, attributes);
            n((SVG.m)b, attributes);
            h((SVG.e0)b, attributes);
            for (int i = 0; i < attributes.getLength(); ++i) {
                final String trim = attributes.getValue(i).trim();
                final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 6) {
                                    if (n == 7) {
                                        B((SVG$n0)b, trim);
                                    }
                                }
                                else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                                    b.p = trim;
                                }
                            }
                            else {
                                final SVG.o w = w(trim);
                                b.t = w;
                                if (w.g()) {
                                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                                }
                            }
                        }
                        else {
                            final SVG.o w2 = w(trim);
                            b.s = w2;
                            if (w2.g()) {
                                throw new SVGParseException("Invalid <use> element. width cannot be negative");
                            }
                        }
                    }
                    else {
                        b.r = w(trim);
                    }
                }
                else {
                    b.q = w(trim);
                }
            }
            this.b.j((SVG.l0)b);
            this.b = (SVG.h0)b;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
    
    public final void g(final Attributes attributes) throws SVGParseException {
        if (this.b != null) {
            final SVG$r b = new SVG$r();
            ((SVG.l0)b).a = this.a;
            ((SVG.l0)b).b = this.b;
            i((SVG$j0)b, attributes);
            l((SVG$j0)b, attributes);
            h((SVG.e0)b, attributes);
            for (int i = 0; i < attributes.getLength(); ++i) {
                final String trim = attributes.getValue(i).trim();
                final int n = SVGParser$a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 43) {
                                    if (n == 44) {
                                        if ("objectBoundingBox".equals(trim)) {
                                            b.p = Boolean.FALSE;
                                        }
                                        else {
                                            if (!"userSpaceOnUse".equals(trim)) {
                                                throw new SVGParseException("Invalid value for attribute maskContentUnits");
                                            }
                                            b.p = Boolean.TRUE;
                                        }
                                    }
                                }
                                else if ("objectBoundingBox".equals(trim)) {
                                    b.o = Boolean.FALSE;
                                }
                                else {
                                    if (!"userSpaceOnUse".equals(trim)) {
                                        throw new SVGParseException("Invalid value for attribute maskUnits");
                                    }
                                    b.o = Boolean.TRUE;
                                }
                            }
                            else {
                                final SVG.o w = w(trim);
                                b.r = w;
                                if (w.g()) {
                                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                                }
                            }
                        }
                        else {
                            final SVG.o w2 = w(trim);
                            b.q = w2;
                            if (w2.g()) {
                                throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                            }
                        }
                    }
                    else {
                        w(trim);
                    }
                }
                else {
                    w(trim);
                }
            }
            this.b.j((SVG.l0)b);
            this.b = (SVG.h0)b;
            return;
        }
        throw new SVGParseException("Invalid document. Root element must be <svg>");
    }
    
    public enum SVGAttr
    {
        private static final SVGAttr[] $VALUES;
        
        CLASS, 
        UNSUPPORTED;
        
        private static final Map<String, SVGAttr> cache;
        
        clip, 
        clipPathUnits, 
        clip_path, 
        clip_rule, 
        color, 
        cx, 
        cy, 
        d, 
        direction, 
        display, 
        dx, 
        dy, 
        fill, 
        fill_opacity, 
        fill_rule, 
        font, 
        font_family, 
        font_size, 
        font_style, 
        font_weight, 
        fx, 
        fy, 
        gradientTransform, 
        gradientUnits, 
        height, 
        href, 
        image_rendering, 
        marker, 
        markerHeight, 
        markerUnits, 
        markerWidth, 
        marker_end, 
        marker_mid, 
        marker_start, 
        mask, 
        maskContentUnits, 
        maskUnits, 
        media, 
        offset, 
        opacity, 
        orient, 
        overflow, 
        pathLength, 
        patternContentUnits, 
        patternTransform, 
        patternUnits, 
        points, 
        preserveAspectRatio, 
        r, 
        refX, 
        refY, 
        requiredExtensions, 
        requiredFeatures, 
        requiredFonts, 
        requiredFormats, 
        rx, 
        ry, 
        solid_color, 
        solid_opacity, 
        spreadMethod, 
        startOffset, 
        stop_color, 
        stop_opacity, 
        stroke, 
        stroke_dasharray, 
        stroke_dashoffset, 
        stroke_linecap, 
        stroke_linejoin, 
        stroke_miterlimit, 
        stroke_opacity, 
        stroke_width, 
        style, 
        systemLanguage, 
        text_anchor, 
        text_decoration, 
        transform, 
        type, 
        vector_effect, 
        version, 
        viewBox, 
        viewport_fill, 
        viewport_fill_opacity, 
        visibility, 
        width, 
        x, 
        x1, 
        x2, 
        y, 
        y1, 
        y2;
        
        static {
            cache = new HashMap<String, SVGAttr>();
            for (final SVGAttr svgAttr : values()) {
                if (svgAttr == SVGAttr.CLASS) {
                    SVGAttr.cache.put("class", svgAttr);
                }
                else if (svgAttr != SVGAttr.UNSUPPORTED) {
                    SVGAttr.cache.put(svgAttr.name().replace('_', '-'), svgAttr);
                }
            }
        }
        
        public static SVGAttr fromString(final String s) {
            final SVGAttr svgAttr = SVGAttr.cache.get(s);
            if (svgAttr != null) {
                return svgAttr;
            }
            return SVGAttr.UNSUPPORTED;
        }
    }
    
    public enum SVGElem
    {
        private static final SVGElem[] $VALUES;
        
        SWITCH, 
        UNSUPPORTED, 
        a;
        
        private static final Map<String, SVGElem> cache;
        
        circle, 
        clipPath, 
        defs, 
        desc, 
        ellipse, 
        g, 
        image, 
        line, 
        linearGradient, 
        marker, 
        mask, 
        path, 
        pattern, 
        polygon, 
        polyline, 
        radialGradient, 
        rect, 
        solidColor, 
        stop, 
        style, 
        svg, 
        symbol, 
        text, 
        textPath, 
        title, 
        tref, 
        tspan, 
        use, 
        view;
        
        static {
            cache = new HashMap<String, SVGElem>();
            for (final SVGElem svgElem : values()) {
                if (svgElem == SVGElem.SWITCH) {
                    SVGElem.cache.put("switch", svgElem);
                }
                else if (svgElem != SVGElem.UNSUPPORTED) {
                    SVGElem.cache.put(svgElem.name(), svgElem);
                }
            }
        }
        
        public static SVGElem fromString(final String s) {
            final SVGElem svgElem = SVGElem.cache.get(s);
            if (svgElem != null) {
                return svgElem;
            }
            return SVGElem.UNSUPPORTED;
        }
    }
    
    public static final class b
    {
        public static final HashMap a;
        
        static {
            final HashMap a2 = new HashMap(10);
            (a = a2).put("none", PreserveAspectRatio.Alignment.none);
            a2.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            a2.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            a2.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            a2.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            a2.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            a2.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            a2.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            a2.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            a2.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }
    }
    
    public static final class c
    {
        public static final HashMap a;
        
        static {
            final HashMap a2 = new HashMap(47);
            (a = a2).put("aliceblue", -984833);
            a2.put("antiquewhite", -332841);
            final Integer value = -16711681;
            a2.put("aqua", value);
            k.t(-8388652, a2, "aquamarine", -983041, "azure", -657956, "beige", -6972, "bisque");
            k.t(-16777216, a2, "black", -5171, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet");
            k.t(-5952982, a2, "brown", -2180985, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse");
            k.t(-2987746, a2, "chocolate", -32944, "coral", -10185235, "cornflowerblue", -1828, "cornsilk");
            a2.put("crimson", -2354116);
            a2.put("cyan", value);
            a2.put("darkblue", -16777077);
            a2.put("darkcyan", -16741493);
            a2.put("darkgoldenrod", -4684277);
            final Integer value2 = -5658199;
            a2.put("darkgray", value2);
            a2.put("darkgreen", -16751616);
            a2.put("darkgrey", value2);
            a2.put("darkkhaki", -4343957);
            k.t(-7667573, a2, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
            k.t(-7667712, a2, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
            final Integer value3 = -13676721;
            a2.put("darkslategray", value3);
            a2.put("darkslategrey", value3);
            a2.put("darkturquoise", -16724271);
            a2.put("darkviolet", -7077677);
            a2.put("deeppink", -60269);
            a2.put("deepskyblue", -16728065);
            final Integer value4 = -9868951;
            a2.put("dimgray", value4);
            a2.put("dimgrey", value4);
            k.t(-14774017, a2, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
            final Integer value5 = -65281;
            a2.put("fuchsia", value5);
            a2.put("gainsboro", -2302756);
            a2.put("ghostwhite", -460545);
            a2.put("gold", -10496);
            a2.put("goldenrod", -2448096);
            final Integer value6 = -8355712;
            a2.put("gray", value6);
            a2.put("green", -16744448);
            a2.put("greenyellow", -5374161);
            a2.put("grey", value6);
            k.t(-983056, a2, "honeydew", -38476, "hotpink", -3318692, "indianred", -11861886, "indigo");
            k.t(-16, a2, "ivory", -989556, "khaki", -1644806, "lavender", -3851, "lavenderblush");
            k.t(-8586240, a2, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue", -1015680, "lightcoral");
            a2.put("lightcyan", -2031617);
            a2.put("lightgoldenrodyellow", -329006);
            final Integer value7 = -2894893;
            a2.put("lightgray", value7);
            a2.put("lightgreen", -7278960);
            a2.put("lightgrey", value7);
            a2.put("lightpink", -18751);
            a2.put("lightsalmon", -24454);
            a2.put("lightseagreen", -14634326);
            a2.put("lightskyblue", -7876870);
            final Integer value8 = -8943463;
            a2.put("lightslategray", value8);
            a2.put("lightslategrey", value8);
            a2.put("lightsteelblue", -5192482);
            a2.put("lightyellow", -32);
            a2.put("lime", -16711936);
            a2.put("limegreen", -13447886);
            a2.put("linen", -331546);
            a2.put("magenta", value5);
            a2.put("maroon", -8388608);
            a2.put("mediumaquamarine", -10039894);
            k.t(-16777011, a2, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
            k.t(-8689426, a2, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
            k.t(-15132304, a2, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
            k.t(-8531, a2, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
            k.t(-9728477, a2, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
            k.t(-1120086, a2, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
            k.t(-4139, a2, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
            k.t(-2252579, a2, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
            k.t(-65536, a2, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
            k.t(-360334, a2, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
            k.t(-6270419, a2, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
            final Integer value9 = -9404272;
            a2.put("slategray", value9);
            a2.put("slategrey", value9);
            a2.put("snow", -1286);
            a2.put("springgreen", -16711809);
            k.t(-12156236, a2, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
            k.t(-40121, a2, "tomato", -12525360, "turquoise", -1146130, "violet", -663885, "wheat");
            k.t(-1, a2, "white", -657931, "whitesmoke", -256, "yellow", -6632142, "yellowgreen");
            a2.put("transparent", 0);
        }
    }
    
    public static final class d
    {
        public static final HashMap a;
        
        static {
            final HashMap hashMap = a = new HashMap(9);
            final SVG.Unit pt = SVG.Unit.pt;
            hashMap.put("xx-small", new SVG.o(0.694f, pt));
            hashMap.put("x-small", new SVG.o(0.833f, pt));
            hashMap.put("small", new SVG.o(10.0f, pt));
            hashMap.put("medium", new SVG.o(12.0f, pt));
            hashMap.put("large", new SVG.o(14.4f, pt));
            hashMap.put("x-large", new SVG.o(17.3f, pt));
            hashMap.put("xx-large", new SVG.o(20.7f, pt));
            final SVG.Unit percent = SVG.Unit.percent;
            hashMap.put("smaller", new SVG.o(83.33f, percent));
            hashMap.put("larger", new SVG.o(120.0f, percent));
        }
    }
    
    public static final class e
    {
        public static final HashMap a;
        
        static {
            final HashMap hashMap = a = new HashMap(13);
            final Integer value = 400;
            hashMap.put("normal", value);
            final Integer value2 = 700;
            hashMap.put("bold", value2);
            k.t(1, hashMap, "bolder", -1, "lighter", 100, "100", 200, "200");
            hashMap.put("300", 300);
            hashMap.put("400", value);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", value2);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }
    }
    
    public final class f extends DefaultHandler2
    {
        public final SVGParser a;
        
        public f(final SVGParser a) {
            this.a = a;
        }
        
        @Override
        public final void characters(final char[] array, final int n, final int n2) throws SAXException {
            this.a.L(new String(array, n, n2));
        }
        
        @Override
        public final void endDocument() throws SAXException {
            this.a.getClass();
        }
        
        @Override
        public final void endElement(final String s, final String s2, final String s3) throws SAXException {
            this.a.c(s, s2, s3);
        }
        
        @Override
        public final void processingInstruction(final String s, final String s2) throws SAXException {
            final g g = new g(s2);
            this.a.getClass();
            SVGParser.C(g);
            this.a.getClass();
            s.equals("xml-stylesheet");
        }
        
        @Override
        public final void startDocument() throws SAXException {
            final SVGParser a = this.a;
            a.getClass();
            a.a = new SVG();
        }
        
        @Override
        public final void startElement(final String s, final String s2, final String s3, final Attributes attributes) throws SAXException {
            this.a.J(s, s2, s3, attributes);
        }
    }
    
    public static class g
    {
        public String a;
        public int b;
        public int c;
        public fu.b d;
        
        public g(String trim) {
            this.b = 0;
            this.c = 0;
            this.d = new fu.b();
            trim = trim.trim();
            this.a = trim;
            this.c = trim.length();
        }
        
        public static boolean g(final int n) {
            return n == 32 || n == 10 || n == 13 || n == 9;
        }
        
        public final int a() {
            int b = this.b;
            final int c = this.c;
            if (b == c) {
                return -1;
            }
            ++b;
            if ((this.b = b) < c) {
                return this.a.charAt(b);
            }
            return -1;
        }
        
        public final Boolean b(final Object o) {
            final Boolean b = null;
            if (o == null) {
                return null;
            }
            this.p();
            final int b2 = this.b;
            Boolean value;
            if (b2 == this.c) {
                value = b;
            }
            else {
                final char char1 = this.a.charAt(b2);
                if (char1 != '0') {
                    value = b;
                    if (char1 != '1') {
                        return value;
                    }
                }
                final int b3 = this.b;
                boolean b4 = true;
                this.b = b3 + 1;
                if (char1 != '1') {
                    b4 = false;
                }
                value = b4;
            }
            return value;
        }
        
        public final float c(final float n) {
            if (Float.isNaN(n)) {
                return Float.NaN;
            }
            this.p();
            return this.i();
        }
        
        public final boolean d(final char c) {
            final int b = this.b;
            final boolean b2 = b < this.c && this.a.charAt(b) == c;
            if (b2) {
                ++this.b;
            }
            return b2;
        }
        
        public final boolean e(final String s) {
            final int length = s.length();
            final int b = this.b;
            final boolean b2 = b <= this.c - length && this.a.substring(b, b + length).equals(s);
            if (b2) {
                this.b += length;
            }
            return b2;
        }
        
        public final boolean f() {
            return this.b == this.c;
        }
        
        public final Integer h() {
            final int b = this.b;
            if (b == this.c) {
                return null;
            }
            final String a = this.a;
            this.b = b + 1;
            return (int)a.charAt(b);
        }
        
        public final float i() {
            final float a = this.d.a(this.b, this.c, this.a);
            if (!Float.isNaN(a)) {
                this.b = this.d.f;
            }
            return a;
        }
        
        public final SVG.o j() {
            final float i = this.i();
            if (Float.isNaN(i)) {
                return null;
            }
            final SVG.Unit n = this.n();
            if (n == null) {
                return new SVG.o(i, SVG.Unit.px);
            }
            return new SVG.o(i, n);
        }
        
        public final String k() {
            if (this.f()) {
                return null;
            }
            final int b = this.b;
            final char char1 = this.a.charAt(b);
            if (char1 != '\'' && char1 != '\"') {
                return null;
            }
            int n;
            for (n = this.a(); n != -1 && n != char1; n = this.a()) {}
            if (n == -1) {
                this.b = b;
                return null;
            }
            final int b2 = this.b + 1;
            this.b = b2;
            return this.a.substring(b + 1, b2 - 1);
        }
        
        public final String l() {
            return this.m(' ', false);
        }
        
        public final String m(final char c, final boolean b) {
            if (this.f()) {
                return null;
            }
            final char char1 = this.a.charAt(this.b);
            if ((!b && g(char1)) || char1 == c) {
                return null;
            }
            final int b2 = this.b;
            for (int i = this.a(); i != -1; i = this.a()) {
                if (i == c) {
                    break;
                }
                if (!b && g(i)) {
                    break;
                }
            }
            return this.a.substring(b2, this.b);
        }
        
        public final SVG.Unit n() {
            if (this.f()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                ++this.b;
                return SVG.Unit.percent;
            }
            final int b = this.b;
            if (b > this.c - 2) {
                return null;
            }
            try {
                final SVG.Unit value = SVG.Unit.valueOf(this.a.substring(b, b + 2).toLowerCase(Locale.US));
                this.b += 2;
                return value;
            }
            catch (final IllegalArgumentException ex) {
                return null;
            }
        }
        
        public final float o() {
            this.p();
            final float a = this.d.a(this.b, this.c, this.a);
            if (!Float.isNaN(a)) {
                this.b = this.d.f;
            }
            return a;
        }
        
        public final boolean p() {
            this.q();
            final int b = this.b;
            if (b == this.c) {
                return false;
            }
            if (this.a.charAt(b) != ',') {
                return false;
            }
            ++this.b;
            this.q();
            return true;
        }
        
        public final void q() {
            while (true) {
                final int b = this.b;
                if (b >= this.c || !g(this.a.charAt(b))) {
                    break;
                }
                ++this.b;
            }
        }
    }
    
    public final class h implements Attributes
    {
        public XmlPullParser a;
        
        public h(final XmlPullParser a) {
            this.a = a;
        }
        
        @Override
        public final int getIndex(final String s) {
            return -1;
        }
        
        @Override
        public final int getIndex(final String s, final String s2) {
            return -1;
        }
        
        @Override
        public final int getLength() {
            return this.a.getAttributeCount();
        }
        
        @Override
        public final String getLocalName(final int n) {
            return this.a.getAttributeName(n);
        }
        
        @Override
        public final String getQName(final int n) {
            String s = this.a.getAttributeName(n);
            if (this.a.getAttributePrefix(n) != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.a.getAttributePrefix(n));
                sb.append(':');
                sb.append(s);
                s = sb.toString();
            }
            return s;
        }
        
        @Override
        public final String getType(final int n) {
            return null;
        }
        
        @Override
        public final String getType(final String s) {
            return null;
        }
        
        @Override
        public final String getType(final String s, final String s2) {
            return null;
        }
        
        @Override
        public final String getURI(final int n) {
            return this.a.getAttributeNamespace(n);
        }
        
        @Override
        public final String getValue(final int n) {
            return this.a.getAttributeValue(n);
        }
        
        @Override
        public final String getValue(final String s) {
            return null;
        }
        
        @Override
        public final String getValue(final String s, final String s2) {
            return null;
        }
    }
}
