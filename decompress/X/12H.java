// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import android.app.Activity;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import android.content.Context;
import java.io.Serializable;
import android.content.IntentSender$SendIntentException;
import android.os.Bundle;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class 12H extends 01p
{
    public final /* synthetic */ 1fL LIZ;
    
    static {
        Covode.recordClassIndex(213);
    }
    
    public 12H(final 1fL liz) {
        this.LIZ = liz;
    }
    
    public static Bundle LIZ(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    @Override
    public final <I, O> void LIZ(final int n, final 01k<I, O> 01k, final I n2) {
        public final class 01h implements Runnable
        {
            public final /* synthetic */ int LIZ;
            public final /* synthetic */ IntentSender$SendIntentException LIZIZ;
            public final /* synthetic */ 12H LIZJ;
            
            static {
                Covode.recordClassIndex(214);
            }
            
            public 01h(final 12H lizj, final int liz, final IntentSender$SendIntentException liziz) {
                this.LIZJ = lizj;
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZJ.LIZ(this.LIZ, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)this.LIZIZ));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/12H.LIZ:LX/1fL;
        //     4: astore          4
        //     6: aload_2        
        //     7: aload           4
        //     9: aload_3        
        //    10: invokevirtual   X/01k.LIZ:(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
        //    13: astore_3       
        //    14: aload_3        
        //    15: invokestatic    X/12H.LIZ:(Landroid/content/Intent;)Landroid/os/Bundle;
        //    18: ifnull          40
        //    21: aload_3        
        //    22: invokestatic    X/12H.LIZ:(Landroid/content/Intent;)Landroid/os/Bundle;
        //    25: invokevirtual   android/os/Bundle.getClassLoader:()Ljava/lang/ClassLoader;
        //    28: ifnonnull       40
        //    31: aload_3        
        //    32: aload           4
        //    34: invokevirtual   X/1fL.getClassLoader:()Ljava/lang/ClassLoader;
        //    37: invokevirtual   android/content/Intent.setExtrasClassLoader:(Ljava/lang/ClassLoader;)V
        //    40: aload_3        
        //    41: ldc             "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
        //    43: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //    46: ifeq            123
        //    49: aload_3        
        //    50: ldc             "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
        //    52: invokevirtual   android/content/Intent.getBundleExtra:(Ljava/lang/String;)Landroid/os/Bundle;
        //    55: astore_2       
        //    56: invokestatic    com/bytedance/sysoptimizer/BadParcelableCrashOptimizer.getContext:()Landroid/content/Context;
        //    59: astore          5
        //    61: aload_2        
        //    62: ifnull          79
        //    65: aload           5
        //    67: ifnull          79
        //    70: aload_2        
        //    71: aload           5
        //    73: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //    76: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
        //    79: aload_3        
        //    80: ldc             "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
        //    82: invokevirtual   android/content/Intent.removeExtra:(Ljava/lang/String;)V
        //    85: ldc             "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"
        //    87: aload_3        
        //    88: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    91: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    94: ifeq            128
        //    97: aload_3        
        //    98: ldc             "androidx.activity.result.contract.extra.PERMISSIONS"
        //   100: invokevirtual   android/content/Intent.getStringArrayExtra:(Ljava/lang/String;)[Ljava/lang/String;
        //   103: astore_3       
        //   104: aload_3        
        //   105: astore_2       
        //   106: aload_3        
        //   107: ifnonnull       115
        //   110: iconst_0       
        //   111: anewarray       Ljava/lang/String;
        //   114: astore_2       
        //   115: aload           4
        //   117: aload_2        
        //   118: iload_1        
        //   119: invokestatic    X/144.LIZ:(Landroid/app/Activity;[Ljava/lang/String;I)V
        //   122: return         
        //   123: aconst_null    
        //   124: astore_2       
        //   125: goto            85
        //   128: ldc             "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
        //   130: aload_3        
        //   131: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   134: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   137: ifeq            201
        //   140: aload_3        
        //   141: ldc             "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
        //   143: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   146: checkcast       Landroidx/activity/result/IntentSenderRequest;
        //   149: astore_3       
        //   150: aload           4
        //   152: aload_3        
        //   153: getfield        androidx/activity/result/IntentSenderRequest.LIZ:Landroid/content/IntentSender;
        //   156: iload_1        
        //   157: aload_3        
        //   158: getfield        androidx/activity/result/IntentSenderRequest.LIZIZ:Landroid/content/Intent;
        //   161: aload_3        
        //   162: getfield        androidx/activity/result/IntentSenderRequest.LIZJ:I
        //   165: aload_3        
        //   166: getfield        androidx/activity/result/IntentSenderRequest.LIZLLL:I
        //   169: iconst_0       
        //   170: aload_2        
        //   171: invokestatic    X/144.LIZ:(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
        //   174: return         
        //   175: astore_2       
        //   176: new             Landroid/os/Handler;
        //   179: dup            
        //   180: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //   183: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //   186: new             LX/01h;
        //   189: dup            
        //   190: aload_0        
        //   191: iload_1        
        //   192: aload_2        
        //   193: invokespecial   X/01h.<init>:(LX/12H;ILandroid/content/IntentSender$SendIntentException;)V
        //   196: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   199: pop            
        //   200: return         
        //   201: aload           4
        //   203: aload_3        
        //   204: iload_1        
        //   205: aload_2        
        //   206: invokestatic    X/144.LIZ:(Landroid/app/Activity;Landroid/content/Intent;ILandroid/os/Bundle;)V
        //   209: return         
        //    Signature:
        //  <I:Ljava/lang/Object;O:Ljava/lang/Object;>(ILX/01k<TI;TO;>;TI;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                              
        //  -----  -----  -----  -----  --------------------------------------------------
        //  150    174    175    201    Landroid/content/IntentSender$SendIntentException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:482)
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
}
