// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSDKInteractListOptSetting;
import java.util.List;
import java.util.Collection;
import com.bytedance.covode.number.Covode;

public abstract class 1lv<T, S> implements 1XF<T, S>
{
    public S LIZ;
    public final 5DO LIZIZ;
    public final 5DO LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    public final 5DO LJFF;
    
    static {
        Covode.recordClassIndex(8993);
    }
    
    public 1lv() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/22H.LIZ:LX/22H;
        //     8: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    11: putfield        X/1lv.LIZIZ:LX/5DO;
        //    14: aload_0        
        //    15: getstatic       X/22L.LIZ:LX/22L;
        //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    21: putfield        X/1lv.LIZJ:LX/5DO;
        //    24: aload_0        
        //    25: getstatic       X/22I.LIZ:LX/22I;
        //    28: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    31: putfield        X/1lv.LIZLLL:LX/5DO;
        //    34: aload_0        
        //    35: getstatic       X/22J.LIZ:LX/22J;
        //    38: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    41: putfield        X/1lv.LJ:LX/5DO;
        //    44: aload_0        
        //    45: getstatic       X/22K.LIZ:LX/22K;
        //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    51: putfield        X/1lv.LJFF:LX/5DO;
        //    54: return         
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
    
    private final void LIZIZ(final boolean b) {
        if (b) {
            this.LJIIL();
        }
    }
    
    private final void LIZJ(final S liz) {
        this.LIZ = liz;
        this.LJIIL();
        this.LIZ(liz);
        final List<T> ljii = this.LJII();
        ljii.addAll((Collection<? extends T>)this.LJIIIIZZ());
        ljii.addAll((Collection<? extends T>)this.LJIIIZ());
        ljii.addAll((Collection<? extends T>)this.LJIIJ());
        ljii.addAll((Collection<? extends T>)this.LJIIJJI());
    }
    
    private final void LJIIL() {
        this.LJII().clear();
        this.LJIIIIZZ().clear();
        this.LJIIIZ().clear();
        this.LJIIJ().clear();
        this.LJIIJJI().clear();
    }
    
    @Override
    public final S LIZ() {
        return this.LIZ;
    }
    
    public abstract void LIZ(final S p0);
    
    @Override
    public final void LIZ(final boolean b) {
        if (LiveSDKInteractListOptSetting.INSTANCE.getValue()) {
            synchronized (this) {
                this.LIZIZ(b);
                return;
            }
        }
        this.LIZIZ(b);
    }
    
    @Override
    public final List<T> LIZIZ() {
        return this.LJII();
    }
    
    @Override
    public final void LIZIZ(final S n) {
        if (LiveSDKInteractListOptSetting.INSTANCE.getValue()) {
            synchronized (this) {
                this.LIZJ(n);
                return;
            }
        }
        this.LIZJ(n);
    }
    
    @Override
    public final List<T> LIZJ() {
        return this.LJIIIIZZ();
    }
    
    @Override
    public final List<T> LIZLLL() {
        return this.LJIIIZ();
    }
    
    @Override
    public final List<T> LJ() {
        return this.LJIIJ();
    }
    
    @Override
    public final List<T> LJFF() {
        return new ArrayList<T>();
    }
    
    @Override
    public final List<T> LJI() {
        return this.LJIIJJI();
    }
    
    public final List<T> LJII() {
        return (List)this.LIZIZ.getValue();
    }
    
    public final List<T> LJIIIIZZ() {
        return (List)this.LIZJ.getValue();
    }
    
    public final List<T> LJIIIZ() {
        return (List)this.LIZLLL.getValue();
    }
    
    public final List<T> LJIIJ() {
        return (List)this.LJ.getValue();
    }
    
    public final List<T> LJIIJJI() {
        return (List)this.LJFF.getValue();
    }
}
