// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 17y extends 0Hg
{
    public static final a LIZJ;
    public static final int[] LJI;
    public static final int[] LJII;
    public final int[] LIZLLL;
    public final int[] LJ;
    public final int[] LJFF;
    
    static {
        Covode.recordClassIndex(1866);
        int n = 0;
        LIZJ = new a((byte)0);
        LJI = new int[] { 7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21 };
        final int[] ljii = new int[64];
        do {
            ljii[n] = (int)(Math.abs(Math.sin(n + 1.0)) * 4.294967296E9);
        } while (++n < 64);
        LJII = ljii;
    }
    
    public 17y() {
        this.LIZLLL = new int[4];
        this.LJ = new int[4];
        this.LJFF = new int[16];
        this.LIZ();
    }
    
    @Override
    public final void LIZ() {
        final int[] lizlll = this.LIZLLL;
        lizlll[0] = 1732584193;
        lizlll[1] = -271733879;
        lizlll[2] = -1732584194;
        lizlll[3] = 271733878;
    }
    
    @Override
    public final void LIZ(final byte[] array) {
        CTM.LIZ((Object)array);
        final int n = 0;
        int n2 = 0;
        do {
            final int[] ljff = this.LJFF;
            final int n3 = n2 >>> 2;
            ljff[n3] = (array[n2] << 24 | ljff[n3] >>> 8);
        } while (++n2 < 64);
        int n4 = 0;
        do {
            this.LJ[n4] = this.LIZLLL[n4];
        } while (++n4 < 4);
        int n5 = 0;
        int n6;
        int[] lizlll;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int[] lizlll2;
        int n10;
        int[] lizlll3;
        int n11;
        int n12;
        int[] lizlll4;
        int n13;
        int n14;
        int[] lizlll5;
        int n15;
        int n16;
        int n17;
        int i = 0;
        Label_0111_Outer:Label_0132_Outer:
        while (true) {
            n6 = n5 / 16;
        Label_0132:
            while (true) {
                while (true) {
                    Label_0374: {
                        if (n6 == 0) {
                            lizlll = this.LIZLLL;
                            n7 = (lizlll[1] & lizlll[2]);
                            n8 = ~lizlll[1];
                            n9 = lizlll[3];
                            break Label_0374;
                        }
                        if (n6 == 1) {
                            lizlll2 = this.LIZLLL;
                            n7 = (lizlll2[1] & lizlll2[3]);
                            n8 = lizlll2[2];
                            n9 = ~lizlll2[3];
                            break Label_0374;
                        }
                        if (n6 != 2) {
                            if (n6 != 3) {
                                n10 = 0;
                                break Label_0111;
                            }
                            lizlll3 = this.LIZLLL;
                            n11 = lizlll3[2];
                            n12 = (~lizlll3[3] | lizlll3[1]);
                        }
                        else {
                            lizlll4 = this.LIZLLL;
                            n11 = (lizlll4[1] ^ lizlll4[2]);
                            n12 = lizlll4[3];
                        }
                        n10 = (n12 ^ n11);
                        if (n6 != 1) {
                            if (n6 != 2) {
                                if (n6 != 3) {
                                    n13 = 0;
                                    break Label_0132;
                                }
                                n14 = n5 * 7;
                            }
                            else {
                                n14 = n5 * 3 + 5;
                            }
                        }
                        else {
                            n14 = n5 * 5 + 1;
                        }
                        n13 = (n14 & 0xF);
                        lizlll5 = this.LIZLLL;
                        n15 = lizlll5[1];
                        n16 = lizlll5[0] + n10 + this.LJFF[n13] + 17y.LJII[n5];
                        n17 = 17y.LJI[n6 << 2 | (n5 & 0x3)];
                        lizlll5[0] = lizlll5[3];
                        lizlll5[3] = lizlll5[2];
                        lizlll5[2] = lizlll5[1];
                        lizlll5[1] = n15 + (n16 >>> 32 - n17 | n16 << n17);
                        ++n5;
                        i = n;
                        if (n5 < 64) {
                            continue Label_0111_Outer;
                        }
                        break;
                    }
                    n10 = ((n9 & n8) | n7);
                    if (n6 != 0) {
                        continue Label_0132_Outer;
                    }
                    break;
                }
                n13 = n5;
                continue Label_0132;
            }
        }
        do {
            final int[] lizlll6 = this.LIZLLL;
            lizlll6[i] += this.LJ[i];
            ++i;
        } while (i < 4);
    }
    
    @Override
    public final byte[] LIZ(final long n) {
        final int n2 = (int)(((n + 8L) / super.LIZ + 1L) * super.LIZ - n);
        final byte[] array = new byte[n2];
        int n3 = 0;
        array[0] = -128;
        do {
            array[n2 - 8 + n3] = (byte)(8L * n >>> n3 * 8);
        } while (++n3 < 8);
        return array;
    }
    
    @Override
    public final void LIZIZ(final byte[] array) {
        CTM.LIZ((Object)array);
        int n = 0;
        do {
            array[n] = (byte)(this.LIZLLL[n / 4] >>> n % 4 * 8);
        } while (++n < 16);
    }
    
    public static final class a extends 0Hh
    {
        static {
            Covode.recordClassIndex(1867);
        }
        
        public a() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getstatic       X/1nS.LIZ:LX/1nS;
            //     4: invokespecial   X/0Hh.<init>:(LX/QgG;)V
            //     7: return         
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
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
}
