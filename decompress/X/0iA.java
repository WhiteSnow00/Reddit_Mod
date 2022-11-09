// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import android.view.View;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0ia
{
    public int LIZ;
    public final T17 LIZIZ;
    public final List<1JS> LIZJ;
    
    static {
        Covode.recordClassIndex(6758);
    }
    
    public 0ia(final T17 liziz, final 0Gh 0Gh) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        X/0ia.LIZIZ:LX/T17;
        //    14: aload_0        
        //    15: new             Ljava/util/ArrayList;
        //    18: dup            
        //    19: invokespecial   java/util/ArrayList.<init>:()V
        //    22: putfield        X/0ia.LIZJ:Ljava/util/List;
        //    25: aload_0        
        //    26: iconst_m1      
        //    27: putfield        X/0ia.LIZ:I
        //    30: aload_1        
        //    31: ldc             5.0
        //    33: invokestatic    X/0cB.LIZ:(F)I
        //    36: invokevirtual   X/T17.setTabMargin:(I)V
        //    39: aload_1        
        //    40: new             LX/1N1;
        //    43: dup            
        //    44: aload_0        
        //    45: invokespecial   X/1N1.<init>:(LX/0ia;)V
        //    48: invokevirtual   X/T17.LIZ:(LX/I7l;)V
        //    51: return         
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
    
    private final void LIZ() {
        this.LIZIZ.LIZIZ();
        final Iterator<Object> iterator = this.LIZJ.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final 1JS next = iterator.next();
            if (n < 0) {
                Ey9.LIZ();
            }
            final 1JS 1js = next;
            T16 liz;
            if (kotlin.jvm.internal.n.LIZ((Object)1js.LIZ, (Object)"favorite")) {
                liz = this.LIZIZ.LIZ();
                liz.LJFF = false;
                liz.LIZ(2131561952);
                final View lj = liz.LJ;
                if (lj != null) {
                    final 1ib 1ib = (1ib)lj.findViewById(2131372064);
                    if (1ib != null) {
                        1ib.setText((CharSequence)1js.LIZ);
                    }
                }
                liz.LIZ = 1js;
            }
            else {
                final T16 liz2 = this.LIZIZ.LIZ();
                liz2.LJFF = false;
                liz2.LIZ(2131561966);
                final View lj2 = liz2.LJ;
                if (lj2 != null) {
                    final 1ib 1ib2 = (1ib)lj2.findViewById(2131372064);
                    if (1ib2 != null) {
                        1ib2.setText((CharSequence)1js.LIZ);
                    }
                }
                liz2.LIZ = 1js;
                if (1Kb.LIZIZ.LIZ(1js.LIZ)) {
                    final View lj3 = liz2.LJ;
                    liz = liz2;
                    if (lj3 != null) {
                        final View viewById = lj3.findViewById(2131372067);
                        liz = liz2;
                        if (viewById != null) {
                            GTi.LIZIZ(viewById);
                            liz = liz2;
                        }
                    }
                }
                else {
                    final View lj4 = liz2.LJ;
                    liz = liz2;
                    if (lj4 != null) {
                        final View viewById2 = lj4.findViewById(2131372067);
                        liz = liz2;
                        if (viewById2 != null) {
                            GTi.LIZ(viewById2);
                            liz = liz2;
                        }
                    }
                }
            }
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            if (n == this.LIZ) {
                final T17 liziz = this.LIZIZ;
                this.LIZIZ(liz);
                liziz.LIZ(liz, n, true);
            }
            else {
                final T17 liziz2 = this.LIZIZ;
                this.LIZ(liz);
                liziz2.LIZ(liz, n, false);
            }
            ++n;
        }
    }
    
    public final void LIZ(final T16 t16) {
        if (t16 != null) {
            final View lj = t16.LJ;
            if (lj != null) {
                final View viewById = lj.findViewById(2131372064);
                if (viewById != null) {
                    viewById.setAlpha(0.5f);
                }
            }
            final View lj2 = t16.LJ;
            if (lj2 != null) {
                final View viewById2 = lj2.findViewById(2131372052);
                if (viewById2 != null) {
                    viewById2.setSelected(false);
                }
            }
        }
    }
    
    public final void LIZ(final List<1JS> list) {
        CTM.LIZ((Object)list);
        if (n.LIZ((Object)this.LIZJ, (Object)list) ^ true) {
            this.LIZJ.clear();
            this.LIZJ.addAll(list);
            this.LIZ();
        }
    }
    
    public final void LIZIZ(final T16 t16) {
        if (t16 != null) {
            final View lj = t16.LJ;
            if (lj != null) {
                final View viewById = lj.findViewById(2131372064);
                if (viewById != null) {
                    viewById.setAlpha(0.9f);
                }
            }
            final View lj2 = t16.LJ;
            if (lj2 != null) {
                final View viewById2 = lj2.findViewById(2131372052);
                if (viewById2 != null) {
                    viewById2.setSelected(true);
                }
            }
            final View lj3 = t16.LJ;
            if (lj3 != null) {
                final View viewById3 = lj3.findViewById(2131372067);
                if (viewById3 != null) {
                    GTi.LIZ(viewById3);
                }
            }
        }
    }
}
