// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Collection;
import java.util.List;
import kotlin.n.y;
import java.util.ArrayList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;

public final class 2CC extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LIZIZ;
    public final /* synthetic */ DataChannel LIZJ;
    public /* synthetic */ Object LIZLLL;
    
    static {
        Covode.recordClassIndex(6395);
    }
    
    public 2CC(final LiveSmallItemBeautyViewModel liziz, final DataChannel lizj, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object lizlll, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        final 2CC 2cc = new 2CC(this.LIZIZ, this.LIZJ, cye);
        2cc.LIZLLL = lizlll;
        return (Cye<2P9>)2cc;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        public final class 1Kc implements 8Z4<0hz>
        {
            public final /* synthetic */ 2CC LIZ;
            public final /* synthetic */ BFk LIZIZ;
            
            static {
                Covode.recordClassIndex(6396);
            }
            
            public 1Kc(final 2CC liz, final BFk liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final Object emit(Object o, final Cye cye) {
                final 0hz 0hz = (0hz)o;
                if (0hz instanceof 0hz.b) {
                    final 0gX liz = 0gX.LIZ;
                    liz.LIZIZ("LiveEffectRestoreManager");
                    liz.LIZ("beauty effect fetch success");
                    List<1Km<LiveEffect>> liz2;
                    final List<1Km<LiveEffect>> list = liz2 = ((0hz.b)0hz).LIZ;
                    if (LiveBeautyReverseExperiment.INSTANCE.isInV3()) {
                        final ArrayList list2 = new ArrayList();
                        for (final 1Km next : list) {
                            final 1Km 1Km = next;
                            if (GTi.LIZIZ(Boolean.valueOf(y.LIZIZ(1Km.LIZJ, "beauty", false))) && GTi.LIZIZ(Boolean.valueOf(y.LIZIZ(1Km.LIZJ, "makeup", false)))) {
                                list2.add(next);
                            }
                        }
                        liz2 = list2;
                    }
                    final ArrayList list3 = new ArrayList();
                    for (final 1Km 1Km2 : liz2) {
                        list3.addAll(1Km2.LIZIZ);
                        final Iterator<Object> iterator3 = 1Km2.LIZIZ.iterator();
                        while (iterator3.hasNext()) {
                            Object o2 = iterator3.next().subStickers;
                            if (o2 == null) {
                                o2 = 6uH.INSTANCE;
                            }
                            list3.addAll((Collection)o2);
                        }
                    }
                    final 1JQ liz3 = 0fx.LIZ.LIZ();
                    final String lizlll = 0gZ.LIZLLL;
                    n.LIZIZ((Object)lizlll, "");
                    liz3.LIZ(lizlll, list3);
                    final String lizlll2 = 0gZ.LIZLLL;
                    n.LIZIZ((Object)lizlll2, "");
                    final List<LiveEffect> lj = liz3.LJ(lizlll2);
                    if (lj.isEmpty()) {
                        final 1Km 1Km3 = (1Km)Qsi.LJIIJJI((List)liz2);
                        if (1Km3 != null) {
                            final List<T> liziz = 1Km3.LIZIZ;
                            if (liziz != null) {
                                final LiveEffect liveEffect = (LiveEffect)Qsi.LJIIJJI((List)liziz);
                                if (liveEffect != null) {
                                    liz3.LIZ(0gZ.LIZLLL, liveEffect);
                                }
                            }
                        }
                    }
                    final ArrayList list4 = new ArrayList();
                    final Iterator<1Km> iterator4 = liz2.iterator();
                    while (iterator4.hasNext()) {
                        Qsk.LIZ((Collection)list4, (Iterable)iterator4.next().LIZIZ);
                    }
                    final List list5 = list4;
                    o = new ArrayList();
                    for (final Object next2 : list5) {
                        if (lj.contains(next2) ^ true) {
                            ((Collection<Object>)o).add(next2);
                        }
                    }
                    final List list6 = (List)o;
                    o = new ArrayList();
                    for (final Object next3 : list6) {
                        final LiveEffect liveEffect2 = (LiveEffect)next3;
                        if (!0iM.LIZ(liveEffect2) && !liveEffect2.isNone() && !liveEffect2.isExclusive) {
                            ((Collection<LiveEffect>)o).add((LiveEffect)next3);
                        }
                    }
                    final List list7 = (List)o;
                    o = new ArrayList();
                    for (final Object next4 : list7) {
                        final Iterator iterator8 = ((LiveEffect)next4).composerConfigList.iterator();
                        boolean b = false;
                        while (iterator8.hasNext()) {
                            final Gaz gaz = (Gaz)iterator8.next();
                            gaz.LJI = gaz.LJII;
                            if (gaz.LIZIZ != 0) {
                                b = true;
                            }
                        }
                        if (b) {
                            ((Collection<LiveEffect>)o).add((LiveEffect)next4);
                        }
                    }
                    final Iterator iterator9 = ((List)o).iterator();
                    while (iterator9.hasNext()) {
                        liz3.LIZ(0gZ.LIZLLL, (LiveEffect)iterator9.next());
                        final 44V lllj = GST.LLLJ;
                        n.LIZIZ((Object)lllj, "");
                        if (GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
                            final 44V lllj2 = GST.LLLJ;
                            n.LIZIZ((Object)lllj2, "");
                            ((44T)lllj2).LIZ((Object)true);
                        }
                    }
                    1Jc.LJIIIZ.LIZ(false);
                    1Jc.LJIIIZ.LIZ();
                    if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                        1KD.LJFF.LIZ().LIZ(this.LIZ.LIZJ);
                    }
                    else {
                        1KJ.b.LIZ.LIZ(this.LIZ.LIZJ);
                    }
                    Enn.LIZ(this.LIZIZ, (CancellationException)null);
                }
                return 2P9.LIZ;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        X/2CC.LIZ:I
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifeq            26
        //    13: iload_3        
        //    14: iconst_1       
        //    15: if_icmpne       79
        //    18: aload_1        
        //    19: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    22: getstatic       X/2P9.LIZ:LX/2P9;
        //    25: areturn        
        //    26: aload_1        
        //    27: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    30: aload_0        
        //    31: getfield        X/2CC.LIZLLL:Ljava/lang/Object;
        //    34: checkcast       LX/BFk;
        //    37: astore          4
        //    39: aload_0        
        //    40: getfield        X/2CC.LIZIZ:Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;
        //    43: getfield        com/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel.LIZIZ:LX/EDN;
        //    46: astore_1       
        //    47: new             LX/1Kc;
        //    50: dup            
        //    51: aload_0        
        //    52: aload           4
        //    54: invokespecial   X/1Kc.<init>:(LX/2CC;LX/BFk;)V
        //    57: astore          4
        //    59: aload_0        
        //    60: iconst_1       
        //    61: putfield        X/2CC.LIZ:I
        //    64: aload_1        
        //    65: aload           4
        //    67: aload_0        
        //    68: invokeinterface X/8Z1.collect:(LX/8Z4;LX/Cye;)Ljava/lang/Object;
        //    73: aload_2        
        //    74: if_acmpne       22
        //    77: aload_2        
        //    78: areturn        
        //    79: new             Ljava/lang/IllegalStateException;
        //    82: dup            
        //    83: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    85: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    88: athrow         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:426)
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
