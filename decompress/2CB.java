// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;

public final class 2Cb extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ SoundEffectViewModel LIZIZ;
    
    static {
        Covode.recordClassIndex(6646);
    }
    
    public 2Cb(final SoundEffectViewModel liziz, final Cye cye) {
        this.LIZIZ = liziz;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Cb(this.LIZIZ, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        public final class 1MD implements 8Z4<0i9>
        {
            public final /* synthetic */ 2Cb LIZ;
            
            static {
                Covode.recordClassIndex(6647);
            }
            
            public 1MD(final 2Cb liz) {
                this.LIZ = liz;
            }
            
            public final Object emit(final Object o, final Cye cye) {
                final 0i9 0i9 = (0i9)o;
                if (0i9 instanceof 0i9.b) {
                    final SoundEffectViewModel liziz = this.LIZ.LIZIZ;
                    F0v.LIZ(0Br.LIZ(liziz), (F2r)null, (SRT)new 2Ca(liziz, ((0i9.b)0i9).LIZ, null), 3);
                }
                else if (0i9 instanceof 0i9.c) {
                    final SoundEffectViewModel liziz2 = this.LIZ.LIZIZ;
                    F0v.LIZ(0Br.LIZ(liziz2), (F2r)null, (SRT)new 2Cd(liziz2, ((0i9.c)0i9).LIZ, null), 3);
                }
                else if (0i9 instanceof 0i9.a) {
                    final SoundEffectViewModel liziz3 = this.LIZ.LIZIZ;
                    F0v.LIZ(0Br.LIZ(liziz3), (F2r)null, (SRT)new 2CY(liziz3, ((0i9.a)0i9).LIZ, null), 3);
                }
                else if (0i9 instanceof 0i9.d) {
                    this.LIZ.LIZIZ.LIZ(((0i9.d)0i9).LIZ);
                }
                return 2P9.LIZ;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        X/2Cb.LIZ:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            26
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpne       71
        //    18: aload_1        
        //    19: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    22: getstatic       X/2P9.LIZ:LX/2P9;
        //    25: areturn        
        //    26: aload_1        
        //    27: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    30: aload_0        
        //    31: getfield        X/2Cb.LIZIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    34: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZ:LX/F0H;
        //    37: invokestatic    X/Ezt.LIZ:(LX/F0d;)LX/8Z1;
        //    40: astore          4
        //    42: new             LX/1MD;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/1MD.<init>:(LX/2Cb;)V
        //    50: astore_1       
        //    51: aload_0        
        //    52: iconst_1       
        //    53: putfield        X/2Cb.LIZ:I
        //    56: aload           4
        //    58: aload_1        
        //    59: aload_0        
        //    60: invokeinterface X/8Z1.collect:(LX/8Z4;LX/Cye;)Ljava/lang/Object;
        //    65: aload_2        
        //    66: if_acmpne       22
        //    69: aload_2        
        //    70: areturn        
        //    71: new             Ljava/lang/IllegalStateException;
        //    74: dup            
        //    75: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    77: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    80: athrow         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
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
