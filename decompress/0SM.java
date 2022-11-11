// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.design.app.LiveDialog;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.live.liveinteract.multiguestv3.internal.IMultiGuestV3InternalService;
import com.bytedance.covode.number.Covode;

public final class 0sM
{
    static {
        Covode.recordClassIndex(8852);
    }
    
    public static final int LIZ(final IMultiGuestV3InternalService multiGuestV3InternalService) {
        CTM.LIZ((Object)multiGuestV3InternalService);
        return multiGuestV3InternalService.userManager().LIZLLL().size() - 1;
    }
    
    public static final LinkPlayerInfo LIZ(final LinkListUser linkListUser) {
        CTM.LIZ((Object)linkListUser);
        final LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
        linkPlayerInfo.LIZIZ = linkListUser.LJI;
        linkPlayerInfo.LIZJ = linkListUser.LIZ;
        linkPlayerInfo.LIZLLL = linkListUser.LIZIZ;
        linkPlayerInfo.LJFF = linkListUser.LIZJ;
        linkPlayerInfo.LJI = linkListUser.LIZLLL;
        linkPlayerInfo.LJII = (int)linkListUser.LJFF;
        linkPlayerInfo.LJIIIZ = linkListUser.LJ;
        linkPlayerInfo.LJIIL = linkListUser.LJII;
        linkPlayerInfo.LJ = linkListUser.LJIIIIZZ;
        linkPlayerInfo.LJIILJJIL = -1L;
        return linkPlayerInfo;
    }
    
    public static final LinkListUser LIZ(final LinkPlayerInfo linkPlayerInfo) {
        CTM.LIZ((Object)linkPlayerInfo);
        final LinkListUser linkListUser = new LinkListUser();
        linkListUser.LJI = linkPlayerInfo.LIZIZ;
        linkListUser.LIZ = linkPlayerInfo.LIZJ;
        linkListUser.LIZIZ = linkPlayerInfo.LIZLLL;
        linkListUser.LIZJ = linkPlayerInfo.LJFF;
        linkListUser.LIZLLL = linkPlayerInfo.LJI;
        linkListUser.LJFF = linkPlayerInfo.LJII;
        final String ljiiiz = linkPlayerInfo.LJIIIZ;
        n.LIZIZ((Object)ljiiiz, "");
        linkListUser.LJ = ljiiiz;
        linkListUser.LJII = linkPlayerInfo.LJIIL;
        linkListUser.LJIIIIZZ = linkPlayerInfo.LJ;
        return linkListUser;
    }
    
    public static final Long LIZ(final boolean b) {
        Long lji;
        if (b ? (LiveAnchorOneVnSetting.INSTANCE.enable1vn() && 0sD.LIZJ.LIZ().LIZLLL()) : 0sD.LIZJ.LIZ().LIZLLL()) {
            lji = 353.LJI(0jz.LIZJ().channelId());
        }
        else {
            lji = null;
        }
        return lji;
    }
    
    public static final <K, V> List<K> LIZ(final Map<K, ? extends V> map, final V v) {
        CTM.LIZ((Object)map);
        final ArrayList list = new ArrayList();
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            if (n.LIZ((Object)v, entry.getValue())) {
                list.add(entry.getKey());
            }
        }
        return list;
    }
    
    public static final void LIZ(final View view) {
        MethodCollector.i(8482);
        CTM.LIZ((Object)view);
        Object parent;
        if (!((parent = view.getParent()) instanceof ViewGroup)) {
            parent = null;
        }
        final ViewGroup viewGroup = (ViewGroup)parent;
        if (viewGroup != null) {
            viewGroup.removeView(view);
            MethodCollector.o(8482);
            return;
        }
        MethodCollector.o(8482);
    }
    
    public static final void LIZ(final View view, final Runnable runnable) {
        public final class 0sL implements ViewTreeObserver$OnGlobalLayoutListener
        {
            public final /* synthetic */ View LIZ;
            public final /* synthetic */ Runnable LIZIZ;
            
            static {
                Covode.recordClassIndex(8853);
            }
            
            public 0sL(final View liz, final Runnable liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onGlobalLayout() {
                this.LIZ.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                this.LIZIZ.run();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokevirtual   android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //     9: new             LX/0sL;
        //    12: dup            
        //    13: aload_0        
        //    14: aload_1        
        //    15: invokespecial   X/0sL.<init>:(Landroid/view/View;Ljava/lang/Runnable;)V
        //    18: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    21: return         
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
    
    public static final void LIZ(final LiveDialog liveDialog) {
        CTM.LIZ((Object)liveDialog);
        if (liveDialog.isShowing()) {
            liveDialog.dismiss();
        }
    }
}
