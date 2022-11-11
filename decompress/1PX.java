// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.UUID;
import com.bytedance.covode.number.Covode;

public abstract class 1px<API_COMPONENT extends 0QI, SCENE extends 2Gw<STATE, ACTION>, STATE, ACTION> extends 1he<API_COMPONENT, STATE, ACTION>
{
    public int LIZ;
    public Class<?> LIZIZ;
    public 0Qb LIZJ;
    public final String LIZLLL;
    public final 5DO LJ;
    public final QgG<SCENE> LJFF;
    public final TSI LJI;
    
    static {
        Covode.recordClassIndex(4328);
        new SRK((5tI)FIV.LIZ.LIZ((Class)1px.class), "scene", "getScene()Lcom/bytedance/als/ui/UIScene;");
    }
    
    public 1px(final TSI lji) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   X/1he.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/1px.LJI:LX/TSI;
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: ldc             "UISlotComponent#"
        //    19: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    22: astore_1       
        //    23: aload_1        
        //    24: aload_0        
        //    25: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    28: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload_1        
        //    36: bipush          35
        //    38: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    41: pop            
        //    42: aload_1        
        //    43: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //    46: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    49: pop            
        //    50: aload_0        
        //    51: aload_1        
        //    52: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    55: putfield        X/1px.LIZLLL:Ljava/lang/String;
        //    58: aload_0        
        //    59: new             LX/1pv;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   X/1pv.<init>:(LX/1px;)V
        //    67: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    70: putfield        X/1px.LJ:LX/5DO;
        //    73: aload_0        
        //    74: new             LX/1pw;
        //    77: dup            
        //    78: aload_0        
        //    79: invokespecial   X/1pw.<init>:(LX/1px;)V
        //    82: putfield        X/1px.LJFF:LX/QgG;
        //    85: return         
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
    
    private final SCENE LJI() {
        return (SCENE)this.LJ.getValue();
    }
    
    public final void LIZ(final 0Qb lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    public final void LIZ(final Class<?> liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
    
    public QgG<SCENE> bx_() {
        return this.LJFF;
    }
    
    public void dJ_() {
        if (!this.LJI.LJFF(this.LJI())) {
            this.LJI.LIZ(this.LIZ, this.LJI(), this.LIZLLL);
            this.LJI().LIZJ();
            return;
        }
        if (!this.LJI.LJI(this.LJI())) {
            this.LJI.LJ(this.LJI());
            this.LJI().LIZJ();
        }
    }
    
    public void dK_() {
        if (!this.LJI.LJFF(this.LJI())) {
            return;
        }
        if (this.LJI.LJI(this.LJI())) {
            this.LJI();
        }
        this.LJI.LIZLLL(this.LJI());
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        final TS5 j_ = this.LJI.j_(this.LIZLLL);
        if (j_ != null) {
            this.LJI.LIZJ(j_);
        }
        final 0Qb lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        if (lizj == 0Qb.SHOW) {
            this.dJ_();
        }
    }
}
