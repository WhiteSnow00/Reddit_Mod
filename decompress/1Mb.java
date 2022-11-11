// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import org.json.JSONObject;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.n;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class 1mb extends GpV<1mZ>
{
    public final OnMessageListener LIZ;
    
    static {
        Covode.recordClassIndex(9959);
    }
    
    public 1mb() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/GpV.<init>:()V
        //     4: aload_0        
        //     5: new             LX/1bd;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   X/1bd.<init>:(LX/1mb;)V
        //    13: putfield        X/1mb.LIZ:Lcom/ss/ugc/live/sdk/message/interfaces/OnMessageListener;
        //    16: return         
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
    
    public final void LIZ() {
        final DataChannel ljjijl = super.LJJIJL;
        if (ljjijl != null) {
            final IMessageManager messageManager = (IMessageManager)ljjijl.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.removeMessageListener(this.LIZ);
            }
        }
        final DataChannel ljjijl2 = super.LJJIJL;
        if (ljjijl2 != null) {
            final GFD ljjil = ((GK2)this).LJJIL;
            n.LIZIZ((Object)ljjil, "");
            ljjijl2.LIZIZ((Object)ljjil);
        }
        super.LIZ();
        0ba.LIZ(6, "MultiMatchAnchorPresent", "detachView");
    }
    
    public final void LIZ(final 1mZ 1mZ) {
        super.LIZ((GpW)1mZ);
        final 1mg ljiiljjil = 1mg.LJIILJJIL;
        1mg.LJIIIIZZ = Gqs.LIZ();
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "role_type", "anchor");
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "role_type", "anchor");
        1mg.LIZ(ljiiljjil, "battle_permission_request", jsonObject, jsonObject2, null, false, 8);
        ((FIc)0yr.LIZ().LIZ(LinkBattleApi.class).checkPermission().LIZ((FBZ)this.LJJI())).LIZ((2d6)new 1bb(this), (2d6)new 1bc(this));
        final DataChannel ljjijl = super.LJJIJL;
        if (ljjijl != null) {
            final GFD ljjil = ((GK2)this).LJJIL;
            n.LIZIZ((Object)ljjil, "");
            ljjijl.LIZ((Object)ljjil, (Class)Gtb.class, (SRS)new 27K(this));
        }
        final DataChannel ljjijl2 = super.LJJIJL;
        if (ljjijl2 != null) {
            final IMessageManager messageManager = (IMessageManager)ljjijl2.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.addMessageListener(HDh.LINK_MIC_BATTLE.getIntType(), this.LIZ);
            }
        }
        0ba.LIZ(6, "MultiMatchAnchorPresent", "attachView ".concat(String.valueOf(this)));
    }
}
