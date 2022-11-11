// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;

public final class 0xi
{
    public final HashSet<String> LIZ;
    public final HashSet<String> LIZIZ;
    public final HashSet<String> LIZJ;
    public final HashSet<String> LIZLLL;
    public final HashSet<String> LJ;
    public final HashSet<String> LJFF;
    public final HashSet<String> LJI;
    public final HashSet<String> LJII;
    public final RecyclerView LJIIIIZZ;
    public final boolean LJIIIZ;
    
    static {
        Covode.recordClassIndex(10322);
    }
    
    public 0xi(final RecyclerView ljiiiizz, final boolean ljiiiz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/0xi.LJIIIIZZ:Landroidx/recyclerview/widget/RecyclerView;
        //    13: aload_0        
        //    14: iload_2        
        //    15: putfield        X/0xi.LJIIIZ:Z
        //    18: aload_0        
        //    19: new             Ljava/util/HashSet;
        //    22: dup            
        //    23: invokespecial   java/util/HashSet.<init>:()V
        //    26: putfield        X/0xi.LIZ:Ljava/util/HashSet;
        //    29: aload_0        
        //    30: new             Ljava/util/HashSet;
        //    33: dup            
        //    34: invokespecial   java/util/HashSet.<init>:()V
        //    37: putfield        X/0xi.LIZIZ:Ljava/util/HashSet;
        //    40: aload_0        
        //    41: new             Ljava/util/HashSet;
        //    44: dup            
        //    45: invokespecial   java/util/HashSet.<init>:()V
        //    48: putfield        X/0xi.LIZJ:Ljava/util/HashSet;
        //    51: aload_0        
        //    52: new             Ljava/util/HashSet;
        //    55: dup            
        //    56: invokespecial   java/util/HashSet.<init>:()V
        //    59: putfield        X/0xi.LIZLLL:Ljava/util/HashSet;
        //    62: aload_0        
        //    63: new             Ljava/util/HashSet;
        //    66: dup            
        //    67: invokespecial   java/util/HashSet.<init>:()V
        //    70: putfield        X/0xi.LJ:Ljava/util/HashSet;
        //    73: aload_0        
        //    74: new             Ljava/util/HashSet;
        //    77: dup            
        //    78: invokespecial   java/util/HashSet.<init>:()V
        //    81: putfield        X/0xi.LJFF:Ljava/util/HashSet;
        //    84: aload_0        
        //    85: new             Ljava/util/HashSet;
        //    88: dup            
        //    89: invokespecial   java/util/HashSet.<init>:()V
        //    92: putfield        X/0xi.LJI:Ljava/util/HashSet;
        //    95: aload_0        
        //    96: new             Ljava/util/HashSet;
        //    99: dup            
        //   100: invokespecial   java/util/HashSet.<init>:()V
        //   103: putfield        X/0xi.LJII:Ljava/util/HashSet;
        //   106: new             LX/1d8;
        //   109: dup            
        //   110: aload_0        
        //   111: invokespecial   X/1d8.<init>:(LX/0xi;)V
        //   114: astore_3       
        //   115: aload_1        
        //   116: aload_3        
        //   117: invokevirtual   androidx/recyclerview/widget/RecyclerView.LIZ:(LX/0ER;)V
        //   120: aload_1        
        //   121: invokevirtual   androidx/recyclerview/widget/RecyclerView.getAdapter:()LX/0EA;
        //   124: astore_1       
        //   125: aload_1        
        //   126: ifnonnull       132
        //   129: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   132: aload_1        
        //   133: new             LX/1d7;
        //   136: dup            
        //   137: aload_0        
        //   138: aload_3        
        //   139: invokespecial   X/1d7.<init>:(LX/0xi;LX/1d8;)V
        //   142: invokevirtual   X/0EA.registerAdapterDataObserver:(LX/0EC;)V
        //   145: return         
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
    
    public final void LIZ() {
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
    }
    
    public final class a extends n
    {
        static {
            Covode.recordClassIndex(10324);
        }
        
        private final void LIZ(final 1P3 1p3) {
            if (1p3.LJ == 0kf.RECOMMEND_INVITE) {
                0xi.this.LIZ.add(1p3.LIZJ.getIdStr());
                if (GTi.LIZ((CharSequence)1p3.LIZ())) {
                    0xi.this.LJ.add(1p3.LIZJ.getIdStr());
                }
                if (1p3.LIZLLL.LIZ()) {
                    0xi.this.LIZLLL.add(1p3.LIZJ.getIdStr());
                }
            }
            if (1p3.LJ == 0kf.FOLLOW_INVITE) {
                if (1p3.LIZLLL.LIZ()) {
                    0xi.this.LIZIZ.add(1p3.LIZJ.getIdStr());
                }
                if (GTi.LIZ((CharSequence)1p3.LIZ())) {
                    0xi.this.LIZJ.add(1p3.LIZJ.getIdStr());
                }
            }
            final User owner = 1p3.LIZJ.getOwner();
            String s = "";
            kotlin.jvm.internal.n.LIZIZ((Object)owner, "");
            final boolean liziz = 0py.LIZIZ(owner);
            final int n = 0;
            int type = 0;
            if (liziz) {
                final RivalExtraInfo ljff = 1p3.LJFF;
                0xi.this.LJII.add(1p3.LIZJ.getIdStr());
                if (ljff != null && ljff.LJFF == 0) {
                    if (ljff.LJII == 5Fw.PLAYTYPE_APPLY.value) {
                        0xi.this.LJFF.add(1p3.LIZJ.getIdStr());
                    }
                    else {
                        0xi.this.LJI.add(1p3.LIZJ.getIdStr());
                    }
                }
            }
            if (!1p3.LIZ) {
                1p3.LIZ = true;
                if (0xi.this.LJIIIZ) {
                    final String lji = 1p3.LJI;
                    if (lji != null) {
                        s = lji;
                    }
                    final Room lizj = 1p3.LIZJ;
                    final 0kf lj = 1p3.LJ;
                    if (lj != null) {
                        type = lj.getType();
                    }
                    0xm.LIZ(s, lizj, type, 1p3.LJFF, 1p3.LJII);
                    return;
                }
                final String lji2 = 1p3.LJI;
                final Room lizj2 = 1p3.LIZJ;
                final 0kf lj2 = 1p3.LJ;
                int type2 = n;
                if (lj2 != null) {
                    type2 = lj2.getType();
                }
                0xy.LIZ(lji2, lizj2, type2, 1p3.LJFF, 1p3.LJII ? 1 : 0);
            }
        }
        
        @Override
        public final void LIZ(final RecyclerView recyclerView, final int n) {
            CTM.LIZ((Object)recyclerView);
        }
        
        @Override
        public final void LIZ(final RecyclerView recyclerView, int i, final int n) {
            CTM.LIZ((Object)recyclerView);
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                final LinearLayoutManager linearLayoutManager = (LinearLayoutManager)recyclerView.getLayoutManager();
                if (linearLayoutManager == null) {
                    n.LIZIZ();
                }
                final int ljiiliil = linearLayoutManager.LJIILIIL();
                i = linearLayoutManager.LJIIJJI();
                if (i != -1 && ljiiliil != -1) {
                    Object adapter;
                    if (!((adapter = recyclerView.getAdapter()) instanceof Evr)) {
                        adapter = null;
                    }
                    final Evr evr = (Evr)adapter;
                    if (evr != null) {
                        final List liziz = evr.LIZIZ;
                        if (liziz != null) {
                            if (n == 0) {
                                if (i <= ljiiliil) {
                                    while (i < liziz.size()) {
                                        Object value;
                                        if (!((value = liziz.get(i)) instanceof 1P3)) {
                                            value = null;
                                        }
                                        final 1P3 1p3 = (1P3)value;
                                        if (1p3 != null) {
                                            this.LIZ(1p3);
                                        }
                                        if (i == ljiiliil) {
                                            break;
                                        }
                                        ++i;
                                    }
                                }
                            }
                            else if (ljiiliil < liziz.size() && liziz.get(ljiiliil) instanceof 1P3) {
                                final Object value2 = liziz.get(ljiiliil);
                                Objects.requireNonNull(value2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.InteractUserItem");
                                this.LIZ((1P3)value2);
                            }
                        }
                    }
                }
            }
        }
    }
}
