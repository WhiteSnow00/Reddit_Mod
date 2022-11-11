// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffectDatabase;
import java.util.List;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;

public final class 2Ca extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;
    public int LIZLLL;
    public final /* synthetic */ SoundEffectViewModel LJ;
    public final /* synthetic */ long LJFF;
    
    static {
        Covode.recordClassIndex(6644);
    }
    
    public 2Ca(final SoundEffectViewModel lj, final long ljff, final Cye cye) {
        this.LJ = lj;
        this.LJFF = ljff;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Ca(this.LJ, this.LJFF, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object p0) {
        public final class 2CZ extends F5e implements SRT<BFk, Cye<? super Boolean>, Object>
        {
            public int LIZ;
            public final /* synthetic */ 2Ca LIZIZ;
            public final /* synthetic */ 39d LIZJ;
            
            static {
                Covode.recordClassIndex(6645);
            }
            
            public 2CZ(final 2Ca liziz, final 39d lizj, final Cye cye) {
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
                //     4: new             LX/2CZ;
                //     7: dup            
                //     8: aload_0        
                //     9: getfield        X/2CZ.LIZIZ:LX/2Ca;
                //    12: aload_0        
                //    13: getfield        X/2CZ.LIZJ:LX/39d;
                //    16: aload_2        
                //    17: invokespecial   X/2CZ.<init>:(LX/2Ca;LX/39d;LX/Cye;)V
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
                if (this.LIZ == 0) {
                    F1j.LIZ(o);
                    final List list = (List)this.LIZJ.element;
                    final 0iC lizlll = this.LIZIZ.LJ.LIZLLL;
                    final List<0gn> liz = SoundEffectDatabase.LJIIIIZZ.LJIIIIZZ().LIZ();
                    if (liz.isEmpty() ^ true) {
                        lizlll.LIZ().clear();
                        lizlll.LIZ().addAll(liz);
                    }
                    return list.addAll(liz);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        X/2Ca.LIZLLL:I
        //     8: istore_3       
        //     9: ldc             ""
        //    11: astore          4
        //    13: iload_3        
        //    14: tableswitch {
        //                0: 78
        //                1: 115
        //                2: 321
        //                3: 507
        //                4: 742
        //                5: 996
        //                6: 1017
        //                7: 1038
        //                8: 1244
        //                9: 1244
        //          default: 68
        //        }
        //    68: new             Ljava/lang/IllegalStateException;
        //    71: dup            
        //    72: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    74: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    77: athrow         
        //    78: aload_1        
        //    79: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //    82: aload_0        
        //    83: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //    86: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //    89: astore          5
        //    91: getstatic       X/1MT.LIZ:LX/1MT;
        //    94: astore_1       
        //    95: aload_0        
        //    96: iconst_1       
        //    97: putfield        X/2Ca.LIZLLL:I
        //   100: aload           5
        //   102: aload_1        
        //   103: aload_0        
        //   104: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   109: aload_2        
        //   110: if_acmpne       119
        //   113: aload_2        
        //   114: areturn        
        //   115: aload_1        
        //   116: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //   119: new             LX/39d;
        //   122: dup            
        //   123: invokespecial   X/39d.<init>:()V
        //   126: astore_1       
        //   127: aload_1        
        //   128: new             Ljava/util/ArrayList;
        //   131: dup            
        //   132: invokespecial   java/util/ArrayList.<init>:()V
        //   135: putfield        X/39d.element:Ljava/lang/Object;
        //   138: new             Ljava/util/ArrayList;
        //   141: dup            
        //   142: invokespecial   java/util/ArrayList.<init>:()V
        //   145: astore          6
        //   147: aload_1        
        //   148: getfield        X/39d.element:Ljava/lang/Object;
        //   151: checkcast       Ljava/util/List;
        //   154: aload_0        
        //   155: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   158: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZLLL:LX/0iC;
        //   161: invokevirtual   X/0iC.LIZ:()Ljava/util/List;
        //   164: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   169: pop            
        //   170: aload_1        
        //   171: getfield        X/39d.element:Ljava/lang/Object;
        //   174: checkcast       Ljava/util/List;
        //   177: invokeinterface java/util/List.isEmpty:()Z
        //   182: ifeq            240
        //   185: getstatic       X/F2A.LIZJ:LX/F2X;
        //   188: astore          7
        //   190: new             LX/2CZ;
        //   193: astore          5
        //   195: aload           5
        //   197: aload_0        
        //   198: aload_1        
        //   199: aconst_null    
        //   200: invokespecial   X/2CZ.<init>:(LX/2Ca;LX/39d;LX/Cye;)V
        //   203: aload_0        
        //   204: aload_1        
        //   205: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   208: aload_0        
        //   209: aload           6
        //   211: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   214: aload_0        
        //   215: iconst_2       
        //   216: putfield        X/2Ca.LIZLLL:I
        //   219: aload           6
        //   221: astore          8
        //   223: aload_1        
        //   224: astore          9
        //   226: aload           7
        //   228: aload           5
        //   230: aload_0        
        //   231: invokestatic    X/F0x.LIZ:(LX/F2r;LX/SRT;LX/Cye;)Ljava/lang/Object;
        //   234: aload_2        
        //   235: if_acmpne       351
        //   238: aload_2        
        //   239: areturn        
        //   240: aload_0        
        //   241: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   244: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   247: astore          8
        //   249: new             LX/1MU;
        //   252: astore          9
        //   254: aload           9
        //   256: aload_1        
        //   257: getfield        X/39d.element:Ljava/lang/Object;
        //   260: checkcast       Ljava/util/List;
        //   263: invokespecial   X/1MU.<init>:(Ljava/util/List;)V
        //   266: aload_0        
        //   267: aload_1        
        //   268: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   271: aload_0        
        //   272: aload           6
        //   274: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   277: aload_0        
        //   278: bipush          7
        //   280: putfield        X/2Ca.LIZLLL:I
        //   283: aload           6
        //   285: astore          7
        //   287: aload_1        
        //   288: astore          5
        //   290: aload           8
        //   292: aload           9
        //   294: aload_0        
        //   295: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   300: aload_2        
        //   301: if_acmpne       1266
        //   304: aload_2        
        //   305: areturn        
        //   306: astore          9
        //   308: aload           6
        //   310: astore          7
        //   312: aload_1        
        //   313: astore          5
        //   315: aload           9
        //   317: astore_1       
        //   318: goto            1084
        //   321: aload_0        
        //   322: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   325: checkcast       Ljava/util/List;
        //   328: astore          8
        //   330: aload_0        
        //   331: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   334: checkcast       LX/39d;
        //   337: astore          9
        //   339: aload           8
        //   341: astore          7
        //   343: aload           9
        //   345: astore          5
        //   347: aload_1        
        //   348: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //   351: aload           8
        //   353: astore_1       
        //   354: aload           9
        //   356: astore          6
        //   358: aload           8
        //   360: astore          7
        //   362: aload           9
        //   364: astore          5
        //   366: aload           9
        //   368: getfield        X/39d.element:Ljava/lang/Object;
        //   371: checkcast       Ljava/util/List;
        //   374: invokeinterface java/util/Collection.isEmpty:()Z
        //   379: iconst_1       
        //   380: ixor           
        //   381: ifeq            540
        //   384: aload           8
        //   386: astore          7
        //   388: aload           9
        //   390: astore          5
        //   392: aload_0        
        //   393: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   396: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   399: astore          10
        //   401: aload           8
        //   403: astore          7
        //   405: aload           9
        //   407: astore          5
        //   409: new             LX/1MU;
        //   412: astore          11
        //   414: aload           8
        //   416: astore          7
        //   418: aload           9
        //   420: astore          5
        //   422: aload           11
        //   424: aload           9
        //   426: getfield        X/39d.element:Ljava/lang/Object;
        //   429: checkcast       Ljava/util/List;
        //   432: invokespecial   X/1MU.<init>:(Ljava/util/List;)V
        //   435: aload           8
        //   437: astore          7
        //   439: aload           9
        //   441: astore          5
        //   443: aload_0        
        //   444: aload           9
        //   446: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   449: aload           8
        //   451: astore          7
        //   453: aload           9
        //   455: astore          5
        //   457: aload_0        
        //   458: aload           8
        //   460: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   463: aload           8
        //   465: astore          7
        //   467: aload           9
        //   469: astore          5
        //   471: aload_0        
        //   472: iconst_3       
        //   473: putfield        X/2Ca.LIZLLL:I
        //   476: aload           8
        //   478: astore_1       
        //   479: aload           9
        //   481: astore          6
        //   483: aload           8
        //   485: astore          7
        //   487: aload           9
        //   489: astore          5
        //   491: aload           10
        //   493: aload           11
        //   495: aload_0        
        //   496: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   501: aload_2        
        //   502: if_acmpne       540
        //   505: aload_2        
        //   506: areturn        
        //   507: aload_0        
        //   508: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   511: checkcast       Ljava/util/List;
        //   514: astore          9
        //   516: aload_0        
        //   517: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   520: checkcast       LX/39d;
        //   523: astore          6
        //   525: aload           9
        //   527: astore          7
        //   529: aload           6
        //   531: astore          5
        //   533: aload_1        
        //   534: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //   537: aload           9
        //   539: astore_1       
        //   540: aload_1        
        //   541: astore          7
        //   543: aload           6
        //   545: astore          5
        //   547: aload_0        
        //   548: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   551: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZLLL:LX/0iC;
        //   554: astore          11
        //   556: aload_1        
        //   557: astore          7
        //   559: aload           6
        //   561: astore          5
        //   563: aload_0        
        //   564: getfield        X/2Ca.LJFF:J
        //   567: lstore          12
        //   569: aload_1        
        //   570: astore          7
        //   572: aload           6
        //   574: astore          5
        //   576: invokestatic    X/0yr.LIZ:()LX/0yr;
        //   579: ldc             Lcom/bytedance/android/live/effect/api/EffectRelatedApi;.class
        //   581: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   584: checkcast       Lcom/bytedance/android/live/effect/api/EffectRelatedApi;
        //   587: lload           12
        //   589: invokeinterface com/bytedance/android/live/effect/api/EffectRelatedApi.fetchSoundEffect:(J)LX/FBF;
        //   594: invokevirtual   X/FBF.LJII:()LX/FAE;
        //   597: astore          8
        //   599: aload_1        
        //   600: astore          7
        //   602: aload           6
        //   604: astore          5
        //   606: new             LX/1MK;
        //   609: astore          9
        //   611: aload_1        
        //   612: astore          7
        //   614: aload           6
        //   616: astore          5
        //   618: aload           9
        //   620: aload           11
        //   622: invokespecial   X/1MK.<init>:(LX/0iC;)V
        //   625: aload_1        
        //   626: astore          7
        //   628: aload           6
        //   630: astore          5
        //   632: aload           8
        //   634: aload           9
        //   636: invokevirtual   X/FAE.LIZJ:(LX/5Vs;)LX/FAE;
        //   639: getstatic       X/FGw.LIZJ:LX/FFV;
        //   642: invokestatic    X/FAr.LIZIZ:(LX/FFV;)LX/FFV;
        //   645: invokevirtual   X/FAE.LIZIZ:(LX/FFV;)LX/FAE;
        //   648: astore          9
        //   650: aload_1        
        //   651: astore          7
        //   653: aload           6
        //   655: astore          5
        //   657: aload           9
        //   659: ldc             ""
        //   661: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   664: aload_1        
        //   665: astore          7
        //   667: aload           6
        //   669: astore          5
        //   671: aload_0        
        //   672: aload           6
        //   674: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   677: aload_1        
        //   678: astore          7
        //   680: aload           6
        //   682: astore          5
        //   684: aload_0        
        //   685: aload_1        
        //   686: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   689: aload_1        
        //   690: astore          7
        //   692: aload           6
        //   694: astore          5
        //   696: aload_0        
        //   697: aload_1        
        //   698: putfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //   701: aload_1        
        //   702: astore          7
        //   704: aload           6
        //   706: astore          5
        //   708: aload_0        
        //   709: iconst_4       
        //   710: putfield        X/2Ca.LIZLLL:I
        //   713: aload_1        
        //   714: astore          7
        //   716: aload           6
        //   718: astore          5
        //   720: aload           9
        //   722: aload_0        
        //   723: invokestatic    X/F5V.LIZ:(LX/F5U;LX/Cye;)Ljava/lang/Object;
        //   726: astore          9
        //   728: aload           9
        //   730: aload_2        
        //   731: if_acmpne       736
        //   734: aload_2        
        //   735: areturn        
        //   736: aload_1        
        //   737: astore          5
        //   739: goto            787
        //   742: aload_0        
        //   743: getfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //   746: checkcast       Ljava/util/List;
        //   749: astore          8
        //   751: aload_0        
        //   752: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   755: checkcast       Ljava/util/List;
        //   758: astore          7
        //   760: aload_0        
        //   761: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   764: checkcast       LX/39d;
        //   767: astore          5
        //   769: aload_1        
        //   770: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //   773: aload_1        
        //   774: astore          9
        //   776: aload           5
        //   778: astore          6
        //   780: aload           7
        //   782: astore_1       
        //   783: aload           8
        //   785: astore          5
        //   787: aload           9
        //   789: ldc             ""
        //   791: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   794: aload           5
        //   796: aload           9
        //   798: checkcast       Ljava/util/Collection;
        //   801: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   806: pop            
        //   807: aload           6
        //   809: getfield        X/39d.element:Ljava/lang/Object;
        //   812: checkcast       Ljava/util/List;
        //   815: invokeinterface java/util/List.isEmpty:()Z
        //   820: ifeq            898
        //   823: aload_1        
        //   824: invokeinterface java/util/List.isEmpty:()Z
        //   829: ifeq            898
        //   832: aload_0        
        //   833: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   836: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   839: astore          8
        //   841: new             LX/1ML;
        //   844: astore          9
        //   846: aload           9
        //   848: iconst_1       
        //   849: ldc             "list empty"
        //   851: invokespecial   X/1ML.<init>:(ZLjava/lang/String;)V
        //   854: aload_0        
        //   855: aload           6
        //   857: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   860: aload_0        
        //   861: aload_1        
        //   862: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   865: aload_0        
        //   866: aconst_null    
        //   867: putfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //   870: aload_0        
        //   871: iconst_5       
        //   872: putfield        X/2Ca.LIZLLL:I
        //   875: aload_1        
        //   876: astore          7
        //   878: aload           6
        //   880: astore          5
        //   882: aload           8
        //   884: aload           9
        //   886: aload_0        
        //   887: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   892: aload_2        
        //   893: if_acmpne       1266
        //   896: aload_2        
        //   897: areturn        
        //   898: aload_1        
        //   899: astore          7
        //   901: aload           6
        //   903: astore          5
        //   905: aload_1        
        //   906: invokeinterface java/util/Collection.isEmpty:()Z
        //   911: iconst_1       
        //   912: ixor           
        //   913: ifeq            1266
        //   916: aload_0        
        //   917: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //   920: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //   923: astore          9
        //   925: new             LX/1MU;
        //   928: astore          8
        //   930: aload           8
        //   932: aload_1        
        //   933: invokespecial   X/1MU.<init>:(Ljava/util/List;)V
        //   936: aload_0        
        //   937: aload           6
        //   939: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //   942: aload_0        
        //   943: aload_1        
        //   944: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //   947: aload_0        
        //   948: aconst_null    
        //   949: putfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //   952: aload_0        
        //   953: bipush          6
        //   955: putfield        X/2Ca.LIZLLL:I
        //   958: aload_1        
        //   959: astore          7
        //   961: aload           6
        //   963: astore          5
        //   965: aload           9
        //   967: aload           8
        //   969: aload_0        
        //   970: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //   975: aload_2        
        //   976: if_acmpne       1266
        //   979: aload_2        
        //   980: areturn        
        //   981: astore          9
        //   983: aload_1        
        //   984: astore          7
        //   986: aload           6
        //   988: astore          5
        //   990: aload           9
        //   992: astore_1       
        //   993: goto            1084
        //   996: aload_0        
        //   997: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1000: checkcast       Ljava/util/List;
        //  1003: astore          9
        //  1005: aload_0        
        //  1006: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1009: checkcast       LX/39d;
        //  1012: astore          6
        //  1014: goto            1056
        //  1017: aload_0        
        //  1018: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1021: checkcast       Ljava/util/List;
        //  1024: astore          9
        //  1026: aload_0        
        //  1027: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1030: checkcast       LX/39d;
        //  1033: astore          6
        //  1035: goto            1056
        //  1038: aload_0        
        //  1039: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1042: checkcast       Ljava/util/List;
        //  1045: astore          9
        //  1047: aload_0        
        //  1048: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1051: checkcast       LX/39d;
        //  1054: astore          6
        //  1056: aload           9
        //  1058: astore          7
        //  1060: aload           6
        //  1062: astore          5
        //  1064: aload_1        
        //  1065: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //  1068: aload           9
        //  1070: astore          7
        //  1072: aload           6
        //  1074: astore          5
        //  1076: goto            1266
        //  1079: astore_1       
        //  1080: goto            1084
        //  1083: astore_1       
        //  1084: aload           5
        //  1086: getfield        X/39d.element:Ljava/lang/Object;
        //  1089: checkcast       Ljava/util/List;
        //  1092: invokeinterface java/util/List.isEmpty:()Z
        //  1097: ifeq            1172
        //  1100: aload_0        
        //  1101: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //  1104: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //  1107: astore          6
        //  1109: aload_1        
        //  1110: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //  1113: astore_1       
        //  1114: aload_1        
        //  1115: ifnonnull       1169
        //  1118: aload           4
        //  1120: astore_1       
        //  1121: new             LX/1ML;
        //  1124: dup            
        //  1125: iconst_1       
        //  1126: aload_1        
        //  1127: invokespecial   X/1ML.<init>:(ZLjava/lang/String;)V
        //  1130: astore_1       
        //  1131: aload_0        
        //  1132: aload           5
        //  1134: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1137: aload_0        
        //  1138: aload           7
        //  1140: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1143: aload_0        
        //  1144: aconst_null    
        //  1145: putfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //  1148: aload_0        
        //  1149: bipush          8
        //  1151: putfield        X/2Ca.LIZLLL:I
        //  1154: aload           6
        //  1156: aload_1        
        //  1157: aload_0        
        //  1158: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //  1163: aload_2        
        //  1164: if_acmpne       1266
        //  1167: aload_2        
        //  1168: areturn        
        //  1169: goto            1121
        //  1172: aload_0        
        //  1173: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //  1176: getfield        com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZJ:LX/EDN;
        //  1179: astore          6
        //  1181: aload_1        
        //  1182: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //  1185: astore_1       
        //  1186: aload_1        
        //  1187: ifnonnull       1241
        //  1190: aload           4
        //  1192: astore_1       
        //  1193: new             LX/1ML;
        //  1196: dup            
        //  1197: iconst_0       
        //  1198: aload_1        
        //  1199: invokespecial   X/1ML.<init>:(ZLjava/lang/String;)V
        //  1202: astore_1       
        //  1203: aload_0        
        //  1204: aload           5
        //  1206: putfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1209: aload_0        
        //  1210: aload           7
        //  1212: putfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1215: aload_0        
        //  1216: aconst_null    
        //  1217: putfield        X/2Ca.LIZJ:Ljava/lang/Object;
        //  1220: aload_0        
        //  1221: bipush          9
        //  1223: putfield        X/2Ca.LIZLLL:I
        //  1226: aload           6
        //  1228: aload_1        
        //  1229: aload_0        
        //  1230: invokeinterface X/EDN.emit:(Ljava/lang/Object;LX/Cye;)Ljava/lang/Object;
        //  1235: aload_2        
        //  1236: if_acmpne       1266
        //  1239: aload_2        
        //  1240: areturn        
        //  1241: goto            1193
        //  1244: aload_0        
        //  1245: getfield        X/2Ca.LIZIZ:Ljava/lang/Object;
        //  1248: checkcast       Ljava/util/List;
        //  1251: astore          7
        //  1253: aload_0        
        //  1254: getfield        X/2Ca.LIZ:Ljava/lang/Object;
        //  1257: checkcast       LX/39d;
        //  1260: astore          5
        //  1262: aload_1        
        //  1263: invokestatic    X/F1j.LIZ:(Ljava/lang/Object;)V
        //  1266: aload_0        
        //  1267: getfield        X/2Ca.LJ:Lcom/bytedance/android/live/effect/soundeffect/SoundEffectViewModel;
        //  1270: aload           5
        //  1272: getfield        X/39d.element:Ljava/lang/Object;
        //  1275: checkcast       Ljava/util/List;
        //  1278: aload           7
        //  1280: invokevirtual   com/bytedance/android/live/effect/soundeffect/SoundEffectViewModel.LIZ:(Ljava/util/List;Ljava/util/List;)V
        //  1283: getstatic       X/2P9.LIZ:LX/2P9;
        //  1286: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  147    219    306    321    Ljava/lang/Exception;
        //  226    238    306    321    Ljava/lang/Exception;
        //  240    283    306    321    Ljava/lang/Exception;
        //  290    304    306    321    Ljava/lang/Exception;
        //  347    351    1079   1083   Ljava/lang/Exception;
        //  366    384    1079   1083   Ljava/lang/Exception;
        //  392    401    1079   1083   Ljava/lang/Exception;
        //  409    414    1079   1083   Ljava/lang/Exception;
        //  422    435    1079   1083   Ljava/lang/Exception;
        //  443    449    1079   1083   Ljava/lang/Exception;
        //  457    463    1079   1083   Ljava/lang/Exception;
        //  471    476    1079   1083   Ljava/lang/Exception;
        //  491    505    1079   1083   Ljava/lang/Exception;
        //  533    537    1079   1083   Ljava/lang/Exception;
        //  547    556    1079   1083   Ljava/lang/Exception;
        //  563    569    1079   1083   Ljava/lang/Exception;
        //  576    599    1079   1083   Ljava/lang/Exception;
        //  606    611    1079   1083   Ljava/lang/Exception;
        //  618    625    1079   1083   Ljava/lang/Exception;
        //  632    650    1079   1083   Ljava/lang/Exception;
        //  657    664    1079   1083   Ljava/lang/Exception;
        //  671    677    1079   1083   Ljava/lang/Exception;
        //  684    689    1079   1083   Ljava/lang/Exception;
        //  696    701    1079   1083   Ljava/lang/Exception;
        //  708    713    1079   1083   Ljava/lang/Exception;
        //  720    728    1079   1083   Ljava/lang/Exception;
        //  769    773    1083   1084   Ljava/lang/Exception;
        //  787    875    981    996    Ljava/lang/Exception;
        //  882    896    981    996    Ljava/lang/Exception;
        //  905    958    981    996    Ljava/lang/Exception;
        //  965    979    981    996    Ljava/lang/Exception;
        //  1064   1068   1079   1083   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0787:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
