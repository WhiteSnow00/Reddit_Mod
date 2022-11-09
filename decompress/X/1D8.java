// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public abstract class 1D8 implements 0P0
{
    public final 1D0<1D8> LIZ;
    public final boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(4101);
    }
    
    public 1D8(final 1D0<1D8> liz, final boolean liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    private final void LIZIZ(final String s) {
        final 0Os liziz = 0Os.LIZIZ;
        final StringBuilder sb = new StringBuilder("LibScheduleError Node: call ");
        sb.append(s);
        sb.append(" on state:");
        sb.append(this);
        liziz.LIZ(sb.toString(), 777001, null);
    }
    
    @Override
    public void LIZ() {
        this.LIZIZ("start");
    }
    
    @Override
    public void LIZ(final 0Oe 0Oe, final 1Cz 1Cz) {
        CTM.LIZ((Object)0Oe, (Object)1Cz);
        this.LIZIZ("setFailed");
    }
    
    @Override
    public void LIZ(final 0Ov 0Ov) {
        CTM.LIZ((Object)0Ov);
        this.LIZIZ("cancel");
    }
    
    @Override
    public void LIZ(final Object o) {
        this.LIZIZ("pause");
    }
    
    @Override
    public void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
        CTM.LIZ((Object)1Cz);
        this.LIZIZ("setSuccess");
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final 0Os liziz = 0Os.LIZIZ;
        final StringBuilder sb = new StringBuilder("TaskRunningError Node: call ");
        sb.append(s);
        sb.append(" on state:");
        sb.append(this);
        liziz.LIZ(sb.toString(), 777002, null);
    }
    
    @Override
    public void LIZIZ(final Object o) {
        this.LIZIZ("resume");
    }
    
    @Override
    public void LIZJ(final Object o) {
        this.LIZIZ("cancelFinish");
    }
    
    public abstract static class a extends 1D8
    {
        static {
            Covode.recordClassIndex(4102);
        }
        
        public a(final 1D0<1D8> 1d0) {
            super(1d0, true, (byte)0);
        }
        
        public static final class a extends 1D8.a
        {
            public final 0Ov LIZJ;
            
            static {
                Covode.recordClassIndex(4103);
            }
            
            public a(final 1D0<1D8> 1d0, final 0Ov lizj) {
                CTM.LIZ((Object)1d0, (Object)lizj);
                super(1d0, (byte)0);
                this.LIZJ = lizj;
            }
            
            @Override
            public final void LIZ(final 0Oe 0Oe, final 1Cz 1Cz) {
                CTM.LIZ((Object)0Oe, (Object)1Cz);
                super.LIZ.LIZLLL(new 1D8.a.b.a(super.LIZ, null));
                super.LIZ.LIZ(0Oe, true, false, 1Cz);
            }
            
            @Override
            public final void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
                CTM.LIZ((Object)1Cz);
                super.LIZ.LIZLLL(new 1D8.a.b.a(super.LIZ, null));
                super.LIZ.LIZ(o, b, true, false, 1Cz);
            }
            
            @Override
            public final void LIZJ(final Object o) {
                super.LIZ.LIZLLL(new 1D8.a.b.a(super.LIZ, o));
                super.LIZ.LJ(o);
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("Finish-Canceled cause:");
                sb.append(this.LIZJ);
                return sb.toString();
            }
        }
        
        public abstract static class b extends 1D8.a
        {
            static {
                Covode.recordClassIndex(4104);
            }
            
            public b(final 1D0<1D8> 1d0) {
                super(1d0, (byte)0);
            }
            
            @Override
            public final void LIZ(final 0Oe 0Oe, final 1Cz 1Cz) {
                CTM.LIZ((Object)0Oe, (Object)1Cz);
                this.LIZ("setFailed");
            }
            
            @Override
            public void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
                CTM.LIZ((Object)1Cz);
                this.LIZ("setSuccess");
            }
            
            public static final class a extends 1D8.a.b
            {
                public final Object LIZJ;
                
                static {
                    Covode.recordClassIndex(4105);
                }
                
                public a(final 1D0<1D8> 1d0, final Object lizj) {
                    CTM.LIZ((Object)1d0);
                    super(1d0, (byte)0);
                    this.LIZJ = lizj;
                }
                
                @Override
                public final void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
                    CTM.LIZ((Object)1Cz);
                    this.LIZ("setSuccess");
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder("TotalFinish-CancelFinish info:");
                    sb.append(this.LIZJ);
                    return sb.toString();
                }
            }
            
            public static final class b extends 1D8.a.b
            {
                public final 0Oe LIZJ;
                
                static {
                    Covode.recordClassIndex(4106);
                }
                
                public b(final 1D0<1D8> 1d0, final 0Oe lizj) {
                    CTM.LIZ((Object)1d0, (Object)lizj);
                    super(1d0, (byte)0);
                    this.LIZJ = lizj;
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder("TotalFinish-Failed exception:");
                    sb.append(this.LIZJ);
                    return sb.toString();
                }
            }
            
            public static final class c extends 1D8.a.b
            {
                public final Object LIZJ;
                
                static {
                    Covode.recordClassIndex(4107);
                }
                
                public c(final 1D0<1D8> 1d0, final Object lizj) {
                    CTM.LIZ((Object)1d0);
                    super(1d0, (byte)0);
                    this.LIZJ = lizj;
                }
                
                @Override
                public final String toString() {
                    final StringBuilder sb = new StringBuilder("TotalFinish-Success result:");
                    sb.append(this.LIZJ);
                    return sb.toString();
                }
            }
        }
    }
    
    public static final class b extends 1D8
    {
        static {
            Covode.recordClassIndex(4108);
        }
        
        public b(final 1D0<1D8> 1d0) {
            CTM.LIZ((Object)1d0);
            super(1d0, false, (byte)0);
        }
        
        @Override
        public final void LIZ() {
            super.LIZ.LIZLLL(new 1D8.c.b(super.LIZ));
            super.LIZ.LIZIZ();
        }
        
        @Override
        public final String toString() {
            return "New";
        }
    }
    
    public abstract static class c extends 1D8
    {
        static {
            Covode.recordClassIndex(4109);
        }
        
        public c(final 1D0<1D8> 1d0) {
            super(1d0, true, (byte)0);
        }
        
        @Override
        public final void LIZ(final 0Ov 0Ov) {
            CTM.LIZ((Object)0Ov);
            super.LIZ.LIZLLL(new 1D8.a.a(super.LIZ, 0Ov));
            super.LIZ.LIZIZ(0Ov);
        }
        
        public static final class a extends c
        {
            public final Object LIZJ;
            
            static {
                Covode.recordClassIndex(4110);
            }
            
            public a(final 1D0<1D8> 1d0, final Object lizj) {
                CTM.LIZ((Object)1d0);
                super(1d0, (byte)0);
                this.LIZJ = lizj;
            }
            
            @Override
            public final void LIZ(final 0Oe 0Oe, final 1Cz 1Cz) {
                CTM.LIZ((Object)0Oe, (Object)1Cz);
                super.LIZ.LIZ(0Oe, false, true, 1Cz);
            }
            
            @Override
            public final void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
                CTM.LIZ((Object)1Cz);
                super.LIZ.LIZ(o, b, false, true, 1Cz);
            }
            
            @Override
            public final void LIZIZ(final Object o) {
                public final class 1of extends F5g implements SRS<0PA, 2P9>
                {
                    public final /* synthetic */ a LIZ;
                    
                    static {
                        Covode.recordClassIndex(4111);
                    }
                    
                    public 1of(final a liz) {
                        this.LIZ = liz;
                        super(1);
                    }
                }
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        X/1D8.LIZ:LX/1D0;
                //     4: new             LX/1oh;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/1D8.LIZ:LX/1D0;
                //    12: invokespecial   X/1oh.<init>:(LX/1D0;)V
                //    15: invokeinterface X/0P2.LIZLLL:(Ljava/lang/Object;)V
                //    20: aload_0        
                //    21: getfield        X/1D8.LIZ:LX/1D0;
                //    24: aload_1        
                //    25: new             LX/1of;
                //    28: dup            
                //    29: aload_0        
                //    30: invokespecial   X/1of.<init>:(LX/1og;)V
                //    33: invokeinterface X/0P3.LIZ:(Ljava/lang/Object;LX/SRS;)V
                //    38: return         
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
            public final String toString() {
                final StringBuilder sb = new StringBuilder("Runnable-Paused info:");
                sb.append(this.LIZJ);
                return sb.toString();
            }
        }
        
        public static final class b extends c
        {
            static {
                Covode.recordClassIndex(4112);
            }
            
            public b(final 1D0<1D8> 1d0) {
                CTM.LIZ((Object)1d0);
                super(1d0, (byte)0);
            }
            
            @Override
            public final void LIZ(final 0Oe 0Oe, final 1Cz 1Cz) {
                CTM.LIZ((Object)0Oe, (Object)1Cz);
                super.LIZ.LIZLLL(new 1D8.a.b.b(super.LIZ, 0Oe));
                super.LIZ.LIZ(0Oe, false, false, 1Cz);
            }
            
            @Override
            public final void LIZ(final Object o) {
                super.LIZ.LIZLLL(new a(super.LIZ, o));
                super.LIZ.LJFF(o);
            }
            
            @Override
            public final void LIZ(final Object o, final boolean b, final 1Cz 1Cz) {
                CTM.LIZ((Object)1Cz);
                super.LIZ.LIZLLL(new 1D8.a.b.c(super.LIZ, o));
                super.LIZ.LIZ(o, b, false, false, 1Cz);
            }
            
            @Override
            public final String toString() {
                return "Runnable-Running";
            }
        }
    }
}
