// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import java.util.Iterator;
import android.view.LayoutInflater$Factory;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSecondLevelPanelConfigSetting;
import java.util.ArrayList;
import android.app.Activity;
import android.view.ViewStub;
import kotlin.jvm.internal.n;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnLayoutChangeListener;

public final class 1jV implements View$OnLayoutChangeListener, 1JW
{
    public final TextView LIZ;
    public final View LIZIZ;
    public boolean LIZJ;
    public T16 LIZLLL;
    public final 1N0 LJ;
    public final 0iY LJFF;
    public final 0iV LJI;
    public final 0ia LJII;
    public final List<1JS> LJIIIIZZ;
    public final List<1JS> LJIIIZ;
    public OgM LJIIJ;
    public LiveEffect LJIIJJI;
    public 2fc LJIIL;
    public Fragment LJIILIIL;
    public String LJIILJJIL;
    public final Context LJIILL;
    public final DataChannel LJIILLIIL;
    public final View LJIIZILJ;
    public final 0iS LJIJ;
    public final T17 LJIJI;
    public final 0Gh LJIJJ;
    public final ViewGroup LJIJJLI;
    public int LJIL;
    
    static {
        Covode.recordClassIndex(6741);
    }
    
    public 1jV(final Context ljiill, final DataChannel ljiilliil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: sipush          5893
        //    12: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        X/1jV.LJIILL:Landroid/content/Context;
        //    20: aload_0        
        //    21: aload_2        
        //    22: putfield        X/1jV.LJIILLIIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    25: aload_1        
        //    26: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    29: invokestatic    X/1jV.LIZ:(Landroid/view/LayoutInflater;)Landroid/view/View;
        //    32: astore_3       
        //    33: aload_0        
        //    34: aload_3        
        //    35: putfield        X/1jV.LJIIZILJ:Landroid/view/View;
        //    38: aload_3        
        //    39: ldc             2131365090
        //    41: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    44: astore          4
        //    46: aload           4
        //    48: ldc             ""
        //    50: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    53: aload           4
        //    55: checkcast       LX/0iS;
        //    58: astore          5
        //    60: aload_0        
        //    61: aload           5
        //    63: putfield        X/1jV.LJIJ:LX/0iS;
        //    66: aload_3        
        //    67: ldc             2131372072
        //    69: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    72: astore          4
        //    74: aload           4
        //    76: ldc             ""
        //    78: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    81: aload           4
        //    83: checkcast       LX/T17;
        //    86: astore          4
        //    88: aload_0        
        //    89: aload           4
        //    91: putfield        X/1jV.LJIJI:LX/T17;
        //    94: aload_3        
        //    95: ldc             2131371750
        //    97: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   100: astore          6
        //   102: aload           6
        //   104: ldc             ""
        //   106: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   109: aload           6
        //   111: checkcast       LX/0Gh;
        //   114: astore          6
        //   116: aload_0        
        //   117: aload           6
        //   119: putfield        X/1jV.LJIJJ:LX/0Gh;
        //   122: aload_3        
        //   123: ldc             2131371740
        //   125: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   128: astore          7
        //   130: aload           7
        //   132: ldc             ""
        //   134: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   137: aload_0        
        //   138: aload           7
        //   140: checkcast       Landroid/widget/TextView;
        //   143: putfield        X/1jV.LIZ:Landroid/widget/TextView;
        //   146: aload_3        
        //   147: ldc             2131367861
        //   149: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   152: astore          7
        //   154: aload           7
        //   156: ldc             ""
        //   158: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   161: aload_0        
        //   162: aload           7
        //   164: putfield        X/1jV.LIZIZ:Landroid/view/View;
        //   167: new             LX/1N0;
        //   170: dup            
        //   171: aload_2        
        //   172: aload_1        
        //   173: invokespecial   X/1N0.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroid/content/Context;)V
        //   176: astore_2       
        //   177: aload_0        
        //   178: aload_2        
        //   179: putfield        X/1jV.LJ:LX/1N0;
        //   182: aload_0        
        //   183: aload_3        
        //   184: ldc             2131374231
        //   186: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   189: checkcast       Landroid/view/ViewGroup;
        //   192: putfield        X/1jV.LJIJJLI:Landroid/view/ViewGroup;
        //   195: aload_1        
        //   196: invokestatic    X/GTi.LIZ:(Landroid/content/Context;)LX/1nL;
        //   199: astore          8
        //   201: aload           8
        //   203: ifnonnull       209
        //   206: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   209: aload_3        
        //   210: ldc             2131365618
        //   212: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   215: checkcast       Landroid/view/ViewStub;
        //   218: invokevirtual   android/view/ViewStub.inflate:()Landroid/view/View;
        //   221: astore          7
        //   223: aload           7
        //   225: ldc             ""
        //   227: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   230: new             LX/0iY;
        //   233: dup            
        //   234: aload           8
        //   236: aload           7
        //   238: invokespecial   X/0iY.<init>:(Landroid/app/Activity;Landroid/view/View;)V
        //   241: astore          7
        //   243: aload_0        
        //   244: aload           7
        //   246: putfield        X/1jV.LJFF:LX/0iY;
        //   249: aload_1        
        //   250: invokestatic    X/GTi.LIZ:(Landroid/content/Context;)LX/1nL;
        //   253: astore_1       
        //   254: aload_1        
        //   255: ifnonnull       261
        //   258: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   261: aload_3        
        //   262: ldc             2131362261
        //   264: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   267: checkcast       Landroid/view/ViewStub;
        //   270: invokevirtual   android/view/ViewStub.inflate:()Landroid/view/View;
        //   273: astore          8
        //   275: aload           8
        //   277: ldc             ""
        //   279: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   282: new             LX/0iV;
        //   285: dup            
        //   286: aload_1        
        //   287: aload           8
        //   289: invokespecial   X/0iV.<init>:(Landroid/app/Activity;Landroid/view/View;)V
        //   292: astore          8
        //   294: aload_0        
        //   295: aload           8
        //   297: putfield        X/1jV.LJI:LX/0iV;
        //   300: new             LX/0ia;
        //   303: dup            
        //   304: aload           4
        //   306: aload           6
        //   308: invokespecial   X/0ia.<init>:(LX/T17;LX/0Gh;)V
        //   311: astore_1       
        //   312: aload_0        
        //   313: aload_1        
        //   314: putfield        X/1jV.LJII:LX/0ia;
        //   317: aload_0        
        //   318: new             Ljava/util/ArrayList;
        //   321: dup            
        //   322: invokespecial   java/util/ArrayList.<init>:()V
        //   325: putfield        X/1jV.LJIIIIZZ:Ljava/util/List;
        //   328: aload_0        
        //   329: new             Ljava/util/ArrayList;
        //   332: dup            
        //   333: invokespecial   java/util/ArrayList.<init>:()V
        //   336: putfield        X/1jV.LJIIIZ:Ljava/util/List;
        //   339: aload_3        
        //   340: ldc             2131364399
        //   342: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   345: ldc             ""
        //   347: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   350: aload           5
        //   352: iconst_1       
        //   353: invokevirtual   X/0iS.setShowEnable:(Z)V
        //   356: aload           5
        //   358: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //   361: aload           5
        //   363: new             LX/1Mv;
        //   366: dup            
        //   367: aload_0        
        //   368: invokespecial   X/1Mv.<init>:(LX/1jV;)V
        //   371: invokevirtual   X/0iS.setFavoriteStatusListener:(LX/0iQ;)V
        //   374: aload_3        
        //   375: ldc             2131371710
        //   377: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   380: astore          5
        //   382: aload           5
        //   384: ldc             ""
        //   386: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   389: aload           5
        //   391: invokevirtual   android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
        //   394: astore          5
        //   396: aload           5
        //   398: ldc             ""
        //   400: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   403: aload           5
        //   405: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting;
        //   408: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.getValue:()LX/GOr;
        //   411: getfield        X/GOr.LIZ:F
        //   414: ldc             255.0
        //   416: fmul           
        //   417: f2i            
        //   418: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //   421: aload_3        
        //   422: ldc             2131363014
        //   424: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   427: new             LX/0iW;
        //   430: dup            
        //   431: aload_0        
        //   432: invokespecial   X/0iW.<init>:(LX/1jV;)V
        //   435: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   438: new             LX/1Ms;
        //   441: dup            
        //   442: aload_0        
        //   443: invokespecial   X/1Ms.<init>:(LX/1jV;)V
        //   446: astore_3       
        //   447: aload_3        
        //   448: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //   451: aload_2        
        //   452: aload_3        
        //   453: putfield        X/1N0.LIZ:LX/0ib;
        //   456: aload           6
        //   458: aload_2        
        //   459: invokevirtual   X/0Gh.setAdapter:(Landroidx/viewpager/widget/PagerAdapter;)V
        //   462: aload           6
        //   464: iconst_3       
        //   465: invokevirtual   X/0Gh.setOffscreenPageLimit:(I)V
        //   468: aload           4
        //   470: aload           6
        //   472: iconst_0       
        //   473: iconst_0       
        //   474: invokevirtual   X/T17.LIZ:(LX/0Gh;ZZ)V
        //   477: aload           4
        //   479: new             LX/1Mt;
        //   482: dup            
        //   483: aload_0        
        //   484: invokespecial   X/1Mt.<init>:(LX/1jV;)V
        //   487: invokevirtual   X/T17.LIZ:(LX/I7l;)V
        //   490: getstatic       X/1Kj.LIZIZ:LX/1Kj;
        //   493: new             LX/1Mu;
        //   496: dup            
        //   497: aload_0        
        //   498: invokespecial   X/1Mu.<init>:(LX/1jV;)V
        //   501: invokevirtual   X/1Kj.LIZ:(LX/0gO;)V
        //   504: getstatic       X/0fx.LIZ:LX/0fx;
        //   507: invokevirtual   X/0fx.LIZ:()LX/1JQ;
        //   510: getstatic       X/0gZ.LIZIZ:Ljava/lang/String;
        //   513: invokeinterface X/0g8.LIZIZ:(Ljava/lang/String;)Ljava/util/List;
        //   518: astore_3       
        //   519: aload_3        
        //   520: ldc             ""
        //   522: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   525: aload           7
        //   527: aload_3        
        //   528: invokestatic    X/Qsi.LJIIJJI:(Ljava/util/List;)Ljava/lang/Object;
        //   531: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //   534: invokevirtual   X/0iY.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;)V
        //   537: getstatic       X/0fx.LIZ:LX/0fx;
        //   540: invokevirtual   X/0fx.LIZ:()LX/1JQ;
        //   543: getstatic       X/0gZ.LIZIZ:Ljava/lang/String;
        //   546: invokeinterface X/0g8.LIZIZ:(Ljava/lang/String;)Ljava/util/List;
        //   551: astore_3       
        //   552: aload_3        
        //   553: ldc             ""
        //   555: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   558: aload           8
        //   560: aload_3        
        //   561: invokestatic    X/Qsi.LJIIJJI:(Ljava/util/List;)Ljava/lang/Object;
        //   564: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //   567: invokevirtual   X/0iV.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;)V
        //   570: new             LX/1JS;
        //   573: dup            
        //   574: ldc_w           "favorite"
        //   577: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   580: astore_3       
        //   581: ldc_w           2131829606
        //   584: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   587: astore          4
        //   589: aload           4
        //   591: ldc             ""
        //   593: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   596: new             LX/1JS;
        //   599: dup            
        //   600: aload           4
        //   602: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   605: astore          4
        //   607: ldc_w           2131829605
        //   610: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   613: astore          6
        //   615: aload           6
        //   617: ldc             ""
        //   619: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   622: bipush          6
        //   624: anewarray       LX/1JS;
        //   627: dup            
        //   628: iconst_0       
        //   629: aload_3        
        //   630: aastore        
        //   631: dup            
        //   632: iconst_1       
        //   633: aload           4
        //   635: aastore        
        //   636: dup            
        //   637: iconst_2       
        //   638: new             LX/1JS;
        //   641: dup            
        //   642: aload           6
        //   644: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   647: aastore        
        //   648: dup            
        //   649: iconst_3       
        //   650: new             LX/1JS;
        //   653: dup            
        //   654: ldc_w           "..."
        //   657: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   660: aastore        
        //   661: dup            
        //   662: iconst_4       
        //   663: new             LX/1JS;
        //   666: dup            
        //   667: ldc_w           "..."
        //   670: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   673: aastore        
        //   674: dup            
        //   675: iconst_5       
        //   676: new             LX/1JS;
        //   679: dup            
        //   680: ldc_w           "..."
        //   683: invokespecial   X/1JS.<init>:(Ljava/lang/String;)V
        //   686: aastore        
        //   687: invokestatic    X/Ey9.LIZIZ:([Ljava/lang/Object;)Ljava/util/List;
        //   690: astore_3       
        //   691: aload_2        
        //   692: aload_3        
        //   693: invokevirtual   X/1N0.LIZ:(Ljava/util/List;)V
        //   696: aload_1        
        //   697: iconst_1       
        //   698: putfield        X/0ia.LIZ:I
        //   701: aload_1        
        //   702: aload_3        
        //   703: invokevirtual   X/0ia.LIZ:(Ljava/util/List;)V
        //   706: getstatic       X/GST.LLLLLLLZIL:LX/44V;
        //   709: astore_1       
        //   710: aload_1        
        //   711: ldc             ""
        //   713: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   716: aload_1        
        //   717: iconst_1       
        //   718: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   721: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   724: sipush          5893
        //   727: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   730: return         
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
    
    public static View LIZ(final LayoutInflater layoutInflater) {
        MethodCollector.i(5983);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131561947, (ViewGroup)null);
                MethodCollector.o(5983);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131561947, (ViewGroup)null);
        MethodCollector.o(5983);
        return inflate2;
    }
    
    public final void LIZ() {
        this.LJIIZILJ.addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        final OgM ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.LIZ(0gZ.LIZIZ);
        }
        final Iterator<Object> iterator = this.LJ.LIZLLL.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZIZ();
        }
        if (GTi.LIZJ()) {
            0aP.LIZLLL.LJFF((X.S4L<HPK>)FIV.LIZ.LIZ((Class)HPU.class));
        }
        else {
            this.LJIILLIIL.LIZJ((Class)2Bz.class);
        }
        if (this.LJIIJJI != null) {
            this.LJ.LIZJ();
        }
        final OgM ljiij2 = this.LJIIJ;
        if (ljiij2 != null) {
            ljiij2.LIZ(this.LJIJJLI);
        }
        final T16 lizlll = this.LIZLLL;
        if (lizlll != null) {
            this.LJ.LIZ(lizlll.LIZLLL);
        }
    }
    
    public final void LIZ(final DialogFragment ljiiliil) {
        public final class 1u6 extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ 1jV LIZ;
            
            static {
                Covode.recordClassIndex(6747);
            }
            
            public 1u6(final 1jV liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/1jV.LJIILIIL:Landroidx/fragment/app/Fragment;
        //     9: aload_0        
        //    10: getfield        X/1jV.LJIILLIIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: aload_1        
        //    14: ldc_w           LX/2C1;.class
        //    17: new             LX/1u6;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   X/1u6.<init>:(LX/1jV;)V
        //    25: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    28: pop            
        //    29: aload_0        
        //    30: getfield        X/1jV.LJIIJJI:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    33: ifnonnull       72
        //    36: ldc_w           "normal_icon"
        //    39: astore_1       
        //    40: aload_1        
        //    41: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    44: aload_1        
        //    45: putstatic       X/1Jg.LIZ:Ljava/lang/String;
        //    48: aload_0        
        //    49: getfield        X/1jV.LJIIJJI:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnull          67
        //    57: aload_1        
        //    58: getfield        com/bytedance/android/livesdkapi/depend/model/LiveEffect.isFromOtherUser:Z
        //    61: istore_2       
        //    62: iload_2        
        //    63: putstatic       X/1Jg.LJI:Z
        //    66: return         
        //    67: iconst_0       
        //    68: istore_2       
        //    69: goto            62
        //    72: ldc_w           "special_icon"
        //    75: astore_1       
        //    76: goto            40
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
    
    public final void LIZ(final LiveEffect liveEffect) {
        final 1Km 1Km = (1Km)this.LJIILLIIL.LIZIZ((Class)2CP.class);
        Object o;
        if (1Km == null || (o = 1Km.LIZIZ) == null) {
            o = 6uH.INSTANCE;
        }
        if (Qsi.LIZ((Iterable)o, (Object)liveEffect)) {
            this.LJIJ.LIZ(liveEffect, true);
            return;
        }
        final Iterator iterator = ((Iterable)o).iterator();
        while (iterator.hasNext()) {
            if (0iM.LIZ((LiveEffect)iterator.next(), liveEffect)) {
                this.LJIJ.LIZ(liveEffect, true);
                return;
            }
        }
        this.LJIJ.LIZ(liveEffect, false);
    }
    
    public final void LIZIZ() {
        GTi.LIZ((View)this.LIZ);
        final Iterator<Object> iterator = this.LJ.LIZLLL.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZJ();
        }
        final OgM ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.LIZIZ(0gZ.LIZIZ);
        }
        if (GTi.LIZJ()) {
            0aP.LIZLLL.LJ((X.S4L<HPK>)FIV.LIZ.LIZ((Class)HPU.class));
        }
        else {
            this.LJIILLIIL.LIZJ((Class)2By.class);
        }
        1Jg.LIZ = "normal_icon";
        this.LJIL = 0;
        this.LJIIZILJ.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        this.LJIILLIIL.LIZIZ((Class)GOu.class, (Object)new Gh3(false, 0, this.hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
    }
    
    public final View LIZJ() {
        final View ljiizilj = this.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj, "");
        return ljiizilj;
    }
    
    public final void onLayoutChange(View view, int height, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        view = this.LJIIZILJ;
        n.LIZIZ((Object)view, "");
        height = view.getHeight();
        view = this.LJIIZILJ.findViewById(2131364399);
        n.LIZIZ((Object)view, "");
        height -= view.getHeight();
        if (this.LJIL != height) {
            this.LJIL = height;
            this.LJIILLIIL.LIZIZ((Class)GOu.class, (Object)new Gh3(true, height, this.hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
    }
}
