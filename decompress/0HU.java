// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;
import kotlin.n.y;
import android.view.View;
import java.util.Iterator;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import java.util.List;
import java.util.Map;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment;

public final class 0hu
{
    public LiveSmallSubItemBeautyFragment LIZ;
    public String LIZIZ;
    public LiveEffect LIZJ;
    public final Map<String, LiveEffect> LIZLLL;
    public final List<String> LJ;
    public final List<1Km<LiveEffect>> LJFF;
    public final LiveSmallItemBeautyViewModel LJI;
    public final Fragment LJII;
    public final 1jI LJIIIIZZ;
    public final SRo LJIIIZ;
    public final ImageView LJIIJ;
    public final String LJIIJJI;
    public final int LJIIL;
    public final 1JQ LJIILIIL;
    public final Integer LJIILJJIL;
    public final DataChannel LJIILL;
    public final TextView LJIILLIIL;
    
    static {
        Covode.recordClassIndex(6573);
    }
    
    public 0hu(final LiveSmallItemBeautyViewModel lji, final DataChannel ljiill, final Fragment ljii, final 1jI ljiiiizz, final SRo ljiiiz, final ImageView ljiij, final TextView ljiilliil, final String ljiijji, final 1JQ ljiiliil, final Integer ljiiljjil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload           5
        //     3: aload           6
        //     5: aload           7
        //     7: aload           8
        //     9: aload           9
        //    11: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    14: aload_0        
        //    15: invokespecial   java/lang/Object.<init>:()V
        //    18: aload_0        
        //    19: aload_1        
        //    20: putfield        X/0hu.LJI:Lcom/bytedance/android/live/effect/smallitem/LiveSmallItemBeautyViewModel;
        //    23: aload_0        
        //    24: aload_2        
        //    25: putfield        X/0hu.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    28: aload_0        
        //    29: aload_3        
        //    30: putfield        X/0hu.LJII:Landroidx/fragment/app/Fragment;
        //    33: aload_0        
        //    34: aload           4
        //    36: putfield        X/0hu.LJIIIIZZ:LX/1jI;
        //    39: aload_0        
        //    40: aload           5
        //    42: putfield        X/0hu.LJIIIZ:LX/SRo;
        //    45: aload_0        
        //    46: aload           6
        //    48: putfield        X/0hu.LJIIJ:Landroid/widget/ImageView;
        //    51: aload_0        
        //    52: aload           7
        //    54: putfield        X/0hu.LJIILLIIL:Landroid/widget/TextView;
        //    57: aload_0        
        //    58: aload           8
        //    60: putfield        X/0hu.LJIIJJI:Ljava/lang/String;
        //    63: aload_0        
        //    64: ldc             2131371853
        //    66: putfield        X/0hu.LJIIL:I
        //    69: aload_0        
        //    70: aload           9
        //    72: putfield        X/0hu.LJIILIIL:LX/1JQ;
        //    75: aload_0        
        //    76: aload           10
        //    78: putfield        X/0hu.LJIILJJIL:Ljava/lang/Integer;
        //    81: aload_0        
        //    82: new             Ljava/util/LinkedHashMap;
        //    85: dup            
        //    86: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    89: putfield        X/0hu.LIZLLL:Ljava/util/Map;
        //    92: aload_0        
        //    93: new             Ljava/util/ArrayList;
        //    96: dup            
        //    97: invokespecial   java/util/ArrayList.<init>:()V
        //   100: putfield        X/0hu.LJ:Ljava/util/List;
        //   103: aload_0        
        //   104: new             Ljava/util/ArrayList;
        //   107: dup            
        //   108: invokespecial   java/util/ArrayList.<init>:()V
        //   111: putfield        X/0hu.LJFF:Ljava/util/List;
        //   114: aload_2        
        //   115: ifnull          134
        //   118: aload_2        
        //   119: aload_3        
        //   120: ldc             LX/2CF;.class
        //   122: new             LX/1ti;
        //   125: dup            
        //   126: aload_0        
        //   127: invokespecial   X/1ti.<init>:(LX/0hu;)V
        //   130: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   133: pop            
        //   134: aload_3        
        //   135: invokestatic    X/0CI.LIZ:(LX/0CH;)LX/15r;
        //   138: aconst_null    
        //   139: new             LX/2CM;
        //   142: dup            
        //   143: aload_0        
        //   144: aconst_null    
        //   145: invokespecial   X/2CM.<init>:(LX/0hu;LX/Cye;)V
        //   148: iconst_3       
        //   149: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //   152: pop            
        //   153: return         
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
    
    private void LIZ(final LiveEffect liveEffect, final int n) {
        if (liveEffect == null) {
            return;
        }
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        final String s = "";
        n.LIZIZ((Object)liz, "");
        if (!((IHostContext)liz).isLocalTest()) {
            return;
        }
        final Iterator iterator = liveEffect.composerConfigList.iterator();
        String string = s;
        while (iterator.hasNext()) {
            final Gaz gaz = (Gaz)iterator.next();
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append("name: ");
            sb.append(gaz.LIZJ);
            sb.append('\n');
            sb.append("lokiMax: ");
            sb.append(gaz.LIZLLL);
            sb.append('\n');
            sb.append("lokiMin: ");
            sb.append(gaz.LJ);
            sb.append('\n');
            sb.append("lokiDefault: ");
            sb.append(gaz.LIZIZ);
            sb.append('\n');
            sb.append("uiMax:");
            sb.append(gaz.LJIIIIZZ);
            sb.append('\n');
            sb.append("uiMin: ");
            sb.append(gaz.LJIIIZ);
            sb.append('\n');
            sb.append("uiDefault: ");
            sb.append(gaz.LJII);
            sb.append('\n');
            sb.append("currentUIValue: ");
            sb.append(n);
            sb.append('\n');
            sb.append("currentEffectValue: ");
            sb.append(0g3.LIZ(gaz, n));
            sb.append('\n');
            string = sb.toString();
        }
        this.LJIILLIIL.setText((CharSequence)string);
    }
    
    private final float LIZIZ(final LiveEffect liveEffect) {
        final 1JQ ljiiliil = this.LJIILIIL;
        final String resourceId = liveEffect.getResourceId();
        final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
        String lizj;
        if (smallItemConfig == null || (lizj = smallItemConfig.LIZJ) == null) {
            lizj = "";
        }
        Float n;
        if ((n = ljiiliil.LIZIZ(resourceId, lizj)) == null) {
            final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
            Integer n2 = null;
            Label_0098: {
                if (smallItemConfig2 != null) {
                    final Integer value = smallItemConfig2.LJII;
                    if ((n2 = value) != null) {
                        break Label_0098;
                    }
                    n2 = value;
                }
                else {
                    n2 = null;
                }
                kotlin.jvm.internal.n.LIZIZ();
            }
            n = 0g3.LIZ(liveEffect, n2);
        }
        return n;
    }
    
    private final void LIZJ(final LiveEffect liveEffect) {
        this.LJIIIZ.setPercent(0g3.LIZ(liveEffect, this.LIZIZ(liveEffect)));
        final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
        if (smallItemConfig != null && smallItemConfig.LJFF) {
            final SRo ljiiiz = this.LJIIIZ;
            final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
            int ljii;
            if (smallItemConfig2 != null) {
                ljii = smallItemConfig2.LJII;
            }
            else {
                ljii = 0;
            }
            ljiiiz.LIZ(50, -50, ljii, false);
            return;
        }
        final SRo ljiiiz2 = this.LJIIIZ;
        final Gaz smallItemConfig3 = liveEffect.getSmallItemConfig();
        int ljii2;
        if (smallItemConfig3 != null) {
            ljii2 = smallItemConfig3.LJII;
        }
        else {
            ljii2 = 0;
        }
        ljiiiz2.LIZ(100, 0, ljii2, true);
    }
    
    public final LiveEffect LIZ() {
        while (true) {
            for (final 1Km next : this.LJFF) {
                if (n.LIZ((Object)next.LIZ, (Object)this.LIZIZ)) {
                    final 1Km 1Km = next;
                    if (1Km != null) {
                        final List<T> liziz = 1Km.LIZIZ;
                        if (liziz != null) {
                            return (LiveEffect)Qsi.LIZIZ((List)liziz, 0iM.LIZ(this.LIZIZ, (List<? extends LiveEffect>)liziz, this.LJIILIIL, this.LJIIJJI));
                        }
                    }
                    return null;
                }
            }
            1Km next = null;
            continue;
        }
    }
    
    public final void LIZ(final int n) {
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        if (GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
            final 44V lllj2 = GST.LLLJ;
            n.LIZIZ((Object)lllj2, "");
            ((44T)lllj2).LIZ((Object)true);
        }
        this.LIZ(this.LIZJ, n);
        final LiveEffect lizj = this.LIZJ;
        if (lizj != null) {
            this.LJIILIIL.LIZ(this.LJIIJJI, lizj, n);
        }
    }
    
    public final void LIZ(final LiveEffect liveEffect) {
        LiveEffect liziz;
        if (liveEffect == null || (liziz = 0iM.LIZIZ(liveEffect, this.LJIILIIL, this.LJIIJJI)) == null) {
            liziz = liveEffect;
        }
        this.LIZJ = liziz;
        final 44V ljjii = GST.LJJII;
        n.LIZIZ((Object)ljjii, "");
        ((44T)ljjii).LIZ((Object)0iM.LJ(this.LIZJ));
        Boolean value;
        if (liveEffect != null) {
            value = liveEffect.isSubItem();
        }
        else {
            value = null;
        }
        if (GTi.LIZIZ(value)) {
            this.LIZLLL.put(this.LIZIZ, liveEffect);
        }
    }
    
    public final void LIZ(final LiveEffect liveEffect, final boolean b) {
        if (liveEffect == null || liveEffect.getSmallItemConfig() == null) {
            GTi.LIZ((View)this.LJIIIZ);
            if (!0iM.LJ(liveEffect)) {
                return;
            }
        }
        if (!0iM.LJ(liveEffect) && liveEffect != null) {
            GTi.LIZIZ((View)this.LJIIIZ);
            this.LIZJ(liveEffect);
            this.LIZ(liveEffect, 0g3.LIZ(liveEffect, this.LIZIZ(liveEffect)));
        }
        if (b) {
            this.LJIILIIL.LIZ(this.LJIIJJI, liveEffect);
        }
    }
    
    public final void LIZ(final boolean b) {
        final LiveEffect lizj = this.LIZJ;
        if (lizj != null) {
            final String effectPanelKey = lizj.effectPanelKey;
            if (effectPanelKey != null && y.LIZIZ(effectPanelKey, "beauty", false)) {
                final 1jI ljiiiizz = this.LJIIIIZZ;
                final LiveSmallItemBeautyFragment liveSmallItemBeautyFragment = null;
                Fragment lizj2;
                if (ljiiiizz != null) {
                    lizj2 = ljiiiizz.LIZJ;
                }
                else {
                    lizj2 = null;
                }
                if (!(lizj2 instanceof LiveSmallItemBeautyFragment)) {
                    lizj2 = liveSmallItemBeautyFragment;
                }
                final LiveSmallItemBeautyFragment liveSmallItemBeautyFragment2 = (LiveSmallItemBeautyFragment)lizj2;
                if (b) {
                    if (liveSmallItemBeautyFragment2 != null) {
                        ((RecyclerView.a)liveSmallItemBeautyFragment2.LIZIZ).notifyDataSetChanged();
                    }
                    return;
                }
                if (liveSmallItemBeautyFragment2 != null) {
                    liveSmallItemBeautyFragment2.LIZ(this.LIZJ);
                }
            }
        }
    }
    
    public final void LIZIZ() {
        final List<LiveEffect> lj = this.LJIILIIL.LJ(this.LJIIJJI);
        final ArrayList list = new ArrayList();
        for (final LiveEffect next : lj) {
            if (n.LIZ((Object)next.effectPanelName, (Object)this.LIZIZ)) {
                list.add(next);
            }
        }
        final Iterator iterator2 = list.iterator();
        LiveSmallItemBeautyFragment liveSmallItemBeautyFragment;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            liveSmallItemBeautyFragment = null;
            Object resourceId = null;
            if (!hasNext) {
                break;
            }
            final LiveEffect liveEffect = (LiveEffect)iterator2.next();
            final 1JQ ljiiliil = this.LJIILIIL;
            final String ljiijji = this.LJIIJJI;
            final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
            final int n = 0;
            int ljii;
            if (smallItemConfig != null) {
                ljii = smallItemConfig.LJII;
            }
            else {
                ljii = 0;
            }
            ljiiliil.LIZ(ljiijji, liveEffect, ljii);
            if (liveEffect.isExclusive) {
                this.LJIILIIL.LIZJ(this.LJIIJJI, liveEffect);
            }
            final String resourceId2 = liveEffect.getResourceId();
            final LiveEffect lizj = this.LIZJ;
            if (lizj != null) {
                resourceId = lizj.getResourceId();
            }
            if (!kotlin.jvm.internal.n.LIZ((Object)resourceId2, resourceId)) {
                continue;
            }
            final SRo ljiiiz = this.LJIIIZ;
            final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
            int ljii2 = n;
            if (smallItemConfig2 != null) {
                ljii2 = smallItemConfig2.LJII;
            }
            ljiiiz.setPercent(ljii2);
        }
        this.LIZ(true);
        final 1jI ljiiiizz = this.LJIIIIZZ;
        Fragment lizj2;
        if (ljiiiizz != null) {
            lizj2 = ljiiiizz.LIZJ;
        }
        else {
            lizj2 = null;
        }
        if (!(lizj2 instanceof LiveSmallItemBeautyFragment)) {
            lizj2 = liveSmallItemBeautyFragment;
        }
        final LiveSmallItemBeautyFragment liveSmallItemBeautyFragment2 = (LiveSmallItemBeautyFragment)lizj2;
        if (liveSmallItemBeautyFragment2 != null) {
            liveSmallItemBeautyFragment2.LIZ();
        }
        if (!this.LIZLLL.values().contains(this.LIZJ)) {
            this.LIZJ = this.LIZLLL.get(this.LIZIZ);
        }
    }
}
