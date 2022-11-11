// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.fragment.app.DialogFragment;
import android.os.Parcelable;
import android.os.Bundle;
import com.bytedance.android.live.liveinteract.multiguestv3.dialog.MultiGuestFollowAndApplyDialog;
import com.bytedance.android.live.liveinteract.multiguest.business.interceptor.FansRequiredInterceptor$interceptor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class 1U8 implements 0r0
{
    public CwQ LIZ;
    public LiveDialogFragment LIZIZ;
    
    static {
        Covode.recordClassIndex(8505);
    }
    
    @Override
    public final boolean LIZ(final a a) {
        public final class 1U7<T> implements 0Bf
        {
            public final /* synthetic */ 1U8 LIZ;
            public final /* synthetic */ DataChannel LIZIZ;
            
            static {
                Covode.recordClassIndex(8507);
            }
            
            public 1U7(final 1U8 liz, final DataChannel liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 0qy implements DialogInterface$OnDismissListener
        {
            public final /* synthetic */ 1U8 LIZ;
            
            static {
                Covode.recordClassIndex(8506);
            }
            
            public 0qy(final 1U8 liz) {
                this.LIZ = liz;
            }
            
            public final void onDismiss(final DialogInterface dialogInterface) {
                final CwQ liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZ(true);
                }
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
        //     9: aload_1        
        //    10: getfield        X/0qz.LIZIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: astore_3       
        //    14: aload_1        
        //    15: getfield        X/0qz.LJFF:I
        //    18: istore          4
        //    20: iconst_1       
        //    21: istore          5
        //    23: iload           4
        //    25: bipush          101
        //    27: if_icmpeq       199
        //    30: invokestatic    X/0tO.LIZ:()Lcom/bytedance/android/livesdk/chatroom/model/multilive/MultiLiveAnchorPanelSettings;
        //    33: astore          6
        //    35: aload           6
        //    37: invokestatic    X/0tO.LIZ:(Lcom/bytedance/android/livesdk/chatroom/model/multilive/MultiLiveAnchorPanelSettings;)Z
        //    40: ifeq            199
        //    43: aload           6
        //    45: invokestatic    X/0tO.LIZIZ:(Lcom/bytedance/android/livesdk/chatroom/model/multilive/MultiLiveAnchorPanelSettings;)Z
        //    48: ifeq            199
        //    51: invokestatic    X/0tO.LIZJ:()Z
        //    54: ifeq            199
        //    57: aload_3        
        //    58: invokestatic    X/0tO.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Z
        //    61: ifeq            199
        //    64: new             Lcom/bytedance/android/live/liveinteract/multiguest/business/interceptor/FansRequiredInterceptor$interceptor$1;
        //    67: dup            
        //    68: aload_0        
        //    69: aload_1        
        //    70: aload_3        
        //    71: invokespecial   com/bytedance/android/live/liveinteract/multiguest/business/interceptor/FansRequiredInterceptor$interceptor$1.<init>:(LX/1U8;LX/0qz;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    74: astore          7
        //    76: aload           7
        //    78: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    81: new             Lcom/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog;
        //    84: dup            
        //    85: iconst_0       
        //    86: invokespecial   com/bytedance/android/live/liveinteract/multiguestv3/dialog/MultiGuestFollowAndApplyDialog.<init>:(B)V
        //    89: astore          6
        //    91: new             Landroid/os/Bundle;
        //    94: dup            
        //    95: invokespecial   android/os/Bundle.<init>:()V
        //    98: astore_1       
        //    99: aload_1        
        //   100: ldc             "OnLinkMicBuiltListener"
        //   102: aload           7
        //   104: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //   107: aload           6
        //   109: aload_1        
        //   110: invokevirtual   androidx/fragment/app/Fragment.setArguments:(Landroid/os/Bundle;)V
        //   113: aload           6
        //   115: new             LX/0qy;
        //   118: dup            
        //   119: aload_0        
        //   120: invokespecial   X/0qy.<init>:(LX/1U8;)V
        //   123: putfield        com/bytedance/android/livesdk/LiveDialogFragment.LJJI:Landroid/content/DialogInterface$OnDismissListener;
        //   126: aload_0        
        //   127: aload           6
        //   129: putfield        X/1U8.LIZIZ:Lcom/bytedance/android/livesdk/LiveDialogFragment;
        //   132: iload           5
        //   134: istore          8
        //   136: aload_3        
        //   137: ifnull          196
        //   140: aload_3        
        //   141: ldc             LX/GNI;.class
        //   143: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   146: checkcast       LX/CwQ;
        //   149: astore_1       
        //   150: iload           5
        //   152: istore          8
        //   154: aload_1        
        //   155: ifnull          196
        //   158: aload_0        
        //   159: aload_1        
        //   160: putfield        X/1U8.LIZ:LX/CwQ;
        //   163: aload_2        
        //   164: ldc             "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner"
        //   166: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   169: pop            
        //   170: aload_1        
        //   171: sipush          1000
        //   174: aload_2        
        //   175: checkcast       LX/0CH;
        //   178: new             LX/1U7;
        //   181: dup            
        //   182: aload_0        
        //   183: aload_3        
        //   184: invokespecial   X/1U7.<init>:(LX/1U8;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   187: invokeinterface X/CwQ.LIZ:(ILX/0CH;LX/0Bf;)V
        //   192: iload           5
        //   194: istore          8
        //   196: iload           8
        //   198: ireturn        
        //   199: iconst_0       
        //   200: istore          8
        //   202: goto            196
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
}
