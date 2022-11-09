// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.als;

import X.WBY;
import X.0CH;
import X.0QK;
import X.FJ3;
import X.0Bg;
import java.util.Iterator;
import X.Qsi;
import X.0QH;
import X.0QW;
import X.WBW;
import X.0Qb;
import X.2Gw;
import X.0QM;
import X.5u3;
import X.WBZ;
import kotlin.jvm.internal.n;
import X.0QI;
import X.0QG;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0QS;
import X.2P9;
import X.0QJ;
import java.util.Map;
import X.SRS;
import java.util.ArrayList;
import X.WBR;
import X.WBS;
import X.0QO;
import X.1DY;
import java.util.HashMap;
import X.1DU;
import java.util.List;
import X.0CC;
import X.6mZ;

public final class AlsLogicContainer implements 6mZ
{
    public final 0CC LIZ;
    public final List<1DU> LIZIZ;
    public final HashMap<Class<?>, 1DY<?>> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final 0QO LJFF;
    public final WBS LJI;
    public WBR LJII;
    public final ApiCenter LJIIIIZZ;
    public final ArrayList<1DY<?>> LJIIIZ;
    public SRS<? super Map<Class<?>, ? extends Map<0QJ, Long>>, 2P9> LJIIJ;
    public WBR LJIIJJI;
    public final 0QS LJIIL;
    
    static {
        Covode.recordClassIndex(4264);
    }
    
    public AlsLogicContainer(final 0CC liz, final ApiCenter ljiiiizz, final WBR ljiijji, final 0QS ljiil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload           4
        //     4: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //     7: aload_0        
        //     8: invokespecial   java/lang/Object.<init>:()V
        //    11: aload_0        
        //    12: aload_2        
        //    13: putfield        com/bytedance/als/AlsLogicContainer.LJIIIIZZ:Lcom/bytedance/als/ApiCenter;
        //    16: aload_0        
        //    17: aload_3        
        //    18: putfield        com/bytedance/als/AlsLogicContainer.LJIIJJI:LX/WBR;
        //    21: aload_0        
        //    22: aload           4
        //    24: putfield        com/bytedance/als/AlsLogicContainer.LJIIL:LX/0QS;
        //    27: aload_0        
        //    28: aload_1        
        //    29: putfield        com/bytedance/als/AlsLogicContainer.LIZ:LX/0CC;
        //    32: aload_0        
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: invokespecial   java/util/ArrayList.<init>:()V
        //    40: putfield        com/bytedance/als/AlsLogicContainer.LIZIZ:Ljava/util/List;
        //    43: aload_0        
        //    44: new             Ljava/util/ArrayList;
        //    47: dup            
        //    48: invokespecial   java/util/ArrayList.<init>:()V
        //    51: putfield        com/bytedance/als/AlsLogicContainer.LJIIIZ:Ljava/util/ArrayList;
        //    54: aload_0        
        //    55: new             Ljava/util/HashMap;
        //    58: dup            
        //    59: invokespecial   java/util/HashMap.<init>:()V
        //    62: putfield        com/bytedance/als/AlsLogicContainer.LIZJ:Ljava/util/HashMap;
        //    65: aload_0        
        //    66: new             LX/1DR;
        //    69: dup            
        //    70: aload_0        
        //    71: invokespecial   X/1DR.<init>:(Lcom/bytedance/als/AlsLogicContainer;)V
        //    74: putfield        com/bytedance/als/AlsLogicContainer.LJFF:LX/0QO;
        //    77: aload_1        
        //    78: aload_0        
        //    79: invokevirtual   X/0CC.LIZ:(LX/0CG;)V
        //    82: aload_0        
        //    83: getfield        com/bytedance/als/AlsLogicContainer.LJIIJJI:LX/WBR;
        //    86: ifnonnull       109
        //    89: aload_0        
        //    90: new             LX/WBS;
        //    93: dup            
        //    94: aconst_null    
        //    95: aload           4
        //    97: getfield        X/0QS.LIZ:Z
        //   100: invokespecial   X/WBS.<init>:(LX/WBR;Z)V
        //   103: invokevirtual   X/WBS.LIZ:()LX/WBR;
        //   106: putfield        com/bytedance/als/AlsLogicContainer.LJIIJJI:LX/WBR;
        //   109: aload_0        
        //   110: new             LX/WBS;
        //   113: dup            
        //   114: aload_0        
        //   115: getfield        com/bytedance/als/AlsLogicContainer.LJIIJJI:LX/WBR;
        //   118: aload           4
        //   120: getfield        X/0QS.LIZ:Z
        //   123: invokespecial   X/WBS.<init>:(LX/WBR;Z)V
        //   126: putfield        com/bytedance/als/AlsLogicContainer.LJI:LX/WBS;
        //   129: return         
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
    
    private final void LIZ(final 1DY<?> 1dy, final 0CC.b b) {
        this.LJ = true;
        final int n = 0QG.LIZ[b.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        if (1dy.getLifecycle().LIZ().compareTo(0CC.b.RESUMED) >= 0) {
                            1dy.dispatchOnPause$als_release();
                        }
                        if (1dy.getLifecycle().LIZ().compareTo(0CC.b.STARTED) >= 0) {
                            1dy.dispatchOnStop$als_release();
                        }
                        if (1dy.getLifecycle().LIZ().compareTo(0CC.b.CREATED) >= 0) {
                            1dy.dispatchOnDestroy$als_release();
                            final 0QI apiComponent = 1dy.getApiComponent();
                            if (kotlin.jvm.internal.n.LIZ((Object)apiComponent, (Object)0QI.class) ^ true) {
                                this.LJIIIIZZ.LIZIZ(apiComponent);
                            }
                        }
                    }
                }
                else if (1dy.getLifecycle().LIZ().compareTo(0CC.b.RESUMED) < 0) {
                    if (1dy.getLifecycle().LIZ().compareTo(0CC.b.CREATED) < 0) {
                        1dy.dispatchOnCreate$als_release();
                    }
                    if (1dy.getLifecycle().LIZ().compareTo(0CC.b.STARTED) < 0) {
                        1dy.dispatchOnStart$als_release();
                    }
                    1dy.dispatchOnResume$als_release();
                }
            }
            else if (1dy.getLifecycle().LIZ().compareTo(0CC.b.STARTED) < 0) {
                if (1dy.getLifecycle().LIZ().compareTo(0CC.b.CREATED) < 0) {
                    1dy.dispatchOnCreate$als_release();
                }
                1dy.dispatchOnStart$als_release();
            }
            else if (1dy.getLifecycle().LIZ().compareTo(0CC.b.STARTED) > 0) {
                1dy.dispatchOnPause$als_release();
            }
        }
        else if (1dy.getLifecycle().LIZ().compareTo(0CC.b.CREATED) < 0) {
            1dy.dispatchOnCreate$als_release();
        }
        else {
            if (1dy.getLifecycle().LIZ().compareTo(0CC.b.STARTED) > 0) {
                1dy.dispatchOnPause$als_release();
            }
            if (1dy.getLifecycle().LIZ().compareTo(0CC.b.CREATED) > 0) {
                1dy.dispatchOnStop$als_release();
            }
        }
        this.LJ = false;
    }
    
    private final void LIZ(final Class<?> clazz, final 1DY<?> 1dy) {
        final Class[] interfaces = clazz.getInterfaces();
        n.LIZ((Object)interfaces, "");
        for (final Class clazz2 : interfaces) {
            if ((n.LIZ((Object)clazz2, (Object)0QI.class) ^ true) && 0QI.class.isAssignableFrom(clazz2)) {
                final HashMap<Class<?>, 1DY<?>> lizj = this.LIZJ;
                n.LIZ((Object)clazz2, "");
                lizj.put(clazz2, 1dy);
                this.LIZ(clazz2, 1dy);
            }
        }
    }
    
    private final void LIZ(final Class<?> clazz, final WBZ<?> wbz) {
        final Class[] interfaces = clazz.getInterfaces();
        n.LIZ((Object)interfaces, "");
        for (final Class clazz2 : interfaces) {
            if ((n.LIZ((Object)clazz2, (Object)0QI.class) ^ true) && 0QI.class.isAssignableFrom(clazz2)) {
                if (clazz2 == null) {
                    throw new 5u3("null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                }
                ((WBY)wbz).LIZ(new Class[] { clazz2 });
                this.LIZ(clazz2, wbz);
            }
        }
    }
    
    public final <T extends 0QI> T LIZ(final Class<T> clazz) {
        CTM.LIZ((Object)clazz);
        final WBR ljii = this.LJII;
        if (ljii == null) {
            throw new IllegalStateException("ALS container not started");
        }
        if (!ljii.LIZLLL((Class)clazz)) {
            return null;
        }
        return (T)this.LJFF.LIZ(clazz);
    }
    
    public final <A extends 0QI, B extends 1DY<A>> AlsLogicContainer LIZ(final 0QM 0qm, final Class<A> clazz, final Class<B> clazz2, final Class<? extends 2Gw<?, ?>> clazz3, final int n, final 0Qb 0Qb, final SRS<? super WBR, ? extends B> srs) {
        public final class 1DO extends WBW<B>
        {
            public final /* synthetic */ SRS LIZ;
            
            static {
                Covode.recordClassIndex(4265);
            }
            
            public 1DO(final SRS liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: aload_3        
        //     3: aload           4
        //     5: aload           6
        //     7: aload           7
        //     9: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //    12: aload_0        
        //    13: getfield        com/bytedance/als/AlsLogicContainer.LJI:LX/WBS;
        //    16: aload_3        
        //    17: new             LX/1DO;
        //    20: dup            
        //    21: aload           7
        //    23: invokespecial   X/1DO.<init>:(LX/SRS;)V
        //    26: invokevirtual   X/WBS.LIZ:(Ljava/lang/Class;LX/WBW;)LX/WBZ;
        //    29: pop            
        //    30: aload_0        
        //    31: aload_2        
        //    32: aload_3        
        //    33: invokevirtual   com/bytedance/als/AlsLogicContainer.LIZ:(Ljava/lang/Class;Ljava/lang/Class;)V
        //    36: aload_0        
        //    37: aload_3        
        //    38: aload           4
        //    40: iload           5
        //    42: aload           6
        //    44: aload_1        
        //    45: invokevirtual   com/bytedance/als/AlsLogicContainer.LIZ:(Ljava/lang/Class;Ljava/lang/Class;ILX/0Qb;LX/0QM;)V
        //    48: aload_0        
        //    49: areturn        
        //    Signature:
        //  <A::LX/0QI;B:LX/1DY<TA;>;>(LX/0QM;Ljava/lang/Class<TA;>;Ljava/lang/Class<TB;>;Ljava/lang/Class<+LX/2Gw<**>;>;ILX/0Qb;LX/SRS<-LX/WBR;+TB;>;)Lcom/bytedance/als/AlsLogicContainer;
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
    
    public final void LIZ(final 1DY<?> 1dy) {
        CTM.LIZ((Object)1dy);
        if (this.LIZ.LIZ() == 0CC.b.DESTROYED) {
            return;
        }
        if (!this.LJIIIZ.contains(1dy)) {
            this.LJIIIZ.add(1dy);
            if ((n.LIZ((Object)1dy.getApiComponent(), (Object)0QI.class) ^ true) && !(1dy.getApiComponent() instanceof 0QW) && !(1dy instanceof 0QH)) {
                this.LJIIIIZZ.LIZ((Object)1dy.getApiComponent());
            }
            1dy.attachedLazyComponentSearcher = this.LJFF;
            if (n.LIZ((Object)1dy.getApiComponent().getClass(), (Object)0QI.class) ^ true) {
                this.LIZJ.put(1dy.getApiComponent().getClass(), 1dy);
                this.LIZ(1dy.getApiComponent().getClass(), 1dy);
            }
            if (this.LIZ.LIZ().isAtLeast(0CC.b.CREATED)) {
                this.LJ = true;
                1dy.dispatchOnCreate$als_release();
                if (this.LIZ.LIZ().isAtLeast(0CC.b.STARTED)) {
                    1dy.dispatchOnStart$als_release();
                    if (this.LIZ.LIZ().isAtLeast(0CC.b.RESUMED)) {
                        1dy.dispatchOnResume$als_release();
                    }
                }
                this.LJ = false;
            }
            return;
        }
        throw new IllegalArgumentException("LogicComponent already exists");
    }
    
    public final <A extends 0QI, B extends 1DY<A>> void LIZ(final Class<A> clazz, final Class<B> clazz2) {
        public final class 1DQ extends WBW<A>
        {
            public final /* synthetic */ Class LIZ;
            
            static {
                Covode.recordClassIndex(4267);
            }
            
            public 1DQ(final Class liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_1        
        //     6: ldc             LX/0QI;.class
        //     8: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    11: iconst_1       
        //    12: ixor           
        //    13: ifeq            45
        //    16: aload_0        
        //    17: getfield        com/bytedance/als/AlsLogicContainer.LJI:LX/WBS;
        //    20: aload_1        
        //    21: new             LX/1DQ;
        //    24: dup            
        //    25: aload_2        
        //    26: invokespecial   X/1DQ.<init>:(Ljava/lang/Class;)V
        //    29: invokevirtual   X/WBS.LIZ:(Ljava/lang/Class;LX/WBW;)LX/WBZ;
        //    32: astore_2       
        //    33: aload_2        
        //    34: ldc             ""
        //    36: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    39: aload_0        
        //    40: aload_1        
        //    41: aload_2        
        //    42: invokespecial   com/bytedance/als/AlsLogicContainer.LIZ:(Ljava/lang/Class;LX/WBZ;)V
        //    45: return         
        //    Signature:
        //  <A::LX/0QI;B:LX/1DY<TA;>;>(Ljava/lang/Class<TA;>;Ljava/lang/Class<TB;>;)V
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
    
    public final <A extends 0QI, B extends 1DY<A>> void LIZ(final Class<B> clazz, final Class<? extends 2Gw<?, ?>> clazz2, final int n, final 0Qb 0Qb, final 0QM 0qm) {
        CTM.LIZ((Object)clazz, (Object)0qm);
        this.LIZIZ.add(new 1DU((Class<1DY<?>>)clazz, 0qm, clazz2, n, 0Qb));
    }
    
    @0Bg(LIZ = 0CC.a.ON_CREATE)
    public final void onActivityCreated() {
        this.LIZLLL = true;
        final Iterator iterator = Qsi.LJIIL((Iterable)this.LJIIIZ).iterator();
        while (iterator.hasNext()) {
            this.LIZ((1DY<?>)iterator.next(), 0CC.b.CREATED);
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public final void onDestroyView() {
        final HashMap hashMap = new HashMap();
        for (final 1DY 1dy : Qsi.LJIIL((Iterable)this.LJIIIZ)) {
            this.LIZ(1dy, 0CC.b.DESTROYED);
            hashMap.put(1dy.getClass(), FJ3.LIZJ((Map)1dy.getPerformanceMonitorCalculate$als_release().LIZ));
        }
        final SRS<? super Map<Class<?>, ? extends Map<0QJ, Long>>, 2P9> ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.invoke((Object)hashMap);
        }
        CTM.LIZ((Object)hashMap);
        final SRS<? super Map<Class<?>, ? extends Map<0QJ, Long>>, 2P9> liz = 0QK.LIZ;
        if (liz != null) {
            liz.invoke((Object)hashMap);
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_PAUSE)
    public final void onPause() {
        final Iterator iterator = Qsi.LJIIL((Iterable)this.LJIIIZ).iterator();
        while (iterator.hasNext()) {
            this.LIZ((1DY<?>)iterator.next(), 0CC.b.STARTED);
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_RESUME)
    public final void onResume() {
        final Iterator iterator = Qsi.LJIIL((Iterable)this.LJIIIZ).iterator();
        while (iterator.hasNext()) {
            this.LIZ((1DY<?>)iterator.next(), 0CC.b.RESUMED);
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_START)
    public final void onStart() {
        final Iterator iterator = Qsi.LJIIL((Iterable)this.LJIIIZ).iterator();
        while (iterator.hasNext()) {
            this.LIZ((1DY<?>)iterator.next(), 0CC.b.STARTED);
        }
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_CREATE) {
            this.onActivityCreated();
            return;
        }
        if (a == 0CC.a.ON_START) {
            this.onStart();
            return;
        }
        if (a == 0CC.a.ON_RESUME) {
            this.onResume();
            return;
        }
        if (a == 0CC.a.ON_PAUSE) {
            this.onPause();
            return;
        }
        if (a == 0CC.a.ON_STOP) {
            this.onStop();
            return;
        }
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroyView();
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_STOP)
    public final void onStop() {
        final Iterator iterator = Qsi.LJIIL((Iterable)this.LJIIIZ).iterator();
        while (iterator.hasNext()) {
            this.LIZ((1DY<?>)iterator.next(), 0CC.b.CREATED);
        }
    }
}
