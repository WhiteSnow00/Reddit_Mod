// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.n;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class 1m8 extends 1d5
{
    @0kV(LIZ = "LAYOUT_MANAGER")
    public 0tc LIZ;
    public final 5DO LIZIZ;
    public final a LIZLLL;
    
    static {
        Covode.recordClassIndex(9330);
    }
    
    public 1m8(final a lizlll) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   X/1d5.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/1m8.LIZLLL:LX/0tR;
        //    13: aload_0        
        //    14: getstatic       X/25J.LIZ:LX/25J;
        //    17: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    20: putfield        X/1m8.LIZIZ:LX/5DO;
        //    23: return         
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
    
    private final HashMap<0k8, 1d5> LIZ() {
        return (HashMap)this.LIZIZ.getValue();
    }
    
    @Override
    public final void LIZ(final InteractConfig interactConfig) {
        super.LIZ(interactConfig);
        final Collection<1d5> values = this.LIZ().values();
        n.LIZIZ((Object)values, "");
        final Iterator<Object> iterator = values.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ(interactConfig);
        }
    }
    
    public final String mixStream(final int n, final int n2, final List<? extends Region> list) {
        CTM.LIZ((Object)list);
        if (this.LIZ == null) {
            1jw.LIZ.LIZIZ(this);
        }
        final 0tc liz = this.LIZ;
        0k8 0k8;
        if (liz == null || (0k8 = liz.LIZIZ()) == null) {
            0k8 = X.0k8.FLOATING;
        }
        1d5 1d5;
        if ((1d5 = this.LIZ().get(0k8)) == null) {
            final int n3 = 0tS.LIZ[0k8.ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            1d5 = new 1m9(this.LIZLLL);
                        }
                        else {
                            1d5 = new 1m6(this.LIZLLL);
                        }
                    }
                    else {
                        1d5 = new 1m7(this.LIZLLL);
                    }
                }
                else {
                    1d5 = new 1m4(this.LIZLLL);
                }
            }
            else {
                1d5 = new 1m5(this.LIZLLL);
            }
            this.LIZ().put(0k8, 1d5);
            1d5.LIZ(super.LIZJ);
        }
        final String mixStream = 1d5.mixStream(n, n2, (List)list);
        n.LIZIZ((Object)mixStream, "");
        return mixStream;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(9331);
        }
        
        long LJFF(final String p0);
        
        boolean LJI(final String p0);
        
        boolean LJII(final String p0);
        
        int LJIIIIZZ(final String p0);
        
        int LJIIIZ(final String p0);
    }
}
