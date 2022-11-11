// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;
import android.view.View;
import kotlin.jvm.internal.n;
import com.facebook.fresco.animation.c.a;
import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;

public final class 0r4
{
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public final 1si LIZLLL;
    
    static {
        Covode.recordClassIndex(8515);
    }
    
    public 0r4(final 1si lizlll) {
        this.LIZLLL = lizlll;
        this.LIZJ = "ttlive_sound_wavee_anim_low.webp";
    }
    
    public final void LIZ(final String s) {
        public final class 1lj extends SDW<ByQ>
        {
            public final /* synthetic */ 0r4 LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(8516);
            }
            
            public 1lj(final 0r4 liz, final String liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: aload_1        
        //     3: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //     6: ifeq            15
        //     9: aload_0        
        //    10: iconst_1       
        //    11: putfield        X/0r4.LIZ:Z
        //    14: return         
        //    15: aload_0        
        //    16: getfield        X/0r4.LIZLLL:LX/1si;
        //    19: invokestatic    X/GTi.LIZIZ:(Landroid/view/View;)V
        //    22: invokestatic    X/SBH.LIZIZ:()LX/SAp;
        //    25: astore_2       
        //    26: aload_0        
        //    27: getfield        X/0r4.LIZLLL:LX/1si;
        //    30: astore_3       
        //    31: aload_3        
        //    32: ifnull          100
        //    35: aload_3        
        //    36: invokevirtual   X/SEd.getController:()LX/SDe;
        //    39: astore_3       
        //    40: aload_2        
        //    41: aload_3        
        //    42: invokevirtual   X/SDU.LIZ:(LX/SDe;)LX/SDU;
        //    45: pop            
        //    46: aload_2        
        //    47: getstatic       X/2Bo.LIZLLL:LX/0dY;
        //    50: ldc             "tiktok_live_interaction_resource"
        //    52: aload_1        
        //    53: invokevirtual   X/0dY.LIZIZ:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    56: invokevirtual   X/SAp.LIZ:(Ljava/lang/String;)LX/SAp;
        //    59: pop            
        //    60: aload_2        
        //    61: new             LX/1lj;
        //    64: dup            
        //    65: aload_0        
        //    66: aload_1        
        //    67: invokespecial   X/1lj.<init>:(LX/0r4;Ljava/lang/String;)V
        //    70: invokevirtual   X/SDU.LIZ:(LX/KFw;)LX/SDU;
        //    73: pop            
        //    74: aload_2        
        //    75: iconst_1       
        //    76: invokevirtual   X/SDU.LIZJ:(Z)LX/SDU;
        //    79: pop            
        //    80: aload_2        
        //    81: invokevirtual   X/SDU.LIZJ:()LX/SDT;
        //    84: astore_1       
        //    85: aload_0        
        //    86: getfield        X/0r4.LIZLLL:LX/1si;
        //    89: astore_3       
        //    90: aload_3        
        //    91: ifnull          99
        //    94: aload_3        
        //    95: aload_1        
        //    96: invokevirtual   X/SEd.setController:(LX/SDe;)V
        //    99: return         
        //   100: aconst_null    
        //   101: astore_3       
        //   102: goto            40
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
    
    public final boolean LIZ(final int n) {
        this.LIZ = false;
        this.LIZIZ = false;
        final SpeakingVoiceConfig value = LiveMicVoiceSetting.INSTANCE.getValue();
        String lizj;
        if (n <= 20) {
            lizj = "";
        }
        else if (n > 20 && n <= value.getLow()) {
            lizj = "ttlive_sound_wavee_anim_low.webp";
        }
        else if (n > value.getLow() && n <= value.getHigh()) {
            lizj = "ttlive_sound_wavee_anim_medium.webp";
        }
        else {
            lizj = "ttlive_sound_wavee_anim_high.webp";
        }
        this.LIZJ = lizj;
        final 1si lizlll = this.LIZLLL;
        while (true) {
            Label_0112: {
                if (lizlll == null) {
                    break Label_0112;
                }
                final SDe controller = ((SEd)lizlll).getController();
                if (controller == null) {
                    break Label_0112;
                }
                final Animatable ljiiiz = controller.LJIIIZ();
                if (ljiiiz == null) {
                    break Label_0112;
                }
                final Boolean value2 = ljiiiz.isRunning();
                boolean b;
                if (GTi.LIZ(value2)) {
                    b = n.LIZ((Object)this.LIZJ, (Object)"");
                }
                else {
                    this.LIZ(this.LIZJ);
                    b = n.LIZ((Object)this.LIZJ, (Object)"");
                }
                return b ^ true;
            }
            final Boolean value2 = null;
            continue;
        }
    }
}
