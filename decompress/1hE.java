// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.als.ui.state.LiveState;
import com.bytedance.covode.number.Covode;

public abstract class 1he<API_COMPONENT extends 0QI, STATE, ACTION> extends 1DY<API_COMPONENT> implements 0QI
{
    public final API_COMPONENT LIZ;
    public final 5DO LIZIZ;
    
    static {
        Covode.recordClassIndex(4331);
        new SRK((5tI)FIV.LIZ.LIZ((Class)1he.class), "sceneStatesContainer", "getSceneStatesContainer()Lcom/bytedance/als/ui/state/MutableStateContainer;");
    }
    
    public 1he() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/1DY.<init>:()V
        //     4: aload_0        
        //     5: aload_0        
        //     6: putfield        X/1he.LIZ:LX/0QI;
        //     9: aload_0        
        //    10: new             LX/1py;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/1py.<init>:(LX/1he;)V
        //    18: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    21: putfield        X/1he.LIZIZ:LX/5DO;
        //    24: return         
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
    
    public final 2Gw<STATE, ACTION> LIZ(final 2Gw<STATE, ACTION> 2Gw) {
        CTM.LIZ((Object)2Gw);
        2Gw.LIZ(this.dL_());
        2Gw.LIZ((ACTION)this.LJFF().invoke());
        return 2Gw;
    }
    
    public final <V> LiveState<V> LIZ(final S0J<STATE, ? extends V> s0J) {
        CTM.LIZ((Object)s0J);
        return this.dL_().LIZIZ(s0J);
    }
    
    public final void LIZ(final SRS<? super STATE, ? extends STATE> srs) {
        CTM.LIZ((Object)srs);
        this.dL_().LIZ((X.SRS<? super Object, ?>)srs);
    }
    
    public final void LIZIZ(final SRS<? super STATE, ? extends STATE> srs) {
        CTM.LIZ((Object)srs);
        this.dL_().LIZIZ((X.SRS<? super Object, ?>)srs);
    }
    
    public abstract QgG<STATE> LIZLLL();
    
    public abstract QgG<ACTION> LJFF();
    
    public final 1Db<STATE> dL_() {
        return (1Db)this.LIZIZ.getValue();
    }
    
    @Override
    public API_COMPONENT getApiComponent() {
        return this.LIZ;
    }
}
