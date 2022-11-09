// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.List;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
public final class 1lt extends 1X3 implements 1XD
{
    public final 5DO LIZLLL;
    
    static {
        Covode.recordClassIndex(8956);
    }
    
    public 1lt(final Room room, final long n, final IMessageManager messageManager) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: lload_2        
        //     7: aload           4
        //     9: invokespecial   X/1X3.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;JLcom/ss/ugc/live/sdk/message/interfaces/IMessageManager;)V
        //    12: aload_0        
        //    13: getstatic       X/226.LIZ:LX/226;
        //    16: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    19: putfield        X/1lt.LIZLLL:LX/5DO;
        //    22: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
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
    
    private final 1lv<LinkPlayerInfo, MultiLiveGuestInfoList> LJI() {
        return (1lv)this.LIZLLL.getValue();
    }
    
    @Override
    public final void LIZ(final 1Wa 1Wa) {
        CTM.LIZ((Object)1Wa);
        0sg.a.LIZ(this, "message_linked_list_change");
    }
    
    @Override
    public final void LIZ(final MultiLiveGuestInfoList list, final String s) {
        CTM.LIZ((Object)list, (Object)s);
        super.LIZ(list, s);
        1ml.LIZ(this.LJI().LJII());
    }
    
    @Override
    public final void LIZ(final LinkMessage linkMessage) {
        CTM.LIZ((Object)linkMessage);
    }
    
    @Override
    public final void LIZ(final Throwable t) {
        CTM.LIZ((Object)t);
        super.LIZ(t);
        1ml.LIZ(t);
    }
    
    @Override
    public final void LIZIZ(final int n) {
        this.LIZ(n);
    }
    
    @Override
    public final List<Integer> LIZLLL() {
        final ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        return list;
    }
    
    @Override
    public final 1XF<LinkPlayerInfo, MultiLiveGuestInfoList> LJ() {
        return this.LJI();
    }
    
    @Override
    public final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> LJFF() {
        return this.LJI();
    }
}
