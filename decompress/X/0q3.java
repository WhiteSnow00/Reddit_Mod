// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.cohost.ui.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import kotlin.jvm.internal.n;
import java.util.Iterator;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class 0q3
{
    public static final ConcurrentHashMap<String, 0q5> LIZ;
    
    static {
        Covode.recordClassIndex(8293);
        LIZ = new ConcurrentHashMap<String, 0q5>();
    }
    
    public static final 0q5 LIZ(final String s) {
        CTM.LIZ((Object)s);
        return 0q3.LIZ.get(s);
    }
    
    public static final void LIZ() {
        for (final Map.Entry<K, Object> entry : 0q3.LIZ.entrySet()) {
            final StringBuilder sb = new StringBuilder("clear tag = ");
            sb.append(entry.getValue().LIZ());
            sb.append(", dialog = ");
            sb.append(entry.getValue());
            0ba.LIZ(4, "CoHostDialogManager", sb.toString());
            entry.getValue().LIZJ();
        }
        0q3.LIZ.clear();
    }
    
    public static final void LIZ(final 0q5 0q5) {
        public final class 1z5 extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 0q5 LIZ;
            
            static {
                Covode.recordClassIndex(8294);
            }
            
            public 1z5(final 0q5 liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: getstatic       X/0q3.LIZ:Ljava/util/concurrent/ConcurrentHashMap;
        //     7: astore_1       
        //     8: aload_1        
        //     9: aload_0        
        //    10: invokeinterface X/0q5.LIZ:()Ljava/lang/String;
        //    15: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    18: checkcast       LX/0q5;
        //    21: astore_2       
        //    22: aload_2        
        //    23: ifnull          32
        //    26: aload_2        
        //    27: invokeinterface X/0q5.LIZJ:()V
        //    32: new             Ljava/lang/StringBuilder;
        //    35: dup            
        //    36: ldc             "add tag = "
        //    38: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    41: astore_2       
        //    42: aload_2        
        //    43: aload_0        
        //    44: invokeinterface X/0q5.LIZ:()Ljava/lang/String;
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: pop            
        //    53: aload_2        
        //    54: ldc             ", dialog = "
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload_2        
        //    61: aload_0        
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: iconst_4       
        //    67: ldc             "CoHostDialogManager"
        //    69: aload_2        
        //    70: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    73: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    76: aload_1        
        //    77: aload_0        
        //    78: invokeinterface X/0q5.LIZ:()Ljava/lang/String;
        //    83: aload_0        
        //    84: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    89: pop            
        //    90: aload_0        
        //    91: new             LX/1z5;
        //    94: dup            
        //    95: aload_0        
        //    96: invokespecial   X/1z5.<init>:(LX/0q5;)V
        //    99: invokeinterface X/0q5.LIZ:(LX/QgG;)V
        //   104: aload_0        
        //   105: invokeinterface X/0q5.LIZIZ:()V
        //   110: return         
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
    
    public static final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final StringBuilder sb = new StringBuilder("dismiss tag = ");
        sb.append(s);
        sb.append(", dialog = ");
        final ConcurrentHashMap<String, 0q5> liz = 0q3.LIZ;
        sb.append(liz.get(s));
        0ba.LIZ(4, "CoHostDialogManager", sb.toString());
        final 0q5 0q5 = liz.get(s);
        if (0q5 != null) {
            0q5.LIZJ();
        }
        liz.remove(s);
    }
    
    public static final boolean LIZJ(final String s) {
        CTM.LIZ((Object)s);
        final 0q5 0q5 = 0q3.LIZ.get(s);
        return 0q5 != null && 0q5.LIZLLL();
    }
    
    public static final InteractDialogFragmentBaseContract.AbsView<?> LIZLLL(final String s) {
        CTM.LIZ((Object)s);
        final 0q5 liz = LIZ(s);
        if (liz instanceof 1T2) {
            final InteractDialogFragmentBaseContract.c liziz = ((1T2)liz).LIZIZ;
            if (liziz instanceof LinkDialog) {
                final 0l6.b lji = ((LinkDialog)liziz).LJI();
                if (lji != null) {
                    return lji.LIZIZ();
                }
            }
        }
        return null;
    }
}
