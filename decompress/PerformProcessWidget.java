// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.performance.widget;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0CC;
import X.0CH;
import X.F5g;
import android.view.View;
import java.util.Iterator;
import X.GTi;
import android.os.Build$VERSION;
import java.util.function.Predicate;
import X.2P9;
import X.QgG;
import com.bytedance.covode.number.Covode;
import X.1do;
import java.util.concurrent.ConcurrentLinkedQueue;
import X.0zE;
import X.6mZ;
import X.0zD;
import X.0zC;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public abstract class PerformProcessWidget extends LiveRecyclableWidget implements 0zC, 0zD, 6mZ
{
    public 0zE LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final ConcurrentLinkedQueue<1do> LJ;
    
    static {
        Covode.recordClassIndex(10499);
    }
    
    public PerformProcessWidget() {
        this.LIZIZ = true;
        this.LIZLLL = true;
        this.LJ = new ConcurrentLinkedQueue<1do>();
    }
    
    private final void LIZ(final boolean b, final ConcurrentLinkedQueue<1do> concurrentLinkedQueue) {
        public final class 0zF<T> implements Predicate
        {
            public final /* synthetic */ boolean LIZ;
            
            static {
                Covode.recordClassIndex(10502);
            }
            
            public 0zF(final boolean liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          24
        //     5: if_icmplt       22
        //     8: aload_2        
        //     9: new             LX/0zF;
        //    12: dup            
        //    13: iload_1        
        //    14: invokespecial   X/0zF.<init>:(Z)V
        //    17: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.removeIf:(Ljava/util/function/Predicate;)Z
        //    20: pop            
        //    21: return         
        //    22: new             Ljava/util/ArrayList;
        //    25: dup            
        //    26: invokespecial   java/util/ArrayList.<init>:()V
        //    29: astore_3       
        //    30: aload_2        
        //    31: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    36: astore          4
        //    38: aload           4
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: ifeq            73
        //    48: aload           4
        //    50: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    55: astore          5
        //    57: iload_1        
        //    58: ifeq            38
        //    61: aload_3        
        //    62: aload           5
        //    64: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    69: pop            
        //    70: goto            38
        //    73: aload_3        
        //    74: checkcast       Ljava/util/List;
        //    77: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    82: astore_3       
        //    83: aload_3        
        //    84: invokeinterface java/util/Iterator.hasNext:()Z
        //    89: ifeq            106
        //    92: aload_2        
        //    93: aload_3        
        //    94: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    99: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.remove:(Ljava/lang/Object;)Z
        //   102: pop            
        //   103: goto            83
        //   106: return         
        //    Signature:
        //  (ZLjava/util/concurrent/ConcurrentLinkedQueue<LX/1do;>;)V
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
    
    public final void LIZ(final boolean b, final QgG<2P9> qgG) {
        if (b && (this.LJ.isEmpty() ^ true)) {
            this.LIZ(b, this.LJ);
        }
        this.LJ.add(new 1do(b, qgG));
    }
    
    public int LJ() {
        return 1;
    }
    
    public final void LJFF() {
        this.LIZJ = true;
    }
    
    public void LJI() {
    }
    
    public boolean LJII() {
        return this.LIZLLL;
    }
    
    public final void LJIIIIZZ() {
        if (this.LJII()) {
            super.hide();
        }
    }
    
    public final boolean LJIIIZ() {
        final 0zE liz = this.LIZ;
        return liz != null && liz.LIZ && !GTi.LIZJ(((LiveWidget)this).dataChannel);
    }
    
    public final boolean LJIIJ() {
        return this.LJIIIZ() && !this.LIZJ;
    }
    
    public final void Q_() {
        while (this.LJ.isEmpty() ^ true) {
            final 1do 1do = this.LJ.poll();
            if (1do != null) {
                final QgG<2P9> liziz = 1do.LIZIZ;
                if (liziz == null) {
                    continue;
                }
                liziz.invoke();
            }
        }
    }
    
    public final void R_() {
        while (true) {
            for (final 1do next : this.LJ) {
                if (next.LIZ) {
                    final 1do 1do = next;
                    if (1do != null) {
                        final QgG<2P9> liziz = 1do.LIZIZ;
                        if (liziz != null) {
                            liziz.invoke();
                        }
                    }
                    return;
                }
            }
            1do next = null;
            continue;
        }
    }
    
    public final View S_() {
        return ((Widget)this).getView();
    }
    
    public boolean T_() {
        return this.LIZIZ;
    }
    
    public void hide() {
        public final class 29W extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ PerformProcessWidget LIZ;
            
            static {
                Covode.recordClassIndex(10500);
            }
            
            public 29W(final PerformProcessWidget liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LJIIJ:()Z
        //     4: ifeq            33
        //     7: aload_0        
        //     8: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LJII:()Z
        //    11: ifeq            33
        //    14: aload_0        
        //    15: iconst_0       
        //    16: putfield        com/bytedance/android/live/performance/widget/PerformProcessWidget.LIZIZ:Z
        //    19: aload_0        
        //    20: iconst_1       
        //    21: new             LX/29W;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   X/29W.<init>:(Lcom/bytedance/android/live/performance/widget/PerformProcessWidget;)V
        //    29: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LIZ:(ZLX/QgG;)V
        //    32: return         
        //    33: aload_0        
        //    34: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.hide:()V
        //    37: return         
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
    
    public void onInit(final Object[] array) {
    }
    
    public void onLoad(final Object[] array) {
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void onUnload() {
        this.LJ.clear();
        this.LIZJ = false;
    }
    
    public void show() {
        public final class 29Y extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ PerformProcessWidget LIZ;
            
            static {
                Covode.recordClassIndex(10503);
            }
            
            public 29Y(final PerformProcessWidget liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LJIIJ:()Z
        //     4: ifeq            33
        //     7: aload_0        
        //     8: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LJII:()Z
        //    11: ifeq            33
        //    14: aload_0        
        //    15: iconst_1       
        //    16: putfield        com/bytedance/android/live/performance/widget/PerformProcessWidget.LIZIZ:Z
        //    19: aload_0        
        //    20: iconst_1       
        //    21: new             LX/29Y;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   X/29Y.<init>:(Lcom/bytedance/android/live/performance/widget/PerformProcessWidget;)V
        //    29: invokevirtual   com/bytedance/android/live/performance/widget/PerformProcessWidget.LIZ:(ZLX/QgG;)V
        //    32: return         
        //    33: aload_0        
        //    34: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.show:()V
        //    37: return         
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
}
