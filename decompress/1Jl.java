// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.google.gson.j;
import java.util.Iterator;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.RoomSticker;

public final class 1Jl implements a<RoomSticker>
{
    static {
        Covode.recordClassIndex(6291);
    }
    
    private final RoomSticker LIZ(final m m, final List<String> list, final long ljiil, final String ljiiiizz, final String s) {
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
        ((Guu)roomSticker).LJIILIIL = 5;
        ((Guu)roomSticker).LJIIJJI = s;
        return roomSticker;
    }
    
    private final RoomSticker LIZIZ(final m m, final List<String> list, final long ljiil, String ljiiiizz, final String s) {
        final RoomSticker roomSticker = new RoomSticker();
        ((Guu)roomSticker).LJIIL = ljiil;
        ((Guu)roomSticker).LJIIJJI = s;
        roomSticker.LJIIIIZZ = ljiiiizz;
        ((Guu)roomSticker).LJIJI = 0cB.LIZJ();
        ((Guu)roomSticker).LJIJJ = 0cB.LIZIZ();
        final j lizj = m.LIZJ("top_left_h");
        final int n = 0;
        int lji;
        if (lizj != null) {
            lji = lizj.LJI();
        }
        else {
            lji = 0;
        }
        roomSticker.LIZLLL = lji;
        final j lizj2 = m.LIZJ("top_left_w");
        int lji2;
        if (lizj2 != null) {
            lji2 = lizj2.LJI();
        }
        else {
            lji2 = 0;
        }
        roomSticker.LJ = lji2;
        final j lizj3 = m.LIZJ("bottom_right_h");
        int lji3;
        if (lizj3 != null) {
            lji3 = lizj3.LJI();
        }
        else {
            lji3 = 0;
        }
        roomSticker.LJFF = lji3;
        final j lizj4 = m.LIZJ("bottom_right_w");
        int lji4;
        if (lizj4 != null) {
            lji4 = lizj4.LJI();
        }
        else {
            lji4 = 0;
        }
        roomSticker.LJI = lji4;
        final ArrayList<String> list2 = new ArrayList<String>();
        final ArrayList<String> list3 = new ArrayList<String>();
        final Iterator<Object> iterator = list.iterator();
        String s2;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            s2 = null;
            final String s3 = null;
            if (!hasNext) {
                break;
            }
            final String s4 = iterator.next();
            final StringBuilder sb = new StringBuilder();
            sb.append(s4);
            final j lizj5 = m.LIZJ("image_uri");
            String lizj6;
            if (lizj5 != null) {
                lizj6 = lizj5.LIZJ();
            }
            else {
                lizj6 = null;
            }
            sb.append(lizj6);
            list2.add(sb.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s4);
            final j lizj7 = m.LIZJ("nine_patch_image_uri");
            String lizj8 = s3;
            if (lizj7 != null) {
                lizj8 = lizj7.LIZJ();
            }
            sb2.append(lizj8);
            list3.add(sb2.toString());
        }
        final j lizj9 = m.LIZJ("image_uri");
        String lizj10;
        if (lizj9 != null) {
            lizj10 = lizj9.LIZJ();
        }
        else {
            lizj10 = null;
        }
        roomSticker.LIZIZ = new ImageModel(lizj10, list2);
        final j lizj11 = m.LIZJ("nine_patch_image_uri");
        String lizj12 = s2;
        if (lizj11 != null) {
            lizj12 = lizj11.LIZJ();
        }
        roomSticker.LIZJ = new ImageModel(lizj12, list3);
        final j lizj13 = m.LIZJ("text_size");
        int lji5 = n;
        if (lizj13 != null) {
            lji5 = lizj13.LJI();
        }
        ((Guu)roomSticker).LJIILLIIL = lji5;
        final j lizj14 = m.LIZJ("text_color");
        ljiiiizz = "";
        String lizj15;
        if (lizj14 == null || (lizj15 = lizj14.LIZJ()) == null) {
            lizj15 = "";
        }
        ((Guu)roomSticker).LJIILL = lizj15;
        final j lizj16 = m.LIZJ("type");
        int lji6;
        if (lizj16 != null) {
            lji6 = lizj16.LJI();
        }
        else {
            lji6 = 4;
        }
        ((Guu)roomSticker).LJIILIIL = lji6;
        final j lizj17 = m.LIZJ("content_key");
        String lizj18 = ljiiiizz;
        if (lizj17 != null) {
            lizj18 = lizj17.LIZJ();
            if (lizj18 == null) {
                lizj18 = ljiiiizz;
            }
        }
        roomSticker.LJII = lizj18;
        ((Guu)roomSticker).LJIIJJI = s;
        return roomSticker;
    }
    
    @Override
    public final List<1Km<RoomSticker>> LIZ(final EffectChannelResponse p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: astore_3       
        //    16: aload_1        
        //    17: ifnull          31
        //    20: aload_1        
        //    21: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectChannelResponseTemplate.getUrlPrefix:()Ljava/util/List;
        //    24: astore          4
        //    26: aload           4
        //    28: ifnonnull       39
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: invokespecial   java/util/ArrayList.<init>:()V
        //    38: areturn        
        //    39: aload_1        
        //    40: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectChannelResponseTemplate.getCategoryResponseList:()Ljava/util/List;
        //    43: astore_1       
        //    44: aload_1        
        //    45: ifnull          376
        //    48: aload_1        
        //    49: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    54: astore_1       
        //    55: aload_1        
        //    56: invokeinterface java/util/Iterator.hasNext:()Z
        //    61: ifeq            376
        //    64: aload_1        
        //    65: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    70: checkcast       Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryResponseTemplate;
        //    73: astore          5
        //    75: aload           5
        //    77: invokevirtual   com/ss/ugc/effectplatform/model/EffectCategoryResponse.getKey:()Ljava/lang/String;
        //    80: astore          6
        //    82: aload           6
        //    84: invokevirtual   java/lang/String.hashCode:()I
        //    87: istore          7
        //    89: iload           7
        //    91: ldc             3556653
        //    93: if_icmpeq       229
        //    96: iload           7
        //    98: ldc             100313435
        //   100: if_icmpeq       106
        //   103: goto            55
        //   106: aload           6
        //   108: ldc             "image"
        //   110: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   113: ifeq            55
        //   116: aload           5
        //   118: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryResponseTemplate.getTotalEffects:()Ljava/util/List;
        //   121: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   126: astore          5
        //   128: aload           5
        //   130: invokeinterface java/util/Iterator.hasNext:()Z
        //   135: ifeq            55
        //   138: aload           5
        //   140: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   145: checkcast       Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;
        //   148: astore          6
        //   150: new             Lcom/google/gson/o;
        //   153: astore          8
        //   155: aload           8
        //   157: invokespecial   com/google/gson/o.<init>:()V
        //   160: aload           8
        //   162: aload           6
        //   164: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getExtra:()Ljava/lang/String;
        //   167: invokevirtual   com/google/gson/o.LIZ:(Ljava/lang/String;)Lcom/google/gson/j;
        //   170: astore          8
        //   172: aload           8
        //   174: ldc             ""
        //   176: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   179: aload           8
        //   181: invokevirtual   com/google/gson/j.LJIIL:()Lcom/google/gson/m;
        //   184: astore          8
        //   186: aload           8
        //   188: ldc             ""
        //   190: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   193: aload_2        
        //   194: aload_0        
        //   195: aload           8
        //   197: aload           4
        //   199: aload           6
        //   201: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate.getEffectId:()Ljava/lang/String;
        //   204: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   207: aload           6
        //   209: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getName:()Ljava/lang/String;
        //   212: aload           6
        //   214: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate.getResourceId:()Ljava/lang/String;
        //   217: invokespecial   X/1Jl.LIZ:(Lcom/google/gson/m;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;)Lcom/bytedance/android/livesdk/model/RoomSticker;
        //   220: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   225: pop            
        //   226: goto            128
        //   229: aload           6
        //   231: ldc             "text"
        //   233: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   236: ifeq            55
        //   239: aload           5
        //   241: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryResponseTemplate.getTotalEffects:()Ljava/util/List;
        //   244: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   249: astore          5
        //   251: aload           5
        //   253: invokeinterface java/util/Iterator.hasNext:()Z
        //   258: ifeq            55
        //   261: aload           5
        //   263: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   268: checkcast       Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate;
        //   271: astore          6
        //   273: new             Lcom/google/gson/o;
        //   276: astore          8
        //   278: aload           8
        //   280: invokespecial   com/google/gson/o.<init>:()V
        //   283: aload           8
        //   285: aload           6
        //   287: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getExtra:()Ljava/lang/String;
        //   290: invokevirtual   com/google/gson/o.LIZ:(Ljava/lang/String;)Lcom/google/gson/j;
        //   293: astore          8
        //   295: aload           8
        //   297: ldc             ""
        //   299: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   302: aload           8
        //   304: invokevirtual   com/google/gson/j.LJIIL:()Lcom/google/gson/m;
        //   307: astore          8
        //   309: aload           8
        //   311: ldc             ""
        //   313: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   316: aload_0        
        //   317: aload           8
        //   319: aload           4
        //   321: aload           6
        //   323: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate.getEffectId:()Ljava/lang/String;
        //   326: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   329: aload           6
        //   331: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getName:()Ljava/lang/String;
        //   334: aload           6
        //   336: invokevirtual   com/ss/android/ugc/effectmanager/effect/model/template/EffectTemplate.getResourceId:()Ljava/lang/String;
        //   339: invokespecial   X/1Jl.LIZIZ:(Lcom/google/gson/m;Ljava/util/List;JLjava/lang/String;Ljava/lang/String;)Lcom/bytedance/android/livesdk/model/RoomSticker;
        //   342: astore          8
        //   344: aload           8
        //   346: aload           6
        //   348: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getHint:()Ljava/lang/String;
        //   351: putfield        X/Guu.LJIILJJIL:Ljava/lang/String;
        //   354: aload           8
        //   356: aload           6
        //   358: invokevirtual   com/ss/ugc/effectplatform/model/Effect.getName:()Ljava/lang/String;
        //   361: putfield        com/bytedance/android/livesdk/model/RoomSticker.LJIIIIZZ:Ljava/lang/String;
        //   364: aload_3        
        //   365: aload           8
        //   367: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   372: pop            
        //   373: goto            251
        //   376: new             Ljava/util/ArrayList;
        //   379: dup            
        //   380: invokespecial   java/util/ArrayList.<init>:()V
        //   383: astore_1       
        //   384: getstatic       X/0gZ.LJFF:Ljava/lang/String;
        //   387: astore          4
        //   389: aload           4
        //   391: ldc             ""
        //   393: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   396: getstatic       X/0gZ.LJFF:Ljava/lang/String;
        //   399: astore          5
        //   401: aload           5
        //   403: ldc             ""
        //   405: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   408: aload_1        
        //   409: new             LX/1Km;
        //   412: dup            
        //   413: aload           4
        //   415: aload_2        
        //   416: aload           5
        //   418: invokespecial   X/1Km.<init>:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //   421: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   426: pop            
        //   427: getstatic       X/0gZ.LJI:Ljava/lang/String;
        //   430: astore_2       
        //   431: aload_2        
        //   432: ldc             ""
        //   434: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   437: getstatic       X/0gZ.LJI:Ljava/lang/String;
        //   440: astore          4
        //   442: aload           4
        //   444: ldc             ""
        //   446: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   449: aload_1        
        //   450: new             LX/1Km;
        //   453: dup            
        //   454: aload_2        
        //   455: aload_3        
        //   456: aload           4
        //   458: invokespecial   X/1Km.<init>:(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
        //   461: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   466: pop            
        //   467: aload_1        
        //   468: areturn        
        //   469: astore          6
        //   471: goto            128
        //   474: astore          6
        //   476: goto            251
        //    Signature:
        //  (Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;)Ljava/util/List<LX/1Km<Lcom/bytedance/android/livesdk/model/RoomSticker;>;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  150    226    469    474    Any
        //  273    373    474    479    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0376:
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
