// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.impl.displayfilter;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0CC;
import X.0CH;
import X.2P9;
import X.H6J;
import X.SRS;
import X.F5g;
import com.bytedance.android.live.base.model.user.User;
import X.0fJ;
import X.GTi;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.1Im;
import X.Fqb;
import X.G6q;
import X.Fra;
import X.Gkn;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.graphics.Rect;
import X.Ghp;
import X.38Y;
import androidx.recyclerview.widget.RecyclerView;
import X.QgD;
import java.util.Objects;
import java.util.Collection;
import android.os.SystemClock;
import X.0FM;
import X.0es;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.6Jd;
import X.113;
import X.CTM;
import android.view.View;
import X.0f3;
import X.1Il;
import java.util.Iterator;
import java.util.ArrayList;
import X.Ey9;
import kotlin.jvm.internal.n;
import X.0cB;
import com.bytedance.covode.number.Covode;
import X.5DO;
import X.1eq;
import java.util.List;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public final class ExtendedScreenMultiFilterWidget extends LiveRecyclableWidget implements 6mZ
{
    public final List<1eq> LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public final List<1eq> LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(10780);
    }
    
    public ExtendedScreenMultiFilterWidget() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveRecyclableWidget.<init>:()V
        //     4: ldc             2131831033
        //     6: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ldc             ""
        //    13: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: new             LX/1eq;
        //    19: dup            
        //    20: iconst_1       
        //    21: aload_1        
        //    22: invokespecial   X/1eq.<init>:(ILjava/lang/String;)V
        //    25: astore_1       
        //    26: ldc             2131831032
        //    28: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    31: astore_2       
        //    32: aload_2        
        //    33: ldc             ""
        //    35: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    38: new             LX/1eq;
        //    41: dup            
        //    42: iconst_2       
        //    43: aload_2        
        //    44: invokespecial   X/1eq.<init>:(ILjava/lang/String;)V
        //    47: astore_2       
        //    48: ldc             2131831034
        //    50: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    53: astore_3       
        //    54: aload_3        
        //    55: ldc             ""
        //    57: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    60: new             LX/1eq;
        //    63: dup            
        //    64: iconst_4       
        //    65: aload_3        
        //    66: invokespecial   X/1eq.<init>:(ILjava/lang/String;)V
        //    69: astore          4
        //    71: ldc             2131831035
        //    73: invokestatic    X/0cB.LIZ:(I)Ljava/lang/String;
        //    76: astore_3       
        //    77: aload_3        
        //    78: ldc             ""
        //    80: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    83: aload_0        
        //    84: iconst_4       
        //    85: anewarray       LX/1eq;
        //    88: dup            
        //    89: iconst_0       
        //    90: aload_1        
        //    91: aastore        
        //    92: dup            
        //    93: iconst_1       
        //    94: aload_2        
        //    95: aastore        
        //    96: dup            
        //    97: iconst_2       
        //    98: aload           4
        //   100: aastore        
        //   101: dup            
        //   102: iconst_3       
        //   103: new             LX/1eq;
        //   106: dup            
        //   107: bipush          8
        //   109: aload_3        
        //   110: invokespecial   X/1eq.<init>:(ILjava/lang/String;)V
        //   113: aastore        
        //   114: invokestatic    X/Ey9.LIZIZ:([Ljava/lang/Object;)Ljava/util/List;
        //   117: putfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZLLL:Ljava/util/List;
        //   120: aload_0        
        //   121: new             Ljava/util/ArrayList;
        //   124: dup            
        //   125: invokespecial   java/util/ArrayList.<init>:()V
        //   128: putfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //   131: aload_0        
        //   132: new             LX/2AX;
        //   135: dup            
        //   136: aload_0        
        //   137: invokespecial   X/2AX.<init>:(Lcom/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget;)V
        //   140: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   143: putfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LJ:LX/5DO;
        //   146: return         
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
    
    private final ExtendedScreenMultiFilterWidget.a LIZ() {
        return (ExtendedScreenMultiFilterWidget.a)this.LJ.getValue();
    }
    
    private final 1eq LIZIZ(final int n) {
        for (final 1eq 1eq : this.LIZLLL) {
            if (1eq.LIZ == n) {
                return 1eq;
            }
        }
        return new 1eq(1, "");
    }
    
    private final 1eq LIZJ(final int n) {
        for (final 1eq 1eq : this.LIZ) {
            if (1eq.LIZ == n) {
                return 1eq;
            }
        }
        return null;
    }
    
    private final boolean LIZLLL(final int n) {
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().LIZ == n) {
                return true;
            }
        }
        return false;
    }
    
    public final 1Il LIZ(final int n) {
        public final class 1em implements b
        {
            public final /* synthetic */ ExtendedScreenMultiFilterWidget LIZ;
            public final /* synthetic */ int LIZIZ;
            
            static {
                Covode.recordClassIndex(10786);
            }
            
            public 1em(final ExtendedScreenMultiFilterWidget liz, final int liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ(final View view, final 0f3 0f3) {
                CTM.LIZ((Object)view);
                if (0f3 instanceof 1Il) {
                    final ExtendedScreenMultiFilterWidget liz = this.LIZ;
                    final int liziz = this.LIZIZ;
                    final 1Il 1Il = (1Il)0f3;
                    liz.LIZ(liziz, 1Il.LIZLLL);
                    final 113 liz2 = 113.LIZ;
                    final DataChannel dataChannel = ((LiveWidget)this.LIZ).dataChannel;
                    String s = "";
                    n.LIZIZ((Object)dataChannel, "");
                    final int liziz2 = this.LIZIZ;
                    final List<1eq> liz3 = this.LIZ.LIZ;
                    final ArrayList list = new ArrayList(6Jd.LIZ((Iterable)liz3, 10));
                    final Iterator<Object> iterator = liz3.iterator();
                    while (iterator.hasNext()) {
                        list.add((Object)iterator.next().LIZ);
                    }
                    final List list2 = list;
                    if (!1Il.LIZLLL) {
                        s = "filter_panel_close";
                    }
                    liz2.LIZ(dataChannel, "filter_panel", liziz2, list2, s);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1Ik.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: new             LX/0es;
        //    12: dup            
        //    13: aload_0        
        //    14: iload_1        
        //    15: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZIZ:(I)LX/1eq;
        //    18: getfield        X/1eq.LIZIZ:Ljava/lang/String;
        //    21: invokespecial   X/0es.<init>:(Ljava/lang/CharSequence;)V
        //    24: putfield        X/0f1.LIZ:LX/0es;
        //    27: aload_2        
        //    28: aload_0        
        //    29: iload_1        
        //    30: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZLLL:(I)Z
        //    33: putfield        X/1Ik.LIZLLL:Z
        //    36: aload_2        
        //    37: new             LX/1em;
        //    40: dup            
        //    41: aload_0        
        //    42: iload_1        
        //    43: invokespecial   X/1em.<init>:(Lcom/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget;I)V
        //    46: putfield        X/0f1.LIZJ:LX/0f2;
        //    49: new             LX/1Il;
        //    52: dup            
        //    53: aload_2        
        //    54: invokespecial   X/1Il.<init>:(LX/1Ik;)V
        //    57: astore_2       
        //    58: aload_2        
        //    59: ldc             ""
        //    61: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    64: aload_2        
        //    65: areturn        
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
    
    public final void LIZ(final int n, final boolean b) {
        public final class 1el extends a
        {
            public final /* synthetic */ ExtendedScreenMultiFilterWidget LIZ;
            public final /* synthetic */ ArrayList LIZIZ;
            
            static {
                Covode.recordClassIndex(10785);
            }
            
            public 1el(final ExtendedScreenMultiFilterWidget liz, final ArrayList liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final int LIZ() {
                return this.LIZIZ.size();
            }
            
            @Override
            public final int LIZIZ() {
                return this.LIZ.LIZ.size();
            }
            
            @Override
            public final boolean LIZIZ(final int n, final int n2) {
                return this.LIZIZ.get(n).LIZ == this.LIZ.LIZ.get(n2).LIZ;
            }
            
            @Override
            public final boolean LIZJ(final int n, final int n2) {
                return this.LIZIZ.get(n).LIZ == this.LIZ.LIZ.get(n2).LIZ;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //     4: invokeinterface java/util/Collection.isEmpty:()Z
        //     9: iconst_1       
        //    10: ixor           
        //    11: ifeq            126
        //    14: getstatic       X/113.LIZ:LX/113;
        //    17: astore_3       
        //    18: aload_0        
        //    19: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    22: astore          4
        //    24: aload           4
        //    26: ldc             ""
        //    28: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    31: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //    34: lstore          5
        //    36: aload_0        
        //    37: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZIZ:J
        //    40: lstore          7
        //    42: aload_0        
        //    43: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //    46: astore          9
        //    48: new             Ljava/util/ArrayList;
        //    51: dup            
        //    52: aload           9
        //    54: bipush          10
        //    56: invokestatic    X/6Jd.LIZ:(Ljava/lang/Iterable;I)I
        //    59: invokespecial   java/util/ArrayList.<init>:(I)V
        //    62: astore          10
        //    64: aload           9
        //    66: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    71: astore          9
        //    73: aload           9
        //    75: invokeinterface java/util/Iterator.hasNext:()Z
        //    80: ifeq            110
        //    83: aload           10
        //    85: aload           9
        //    87: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    92: checkcast       LX/1eq;
        //    95: getfield        X/1eq.LIZ:I
        //    98: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   101: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   106: pop            
        //   107: goto            73
        //   110: aload_3        
        //   111: aload           4
        //   113: lload           5
        //   115: lload           7
        //   117: lsub           
        //   118: aload           10
        //   120: checkcast       Ljava/util/List;
        //   123: invokevirtual   X/113.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;JLjava/util/List;)V
        //   126: new             Ljava/util/ArrayList;
        //   129: dup            
        //   130: aload_0        
        //   131: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //   134: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   137: astore          10
        //   139: aload_0        
        //   140: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //   143: putfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZIZ:J
        //   146: aload_0        
        //   147: iload_1        
        //   148: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZLLL:(I)Z
        //   151: ifeq            256
        //   154: iload_2        
        //   155: ifne            256
        //   158: aload_0        
        //   159: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //   162: astore_3       
        //   163: aload_0        
        //   164: iload_1        
        //   165: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZJ:(I)LX/1eq;
        //   168: astore          4
        //   170: aload_3        
        //   171: ldc             "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>"
        //   173: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   176: pop            
        //   177: aload_3        
        //   178: invokestatic    X/QgD.LIZIZ:(Ljava/lang/Object;)Ljava/util/Collection;
        //   181: aload           4
        //   183: invokeinterface java/util/Collection.remove:(Ljava/lang/Object;)Z
        //   188: pop            
        //   189: new             LX/1el;
        //   192: dup            
        //   193: aload_0        
        //   194: aload           10
        //   196: invokespecial   X/1el.<init>:(Lcom/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget;Ljava/util/ArrayList;)V
        //   199: invokestatic    X/0FM.LIZ:(LX/0FE;)LX/0FH;
        //   202: astore_3       
        //   203: aload_3        
        //   204: ldc             ""
        //   206: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   209: aload_3        
        //   210: aload_0        
        //   211: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:()Lcom/bytedance/android/live/publicscreen/impl/displayfilter/1ek;
        //   214: invokevirtual   X/0FH.LIZ:(LX/0EA;)V
        //   217: iconst_0       
        //   218: istore_1       
        //   219: aload_0        
        //   220: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //   223: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   228: astore_3       
        //   229: aload_3        
        //   230: invokeinterface java/util/Iterator.hasNext:()Z
        //   235: ifeq            286
        //   238: iload_1        
        //   239: aload_3        
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: checkcast       LX/1eq;
        //   248: getfield        X/1eq.LIZ:I
        //   251: ior            
        //   252: istore_1       
        //   253: goto            229
        //   256: aload_0        
        //   257: iload_1        
        //   258: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZLLL:(I)Z
        //   261: ifne            189
        //   264: iload_2        
        //   265: ifeq            189
        //   268: aload_0        
        //   269: getfield        com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:Ljava/util/List;
        //   272: aload_0        
        //   273: iload_1        
        //   274: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZIZ:(I)LX/1eq;
        //   277: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   282: pop            
        //   283: goto            189
        //   286: aload_0        
        //   287: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   290: ldc             LX/2Gg;.class
        //   292: iload_1        
        //   293: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   296: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   299: pop            
        //   300: return         
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
    
    public final int getLayoutId() {
        return 2131562161;
    }
    
    public final void onInit(final Object[] array) {
        public final class 1en extends h
        {
            public final int LIZ;
            public final int LIZIZ;
            public final boolean LIZJ;
            public final /* synthetic */ RecyclerView LIZLLL;
            
            static {
                Covode.recordClassIndex(10787);
            }
            
            public 1en(final RecyclerView lizlll) {
                this.LIZLLL = lizlll;
                final int liz = (int)38Y.LIZ(lizlll.getContext(), 8.0f);
                this.LIZ = liz;
                this.LIZIZ = liz / 2 * 3;
                this.LIZJ = Ghp.LIZ(lizlll.getContext());
            }
            
            @Override
            public final void LIZ(final Rect rect, final View view, final RecyclerView recyclerView, final t t) {
                CTM.LIZ((Object)rect, (Object)view, (Object)recyclerView, (Object)t);
                final int lizlll = recyclerView.LIZLLL(view);
                if (this.LIZJ) {
                    if (lizlll != 0) {
                        rect.right = this.LIZ;
                        return;
                    }
                    rect.right = this.LIZIZ;
                }
                else {
                    if (lizlll != 0) {
                        rect.left = this.LIZ;
                        return;
                    }
                    rect.left = this.LIZIZ;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             2131372685
        //     3: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //     6: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //     9: astore_1       
        //    10: aload_1        
        //    11: aconst_null    
        //    12: invokevirtual   androidx/recyclerview/widget/RecyclerView.setItemAnimator:(LX/0EI;)V
        //    15: aload_1        
        //    16: invokevirtual   androidx/recyclerview/widget/RecyclerView.getContext:()Landroid/content/Context;
        //    19: pop            
        //    20: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //    23: dup            
        //    24: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:()V
        //    27: astore_2       
        //    28: aload_2        
        //    29: iconst_0       
        //    30: invokevirtual   androidx/recyclerview/widget/LinearLayoutManager.LIZIZ:(I)V
        //    33: aload_1        
        //    34: aload_2        
        //    35: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //    38: aload_1        
        //    39: aload_0        
        //    40: invokespecial   com/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget.LIZ:()Lcom/bytedance/android/live/publicscreen/impl/displayfilter/1ek;
        //    43: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //    46: aload_1        
        //    47: new             LX/1en;
        //    50: dup            
        //    51: aload_1        
        //    52: invokespecial   X/1en.<init>:(Landroidx/recyclerview/widget/RecyclerView;)V
        //    55: invokevirtual   androidx/recyclerview/widget/RecyclerView.LIZ:(LX/0EJ;)V
        //    58: return         
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
    
    public final void onLoad(final Object[] array) {
        public final class 2AY extends F5g implements SRS<H6J, 2P9>
        {
            public final /* synthetic */ ExtendedScreenMultiFilterWidget LIZ;
            
            static {
                Covode.recordClassIndex(10789);
            }
            
            public 2AY(final ExtendedScreenMultiFilterWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 112 implements View$OnClickListener
        {
            public final /* synthetic */ ExtendedScreenMultiFilterWidget LIZ;
            
            static {
                Covode.recordClassIndex(10788);
            }
            
            public 112(final ExtendedScreenMultiFilterWidget liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final DataChannel dataChannel = ((LiveWidget)this.LIZ).dataChannel;
                n.LIZIZ((Object)dataChannel, "");
                CTM.LIZ((Object)dataChannel);
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_extended_comment_filed_filter_click");
                liz.LIZ(dataChannel);
                final Fra fra = (Fra)dataChannel.LIZIZ((Class)G6q.class);
                final Boolean b = null;
                String liz2;
                if (fra != null) {
                    liz2 = Fqb.LIZ(fra);
                }
                else {
                    liz2 = null;
                }
                liz.LIZIZ(liz2);
                liz.LIZLLL();
                final 113 liz3 = 113.LIZ;
                final DataChannel dataChannel2 = ((LiveWidget)this.LIZ).dataChannel;
                n.LIZIZ((Object)dataChannel2, "");
                liz3.LIZ(dataChannel2, "filter_panel");
                final 1Im.a a = new 1Im.a(view);
                a.LJIJI = 0cB.LIZIZ(2131100602);
                a.LJ((int)38Y.LIZ(((Widget)this.LIZ).context, 135.0f));
                a.LIZ(this.LIZ.LIZ(1));
                a.LIZ(this.LIZ.LIZ(2));
                final Room room = (Room)((LiveWidget)this.LIZ).dataChannel.LIZIZ((Class)G69.class);
                Boolean value = b;
                if (room != null) {
                    final User owner = room.getOwner();
                    value = b;
                    if (owner != null) {
                        value = owner.isAnchorHasSubQualification();
                    }
                }
                if (GTi.LIZ(value)) {
                    a.LIZ(this.LIZ.LIZ(4));
                }
                a.LIZ(this.LIZ.LIZ(8));
                final 1Im liz4 = a.LIZ();
                n.LIZIZ((Object)liz4, "");
                CTM.LIZ((Object)liz4);
                0fJ.LIZ(liz4);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           2131372684
        //     4: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //     7: new             LX/112;
        //    10: dup            
        //    11: aload_0        
        //    12: invokespecial   X/112.<init>:(Lcom/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget;)V
        //    15: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    18: aload_0        
        //    19: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    22: aload_0        
        //    23: ldc_w           LX/H01;.class
        //    26: new             LX/2AY;
        //    29: dup            
        //    30: aload_0        
        //    31: invokespecial   X/2AY.<init>:(Lcom/bytedance/android/live/publicscreen/impl/displayfilter/ExtendedScreenMultiFilterWidget;)V
        //    34: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    37: pop            
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public final void onUnload() {
    }
}
