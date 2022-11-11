// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup;

public final class 1XP implements 0rv
{
    public 8si<Integer, Integer> LIZ;
    public final 5DO LIZIZ;
    public final ViewGroup LIZJ;
    
    static {
        Covode.recordClassIndex(9024);
    }
    
    public 1XP(final ViewGroup lizj) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/1XP.LIZJ:Landroid/view/ViewGroup;
        //     9: aload_0        
        //    10: getstatic       X/22W.LIZ:LX/22W;
        //    13: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    16: putfield        X/1XP.LIZIZ:LX/5DO;
        //    19: return         
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
    
    private final 0sz LIZLLL() {
        return (0sz)this.LIZIZ.getValue();
    }
    
    @Override
    public final void LIZ() {
        this.LIZLLL().LJ();
    }
    
    @Override
    public final void LIZ(final 8si<Integer, Integer> liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final Rect rect) {
        CTM.LIZ((Object)rect);
        final ViewGroup lizj = this.LIZJ;
        while (true) {
            Label_0113: {
                8si liz;
                if (lizj == null) {
                    if (this.LIZ == null) {
                        return;
                    }
                    break Label_0113;
                }
                else {
                    if (lizj.getWidth() <= 0 || lizj.getHeight() <= 0) {
                        break Label_0113;
                    }
                    liz = new 8si((Object)lizj.getWidth(), (Object)lizj.getHeight());
                }
                final 0sz lizlll = this.LIZLLL();
                final int intValue = ((Number)liz.getFirst()).intValue();
                final int intValue2 = ((Number)liz.getSecond()).intValue();
                CTM.LIZ((Object)rect);
                if (intValue <= rect.width() && intValue2 <= rect.height()) {
                    lizlll.LJ();
                    return;
                }
                for (int length = lizlll.LIZ.length, i = 0, n = 0; i < length; ++i, ++n) {
                    lizlll.LIZ[n] = false;
                }
                int n2;
                if (intValue > rect.width()) {
                    if (rect.left > 0) {
                        lizlll.LIZ[0] = true;
                        lizlll.LIZ().setBounds(0, rect.top, rect.left, rect.bottom);
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                    if (rect.right < intValue) {
                        lizlll.LIZ[2] = true;
                        lizlll.LIZIZ().setBounds(rect.right, rect.top, intValue, rect.bottom);
                        n2 = 1;
                    }
                }
                else {
                    n2 = 0;
                }
                int n3 = n2;
                while (true) {
                    Label_0334: {
                        if (intValue2 <= rect.height()) {
                            break Label_0334;
                        }
                        if (rect.top > 0) {
                            lizlll.LIZ[1] = true;
                            lizlll.LIZJ().setBounds(0, 0, intValue, rect.top);
                            n2 = 1;
                        }
                        n3 = n2;
                        if (rect.bottom >= intValue2) {
                            break Label_0334;
                        }
                        lizlll.LIZ[3] = true;
                        lizlll.LIZLLL().setBounds(0, rect.bottom, intValue, intValue2);
                        lizlll.invalidateSelf();
                        return;
                    }
                    if (n3 != 0) {
                        continue;
                    }
                    break;
                }
                return;
            }
            8si liz = this.LIZ;
            if (liz != null) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final int LIZIZ() {
        final 0sz lizlll = this.LIZLLL();
        return (new int[] { lizlll.LIZ().getBounds().width(), lizlll.LIZJ().getBounds().height(), lizlll.LIZIZ().getBounds().width(), lizlll.LIZLLL().getBounds().height() })[3];
    }
    
    @Override
    public final void LIZJ() {
        final ViewGroup lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setBackground((Drawable)this.LIZLLL());
        }
    }
}
