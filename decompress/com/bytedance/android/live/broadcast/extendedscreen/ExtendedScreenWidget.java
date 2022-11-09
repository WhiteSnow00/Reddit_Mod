// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.extendedscreen;

import X.44T;
import com.bytedance.android.widget.Widget;
import X.0CC;
import X.0CH;
import X.GNS;
import X.H9s;
import X.GbJ;
import X.QgG;
import X.44V;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup$LayoutParams;
import X.GTi;
import X.G5o;
import X.Gkn;
import android.os.SystemClock;
import X.Gtd;
import X.Fqb;
import X.G6q;
import X.Fra;
import X.Gss;
import X.GST;
import X.Gsw;
import X.H01;
import X.HPq;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.G6s;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Objects;
import X.Gsr;
import X.F5g;
import X.G69;
import kotlin.jvm.internal.n;
import android.view.View;
import X.0cB;
import X.2vV;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.covode.number.Covode;
import X.2P9;
import X.SRS;
import X.10I;
import X.5DO;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.H6J;
import X.WJy;
import X.GLw;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public final class ExtendedScreenWidget extends LiveRecyclableWidget implements 6mZ
{
    public GLw LIZ;
    public WJy LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public H6J LJ;
    public boolean LJFF;
    public boolean LJI;
    public String LJII;
    public LiveWidget LJIIIIZZ;
    public long LJIIIZ;
    public final WidgetCreateTimeUtil LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final 5DO LJIILIIL;
    public final 5DO LJIILJJIL;
    public final 5DO LJIILL;
    public 10I LJIILLIIL;
    public SRS<? super Float, 2P9> LJIIZILJ;
    public final 5DO LJIJ;
    
    static {
        Covode.recordClassIndex(5361);
    }
    
    public ExtendedScreenWidget() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveRecyclableWidget.<init>:()V
        //     4: aload_0        
        //     5: new             Lcom/bytedance/ies/sdk/widgets/WidgetCreateTimeUtil;
        //     8: dup            
        //     9: aconst_null    
        //    10: iconst_1       
        //    11: aconst_null    
        //    12: invokespecial   com/bytedance/ies/sdk/widgets/WidgetCreateTimeUtil.<init>:(LX/SRS;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    15: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIJ:Lcom/bytedance/ies/sdk/widgets/WidgetCreateTimeUtil;
        //    18: aload_0        
        //    19: invokestatic    X/2vV.LIZIZ:()I
        //    22: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZJ:I
        //    25: aload_0        
        //    26: getstatic       X/H6J.HIDE:LX/H6J;
        //    29: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJ:LX/H6J;
        //    32: aload_0        
        //    33: ldc             200.0
        //    35: invokestatic    X/0cB.LIZ:(F)I
        //    38: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIJJI:I
        //    41: aload_0        
        //    42: ldc             90.0
        //    44: invokestatic    X/0cB.LIZ:(F)I
        //    47: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIL:I
        //    50: ldc             148.0
        //    52: invokestatic    X/0cB.LIZ:(F)I
        //    55: pop            
        //    56: aload_0        
        //    57: ldc             "draw"
        //    59: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJII:Ljava/lang/String;
        //    62: aload_0        
        //    63: new             LX/1rs;
        //    66: dup            
        //    67: aload_0        
        //    68: invokespecial   X/1rs.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //    71: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    74: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILIIL:LX/5DO;
        //    77: aload_0        
        //    78: new             LX/1rq;
        //    81: dup            
        //    82: aload_0        
        //    83: invokespecial   X/1rq.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //    86: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    89: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILJJIL:LX/5DO;
        //    92: aload_0        
        //    93: new             LX/1rr;
        //    96: dup            
        //    97: aload_0        
        //    98: invokespecial   X/1rr.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   101: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //   104: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILL:LX/5DO;
        //   107: aload_0        
        //   108: new             LX/1rh;
        //   111: dup            
        //   112: aload_0        
        //   113: invokespecial   X/1rh.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   116: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //   119: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIJ:LX/5DO;
        //   122: return         
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
    
    private final View LIZLLL() {
        return (View)this.LJIJ.getValue();
    }
    
    public final View LIZ() {
        return (View)this.LJIILJJIL.getValue();
    }
    
    public final void LIZ(final GLw gLw) {
        this.LIZ = gLw;
        final WJy liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setGestureDetectLayout(gLw);
        }
        final WJy liziz2 = this.LIZIZ;
        if (liziz2 != null) {
            final SRS<? super Float, 2P9> ljiizilj = this.LJIIZILJ;
            if (ljiizilj == null) {
                n.LIZ("");
            }
            liziz2.setOnScrollListener((SRS)ljiizilj);
        }
    }
    
    public final void LIZIZ() {
        final WJy liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setShouldHandleMove(false);
        }
        this.LJII = "link_accept";
        this.LJFF = true;
        this.LIZJ();
    }
    
    public final void LIZJ() {
        if (this.LJ == H6J.HIDE) {
            return;
        }
        if (!this.LJI) {
            this.LJI = true;
            final WJy liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ();
            }
        }
    }
    
    public final int getLayoutId() {
        return 2131562460;
    }
    
    public final void onInit(final Object[] array) {
        this.LIZIZ = (WJy)((LiveWidget)this).findViewById(2131372690);
        ((LiveWidget)this).dataChannel.LIZIZ((Class)G69.class);
    }
    
    public final void onLoad(final Object[] array) {
        public final class 1rp extends F5g implements QgG<Boolean>
        {
            public final /* synthetic */ ExtendedScreenWidget LIZ;
            
            static {
                Covode.recordClassIndex(5371);
            }
            
            public 1rp(final ExtendedScreenWidget liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        public final class 1ro extends F5g implements SRS<Float, 2P9>
        {
            public final /* synthetic */ ExtendedScreenWidget LIZ;
            
            static {
                Covode.recordClassIndex(5370);
            }
            
            public 1ro(final ExtendedScreenWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: aload_1        
        //     3: ifnull          728
        //     6: aload_1        
        //     7: arraylength    
        //     8: ifne            723
        //    11: iconst_1       
        //    12: istore_3       
        //    13: iload_3        
        //    14: iconst_1       
        //    15: ixor           
        //    16: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    19: astore          4
        //    21: aload           4
        //    23: invokestatic    X/GTi.LIZ:(Ljava/lang/Boolean;)Z
        //    26: ifeq            55
        //    29: aload_1        
        //    30: ifnull          717
        //    33: aload_1        
        //    34: iconst_0       
        //    35: aaload         
        //    36: astore          4
        //    38: aload           4
        //    40: instanceof      LX/GNS;
        //    43: ifeq            55
        //    46: aload_1        
        //    47: iconst_0       
        //    48: aaload         
        //    49: ldc             "null cannot be cast to non-null type com.bytedance.android.livesdk.model.ViewLevelInExtendScreen"
        //    51: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    54: pop            
        //    55: aload_0        
        //    56: invokevirtual   com/bytedance/android/widget/Widget.hide:()V
        //    59: aload_0        
        //    60: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZIZ:LX/WJy;
        //    63: astore_1       
        //    64: aload_1        
        //    65: ifnull          76
        //    68: aload_1        
        //    69: aload_0        
        //    70: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZ:LX/GLw;
        //    73: invokevirtual   X/WJy.setGestureDetectLayout:(LX/GLw;)V
        //    76: new             LX/1ro;
        //    79: dup            
        //    80: aload_0        
        //    81: invokespecial   X/1ro.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //    84: astore_1       
        //    85: aload_0        
        //    86: aload_1        
        //    87: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIZILJ:LX/SRS;
        //    90: aload_0        
        //    91: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZIZ:LX/WJy;
        //    94: astore          4
        //    96: aload           4
        //    98: ifnull          107
        //   101: aload           4
        //   103: aload_1        
        //   104: invokevirtual   X/WJy.setOnScrollListener:(LX/SRS;)V
        //   107: aload_0        
        //   108: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZIZ:LX/WJy;
        //   111: astore_1       
        //   112: aload_1        
        //   113: ifnull          128
        //   116: aload_1        
        //   117: new             LX/1rp;
        //   120: dup            
        //   121: aload_0        
        //   122: invokespecial   X/1rp.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   125: invokevirtual   X/WJy.setOnScrollInterceptor:(LX/QgG;)V
        //   128: aload_0        
        //   129: aload_0        
        //   130: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIJ:Lcom/bytedance/ies/sdk/widgets/WidgetCreateTimeUtil;
        //   133: getstatic       X/1NI.LIZ:LX/1NI;
        //   136: getstatic       com/bytedance/ies/sdk/widgets/LiveWidgetNonOpProvider.Companion:Lcom/bytedance/ies/sdk/widgets/LiveWidgetNonOpProvider$Companion;
        //   139: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidgetNonOpProvider$Companion.getInstance:()Lcom/bytedance/ies/sdk/widgets/LiveWidgetNonOpProvider;
        //   142: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.enableSubWidgetManager:(LX/H7v;Lcom/bytedance/ies/sdk/widgets/FluencyOpt;Lcom/bytedance/ies/sdk/widgets/IWidgetProvider;)V
        //   145: aload_0        
        //   146: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   149: astore_1       
        //   150: aload_1        
        //   151: ifnull          272
        //   154: aload_1        
        //   155: ldc_w           LX/G6q;.class
        //   158: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   161: checkcast       LX/Fra;
        //   164: astore_1       
        //   165: aload_1        
        //   166: ifnull          272
        //   169: aload_1        
        //   170: invokestatic    X/Fqb.LJ:(LX/Fra;)Z
        //   173: iconst_1       
        //   174: if_icmpne       272
        //   177: ldc_w           Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;.class
        //   180: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   183: checkcast       Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;
        //   186: astore          5
        //   188: aload_0        
        //   189: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   192: astore          4
        //   194: aload           4
        //   196: ldc             ""
        //   198: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   201: aload_0        
        //   202: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILIIL:LX/5DO;
        //   205: invokeinterface X/5DO.getValue:()Ljava/lang/Object;
        //   210: checkcast       Landroid/widget/TextView;
        //   213: astore          6
        //   215: aload           6
        //   217: ldc             ""
        //   219: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   222: aload_0        
        //   223: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILL:LX/5DO;
        //   226: invokeinterface X/5DO.getValue:()Ljava/lang/Object;
        //   231: checkcast       LX/H7p;
        //   234: astore_1       
        //   235: aload_1        
        //   236: ldc             ""
        //   238: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   241: aload_0        
        //   242: aload           5
        //   244: aload_0        
        //   245: aload           4
        //   247: aload           6
        //   249: aload_1        
        //   250: ldc_w           2131372681
        //   253: ldc_w           2131372688
        //   256: new             LX/1Gb;
        //   259: dup            
        //   260: aload_0        
        //   261: invokespecial   X/1Gb.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   264: invokeinterface com/bytedance/android/live/publicscreen/api/IPublicScreenService.getGiftHistoryWidgetHelper:(LX/0CH;Lcom/bytedance/ies/sdk/datachannel/DataChannel;Landroid/widget/TextView;LX/H7p;IILX/10J;)LX/10I;
        //   269: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILLIIL:LX/10I;
        //   272: aload_0        
        //   273: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   276: astore          4
        //   278: aload_2        
        //   279: astore_1       
        //   280: aload           4
        //   282: ifnull          314
        //   285: aload           4
        //   287: ldc_w           LX/G6q;.class
        //   290: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   293: checkcast       LX/Fra;
        //   296: astore          4
        //   298: aload_2        
        //   299: astore_1       
        //   300: aload           4
        //   302: ifnull          314
        //   305: aload           4
        //   307: invokestatic    X/Fqb.LIZIZ:(LX/Fra;)Z
        //   310: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   313: astore_1       
        //   314: aload_1        
        //   315: invokestatic    X/GTi.LIZ:(Ljava/lang/Boolean;)Z
        //   318: ifeq            364
        //   321: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting;
        //   324: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.getEnable:()Z
        //   327: ifeq            364
        //   330: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting;
        //   333: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.getEnableSingle:()Z
        //   336: ifeq            680
        //   339: aload_0        
        //   340: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.subWidgetManager:Lcom/bytedance/ies/sdk/widgets/RecyclableWidgetManager;
        //   343: ldc_w           2131372681
        //   346: ldc_w           Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;.class
        //   349: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   352: checkcast       Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;
        //   355: invokeinterface com/bytedance/android/live/publicscreen/api/IPublicScreenService.getExtendedScreenRadioFilterWidget:()Ljava/lang/Class;
        //   360: invokevirtual   com/bytedance/ies/sdk/widgets/RecyclableWidgetManager.load:(ILjava/lang/Class;)Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;
        //   363: pop            
        //   364: aload_0        
        //   365: invokespecial   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZLLL:()Landroid/view/View;
        //   368: astore_1       
        //   369: aload_1        
        //   370: ldc             ""
        //   372: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   375: aload_1        
        //   376: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   379: astore_1       
        //   380: aload_1        
        //   381: ldc_w           "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
        //   384: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   387: pop            
        //   388: aload_1        
        //   389: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //   392: astore_1       
        //   393: aload_0        
        //   394: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIJJI:I
        //   397: istore_3       
        //   398: aload_1        
        //   399: aload_0        
        //   400: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIL:I
        //   403: putfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   406: aload_0        
        //   407: invokevirtual   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZ:()Landroid/view/View;
        //   410: astore          4
        //   412: aload           4
        //   414: ldc             ""
        //   416: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   419: aload           4
        //   421: invokevirtual   android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
        //   424: astore          4
        //   426: aload           4
        //   428: ldc_w           "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
        //   431: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   434: pop            
        //   435: aload           4
        //   437: checkcast       Landroid/view/ViewGroup$MarginLayoutParams;
        //   440: astore          4
        //   442: aload           4
        //   444: iload_3        
        //   445: putfield        android/view/ViewGroup$MarginLayoutParams.topMargin:I
        //   448: aload_0        
        //   449: invokevirtual   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZ:()Landroid/view/View;
        //   452: astore_2       
        //   453: aload_2        
        //   454: ldc             ""
        //   456: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   459: aload_2        
        //   460: aload           4
        //   462: invokevirtual   android/view/View.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   465: aload_0        
        //   466: getfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIILLIIL:LX/10I;
        //   469: astore          4
        //   471: aload           4
        //   473: ifnull          484
        //   476: aload           4
        //   478: iload_3        
        //   479: invokeinterface X/10I.LIZ:(I)V
        //   484: aload_0        
        //   485: invokespecial   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZLLL:()Landroid/view/View;
        //   488: astore          4
        //   490: aload           4
        //   492: ldc             ""
        //   494: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   497: aload           4
        //   499: aload_1        
        //   500: invokevirtual   android/view/View.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
        //   503: aload_0        
        //   504: aload_0        
        //   505: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.subWidgetManager:Lcom/bytedance/ies/sdk/widgets/RecyclableWidgetManager;
        //   508: aload_0        
        //   509: invokevirtual   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZ:()Landroid/view/View;
        //   512: ldc_w           Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;.class
        //   515: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   518: checkcast       Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;
        //   521: invokeinterface com/bytedance/android/live/publicscreen/api/IPublicScreenService.getExtendedPublicScreenWidget:()Ljava/lang/Class;
        //   526: invokevirtual   com/bytedance/ies/sdk/widgets/RecyclableWidgetManager.load:(Landroid/view/View;Ljava/lang/Class;)Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;
        //   529: putfield        com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LJIIIIZZ:Lcom/bytedance/ies/sdk/widgets/LiveWidget;
        //   532: aload_0        
        //   533: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.subWidgetManager:Lcom/bytedance/ies/sdk/widgets/RecyclableWidgetManager;
        //   536: astore          4
        //   538: aload_0        
        //   539: invokespecial   com/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget.LIZLLL:()Landroid/view/View;
        //   542: astore_2       
        //   543: ldc_w           Lcom/bytedance/android/live/gift/IGiftService;.class
        //   546: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   549: astore_1       
        //   550: aload_1        
        //   551: ldc             ""
        //   553: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   556: aload           4
        //   558: aload_2        
        //   559: aload_1        
        //   560: checkcast       Lcom/bytedance/android/live/gift/IGiftService;
        //   563: invokeinterface com/bytedance/android/live/gift/IGiftService.getExtendScreenGiftTrayWidget:()Ljava/lang/Class;
        //   568: invokevirtual   com/bytedance/ies/sdk/widgets/RecyclableWidgetManager.load:(Landroid/view/View;Ljava/lang/Class;)Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;
        //   571: pop            
        //   572: aload_0        
        //   573: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   576: astore_1       
        //   577: aload_1        
        //   578: aload_0        
        //   579: ldc_w           LX/GbJ;.class
        //   582: new             LX/1ri;
        //   585: dup            
        //   586: aload_0        
        //   587: invokespecial   X/1ri.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   590: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   593: pop            
        //   594: aload_1        
        //   595: aload_0        
        //   596: ldc_w           LX/2E8;.class
        //   599: new             LX/1rj;
        //   602: dup            
        //   603: aload_0        
        //   604: invokespecial   X/1rj.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   607: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   610: pop            
        //   611: aload_1        
        //   612: aload_0        
        //   613: ldc_w           LX/2Dv;.class
        //   616: new             LX/1rk;
        //   619: dup            
        //   620: aload_0        
        //   621: invokespecial   X/1rk.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   624: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   627: pop            
        //   628: aload_1        
        //   629: aload_0        
        //   630: ldc_w           LX/2Du;.class
        //   633: new             LX/1rl;
        //   636: dup            
        //   637: aload_0        
        //   638: invokespecial   X/1rl.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   641: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   644: pop            
        //   645: aload_1        
        //   646: aload_0        
        //   647: ldc_w           LX/2EV;.class
        //   650: new             LX/1rm;
        //   653: dup            
        //   654: aload_0        
        //   655: invokespecial   X/1rm.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   658: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   661: pop            
        //   662: aload_1        
        //   663: aload_0        
        //   664: ldc_w           LX/Gsq;.class
        //   667: new             LX/1rn;
        //   670: dup            
        //   671: aload_0        
        //   672: invokespecial   X/1rn.<init>:(Lcom/bytedance/android/live/broadcast/extendedscreen/ExtendedScreenWidget;)V
        //   675: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   678: pop            
        //   679: return         
        //   680: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting;
        //   683: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveExtendedScreenFilterTypeSetting.getEnableMulti:()Z
        //   686: ifeq            364
        //   689: aload_0        
        //   690: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.subWidgetManager:Lcom/bytedance/ies/sdk/widgets/RecyclableWidgetManager;
        //   693: ldc_w           2131372681
        //   696: ldc_w           Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;.class
        //   699: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   702: checkcast       Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;
        //   705: invokeinterface com/bytedance/android/live/publicscreen/api/IPublicScreenService.getExtendedScreenMultiFilterWidget:()Ljava/lang/Class;
        //   710: invokevirtual   com/bytedance/ies/sdk/widgets/RecyclableWidgetManager.load:(ILjava/lang/Class;)Lcom/bytedance/ies/sdk/widgets/LiveRecyclableWidget;
        //   713: pop            
        //   714: goto            364
        //   717: aconst_null    
        //   718: astore          4
        //   720: goto            38
        //   723: iconst_0       
        //   724: istore_3       
        //   725: goto            13
        //   728: aconst_null    
        //   729: astore          4
        //   731: goto            21
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public final void onUnload() {
        final WJy liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZIZ();
        }
    }
}
