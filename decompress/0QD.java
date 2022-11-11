// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import com.bytedance.als.ui.state.LiveState;

public class 0Qd<STATE>
{
    public LiveState<STATE> LIZ;
    public STATE LIZIZ;
    public final Handler LIZJ;
    public final 13j<S0J<?, ?>, LiveState<?>> LIZLLL;
    
    static {
        Covode.recordClassIndex(4341);
    }
    
    public 0Qd(final STATE liziz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        X/0Qd.LIZIZ:Ljava/lang/Object;
        //     9: aload_0        
        //    10: new             Landroid/os/Handler;
        //    13: dup            
        //    14: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    17: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    20: putfield        X/0Qd.LIZJ:Landroid/os/Handler;
        //    23: aload_0        
        //    24: new             LX/13j;
        //    27: dup            
        //    28: invokespecial   X/13j.<init>:()V
        //    31: putfield        X/0Qd.LIZLLL:LX/13j;
        //    34: aload_0        
        //    35: new             Lcom/bytedance/als/ui/state/LiveState;
        //    38: dup            
        //    39: new             LX/1q4;
        //    42: dup            
        //    43: aload_0        
        //    44: invokespecial   X/1q4.<init>:(LX/0Qd;)V
        //    47: invokespecial   com/bytedance/als/ui/state/LiveState.<init>:(LX/QgG;)V
        //    50: putfield        X/0Qd.LIZ:Lcom/bytedance/als/ui/state/LiveState;
        //    53: return         
        //    Signature:
        //  (TSTATE;)V
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
    
    public final <V> LiveState<V> LIZ(final S0J<STATE, ? extends V> s0J) {
        public final class 1q3 extends F5g implements QgG<V>
        {
            public final /* synthetic */ 0Qd LIZ;
            public final /* synthetic */ S0J LIZIZ;
            
            static {
                Covode.recordClassIndex(4342);
            }
            
            public 1q3(final 0Qd liz, final S0J liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
            
            public final V invoke() {
                return (V)this.LIZIZ.get((Object)this.LIZ.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: sipush          3528
        //     5: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     8: aload_1        
        //     9: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    12: aload_0        
        //    13: getfield        X/0Qd.LIZLLL:LX/13j;
        //    16: aload_1        
        //    17: invokevirtual   X/050.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    20: checkcast       Lcom/bytedance/als/ui/state/LiveState;
        //    23: astore_2       
        //    24: aload_2        
        //    25: ifnull          38
        //    28: sipush          3528
        //    31: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    34: aload_0        
        //    35: monitorexit    
        //    36: aload_2        
        //    37: areturn        
        //    38: new             Lcom/bytedance/als/ui/state/LiveState;
        //    41: astore_2       
        //    42: new             LX/1q3;
        //    45: astore_3       
        //    46: aload_3        
        //    47: aload_0        
        //    48: aload_1        
        //    49: invokespecial   X/1q3.<init>:(LX/0Qd;LX/S0J;)V
        //    52: aload_2        
        //    53: aload_3        
        //    54: invokespecial   com/bytedance/als/ui/state/LiveState.<init>:(LX/QgG;)V
        //    57: aload_0        
        //    58: getfield        X/0Qd.LIZLLL:LX/13j;
        //    61: aload_1        
        //    62: aload_2        
        //    63: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    68: pop            
        //    69: sipush          3528
        //    72: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    75: aload_0        
        //    76: monitorexit    
        //    77: aload_2        
        //    78: areturn        
        //    79: astore_1       
        //    80: aload_0        
        //    81: monitorexit    
        //    82: aload_1        
        //    83: athrow         
        //    Signature:
        //  <V:Ljava/lang/Object;>(LX/S0J<TSTATE;+TV;>;)Lcom/bytedance/als/ui/state/LiveState<TV;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  2      24     79     84     Any
        //  28     34     79     84     Any
        //  38     75     79     84     Any
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformSynchronized(AstMethodBodyBuilder.java:523)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:360)
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
    
    public final void LIZ() {
        final Collection<LiveState<?>> values = this.LIZLLL.values();
        n.LIZ((Object)values, "");
        final Iterator<Object> iterator = (Iterator<Object>)values.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZIZ();
        }
        if (this.LIZ.LIZJ()) {
            this.LIZ.LIZIZ();
        }
    }
    
    public void LIZ(final SRS<? super STATE, ? extends STATE> srs) {
        CTM.LIZ((Object)srs);
        if (n.LIZ((Object)Looper.myLooper(), (Object)Looper.getMainLooper())) {
            this.LIZIZ = (STATE)srs.invoke((Object)this.LIZIZ);
            this.LIZ();
            return;
        }
        this.LIZIZ(srs);
    }
    
    public final <V> LiveState<V> LIZIZ(final S0J<STATE, ? extends V> s0J) {
        CTM.LIZ((Object)s0J);
        return (LiveState<V>)this.LIZ((X.S0J<STATE, ?>)s0J);
    }
    
    public void LIZIZ(final SRS<? super STATE, ? extends STATE> srs) {
        public final class 0Qc implements Runnable
        {
            public final /* synthetic */ 0Qd LIZ;
            public final /* synthetic */ SRS LIZIZ;
            
            static {
                Covode.recordClassIndex(4343);
            }
            
            public 0Qc(final 0Qd liz, final SRS liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                final 0Qd liz = this.LIZ;
                liz.LIZIZ = (STATE)this.LIZIZ.invoke((Object)liz.LIZIZ);
                this.LIZ.LIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: new             LX/0Qc;
        //     7: dup            
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokespecial   X/0Qc.<init>:(LX/0Qd;LX/SRS;)V
        //    13: astore_1       
        //    14: aload_0        
        //    15: getfield        X/0Qd.LIZJ:Landroid/os/Handler;
        //    18: aload_1        
        //    19: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    22: pop            
        //    23: return         
        //    Signature:
        //  (LX/SRS<-TSTATE;+TSTATE;>;)V
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
}
