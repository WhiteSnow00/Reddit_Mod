// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;

public final class 2Cd extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public Object LIZ;
    public int LIZIZ;
    public final /* synthetic */ SoundEffectViewModel LIZJ;
    public final /* synthetic */ 0gn LIZLLL;
    
    static {
        Covode.recordClassIndex(6650);
    }
    
    public 2Cd(final SoundEffectViewModel lizj, final 0gn lizlll, final Cye cye) {
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Cd(this.LIZJ, this.LIZLLL, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        public final class 1tr extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 2Cd LIZ;
            
            static {
                Covode.recordClassIndex(6651);
            }
            
            public 1tr(final 2Cd liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        X/2Cd.LIZIZ:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            31
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpeq       282
        //    18: iload_3        
        //    19: iconst_2       
        //    20: if_icmpne       389
        //    23: aload_1        
        //    24: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    27: getstatic       X/2P9.LIZ:LX/2P9;
        //    30: areturn        
        //    31: aload_1        
        //    32: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    35: aload_0        
        //    36: getfield        X/2Cd.LIZLLL:LX/0gn;
        //    39: invokestatic    X/0iB.LIZ:(LX/0gn;)Z
        //    42: ifeq            345
        //    45: aload_0        
        //    46: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    49: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZLLL:LX/0iC;
        //    52: getfield        X/0iC.LIZ:LX/0gn;
        //    55: aload_0        
        //    56: getfield        X/2Cd.LIZLLL:LX/0gn;
        //    59: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    62: ifne            27
        //    65: aload_0        
        //    66: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    69: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZLLL:LX/0iC;
        //    72: aload_0        
        //    73: getfield        X/2Cd.LIZLLL:LX/0gn;
        //    76: invokevirtual   X/0iC.LIZ:(LX/0gn;)LX/0gn;
        //    79: astore          4
        //    81: aload_0        
        //    82: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    85: astore          5
        //    87: aload_0        
        //    88: getfield        X/2Cd.LIZLLL:LX/0gn;
        //    91: astore          6
        //    93: aload           5
        //    95: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZIZ:LX/0Wj;
        //    98: astore_1       
        //    99: aload_1        
        //   100: ifnull          110
        //   103: aload_1        
        //   104: aconst_null    
        //   105: invokeinterface X/0Wj.LIZ:(LX/1FV;)V
        //   110: aload           5
        //   112: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZIZ:LX/0Wj;
        //   115: astore_1       
        //   116: aload_1        
        //   117: ifnull          277
        //   120: aload_1        
        //   121: invokeinterface X/0Wj.LIZJ:()Z
        //   126: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   129: astore_1       
        //   130: aload_1        
        //   131: invokestatic    X/GTi.LIZ:(Ljava/lang/Boolean;)Z
        //   134: ifeq            153
        //   137: aload           5
        //   139: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZIZ:LX/0Wj;
        //   142: astore_1       
        //   143: aload_1        
        //   144: ifnull          153
        //   147: aload_1        
        //   148: invokeinterface X/0Wj.LIZIZ:()V
        //   153: getstatic       X/0hc.LJIILJJIL:LX/0hc;
        //   156: invokevirtual   X/0hc.LIZLLL:()I
        //   159: istore_3       
        //   160: getstatic       X/0hc.LJIILJJIL:LX/0hc;
        //   163: iload_3        
        //   164: i2d            
        //   165: ldc2_w          0.3
        //   168: dmul           
        //   169: d2i            
        //   170: invokevirtual   X/0hc.LIZ:(I)V
        //   173: aload           5
        //   175: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZIZ:LX/0Wj;
        //   178: astore_1       
        //   179: aload_1        
        //   180: ifnull          197
        //   183: aload_1        
        //   184: getstatic       X/0iE.LIZLLL:LX/0iD;
        //   187: aload           6
        //   189: invokevirtual   X/0iD.LIZIZ:(LX/0gn;)Ljava/lang/String;
        //   192: invokeinterface X/0Wj.LIZ:(Ljava/lang/String;)V
        //   197: aload           5
        //   199: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZIZ:LX/0Wj;
        //   202: astore_1       
        //   203: aload_1        
        //   204: ifnull          225
        //   207: aload_1        
        //   208: new             LX/1jN;
        //   211: dup            
        //   212: aload           5
        //   214: iload_3        
        //   215: aload           6
        //   217: invokespecial   X/1jN.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;ILX/0gn;)V
        //   220: invokeinterface X/0Wj.LIZ:(LX/1FV;)V
        //   225: aload_0        
        //   226: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   229: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   232: astore          5
        //   234: new             LX/1MS;
        //   237: dup            
        //   238: aload_0        
        //   239: getfield        X/2Cd.LIZLLL:LX/0gn;
        //   242: invokespecial   X/1MS.<init>:(LX/0gn;)V
        //   245: astore          6
        //   247: aload_0        
        //   248: aload           4
        //   250: putfield        X/2Cd.LIZ:Ljava/lang/Object;
        //   253: aload_0        
        //   254: iconst_1       
        //   255: putfield        X/2Cd.LIZIZ:I
        //   258: aload           4
        //   260: astore_1       
        //   261: aload           5
        //   263: aload           6
        //   265: aload_0        
        //   266: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   271: aload_2        
        //   272: if_acmpne       298
        //   275: aload_2        
        //   276: areturn        
        //   277: aconst_null    
        //   278: astore_1       
        //   279: goto            130
        //   282: aload_0        
        //   283: getfield        X/2Cd.LIZ:Ljava/lang/Object;
        //   286: checkcast       LX/0gn;
        //   289: astore          4
        //   291: aload_1        
        //   292: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //   295: aload           4
        //   297: astore_1       
        //   298: aload_1        
        //   299: ifnull          27
        //   302: aload_0        
        //   303: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   306: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   309: astore          4
        //   311: new             LX/1MR;
        //   314: dup            
        //   315: aload_1        
        //   316: invokespecial   X/1MR.<init>:(LX/0gn;)V
        //   319: astore_1       
        //   320: aload_0        
        //   321: aconst_null    
        //   322: putfield        X/2Cd.LIZ:Ljava/lang/Object;
        //   325: aload_0        
        //   326: iconst_2       
        //   327: putfield        X/2Cd.LIZIZ:I
        //   330: aload           4
        //   332: aload_1        
        //   333: aload_0        
        //   334: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   339: aload_2        
        //   340: if_acmpne       27
        //   343: aload_2        
        //   344: areturn        
        //   345: aload_0        
        //   346: getfield        X/2Cd.LIZJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   349: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LJ:LX/0iE;
        //   352: astore          4
        //   354: aload_0        
        //   355: getfield        X/2Cd.LIZLLL:LX/0gn;
        //   358: astore_1       
        //   359: new             LX/1tr;
        //   362: dup            
        //   363: aload_0        
        //   364: invokespecial   X/1tr.<init>:(LX/2Cd;)V
        //   367: astore_2       
        //   368: aload_1        
        //   369: aload_2        
        //   370: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   373: aload           4
        //   375: aload_1        
        //   376: putfield        X/0iE.LIZ:LX/0gn;
        //   379: aload           4
        //   381: aload_1        
        //   382: aload_2        
        //   383: invokevirtual   X/0iE.LIZ:(LX/0gn;LX/SRS;)V
        //   386: goto            27
        //   389: new             Ljava/lang/IllegalStateException;
        //   392: dup            
        //   393: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   395: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   398: athrow         
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
