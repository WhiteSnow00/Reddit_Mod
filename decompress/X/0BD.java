// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.AbstractList;

public abstract class 0BD<T> extends AbstractList<T>
{
    public final AtomicBoolean LIZ;
    public final ArrayList<WeakReference<c>> LIZIZ;
    public final Executor LIZJ;
    public final Executor LIZLLL;
    public final a<T> LJ;
    public final d LJFF;
    public final 0BF<T> LJI;
    public int LJII;
    public T LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    
    static {
        Covode.recordClassIndex(1156);
    }
    
    public 0BD(final 0BF<T> lji, final Executor lizj, final Executor lizlll, final a<T> lj, final d ljff) {
        this.LJIIJJI = Integer.MAX_VALUE;
        this.LJIIL = Integer.MIN_VALUE;
        this.LIZ = new AtomicBoolean(false);
        this.LIZIZ = new ArrayList<WeakReference<c>>();
        this.LJI = lji;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public static <K, T> 0BD<T> LIZ(final 0Av<K, T> 0Av, final Executor executor, final Executor executor2, final a<T> a, final d d, final K k) {
        return (0BD<T>)new 15R((15P<Object, Object>)0Av, executor, executor2, (a<Object>)a, d, k, -1);
    }
    
    public abstract void LIZ(final int p0);
    
    public final void LIZ(final int n, final int n2) {
        if (n2 != 0) {
            for (int i = this.LIZIZ.size() - 1; i >= 0; --i) {
                final c c = this.LIZIZ.get(i).get();
                if (c != null) {
                    c.LIZ(n, n2);
                }
            }
        }
    }
    
    public final void LIZ(final c c) {
        for (int i = this.LIZIZ.size() - 1; i >= 0; --i) {
            final Object value = this.LIZIZ.get(i).get();
            if (value == null || value == c) {
                this.LIZIZ.remove(i);
            }
        }
    }
    
    public abstract void LIZ(final 0BD<T> p0, final c p1);
    
    public final void LIZ(final List<T> list, final c c) {
        if (list != null && list != this) {
            if (list.isEmpty()) {
                if (!this.LJI.isEmpty()) {
                    c.LIZ(0, this.LJI.size());
                }
            }
            else {
                this.LIZ((0BD)list, c);
            }
        }
        for (int i = this.LIZIZ.size() - 1; i >= 0; --i) {
            if (this.LIZIZ.get(i).get() == null) {
                this.LIZIZ.remove(i);
            }
        }
        this.LIZIZ.add(new WeakReference<c>(c));
    }
    
    public final void LIZ(final boolean b) {
        public final class 0B7 implements Runnable
        {
            public final /* synthetic */ boolean LIZ;
            public final /* synthetic */ boolean LIZIZ;
            public final /* synthetic */ 0BD LIZJ;
            
            static {
                Covode.recordClassIndex(1158);
            }
            
            public 0B7(final 0BD lizj, final boolean liz, final boolean liziz) {
                this.LIZJ = lizj;
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZJ.LIZ(this.LIZ, this.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/0BD.LJIIIZ:Z
        //     4: istore_2       
        //     5: iconst_1       
        //     6: istore_3       
        //     7: iload_2        
        //     8: ifeq            69
        //    11: aload_0        
        //    12: getfield        X/0BD.LJIIJJI:I
        //    15: aload_0        
        //    16: getfield        X/0BD.LJFF:LX/0BC;
        //    19: getfield        X/0BC.LIZIZ:I
        //    22: if_icmpgt       69
        //    25: iconst_1       
        //    26: istore_2       
        //    27: aload_0        
        //    28: getfield        X/0BD.LJIIJ:Z
        //    31: ifeq            64
        //    34: aload_0        
        //    35: getfield        X/0BD.LJIIL:I
        //    38: aload_0        
        //    39: invokevirtual   X/0BD.size:()I
        //    42: iconst_1       
        //    43: isub           
        //    44: aload_0        
        //    45: getfield        X/0BD.LJFF:LX/0BC;
        //    48: getfield        X/0BC.LIZIZ:I
        //    51: isub           
        //    52: if_icmplt       64
        //    55: iload_2        
        //    56: ifne            74
        //    59: iload_3        
        //    60: ifne            83
        //    63: return         
        //    64: iconst_0       
        //    65: istore_3       
        //    66: goto            55
        //    69: iconst_0       
        //    70: istore_2       
        //    71: goto            27
        //    74: aload_0        
        //    75: iconst_0       
        //    76: putfield        X/0BD.LJIIIZ:Z
        //    79: iload_3        
        //    80: ifeq            88
        //    83: aload_0        
        //    84: iconst_0       
        //    85: putfield        X/0BD.LJIIJ:Z
        //    88: iload_1        
        //    89: ifeq            112
        //    92: aload_0        
        //    93: getfield        X/0BD.LIZJ:Ljava/util/concurrent/Executor;
        //    96: new             LX/0B7;
        //    99: dup            
        //   100: aload_0        
        //   101: iload_2        
        //   102: iload_3        
        //   103: invokespecial   X/0B7.<init>:(LX/0BD;ZZ)V
        //   106: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //   111: return         
        //   112: aload_0        
        //   113: iload_2        
        //   114: iload_3        
        //   115: invokevirtual   X/0BD.LIZ:(ZZ)V
        //   118: return         
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
    
    public final void LIZ(final boolean b, final boolean b2) {
        if (b) {
            this.LJI.LIZJ();
        }
        if (b2) {
            this.LJ.LIZ(this.LJI.LIZLLL());
        }
    }
    
    public abstract boolean LIZ();
    
    public abstract 0Av<?, T> LIZIZ();
    
    public final void LIZIZ(final int n, final int n2) {
        if (n2 != 0) {
            for (int i = this.LIZIZ.size() - 1; i >= 0; --i) {
                final c c = this.LIZIZ.get(i).get();
                if (c != null) {
                    c.LIZIZ(n, n2);
                }
            }
        }
    }
    
    public abstract Object LIZJ();
    
    public boolean LIZLLL() {
        return this.LJFF();
    }
    
    public final List<T> LJ() {
        if (this.LIZLLL()) {
            return this;
        }
        return new 15b<T>(this);
    }
    
    public boolean LJFF() {
        return this.LIZ.get();
    }
    
    public final void LJI() {
        this.LIZ.set(true);
    }
    
    @Override
    public T get(final int n) {
        final T value = this.LJI.get(n);
        if (value != null) {
            this.LJIIIIZZ = value;
        }
        return value;
    }
    
    @Override
    public int size() {
        return this.LJI.size();
    }
    
    public abstract static class a<T>
    {
        static {
            Covode.recordClassIndex(1159);
        }
        
        public void LIZ() {
        }
        
        public void LIZ(final T t) {
        }
    }
    
    public static final class b<Key, Value>
    {
        public Executor LIZ;
        public Executor LIZIZ;
        public 0BD.a LIZJ;
        public Key LIZLLL;
        public final 0Av<Key, Value> LJ;
        public final d LJFF;
        
        static {
            Covode.recordClassIndex(1160);
        }
        
        public b(final 0Av<Key, Value> lj, final d ljff) {
            if (lj == null) {
                throw new IllegalArgumentException("DataSource may not be null");
            }
            if (ljff != null) {
                this.LJ = lj;
                this.LJFF = ljff;
                return;
            }
            throw new IllegalArgumentException("Config may not be null");
        }
        
        public final 0BD<Value> LIZ() {
            final Executor liz = this.LIZ;
            if (liz == null) {
                throw new IllegalArgumentException("MainThreadExecutor required");
            }
            final Executor liziz = this.LIZIZ;
            if (liziz != null) {
                return 0BD.LIZ(this.LJ, liz, liziz, this.LIZJ, this.LJFF, this.LIZLLL);
            }
            throw new IllegalArgumentException("BackgroundThreadExecutor required");
        }
    }
    
    public abstract static class c
    {
        static {
            Covode.recordClassIndex(1161);
        }
        
        public abstract void LIZ(final int p0, final int p1);
        
        public abstract void LIZIZ(final int p0, final int p1);
    }
    
    public static final class d
    {
        public final int LIZ;
        public final int LIZIZ;
        public final boolean LIZJ;
        public final int LIZLLL;
        
        static {
            Covode.recordClassIndex(1162);
        }
        
        public d(final int liz, final int liziz, final boolean lizj, final int lizlll) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        
        public static final class a
        {
            public int LIZ;
            public int LIZIZ;
            public int LIZJ;
            public boolean LIZLLL;
            
            static {
                Covode.recordClassIndex(1163);
            }
            
            public a() {
                this.LIZ = -1;
                this.LIZIZ = -1;
                this.LIZJ = -1;
                this.LIZLLL = true;
            }
            
            public final d LIZ() {
                final int liz = this.LIZ;
                if (liz <= 0) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                if (this.LIZIZ < 0) {
                    this.LIZIZ = liz;
                }
                if (this.LIZJ < 0) {
                    this.LIZJ = liz * 3;
                }
                if (this.LIZLLL || this.LIZIZ != 0) {
                    return new d(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ, (byte)0);
                }
                throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
            }
        }
    }
}
