// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import org.json.JSONObject;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;
import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.n;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public abstract class 1X3 implements 0sg, OnMessageListener
{
    public static final ArrayList<Integer> LIZJ;
    public 2fc LIZ;
    public 1Uo LIZIZ;
    public final SRT<VzU, 1Wh<1Wa>, 2P9> LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final Room LJI;
    public final long LJII;
    public final IMessageManager LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(8950);
        LIZJ = Ey9.LIZLLL((Object[])new Integer[] { 19, 20, 21 });
    }
    
    public 1X3(final Room lji, final long ljii, final IMessageManager ljiiiizz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/1X3.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    13: aload_0        
        //    14: lload_2        
        //    15: putfield        X/1X3.LJII:J
        //    18: aload_0        
        //    19: aload           4
        //    21: putfield        X/1X3.LJIIIIZZ:Lcom/ss/ugc/live/sdk/message/interfaces/IMessageManager;
        //    24: aload_0        
        //    25: new             LX/224;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   X/224.<init>:(LX/1X3;)V
        //    33: putfield        X/1X3.LIZLLL:LX/SRT;
        //    36: aload_0        
        //    37: getstatic       X/222.LIZ:LX/222;
        //    40: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    43: putfield        X/1X3.LJ:LX/5DO;
        //    46: aload_0        
        //    47: getstatic       X/223.LIZ:LX/223;
        //    50: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    53: putfield        X/1X3.LJFF:LX/5DO;
        //    56: return         
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
    
    private final HashMap<Long, String> LJFF() {
        return (HashMap)this.LJ.getValue();
    }
    
    private final void LJI() {
        GCe.LIZ().LJJ.clear();
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        liz.LIZIZ(0sc.LIZ(this.LJ()) > 0);
        GCe.LIZ().LJJI = 0sc.LIZ(this.LJ());
        final 1Uo liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJII = 0sc.LIZ(this.LJ());
        }
        for (final LinkPlayerInfo linkPlayerInfo : this.LJ().LIZIZ()) {
            final 5oa liz2 = 5ob.LIZ;
            final User lizj = linkPlayerInfo.LIZJ;
            long id;
            if (lizj != null) {
                id = lizj.getId();
            }
            else {
                id = 0L;
            }
            liz2.LIZ(id, linkPlayerInfo.LJIIIZ);
            if (linkPlayerInfo.LJ == 2 || (linkPlayerInfo.LJ == 1 && linkPlayerInfo.LJI == 4)) {
                final Set ljj = GCe.LIZ().LJJ;
                final User lizj2 = linkPlayerInfo.LIZJ;
                Long value;
                if (lizj2 != null) {
                    value = lizj2.getId();
                }
                else {
                    value = null;
                }
                ljj.add(value);
            }
            if (linkPlayerInfo.LJI == 1) {
                final GCe liz3 = GCe.LIZ();
                n.LIZIZ((Object)liz3, "");
                liz3.LJII = linkPlayerInfo.LJIIIZ;
            }
        }
    }
    
    @Override
    public final String LIZ(final long n) {
        return this.LJFF().get(n);
    }
    
    public final List<0si> LIZ() {
        return (List)this.LJFF.getValue();
    }
    
    public final void LIZ(final int n) {
        final Iterator<Object> iterator = this.LIZ().iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(this.LJ(), n);
        }
    }
    
    @Override
    public final void LIZ(final long n, final String s) {
        CTM.LIZ((Object)s);
        if (n == 0L) {
            return;
        }
        this.LJFF().put(n, s);
    }
    
    @Override
    public final void LIZ(final 0si 0si) {
        CTM.LIZ((Object)0si);
        this.LIZ().add(0si);
    }
    
    @Override
    public final void LIZ(final 1Uo liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public abstract void LIZ(final 1Wa p0);
    
    public void LIZ(final MultiLiveGuestInfoList list, final String s) {
        CTM.LIZ((Object)list, (Object)s);
        final ArrayList list2 = new ArrayList();
        for (final LinkPlayerInfo linkPlayerInfo : this.LJ().LIZIZ()) {
            final User lizj = linkPlayerInfo.LIZJ;
            n.LIZIZ((Object)lizj, "");
            final long id = lizj.getId();
            final String ljiiiz = linkPlayerInfo.LJIIIZ;
            n.LIZIZ((Object)ljiiiz, "");
            list2.add(new 1Tr.d(id, ljiiiz, linkPlayerInfo.LJ));
        }
        CTM.LIZ((Object)list2, (Object)s);
        while (true) {
            try {
                if (!(TextUtils.isEmpty((CharSequence)s) ^ true)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "source", s);
                0d3.LIZ(jsonObject, "user_list", list2.toString());
                1ml.LIZ(1ml.LJIIIIZZ, true, "refresh_user_list", jsonObject);
                1ml.LIZ(this.LJ().LIZIZ());
                this.LJI();
                if (TextUtils.equals((CharSequence)s, (CharSequence)"message_linked_list_change")) {
                    this.LIZ(4);
                    return;
                }
                this.LIZ(1);
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public abstract void LIZ(final LinkMessage p0);
    
    @Override
    public final void LIZ(final String s, final SRS<? super 0sh<LinkPlayerInfo, MultiLiveGuestInfoList>, 2P9> srs) {
        public final class 1X1<T> implements 2d6
        {
            public final /* synthetic */ 1X3 LIZ;
            public final /* synthetic */ SRS LIZIZ;
            public final /* synthetic */ String LIZJ;
            
            static {
                Covode.recordClassIndex(8951);
            }
            
            public 1X1(final 1X3 liz, final SRS liziz, final String lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
        }
        public final class 1X2<T> implements 2d6
        {
            public final /* synthetic */ 1X3 LIZ;
            
            static {
                Covode.recordClassIndex(8952);
            }
            
            public 1X2(final 1X3 liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/1X3.LIZ:LX/2fc;
        //     8: ifnonnull       89
        //    11: aload_0        
        //    12: invokestatic    X/0yr.LIZ:()LX/0yr;
        //    15: ldc_w           Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;.class
        //    18: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    21: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;
        //    24: aload_0        
        //    25: getfield        X/1X3.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    28: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    31: aload_0        
        //    32: getfield        X/1X3.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    35: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    38: aload_0        
        //    39: getfield        X/1X3.LJII:J
        //    42: aload_0        
        //    43: invokevirtual   X/1X3.LIZLLL:()Ljava/util/List;
        //    46: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    49: iconst_0       
        //    50: invokeinterface com/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi.getListByType:(JJJLjava/lang/String;I)LX/FAE;
        //    55: new             LX/FC5;
        //    58: dup            
        //    59: invokespecial   X/FC5.<init>:()V
        //    62: invokevirtual   X/FAE.LIZ:(LX/FCC;)LX/FAE;
        //    65: new             LX/1X1;
        //    68: dup            
        //    69: aload_0        
        //    70: aload_2        
        //    71: aload_1        
        //    72: invokespecial   X/1X1.<init>:(LX/1X3;LX/SRS;Ljava/lang/String;)V
        //    75: new             LX/1X2;
        //    78: dup            
        //    79: aload_0        
        //    80: invokespecial   X/1X2.<init>:(LX/1X3;)V
        //    83: invokevirtual   X/FAE.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //    86: putfield        X/1X3.LIZ:LX/2fc;
        //    89: return         
        //    Signature:
        //  (Ljava/lang/String;LX/SRS<-LX/0sh<Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;Lcom/bytedance/android/live/liveinteract/multilive/model/MultiLiveGuestInfoList;>;LX/2P9;>;)V
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
    
    public void LIZ(final Throwable t) {
        CTM.LIZ((Object)t);
        final Iterator<Object> iterator = this.LIZ().iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(t);
        }
    }
    
    @Override
    public void LIZIZ() {
        final IMessageManager ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.addMessageListener(HDh.LINK_MESSAGE.getIntType(), (OnMessageListener)this);
        }
        0jz.LIZJ().subscribe(1Wa.class, this.LIZLLL);
        a.LIZ(this, "enter_room");
    }
    
    @Override
    public final void LIZIZ(final 0si 0si) {
        CTM.LIZ((Object)0si);
        this.LIZ().remove(0si);
    }
    
    @Override
    public void LIZJ() {
        final 2fc liz = this.LIZ;
        if (liz != null) {
            liz.dispose();
        }
        final IMessageManager ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            ljiiiizz.removeMessageListener(HDh.LINK_MESSAGE.getIntType(), (OnMessageListener)this);
        }
        0jz.LIZJ().unsubscribe(1Wa.class, this.LIZLLL);
        this.LIZ().clear();
        this.LJFF().clear();
        this.LJ().LIZ(true);
        this.LIZIZ = null;
        0uF.LIZ.LIZ();
    }
    
    public abstract List<Integer> LIZLLL();
    
    public abstract 1XF<LinkPlayerInfo, MultiLiveGuestInfoList> LJ();
    
    public void onMessage(final IMessage message) {
        Object o = message;
        if (!(message instanceof LinkMessage)) {
            o = null;
        }
        final LinkMessage linkMessage = (LinkMessage)o;
        if (linkMessage != null && 1X3.LIZJ.contains(linkMessage.LIZ) && linkMessage.LIZIZ() == Rl7.AUDIENCE_LINKMIC) {
            this.LIZ(linkMessage);
        }
    }
}
