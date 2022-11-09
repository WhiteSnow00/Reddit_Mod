// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Looper;
import android.text.TextUtils;
import android.os.Handler;
import android.os.Bundle;
import java.util.Map;
import java.util.HashMap;
import android.os.Message;
import android.os.Handler$Callback;
import com.bytedance.covode.number.Covode;

public class 1ql extends 1hx
{
    public int LIZ;
    
    static {
        Covode.recordClassIndex(4652);
    }
    
    public 1ql() {
        this.LIZ = 10001;
    }
    
    @Override
    public final String LIZ() {
        return "pipo.getInfoByOcr";
    }
    
    @Override
    public final void LIZ(final Pka pka, final Hya hya, final I0l i0l) {
        public final class 1ED implements 0Tw
        {
            public final /* synthetic */ Handler LIZ;
            public final /* synthetic */ 1ql LIZIZ;
            
            static {
                Covode.recordClassIndex(4654);
            }
            
            public 1ED(final 1ql liziz, final Handler liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final int n, final int n2, final String s, final 1EA obj) {
                final Message message = new Message();
                message.what = this.LIZIZ.LIZ;
                final Bundle data = new Bundle();
                data.putInt("code", n);
                data.putInt("detailCode", n2);
                data.putString("msg", s);
                message.setData(data);
                message.obj = obj;
                this.LIZ.sendMessage(message);
            }
        }
        public final class 0Tt implements Handler$Callback
        {
            public final /* synthetic */ Hya LIZ;
            public final /* synthetic */ 1ql LIZIZ;
            
            static {
                Covode.recordClassIndex(4653);
            }
            
            public 0Tt(final 1ql liziz, final Hya liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            public final boolean handleMessage(final Message message) {
                if (message.what != this.LIZIZ.LIZ) {
                    return false;
                }
                try {
                    final Bundle data = message.getData();
                    final int int1 = data.getInt("code");
                    final int int2 = data.getInt("detailCode");
                    final String string = data.getString("msg");
                    final 1EA 1ea = (1EA)message.obj;
                    int n;
                    int n2;
                    if (1ea == null) {
                        n = 108;
                        n2 = 0;
                    }
                    else {
                        n = int2;
                        if ((n2 = int1) == 1) {
                            final byte[] liz = 1ea.LIZ();
                            final HashMap hashMap = new HashMap();
                            hashMap.put("number_corners", liz);
                            hashMap.put("number", 1ea.LJII);
                            final Hya liz2 = this.LIZ;
                            final HashMap hashMap2 = new HashMap();
                            hashMap2.put("code", int1);
                            hashMap2.put("detail_code", int2);
                            hashMap2.put("message", string);
                            hashMap2.put("data", hashMap);
                            liz2.LIZ((Map)hashMap2);
                            return false;
                        }
                    }
                    0U7.LIZ(n2, n, string, this.LIZ);
                    return false;
                }
                finally {
                    return false;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: invokespecial   X/1hx.LIZ:(LX/Pka;LX/Hya;LX/I0l;)V
        //     7: aload_1        
        //     8: ldc             "merchant_user_id"
        //    10: invokestatic    X/0U7.LIZ:(LX/Pka;Ljava/lang/String;)Ljava/lang/String;
        //    13: astore_3       
        //    14: aload_1        
        //    15: ldc             "nonce"
        //    17: invokestatic    X/0U7.LIZ:(LX/Pka;Ljava/lang/String;)Ljava/lang/String;
        //    20: astore          4
        //    22: aload_1        
        //    23: ldc             "merchant_id"
        //    25: invokestatic    X/0U7.LIZ:(LX/Pka;Ljava/lang/String;)Ljava/lang/String;
        //    28: astore_1       
        //    29: aload_1        
        //    30: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    33: ifeq            46
        //    36: iconst_0       
        //    37: bipush          101
        //    39: ldc             "merchantId is empty!"
        //    41: aload_2        
        //    42: invokestatic    X/0U7.LIZ:(IILjava/lang/String;LX/Hya;)V
        //    45: return         
        //    46: aload_3        
        //    47: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    50: ifeq            63
        //    53: iconst_0       
        //    54: bipush          101
        //    56: ldc             "merchantUserId is empty!"
        //    58: aload_2        
        //    59: invokestatic    X/0U7.LIZ:(IILjava/lang/String;LX/Hya;)V
        //    62: return         
        //    63: aload           4
        //    65: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    68: ifeq            81
        //    71: iconst_0       
        //    72: bipush          101
        //    74: ldc             "nonce is empty!"
        //    76: aload_2        
        //    77: invokestatic    X/0U7.LIZ:(IILjava/lang/String;LX/Hya;)V
        //    80: return         
        //    81: getstatic       X/1EK.LIZ:LX/1EK;
        //    84: invokevirtual   X/1EK.LIZLLL:()LX/0U1;
        //    87: aload           4
        //    89: putfield        X/0U1.LJIILL:Ljava/lang/String;
        //    92: new             Landroid/os/Handler;
        //    95: dup            
        //    96: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    99: new             LX/0Tt;
        //   102: dup            
        //   103: aload_0        
        //   104: aload_2        
        //   105: invokespecial   X/0Tt.<init>:(LX/1ql;LX/Hya;)V
        //   108: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
        //   111: astore_2       
        //   112: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   115: pop            
        //   116: getstatic       X/1EK.LIZ:LX/1EK;
        //   119: invokevirtual   X/1EK.LJIIJ:()LX/1Eb;
        //   122: aload_1        
        //   123: aload_3        
        //   124: aload           4
        //   126: new             LX/1ED;
        //   129: dup            
        //   130: aload_0        
        //   131: aload_2        
        //   132: invokespecial   X/1ED.<init>:(LX/1ql;Landroid/os/Handler;)V
        //   135: invokeinterface X/1Eb.LIZ:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/0Tw;)V
        //   140: return         
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
    
    public final Psw LIZJ() {
        return Psw.PUBLIC;
    }
}
