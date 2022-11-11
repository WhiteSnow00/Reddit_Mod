// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0m9
{
    static {
        Covode.recordClassIndex(7505);
    }
    
    public static final void LIZ(final Context context, final a a, final 0kf 0kf, final String s) {
        public final class 1PU implements b
        {
            public final /* synthetic */ 0kf LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(7508);
            }
            
            public 1PU(final 0kf liz, final String liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                dialogInterface.dismiss();
                0xy.LIZ("popup", this.LIZ, this.LIZIZ, false);
            }
        }
        public final class 1PT implements b
        {
            public final /* synthetic */ 0kf LIZ;
            public final /* synthetic */ String LIZIZ;
            public final /* synthetic */ 0m9.a LIZJ;
            
            static {
                Covode.recordClassIndex(7507);
            }
            
            public 1PT(final 0kf liz, final String liziz, final 0m9.a lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                dialogInterface.dismiss();
                0xy.LIZ("popup", this.LIZ, this.LIZIZ, true);
                final 44V llzll = GST.LLZLL;
                n.LIZIZ((Object)llzll, "");
                ((44T)llzll).LIZ((Object)true);
                this.LIZJ.LIZ();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: ldc             "popup"
        //     7: aload_2        
        //     8: aload_3        
        //     9: invokestatic    X/0xy.LIZ:(Ljava/lang/String;LX/0kf;Ljava/lang/String;)V
        //    12: new             LX/1II;
        //    15: dup            
        //    16: aload_0        
        //    17: invokespecial   X/1II.<init>:(Landroid/content/Context;)V
        //    20: astore          4
        //    22: aload           4
        //    24: ldc             2131829238
        //    26: invokevirtual   X/1II.LIZJ:(I)LX/1II;
        //    29: pop            
        //    30: new             LX/0e5;
        //    33: dup            
        //    34: invokespecial   X/0e5.<init>:()V
        //    37: astore          5
        //    39: new             LX/1IL;
        //    42: dup            
        //    43: invokespecial   X/1IL.<init>:()V
        //    46: astore          6
        //    48: aload           6
        //    50: aload_0        
        //    51: ldc             2131829237
        //    53: invokevirtual   X/0e3.LIZ:(Landroid/content/Context;I)LX/0e3;
        //    56: pop            
        //    57: aload           6
        //    59: new             LX/1PT;
        //    62: dup            
        //    63: aload_2        
        //    64: aload_3        
        //    65: aload_1        
        //    66: invokespecial   X/1PT.<init>:(LX/0kf;Ljava/lang/String;LX/0m8;)V
        //    69: putfield        X/0e3.LIZJ:LX/0dy;
        //    72: aload           5
        //    74: aload           6
        //    76: invokevirtual   X/1IL.LIZ:()LX/1IM;
        //    79: invokevirtual   X/0e5.LIZ:(LX/0e4;)LX/0e5;
        //    82: pop            
        //    83: new             LX/1IN;
        //    86: dup            
        //    87: invokespecial   X/1IN.<init>:()V
        //    90: astore_1       
        //    91: aload_1        
        //    92: aload_0        
        //    93: ldc             2131829236
        //    95: invokevirtual   X/0e3.LIZ:(Landroid/content/Context;I)LX/0e3;
        //    98: pop            
        //    99: aload_1        
        //   100: new             LX/1PU;
        //   103: dup            
        //   104: aload_2        
        //   105: aload_3        
        //   106: invokespecial   X/1PU.<init>:(LX/0kf;Ljava/lang/String;)V
        //   109: putfield        X/0e3.LIZJ:LX/0dy;
        //   112: aload           5
        //   114: aload_1        
        //   115: invokevirtual   X/1IN.LIZ:()LX/1IO;
        //   118: invokevirtual   X/0e5.LIZ:(LX/0e4;)LX/0e5;
        //   121: pop            
        //   122: aload           5
        //   124: iconst_0       
        //   125: putfield        X/0e5.LIZIZ:I
        //   128: aload           4
        //   130: aload           5
        //   132: invokevirtual   X/0e5.LIZ:()LX/0e6;
        //   135: invokevirtual   X/1II.LIZ:(LX/0e6;)LX/1II;
        //   138: pop            
        //   139: aload           4
        //   141: invokevirtual   X/1II.LIZIZ:()Lcom/bytedance/android/live/design/app/LiveDialog;
        //   144: astore_0       
        //   145: aload_0        
        //   146: invokevirtual   com/bytedance/android/live/design/app/LifecycleAwareDialog.show:()V
        //   149: getstatic       X/KN6.LIZ:LX/KN6;
        //   152: aload_0        
        //   153: invokevirtual   X/KN6.LIZ:(Landroid/app/Dialog;)V
        //   156: return         
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
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(7506);
        }
        
        void LIZ();
    }
}
