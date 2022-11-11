// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import java.util.Map;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0sD
{
    public static final 5DO LIZIZ;
    public static final b LIZJ;
    public 0sA.a LIZ;
    public 0sA.b LIZLLL;
    
    static {
        Covode.recordClassIndex(8818);
        LIZJ = new b((byte)0);
        LIZIZ = 3Os.LIZ(3Oq.SYNCHRONIZED, (QgG)21j.LIZ);
    }
    
    private Vuc LIZLLL(final String s) {
        CTM.LIZ((Object)s);
        switch (s.hashCode()) {
            case -1866333181: {
                if (s.equals("GRID_FLOAT")) {
                    return Vuc.GRID_FLOAT;
                }
                break;
            }
            case 66988604: {
                if (s.equals("FLOAT")) {
                    return Vuc.FLOAT;
                }
                break;
            }
            case 676522866: {
                if (s.equals("FLOAT_FIX")) {
                    return Vuc.FLOAT_FIX;
                }
                break;
            }
            case 1101967228: {
                if (s.equals("GRID_FIX")) {
                    return Vuc.GRID_FIX;
                }
                break;
            }
        }
        return null;
    }
    
    private final String LJIIJ() {
        final String layoutName = 0jz.LIZJ().layoutManager().LIZJ().getLayoutName();
        if (layoutName != null) {
            final 1NO liz = 1NO.LIZ();
            n.LIZIZ((Object)liz, "");
            if (liz.LIZLLL()) {
                final MultiLiveAnchorPanelSettings liz2 = 0tO.LIZ();
                if (n.LIZ((Object)layoutName, (Object)Vuc.FLOAT.name())) {
                    if (liz2 != null) {
                        liz2.LIZ = 1;
                        liz2.LIZIZ = 1;
                    }
                }
                else if (n.LIZ((Object)layoutName, (Object)Vuc.FLOAT_FIX.name())) {
                    if (liz2 != null) {
                        liz2.LIZ = 1;
                        liz2.LIZIZ = 0;
                    }
                }
                else if (n.LIZ((Object)layoutName, (Object)Vuc.GRID_FLOAT.name())) {
                    if (liz2 != null) {
                        liz2.LIZ = 0;
                        liz2.LIZIZ = 1;
                    }
                }
                else if (n.LIZ((Object)layoutName, (Object)Vuc.GRID_FIX.name()) && liz2 != null) {
                    liz2.LIZ = 0;
                    liz2.LIZIZ = 0;
                }
                0tO.LIZJ(liz2);
            }
            return layoutName;
        }
        return null;
    }
    
    public final int LIZ(final String s) {
        CTM.LIZ((Object)s);
        return 0jz.LIZJ().layoutManager().LIZIZ(s);
    }
    
    public final 0k8 LIZ(final Vuc vuc) {
        if (vuc != null) {
            final int n = 0sE.LIZ[vuc.ordinal()];
            if (n == 1) {
                return 0k8.GRID;
            }
            if (n == 2) {
                return 0k8.GRID_FIX;
            }
            if (n == 3) {
                return 0k8.FLOATING_FIX;
            }
            if (n == 4) {
                return 0k8.FLOATING;
            }
        }
        return 0k8.NORMAL;
    }
    
    public final 0sA.b LIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new 1Vr();
        }
        return this.LIZLLL;
    }
    
    public final Vuc LIZ(final int n, final int n2) {
        if (n == 1) {
            if (n2 == 0) {
                return Vuc.FLOAT_FIX;
            }
        }
        else if (n != 1) {
            if (n != 0) {
                return null;
            }
            if (n2 == 0) {
                return Vuc.GRID_FIX;
            }
            if (n2 == 1) {
                return Vuc.GRID_FLOAT;
            }
            return null;
        }
        if (n2 == 1) {
            return Vuc.FLOAT;
        }
        return null;
    }
    
    public final Vuc LIZ(final Vva vva) {
        CTM.LIZ((Object)vva);
        final List<String> liz = 0sM.LIZ(0jz.LIZJ().getSceneLayoutIdMap(), vva.getLayoutType());
        if (liz.size() == 1) {
            return this.LIZLLL(liz.get(0));
        }
        return null;
    }
    
    public final Vuc LIZ(final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        CTM.LIZ((Object)multiLiveAnchorPanelSettings);
        return this.LIZ(multiLiveAnchorPanelSettings.LIZ, multiLiveAnchorPanelSettings.LIZIZ);
    }
    
    public final void LIZ(final 2SD 2sd, final a<Qms> a) {
        public final class 1Vs implements W1I<Qms>
        {
            public final /* synthetic */ a LIZ;
            
            static {
                Covode.recordClassIndex(8822);
            }
            
            public 1Vs(final a liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                final a liz = this.LIZ;
                if (liz != null) {
                    liz.LIZ(vxk, t);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //     7: aload_1        
        //     8: new             LX/1Vs;
        //    11: dup            
        //    12: aload_2        
        //    13: invokespecial   X/1Vs.<init>:(LX/0sB;)V
        //    16: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.changeMaxPosition:(LX/2SD;LX/W1I;)V
        //    21: return         
        //    Signature:
        //  (LX/2SD;LX/0sB<LX/Qms;>;)V
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
    
    public final boolean LIZ(final 1ZS 1zs) {
        return 1zs != null && 1zs.LIZJ == 0;
    }
    
    public final 0k8 LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final List<String> liz = 0sM.LIZ(0jz.LIZJ().getSceneLayoutIdMap(), s);
        if (liz.size() == 1) {
            return this.LIZ(this.LIZLLL(liz.get(0)));
        }
        return 0k8.NORMAL;
    }
    
    public final 0sA.a LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = new 1Vm();
        }
        return this.LIZ;
    }
    
    public final Map<String, String> LIZJ(final String s) {
        CTM.LIZ((Object)s);
        return FJ4.LIZ(8sj.LIZ((Object)"biz_params", (Object)s));
    }
    
    public final void LIZJ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = new 1Vr();
        }
    }
    
    public final boolean LIZLLL() {
        return this.LIZLLL != null || this.LIZ != null;
    }
    
    public final int LJ() {
        String ljiij;
        if ((ljiij = this.LJIIJ()) == null) {
            ljiij = "";
        }
        return this.LIZ(ljiij);
    }
    
    public final int LJFF() {
        final int lj = this.LJ();
        if (lj == 0) {
            return 5;
        }
        return lj - 1;
    }
    
    public final VvS LJI() {
        return 0jz.LIZJ().layoutManager();
    }
    
    public final void LJII() {
        this.LIZLLL = null;
        this.LIZ = null;
    }
    
    public final 0k8 LJIIIIZZ() {
        return this.LIZ(this.LIZ(0jz.LIZJ().layoutManager().LIZJ()));
    }
    
    public final int LJIIIZ() {
        if (this.LIZLLL()) {
            return this.LJFF();
        }
        return GCe.LIZ().LJJIIJ;
    }
    
    public interface a<RESULT>
    {
        default static {
            Covode.recordClassIndex(8819);
        }
        
        void LIZ(final Vxk p0, final Throwable p1);
        
        void LIZ(final RESULT p0);
    }
    
    public static final class b
    {
        static {
            Covode.recordClassIndex(8820);
        }
        
        public final 0sD LIZ() {
            return (0sD)0sD.LIZIZ.getValue();
        }
    }
}
