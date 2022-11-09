// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.IBinder;
import android.content.ComponentName;
import com.bytedance.covode.number.Covode;
import android.content.ServiceConnection;

public abstract class 04q implements ServiceConnection
{
    static {
        Covode.recordClassIndex(569);
    }
    
    public abstract void LIZ(final ComponentName p0, final 04n p1);
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        public final class 13g extends 04n
        {
            static {
                Covode.recordClassIndex(570);
            }
            
            public 13g(final 012 012, final ComponentName componentName) {
                super(012, componentName);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       21
        //     4: aconst_null    
        //     5: astore_2       
        //     6: aload_0        
        //     7: aload_1        
        //     8: new             LX/13g;
        //    11: dup            
        //    12: aload_2        
        //    13: aload_1        
        //    14: invokespecial   X/13g.<init>:(LX/012;Landroid/content/ComponentName;)V
        //    17: invokevirtual   X/04q.LIZ:(Landroid/content/ComponentName;LX/04n;)V
        //    20: return         
        //    21: aload_2        
        //    22: ldc             "android.support.customtabs.ICustomTabsService"
        //    24: invokeinterface android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
        //    29: astore_3       
        //    30: aload_3        
        //    31: ifnull          49
        //    34: aload_3        
        //    35: instanceof      LX/012;
        //    38: ifeq            49
        //    41: aload_3        
        //    42: checkcast       LX/012;
        //    45: astore_2       
        //    46: goto            6
        //    49: new             LX/11z;
        //    52: dup            
        //    53: aload_2        
        //    54: invokespecial   X/11z.<init>:(Landroid/os/IBinder;)V
        //    57: astore_2       
        //    58: goto            6
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
