// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.0CC;
import X.0CH;
import java.util.Iterator;
import X.2GK;
import X.1mg;
import X.0wQ;
import X.1lI;
import java.util.Map;
import X.1ci;
import X.SRS;
import X.F5g;
import X.0ba;
import X.0pc;
import X.0jz;
import X.1Sk;
import kotlin.jvm.internal.n;
import java.util.Objects;
import android.text.TextUtils;
import X.0x9;
import java.util.ArrayList;
import X.CTM;
import android.view.View;
import com.bytedance.covode.number.Covode;
import X.0xA;
import X.2P9;
import X.1Sy;
import X.1Wh;
import X.VzU;
import X.SRT;
import X.Vwg;
import java.util.List;
import X.0pq;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public abstract class MatchBaseWidget extends LiveWidget implements 6mZ
{
    public 0pq LIZ;
    public List<Vwg> LIZIZ;
    public final SRT<VzU, 1Wh<1Sy>, 2P9> LIZJ;
    public 0xA LIZLLL;
    
    static {
        Covode.recordClassIndex(10226);
    }
    
    public MatchBaseWidget(final View contentView) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: invokevirtual   com/bytedance/android/widget/Widget.setContentView:(Landroid/view/View;)V
        //    13: aload_0        
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: putfield        com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZIZ:Ljava/util/List;
        //    24: aload_0        
        //    25: new             LX/294;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   X/294.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;)V
        //    33: putfield        com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZJ:LX/SRT;
        //    36: return         
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
    
    public final <T extends 0x9> T LIZ(final Class<T> clazz) {
        CTM.LIZ((Object)clazz);
        if (this.LIZLLL == null) {
            this.LIZLLL = new 0xA();
        }
        String canonicalName;
        if ((canonicalName = clazz.getCanonicalName()) == null) {
            canonicalName = "default";
        }
        if (TextUtils.isEmpty((CharSequence)canonicalName)) {
            throw new IllegalArgumentException("MatchBaseWidget getViewModel cls error ".concat(String.valueOf(clazz)));
        }
        final 0xA lizlll = this.LIZLLL;
        0x9 liz;
        if (lizlll != null) {
            liz = lizlll.LIZ(canonicalName);
        }
        else {
            liz = null;
        }
        if (clazz.isInstance(liz)) {
            Objects.requireNonNull(liz, "null cannot be cast to non-null type T");
            return (T)liz;
        }
        final 0x9 0x9 = clazz.newInstance();
        final 0xA lizlll2 = this.LIZLLL;
        if (lizlll2 == null) {
            n.LIZIZ();
        }
        n.LIZIZ((Object)0x9, "");
        lizlll2.LIZ(canonicalName, 0x9);
        return (T)0x9;
    }
    
    public final 1Sk LIZ(final long n) {
        final 0pq liz = this.LIZ;
        if (liz != null) {
            final 0pc coHostUser = 0jz.LIZLLL().getCoHostUser(n);
            String ljiij;
            if (coHostUser == null || (ljiij = coHostUser.LJIIJ) == null) {
                ljiij = "";
            }
            return liz.LIZ(ljiij);
        }
        return null;
    }
    
    public final String LIZ() {
        final String simpleName = this.getClass().getSimpleName();
        n.LIZIZ((Object)simpleName, "");
        return simpleName;
    }
    
    public void LIZ(final String s) {
    }
    
    public void LIZ(final List<Vwg> list, final List<Vwg> list2) {
        final String liz = this.LIZ();
        final StringBuilder sb = new StringBuilder("onLinkedAnchorChanged size=");
        int size;
        if (list != null) {
            size = list.size();
        }
        else {
            size = -1;
        }
        sb.append(size);
        0ba.LIZ(4, liz, sb.toString());
    }
    
    public void onCreate() {
        public final class 295 extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ MatchBaseWidget LIZ;
            
            static {
                Covode.recordClassIndex(10228);
            }
            
            public 295(final MatchBaseWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: putstatic       X/1lI.LIZIZ:Z
        //     4: aload_0        
        //     5: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     8: aload_0        
        //     9: ldc             LX/1ci;.class
        //    11: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(Ljava/lang/Class;)LX/0x9;
        //    14: checkcast       LX/1ci;
        //    17: putstatic       X/0wQ.LIZ:LX/1ci;
        //    20: aload_0        
        //    21: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    24: aload_0        
        //    25: ldc             LX/1ci;.class
        //    27: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(Ljava/lang/Class;)LX/0x9;
        //    30: checkcast       LX/1ci;
        //    33: putstatic       X/1mg.LJIIIZ:LX/1ci;
        //    36: aload_0        
        //    37: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.onCreate:()V
        //    40: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //    43: ldc             LX/1Sy;.class
        //    45: aload_0        
        //    46: getfield        com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZJ:LX/SRT;
        //    49: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.subscribe:(Ljava/lang/Class;LX/SRT;)V
        //    54: iconst_4       
        //    55: aload_0        
        //    56: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:()Ljava/lang/String;
        //    59: ldc             "observable UserListChangedMessage from co-host linked user list"
        //    61: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    64: aload_0        
        //    65: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    68: astore_1       
        //    69: aload_1        
        //    70: ifnull          89
        //    73: aload_1        
        //    74: aload_0        
        //    75: ldc             LX/2GK;.class
        //    77: new             LX/295;
        //    80: dup            
        //    81: aload_0        
        //    82: invokespecial   X/295.<init>:(Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;)V
        //    85: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    88: pop            
        //    89: iconst_3       
        //    90: aload_0        
        //    91: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:()Ljava/lang/String;
        //    94: ldc             "onCreate"
        //    96: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    99: return         
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
    
    public void onDestroy() {
        super.onDestroy();
        final 0xA lizlll = this.LIZLLL;
        if (lizlll != null) {
            final Iterator<0x9> iterator = lizlll.LIZ.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ();
            }
            lizlll.LIZ.clear();
        }
        this.LIZLLL = null;
        0jz.LIZLLL().unsubscribe(1Sy.class, this.LIZJ);
        0ba.LIZ(4, this.LIZ(), "unObserverLinkedListChanged");
        0ba.LIZ(3, this.LIZ(), "onDestroy");
        CTM.LIZ((Object)this);
        0wQ.LIZ = null;
        CTM.LIZ((Object)this);
        1mg.LJIIIZ = null;
    }
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
