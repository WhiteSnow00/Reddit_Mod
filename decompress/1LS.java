// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.Collection;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;

public final class 1ls extends 1XJ implements a
{
    public List<LinkPlayerInfo> LIZ;
    public final DataChannel LIZIZ;
    public final 1XD LIZJ;
    public List<LinkPlayerInfo> LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(8832);
    }
    
    public 1ls(final DataChannel liziz, final 1XD lizj) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   X/1XJ.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/1ls.LIZIZ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: aload_0        
        //    14: aload_2        
        //    15: putfield        X/1ls.LIZJ:LX/1XD;
        //    18: aload_0        
        //    19: new             Ljava/util/ArrayList;
        //    22: dup            
        //    23: invokespecial   java/util/ArrayList.<init>:()V
        //    26: putfield        X/1ls.LIZLLL:Ljava/util/List;
        //    29: aload_0        
        //    30: new             Ljava/util/ArrayList;
        //    33: dup            
        //    34: invokespecial   java/util/ArrayList.<init>:()V
        //    37: putfield        X/1ls.LIZ:Ljava/util/List;
        //    40: aload_0        
        //    41: new             LX/21l;
        //    44: dup            
        //    45: aload_0        
        //    46: invokespecial   X/21l.<init>:(LX/1ls;)V
        //    49: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    52: putfield        X/1ls.LJ:LX/5DO;
        //    55: return         
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
    
    public final 0tQ LIZ() {
        return (0tQ)this.LJ.getValue();
    }
    
    @Override
    public final void LIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final int n) {
        CTM.LIZ((Object)0sh);
        final List<LinkPlayerInfo> lizlll = 0sh.LIZLLL();
        final ArrayList list = new ArrayList();
        for (final Object next : lizlll) {
            if (this.LIZLLL.contains(next) ^ true) {
                list.add(next);
            }
        }
        final List list2 = list;
        this.LIZ.addAll(list2);
        for (final LinkPlayerInfo linkPlayerInfo : list2) {
            final 0tQ liz = this.LIZ();
            final User lizj = linkPlayerInfo.LIZJ;
            n.LIZIZ((Object)lizj, "");
            liz.LIZ(lizj);
        }
        final List<LinkPlayerInfo> lizlll2 = this.LIZLLL;
        final ArrayList list3 = new ArrayList();
        for (final Object next2 : lizlll2) {
            if (0sh.LIZLLL().contains(next2) ^ true) {
                list3.add(next2);
            }
        }
        final List list4 = list3;
        this.LIZ.removeAll(list4);
        for (final LinkPlayerInfo linkPlayerInfo2 : list4) {
            final 0tQ liz2 = this.LIZ();
            final User lizj2 = linkPlayerInfo2.LIZJ;
            n.LIZIZ((Object)lizj2, "");
            liz2.LIZIZ(lizj2);
        }
        this.LIZLLL.clear();
        this.LIZLLL.addAll(0sh.LIZLLL());
        this.LIZIZ.LIZIZ((Class)2Ga.class, (Object)this.LIZ.size());
    }
    
    @Override
    public final void LIZ(final User user) {
        CTM.LIZ((Object)user);
        this.LIZIZ.LIZIZ((Class)2Gd.class, (Object)user);
    }
}
