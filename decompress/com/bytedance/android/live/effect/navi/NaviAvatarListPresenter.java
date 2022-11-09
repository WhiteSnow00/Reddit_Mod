// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.navi;

import X.0hn;
import X.2d6;
import X.1LB;
import X.1LA;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.3VJ;
import X.1Lc;
import X.FAt;
import X.F0m;
import X.FBF;
import X.1Lb;
import com.bytedance.android.live.effect.navi.service.NaviAvatarApi;
import X.0CC;
import X.0Bg;
import java.util.ArrayList;
import X.0hk;
import java.util.Iterator;
import X.8si;
import X.2P9;
import X.SRS;
import X.F5g;
import X.0ba;
import X.0CH;
import X.1LC;
import java.util.List;
import X.0Bf;
import X.0CG;
import kotlin.jvm.internal.n;
import X.0Bx;
import X.0Bu;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0gc;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0hm;
import X.6mZ;
import X.GfS;

public final class NaviAvatarListPresenter implements GfS, 6mZ
{
    public final NaviAvatarListViewModel LIZ;
    public 0hm LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final DataChannel LJFF;
    public final Fragment LJI;
    public final 0gc LJII;
    
    static {
        Covode.recordClassIndex(6484);
    }
    
    public NaviAvatarListPresenter(final DataChannel ljff, final Fragment lji, final 0gc ljii) {
        CTM.LIZ((Object)ljff, (Object)lji, (Object)ljii);
        this.LJFF = ljff;
        this.LJI = lji;
        this.LJII = ljii;
        final NaviAvatarListViewModel liz = new 0Bu(lji).LIZ(NaviAvatarListViewModel.class);
        n.LIZIZ((Object)liz, "");
        final NaviAvatarListViewModel liz2 = liz;
        this.LIZ = liz2;
        this.LIZLLL = true;
        this.LJ = true;
        lji.getLifecycle().LIZ((0CG)this);
        ljii.LIZ((GfS)this);
        liz2.LIZIZ.observe(lji, new 0Bf<Object>() {
            static {
                Covode.recordClassIndex(6485);
            }
        });
    }
    
    public final void LIZ(final int n, final int n2, final int n3, final String s) {
        if ((n.LIZ((Object)s, (Object)"entry_point") || n.LIZ((Object)s, (Object)"head")) && n2 == 3) {
            0ba.LIZ(4, "LiveNaviAvatar", "receive entry_point message");
            this.LIZJ = true;
            this.LIZ(this.LIZ.LIZIZ.getValue());
        }
    }
    
    public final void LIZ(final int lizlll, final 1LC 1lc) {
        public final class 1tR extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ 0hm LIZ;
            public final /* synthetic */ NaviAvatarListPresenter LIZIZ;
            
            static {
                Covode.recordClassIndex(6486);
            }
            
            public 1tR(final 0hm liz, final NaviAvatarListPresenter liziz) {
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
        //     1: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LIZ:Lcom/bytedance/android/live/effect/navi/NaviAvatarListViewModel;
        //     4: astore_3       
        //     5: aload_3        
        //     6: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListViewModel.LIZJ:LX/15z;
        //     9: aconst_null    
        //    10: invokevirtual   androidx/lifecycle/LiveData.postValue:(Ljava/lang/Object;)V
        //    13: aload_3        
        //    14: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListViewModel.LIZLLL:LX/15z;
        //    17: iload_1        
        //    18: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    21: invokevirtual   androidx/lifecycle/LiveData.postValue:(Ljava/lang/Object;)V
        //    24: getstatic       X/0hk.LIZJ:Ljava/util/Map;
        //    27: aload_2        
        //    28: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    33: ifne            47
        //    36: aload_0        
        //    37: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LIZ:Lcom/bytedance/android/live/effect/navi/NaviAvatarListViewModel;
        //    40: iload_1        
        //    41: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    44: invokevirtual   com/bytedance/android/live/effect/navi/NaviAvatarListViewModel.LIZ:(Ljava/lang/Integer;)V
        //    47: new             LX/0hm;
        //    50: dup            
        //    51: aload_0        
        //    52: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LJI:Landroidx/fragment/app/Fragment;
        //    55: aload_0        
        //    56: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LJII:LX/0gc;
        //    59: invokespecial   X/0hm.<init>:(Landroidx/fragment/app/Fragment;LX/0gc;)V
        //    62: astore_3       
        //    63: getstatic       X/0hk.LIZ:LX/1LC;
        //    66: ifnull          659
        //    69: getstatic       X/0hk.LIZIZ:Z
        //    72: ifne            669
        //    75: iconst_1       
        //    76: istore          4
        //    78: new             LX/1tR;
        //    81: dup            
        //    82: aload_3        
        //    83: aload_0        
        //    84: invokespecial   X/1tR.<init>:(LX/0hm;Lcom/bytedance/android/live/effect/navi/NaviAvatarListPresenter;)V
        //    87: astore          5
        //    89: aload_2        
        //    90: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    93: aload_3        
        //    94: getfield        X/0hm.LIZIZ:LX/1LC;
        //    97: ifnull          137
        //   100: bipush          6
        //   102: ldc             "LiveNaviAvatar"
        //   104: ldc             "NaviEffectLoader load() method can only be called once. "
        //   106: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   109: iload_1        
        //   110: putstatic       X/0hk.LIZLLL:I
        //   113: aload_0        
        //   114: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   117: ldc             LX/GtX;.class
        //   119: new             LX/0Wp;
        //   122: dup            
        //   123: getstatic       X/0gZ.LIZIZ:Ljava/lang/String;
        //   126: aconst_null    
        //   127: ldc             ""
        //   129: invokespecial   X/0Wp.<init>:(Ljava/lang/String;Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;Ljava/lang/String;)V
        //   132: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   135: pop            
        //   136: return         
        //   137: aload_3        
        //   138: getfield        X/0hm.LIZJ:Z
        //   141: ifne            109
        //   144: aload_2        
        //   145: putstatic       X/0hk.LIZ:LX/1LC;
        //   148: aload_3        
        //   149: aload_2        
        //   150: putfield        X/0hm.LIZIZ:LX/1LC;
        //   153: getstatic       X/0hk.LIZJ:Ljava/util/Map;
        //   156: aload_2        
        //   157: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   162: ifeq            203
        //   165: getstatic       X/0hk.LIZJ:Ljava/util/Map;
        //   168: aload_2        
        //   169: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   174: checkcast       LX/8u7;
        //   177: astore_2       
        //   178: aload_2        
        //   179: ifnull          109
        //   182: invokestatic    X/0cf.LIZ:()Landroid/os/Handler;
        //   185: new             LX/0hl;
        //   188: dup            
        //   189: aload_2        
        //   190: aload_3        
        //   191: aload           5
        //   193: invokespecial   X/0hl.<init>:(LX/8u7;LX/0hm;LX/SRS;)V
        //   196: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   199: pop            
        //   200: goto            109
        //   203: aload_2        
        //   204: getfield        X/1LC.LIZJ:Ljava/util/List;
        //   207: astore_2       
        //   208: aload_2        
        //   209: ifnull          109
        //   212: aload_2        
        //   213: invokeinterface java/util/Collection.isEmpty:()Z
        //   218: ifeq            224
        //   221: goto            109
        //   224: new             Ljava/util/ArrayList;
        //   227: dup            
        //   228: invokespecial   java/util/ArrayList.<init>:()V
        //   231: astore          6
        //   233: aload_2        
        //   234: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   239: astore          7
        //   241: aload           7
        //   243: invokeinterface java/util/Iterator.hasNext:()Z
        //   248: ifeq            323
        //   251: aload           7
        //   253: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   258: checkcast       LX/1LG;
        //   261: astore_2       
        //   262: aload_3        
        //   263: getfield        X/0hm.LIZ:Lcom/google/gson/Gson;
        //   266: aload_2        
        //   267: invokevirtual   X/1LG.getInfo:()Ljava/lang/String;
        //   270: ldc_w           LX/1LH;.class
        //   273: invokevirtual   com/google/gson/Gson.LIZ:(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
        //   276: checkcast       LX/1LH;
        //   279: astore_2       
        //   280: aload_2        
        //   281: ifnull          241
        //   284: goto            311
        //   287: astore_2       
        //   288: ldc             "LiveNaviAvatar"
        //   290: aload_2        
        //   291: invokestatic    X/0ba.LIZ:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   294: new             LX/1LH;
        //   297: dup            
        //   298: aconst_null    
        //   299: aconst_null    
        //   300: aconst_null    
        //   301: aconst_null    
        //   302: aconst_null    
        //   303: aconst_null    
        //   304: bipush          63
        //   306: aconst_null    
        //   307: invokespecial   X/1LH.<init>:(Ljava/lang/String;Ljava/lang/String;LX/1LI;LX/1LI;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   310: astore_2       
        //   311: aload           6
        //   313: aload_2        
        //   314: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   319: pop            
        //   320: goto            241
        //   323: aload           6
        //   325: checkcast       Ljava/util/List;
        //   328: astore_2       
        //   329: new             Ljava/util/ArrayList;
        //   332: dup            
        //   333: invokespecial   java/util/ArrayList.<init>:()V
        //   336: astore          7
        //   338: aload_2        
        //   339: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   344: astore          6
        //   346: aload           6
        //   348: invokeinterface java/util/Iterator.hasNext:()Z
        //   353: ifeq            389
        //   356: aload           6
        //   358: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   363: checkcast       LX/1LH;
        //   366: invokevirtual   X/1LH.getEffectId:()Ljava/lang/String;
        //   369: astore          8
        //   371: aload           8
        //   373: ifnull          346
        //   376: aload           7
        //   378: aload           8
        //   380: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   385: pop            
        //   386: goto            346
        //   389: aload           7
        //   391: checkcast       Ljava/util/List;
        //   394: astore          7
        //   396: new             Ljava/util/ArrayList;
        //   399: dup            
        //   400: invokespecial   java/util/ArrayList.<init>:()V
        //   403: astore          6
        //   405: aload           7
        //   407: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   412: astore          8
        //   414: aload           8
        //   416: invokeinterface java/util/Iterator.hasNext:()Z
        //   421: ifeq            459
        //   424: aload           8
        //   426: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   431: astore          7
        //   433: aload           7
        //   435: checkcast       Ljava/lang/String;
        //   438: invokeinterface java/lang/CharSequence.length:()I
        //   443: ifle            414
        //   446: aload           6
        //   448: aload           7
        //   450: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   455: pop            
        //   456: goto            414
        //   459: aload           6
        //   461: checkcast       Ljava/util/List;
        //   464: astore          6
        //   466: aload           6
        //   468: invokeinterface java/util/List.isEmpty:()Z
        //   473: ifeq            505
        //   476: aload           5
        //   478: iconst_0       
        //   479: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   482: invokeinterface X/SRS.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   487: pop            
        //   488: bipush          6
        //   490: ldc             "LiveNaviAvatar"
        //   492: ldc_w           "effectIds is empty, just return"
        //   495: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   498: aload_3        
        //   499: invokevirtual   X/0hm.LIZIZ:()V
        //   502: goto            109
        //   505: iload           4
        //   507: ifeq            604
        //   510: new             LX/1LY;
        //   513: dup            
        //   514: aload_3        
        //   515: invokespecial   X/1LY.<init>:(LX/0hm;)V
        //   518: invokestatic    X/FBF.LIZ:(LX/3VJ;)LX/FBF;
        //   521: astore          7
        //   523: aload           7
        //   525: ldc             ""
        //   527: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   530: aload           7
        //   532: aload_3        
        //   533: aload           6
        //   535: invokevirtual   X/0hm.LIZ:(Ljava/util/List;)LX/FBF;
        //   538: getstatic       X/1LZ.LIZ:LX/1LZ;
        //   541: invokestatic    X/FBF.LIZ:(LX/F0m;LX/F0m;LX/FAt;)LX/FBF;
        //   544: astore          6
        //   546: aload           6
        //   548: ldc             ""
        //   550: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   553: aload_3        
        //   554: aload           6
        //   556: getstatic       X/FGw.LIZJ:LX/FFV;
        //   559: invokestatic    X/FAr.LIZIZ:(LX/FFV;)LX/FFV;
        //   562: invokevirtual   X/FBF.LIZIZ:(LX/FFV;)LX/FBF;
        //   565: getstatic       X/F8V.LIZ:LX/FFV;
        //   568: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //   571: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //   574: new             LX/1LS;
        //   577: dup            
        //   578: aload_3        
        //   579: aload           5
        //   581: aload_2        
        //   582: invokespecial   X/1LS.<init>:(LX/0hm;LX/SRS;Ljava/util/List;)V
        //   585: new             LX/1LT;
        //   588: dup            
        //   589: aload_3        
        //   590: aload           5
        //   592: invokespecial   X/1LT.<init>:(LX/0hm;LX/SRS;)V
        //   595: invokevirtual   X/FBF.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   598: putfield        X/0hm.LJ:LX/2fc;
        //   601: goto            109
        //   604: aload_3        
        //   605: aload_3        
        //   606: aload           6
        //   608: invokevirtual   X/0hm.LIZ:(Ljava/util/List;)LX/FBF;
        //   611: getstatic       X/FGw.LIZJ:LX/FFV;
        //   614: invokestatic    X/FAr.LIZIZ:(LX/FFV;)LX/FFV;
        //   617: invokevirtual   X/FBF.LIZIZ:(LX/FFV;)LX/FBF;
        //   620: getstatic       X/F8V.LIZ:LX/FFV;
        //   623: invokestatic    X/F8U.LIZ:(LX/FFV;)LX/FFV;
        //   626: invokevirtual   X/FBF.LIZ:(LX/FFV;)LX/FBF;
        //   629: new             LX/1LU;
        //   632: dup            
        //   633: aload_3        
        //   634: aload           5
        //   636: aload_2        
        //   637: invokespecial   X/1LU.<init>:(LX/0hm;LX/SRS;Ljava/util/List;)V
        //   640: new             LX/1LV;
        //   643: dup            
        //   644: aload_3        
        //   645: aload           5
        //   647: invokespecial   X/1LV.<init>:(LX/0hm;LX/SRS;)V
        //   650: invokevirtual   X/FBF.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   653: putfield        X/0hm.LJ:LX/2fc;
        //   656: goto            109
        //   659: aload_0        
        //   660: getfield        com/bytedance/android/live/effect/navi/NaviAvatarListPresenter.LIZLLL:Z
        //   663: ifne            669
        //   666: goto            75
        //   669: iconst_0       
        //   670: istore          4
        //   672: goto            78
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  262    280    287    311    Ljava/lang/Exception;
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
    
    public final void LIZ(final List<1LC> list) {
        if (this.LIZJ && list != null && !list.isEmpty()) {
            0hk.LJI = true;
            Integer value;
            if ((value = this.LIZ.LIZLLL.getValue()) == null) {
                value = 0;
            }
            n.LIZIZ((Object)value, "");
            final int intValue = value;
            this.LIZ(intValue, (1LC)list.get(intValue));
        }
    }
    
    @0Bg(LIZ = 0CC.a.ON_DESTROY)
    public final void onDestroy() {
        this.LIZ.LIZIZ.setValue(new ArrayList<1LC>());
        final 0hm liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ();
        }
        this.LIZIZ = null;
        this.LJI.getLifecycle().LIZIZ((0CG)this);
        this.LJII.LIZIZ((GfS)this);
    }
    
    @0Bg(LIZ = 0CC.a.ON_RESUME)
    public final void onResume() {
        if (this.LJ) {
            final NaviAvatarListViewModel liz = this.LIZ;
            final 0hn liz2 = liz.LIZ;
            final NaviAvatarApi naviAvatarApi = (NaviAvatarApi)liz2.LIZ.getValue();
            FBF fbf;
            if (naviAvatarApi == null || (fbf = FBF.LIZ((F0m)naviAvatarApi.getNaviList(0, 20), (F0m)naviAvatarApi.getCandidateList(true, 3), (FAt)new 1Lb(liz2))) == null) {
                fbf = FBF.LIZ((3VJ)1Lc.LIZ);
                n.LIZIZ((Object)fbf, "");
            }
            n.LIZIZ((Object)fbf.LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1LA(liz), (2d6)1LB.LIZ), "");
            this.LJ = false;
        }
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        if (a == 0CC.a.ON_DESTROY) {
            this.onDestroy();
            return;
        }
        if (a == 0CC.a.ON_RESUME) {
            this.onResume();
        }
    }
}
