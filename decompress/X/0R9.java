// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface$OnDismissListener;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.livesdk.model.message.common.Text;
import android.app.Dialog;
import android.text.Spannable;
import com.bytedance.android.live.design.app.LiveDialog;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicInteger;

public final class 0r9
{
    public static final AtomicInteger LIZ;
    
    static {
        Covode.recordClassIndex(8528);
        LIZ = new AtomicInteger(100);
    }
    
    public static final void LIZ(final Context context, final 0CH 0ch, final CwQ cwQ, final PerceptionDialogInfo perceptionDialogInfo, final SRT<? super Context, ? super PerceptionDialogInfo, 2P9> srt, final SRT<? super String, ? super String, 2P9> srt2) {
        public final class 1UG<T> implements 0Bf
        {
            public final /* synthetic */ Context LIZ;
            public final /* synthetic */ PerceptionDialogInfo LIZIZ;
            public final /* synthetic */ SRT LIZJ;
            public final /* synthetic */ SRT LIZLLL;
            public final /* synthetic */ CwQ LJ;
            
            static {
                Covode.recordClassIndex(8533);
            }
            
            public 1UG(final Context liz, final PerceptionDialogInfo liziz, final SRT lizj, final SRT lizlll, final CwQ lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          31
        //     4: aload_2        
        //     5: getstatic       X/0r9.LIZ:Ljava/util/concurrent/atomic/AtomicInteger;
        //     8: invokevirtual   java/util/concurrent/atomic/AtomicInteger.getAndDecrement:()I
        //    11: aload_1        
        //    12: new             LX/1UG;
        //    15: dup            
        //    16: aload_0        
        //    17: aload_3        
        //    18: aload           4
        //    20: aload           5
        //    22: aload_2        
        //    23: invokespecial   X/1UG.<init>:(Landroid/content/Context;Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;LX/SRT;LX/SRT;LX/CwQ;)V
        //    26: invokeinterface X/CwQ.LIZ:(ILX/0CH;LX/0Bf;)V
        //    31: return         
        //    Signature:
        //  (Landroid/content/Context;LX/0CH;LX/CwQ;Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;LX/SRT<-Landroid/content/Context;-Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;LX/2P9;>;LX/SRT<-Ljava/lang/String;-Ljava/lang/String;LX/2P9;>;)V
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
    
    public static final void LIZ(final PerceptionDialogInfo perceptionDialogInfo, final Context context, final 0CH 0ch, final CwQ cwQ, final SRT<? super Context, ? super PerceptionDialogInfo, 2P9> srt, final SRT<? super String, ? super String, 2P9> srt2) {
        CTM.LIZ((Object)perceptionDialogInfo, (Object)context, (Object)0ch, (Object)srt);
        LIZ(context, 0ch, cwQ, perceptionDialogInfo, srt, srt2);
    }
    
    public static final void LIZ(final PunishEventInfo punishEventInfo, String s, final String s2, final boolean b, final boolean b2) {
        CTM.LIZ((Object)punishEventInfo, (Object)s, (Object)s2);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_violation_popup");
        liz.LIZ();
        liz.LIZ("action_type", s);
        if (b) {
            s = "anchor";
        }
        else {
            s = "user";
        }
        liz.LIZ("user_type", s);
        if (b) {
            s = "live";
        }
        else if (b2) {
            s = "apply_guest";
        }
        else {
            s = "guest";
        }
        liz.LIZ("scene_type", s);
        liz.LIZ("record_id", punishEventInfo.LIZJ);
        liz.LIZ("violation_type", punishEventInfo.LIZ);
        liz.LIZ("violation_reason", punishEventInfo.LIZIZ);
        liz.LIZ("violation_anchor_id", punishEventInfo.LIZLLL);
        liz.LIZ("click_tab", s2);
        liz.LIZ("period", (Number)punishEventInfo.LJFF);
        liz.LIZLLL();
    }
}
