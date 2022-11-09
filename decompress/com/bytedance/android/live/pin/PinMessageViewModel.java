// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.pin;

import X.HYk;
import X.44T;
import java.util.List;
import X.0zV;
import X.Hf4;
import X.0cB;
import com.bytedance.android.livesdk.model.message.PinMessage;
import X.GIK;
import X.Fk2;
import X.0zX;
import android.os.SystemClock;
import X.44V;
import X.HDk;
import X.11J;
import com.bytedance.android.live.base.model.user.User;
import X.Fsd;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.GTi;
import X.Gkn;
import X.10h;
import X.2Gr;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import kotlin.jvm.internal.n;
import X.GST;
import X.1eV;
import X.0jR;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import X.CTM;
import X.2Hf;
import X.2P9;
import X.SRS;
import X.F5g;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAutoTranslateSetting;
import com.bytedance.covode.number.Covode;
import X.15z;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.HYq;
import X.HYh;
import androidx.lifecycle.LiveData;
import X.H31;
import X.2Gk;
import X.1e7;
import X.10r;
import X.0zY;
import X.0Bq;

public final class PinMessageViewModel extends 0Bq implements a
{
    public 10r LIZ;
    public 1e7<2Gk<? extends H31>> LIZIZ;
    public 1e7<2Gk<? extends H31>> LIZJ;
    public 1e7<2Gk<? extends H31>> LIZLLL;
    public final LiveData<1e7<2Gk<? extends H31>>> LJ;
    public boolean LJFF;
    public final int LJI;
    public HYh LJII;
    public HYq<PinMessageViewModel.a> LJIIIIZZ;
    public long LJIIIZ;
    public Long LJIIJ;
    public DataChannel LJIIJJI;
    public final 15z<1e7<2Gk<? extends H31>>> LJIIL;
    public boolean LJIILIIL;
    
    static {
        Covode.recordClassIndex(10505);
    }
    
    public PinMessageViewModel() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/0Bq.<init>:()V
        //     4: new             LX/15z;
        //     7: dup            
        //     8: invokespecial   X/15z.<init>:()V
        //    11: astore_1       
        //    12: aload_0        
        //    13: aload_1        
        //    14: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIL:LX/15z;
        //    17: aload_0        
        //    18: aload_1        
        //    19: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJ:Landroidx/lifecycle/LiveData;
        //    22: aload_0        
        //    23: invokestatic    com/bytedance/android/livesdk/livesetting/publicscreen/LiveAutoTranslateSetting.getValue:()I
        //    26: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJI:I
        //    29: aload_0        
        //    30: new             LX/1dp;
        //    33: dup            
        //    34: aload_0        
        //    35: invokespecial   X/1dp.<init>:(Lcom/bytedance/android/live/pin/PinMessageViewModel;)V
        //    38: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIIIZZ:LX/HYq;
        //    41: return         
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
    
    private final void LIZ(final 1e7<2Gk<? extends H31>> 1e7) {
        public final class 29Z extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ 2Hf LIZ;
            public final /* synthetic */ PinMessageViewModel LIZIZ;
            
            static {
                Covode.recordClassIndex(10507);
            }
            
            public 29Z(final 2Hf liz, final PinMessageViewModel liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LIZ:LX/10r;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          127
        //     9: aload_2        
        //    10: getfield        X/10r.LJIIL:Z
        //    13: ifne            17
        //    16: return         
        //    17: aload_2        
        //    18: getfield        X/10r.LJIILJJIL:Z
        //    21: ifeq            382
        //    24: getstatic       X/GST.o:LX/44V;
        //    27: astore_3       
        //    28: aload_3        
        //    29: ldc             ""
        //    31: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    34: aload_3        
        //    35: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //    38: checkcast       Ljava/lang/Boolean;
        //    41: astore_3       
        //    42: aload_0        
        //    43: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJI:I
        //    46: ifeq            127
        //    49: aload_3        
        //    50: ldc             ""
        //    52: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: aload_3        
        //    56: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    59: ifeq            127
        //    62: aload_0        
        //    63: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJII:LX/HYh;
        //    66: astore_3       
        //    67: aload_3        
        //    68: ifnull          127
        //    71: aload_3        
        //    72: aload_1        
        //    73: getfield        X/1e7.LIZJ:Z
        //    76: aload_1        
        //    77: getfield        X/1e7.LIZIZ:LX/2Gk;
        //    80: invokevirtual   X/HYh.LIZ:(ZLX/2Gk;)Z
        //    83: iconst_1       
        //    84: if_icmpne       127
        //    87: aload_2        
        //    88: getfield        X/10r.LJIILJJIL:Z
        //    91: ifeq            369
        //    94: getstatic       X/GST.o:LX/44V;
        //    97: iconst_0       
        //    98: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   101: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   104: invokestatic    com/bytedance/android/livesdk/livesetting/publicscreen/LiveAutoTranslateSetting.getValue:()I
        //   107: istore          4
        //   109: iload           4
        //   111: iconst_1       
        //   112: if_icmpeq       244
        //   115: iload           4
        //   117: iconst_2       
        //   118: if_icmpeq       128
        //   121: iload           4
        //   123: iconst_3       
        //   124: if_icmpeq       244
        //   127: return         
        //   128: new             Lcom/bytedance/android/livesdk/model/message/RoomMessage;
        //   131: dup            
        //   132: invokespecial   com/bytedance/android/livesdk/model/message/RoomMessage.<init>:()V
        //   135: astore_3       
        //   136: new             Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //   139: dup            
        //   140: invokespecial   com/bytedance/android/livesdkapi/message/CommonMessageData.<init>:()V
        //   143: astore_1       
        //   144: aload_1        
        //   145: aload_2        
        //   146: getfield        X/10r.LIZ:J
        //   149: putfield        com/bytedance/android/livesdkapi/message/CommonMessageData.LIZJ:J
        //   152: aload_1        
        //   153: iconst_1       
        //   154: putfield        com/bytedance/android/livesdkapi/message/CommonMessageData.LJI:Z
        //   157: aload_3        
        //   158: aload_1        
        //   159: putfield        X/HDi.baseMessage:Lcom/bytedance/android/livesdkapi/message/CommonMessageData;
        //   162: new             LX/2Hf;
        //   165: dup            
        //   166: aload_3        
        //   167: invokespecial   X/2Hf.<init>:(Lcom/bytedance/android/livesdk/model/message/RoomMessage;)V
        //   170: astore_1       
        //   171: ldc             Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;.class
        //   173: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   176: checkcast       Lcom/bytedance/android/live/publicscreen/api/IPublicScreenService;
        //   179: astore_3       
        //   180: aload_3        
        //   181: ifnull          217
        //   184: aload_0        
        //   185: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJ:Ljava/lang/Long;
        //   188: astore_2       
        //   189: aload_2        
        //   190: ifnull          211
        //   193: aload_2        
        //   194: invokevirtual   java/lang/Long.longValue:()J
        //   197: lstore          5
        //   199: aload_3        
        //   200: lload           5
        //   202: aload_1        
        //   203: iconst_0       
        //   204: invokeinterface com/bytedance/android/live/publicscreen/api/IPublicScreenService.insertModel:(JLX/1eV;Z)J
        //   209: pop2           
        //   210: return         
        //   211: lconst_0       
        //   212: lstore          5
        //   214: goto            199
        //   217: aload_0        
        //   218: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   221: astore_3       
        //   222: aload_3        
        //   223: ifnull          127
        //   226: aload_3        
        //   227: aload_0        
        //   228: ldc             LX/2Gr;.class
        //   230: new             LX/29Z;
        //   233: dup            
        //   234: aload_1        
        //   235: aload_0        
        //   236: invokespecial   X/29Z.<init>:(LX/2Hf;Lcom/bytedance/android/live/pin/PinMessageViewModel;)V
        //   239: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   242: pop            
        //   243: return         
        //   244: aload_2        
        //   245: getfield        X/10r.LJIILJJIL:Z
        //   248: ifeq            309
        //   251: getstatic       X/Gr0.LJ:LX/Gr0;
        //   254: astore_1       
        //   255: new             LX/1In;
        //   258: dup            
        //   259: getstatic       X/GOH.MORE:LX/GOH;
        //   262: aload_0        
        //   263: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   266: invokevirtual   X/GOH.getView:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Landroid/view/View;
        //   269: invokespecial   X/1In.<init>:(Landroid/view/View;)V
        //   272: astore_3       
        //   273: aload_3        
        //   274: ldc2_w          5000
        //   277: invokevirtual   X/0f5.LIZ:(J)LX/0f5;
        //   280: pop            
        //   281: aload_3        
        //   282: ldc             2131829132
        //   284: invokevirtual   X/0f5.LJFF:(I)LX/0f5;
        //   287: pop            
        //   288: aload_3        
        //   289: invokevirtual   X/1In.LIZ:()LX/1Io;
        //   292: astore_3       
        //   293: aload_3        
        //   294: ldc             ""
        //   296: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   299: aload_1        
        //   300: aload_3        
        //   301: getstatic       X/GaK.AUTO_TRANSLATE:LX/GaK;
        //   304: iconst_0       
        //   305: invokevirtual   X/Gr0.LIZ:(LX/0f6;LX/GaK;Z)V
        //   308: return         
        //   309: getstatic       X/Gr0.LJ:LX/Gr0;
        //   312: astore_1       
        //   313: new             LX/1In;
        //   316: dup            
        //   317: getstatic       X/GOH.SHARE:LX/GOH;
        //   320: aload_0        
        //   321: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   324: invokevirtual   X/GOH.getView:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Landroid/view/View;
        //   327: invokespecial   X/1In.<init>:(Landroid/view/View;)V
        //   330: astore_3       
        //   331: aload_3        
        //   332: ldc2_w          5000
        //   335: invokevirtual   X/0f5.LIZ:(J)LX/0f5;
        //   338: pop            
        //   339: aload_3        
        //   340: ldc             2131829132
        //   342: invokevirtual   X/0f5.LJFF:(I)LX/0f5;
        //   345: pop            
        //   346: aload_3        
        //   347: invokevirtual   X/1In.LIZ:()LX/1Io;
        //   350: astore_3       
        //   351: aload_3        
        //   352: ldc             ""
        //   354: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   357: aload_1        
        //   358: aload_3        
        //   359: getstatic       X/GaK.AUTO_TRANSLATE:LX/GaK;
        //   362: iconst_0       
        //   363: invokevirtual   X/Gr0.LIZ:(LX/0f6;LX/GaK;Z)V
        //   366: goto            127
        //   369: getstatic       X/GST.l:LX/44V;
        //   372: iconst_0       
        //   373: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   376: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   379: goto            104
        //   382: getstatic       X/GST.l:LX/44V;
        //   385: astore_3       
        //   386: aload_3        
        //   387: ldc             ""
        //   389: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   392: aload_3        
        //   393: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   396: checkcast       Ljava/lang/Boolean;
        //   399: astore_3       
        //   400: goto            42
        //    Signature:
        //  (LX/1e7<LX/2Gk<+LX/H31;>;>;)V
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
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
    
    private final 1e7<2Gk<? extends H31>> LJIIIIZZ(final 10h lizj) {
        final 10r liz = this.LIZ;
        1e7<2Gk<? extends H31>> 1e7 = null;
        if (liz != null) {
            final IPublicScreenService publicScreenService = 0jR.LIZ(IPublicScreenService.class);
            1eV convert;
            if (publicScreenService != null) {
                convert = publicScreenService.convert(lizj.LJFF);
            }
            else {
                convert = null;
            }
            1eV 1eV = convert;
            if (!(convert instanceof 2Gk)) {
                1eV = null;
            }
            final 2Gk 2Gk = (2Gk)1eV;
            1e7 = 1e7;
            if (2Gk != null) {
                2Gk.LIZ(liz);
                2Gk.LJFF.LIZ = false;
                2Gk.LJFF.LIZIZ = true;
                2Gk.LJFF.LIZJ = lizj;
                2Gk.LIZIZ = false;
                1e7 = new 1e7<2Gk<? extends H31>>(lizj, 2Gk, (byte)0);
            }
        }
        return 1e7;
    }
    
    @Override
    public final void LIZ(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 1e7<2Gk<? extends H31>> ljiiiizz = this.LJIIIIZZ(10h);
        if (ljiiiizz != null) {
            this.LIZIZ = ljiiiizz;
            this.LIZLLL = ljiiiizz;
            final 10r liz = this.LIZ;
            if (liz != null && liz.LIZIZ) {
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_pin_comment_show");
                liz2.LIZ(this.LJIIJJI);
                final 10r liz3 = this.LIZ;
                Boolean value;
                if (liz3 != null) {
                    value = liz3.LIZLLL;
                }
                else {
                    value = null;
                }
                String s;
                if (GTi.LIZ(value)) {
                    s = "1";
                }
                else {
                    s = "0";
                }
                liz2.LIZ("is_extended_comment_filed", s);
                final DataChannel ljiijji = this.LJIIJJI;
                Room room;
                if (ljiijji != null) {
                    room = (Room)ljiijji.LIZIZ((Class)G69.class);
                }
                else {
                    room = null;
                }
                liz2.LIZ("admin_type", Fsd.LIZ(room, this.LJIIJJI));
                liz2.LIZ("use_status", "under_review");
                final DataChannel ljiijji2 = this.LJIIJJI;
                Room room2;
                if (ljiijji2 != null) {
                    room2 = (Room)ljiijji2.LIZIZ((Class)G69.class);
                }
                else {
                    room2 = null;
                }
                liz2.LIZ("pin_user", Fsd.LIZ(room2, 10h.LIZIZ));
                final DataChannel ljiijji3 = this.LJIIJJI;
                Room room3;
                if (ljiijji3 != null) {
                    room3 = (Room)ljiijji3.LIZIZ((Class)G69.class);
                }
                else {
                    room3 = null;
                }
                liz2.LIZ("msg_sent_user", Fsd.LIZ(room3, 0zY.LJII.LIZ(10h.LJFF)));
                final User liz4 = 0zY.LJII.LIZ(10h.LJFF);
                Long value2;
                if (liz4 != null) {
                    value2 = liz4.getId();
                }
                else {
                    value2 = null;
                }
                liz2.LIZ("msg_sent_user_id", (Number)value2);
                liz2.LIZLLL();
            }
            this.LIZ(ljiiiizz, null);
        }
    }
    
    public final void LIZ(final 1e7<2Gk<? extends H31>> 1e7, final Object o) {
        final 10r liz = this.LIZ;
        if (liz != null) {
            boolean ljff;
            if (!liz.LJIILJJIL) {
                final 44V k = GST.k;
                n.LIZIZ((Object)k, "");
                final Object liz2 = ((44T)k).LIZ();
                n.LIZIZ(liz2, "");
                ljff = (boolean)liz2;
            }
            else {
                final 44V n = GST.n;
                kotlin.jvm.internal.n.LIZIZ((Object)n, "");
                final Object liz3 = ((44T)n).LIZ();
                kotlin.jvm.internal.n.LIZIZ(liz3, "");
                ljff = (boolean)liz3;
            }
            this.LJFF = ljff;
            boolean ljiiliil;
            if (liz.LJIILJJIL) {
                final 44V p2 = GST.p;
                n.LIZIZ((Object)p2, "");
                final Object liz4 = ((44T)p2).LIZ();
                n.LIZIZ(liz4, "");
                ljiiliil = (boolean)liz4;
            }
            else {
                final 44V m = GST.m;
                n.LIZIZ((Object)m, "");
                final Object liz5 = ((44T)m).LIZ();
                n.LIZIZ(liz5, "");
                ljiiliil = (boolean)liz5;
            }
            this.LJIILIIL = ljiiliil;
        }
        if (this.LJI != 0 && (this.LJFF || !this.LJIILIIL)) {
            final HYh ljii = this.LJII;
            if (ljii != null) {
                final 2Gk liziz = 1e7.LIZIZ;
                if (liziz instanceof 11J) {
                    final 11J 11J = (11J)liziz;
                    if (11J.LJII()) {
                        return;
                    }
                    if (11J.LJIIIZ()) {
                        this.LIZIZ(1e7, o);
                        return;
                    }
                }
                if (((HYk)ljii).LIZ(new HDk((Object)new PinMessageViewModel.a((1e7)1e7, o), (HYq)this.LJIIIIZZ))) {
                    return;
                }
            }
        }
        this.LIZIZ(1e7, o);
    }
    
    @Override
    public final void LIZIZ(final 10h 10h) {
        CTM.LIZ((Object)10h);
        this.LJIIIZ = SystemClock.uptimeMillis();
        final 1e7<2Gk<? extends H31>> liziz = this.LIZIZ;
        if (liziz == null) {
            final 1e7<2Gk<? extends H31>> ljiiiizz = this.LJIIIIZZ(10h);
            if ((this.LIZJ = ljiiiizz) != null) {
                this.LIZ(ljiiiizz, null);
            }
        }
        else {
            this.LIZ(this.LIZJ = liziz, new 0zX());
        }
        this.LIZLLL = this.LIZJ;
        final 10r liz = this.LIZ;
        if (liz != null && liz.LIZIZ) {
            final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_pin_comment_show");
            liz2.LIZ(this.LJIIJJI);
            final 10r liz3 = this.LIZ;
            Boolean value;
            if (liz3 != null) {
                value = liz3.LIZLLL;
            }
            else {
                value = null;
            }
            String s;
            if (GTi.LIZ(value)) {
                s = "1";
            }
            else {
                s = "0";
            }
            liz2.LIZ("is_extended_comment_filed", s);
            final User liziz2 = 10h.LIZIZ;
            if (liziz2 != null) {
                final long id = liziz2.getId();
                final GIK liziz3 = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz3, "");
                if (id == liziz3.LIZJ()) {
                    liz2.LIZ("use_status", "pass");
                }
            }
            final DataChannel ljiijji = this.LJIIJJI;
            Room room;
            if (ljiijji != null) {
                room = (Room)ljiijji.LIZIZ((Class)G69.class);
            }
            else {
                room = null;
            }
            liz2.LIZ("admin_type", Fsd.LIZ(room, this.LJIIJJI));
            final DataChannel ljiijji2 = this.LJIIJJI;
            Room room2;
            if (ljiijji2 != null) {
                room2 = (Room)ljiijji2.LIZIZ((Class)G69.class);
            }
            else {
                room2 = null;
            }
            liz2.LIZ("pin_user", Fsd.LIZ(room2, 10h.LIZIZ));
            final DataChannel ljiijji3 = this.LJIIJJI;
            Room room3;
            if (ljiijji3 != null) {
                room3 = (Room)ljiijji3.LIZIZ((Class)G69.class);
            }
            else {
                room3 = null;
            }
            liz2.LIZ("msg_sent_user", Fsd.LIZ(room3, 0zY.LJII.LIZ(10h.LJFF)));
            final User liz4 = 0zY.LJII.LIZ(10h.LJFF);
            Long value2;
            if (liz4 != null) {
                value2 = liz4.getId();
            }
            else {
                value2 = null;
            }
            liz2.LIZ("msg_sent_user_id", (Number)value2);
            final PinMessage lji = 10h.LJI;
            Long value3;
            if (lji != null) {
                value3 = lji.LJIIJ;
            }
            else {
                value3 = null;
            }
            liz2.LIZ("pin_id", (Number)value3);
            final PinMessage lji2 = 10h.LJI;
            Long value4;
            if (lji2 != null) {
                value4 = ((H31)lji2).getMessageId();
            }
            else {
                value4 = null;
            }
            liz2.LIZ("pin_msg_id", (Number)value4);
            liz2.LIZLLL();
        }
        this.LIZIZ = null;
    }
    
    public final void LIZIZ(final 1e7<2Gk<? extends H31>> value, final Object lj) {
        CTM.LIZ((Object)value);
        this.LIZ(value);
        value.LJ = lj;
        this.LJIIL.setValue(value);
    }
    
    @Override
    public final void LIZJ(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 10r liz = this.LIZ;
        Boolean value;
        if (liz != null) {
            value = liz.LIZIZ;
        }
        else {
            value = null;
        }
        if (GTi.LIZ(value)) {
            Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131831410), 0L);
        }
        final 1e7<2Gk<? extends H31>> lizj = this.LIZJ;
        if (lizj != null) {
            if (lizj.LIZ.LJII != 0L) {
                final 1e7<2Gk<? extends H31>> lizj2 = this.LIZJ;
                if (lizj2 != null) {
                    this.LIZLLL = lizj;
                    lizj2.LJI = 0;
                    lizj2.LJFF = true;
                    this.LIZ(lizj2, null);
                }
            }
            else {
                final 1e7<2Gk<? extends H31>> liziz = this.LIZIZ;
                if (liziz != null) {
                    liziz.LIZLLL = true;
                    this.LIZLLL = null;
                    this.LIZ(liziz, null);
                }
            }
        }
        if (this.LIZJ == null) {
            final 1e7<2Gk<? extends H31>> liziz2 = this.LIZIZ;
            if (liziz2 != null) {
                liziz2.LIZLLL = true;
                this.LIZLLL = null;
                this.LIZ(liziz2, null);
            }
        }
        final 10r liz2 = this.LIZ;
        if (liz2 != null && liz2.LIZIZ && 10h.LIZLLL) {
            final Gkn liz3 = Gkn.LJFF.LIZ("livesdk_pin_comment_review_fail");
            liz3.LIZ(this.LJIIJJI);
            final 10r liz4 = this.LIZ;
            Boolean value2;
            if (liz4 != null) {
                value2 = liz4.LIZLLL;
            }
            else {
                value2 = null;
            }
            String s;
            if (GTi.LIZ(value2)) {
                s = "1";
            }
            else {
                s = "0";
            }
            liz3.LIZ("is_extended_comment_filed", s);
            final DataChannel ljiijji = this.LJIIJJI;
            Room room;
            if (ljiijji != null) {
                room = (Room)ljiijji.LIZIZ((Class)G69.class);
            }
            else {
                room = null;
            }
            liz3.LIZ("pin_user", Fsd.LIZ(room, 10h.LIZIZ));
            final DataChannel ljiijji2 = this.LJIIJJI;
            Room room2;
            if (ljiijji2 != null) {
                room2 = (Room)ljiijji2.LIZIZ((Class)G69.class);
            }
            else {
                room2 = null;
            }
            liz3.LIZ("msg_sent_user", Fsd.LIZ(room2, 0zY.LJII.LIZ(10h.LJFF)));
            final User liz5 = 0zY.LJII.LIZ(10h.LJFF);
            Long value3;
            if (liz5 != null) {
                value3 = liz5.getId();
            }
            else {
                value3 = null;
            }
            liz3.LIZ("msg_sent_user_id", (Number)value3);
            liz3.LIZLLL();
        }
        this.LIZIZ = null;
    }
    
    @Override
    public final void LIZLLL(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final PinMessage lji = 10h.LJI;
        if (lji != null) {
            final 1e7<2Gk<? extends H31>> lizlll = this.LIZLLL;
            if (lizlll != null) {
                final PinMessage lji2 = lizlll.LIZ.LJI;
                if (lji2 != null && lji2.LJIIJ == lji.LJIIJ && 10h.LJ) {
                    this.LIZ(lizlll, new 0zV());
                }
            }
        }
    }
    
    @Override
    public final void LJ(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 1e7<2Gk<? extends H31>> liziz = this.LIZIZ;
        if (liziz != null && n.LIZ((Object)liziz.LIZ, (Object)10h)) {
            liziz.LIZJ = true;
            this.LIZIZ = null;
            this.LIZLLL = null;
            if (10h.LJIIIIZZ == 10h.b.INTERRUPT) {
                final 10r liz = this.LIZ;
                Boolean value;
                if (liz != null) {
                    value = liz.LIZIZ;
                }
                else {
                    value = null;
                }
                if (GTi.LIZ(value)) {
                    Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131831413), 0L);
                }
            }
            this.LIZ(liziz, null);
            return;
        }
        final 1e7<2Gk<? extends H31>> lizj = this.LIZJ;
        if (lizj != null) {
            final 10r liz2 = this.LIZ;
            if (liz2 != null && liz2.LIZIZ) {
                final Gkn liz3 = Gkn.LJFF.LIZ("livesdk_pin_comment_duration");
                liz3.LIZ(this.LJIIJJI);
                final boolean liz4 = GTi.LIZ(Boolean.valueOf(liz2.LIZLLL));
                final String s = "1";
                String s2;
                if (liz4) {
                    s2 = "1";
                }
                else {
                    s2 = "0";
                }
                liz3.LIZ("is_extended_comment_filed", s2);
                final DataChannel ljiijji = this.LJIIJJI;
                Room room;
                if (ljiijji != null) {
                    room = (Room)ljiijji.LIZIZ((Class)G69.class);
                }
                else {
                    room = null;
                }
                liz3.LIZ("pin_user", Fsd.LIZ(room, 10h.LIZIZ));
                final DataChannel ljiijji2 = this.LJIIJJI;
                Room room2;
                if (ljiijji2 != null) {
                    room2 = (Room)ljiijji2.LIZIZ((Class)G69.class);
                }
                else {
                    room2 = null;
                }
                liz3.LIZ("msg_sent_user", Fsd.LIZ(room2, 0zY.LJII.LIZ(10h.LJFF)));
                final User liz5 = 0zY.LJII.LIZ(10h.LJFF);
                Long value2;
                if (liz5 != null) {
                    value2 = liz5.getId();
                }
                else {
                    value2 = null;
                }
                liz3.LIZ("msg_sent_user_id", (Number)value2);
                final DataChannel ljiijji3 = this.LJIIJJI;
                Room room3;
                if (ljiijji3 != null) {
                    room3 = (Room)ljiijji3.LIZIZ((Class)G69.class);
                }
                else {
                    room3 = null;
                }
                liz3.LIZ("admin_type", Fsd.LIZ(room3, this.LJIIJJI));
                String s3;
                if (10h.LJIIIIZZ == 10h.b.TIME_OUT) {
                    s3 = s;
                }
                else {
                    s3 = "0";
                }
                liz3.LIZ("is_finish", s3);
                liz3.LIZ("duration", (SystemClock.uptimeMillis() - this.LJIIIZ) / 1000L);
                final PinMessage lji = 10h.LJI;
                Long value3;
                if (lji != null) {
                    value3 = lji.LJIIJ;
                }
                else {
                    value3 = null;
                }
                liz3.LIZ("pin_id", (Number)value3);
                final PinMessage lji2 = 10h.LJI;
                Long value4;
                if (lji2 != null) {
                    value4 = ((H31)lji2).getMessageId();
                }
                else {
                    value4 = null;
                }
                liz3.LIZ("pin_msg_id", (Number)value4);
                liz3.LIZLLL();
            }
            if (n.LIZ((Object)lizj.LIZ, (Object)10h)) {
                lizj.LIZJ = true;
                if (10h.LJIIIIZZ == 10h.b.INTERRUPT) {
                    final 10r liz6 = this.LIZ;
                    Boolean value5;
                    if (liz6 != null) {
                        value5 = liz6.LIZIZ;
                    }
                    else {
                        value5 = null;
                    }
                    if (GTi.LIZ(value5)) {
                        final 10r liz7 = this.LIZ;
                        Boolean value6;
                        if (liz7 != null) {
                            value6 = liz7.LJIILJJIL;
                        }
                        else {
                            value6 = null;
                        }
                        if (GTi.LIZ(value6)) {
                            Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131831413), 0L);
                        }
                    }
                }
                this.LIZLLL = null;
                this.LIZJ = null;
                if (this.LIZIZ == null) {
                    this.LIZ(lizj, null);
                }
            }
        }
    }
    
    @Override
    public final void LJFF(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 1e7<2Gk<? extends H31>> lizj = this.LIZJ;
        if (lizj != null) {
            final PinMessage lji = lizj.LIZ.LJI;
            Long value;
            if (lji != null) {
                value = lji.LJIIJ;
            }
            else {
                value = null;
            }
            final PinMessage lji2 = 10h.LJI;
            Long value2;
            if (lji2 != null) {
                value2 = lji2.LJIIJ;
            }
            else {
                value2 = null;
            }
            if (n.LIZ((Object)value, (Object)value2)) {
                lizj.LIZJ = true;
                if (this.LIZIZ == null) {
                    this.LIZ(lizj, null);
                }
            }
        }
    }
    
    @Override
    public final void LJI(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 1e7<2Gk<? extends H31>> lizj = this.LIZJ;
        if (lizj != null && this.LIZ != null && n.LIZ((Object)lizj.LIZ, (Object)10h)) {
            lizj.LIZJ = false;
            if (this.LIZIZ == null) {
                this.LIZ(lizj, null);
            }
        }
    }
    
    @Override
    public final void LJII(final 10h 10h) {
        CTM.LIZ((Object)10h);
        final 1e7<2Gk<? extends H31>> liziz = this.LIZIZ;
        if (liziz != null && n.LIZ((Object)liziz.LIZ, (Object)10h)) {
            this.LIZ(liziz, new 0zX());
            return;
        }
        final 1e7<2Gk<? extends H31>> lizj = this.LIZJ;
        if (lizj != null && n.LIZ((Object)lizj.LIZ, (Object)10h)) {
            this.LIZ(lizj, new 0zX());
        }
    }
    
    @Override
    public final void onCleared() {
        super.onCleared();
        final Long ljiij = this.LJIIJ;
        if (ljiij != null) {
            final long longValue = ljiij.longValue();
            CTM.LIZ((Object)this);
            final List list = (List)0zY.LIZLLL.get(longValue);
            if (list != null) {
                list.remove(this);
            }
        }
    }
}
