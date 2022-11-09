// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class 13j<K, V> extends 050<K, V> implements Map<K, V>
{
    public 04z<K, V> LIZ;
    
    static {
        Covode.recordClassIndex(574);
    }
    
    public 13j() {
    }
    
    public 13j(final int n) {
        super(n);
    }
    
    public 13j(final 050 050) {
        super(050);
    }
    
    private 04z<K, V> LIZ() {
        public final class 13i extends 04z<K, V>
        {
            public final /* synthetic */ 13j LIZ;
            
            static {
                Covode.recordClassIndex(575);
            }
            
            public 13i(final 13j liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final int LIZ() {
                return this.LIZ.LJII;
            }
            
            @Override
            public final int LIZ(final Object o) {
                return this.LIZ.LIZ(o);
            }
            
            @Override
            public final Object LIZ(final int n, final int n2) {
                return this.LIZ.LJI[(n << 1) + n2];
            }
            
            @Override
            public final V LIZ(final int n, final V v) {
                return (V)this.LIZ.LIZ(n, v);
            }
            
            @Override
            public final void LIZ(final int n) {
                this.LIZ.LIZLLL(n);
            }
            
            @Override
            public final void LIZ(final K k, final V v) {
                this.LIZ.put(k, v);
            }
            
            @Override
            public final int LIZIZ(final Object o) {
                return this.LIZ.LIZIZ(o);
            }
            
            @Override
            public final Map<K, V> LIZIZ() {
                return this.LIZ;
            }
            
            @Override
            public final void LIZJ() {
                this.LIZ.clear();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/13j.LIZ:LX/04z;
        //     4: ifnonnull       19
        //     7: aload_0        
        //     8: new             LX/13i;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   X/13i.<init>:(LX/13j;)V
        //    16: putfield        X/13j.LIZ:LX/04z;
        //    19: aload_0        
        //    20: getfield        X/13j.LIZ:LX/04z;
        //    23: areturn        
        //    Signature:
        //  ()LX/04z<TK;TV;>;
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
    public Set<Entry<K, V>> entrySet() {
        final 04z<K, V> liz = this.LIZ();
        if (liz.LIZIZ == null) {
            liz.LIZIZ = liz.new b();
        }
        return (Set<Entry<K, V>>)liz.LIZIZ;
    }
    
    @Override
    public Set<K> keySet() {
        return this.LIZ().LIZLLL();
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        this.LIZ(super.LJII + map.size());
        for (final Entry<K, V> entry : map.entrySet()) {
            this.put(entry.getKey(), (V)entry.getValue());
        }
    }
    
    @Override
    public Collection<V> values() {
        final 04z<K, V> liz = this.LIZ();
        if (liz.LIZLLL == null) {
            liz.LIZLLL = liz.new e();
        }
        return (Collection<V>)liz.LIZLLL;
    }
}
