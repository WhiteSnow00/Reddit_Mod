// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.soundeffect;

import X.0iB;
import X.SRS;
import X.F5g;
import java.util.List;
import X.F1j;
import X.F1i;
import kotlin.d.b.a.a;
import X.2P9;
import X.BFk;
import X.F5e;
import X.0gn;
import X.608;
import X.4F0;
import com.bytedance.ies.abmock.SettingsManager;
import X.609;
import X.NIJ;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import X.SRT;
import X.F2r;
import X.F0v;
import X.Cye;
import X.2Cb;
import X.0Br;
import X.EzE;
import kotlin.jvm.internal.n;
import X.0jR;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import X.EzZ;
import X.F0a;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0iE;
import X.0iC;
import X.0iF;
import X.EDN;
import X.0Wj;
import X.0i9;
import X.F0H;
import X.0Bq;

public final class SoundEffectViewModel extends 0Bq
{
    public final F0H<0i9> LIZ;
    public 0Wj LIZIZ;
    public final EDN<0iF> LIZJ;
    public final 0iC LIZLLL;
    public final 0iE LJ;
    
    static {
        Covode.recordClassIndex(6641);
    }
    
    public SoundEffectViewModel(final 0iC lizlll, final 0iE lj) {
        CTM.LIZ((Object)lizlll, (Object)lj);
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZ = (F0H<0i9>)F0a.LIZ(Integer.MAX_VALUE, (EzZ)null, 6);
        final IBroadcastService liz = 0jR.LIZ(IBroadcastService.class);
        n.LIZIZ((Object)liz, "");
        this.LIZIZ = liz.getLiveStreamSoundPlayer();
        this.LIZJ = (EDN<0iF>)EzE.LIZ(0, 100, (EzZ)null, 4);
        final 0Wj liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ();
        }
        F0v.LIZ(0Br.LIZ(this), (F2r)null, (SRT)new 2Cb(this, null), 3);
    }
    
    public static boolean LIZ(final File file) {
        MethodCollector.i(3038);
        while (true) {
            try {
                609 liz;
                if (NIJ.LIZIZ()) {
                    liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
                }
                else {
                    liz = 4F0.LIZ;
                }
                if (608.LIZ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
                }
                if (608.LIZJ(file.getAbsolutePath(), liz)) {
                    608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                    MethodCollector.o(3038);
                    return false;
                }
                final boolean delete = file.delete();
                MethodCollector.o(3038);
                return delete;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void LIZ(final 0gn 0gn) {
        public final class 2Ce extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
        {
            public int LIZ;
            public final /* synthetic */ SoundEffectViewModel LIZIZ;
            public final /* synthetic */ 0gn LIZJ;
            
            static {
                Covode.recordClassIndex(6652);
            }
            
            public 2Ce(final SoundEffectViewModel liziz, final 0gn lizj, final Cye cye) {
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
                //     4: new             LX/2Ce;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/2Ce.LIZIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
                //    12: aload_0        
                //    13: getfield        X/2Ce.LIZJ:LX/0gn;
                //    16: aload_2        
                //    17: invokespecial   X/2Ce.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;LX/0gn;LX/Cye;)V
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
            
            public final Object invokeSuspend(Object o) {
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
                    final 0iC lizlll = this.LIZIZ.LIZLLL;
                    final boolean liz2 = n.LIZ((Object)this.LIZJ, (Object)lizlll.LIZ);
                    0gn liz3 = null;
                    if (liz2) {
                        liz3 = lizlll.LIZ;
                        lizlll.LIZ = null;
                    }
                    final 0Wj liziz = this.LIZIZ.LIZIZ;
                    if (liziz != null) {
                        liziz.LIZIZ();
                    }
                    if (liz3 != null) {
                        final EDN<0iF> lizj = this.LIZIZ.LIZJ;
                        o = new 0iF.g(liz3);
                        this.LIZ = 1;
                        if (lizj.emit(o, (Cye)this) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
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
        //     1: invokestatic    X/0Br.LIZ:(LX/0Bq;)LX/BFk;
        //     4: aconst_null    
        //     5: new             LX/2Ce;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_1        
        //    11: aconst_null    
        //    12: invokespecial   X/2Ce.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;LX/0gn;LX/Cye;)V
        //    15: iconst_3       
        //    16: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //    19: pop            
        //    20: return         
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
    
    public final void LIZ(final 0gn 0gn, final int n) {
        public final class 2Cc extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
        {
            public int LIZ;
            public final /* synthetic */ SoundEffectViewModel LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ 0gn LIZLLL;
            
            static {
                Covode.recordClassIndex(6649);
            }
            
            public 2Cc(final SoundEffectViewModel liziz, final int lizj, final 0gn lizlll, final Cye cye) {
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                super(2, cye);
            }
            
            public final Cye<2P9> create(final Object o, final Cye<?> cye) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
                //     4: new             LX/2Cc;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/2Cc.LIZIZ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
                //    12: aload_0        
                //    13: getfield        X/2Cc.LIZJ:I
                //    16: aload_0        
                //    17: getfield        X/2Cc.LIZLLL:LX/0gn;
                //    20: aload_2        
                //    21: invokespecial   X/2Cc.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;ILX/0gn;LX/Cye;)V
                //    24: areturn        
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
                    if (liz != 1 && liz != 2 && liz != 3 && liz != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    F1j.LIZ(o);
                }
                else {
                    F1j.LIZ(o);
                    final int lizj = this.LIZJ;
                    if (lizj != -3) {
                        if (lizj != -2) {
                            if (lizj != -1) {
                                final EDN<0iF> lizj2 = this.LIZIZ.LIZJ;
                                final 0iF.f f = new 0iF.f(this.LIZLLL, this.LIZJ);
                                this.LIZ = 4;
                                if (lizj2.emit((Object)f, (Cye)this) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                            }
                            else {
                                final EDN<0iF> lizj3 = this.LIZIZ.LIZJ;
                                final 0iF.d d = new 0iF.d(this.LIZLLL);
                                this.LIZ = 1;
                                if (lizj3.emit((Object)d, (Cye)this) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                            }
                        }
                        else {
                            final EDN<0iF> lizj4 = this.LIZIZ.LIZJ;
                            final 0iF.e e = new 0iF.e(this.LIZLLL);
                            this.LIZ = 2;
                            if (lizj4.emit((Object)e, (Cye)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                    }
                    else {
                        final EDN<0iF> lizj5 = this.LIZIZ.LIZJ;
                        final 0iF.c c = new 0iF.c(this.LIZLLL);
                        this.LIZ = 3;
                        if (lizj5.emit((Object)c, (Cye)this) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
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
        //     1: invokestatic    X/0Br.LIZ:(LX/0Bq;)LX/BFk;
        //     4: aconst_null    
        //     5: new             LX/2Cc;
        //     8: dup            
        //     9: aload_0        
        //    10: iload_2        
        //    11: aload_1        
        //    12: aconst_null    
        //    13: invokespecial   X/2Cc.<init>:(Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;ILX/0gn;LX/Cye;)V
        //    16: iconst_3       
        //    17: invokestatic    X/F0v.LIZ:(LX/BFk;LX/F2r;LX/SRT;I)LX/F2K;
        //    20: pop            
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
    
    public final void LIZ(final List<0gn> list, final List<0gn> list2) {
        public final class 1ts extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 0gn LIZ;
            public final /* synthetic */ SoundEffectViewModel LIZIZ;
            
            static {
                Covode.recordClassIndex(6653);
            }
            
            public 1ts(final 0gn liz, final SoundEffectViewModel liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //     6: astore_3       
        //     7: aload_3        
        //     8: invokeinterface java/util/Iterator.hasNext:()Z
        //    13: ifeq            138
        //    16: aload_3        
        //    17: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    22: checkcast       LX/0gn;
        //    25: astore          4
        //    27: aload_1        
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          5
        //    35: aload           5
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            133
        //    45: aload           5
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore_2       
        //    53: aload_2        
        //    54: aload           4
        //    56: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    59: ifeq            35
        //    62: aload_2        
        //    63: checkcast       LX/0gn;
        //    66: astore_2       
        //    67: aload_2        
        //    68: ifnull          84
        //    71: aload           4
        //    73: getfield        X/0gn.LJI:J
        //    76: aload_2        
        //    77: getfield        X/0gn.LJI:J
        //    80: lcmp           
        //    81: ifle            7
        //    84: aload           4
        //    86: invokestatic    X/0iB.LIZ:(LX/0gn;)Z
        //    89: ifeq            111
        //    92: new             Ljava/io/File;
        //    95: dup            
        //    96: getstatic       X/0iE.LIZLLL:LX/0iD;
        //    99: aload           4
        //   101: invokevirtual   X/0iD.LIZIZ:(LX/0gn;)Ljava/lang/String;
        //   104: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   107: invokestatic    com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZ:(Ljava/io/File;)Z
        //   110: pop            
        //   111: aload_0        
        //   112: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LJ:LX/0iE;
        //   115: aload           4
        //   117: new             LX/1ts;
        //   120: dup            
        //   121: aload           4
        //   123: aload_0        
        //   124: invokespecial   X/1ts.<init>:(LX/0gn;Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;)V
        //   127: invokevirtual   X/0iE.LIZ:(LX/0gn;LX/SRS;)V
        //   130: goto            7
        //   133: aconst_null    
        //   134: astore_2       
        //   135: goto            62
        //   138: return         
        //    Signature:
        //  (Ljava/util/List<LX/0gn;>;Ljava/util/List<LX/0gn;>;)V
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
