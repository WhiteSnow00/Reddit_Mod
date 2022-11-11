// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.google.gson.o;
import com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.Map;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.lang.ref.WeakReference;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.effect.model.FilterModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.google.gson.j;
import java.util.Iterator;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.RoomSticker;
import java.util.List;
import com.google.gson.m;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectManager;

public final class 1KZ implements 0gL
{
    public static EffectManager LIZ;
    public static final 1KZ LIZIZ;
    
    static {
        Covode.recordClassIndex(6368);
        LIZIZ = new 1KZ();
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        n.LIZIZ((Object)liz, "");
        final EffectManager effectManager = ((IHostContext)liz).getEffectManager();
        n.LIZIZ((Object)effectManager, "");
        1KZ.LIZ = effectManager;
    }
    
    private <T> void LIZ(final String s, final 0gL.a<T> a, final 0gL.d<T> d, final 0gL.c<T> c) {
        CTM.LIZ((Object)s, (Object)a, (Object)d, (Object)c);
        1KZ.LIZ.fetchEffectListFromCache(s, (IFetchEffectChannelListener)new e(s, (0gL.a<Object>)a, (0gL.d<Object>)d, (0gL.c<Object>)c));
    }
    
    public static boolean LIZIZ() {
        try {
            return 2Nf.LIZ.LIZIZ();
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final RoomSticker LIZ(final m m, final List<String> list, final long ljiil, final String ljiiiizz, final String s) {
        final RoomSticker roomSticker = new RoomSticker();
        ((Guu)roomSticker).LJIIL = ljiil;
        ((Guu)roomSticker).LJIIJJI = s;
        roomSticker.LJIIIIZZ = ljiiiizz;
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        String s2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s2 = null;
            String lizj = null;
            if (!hasNext) {
                break;
            }
            final String s3 = iterator.next();
            final StringBuilder sb = new StringBuilder();
            sb.append(s3);
            final j lizj2 = m.LIZJ("image_uri");
            if (lizj2 != null) {
                lizj = lizj2.LIZJ();
            }
            sb.append(lizj);
            list2.add(sb.toString());
        }
        ((Guu)roomSticker).LJIJI = 0cB.LIZJ();
        ((Guu)roomSticker).LJIJJ = 0cB.LIZIZ();
        final j lizj3 = m.LIZJ("image_uri");
        String lizj4 = s2;
        if (lizj3 != null) {
            lizj4 = lizj3.LIZJ();
        }
        roomSticker.LIZIZ = new ImageModel(lizj4, list2);
        ((Guu)roomSticker).LJIILIIL = 6;
        ((Guu)roomSticker).LJIIJJI = s;
        return roomSticker;
    }
    
    @Override
    public final void LIZ() {
        public final class 1KW implements ICheckChannelListener
        {
            static {
                Covode.recordClassIndex(6380);
            }
            
            public final void checkChannelFailed(final ExceptionResult exceptionResult) {
            }
            
            public final void checkChannelSuccess(final boolean b) {
                if (b) {
                    final 44V llllj = GST.LLLLJ;
                    n.LIZIZ((Object)llllj, "");
                    ((44T)llllj).LIZ((Object)true);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: pop            
        //     4: invokestatic    X/1KZ.LIZIZ:()Z
        //     7: ifeq            26
        //    10: getstatic       X/1KZ.LIZ:Lcom/ss/android/ugc/effectmanager/EffectManager;
        //    13: getstatic       X/0gZ.LJ:Ljava/lang/String;
        //    16: new             LX/1KW;
        //    19: dup            
        //    20: invokespecial   X/1KW.<init>:()V
        //    23: invokevirtual   com/ss/android/ugc/effectmanager/EffectManager.checkedEffectListUpdate:(Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/effect/listener/ICheckChannelListener;)V
        //    26: return         
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
    
    public final void LIZ(final 0gL.c<FilterModel> c) {
        CTM.LIZ((Object)c);
        final String ljiiiizz = 0gZ.LJIIIIZZ;
        n.LIZIZ((Object)ljiiiizz, "");
        this.LIZ(ljiiiizz, (0gL.a<Object>)new 1Jr(), (0gL.d<Object>)new 1Jt(), (0gL.c<Object>)c);
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel) {
        public final class 1KX implements 0gL.c<LiveEffect>
        {
            public final WeakReference<DataChannel> LIZ;
            
            static {
                Covode.recordClassIndex(6381);
            }
            
            public 1KX(final DataChannel dataChannel) {
                this.LIZ = new WeakReference<DataChannel>(dataChannel);
            }
            
            @Override
            public final void LIZ() {
            }
            
            @Override
            public final void LIZ(final List<1Km<LiveEffect>> list) {
                CTM.LIZ((Object)list);
                final LinkedHashSet set = new LinkedHashSet();
                for (final 1Km 1Km : list) {
                    set.addAll(1Km.LIZIZ);
                    set.addAll(1Km.LJFF);
                }
                final DataChannel dataChannel = this.LIZ.get();
                if (dataChannel != null) {
                    dataChannel.LIZIZ((Class)2Bu.class, (Object)set);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_2        
        //     5: ldc             ""
        //     7: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    10: aload_0        
        //    11: aload_2        
        //    12: new             LX/1MX;
        //    15: dup            
        //    16: invokespecial   X/1MX.<init>:()V
        //    19: new             LX/1MY;
        //    22: dup            
        //    23: invokespecial   X/1MY.<init>:()V
        //    26: new             LX/1KX;
        //    29: dup            
        //    30: aload_1        
        //    31: invokespecial   X/1KX.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    34: invokespecial   X/1KZ.LIZ:(Ljava/lang/String;LX/0gE;LX/0gH;LX/0gG;)V
        //    37: return         
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
    
    @Override
    public final void LIZ(final Effect effect, final 0gL.b b) {
        if (effect != null) {
            1KZ.LIZ.fetchEffect(effect, (IFetchEffectListener)new a(b));
        }
    }
    
    @Override
    public final void LIZ(final List<String> list, final IFetchEffectListListener fetchEffectListListener) {
        CTM.LIZ((Object)list, (Object)fetchEffectListListener);
        1KZ.LIZ.fetchEffectList((List)list, true, (Map)null, fetchEffectListListener);
    }
    
    @Override
    public final boolean LIZ(final LiveEffect liveEffect) {
        return 0iM.LJ(liveEffect) || (liveEffect != null && this.LIZ(liveEffect.getEffect()));
    }
    
    public final boolean LIZ(final Effect effect) {
        if (effect == null) {
            return false;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(1KZ.LIZ, effect);
        }
        return 1KZ.LIZ.isEffectDownloaded(effect);
    }
    
    public final void LIZIZ(final 0gL.c<LiveEffect> c) {
        CTM.LIZ((Object)c);
        final String liz = 0gZ.LIZ();
        n.LIZIZ((Object)liz, "");
        this.LIZ(liz, (0gL.a<Object>)new 1Jz(), (0gL.d<Object>)new 1K1(), (0gL.c<Object>)c);
    }
    
    @Override
    public final void LIZIZ(final DataChannel dataChannel) {
        final String lj = 0gZ.LJ;
        n.LIZIZ((Object)lj, "");
        this.LIZ(lj, (0gL.a<Object>)new 1Jl(), (0gL.d<Object>)new 1Jm(), (0gL.c<Object>)new c(dataChannel));
    }
    
    @Override
    public final void LIZJ(final DataChannel dataChannel) {
        public final class 1ix implements IRewardEffectsListener
        {
            public final WeakReference<DataChannel> LIZ;
            
            static {
                Covode.recordClassIndex(6384);
            }
            
            public 1ix(final DataChannel dataChannel) {
                this.LIZ = new WeakReference<DataChannel>(dataChannel);
            }
            
            public final void onFailed(final ExceptionResult exceptionResult) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           "livesticker"
        //     6: bipush          20
        //     8: iconst_0       
        //     9: aconst_null    
        //    10: new             LX/1ix;
        //    13: dup            
        //    14: aload_1        
        //    15: invokespecial   X/1ix.<init>:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    18: invokevirtual   com/ss/android/ugc/effectmanager/EffectManager.fetchRewardEffects:(Ljava/lang/String;IILjava/util/Map;Lcom/ss/android/ugc/effectmanager/effect/listener/IRewardEffectsListener;)V
        //    21: return         
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
    
    public final void LIZLLL(final DataChannel dataChannel) {
        this.LIZ("livesoundeffect", (0gL.a<Object>)new 1N6(), (0gL.d<Object>)new 1N7(), (0gL.c<Object>)new d(dataChannel));
    }
    
    @Override
    public final void LJ(final DataChannel dataChannel) {
        this.LIZ("livegame", (0gL.a<Object>)new 1JZ(), (0gL.d<Object>)new 1Jb(), (0gL.c<Object>)new b(dataChannel));
    }
    
    public static final class b implements 0gL.c<LiveEffect>
    {
        public final WeakReference<DataChannel> LIZ;
        
        static {
            Covode.recordClassIndex(6370);
        }
        
        public b(final DataChannel dataChannel) {
            this.LIZ = new WeakReference<DataChannel>(dataChannel);
        }
        
        @Override
        public final void LIZ() {
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZJ((Class)2C4.class);
            }
        }
        
        @Override
        public final void LIZ(final List<1Km<LiveEffect>> list) {
            CTM.LIZ((Object)list);
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZIZ((Class)2C5.class, (Object)list);
            }
        }
    }
    
    public static final class c implements 0gL.c<RoomSticker>
    {
        public final WeakReference<DataChannel> LIZ;
        
        static {
            Covode.recordClassIndex(6371);
        }
        
        public c(final DataChannel dataChannel) {
            this.LIZ = new WeakReference<DataChannel>(dataChannel);
        }
        
        @Override
        public final void LIZ() {
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZJ((Class)2Bw.class);
            }
        }
        
        @Override
        public final void LIZ(final List<1Km<RoomSticker>> list) {
            CTM.LIZ((Object)list);
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZIZ((Class)2Bv.class, (Object)list);
            }
        }
    }
    
    public static final class d implements 0gL.c<LiveEffect>
    {
        public final WeakReference<DataChannel> LIZ;
        
        static {
            Covode.recordClassIndex(6372);
        }
        
        public d(final DataChannel dataChannel) {
            this.LIZ = new WeakReference<DataChannel>(dataChannel);
        }
        
        @Override
        public final void LIZ() {
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZJ((Class)2Ch.class);
            }
        }
        
        @Override
        public final void LIZ(final List<1Km<LiveEffect>> list) {
            CTM.LIZ((Object)list);
            final DataChannel dataChannel = this.LIZ.get();
            if (dataChannel != null) {
                dataChannel.LIZIZ((Class)2Ci.class, (Object)list);
            }
        }
    }
    
    public static final class e<T> implements IFetchEffectChannelListener
    {
        public final String LIZ;
        public final 0gL.a<T> LIZIZ;
        public final 0gL.d<T> LIZJ;
        public final 0gL.c<T> LIZLLL;
        
        static {
            Covode.recordClassIndex(6373);
        }
        
        public e(final String liz, final 0gL.a<T> liziz, final 0gL.d<T> lizj, final 0gL.c<T> lizlll) {
            CTM.LIZ((Object)liz, (Object)liziz, (Object)lizj);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        
        public static boolean LIZ() {
            try {
                return 2Nf.LIZ.LIZIZ();
            }
            catch (final Exception ex) {
                return false;
            }
        }
        
        public final void onFail(final ExceptionResult exceptionResult) {
            final 0gX liz = 0gX.LIZ;
            liz.LIZIZ("LiveEffectDataProvider");
            liz.LIZ("fetch from cache fail");
            0cB.LJ();
            if (LIZ()) {
                final 0gX liz2 = 0gX.LIZ;
                liz2.LIZIZ("LiveEffectDataProvider");
                liz2.LIZ("try fetch from remote");
                1KZ.LIZ.fetchEffectList(this.LIZ, false, (IFetchEffectChannelListener)new f(this.LIZ, (0gL.a<Object>)this.LIZIZ, (0gL.d<Object>)this.LIZJ, (0gL.c<Object>)this.LIZLLL));
                return;
            }
            final 0gX liz3 = 0gX.LIZ;
            liz3.LIZIZ("LiveEffectDataProvider");
            liz3.LIZ("not network");
            final 0gL.c<T> lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ();
            }
        }
    }
    
    public static final class f<T> implements IFetchEffectChannelListener
    {
        public final String LIZ;
        public final 0gL.a<T> LIZIZ;
        public final 0gL.d<T> LIZJ;
        public final 0gL.c<T> LIZLLL;
        public final long LJ;
        
        static {
            Covode.recordClassIndex(6377);
        }
        
        public f(final String liz, final 0gL.a<T> liziz, final 0gL.d<T> lizj, final 0gL.c<T> lizlll) {
            CTM.LIZ((Object)liz, (Object)liziz, (Object)lizj);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = System.currentTimeMillis();
        }
        
        public final void LIZ(String s, final boolean b) {
            if (0gZ.LIZ().equals(s)) {
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_filter_panel_download");
                liz.LIZ();
                liz.LIZ("duration", System.currentTimeMillis() - this.LJ);
                if (b) {
                    s = "done";
                }
                else {
                    s = "failed";
                }
                liz.LIZ("status", s);
                liz.LIZLLL();
            }
        }
        
        public final void onFail(final ExceptionResult exceptionResult) {
            final 0gX liz = 0gX.LIZ;
            liz.LIZIZ("LiveEffectDataProvider");
            liz.LIZ("fetch from remote fail");
            this.LIZ(this.LIZ, false);
            final 0gL.c<T> lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZ();
            }
        }
    }
    
    public static final class a implements IEffectDownloadProgressListener
    {
        public final WeakReference<0gL.b> LIZ;
        
        static {
            Covode.recordClassIndex(6369);
        }
        
        public a(final 0gL.b b) {
            this.LIZ = new WeakReference<0gL.b>(b);
        }
        
        public final void onFail(final Effect effect, final ExceptionResult exceptionResult) {
            CTM.LIZ((Object)exceptionResult);
            final 0gL.b b = this.LIZ.get();
            if (b != null) {
                b.LIZJ(effect);
            }
        }
        
        public final void onProgress(final Effect effect, final int n, final long n2) {
            final 0gL.b b = this.LIZ.get();
            if (b != null) {
                b.LIZ(effect, n);
            }
        }
        
        public final void onStart(final Effect effect) {
            final 0gL.b b = this.LIZ.get();
            if (b != null) {
                b.LIZ(effect);
            }
        }
    }
}
