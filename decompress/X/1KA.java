// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

public final class 1KA<T> implements 3VJ
{
    public final /* synthetic */ 1KB LIZ;
    public final /* synthetic */ LiveEffect LIZIZ;
    
    static {
        Covode.recordClassIndex(6341);
    }
    
    public 1KA(final 1KB liz, final LiveEffect liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void subscribe(final FDm<Object> fDm) {
        public final class 1K9 implements IIsTagNeedUpdatedListener
        {
            public final /* synthetic */ 1KA LIZ;
            public final /* synthetic */ FDm LIZIZ;
            
            static {
                Covode.recordClassIndex(6342);
            }
            
            public 1K9(final 1KA liz, final FDm liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onTagNeedNotUpdate() {
                this.LIZ.LIZIZ.isNew = false;
                ((3t4)this.LIZIZ).onComplete();
            }
            
            public final void onTagNeedUpdate() {
                this.LIZ.LIZIZ.isNew = true;
                ((3t4)this.LIZIZ).onComplete();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/1KA.LIZ:LX/1KB;
        //     8: getfield        X/1KB.LIZ:LX/1KD;
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        X/1KA.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    16: invokevirtual   com/bytedance/android/livesdkapi/depend/model/LiveEffect.getEffect:()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;
        //    19: astore_3       
        //    20: aconst_null    
        //    21: astore          4
        //    23: aload_3        
        //    24: ifnull          113
        //    27: aload_3        
        //    28: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getId:()Ljava/lang/String;
        //    31: astore_3       
        //    32: aload_0        
        //    33: getfield        X/1KA.LIZIZ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //    36: invokevirtual   com/bytedance/android/livesdkapi/depend/model/LiveEffect.getEffect:()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;
        //    39: astore          5
        //    41: aload           5
        //    43: ifnull          53
        //    46: aload           5
        //    48: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate.getTagsUpdatedAt:()Ljava/lang/String;
        //    51: astore          4
        //    53: new             LX/1K9;
        //    56: dup            
        //    57: aload_0        
        //    58: aload_1        
        //    59: invokespecial   X/1K9.<init>:(LX/1KA;LX/FDm;)V
        //    62: astore_1       
        //    63: aload_2        
        //    64: getfield        X/1KD.LIZJ:Lcom/ss/android/ugc/effectmanager/EffectManager;
        //    67: ifnull          106
        //    70: aload_3        
        //    71: ifnull          106
        //    74: aload           4
        //    76: ifnull          106
        //    79: aload           4
        //    81: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //    84: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    87: astore          5
        //    89: aload           5
        //    91: ldc             ""
        //    93: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    96: ldc             "NULL"
        //    98: aload           5
        //   100: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   103: ifeq            118
        //   106: aload_1        
        //   107: invokeinterface com/ss/android/ugc/effectmanager/effect/listener/IIsTagNeedUpdatedListener.onTagNeedNotUpdate:()V
        //   112: return         
        //   113: aconst_null    
        //   114: astore_3       
        //   115: goto            32
        //   118: aload_2        
        //   119: getfield        X/1KD.LIZJ:Lcom/ss/android/ugc/effectmanager/EffectManager;
        //   122: aload_3        
        //   123: aload           4
        //   125: aload_1        
        //   126: invokevirtual   com/ss/android/ugc/effectmanager/EffectManager.isTagUpdated:(Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/effect/listener/IIsTagNeedUpdatedListener;)V
        //   129: return         
        //    Signature:
        //  (LX/FDm<Ljava/lang/Object;>;)V
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
