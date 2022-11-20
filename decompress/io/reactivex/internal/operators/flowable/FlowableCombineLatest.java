// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import af2.l;
import nt2.d;
import java.util.concurrent.atomic.AtomicReference;
import nt2.c;
import ff2.o;
import nt2.b;
import af2.g;

public final class FlowableCombineLatest<T, R> extends g<R>
{
    public final b<? extends T>[] f;
    public final Iterable<? extends b<? extends T>> g;
    public final o<? super Object[], ? extends R> h;
    public final int i;
    public final boolean j;
    
    public FlowableCombineLatest(final o h, final boolean j, final int i, final b[] f) {
        this.f = (b<? extends T>[])f;
        this.g = null;
        this.h = (o<? super Object[], ? extends R>)h;
        this.i = i;
        this.j = j;
    }
    
    public FlowableCombineLatest(final Iterable g, final o h, final boolean j, final int i) {
        this.f = null;
        this.g = g;
        this.h = (o<? super Object[], ? extends R>)h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void subscribeActual(final c<? super R> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/reactivex/internal/operators/flowable/FlowableCombineLatest.f:[Lnt2/b;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       165
        //    11: bipush          8
        //    13: anewarray       Lnt2/b;
        //    16: astore          4
        //    18: aload_0        
        //    19: getfield        io/reactivex/internal/operators/flowable/FlowableCombineLatest.g:Ljava/lang/Iterable;
        //    22: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    27: astore          6
        //    29: aload           6
        //    31: ldc             "The iterator returned is null"
        //    33: invokestatic    hf2/a.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    36: iconst_0       
        //    37: istore_2       
        //    38: aload           6
        //    40: invokeinterface java/util/Iterator.hasNext:()Z
        //    45: istore_3       
        //    46: iload_3        
        //    47: ifne            53
        //    50: goto            169
        //    53: aload           6
        //    55: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    60: astore          5
        //    62: aload           5
        //    64: ldc             "The publisher returned by the iterator is null"
        //    66: invokestatic    hf2/a.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: aload           5
        //    71: checkcast       Lnt2/b;
        //    74: astore          7
        //    76: aload           4
        //    78: astore          5
        //    80: iload_2        
        //    81: aload           4
        //    83: arraylength    
        //    84: if_icmpne       107
        //    87: iload_2        
        //    88: iconst_2       
        //    89: ishr           
        //    90: iload_2        
        //    91: iadd           
        //    92: anewarray       Lnt2/b;
        //    95: astore          5
        //    97: aload           4
        //    99: iconst_0       
        //   100: aload           5
        //   102: iconst_0       
        //   103: iload_2        
        //   104: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   107: aload           5
        //   109: iload_2        
        //   110: aload           7
        //   112: aastore        
        //   113: iinc            2, 1
        //   116: aload           5
        //   118: astore          4
        //   120: goto            38
        //   123: astore          4
        //   125: aload           4
        //   127: invokestatic    xd/a.t1:(Ljava/lang/Throwable;)V
        //   130: aload           4
        //   132: aload_1        
        //   133: invokestatic    io/reactivex/internal/subscriptions/EmptySubscription.error:(Ljava/lang/Throwable;Lnt2/c;)V
        //   136: return         
        //   137: astore          4
        //   139: aload           4
        //   141: invokestatic    xd/a.t1:(Ljava/lang/Throwable;)V
        //   144: aload           4
        //   146: aload_1        
        //   147: invokestatic    io/reactivex/internal/subscriptions/EmptySubscription.error:(Ljava/lang/Throwable;Lnt2/c;)V
        //   150: return         
        //   151: astore          4
        //   153: aload           4
        //   155: invokestatic    xd/a.t1:(Ljava/lang/Throwable;)V
        //   158: aload           4
        //   160: aload_1        
        //   161: invokestatic    io/reactivex/internal/subscriptions/EmptySubscription.error:(Ljava/lang/Throwable;Lnt2/c;)V
        //   164: return         
        //   165: aload           4
        //   167: arraylength    
        //   168: istore_2       
        //   169: iload_2        
        //   170: ifne            178
        //   173: aload_1        
        //   174: invokestatic    io/reactivex/internal/subscriptions/EmptySubscription.complete:(Lnt2/c;)V
        //   177: return         
        //   178: iload_2        
        //   179: iconst_1       
        //   180: if_icmpne       209
        //   183: aload           4
        //   185: iconst_0       
        //   186: aaload         
        //   187: new             Lio/reactivex/internal/operators/flowable/c$b;
        //   190: dup            
        //   191: aload_1        
        //   192: new             Lio/reactivex/internal/operators/flowable/FlowableCombineLatest$a;
        //   195: dup            
        //   196: aload_0        
        //   197: invokespecial   io/reactivex/internal/operators/flowable/FlowableCombineLatest$a.<init>:(Lio/reactivex/internal/operators/flowable/FlowableCombineLatest;)V
        //   200: invokespecial   io/reactivex/internal/operators/flowable/c$b.<init>:(Lnt2/c;Lff2/o;)V
        //   203: invokeinterface nt2/b.subscribe:(Lnt2/c;)V
        //   208: return         
        //   209: new             Lio/reactivex/internal/operators/flowable/FlowableCombineLatest$CombineLatestCoordinator;
        //   212: dup            
        //   213: aload_1        
        //   214: aload_0        
        //   215: getfield        io/reactivex/internal/operators/flowable/FlowableCombineLatest.h:Lff2/o;
        //   218: iload_2        
        //   219: aload_0        
        //   220: getfield        io/reactivex/internal/operators/flowable/FlowableCombineLatest.i:I
        //   223: aload_0        
        //   224: getfield        io/reactivex/internal/operators/flowable/FlowableCombineLatest.j:Z
        //   227: invokespecial   io/reactivex/internal/operators/flowable/FlowableCombineLatest$CombineLatestCoordinator.<init>:(Lnt2/c;Lff2/o;IIZ)V
        //   230: astore          5
        //   232: aload_1        
        //   233: aload           5
        //   235: invokeinterface nt2/c.onSubscribe:(Lnt2/d;)V
        //   240: aload           5
        //   242: aload           4
        //   244: iload_2        
        //   245: invokevirtual   io/reactivex/internal/operators/flowable/FlowableCombineLatest$CombineLatestCoordinator.subscribe:([Lnt2/b;I)V
        //   248: return         
        //    Signature:
        //  (Lnt2/c<-TR;>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  18     36     151    165    Any
        //  38     46     137    151    Any
        //  53     76     123    137    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public static final class CombineLatestInnerSubscriber<T> extends AtomicReference<d> implements l<T>
    {
        private static final long serialVersionUID = -8730235182291002949L;
        public final int index;
        public final int limit;
        public final FlowableCombineLatest$CombineLatestCoordinator<T, ?> parent;
        public final int prefetch;
        public int produced;
        
        public CombineLatestInnerSubscriber(final FlowableCombineLatest$CombineLatestCoordinator<T, ?> parent, final int index, final int prefetch) {
            this.parent = parent;
            this.index = index;
            this.prefetch = prefetch;
            this.limit = prefetch - (prefetch >> 2);
        }
        
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }
        
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }
        
        public void onError(final Throwable t) {
            this.parent.innerError(this.index, t);
        }
        
        public void onNext(final T t) {
            this.parent.innerValue(this.index, (Object)t);
        }
        
        @Override
        public void onSubscribe(final d d) {
            SubscriptionHelper.setOnce(this, d, this.prefetch);
        }
        
        public void requestOne() {
            final int produced = this.produced + 1;
            if (produced == this.limit) {
                this.produced = 0;
                this.get().request((long)produced);
            }
            else {
                this.produced = produced;
            }
        }
    }
}
