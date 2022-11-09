// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.covode.number.Covode;

public final class 1la extends 1T3
{
    public static final b LIZJ;
    public final a LIZIZ;
    
    static {
        Covode.recordClassIndex(8314);
        LIZJ = new b((byte)0);
    }
    
    public 1la(final a liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final String LIZ() {
        return "MultiCoHostPrivateAccountDialog";
    }
    
    @Override
    public final void LIZIZ() {
        public final class 1T9 implements LiveDialog.b
        {
            public final /* synthetic */ 1la LIZ;
            
            static {
                Covode.recordClassIndex(8318);
            }
            
            public 1T9(final 1la liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                final QgG<2P9> liziz = this.LIZ.LIZIZ.LIZIZ;
                if (liziz != null) {
                    liziz.invoke();
                }
                dialogInterface.dismiss();
            }
        }
        public final class 1T8 implements LiveDialog.b
        {
            public final /* synthetic */ 1la LIZ;
            
            static {
                Covode.recordClassIndex(8317);
            }
            
            public 1T8(final 1la liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                final QgG<2P9> liz = this.LIZ.LIZIZ.LIZ;
                if (liz != null) {
                    liz.invoke();
                }
                dialogInterface.dismiss();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        X/1la.LIZIZ:LX/0qC;
        //     8: getfield        X/0qC.LIZJ:Landroid/content/Context;
        //    11: invokespecial   X/1II.<init>:(Landroid/content/Context;)V
        //    14: astore_1       
        //    15: aload_1        
        //    16: ldc             2131233951
        //    18: invokevirtual   X/1II.LIZ:(I)LX/1II;
        //    21: pop            
        //    22: aload_1        
        //    23: aload_0        
        //    24: getfield        X/1la.LIZIZ:LX/0qC;
        //    27: getfield        X/0qC.LIZLLL:LX/0qE;
        //    30: invokevirtual   X/0qE.getTitleResId:()I
        //    33: invokevirtual   X/1II.LIZIZ:(I)LX/1II;
        //    36: pop            
        //    37: aload_1        
        //    38: aload_0        
        //    39: getfield        X/1la.LIZIZ:LX/0qC;
        //    42: getfield        X/0qC.LIZLLL:LX/0qE;
        //    45: invokevirtual   X/0qE.getContentResId:()I
        //    48: invokevirtual   X/1II.LIZJ:(I)LX/1II;
        //    51: pop            
        //    52: aload_1        
        //    53: ldc             2131830430
        //    55: new             LX/1T8;
        //    58: dup            
        //    59: aload_0        
        //    60: invokespecial   X/1T8.<init>:(LX/1la;)V
        //    63: invokevirtual   X/1II.LIZIZ:(ILX/0dy;)LX/1II;
        //    66: pop            
        //    67: aload_1        
        //    68: ldc             2131829267
        //    70: new             LX/1T9;
        //    73: dup            
        //    74: aload_0        
        //    75: invokespecial   X/1T9.<init>:(LX/1la;)V
        //    78: invokevirtual   X/1II.LIZ:(ILX/0dy;)LX/1II;
        //    81: pop            
        //    82: aload_1        
        //    83: iconst_0       
        //    84: putfield        X/1II.LJIJI:Z
        //    87: aload_0        
        //    88: aload_1        
        //    89: invokevirtual   X/1II.LIZIZ:()Lcom/bytedance/android/live/design/app/LiveDialog;
        //    92: putfield        X/1T3.LIZ:Landroid/app/Dialog;
        //    95: aload_0        
        //    96: getfield        X/1T3.LIZ:Landroid/app/Dialog;
        //    99: astore_1       
        //   100: aload_1        
        //   101: ifnull          165
        //   104: aload_1        
        //   105: invokevirtual   android/app/Dialog.show:()V
        //   108: aload_1        
        //   109: invokevirtual   android/app/Dialog.getWindow:()Landroid/view/Window;
        //   112: invokevirtual   android/view/Window.getDecorView:()Landroid/view/View;
        //   115: astore_2       
        //   116: aload_2        
        //   117: ifnull          158
        //   120: aload_2        
        //   121: ldc             2131374348
        //   123: invokevirtual   android/view/View.getTag:(I)Ljava/lang/Object;
        //   126: checkcast       Ljava/lang/Boolean;
        //   129: astore_3       
        //   130: aload_3        
        //   131: ifnull          158
        //   134: aload_3        
        //   135: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   138: ifeq            158
        //   141: aload_1        
        //   142: invokestatic    X/0RT.LIZ:(Landroid/app/Dialog;)V
        //   145: aload_2        
        //   146: ldc             2131374349
        //   148: aload_2        
        //   149: invokevirtual   java/lang/Object.hashCode:()I
        //   152: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   155: invokevirtual   android/view/View.setTag:(ILjava/lang/Object;)V
        //   158: getstatic       X/KN6.LIZ:LX/KN6;
        //   161: aload_1        
        //   162: invokevirtual   X/KN6.LIZ:(Landroid/app/Dialog;)V
        //   165: return         
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
    
    public static final class a
    {
        public QgG<2P9> LIZ;
        public QgG<2P9> LIZIZ;
        public final Context LIZJ;
        public final 0qE LIZLLL;
        
        static {
            Covode.recordClassIndex(8315);
        }
        
        public a(final Context lizj, final 0qE lizlll) {
            CTM.LIZ((Object)lizj, (Object)lizlll);
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
    }
    
    public static final class b
    {
        static {
            Covode.recordClassIndex(8316);
        }
        
        public void LIZ(final Context context, final 0qE 0qE, final QgG<2P9> liziz) {
            CTM.LIZ((Object)context, (Object)0qE);
            final a a = new a(context, 0qE);
            a.LIZ = null;
            a.LIZIZ = liziz;
            0q3.LIZ(new 1la(a, (byte)0));
        }
    }
}
