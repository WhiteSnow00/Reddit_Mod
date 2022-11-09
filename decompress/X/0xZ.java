// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSequentialEventReportSetting;
import kotlin.n.y;
import java.util.Map;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0xz
{
    public final String LIZ;
    public final 5DO LIZIZ;
    
    static {
        Covode.recordClassIndex(10343);
    }
    
    public 0xz(final String liz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/0xz.LIZ:Ljava/lang/String;
        //    13: aload_0        
        //    14: new             LX/29N;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   X/29N.<init>:(LX/0xz;)V
        //    22: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    25: putfield        X/0xz.LIZIZ:LX/5DO;
        //    28: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    private final I5Z LIZ() {
        return (I5Z)this.LIZIZ.getValue();
    }
    
    public final 0xz LIZ(final String s, final String s2, final JSONObject jsonObject, final Map<String, ?> map) {
        CTM.LIZ((Object)s2);
        if (s != null && !y.LIZ((CharSequence)s)) {
            if (LinkmicSequentialEventReportSetting.INSTANCE.getValue().LIZ) {
                I5Z.LIZ(this.LIZ(), s, s2, jsonObject, (Map)map, (String)null, (String)null, 0L, 0L, 240);
            }
        }
        return this;
    }
    
    public final 0xz LIZ(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        if (LinkmicSequentialEventReportSetting.INSTANCE.getValue().LIZ) {
            I5Z.LIZ(this.LIZ(), (Object)jsonObject);
        }
        return this;
    }
    
    public final void LIZ(final String s, final int n) {
        CTM.LIZ((Object)s);
        if (LinkmicSequentialEventReportSetting.INSTANCE.getValue().LIZ) {
            I5Z.LIZ(this.LIZ(), s, n, (JSONObject)null, (String)null, (String)null, 28);
        }
    }
}
