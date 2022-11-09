// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiliveIfAnchorSendPosMsgSetting;
import kotlin.jvm.internal.n;
import android.view.ViewParent;
import java.util.Iterator;
import android.view.View;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;

public final class 0vH
{
    public ViewGroup LIZ;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZIZ;
    public 0uh LIZJ;
    public boolean LIZLLL;
    public final DataChannel LJ;
    public final 5DO LJFF;
    public 0k8 LJI;
    public ArrayList<1aK> LJII;
    
    static {
        Covode.recordClassIndex(9632);
    }
    
    public 0vH(final DataChannel lj) {
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
        //    10: putfield        X/0vH.LJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: aload_0        
        //    14: getstatic       X/26W.LIZ:LX/26W;
        //    17: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    20: putfield        X/0vH.LJFF:LX/5DO;
        //    23: aload_0        
        //    24: iconst_1       
        //    25: putfield        X/0vH.LIZLLL:Z
        //    28: getstatic       X/1jw.LIZ:LX/1jw;
        //    31: aload_0        
        //    32: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    35: return         
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
    
    private final void LIZ(final 1ln 1ln) {
        1ln.setPosInMultiLive((int)5ob.LIZ.LIZJ(5ob.LIZ.LIZJ(1ln.getInteractId())));
    }
    
    private final void LIZLLL() {
        MethodCollector.i(8261);
        for (final View view : this.LIZIZ()) {
            if (view instanceof 1ln) {
                this.LIZ((1ln)view);
            }
        }
        for (final View view2 : this.LIZIZ()) {
            int posInMultiLive = -1;
            final boolean b = view2 instanceof 1ln;
            if (b) {
                final 1ln 1ln = (1ln)view2;
                posInMultiLive = 1ln.getPosInMultiLive();
                1ln.setAdjustParent(true);
            }
            final ViewParent parent = view2.getParent();
            if (parent != null) {
                ((ViewGroup)parent).removeView(view2);
            }
            final 0uh lizj = this.LIZJ;
            if (lizj != null) {
                lizj.LIZ(view2, posInMultiLive);
            }
            if (b) {
                ((1ln)view2).setAdjustParent(false);
            }
        }
        MethodCollector.o(8261);
    }
    
    public final 1Uo LIZ() {
        final 1Uo liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
    
    public final void LIZ(final 0k8 lji, final ArrayList<1aK> ljii) {
        MethodCollector.i(8258);
        if (!MultiliveIfAnchorSendPosMsgSetting.INSTANCE.getValue()) {
            MethodCollector.o(8258);
            return;
        }
        if (ljii == null || lji == null || this.LIZIZ().size() != ljii.size()) {
            this.LJI = lji;
            this.LJII = ljii;
            MethodCollector.o(8258);
            return;
        }
        final 1Uo liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        if (liziz.LJIILL != lji) {
            this.LIZ(lji);
        }
        final 0k8 floating_FIX = 0k8.FLOATING_FIX;
        final int n = 0;
        Label_0441: {
            Label_0356: {
                if (lji != floating_FIX && lji != 0k8.GRID_FIX) {
                    final int size = this.LIZIZ().size();
                    int i = 0;
                    while (i < size) {
                        final View view = this.LIZIZ().get(i);
                        if (view instanceof 1ln && (kotlin.jvm.internal.n.LIZ((Object)((1ln)view).getInteractId(), (Object)ljii.get(i).LIZ) ^ true)) {
                            final List<View> liziz2 = this.LIZIZ();
                            if (liziz2.size() > 1) {
                                F75.LIZ((List)liziz2, (Comparator)new 0vF(ljii));
                            }
                            break Label_0356;
                        }
                        else {
                            ++i;
                        }
                    }
                    break Label_0441;
                }
                final int size2 = this.LIZIZ().size();
                int n2 = 0;
                int n3;
                for (int j = 0; j < size2; ++j, n2 = n3) {
                    final View view2 = this.LIZIZ().get(j);
                    n3 = n2;
                    if (view2 instanceof 1ln) {
                        final String liz = ljii.get(j).LIZ;
                        final 1ln 1ln = (1ln)view2;
                        n3 = n2;
                        if (kotlin.jvm.internal.n.LIZ((Object)liz, (Object)1ln.getInteractId())) {
                            n3 = n2;
                            if (ljii.get(j).LIZIZ != 1ln.getPosInMultiLive()) {
                                1ln.setPosInMultiLive(ljii.get(j).LIZIZ);
                                n3 = 1;
                            }
                        }
                    }
                }
                if (n2 == 0) {
                    break Label_0441;
                }
            }
            final Iterator<Object> iterator = this.LIZIZ().iterator();
            int n4 = n;
            while (iterator.hasNext()) {
                final View next = iterator.next();
                if (n4 < 0) {
                    Ey9.LIZ();
                }
                final View view3 = next;
                if (view3 instanceof 1ln) {
                    ((1ln)view3).setAdjustParent(true);
                }
                final ViewParent parent = view3.getParent();
                if (parent != null) {
                    ((ViewGroup)parent).removeView(view3);
                }
                ++n4;
            }
            this.LIZLLL();
        }
        MethodCollector.o(8258);
    }
    
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        final 0uh lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(view);
            this.LIZIZ().remove(view);
        }
        this.LIZ(this.LJI, this.LJII);
    }
    
    public final void LIZ(final View view, int n) {
        MethodCollector.i(8265);
        CTM.LIZ((Object)view);
        final 0uh lizj = this.LIZJ;
        if (lizj == null || lizj instanceof 1mD) {
            final 1Uo liziz = this.LIZIZ;
            if (liziz == null) {
                n.LIZ("");
            }
            this.LIZ(liziz.LJIILL);
        }
        final 0uh lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.LIZ(view, n);
            this.LIZIZ().add(view);
        }
        if (!this.LIZLLL && this.LIZIZ().size() > 1) {
            final 0uh lizj3 = this.LIZJ;
            if (lizj3 != null && !lizj3.LJ()) {
                final ArrayList list = new ArrayList((Collection<? extends E>)this.LIZIZ());
                if (this.LIZIZ().size() > 1) {
                    final List<View> liziz2 = this.LIZIZ();
                    if (liziz2.size() > 1) {
                        F75.LIZ((List)liziz2, (Comparator)new 0vG(this));
                    }
                }
                final Iterator iterator = list.iterator();
                boolean b = false;
                n = 0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (n < 0) {
                        Ey9.LIZ();
                    }
                    if (n.LIZ(next, (Object)this.LIZIZ().get(n)) ^ true) {
                        b = true;
                    }
                    ++n;
                }
                if (b) {
                    final Iterator<Object> iterator2 = this.LIZIZ().iterator();
                    n = 0;
                    while (iterator2.hasNext()) {
                        final View next2 = iterator2.next();
                        final int posInMultiLive = n + 1;
                        if (n < 0) {
                            Ey9.LIZ();
                        }
                        final View view2 = next2;
                        if (view2 instanceof 1ln) {
                            final 1ln 1ln = (1ln)view2;
                            1ln.setAdjustParent(true);
                            1ln.setPosInMultiLive(posInMultiLive);
                        }
                        final ViewParent parent = view2.getParent();
                        if (parent != null) {
                            ((ViewGroup)parent).removeView(view2);
                        }
                        n = posInMultiLive;
                    }
                    final Iterator<Object> iterator3 = this.LIZIZ().iterator();
                    n = 0;
                    while (iterator3.hasNext()) {
                        final View next3 = iterator3.next();
                        final int n2 = n + 1;
                        if (n < 0) {
                            Ey9.LIZ();
                        }
                        final View view3 = next3;
                        final 0uh lizj4 = this.LIZJ;
                        if (lizj4 != null) {
                            lizj4.LIZ(view3, n2);
                        }
                        if (view3 instanceof 1ln) {
                            ((1ln)view3).setAdjustParent(false);
                        }
                        n = n2;
                    }
                }
            }
        }
        this.LIZ(this.LJI, this.LJII);
        MethodCollector.o(8265);
    }
    
    public final void LIZ(final boolean b) {
        final 0uh lizj = this.LIZJ;
        if (lizj instanceof 1mT) {
            Objects.requireNonNull(lizj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.window.BaseGuestLayout");
            ((1mT)lizj).LIZ(b);
        }
    }
    
    public final boolean LIZ(final 0k8 0k8) {
        CTM.LIZ((Object)0k8);
        final 0uh lizj = this.LIZJ;
        0k8 lizlll;
        if (lizj != null) {
            lizlll = lizj.LIZLLL();
        }
        else {
            lizlll = null;
        }
        if (lizlll == 0k8) {
            final 1Uo liziz = this.LIZIZ;
            if (liziz == null) {
                n.LIZ("");
            }
            liziz.LIZIZ(0k8);
            return false;
        }
        for (final View view : this.LIZIZ()) {
            if (view instanceof 1ln) {
                ((1ln)view).setAdjustParent(true);
            }
        }
        final 0uh lizj2 = this.LIZJ;
        if (lizj2 != null) {
            final ViewGroup liz = this.LIZ;
            if (liz == null) {
                n.LIZ("");
            }
            lizj2.LIZIZ(liz);
        }
        final int n = 0vI.LIZ[0k8.ordinal()];
        1ZI lizj3;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            return false;
                        }
                        lizj3 = new 1mD(this.LJ);
                    }
                    else {
                        lizj3 = new 26S(this.LJ);
                    }
                }
                else {
                    lizj3 = new 26V(this.LJ);
                }
            }
            else {
                lizj3 = new 26N(this.LJ);
            }
        }
        else {
            lizj3 = new 26P(this.LJ);
        }
        this.LIZJ = lizj3;
        final ViewGroup liz2 = this.LIZ;
        if (liz2 == null) {
            kotlin.jvm.internal.n.LIZ("");
        }
        lizj3.LIZ(liz2);
        final 0uh lizj4 = this.LIZJ;
        if (lizj4 != null) {
            lizj4.LIZIZ(this.LIZLLL);
        }
        this.LIZLLL();
        if (this.LIZIZ().isEmpty()) {
            final 0uh lizj5 = this.LIZJ;
            if (lizj5 != null) {
                lizj5.LJIJI();
            }
        }
        final 1Uo liziz2 = this.LIZIZ;
        if (liziz2 == null) {
            kotlin.jvm.internal.n.LIZ("");
        }
        liziz2.LIZIZ(0k8);
        this.LJ.LIZJ((Class)2G8.class);
        return true;
    }
    
    public final List<View> LIZIZ() {
        return (List)this.LJFF.getValue();
    }
    
    public final 0k8 LIZJ() {
        final 0uh lizj = this.LIZJ;
        0k8 0k8;
        if (lizj == null || (0k8 = lizj.LIZLLL()) == null) {
            0k8 = X.0k8.NORMAL;
        }
        return 0k8;
    }
}
