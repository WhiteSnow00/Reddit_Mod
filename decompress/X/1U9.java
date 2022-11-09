// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 1U9 implements 0r0
{
    public HtA LIZ;
    
    static {
        Covode.recordClassIndex(8510);
    }
    
    public final void LIZ(final String s, final DataChannel dataChannel) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_age_popup_click");
        liz.LIZ(dataChannel);
        liz.LIZJ("live_interact");
        liz.LJ("guest_connect");
        liz.LIZLLL("click");
        liz.LIZ("click_icon", s);
        liz.LIZLLL();
    }
    
    @Override
    public final boolean LIZ(final a a) {
        public final class 0r2 implements DialogInterface$OnClickListener
        {
            public final /* synthetic */ 1U9 LIZ;
            public final /* synthetic */ a LIZIZ;
            
            static {
                Covode.recordClassIndex(8512);
            }
            
            public 0r2(final 1U9 liz, final a liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                CTM.LIZ((Object)dialogInterface);
                dialogInterface.dismiss();
                this.LIZIZ.LIZLLL.invoke();
                this.LIZ.LIZ("cancel", this.LIZIZ.LIZIZ);
            }
        }
        public final class 0r1 implements DialogInterface$OnClickListener
        {
            public final /* synthetic */ 1U9 LIZ;
            public final /* synthetic */ Gft LIZIZ;
            public final /* synthetic */ Context LIZJ;
            public final /* synthetic */ long LIZLLL;
            public final /* synthetic */ a LJ;
            
            static {
                Covode.recordClassIndex(8511);
            }
            
            public 0r1(final 1U9 liz, final Gft liziz, final Context lizj, final long lizlll, final a lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
            
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                CTM.LIZ((Object)dialogInterface);
                dialogInterface.dismiss();
                this.LIZIZ.LIZ(this.LIZJ, "saved_uid_start", this.LIZLLL);
                this.LJ.LIZJ.invoke((Object)this.LJ.LJ);
                this.LIZ.LIZ("continue", this.LJ.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: getfield        X/0qz.LIZ:Landroid/content/Context;
        //     8: astore_2       
        //     9: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //    12: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ldc             ""
        //    19: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    22: aload_3        
        //    23: invokeinterface X/GIK.LIZJ:()J
        //    28: lstore          4
        //    30: new             LX/Gft;
        //    33: dup            
        //    34: invokespecial   X/Gft.<init>:()V
        //    37: astore_3       
        //    38: aload_3        
        //    39: aload_2        
        //    40: ldc             "saved_uid_start"
        //    42: lload           4
        //    44: invokevirtual   X/Gft.LIZIZ:(Landroid/content/Context;Ljava/lang/String;J)Z
        //    47: istore          6
        //    49: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveLowAgeCountrySetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveLowAgeCountrySetting;
        //    52: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveLowAgeCountrySetting.getValue:()Z
        //    55: istore          7
        //    57: iconst_1       
        //    58: istore          8
        //    60: iload           7
        //    62: ifeq            257
        //    65: getstatic       com/bytedance/android/livesdk/livesetting/roomfunction/UserWithAgeSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/roomfunction/UserWithAgeSetting;
        //    68: invokevirtual   com/bytedance/android/livesdk/livesetting/roomfunction/UserWithAgeSetting.getValue:()Z
        //    71: ifne            257
        //    74: iload           6
        //    76: ifne            257
        //    79: getstatic       X/Fko.LIZIZ:Z
        //    82: ifne            257
        //    85: new             LX/Ht9;
        //    88: dup            
        //    89: aload_2        
        //    90: invokespecial   X/Ht9.<init>:(Landroid/content/Context;)V
        //    93: astore          9
        //    95: aload           9
        //    97: ldc             2131830433
        //    99: iconst_1       
        //   100: anewarray       Ljava/lang/Object;
        //   103: dup            
        //   104: iconst_0       
        //   105: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveBroadcastAgeThresholdSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveBroadcastAgeThresholdSetting;
        //   108: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveBroadcastAgeThresholdSetting.getValue:()I
        //   111: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   114: aastore        
        //   115: invokestatic    X/0cB.LIZ:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   118: putfield        X/Ht9.LIZ:Ljava/lang/CharSequence;
        //   121: aload           9
        //   123: ldc             2131830431
        //   125: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   128: putfield        X/Ht9.LIZIZ:Ljava/lang/String;
        //   131: aload           9
        //   133: ldc             2131830432
        //   135: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   138: new             LX/0r1;
        //   141: dup            
        //   142: aload_0        
        //   143: aload_3        
        //   144: aload_2        
        //   145: lload           4
        //   147: aload_1        
        //   148: invokespecial   X/0r1.<init>:(LX/1U9;LX/Gft;Landroid/content/Context;JLX/0qz;)V
        //   151: iconst_0       
        //   152: invokevirtual   X/Ht9.LIZ:(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Z)LX/Ht9;
        //   155: pop            
        //   156: aload           9
        //   158: ldc             2131830430
        //   160: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //   163: new             LX/0r2;
        //   166: dup            
        //   167: aload_0        
        //   168: aload_1        
        //   169: invokespecial   X/0r2.<init>:(LX/1U9;LX/0qz;)V
        //   172: iconst_0       
        //   173: invokevirtual   X/Ht9.LIZIZ:(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;Z)LX/Ht9;
        //   176: pop            
        //   177: aload           9
        //   179: iconst_0       
        //   180: putfield        X/Ht9.LJIIIZ:Z
        //   183: aload           9
        //   185: invokevirtual   X/Ht9.LIZ:()LX/HtA;
        //   188: astore_2       
        //   189: aload_0        
        //   190: aload_2        
        //   191: putfield        X/1U9.LIZ:LX/HtA;
        //   194: aload_2        
        //   195: ifnull          209
        //   198: aload_2        
        //   199: invokevirtual   X/0eC.show:()V
        //   202: getstatic       X/KN6.LIZ:LX/KN6;
        //   205: aload_2        
        //   206: invokevirtual   X/KN6.LIZ:(Landroid/app/Dialog;)V
        //   209: aload_1        
        //   210: getfield        X/0qz.LIZIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   213: astore_2       
        //   214: getstatic       X/Gkn.LJFF:LX/Gkq;
        //   217: ldc             "livesdk_live_age_popup_show"
        //   219: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //   222: astore_1       
        //   223: aload_1        
        //   224: aload_2        
        //   225: invokevirtual   X/Gkn.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)LX/Gkn;
        //   228: pop            
        //   229: aload_1        
        //   230: ldc             "live_interact"
        //   232: invokevirtual   X/Gkn.LIZJ:(Ljava/lang/String;)LX/Gkn;
        //   235: pop            
        //   236: aload_1        
        //   237: ldc             "guest_connect"
        //   239: invokevirtual   X/Gkn.LJ:(Ljava/lang/String;)LX/Gkn;
        //   242: pop            
        //   243: aload_1        
        //   244: ldc             "show"
        //   246: invokevirtual   X/Gkn.LIZLLL:(Ljava/lang/String;)LX/Gkn;
        //   249: pop            
        //   250: aload_1        
        //   251: invokevirtual   X/Gkn.LIZLLL:()V
        //   254: iload           8
        //   256: ireturn        
        //   257: iconst_0       
        //   258: istore          8
        //   260: goto            254
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
