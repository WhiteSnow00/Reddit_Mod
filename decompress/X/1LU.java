// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import kotlin.jvm.internal.n;
import java.util.Collection;
import java.util.Iterator;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
public final class 1lu extends 1X3 implements 1XE
{
    public int LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final 5DO LJI;
    public QgG<Boolean> LJII;
    
    static {
        Covode.recordClassIndex(8960);
    }
    
    public 1lu(final Room room, final long n, final IMessageManager messageManager, final QgG<Boolean> ljii) {
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
        //    13: aload           5
        //    15: putfield        X/1lu.LJII:LX/QgG;
        //    18: aload_0        
        //    19: getstatic       X/22B.LIZ:LX/22B;
        //    22: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    25: putfield        X/1lu.LJ:LX/5DO;
        //    28: aload_0        
        //    29: getstatic       X/228.LIZ:LX/228;
        //    32: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    35: putfield        X/1lu.LJFF:LX/5DO;
        //    38: aload_0        
        //    39: getstatic       X/229.LIZ:LX/229;
        //    42: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    45: putfield        X/1lu.LJI:LX/5DO;
        //    48: return         
        //    Signature:
        //  (Lcom/bytedance/android/livesdkapi/depend/model/live/Room;JLcom/ss/ugc/live/sdk/message/interfaces/IMessageManager;LX/QgG<Ljava/lang/Boolean;>;)V
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
    
    private final void LIZ(final boolean b) {
        final int liz = 0sc.LIZ(this.LJI());
        this.LJIIJ();
        final int lizlll = this.LIZLLL;
        if (lizlll > 0) {
            if (liz == 0) {
                I4V.LJ.LIZLLL();
                0xj.LIZLLL.LIZIZ("connection_over");
                0xj.LIZ(null, this.LIZLLL, 1);
            }
        }
        else if (lizlll == 0 && liz > 0) {
            I4V.LJ.LIZJ();
            if (!b) {
                0xj.LIZJ("connection_start");
            }
        }
        this.LIZLLL = liz;
    }
    
    private final 1lv<LinkListUser, LinkMessage> LJI() {
        return (1lv)this.LJ.getValue();
    }
    
    private final 1lv<LinkPlayerInfo, MultiLiveGuestInfoList> LJII() {
        return (1lv)this.LJFF.getValue();
    }
    
    private final 0se LJIIIIZZ() {
        return (0se)this.LJI.getValue();
    }
    
    private final void LJIIIZ() {
        if (this.LJIIIIZZ().LIZLLL()) {
            final Iterator<Object> iterator = this.LIZ().iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ(this.LJI());
            }
            this.LJIIIIZZ().LJ();
        }
    }
    
    private final boolean LJIIJ() {
        final List<Object> lizj = this.LJI().LIZJ();
        if (!(lizj instanceof Collection) || !lizj.isEmpty()) {
            final Iterator<LinkListUser> iterator = lizj.iterator();
            while (iterator.hasNext()) {
                final User liz = iterator.next().LIZ;
                if (liz != null) {
                    final long id = liz.getId();
                    final GIK liziz = Fk2.LIZ().LIZIZ();
                    n.LIZIZ((Object)liziz, "");
                    if (id == liziz.LIZJ()) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
    
    @Override
    public final void LIZ(final 1Wa 1Wa) {
        CTM.LIZ((Object)1Wa);
        this.LJII().LIZ(false);
        this.LJIIIIZZ().LIZ(1Wa);
        this.LJIIIZ();
    }
    
    @Override
    public final void LIZ(final MultiLiveGuestInfoList list, final String s) {
        CTM.LIZ((Object)list, (Object)s);
        this.LJI().LIZ(true);
        final LinkMessage linkMessage = new LinkMessage();
        linkMessage.LJIILL = new LinkerListChangeContent();
        final LinkerListChangeContent ljiill = linkMessage.LJIILL;
        final ArrayList<LinkPlayerInfo> liz = list.LIZ;
        n.LIZIZ((Object)liz, "");
        for (final LinkPlayerInfo linkPlayerInfo : liz) {
            final ArrayList liz2 = ljiill.LIZ;
            n.LIZIZ((Object)linkPlayerInfo, "");
            liz2.add(0sM.LIZ(linkPlayerInfo));
        }
        final ArrayList<LinkPlayerInfo> liziz = list.LIZIZ;
        n.LIZIZ((Object)liziz, "");
        for (final LinkPlayerInfo linkPlayerInfo2 : liziz) {
            final ArrayList liziz2 = ljiill.LIZIZ;
            n.LIZIZ((Object)linkPlayerInfo2, "");
            liziz2.add(0sM.LIZ(linkPlayerInfo2));
        }
        this.LJI().LIZIZ(linkMessage);
        super.LIZ(list, s);
        final boolean equals = TextUtils.equals((CharSequence)s, (CharSequence)"enter_room");
        if (equals && GCe.LIZ().LJJI > 0) {
            0xj.LIZJ("live_play");
        }
        this.LIZ(equals);
    }
    
    @Override
    public final void LIZ(final LinkMessage linkMessage) {
        CTM.LIZ((Object)linkMessage);
        final QgG<Boolean> ljii = this.LJII;
        if (ljii != null && (boolean)ljii.invoke()) {
            0sg.a.LIZ(this, "message_linked_list_change");
            return;
        }
        this.LJII().LIZ(false);
        this.LJI().LIZIZ(linkMessage);
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        liz.LIZIZ(0sc.LIZ(this.LJI()) > 0);
        GCe.LIZ().LJJI = 0sc.LIZ(this.LJI());
        final 1Uo liziz = super.LIZIZ;
        if (liziz != null) {
            liziz.LJII = 0sc.LIZ(this.LJI());
        }
        for (final LinkListUser linkListUser : this.LJI().LJII()) {
            final 5oa liz2 = 5ob.LIZ;
            final User liz3 = linkListUser.LIZ;
            long id;
            if (liz3 != null) {
                id = liz3.getId();
            }
            else {
                id = 0L;
            }
            liz2.LIZ(id, linkListUser.LJ);
            if (linkListUser.LIZLLL == 1) {
                final GCe liz4 = GCe.LIZ();
                n.LIZIZ((Object)liz4, "");
                liz4.LJII = linkListUser.LJ;
            }
        }
        this.LIZ(false);
        ((0bf)Fjw.LIZIZ()).LIZIZ("LinkUserInfoCenter", "guest and audience handleListChangeMessage");
        this.LJIIIIZZ().LIZ(linkMessage);
        this.LJIIIZ();
    }
    
    @Override
    public final void LIZIZ() {
        super.LIZIZ();
    }
    
    @Override
    public final void LIZIZ(final int n) {
        this.LJIIIZ();
    }
    
    @Override
    public final void LIZJ() {
        super.LIZJ();
        this.LJIIIIZZ().LJ();
    }
    
    @Override
    public final List<Integer> LIZLLL() {
        return Ey9.LIZIZ((Object[])new Integer[] { 1, 2 });
    }
    
    @Override
    public final 1XF<LinkPlayerInfo, MultiLiveGuestInfoList> LJ() {
        return this.LJII();
    }
    
    @Override
    public final 0sh<LinkListUser, LinkMessage> LJFF() {
        return this.LJI();
    }
}
