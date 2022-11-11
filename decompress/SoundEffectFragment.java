// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.soundeffect;

import X.F0R;
import android.graphics.drawable.Drawable;
import X.1nL;
import X.F2r;
import X.F0v;
import X.2CV;
import X.1MA;
import X.0de;
import X.HAG;
import X.1tn;
import X.H2o;
import X.1MW;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import X.H2n;
import android.view.View$OnClickListener;
import X.0i6;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectSecondLevelPanelConfigSetting;
import X.0Bu;
import X.0Bv;
import X.1MV;
import X.0iE;
import X.0iC;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.Gh3;
import X.2X1;
import X.GOu;
import X.0gy;
import X.2CN;
import android.content.DialogInterface;
import X.0CH;
import X.0CI;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import androidx.fragment.app.Fragment;
import X.HAM;
import X.F0H;
import X.0i9;
import X.F1j;
import X.F1i;
import kotlin.d.b.a.a;
import X.CTM;
import X.2P9;
import X.Cye;
import X.BFk;
import X.SRT;
import X.F5e;
import android.view.View;
import X.0gz;
import X.FpL;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1jO;
import android.view.View$OnLayoutChangeListener;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class SoundEffectFragment extends LiveDialogFragment implements View$OnLayoutChangeListener
{
    public SoundEffectViewModel LIZ;
    public 1jO LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public HashMap LJ;
    
    static {
        Covode.recordClassIndex(6627);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561948);
        0gz.LIZ(fpL);
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJ == null) {
            this.LJ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJ.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap lj = this.LJ;
        if (lj != null) {
            lj.clear();
        }
    }
    
    public final void LIZLLL() {
        public final class 2CU extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
        {
            public int LIZ;
            public final /* synthetic */ SoundEffectFragment LIZIZ;
            public final /* synthetic */ long LIZJ;
            
            static {
                Covode.recordClassIndex(6628);
            }
            
            public 2CU(final SoundEffectFragment liziz, final long lizj, final Cye cye) {
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                super(2, cye);
            }
            
            public final Cye<2P9> create(final Object o, final Cye<?> cye) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
                //     4: new             LX/2CU;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/2CU.LIZIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectFragment;
                //    12: aload_0        
                //    13: getfield        X/2CU.LIZJ:J
                //    16: aload_2        
                //    17: invokespecial   X/2CU.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectFragment;JLX/Cye;)V
                //    20: areturn        
                //    Signature:
                //  (Ljava/lang/Object;LX/Cye<*>;)LX/Cye<LX/2P9;>;
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:756)
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
            
            public final Object invoke(final Object o, final Object o2) {
                return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
            }
            
            public final Object invokeSuspend(final Object o) {
                final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
                final int liz = this.LIZ;
                if (liz != 0) {
                    if (liz != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F1j.LIZ(o);
                }
                else {
                    F1j.LIZ(o);
                    final SoundEffectViewModel liz2 = this.LIZIZ.LIZ;
                    if (liz2 != null) {
                        final F0H<0i9> liz3 = liz2.LIZ;
                        if (liz3 != null) {
                            final 0i9.b b = new 0i9.b(this.LIZJ);
                            this.LIZ = 1;
                            if (((F0R)liz3).LIZ((Object)b, (Cye)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                    }
                }
                return 2P9.LIZ;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/HAM.LIZ:(Landroidx/fragment/app/Fragment;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          49
        //     9: aload_1        
        //    10: ldc             LX/G69;.class
        //    12: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    15: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnull          49
        //    23: aload_1        
        //    24: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    27: lstore_2       
        //    28: aload_0        
        //    29: invokestatic    X/0CI.LIZ:(LX/0CH;)LX/15r;
        //    32: aconst_null    
        //    33: new             LX/2CU;
        //    36: dup            
        //    37: aload_0        
        //    38: lload_2        
        //    39: aconst_null    
        //    40: invokespecial   X/2CU.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectFragment;JLX/Cye;)V
        //    43: iconst_3       
        //    44: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //    47: pop            
        //    48: return         
        //    49: lconst_0       
        //    50: lstore_2       
        //    51: goto            28
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
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        super.onDismiss(dialogInterface);
        this.LIZ(2131362661).removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        final DataChannel ljil = super.LJIL;
        if (ljil != null) {
            ljil.LIZJ((Class)2CN.class);
        }
        0gy.LIZ.LIZ(super.LJIL, false, this.LIZJ);
        final DataChannel ljil2 = super.LJIL;
        if (ljil2 != null) {
            ljil2.LIZIZ((Class)GOu.class, (Object)new Gh3(false, 0, ((Fragment)this).hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
    }
    
    public final void onLayoutChange(View view, int lizlll, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        lizlll = this.LIZLLL;
        view = this.LIZ(2131362661);
        n.LIZIZ((Object)view, "");
        if (lizlll != view.getHeight()) {
            view = this.LIZ(2131362661);
            n.LIZIZ((Object)view, "");
            this.LIZLLL = view.getHeight();
            final DataChannel ljil = super.LJIL;
            if (ljil != null) {
                ljil.LIZIZ((Class)GOu.class, (Object)new Gh3(true, this.LIZLLL, ((Fragment)this).hashCode(), 2X1.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        0gz.LIZ((DialogFragment)this);
    }
    
    public final void onViewCreated(View liz, final Bundle bundle) {
        CTM.LIZ((Object)liz);
        super.onViewCreated(liz, bundle);
        this.LIZJ = System.currentTimeMillis();
        final 1nL activity = ((Fragment)this).getActivity();
        if (activity != null) {
            this.LIZ = 0Bv.LIZ(activity, new 1MV(new 0iC(), new 0iE())).LIZ(SoundEffectViewModel.class);
        }
        liz = this.LIZ(2131362661);
        n.LIZIZ((Object)liz, "");
        final Drawable background = liz.getBackground();
        n.LIZIZ((Object)background, "");
        background.setAlpha((int)(LiveEffectSecondLevelPanelConfigSetting.INSTANCE.getValue().LIZ * 255.0f));
        this.LIZIZ = new 1jO(super.LJIL, false, (0CH)this, this.LIZ, 2131561956);
        this.LIZ(2131364399).setOnClickListener((View$OnClickListener)new 0i6(this));
        final H2n h2n = (H2n)this.LIZ(2131370703);
        h2n.getContext();
        ((RecyclerView)h2n).setLayoutManager((RecyclerView.i)new LinearLayoutManager(0, false));
        ((RecyclerView)h2n).LIZ((RecyclerView.h)new 1MW(18.0f, 18.0f, 12.0f));
        final 1jO liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        ((RecyclerView)h2n).setAdapter((RecyclerView.a)liziz);
        ((RecyclerView)h2n).setHasFixedSize(true);
        ((RecyclerView)h2n).setItemAnimator((RecyclerView.f)null);
        final RecyclerView.RecycledViewPool liz2 = h2n.LIZ(H2o.EFFECT_SOUND, true);
        if (liz2 != null) {
            liz2.setMaxRecycledViews(0, 7);
        }
        n.LIZIZ((Object)h2n, "");
        new HAG(0, (RecyclerView)h2n, (SRT)new 1tn(this)).LIZ();
        ((0de)this.LIZ(2131364759)).setErrorClickListener((0de.a)new 1MA(this));
        this.LIZ(2131362661).addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        F0v.LIZ((BFk)0CI.LIZ((0CH)this), (F2r)null, (SRT)new 2CV(this, null), 3);
        this.LIZLLL();
        0gy.LIZ.LIZ(super.LJIL, false);
    }
}
