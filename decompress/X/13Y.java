// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import android.view.Menu;
import android.view.ViewParent;
import androidx.core.g.t;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.ActionMenuPresenter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window$Callback;

public final class 13Y implements 04Z
{
    public 03X LIZ;
    public CharSequence LIZIZ;
    public Window$Callback LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public View LJFF;
    public View LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public Drawable LJIIIZ;
    public boolean LJIIJ;
    public CharSequence LJIIJJI;
    public CharSequence LJIIL;
    public ActionMenuPresenter LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public Drawable LJIILLIIL;
    
    static {
        Covode.recordClassIndex(503);
    }
    
    public 13Y(final 03X 03X, final boolean b) {
        this(03X, b, (byte)0);
    }
    
    public 13Y(final 03X liz, final boolean b, final byte b2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/13Y.LIZ:LX/03X;
        //     9: aload_0        
        //    10: aload_1        
        //    11: invokevirtual   X/03X.getTitle:()Ljava/lang/CharSequence;
        //    14: putfield        X/13Y.LIZIZ:Ljava/lang/CharSequence;
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokevirtual   X/03X.getSubtitle:()Ljava/lang/CharSequence;
        //    22: putfield        X/13Y.LJIIJJI:Ljava/lang/CharSequence;
        //    25: aload_0        
        //    26: getfield        X/13Y.LIZIZ:Ljava/lang/CharSequence;
        //    29: ifnull          821
        //    32: iconst_1       
        //    33: istore          4
        //    35: aload_0        
        //    36: iload           4
        //    38: putfield        X/13Y.LJIIJ:Z
        //    41: aload_0        
        //    42: aload_1        
        //    43: invokevirtual   X/03X.getNavigationIcon:()Landroid/graphics/drawable/Drawable;
        //    46: putfield        X/13Y.LJIIIZ:Landroid/graphics/drawable/Drawable;
        //    49: aload_1        
        //    50: invokevirtual   X/03X.getContext:()Landroid/content/Context;
        //    53: aconst_null    
        //    54: bipush          29
        //    56: newarray        I
        //    58: dup            
        //    59: iconst_0       
        //    60: ldc             2130969085
        //    62: iastore        
        //    63: dup            
        //    64: iconst_1       
        //    65: ldc             2130969088
        //    67: iastore        
        //    68: dup            
        //    69: iconst_2       
        //    70: ldc             2130969089
        //    72: iastore        
        //    73: dup            
        //    74: iconst_3       
        //    75: ldc             2130969383
        //    77: iastore        
        //    78: dup            
        //    79: iconst_4       
        //    80: ldc             2130969384
        //    82: iastore        
        //    83: dup            
        //    84: iconst_5       
        //    85: ldc             2130969385
        //    87: iastore        
        //    88: dup            
        //    89: bipush          6
        //    91: ldc             2130969386
        //    93: iastore        
        //    94: dup            
        //    95: bipush          7
        //    97: ldc             2130969387
        //    99: iastore        
        //   100: dup            
        //   101: bipush          8
        //   103: ldc             2130969388
        //   105: iastore        
        //   106: dup            
        //   107: bipush          9
        //   109: ldc             2130969430
        //   111: iastore        
        //   112: dup            
        //   113: bipush          10
        //   115: ldc             2130969459
        //   117: iastore        
        //   118: dup            
        //   119: bipush          11
        //   121: ldc             2130969461
        //   123: iastore        
        //   124: dup            
        //   125: bipush          12
        //   127: ldc             2130969506
        //   129: iastore        
        //   130: dup            
        //   131: bipush          13
        //   133: ldc             2130969619
        //   135: iastore        
        //   136: dup            
        //   137: bipush          14
        //   139: ldc             2130969625
        //   141: iastore        
        //   142: dup            
        //   143: bipush          15
        //   145: ldc             2130969636
        //   147: iastore        
        //   148: dup            
        //   149: bipush          16
        //   151: ldc             2130969637
        //   153: iastore        
        //   154: dup            
        //   155: bipush          17
        //   157: ldc             2130969640
        //   159: iastore        
        //   160: dup            
        //   161: bipush          18
        //   163: ldc             2130969677
        //   165: iastore        
        //   166: dup            
        //   167: bipush          19
        //   169: ldc             2130969730
        //   171: iastore        
        //   172: dup            
        //   173: bipush          20
        //   175: ldc             2130970603
        //   177: iastore        
        //   178: dup            
        //   179: bipush          21
        //   181: ldc             2130970691
        //   183: iastore        
        //   184: dup            
        //   185: bipush          22
        //   187: ldc             2130970747
        //   189: iastore        
        //   190: dup            
        //   191: bipush          23
        //   193: ldc             2130970766
        //   195: iastore        
        //   196: dup            
        //   197: bipush          24
        //   199: ldc             2130970767
        //   201: iastore        
        //   202: dup            
        //   203: bipush          25
        //   205: ldc             2130971128
        //   207: iastore        
        //   208: dup            
        //   209: bipush          26
        //   211: ldc             2130971131
        //   213: iastore        
        //   214: dup            
        //   215: bipush          27
        //   217: ldc             2130971244
        //   219: iastore        
        //   220: dup            
        //   221: bipush          28
        //   223: ldc             2130971259
        //   225: iastore        
        //   226: ldc             2130968988
        //   228: iconst_0       
        //   229: invokestatic    X/043.LIZ:(Landroid/content/Context;Landroid/util/AttributeSet;[III)LX/043;
        //   232: astore_1       
        //   233: bipush          15
        //   235: istore_3       
        //   236: aload_0        
        //   237: aload_1        
        //   238: bipush          15
        //   240: invokevirtual   X/043.LIZ:(I)Landroid/graphics/drawable/Drawable;
        //   243: putfield        X/13Y.LJIILLIIL:Landroid/graphics/drawable/Drawable;
        //   246: iload_2        
        //   247: ifeq            786
        //   250: aload_1        
        //   251: bipush          27
        //   253: invokevirtual   X/043.LIZJ:(I)Ljava/lang/CharSequence;
        //   256: astore          5
        //   258: aload           5
        //   260: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   263: ifne            277
        //   266: aload_0        
        //   267: iconst_1       
        //   268: putfield        X/13Y.LJIIJ:Z
        //   271: aload_0        
        //   272: aload           5
        //   274: invokespecial   X/13Y.LIZIZ:(Ljava/lang/CharSequence;)V
        //   277: aload_1        
        //   278: bipush          25
        //   280: invokevirtual   X/043.LIZJ:(I)Ljava/lang/CharSequence;
        //   283: astore          5
        //   285: aload           5
        //   287: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   290: ifne            318
        //   293: aload_0        
        //   294: aload           5
        //   296: putfield        X/13Y.LJIIJJI:Ljava/lang/CharSequence;
        //   299: aload_0        
        //   300: getfield        X/13Y.LJ:I
        //   303: bipush          8
        //   305: iand           
        //   306: ifeq            318
        //   309: aload_0        
        //   310: getfield        X/13Y.LIZ:LX/03X;
        //   313: aload           5
        //   315: invokevirtual   X/03X.setSubtitle:(Ljava/lang/CharSequence;)V
        //   318: aload_1        
        //   319: bipush          20
        //   321: invokevirtual   X/043.LIZ:(I)Landroid/graphics/drawable/Drawable;
        //   324: astore          5
        //   326: aload           5
        //   328: ifnull          337
        //   331: aload_0        
        //   332: aload           5
        //   334: invokespecial   X/13Y.LIZIZ:(Landroid/graphics/drawable/Drawable;)V
        //   337: aload_1        
        //   338: bipush          17
        //   340: invokevirtual   X/043.LIZ:(I)Landroid/graphics/drawable/Drawable;
        //   343: astore          5
        //   345: aload           5
        //   347: ifnull          356
        //   350: aload_0        
        //   351: aload           5
        //   353: invokevirtual   X/13Y.LIZ:(Landroid/graphics/drawable/Drawable;)V
        //   356: aload_0        
        //   357: getfield        X/13Y.LJIIIZ:Landroid/graphics/drawable/Drawable;
        //   360: ifnonnull       384
        //   363: aload_0        
        //   364: getfield        X/13Y.LJIILLIIL:Landroid/graphics/drawable/Drawable;
        //   367: astore          5
        //   369: aload           5
        //   371: ifnull          384
        //   374: aload_0        
        //   375: aload           5
        //   377: putfield        X/13Y.LJIIIZ:Landroid/graphics/drawable/Drawable;
        //   380: aload_0        
        //   381: invokespecial   X/13Y.LJIILLIIL:()V
        //   384: aload_0        
        //   385: aload_1        
        //   386: bipush          10
        //   388: iconst_0       
        //   389: invokevirtual   X/043.LIZ:(II)I
        //   392: invokevirtual   X/13Y.LIZJ:(I)V
        //   395: aload_1        
        //   396: bipush          9
        //   398: iconst_0       
        //   399: invokevirtual   X/043.LJFF:(II)I
        //   402: istore_3       
        //   403: iload_3        
        //   404: ifeq            499
        //   407: aload_0        
        //   408: getfield        X/13Y.LIZ:LX/03X;
        //   411: invokevirtual   X/03X.getContext:()Landroid/content/Context;
        //   414: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   417: iload_3        
        //   418: aload_0        
        //   419: getfield        X/13Y.LIZ:LX/03X;
        //   422: iconst_0       
        //   423: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   426: astore          6
        //   428: aload_0        
        //   429: getfield        X/13Y.LJI:Landroid/view/View;
        //   432: astore          5
        //   434: aload           5
        //   436: ifnull          458
        //   439: aload_0        
        //   440: getfield        X/13Y.LJ:I
        //   443: bipush          16
        //   445: iand           
        //   446: ifeq            458
        //   449: aload_0        
        //   450: getfield        X/13Y.LIZ:LX/03X;
        //   453: aload           5
        //   455: invokevirtual   X/03X.removeView:(Landroid/view/View;)V
        //   458: aload_0        
        //   459: aload           6
        //   461: putfield        X/13Y.LJI:Landroid/view/View;
        //   464: aload           6
        //   466: ifnull          488
        //   469: aload_0        
        //   470: getfield        X/13Y.LJ:I
        //   473: bipush          16
        //   475: iand           
        //   476: ifeq            488
        //   479: aload_0        
        //   480: getfield        X/13Y.LIZ:LX/03X;
        //   483: aload           6
        //   485: invokevirtual   X/03X.addView:(Landroid/view/View;)V
        //   488: aload_0        
        //   489: aload_0        
        //   490: getfield        X/13Y.LJ:I
        //   493: bipush          16
        //   495: ior            
        //   496: invokevirtual   X/13Y.LIZJ:(I)V
        //   499: aload_1        
        //   500: bipush          13
        //   502: iconst_0       
        //   503: invokevirtual   X/043.LJ:(II)I
        //   506: istore_3       
        //   507: iload_3        
        //   508: ifle            535
        //   511: aload_0        
        //   512: getfield        X/13Y.LIZ:LX/03X;
        //   515: invokevirtual   X/03X.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   518: astore          5
        //   520: aload           5
        //   522: iload_3        
        //   523: putfield        android/view/ViewGroup$LayoutParams.height:I
        //   526: aload_0        
        //   527: getfield        X/13Y.LIZ:LX/03X;
        //   530: aload           5
        //   532: invokevirtual   X/03X.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   535: aload_1        
        //   536: bipush          7
        //   538: iconst_m1      
        //   539: invokevirtual   X/043.LIZJ:(II)I
        //   542: istore          7
        //   544: aload_1        
        //   545: iconst_3       
        //   546: iconst_m1      
        //   547: invokevirtual   X/043.LIZJ:(II)I
        //   550: istore_3       
        //   551: iload           7
        //   553: ifge            560
        //   556: iload_3        
        //   557: iflt            596
        //   560: aload_0        
        //   561: getfield        X/13Y.LIZ:LX/03X;
        //   564: astore          5
        //   566: iload           7
        //   568: iconst_0       
        //   569: invokestatic    java/lang/Math.max:(II)I
        //   572: istore          7
        //   574: iload_3        
        //   575: iconst_0       
        //   576: invokestatic    java/lang/Math.max:(II)I
        //   579: istore_3       
        //   580: aload           5
        //   582: invokevirtual   X/03X.LJI:()V
        //   585: aload           5
        //   587: getfield        X/03X.LJIIJ:LX/03t;
        //   590: iload           7
        //   592: iload_3        
        //   593: invokevirtual   X/03t.LIZ:(II)V
        //   596: aload_1        
        //   597: bipush          28
        //   599: iconst_0       
        //   600: invokevirtual   X/043.LJFF:(II)I
        //   603: istore_3       
        //   604: iload_3        
        //   605: ifeq            646
        //   608: aload_0        
        //   609: getfield        X/13Y.LIZ:LX/03X;
        //   612: astore          5
        //   614: aload           5
        //   616: invokevirtual   X/03X.getContext:()Landroid/content/Context;
        //   619: astore          6
        //   621: aload           5
        //   623: iload_3        
        //   624: putfield        X/03X.LJII:I
        //   627: aload           5
        //   629: getfield        X/03X.LIZIZ:Landroid/widget/TextView;
        //   632: ifnull          646
        //   635: aload           5
        //   637: getfield        X/03X.LIZIZ:Landroid/widget/TextView;
        //   640: aload           6
        //   642: iload_3        
        //   643: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   646: aload_1        
        //   647: bipush          26
        //   649: iconst_0       
        //   650: invokevirtual   X/043.LJFF:(II)I
        //   653: istore_3       
        //   654: iload_3        
        //   655: ifeq            696
        //   658: aload_0        
        //   659: getfield        X/13Y.LIZ:LX/03X;
        //   662: astore          6
        //   664: aload           6
        //   666: invokevirtual   X/03X.getContext:()Landroid/content/Context;
        //   669: astore          5
        //   671: aload           6
        //   673: iload_3        
        //   674: putfield        X/03X.LJIIIIZZ:I
        //   677: aload           6
        //   679: getfield        X/03X.LIZJ:Landroid/widget/TextView;
        //   682: ifnull          696
        //   685: aload           6
        //   687: getfield        X/03X.LIZJ:Landroid/widget/TextView;
        //   690: aload           5
        //   692: iload_3        
        //   693: invokevirtual   android/widget/TextView.setTextAppearance:(Landroid/content/Context;I)V
        //   696: aload_1        
        //   697: bipush          22
        //   699: iconst_0       
        //   700: invokevirtual   X/043.LJFF:(II)I
        //   703: istore_3       
        //   704: iload_3        
        //   705: ifeq            716
        //   708: aload_0        
        //   709: getfield        X/13Y.LIZ:LX/03X;
        //   712: iload_3        
        //   713: invokevirtual   X/03X.setPopupTheme:(I)V
        //   716: aload_1        
        //   717: getfield        X/043.LIZ:Landroid/content/res/TypedArray;
        //   720: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   723: ldc             2131821185
        //   725: aload_0        
        //   726: getfield        X/13Y.LJIILL:I
        //   729: if_icmpeq       759
        //   732: aload_0        
        //   733: ldc             2131821185
        //   735: putfield        X/13Y.LJIILL:I
        //   738: aload_0        
        //   739: getfield        X/13Y.LIZ:LX/03X;
        //   742: invokevirtual   X/03X.getNavigationContentDescription:()Ljava/lang/CharSequence;
        //   745: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   748: ifeq            759
        //   751: aload_0        
        //   752: aload_0        
        //   753: getfield        X/13Y.LJIILL:I
        //   756: invokevirtual   X/13Y.LIZLLL:(I)V
        //   759: aload_0        
        //   760: aload_0        
        //   761: getfield        X/13Y.LIZ:LX/03X;
        //   764: invokevirtual   X/03X.getNavigationContentDescription:()Ljava/lang/CharSequence;
        //   767: putfield        X/13Y.LJIIL:Ljava/lang/CharSequence;
        //   770: aload_0        
        //   771: getfield        X/13Y.LIZ:LX/03X;
        //   774: new             LX/044;
        //   777: dup            
        //   778: aload_0        
        //   779: invokespecial   X/044.<init>:(LX/13Y;)V
        //   782: invokevirtual   X/03X.setNavigationOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   785: return         
        //   786: aload_0        
        //   787: getfield        X/13Y.LIZ:LX/03X;
        //   790: invokevirtual   X/03X.getNavigationIcon:()Landroid/graphics/drawable/Drawable;
        //   793: ifnull          815
        //   796: aload_0        
        //   797: aload_0        
        //   798: getfield        X/13Y.LIZ:LX/03X;
        //   801: invokevirtual   X/03X.getNavigationIcon:()Landroid/graphics/drawable/Drawable;
        //   804: putfield        X/13Y.LJIILLIIL:Landroid/graphics/drawable/Drawable;
        //   807: aload_0        
        //   808: iload_3        
        //   809: putfield        X/13Y.LJ:I
        //   812: goto            716
        //   815: bipush          11
        //   817: istore_3       
        //   818: goto            807
        //   821: iconst_0       
        //   822: istore          4
        //   824: goto            35
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private void LIZIZ(final Drawable ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
        this.LJIILL();
    }
    
    private void LIZIZ(final CharSequence charSequence) {
        this.LIZIZ = charSequence;
        if ((this.LJ & 0x8) != 0x0) {
            this.LIZ.setTitle(charSequence);
        }
    }
    
    private void LIZJ(final CharSequence ljiil) {
        this.LJIIL = ljiil;
        this.LJIIZILJ();
    }
    
    private void LJIILL() {
        final int lj = this.LJ;
        Drawable logo;
        if ((lj & 0x2) != 0x0) {
            if ((lj & 0x1) != 0x0) {
                logo = this.LJIIIIZZ;
                if (logo == null) {
                    logo = this.LJII;
                }
            }
            else {
                logo = this.LJII;
            }
        }
        else {
            logo = null;
        }
        this.LIZ.setLogo(logo);
    }
    
    private void LJIILLIIL() {
        if ((this.LJ & 0x4) != 0x0) {
            final 03X liz = this.LIZ;
            Drawable navigationIcon = this.LJIIIZ;
            if (navigationIcon == null) {
                navigationIcon = this.LJIILLIIL;
            }
            liz.setNavigationIcon(navigationIcon);
            return;
        }
        this.LIZ.setNavigationIcon(null);
    }
    
    private void LJIIZILJ() {
        if ((this.LJ & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.LJIIL)) {
                this.LIZ.setNavigationContentDescription(this.LJIILL);
                return;
            }
            this.LIZ.setNavigationContentDescription(this.LJIIL);
        }
    }
    
    @Override
    public final 08M LIZ(final int n, final long n2) {
        public final class 1fe extends 14X
        {
            public final /* synthetic */ int LIZ;
            public final /* synthetic */ 13Y LIZIZ;
            public boolean LIZJ;
            
            static {
                Covode.recordClassIndex(505);
            }
            
            public 1fe(final 13Y liziz, final int liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ() {
                this.LIZIZ.LIZ.setVisibility(0);
            }
            
            @Override
            public final void LIZIZ() {
                if (!this.LIZJ) {
                    this.LIZIZ.LIZ.setVisibility(this.LIZ);
                }
            }
            
            @Override
            public final void LIZJ() {
                this.LIZJ = true;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/13Y.LIZ:LX/03X;
        //     4: invokestatic    androidx/core/g/t.LIZJ:(Landroid/view/View;)LX/08M;
        //     7: astore          4
        //     9: iload_1        
        //    10: ifne            49
        //    13: fconst_1       
        //    14: fstore          5
        //    16: aload           4
        //    18: fload           5
        //    20: invokevirtual   X/08M.LIZ:(F)LX/08M;
        //    23: pop            
        //    24: aload           4
        //    26: lload_2        
        //    27: invokevirtual   X/08M.LIZ:(J)LX/08M;
        //    30: pop            
        //    31: aload           4
        //    33: new             LX/1fe;
        //    36: dup            
        //    37: aload_0        
        //    38: iload_1        
        //    39: invokespecial   X/1fe.<init>:(LX/13Y;I)V
        //    42: invokevirtual   X/08M.LIZ:(LX/08N;)LX/08M;
        //    45: pop            
        //    46: aload           4
        //    48: areturn        
        //    49: fconst_0       
        //    50: fstore          5
        //    52: goto            16
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
    
    @Override
    public final ViewGroup LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final void LIZ(final int n) {
        Drawable liziz;
        if (n != 0) {
            liziz = 01s.LIZIZ(this.LIZ.getContext(), n);
        }
        else {
            liziz = null;
        }
        this.LIZ(liziz);
    }
    
    @Override
    public final void LIZ(final 02r.a ljiill, final 12x.a ljiilliil) {
        final 03X liz = this.LIZ;
        liz.LJIILL = ljiill;
        liz.LJIILLIIL = ljiilliil;
        if (liz.LIZ != null) {
            liz.LIZ.LIZ(ljiill, ljiilliil);
        }
    }
    
    @Override
    public final void LIZ(final 03x ljff) {
        final View ljff2 = this.LJFF;
        if (ljff2 != null) {
            final ViewParent parent = ljff2.getParent();
            final 03X liz = this.LIZ;
            if (parent == liz) {
                liz.removeView(this.LJFF);
            }
        }
        if ((this.LJFF = (View)ljff) != null && this.LJIILJJIL == 2) {
            this.LIZ.addView((View)ljff, 0);
            final 03X.b b = (03X.b)this.LJFF.getLayoutParams();
            b.width = -2;
            b.height = -2;
            b.LIZ = 8388691;
            ljff.setAllowCollapse(true);
        }
    }
    
    @Override
    public final void LIZ(final Drawable ljii) {
        this.LJII = ljii;
        this.LJIILL();
    }
    
    @Override
    public final void LIZ(final Menu menu, final 02r.a lj) {
        if (this.LJIILIIL == null) {
            final ActionMenuPresenter ljiiliil = new ActionMenuPresenter(this.LIZ.getContext());
            this.LJIILIIL = ljiiliil;
            ljiiliil.LJI = 2131361929;
        }
        this.LJIILIIL.LJ = lj;
        final 03X liz = this.LIZ;
        final 12x 12x = (12x)menu;
        final ActionMenuPresenter ljiiliil2 = this.LJIILIIL;
        if (12x != null || liz.LIZ != null) {
            liz.LIZLLL();
            final 12x liz2 = liz.LIZ.LIZ;
            if (liz2 != 12x) {
                if (liz2 != null) {
                    liz2.LIZIZ(liz.LJIILIIL);
                    liz2.LIZIZ(liz.LJIILJJIL);
                }
                if (liz.LJIILJJIL == null) {
                    liz.LJIILJJIL = liz.new a();
                }
                ljiiliil2.LJIIJJI = true;
                if (12x != null) {
                    12x.LIZ(ljiiliil2, liz.LJFF);
                    12x.LIZ(liz.LJIILJJIL, liz.LJFF);
                }
                else {
                    ljiiliil2.LIZ(liz.LJFF, null);
                    liz.LJIILJJIL.LIZ(liz.LJFF, null);
                    ljiiliil2.LIZ(true);
                    liz.LJIILJJIL.LIZ(true);
                }
                liz.LIZ.setPopupTheme(liz.LJI);
                liz.LIZ.setPresenter(ljiiliil2);
                liz.LJIILIIL = ljiiliil2;
            }
        }
    }
    
    @Override
    public final void LIZ(final Window$Callback lizj) {
        this.LIZJ = lizj;
    }
    
    @Override
    public final void LIZ(final CharSequence charSequence) {
        if (!this.LJIIJ) {
            this.LIZIZ(charSequence);
        }
    }
    
    @Override
    public final void LIZ(final boolean collapsible) {
        this.LIZ.setCollapsible(collapsible);
    }
    
    @Override
    public final Context LIZIZ() {
        return this.LIZ.getContext();
    }
    
    @Override
    public final void LIZIZ(final int n) {
        Drawable liziz;
        if (n != 0) {
            liziz = 01s.LIZIZ(this.LIZ.getContext(), n);
        }
        else {
            liziz = null;
        }
        this.LIZIZ(liziz);
    }
    
    @Override
    public final void LIZJ(final int lj) {
        final int n = this.LJ ^ lj;
        this.LJ = lj;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((lj & 0x4) != 0x0) {
                    this.LJIIZILJ();
                }
                this.LJIILLIIL();
            }
            if ((n & 0x3) != 0x0) {
                this.LJIILL();
            }
            if ((n & 0x8) != 0x0) {
                if ((lj & 0x8) != 0x0) {
                    this.LIZ.setTitle(this.LIZIZ);
                    this.LIZ.setSubtitle(this.LJIIJJI);
                }
                else {
                    this.LIZ.setTitle(null);
                    this.LIZ.setSubtitle(null);
                }
            }
            if ((n & 0x10) != 0x0) {
                final View lji = this.LJI;
                if (lji != null) {
                    if ((lj & 0x10) != 0x0) {
                        this.LIZ.addView(lji);
                        return;
                    }
                    this.LIZ.removeView(lji);
                }
            }
        }
    }
    
    @Override
    public final boolean LIZJ() {
        final 03X liz = this.LIZ;
        return liz.LJIILJJIL != null && liz.LJIILJJIL.LIZIZ != null;
    }
    
    @Override
    public final void LIZLLL() {
        this.LIZ.LIZJ();
    }
    
    @Override
    public final void LIZLLL(final int n) {
        CharSequence string;
        if (n == 0) {
            string = null;
        }
        else {
            string = this.LIZ.getContext().getString(n);
        }
        this.LIZJ(string);
    }
    
    @Override
    public final CharSequence LJ() {
        return this.LIZ.getTitle();
    }
    
    @Override
    public final void LJ(final int visibility) {
        this.LIZ.setVisibility(visibility);
    }
    
    @Override
    public final boolean LJFF() {
        final 03X liz = this.LIZ;
        return liz.getVisibility() == 0 && liz.LIZ != null && liz.LIZ.LIZIZ;
    }
    
    @Override
    public final boolean LJI() {
        return this.LIZ.LIZ();
    }
    
    @Override
    public final boolean LJII() {
        final 03X liz = this.LIZ;
        if (liz.LIZ != null) {
            final 13G liz2 = liz.LIZ;
            if (liz2.LIZJ != null) {
                final ActionMenuPresenter lizj = liz2.LIZJ;
                if (lizj.LJIILJJIL != null || lizj.LJIIIZ()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean LJIIIIZZ() {
        return this.LIZ.LIZIZ();
    }
    
    @Override
    public final boolean LJIIIZ() {
        final 03X liz = this.LIZ;
        if (liz.LIZ != null) {
            final 13G liz2 = liz.LIZ;
            if (liz2.LIZJ != null && liz2.LIZJ.LJI()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final void LJIIJ() {
        this.LIZLLL = true;
    }
    
    @Override
    public final void LJIIJJI() {
        final 03X liz = this.LIZ;
        if (liz.LIZ != null) {
            liz.LIZ.LIZIZ();
        }
    }
    
    @Override
    public final int LJIIL() {
        return this.LJ;
    }
    
    @Override
    public final int LJIILIIL() {
        return this.LJIILJJIL;
    }
    
    @Override
    public final Menu LJIILJJIL() {
        return this.LIZ.getMenu();
    }
}
