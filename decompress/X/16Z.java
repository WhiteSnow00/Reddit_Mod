// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import android.util.AndroidRuntimeException;
import android.animation.TimeInterpolator;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class 16Z extends 0Dg
{
    public ArrayList<0Dg> LIZ;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJIJ;
    
    static {
        Covode.recordClassIndex(1460);
    }
    
    public 16Z() {
        this.LIZ = new ArrayList<0Dg>();
        this.LJIIZILJ = true;
        this.LJIILLIIL = false;
        this.LJIJ = 0;
    }
    
    private void LIZIZ(final 0Dg 0Dg) {
        this.LIZ.add(0Dg);
        0Dg.LJIIIZ = this;
    }
    
    public final 16Z LIZ(final int n) {
        if (n != 0) {
            if (n != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(n)));
            }
            this.LJIIZILJ = false;
        }
        else {
            this.LJIIZILJ = true;
        }
        return this;
    }
    
    public final 16Z LIZ(final 0Dg 0Dg) {
        this.LIZIZ(0Dg);
        if (super.LIZLLL >= 0L) {
            0Dg.LIZ(super.LIZLLL);
        }
        if ((this.LJIJ & 0x1) != 0x0) {
            0Dg.LIZ(super.LJ);
        }
        if ((this.LJIJ & 0x2) != 0x0) {
            0Dg.LIZ(super.LJIIL);
        }
        if ((this.LJIJ & 0x4) != 0x0) {
            0Dg.LIZ(super.LJIILJJIL);
        }
        if ((this.LJIJ & 0x8) != 0x0) {
            0Dg.LIZ(super.LJIILIIL);
        }
        return this;
    }
    
    @Override
    public final String LIZ(final String s) {
        String s2 = super.LIZ(s);
        for (int i = 0; i < this.LIZ.size(); ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append("\n");
            final 0Dg 0Dg = this.LIZ.get(i);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append("  ");
            sb.append(0Dg.LIZ(sb2.toString()));
            s2 = sb.toString();
        }
        return s2;
    }
    
    @Override
    public final void LIZ(final 0DX 0dx) {
        super.LIZ(0dx);
        this.LJIJ |= 0x4;
        if (this.LIZ != null) {
            for (int i = 0; i < this.LIZ.size(); ++i) {
                this.LIZ.get(i).LIZ(0dx);
            }
        }
    }
    
    @Override
    public final void LIZ(final b b) {
        super.LIZ(b);
        this.LJIJ |= 0x8;
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LIZ(b);
        }
    }
    
    @Override
    public final void LIZ(final 0Dj 0Dj) {
        super.LIZ(0Dj);
        this.LJIJ |= 0x2;
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LIZ(0Dj);
        }
    }
    
    @Override
    public final void LIZ(final 0Dl 0Dl) {
        if (this.LIZ(0Dl.LIZIZ)) {
            for (final 0Dg 0Dg : this.LIZ) {
                if (0Dg.LIZ(0Dl.LIZIZ)) {
                    0Dg.LIZ(0Dl);
                    0Dl.LIZJ.add(0Dg);
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final ViewGroup viewGroup, final 0Dm 0Dm, final 0Dm 0Dm2, final ArrayList<0Dl> list, final ArrayList<0Dl> list2) {
        final long lizj = super.LIZJ;
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            final 0Dg 0Dg = this.LIZ.get(i);
            if (lizj > 0L && (this.LJIIZILJ || i == 0)) {
                final long lizj2 = 0Dg.LIZJ;
                if (lizj2 > 0L) {
                    0Dg.LIZIZ(lizj2 + lizj);
                }
                else {
                    0Dg.LIZIZ(lizj);
                }
            }
            0Dg.LIZ(viewGroup, 0Dm, 0Dm2, list, list2);
        }
    }
    
    public final 0Dg LIZIZ(final int n) {
        if (n < 0 || n >= this.LIZ.size()) {
            return null;
        }
        return this.LIZ.get(n);
    }
    
    public final 16Z LIZIZ(final TimeInterpolator timeInterpolator) {
        this.LJIJ |= 0x1;
        final ArrayList<0Dg> liz = this.LIZ;
        if (liz != null) {
            for (int size = liz.size(), i = 0; i < size; ++i) {
                this.LIZ.get(i).LIZ(timeInterpolator);
            }
        }
        super.LIZ(timeInterpolator);
        return this;
    }
    
    @Override
    public final void LIZIZ() {
        public final class 1gY extends 16Y
        {
            public final /* synthetic */ 0Dg LIZ;
            
            static {
                Covode.recordClassIndex(1461);
            }
            
            public 1gY(final 0Dg liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final 0Dg 0Dg) {
                this.LIZ.LIZIZ();
                0Dg.LIZIZ((0Dg.c)this);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //     4: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //     7: ifeq            19
        //    10: aload_0        
        //    11: invokevirtual   X/0Dg.LIZJ:()V
        //    14: aload_0        
        //    15: invokevirtual   X/0Dg.LIZLLL:()V
        //    18: return         
        //    19: new             LX/1gZ;
        //    22: dup            
        //    23: aload_0        
        //    24: invokespecial   X/1gZ.<init>:(LX/16Z;)V
        //    27: astore_1       
        //    28: aload_0        
        //    29: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //    32: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    35: astore_2       
        //    36: aload_2        
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            62
        //    45: aload_2        
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: checkcast       LX/0Dg;
        //    54: aload_1        
        //    55: invokevirtual   X/0Dg.LIZ:(LX/0Df;)LX/0Dg;
        //    58: pop            
        //    59: goto            36
        //    62: aload_0        
        //    63: aload_0        
        //    64: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //    67: invokevirtual   java/util/ArrayList.size:()I
        //    70: putfield        X/16Z.LJIILL:I
        //    73: aload_0        
        //    74: getfield        X/16Z.LJIIZILJ:Z
        //    77: ifne            155
        //    80: iconst_1       
        //    81: istore_3       
        //    82: iload_3        
        //    83: aload_0        
        //    84: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //    87: invokevirtual   java/util/ArrayList.size:()I
        //    90: if_icmpge       134
        //    93: aload_0        
        //    94: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //    97: iload_3        
        //    98: iconst_1       
        //    99: isub           
        //   100: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   103: checkcast       LX/0Dg;
        //   106: new             LX/1gY;
        //   109: dup            
        //   110: aload_0        
        //   111: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //   114: iload_3        
        //   115: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   118: checkcast       LX/0Dg;
        //   121: invokespecial   X/1gY.<init>:(LX/0Dg;)V
        //   124: invokevirtual   X/0Dg.LIZ:(LX/0Df;)LX/0Dg;
        //   127: pop            
        //   128: iinc            3, 1
        //   131: goto            82
        //   134: aload_0        
        //   135: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //   138: iconst_0       
        //   139: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   142: checkcast       LX/0Dg;
        //   145: astore_2       
        //   146: aload_2        
        //   147: ifnull          154
        //   150: aload_2        
        //   151: invokevirtual   X/0Dg.LIZIZ:()V
        //   154: return         
        //   155: aload_0        
        //   156: getfield        X/16Z.LIZ:Ljava/util/ArrayList;
        //   159: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   162: astore_2       
        //   163: aload_2        
        //   164: invokeinterface java/util/Iterator.hasNext:()Z
        //   169: ifeq            187
        //   172: aload_2        
        //   173: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   178: checkcast       LX/0Dg;
        //   181: invokevirtual   X/0Dg.LIZIZ:()V
        //   184: goto            163
        //   187: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
    public final void LIZIZ(final 0Dl 0Dl) {
        if (this.LIZ(0Dl.LIZIZ)) {
            for (final 0Dg 0Dg : this.LIZ) {
                if (0Dg.LIZ(0Dl.LIZIZ)) {
                    0Dg.LIZIZ(0Dl);
                    0Dl.LIZJ.add(0Dg);
                }
            }
        }
    }
    
    public final 16Z LIZJ(final long n) {
        super.LIZ(n);
        if (super.LIZLLL >= 0L) {
            final ArrayList<0Dg> liz = this.LIZ;
            if (liz != null) {
                for (int size = liz.size(), i = 0; i < size; ++i) {
                    this.LIZ.get(i).LIZ(n);
                }
            }
        }
        return this;
    }
    
    @Override
    public final void LIZJ(final 0Dl 0Dl) {
        super.LIZJ(0Dl);
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LIZJ(0Dl);
        }
    }
    
    @Override
    public final void LIZLLL(final View view) {
        super.LIZLLL(view);
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LIZLLL(view);
        }
    }
    
    @Override
    public final void LJ() {
        super.LJ();
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LJ();
        }
    }
    
    @Override
    public final void LJ(final View view) {
        super.LJ(view);
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            this.LIZ.get(i).LJ(view);
        }
    }
    
    @Override
    public final 0Dg LJFF() {
        final 16Z 16Z = (16Z)super.LJFF();
        16Z.LIZ = new ArrayList<0Dg>();
        for (int size = this.LIZ.size(), i = 0; i < size; ++i) {
            16Z.LIZIZ(this.LIZ.get(i).LJFF());
        }
        return 16Z;
    }
    
    public static final class a extends 16Y
    {
        public 16Z LIZ;
        
        static {
            Covode.recordClassIndex(1462);
        }
        
        public a(final 16Z liz) {
            this.LIZ = liz;
        }
        
        @Override
        public final void LIZ(final 0Dg 0Dg) {
            final 16Z liz = this.LIZ;
            --liz.LJIILL;
            if (this.LIZ.LJIILL == 0) {
                this.LIZ.LJIILLIIL = false;
                this.LIZ.LIZLLL();
            }
            0Dg.LIZIZ((c)this);
        }
        
        @Override
        public final void LIZIZ(final 0Dg 0Dg) {
            if (!this.LIZ.LJIILLIIL) {
                this.LIZ.LIZJ();
                this.LIZ.LJIILLIIL = true;
            }
        }
    }
}
