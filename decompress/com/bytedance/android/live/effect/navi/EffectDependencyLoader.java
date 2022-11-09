// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.navi;

import X.0CH;
import X.0CC;
import X.0Bg;
import java.util.ArrayList;
import X.0cf;
import java.util.Iterator;
import X.0ba;
import kotlin.jvm.internal.n;
import X.Qsi;
import X.0CG;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0gc;
import androidx.fragment.app.Fragment;
import X.1La;
import java.util.List;
import java.util.Map;
import java.util.Set;
import X.6mZ;
import X.GfS;

public final class EffectDependencyLoader implements GfS, 6mZ
{
    public final Set<String> LIZ;
    public final Map<String, List<1La>> LIZIZ;
    public boolean LIZJ;
    public final Fragment LIZLLL;
    public final 0gc LJ;
    
    static {
        Covode.recordClassIndex(6482);
    }
    
    public EffectDependencyLoader(final Fragment lizlll, final 0gc lj) {
        CTM.LIZ((Object)lizlll, (Object)lj);
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZ = new LinkedHashSet<String>();
        this.LIZIZ = new LinkedHashMap<String, List<1La>>();
        lizlll.getLifecycle().LIZ((0CG)this);
        lj.LIZ((GfS)this);
    }
    
    public final void LIZ() {
        this.LIZJ = true;
        this.LJ.LIZIZ((GfS)this);
        this.LIZIZ.clear();
        this.LIZ.clear();
    }
    
    public final void LIZ(final int n, final int n2, final int n3, final String s) {
        public final class 0hh implements Runnable
        {
            public final /* synthetic */ EffectDependencyLoader LIZ;
            public final /* synthetic */ String LIZIZ;
            
            static {
                Covode.recordClassIndex(6483);
            }
            
            public 0hh(final EffectDependencyLoader liz, final String liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                this.LIZ.LIZ.add(this.LIZIZ);
                if (this.LIZ.LIZIZ.containsKey(this.LIZIZ)) {
                    final List list = this.LIZ.LIZIZ.get(this.LIZIZ);
                    if (list != null && !list.isEmpty()) {
                        for (final 1La 1La : list) {
                            this.LIZ.LIZ(1La.LIZ, 1La.LIZIZ, 1La.LIZJ, 1La.LIZLLL);
                        }
                    }
                    this.LIZ.LIZIZ.remove(this.LIZIZ);
                }
                final String s = (String)Qsi.LJ((Iterable)this.LIZ.LIZ);
                if (s != null && this.LIZ.LIZIZ.isEmpty() && (n.LIZ((Object)this.LIZIZ, (Object)s) ^ true)) {
                    0ba.LIZ(4, "LiveNaviAvatar", "send the last effect message, arg3: ".concat(String.valueOf(s)));
                    this.LIZ.LIZ(66668, 1L, 1L, s);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: bipush          17
        //     3: if_icmpne       56
        //     6: iload_2        
        //     7: iconst_3       
        //     8: if_icmpne       56
        //    11: aload           4
        //    13: ifnull          56
        //    16: aload_0        
        //    17: getfield        com/bytedance/android/live/effect/navi/EffectDependencyLoader.LIZJ:Z
        //    20: ifne            56
        //    23: iconst_4       
        //    24: ldc             "LiveNaviAvatar"
        //    26: ldc             "receive load success message, arg3: "
        //    28: aload           4
        //    30: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    33: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //    36: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    39: invokestatic    X/0cf.LIZ:()Landroid/os/Handler;
        //    42: new             LX/0hh;
        //    45: dup            
        //    46: aload_0        
        //    47: aload           4
        //    49: invokespecial   X/0hh.<init>:(Lcom/bytedance/android/live/effect/navi/EffectDependencyLoader;Ljava/lang/String;)V
        //    52: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    55: pop            
        //    56: return         
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
    
    public final void LIZ(final int n, final long n2, final long n3, final String s) {
        CTM.LIZ((Object)s);
        if (this.LIZJ) {
            return;
        }
        this.LJ.LIZ(n, n2, n3, s);
    }
    
    public final void LIZ(final int n, final long n2, final String s, final String s2) {
        CTM.LIZ((Object)s);
        if (this.LIZJ) {
            return;
        }
        if (s2 == null || this.LIZ.contains(s2)) {
            this.LIZ(n, n2, 0L, s);
            return;
        }
        if (!this.LIZIZ.containsKey(s2)) {
            this.LIZIZ.put(s2, new ArrayList<1La>());
        }
        final List list = this.LIZIZ.get(s2);
        if (list != null) {
            list.add(new 1La(n, n2, s));
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public final void onDestroy() {
        this.LIZ();
        this.LIZLLL.getLifecycle().LIZIZ((0CG)this);
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroy();
        }
    }
}
