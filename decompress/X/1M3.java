// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableALogSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.Gson;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.HashMap;
import android.view.ViewGroup;

public abstract class 1m3 implements 1ZH
{
    public 0xa LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public ViewGroup LJ;
    public Fld LJFF;
    public int LJI;
    public int LJII;
    public HashMap<String, Integer> LJIIIIZZ;
    public HashMap<Integer, LinkPlayerInfo> LJIIIZ;
    public 2fc LJIIJ;
    public Gson LJIIJJI;
    public final String LJIIL;
    
    static {
        Covode.recordClassIndex(9299);
    }
    
    public 1m3(final long liziz, final long lizj, final boolean lizlll) {
        this.LJIIIIZZ = new HashMap<String, Integer>();
        this.LJIIIZ = new HashMap<Integer, LinkPlayerInfo>();
        this.LJIIJJI = new Gson();
        this.LJIIL = "MultiLiveFeedView";
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    @Override
    public void LIZ(final 0xa liz) {
        if (liz != null) {
            this.LIZ = liz;
            if (LiveEnableALogSetting.INSTANCE.isEnable()) {
                0ba.LIZ(3, this.LJIIL, this.LJIIJJI.LIZIZ((Object)liz));
            }
        }
    }
    
    @Override
    public void LIZ(final Fld ljff, final int lji, final int ljii) {
        CTM.LIZ((Object)ljff);
        this.LJFF = ljff;
        this.LJI = lji;
        this.LJII = ljii;
    }
    
    @Override
    public final void LIZ(ViewGroup lj) {
        CTM.LIZ((Object)lj);
        final ViewGroup lj2 = this.LJ;
        if (lj2 != null) {
            lj2.setVisibility(8);
            lj.removeView((View)lj2);
        }
        if (this.LJ == null) {
            this.LJ = (ViewGroup)0II.LIZ(LayoutInflater.from(lj.getContext()), this.LIZ(), lj, false);
            final 0xa liz = this.LIZ;
            if (liz != null) {
                this.LIZ(liz);
            }
        }
        final ViewGroup lj3 = this.LJ;
        if (lj3 != null) {
            lj3.setLayoutDirection(0);
        }
        this.LIZJ(lj);
        lj.addView((View)this.LJ);
        lj = this.LJ;
        if (lj != null) {
            lj.setVisibility(0);
        }
    }
    
    public abstract void LIZ(final List<? extends LinkPlayerInfo> p0);
    
    @Override
    public final void LIZIZ(final ViewGroup viewGroup) {
        CTM.LIZ((Object)viewGroup);
        final ViewGroup lj = this.LJ;
        if (lj != null) {
            lj.setVisibility(8);
            viewGroup.removeView((View)lj);
            final 2fc ljiij = this.LJIIJ;
            if (ljiij != null) {
                ljiij.dispose();
            }
        }
        this.LJ = null;
        this.LJFF = null;
    }
    
    public abstract void LIZJ(final ViewGroup p0);
    
    public final void LIZLLL() {
        public final class 1YT<T> implements 2d6
        {
            public final /* synthetic */ 1m3 LIZ;
            
            static {
                Covode.recordClassIndex(9301);
            }
            
            public 1YT(final 1m3 liz) {
                this.LIZ = liz;
            }
        }
        public final class 1YS<T> implements 2d6
        {
            public final /* synthetic */ 1m3 LIZ;
            
            static {
                Covode.recordClassIndex(9300);
            }
            
            public 1YS(final 1m3 liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1m3.LIZ:LX/0xa;
        //     4: ifnonnull       8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        X/1m3.LIZIZ:J
        //    12: lconst_0       
        //    13: lcmp           
        //    14: ifeq            26
        //    17: aload_0        
        //    18: getfield        X/1m3.LIZJ:J
        //    21: lconst_0       
        //    22: lcmp           
        //    23: ifne            27
        //    26: return         
        //    27: getstatic       X/0sD.LIZJ:LX/0sC;
        //    30: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //    33: invokevirtual   X/0sD.LIZLLL:()Z
        //    36: ifeq            114
        //    39: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //    42: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.channelId:()Ljava/lang/String;
        //    47: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    50: lstore_1       
        //    51: aload_0        
        //    52: invokestatic    X/0yr.LIZ:()LX/0yr;
        //    55: ldc             Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;.class
        //    57: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    60: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi;
        //    63: aload_0        
        //    64: getfield        X/1m3.LIZIZ:J
        //    67: aload_0        
        //    68: getfield        X/1m3.LIZJ:J
        //    71: lload_1        
        //    72: iconst_1       
        //    73: iconst_1       
        //    74: invokeinterface com/bytedance/android/live/liveinteract/multilive/api/MultiLiveApi.getListByType:(JJJII)LX/FAE;
        //    79: new             LX/FC5;
        //    82: dup            
        //    83: invokespecial   X/FC5.<init>:()V
        //    86: invokevirtual   X/FAE.LIZ:(LX/FCC;)LX/FAE;
        //    89: new             LX/1YS;
        //    92: dup            
        //    93: aload_0        
        //    94: invokespecial   X/1YS.<init>:(LX/1m3;)V
        //    97: new             LX/1YT;
        //   100: dup            
        //   101: aload_0        
        //   102: invokespecial   X/1YT.<init>:(LX/1m3;)V
        //   105: invokevirtual   X/FAE.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   108: putfield        X/1m3.LJIIJ:LX/2fc;
        //   111: goto            26
        //   114: aload_0        
        //   115: getfield        X/1m3.LIZIZ:J
        //   118: lstore_1       
        //   119: goto            51
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
    
    @Override
    public final void LJIIJ() {
    }
    
    @Override
    public final void LJIIJJI() {
    }
}
