// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.TimerTask;
import java.util.Timer;
import java.util.Map;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

public final class 0Pt
{
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static AtomicBoolean LIZJ;
    public static Application LIZLLL;
    public static volatile int LJ;
    public static volatile 0Pq LJFF;
    public static final 0Pt LJI;
    public static volatile 0Q0 LJII;
    
    static {
        Covode.recordClassIndex(4212);
        LJI = new 0Pt();
        0Pt.LIZ = true;
        0Pt.LIZJ = new AtomicBoolean(false);
        0Pt.LJFF = 0Pq.Unknown;
        0Pt.LJII = 0Q0.Uninit;
    }
    
    public static Intent LIZ(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, ReceiverRegisterLancet.sReceiverHandler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        catch (final Exception ex) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw ex;
        }
    }
    
    public final 0Pq LIZ() {
        if (0Pt.LIZIZ) {
            return 0Pt.LJFF;
        }
        if (!0Pv.LIZLLL) {
            return 0Pq.Unknown;
        }
        final 0Pn liz = 0Pv.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        return liz.LJ();
    }
    
    public final void LIZ(final 0Q0 ljii) {
        CTM.LIZ((Object)ljii);
        final 0Q0 ljii2 = 0Pt.LJII;
        0Pt.LJII = ljii;
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("net_type", ljii.getType());
        jsonObject.put("old_net_type", ljii2.getType());
        this.LIZ(new 1DG(0Pp.NetChange, jsonObject, 0L, 4));
    }
    
    public final void LIZ(final 1DG 1dg) {
        public final class 1pN extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 1DG LIZ;
            
            static {
                Covode.recordClassIndex(4213);
            }
            
            public 1pN(final 1DG liz) {
                this.LIZ = liz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: new             LX/1pN;
        //     6: dup            
        //     7: aload_1        
        //     8: invokespecial   X/1pN.<init>:(LX/1DG;)V
        //    11: invokevirtual   X/0Pe.LIZIZ:(LX/QgG;)V
        //    14: return         
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
