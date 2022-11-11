// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public abstract class 2Gw<STATE, ACTION> extends Sy4
{
    public 0Qd<STATE> LIZ;
    public ACTION LIZIZ;
    
    static {
        Covode.recordClassIndex(4325);
    }
    
    public final void LIZ(final 0Qd<STATE> liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final <K, V> void LIZ(final 0Qd<K> 0Qd, final S0J<K, ? extends V> s0J, final 0CC.b b, final SRS<? super V, 2P9> srs) {
        public final class 1pt extends F5g implements SRS<V, 2P9>
        {
            public final /* synthetic */ SRS LIZ;
            
            static {
                Covode.recordClassIndex(4326);
            }
            
            public 1pt(final SRS liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: aload           4
        //     5: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     8: aload_1        
        //     9: aload_2        
        //    10: invokevirtual   X/0Qd.LIZIZ:(LX/S0J;)Lcom/bytedance/als/ui/state/LiveState;
        //    13: aload_0        
        //    14: aload_3        
        //    15: new             LX/1pt;
        //    18: dup            
        //    19: aload           4
        //    21: invokespecial   X/1pt.<init>:(LX/SRS;)V
        //    24: invokevirtual   com/bytedance/als/ui/state/LiveState.LIZ:(LX/0CH;LX/0CB;LX/SRS;)LX/QgG;
        //    27: pop            
        //    28: return         
        //    Signature:
        //  <K:Ljava/lang/Object;V:Ljava/lang/Object;>(LX/0Qd<TK;>;LX/S0J<TK;+TV;>;LX/0CB;LX/SRS<-TV;LX/2P9;>;)V
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
    
    public final void LIZ(final Bundle bundle) {
        super.LIZ(bundle);
        final List ljjiijzljl = ((TSI)this).LJJIIJZLJL();
        n.LIZ((Object)ljjiijzljl, "");
        final Iterator iterator = Qsi.LJIIL((Iterable)ljjiijzljl).iterator();
        while (iterator.hasNext()) {
            ((TSI)this).LIZJ((TS5)iterator.next());
        }
    }
    
    public final void LIZ(final ACTION liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public final void LIZJ() {
        final 0CC lifecycle = ((TS5)this).getLifecycle();
        n.LIZ((Object)lifecycle, "");
        lifecycle.LIZ().isAtLeast(0CC.b.RESUMED);
    }
    
    public final 0Qd<STATE> fk_() {
        final 0Qd<STATE> liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz;
    }
    
    public final ACTION fl_() {
        final ACTION liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        return liziz;
    }
}
