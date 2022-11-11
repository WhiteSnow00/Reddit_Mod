// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint$Style;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Canvas;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Bitmap;
import android.graphics.Paint;

public class 1eO extends 106
{
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final 5DO LJI;
    public final boolean LJII;
    public final Paint LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public final 1eJ LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public final 5DO LJJIII;
    public final 5DO LJJIIJ;
    public int LJJIIJZLJL;
    public final Bitmap LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public final int LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final int LJJIJIL;
    public final int LJJIJL;
    public int LJJIJLIJ;
    public final Bitmap LJJIL;
    public final Bitmap LJJIZ;
    public String LJJJ;
    public final int LJJJI;
    public final int LJJJIL;
    
    static {
        Covode.recordClassIndex(10667);
    }
    
    public 1eO(final Context context, final Bitmap decodeResource, final Bitmap ljjiz, final String ljjj, final int ljjijl, final int ljjjil, final 1eJ ljil) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   X/106.<init>:(Landroid/content/Context;)V
        //     9: sipush          7828
        //    12: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    15: aload_0        
        //    16: aload_2        
        //    17: putfield        X/1eO.LJJIL:Landroid/graphics/Bitmap;
        //    20: aload_0        
        //    21: aload_3        
        //    22: putfield        X/1eO.LJJIZ:Landroid/graphics/Bitmap;
        //    25: aload_0        
        //    26: aload           4
        //    28: putfield        X/1eO.LJJJ:Ljava/lang/String;
        //    31: aload_0        
        //    32: iload           5
        //    34: putfield        X/1eO.LJJJI:I
        //    37: aload_0        
        //    38: iload           6
        //    40: putfield        X/1eO.LJJJIL:I
        //    43: aload_0        
        //    44: aload           7
        //    46: putfield        X/1eO.LJIL:LX/1eJ;
        //    49: aload           7
        //    51: ifnull          482
        //    54: aload           7
        //    56: getfield        X/1eJ.LJIIL:I
        //    59: istore          5
        //    61: aload_0        
        //    62: iload           5
        //    64: putfield        X/1eO.LIZ:I
        //    67: iconst_0       
        //    68: istore          6
        //    70: aload           7
        //    72: ifnull          476
        //    75: aload           7
        //    77: getfield        X/1eJ.LJI:Z
        //    80: istore          8
        //    82: aload_0        
        //    83: iload           8
        //    85: putfield        X/1eO.LIZIZ:Z
        //    88: aload           7
        //    90: ifnull          470
        //    93: aload           7
        //    95: getfield        X/1eJ.LIZ:Z
        //    98: istore          8
        //   100: aload_0        
        //   101: iload           8
        //   103: putfield        X/1eO.LIZJ:Z
        //   106: aload           7
        //   108: ifnull          464
        //   111: aload           7
        //   113: getfield        X/1eJ.LIZIZ:Z
        //   116: istore          9
        //   118: aload_0        
        //   119: iload           9
        //   121: putfield        X/1eO.LIZLLL:Z
        //   124: aload           7
        //   126: ifnull          458
        //   129: aload           7
        //   131: getfield        X/1eJ.LIZJ:Z
        //   134: istore          10
        //   136: aload_0        
        //   137: iload           10
        //   139: putfield        X/1eO.LJ:Z
        //   142: aload           7
        //   144: ifnull          452
        //   147: aload           7
        //   149: getfield        X/1eJ.LIZLLL:Z
        //   152: istore          11
        //   154: aload_0        
        //   155: iload           11
        //   157: putfield        X/1eO.LJFF:Z
        //   160: aload_0        
        //   161: new             LX/2AR;
        //   164: dup            
        //   165: aload_0        
        //   166: invokespecial   X/2AR.<init>:(LX/1eO;)V
        //   169: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //   172: putfield        X/1eO.LJI:LX/5DO;
        //   175: iconst_1       
        //   176: istore          12
        //   178: aload_0        
        //   179: new             Landroid/graphics/Paint;
        //   182: dup            
        //   183: iconst_1       
        //   184: invokespecial   android/graphics/Paint.<init>:(I)V
        //   187: putfield        X/1eO.LJIILJJIL:Landroid/graphics/Paint;
        //   190: iload           8
        //   192: ifne            446
        //   195: iload           9
        //   197: ifne            446
        //   200: iload           10
        //   202: ifne            446
        //   205: iload           11
        //   207: ifne            439
        //   210: iconst_1       
        //   211: istore          9
        //   213: aload_0        
        //   214: iload           9
        //   216: putfield        X/1eO.LJII:Z
        //   219: aload           7
        //   221: ifnull          433
        //   224: aload           7
        //   226: getfield        X/1eJ.LJ:Z
        //   229: istore          9
        //   231: aload_0        
        //   232: iload           9
        //   234: putfield        X/1eO.LJJ:Z
        //   237: aload           7
        //   239: ifnull          427
        //   242: aload           7
        //   244: getfield        X/1eJ.LJFF:Z
        //   247: istore          9
        //   249: aload_0        
        //   250: iload           9
        //   252: putfield        X/1eO.LJJI:Z
        //   255: aload           7
        //   257: ifnull          421
        //   260: aload           7
        //   262: getfield        X/1eJ.LJII:I
        //   265: istore          5
        //   267: aload_0        
        //   268: iload           5
        //   270: putfield        X/1eO.LJJIFFI:I
        //   273: aload           7
        //   275: ifnull          415
        //   278: aload           7
        //   280: getfield        X/1eJ.LJIIIIZZ:I
        //   283: istore          5
        //   285: aload_0        
        //   286: iload           5
        //   288: putfield        X/1eO.LJJII:I
        //   291: aload_0        
        //   292: iconst_m1      
        //   293: putfield        X/1eO.LJIILL:I
        //   296: aload_0        
        //   297: aload_1        
        //   298: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   301: ldc             2131165573
        //   303: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   306: putfield        X/1eO.LJIILLIIL:I
        //   309: aload           7
        //   311: ifnull          409
        //   314: aload           7
        //   316: getfield        X/1eJ.LJIIIZ:I
        //   319: istore          5
        //   321: aload_0        
        //   322: iload           5
        //   324: putfield        X/1eO.LJIIZILJ:I
        //   327: aload           7
        //   329: ifnull          403
        //   332: aload           7
        //   334: getfield        X/1eJ.LJIIJ:I
        //   337: istore          5
        //   339: aload_0        
        //   340: iload           5
        //   342: putfield        X/1eO.LJIJ:I
        //   345: aload_0        
        //   346: getstatic       X/2AT.LIZ:LX/2AT;
        //   349: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   352: putfield        X/1eO.LJJIII:LX/5DO;
        //   355: aload_0        
        //   356: sipush          600
        //   359: putfield        X/1eO.LJIJI:I
        //   362: aload_0        
        //   363: getstatic       X/2AS.LIZ:LX/2AS;
        //   366: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //   369: putfield        X/1eO.LJJIIJ:LX/5DO;
        //   372: iload           8
        //   374: ifeq            397
        //   377: aload_1        
        //   378: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   381: ldc             2131166231
        //   383: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   386: istore          5
        //   388: aload_0        
        //   389: iload           5
        //   391: putfield        X/1eO.LJJIIJZLJL:I
        //   394: goto            488
        //   397: iconst_0       
        //   398: istore          5
        //   400: goto            388
        //   403: iconst_0       
        //   404: istore          5
        //   406: goto            339
        //   409: iconst_0       
        //   410: istore          5
        //   412: goto            321
        //   415: iconst_0       
        //   416: istore          5
        //   418: goto            285
        //   421: iconst_0       
        //   422: istore          5
        //   424: goto            267
        //   427: iconst_0       
        //   428: istore          9
        //   430: goto            249
        //   433: iconst_0       
        //   434: istore          9
        //   436: goto            231
        //   439: aload_3        
        //   440: ifnonnull       446
        //   443: goto            210
        //   446: iconst_0       
        //   447: istore          9
        //   449: goto            213
        //   452: iconst_0       
        //   453: istore          11
        //   455: goto            154
        //   458: iconst_0       
        //   459: istore          10
        //   461: goto            136
        //   464: iconst_0       
        //   465: istore          9
        //   467: goto            118
        //   470: iconst_0       
        //   471: istore          8
        //   473: goto            100
        //   476: iconst_0       
        //   477: istore          8
        //   479: goto            82
        //   482: iconst_m1      
        //   483: istore          5
        //   485: goto            61
        //   488: aload_1        
        //   489: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   492: ldc             2131231178
        //   494: invokestatic    android/graphics/BitmapFactory.decodeResource:(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
        //   497: astore_2       
        //   498: aload_2        
        //   499: invokestatic    X/F1k.constructor-impl:(Ljava/lang/Object;)Ljava/lang/Object;
        //   502: pop            
        //   503: goto            517
        //   506: astore_2       
        //   507: aload_2        
        //   508: invokestatic    X/F1j.LIZ:(Ljava/lang/Throwable;)Ljava/lang/Object;
        //   511: astore_2       
        //   512: aload_2        
        //   513: invokestatic    X/F1k.constructor-impl:(Ljava/lang/Object;)Ljava/lang/Object;
        //   516: pop            
        //   517: aload_2        
        //   518: astore_3       
        //   519: aload_2        
        //   520: invokestatic    X/F1k.isFailure-impl:(Ljava/lang/Object;)Z
        //   523: ifeq            528
        //   526: aconst_null    
        //   527: astore_3       
        //   528: aload_0        
        //   529: aload_3        
        //   530: checkcast       Landroid/graphics/Bitmap;
        //   533: putfield        X/1eO.LJJIIZ:Landroid/graphics/Bitmap;
        //   536: aload_0        
        //   537: aload_1        
        //   538: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   541: ldc             2131165572
        //   543: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   546: putfield        X/1eO.LJJIJIIJI:I
        //   549: aload_0        
        //   550: getfield        X/1eO.LIZJ:Z
        //   553: ifeq            634
        //   556: aload_0        
        //   557: getfield        X/1eO.LIZLLL:Z
        //   560: ifne            634
        //   563: aload_0        
        //   564: getfield        X/1eO.LJ:Z
        //   567: ifne            634
        //   570: iload           12
        //   572: istore          8
        //   574: aload_0        
        //   575: iload           8
        //   577: putfield        X/1eO.LJJIJIIJIL:Z
        //   580: iload           8
        //   582: ifeq            625
        //   585: iconst_0       
        //   586: istore          5
        //   588: aload_0        
        //   589: iload           5
        //   591: putfield        X/1eO.LJJIJIL:I
        //   594: iload           8
        //   596: ifeq            616
        //   599: iload           6
        //   601: istore          5
        //   603: aload_0        
        //   604: iload           5
        //   606: putfield        X/1eO.LJJIJL:I
        //   609: sipush          7828
        //   612: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   615: return         
        //   616: aload_0        
        //   617: getfield        X/1eO.LJIJ:I
        //   620: istore          5
        //   622: goto            603
        //   625: aload_0        
        //   626: getfield        X/1eO.LJIIZILJ:I
        //   629: istore          5
        //   631: goto            588
        //   634: iconst_0       
        //   635: istore          8
        //   637: goto            574
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  488    503    506    517    Any
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
    
    private final int LIZ() {
        return ((Number)this.LJI.getValue()).intValue();
    }
    
    public static /* synthetic */ void LIZ(final 1eO 1eO, final Canvas canvas, final Bitmap bitmap, final RectF rectF, final boolean b, final float n) {
        1eO.LIZ(canvas, bitmap, rectF, b, n, null, null);
    }
    
    private final void LIZ(final Canvas canvas, final Bitmap bitmap, final RectF rectF, final boolean b, final float n, final SRT<? super Canvas, ? super RectF, 2P9> srt, final SRT<? super Canvas, ? super RectF, 2P9> srt2) {
        if (bitmap != null && rectF != null) {
            if (b && n > 0.0f) {
                canvas.save();
                canvas.translate(n, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            if (srt != null) {
                srt.invoke((Object)canvas, (Object)rectF);
            }
            canvas.drawBitmap(bitmap, (Rect)null, rectF, this.LJIILJJIL);
            if (srt2 != null) {
                srt2.invoke((Object)canvas, (Object)rectF);
            }
            if (b && n > 0.0f) {
                canvas.restore();
            }
        }
    }
    
    private final RectF LIZJ() {
        return (RectF)this.LJJIII.getValue();
    }
    
    private final Rect LIZLLL() {
        return (Rect)this.LJJIIJ.getValue();
    }
    
    @Override
    public int LIZ(final Paint paint) {
        CTM.LIZ((Object)paint);
        final int liziz = this.LIZIZ();
        this.LJIJJLI = liziz;
        while (true) {
            Label_0248: {
                if (!this.LIZJ) {
                    break Label_0248;
                }
                final Bitmap ljjil = this.LJJIL;
                if (ljjil == null || ljjil.getWidth() <= 0 || this.LJJIL.getHeight() <= 0) {
                    break Label_0248;
                }
                final int ljijj = liziz * this.LJJIL.getWidth() / this.LJJIL.getHeight();
                this.LJIJJ = ljijj;
                int n = 0;
                Label_0098: {
                    if (this.LIZLLL) {
                        final String ljff = this.LJFF();
                        if (ljff != null && ljff.length() != 0) {
                            0fd.LIZ(super.LJIILIIL, paint, super.LJIIJ, this.LJIJI);
                            final String ljff2 = this.LJFF();
                            final String ljff3 = this.LJFF();
                            int length;
                            if (ljff3 != null) {
                                length = ljff3.length();
                            }
                            else {
                                length = 0;
                            }
                            final int ljjijlij = (int)paint.measureText(ljff2, 0, length);
                            this.LJJIJLIJ = ljjijlij;
                            n = ljjijlij + this.LJJIIJZLJL;
                            break Label_0098;
                        }
                    }
                    n = 0;
                }
                while (true) {
                    Label_0169: {
                        if (!this.LJ) {
                            break Label_0169;
                        }
                        final Bitmap ljjiiz = this.LJJIIZ;
                        if (ljjiiz == null) {
                            break Label_0169;
                        }
                        final int width = ljjiiz.getWidth();
                        final int ljjiizi = ljijj + n + width + this.LJJIJIL + this.LJJIJL;
                        this.LJJIIZI = ljjiizi;
                        final int ljjij = ljjiizi + this.LJJII + this.LJJIFFI;
                        this.LJJIJ = ljjij;
                        if (this.LJII) {
                            return 0;
                        }
                        return ljjij;
                    }
                    final int width = 0;
                    continue;
                }
            }
            final int ljijj = 0;
            continue;
        }
    }
    
    @Override
    public void LIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        if (this.LJII) {
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        final boolean ljff = this.LJFF;
        final int n = 0;
        if (ljff) {
            final RectF lizj = this.LIZJ();
            if (this.LIZIZ) {
                lizj.left = (float)(super.LJIIIIZZ - this.LJJIFFI - this.LJJIIZI);
                lizj.right = (float)(super.LJIIIIZZ - this.LJJIFFI);
                lizj.bottom = (float)this.LIZ();
            }
            else {
                lizj.left = (float)this.LJJIFFI;
                lizj.right = this.LJJIFFI + (float)this.LJJIIZI;
                lizj.bottom = (float)this.LIZ();
            }
            if (this.LJJIZ != null) {
                final RectF lizj2 = this.LIZJ();
                final Bitmap ljjiz = this.LJJIZ;
                final boolean b = this.LIZIZ && this.LJJI;
                if (ljjiz.getNinePatchChunk() != null) {
                    final Bitmap ljjiz2 = this.LJJIZ;
                    byte[] ninePatchChunk;
                    if (ljjiz2 != null) {
                        ninePatchChunk = ljjiz2.getNinePatchChunk();
                    }
                    else {
                        ninePatchChunk = null;
                    }
                    final NinePatch ninePatch = new NinePatch(ljjiz2, ninePatchChunk, (String)null);
                    if (b) {
                        canvas.save();
                        canvas.translate(lizj2.right - lizj2.left, 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    ninePatch.draw(canvas, lizj2);
                    if (b) {
                        canvas.restore();
                    }
                }
                else {
                    LIZ(this, canvas, ljjiz, lizj2, b, lizj2.right - lizj2.left);
                }
            }
            else {
                final RectF lizj3 = this.LIZJ();
                paint.setAntiAlias(true);
                paint.setColor(this.LJJJI);
                final int ljiilliil = this.LJIILLIIL;
                canvas.drawRoundRect(lizj3, (float)ljiilliil, (float)ljiilliil, paint);
                paint.setColor(this.LJJJIL);
                paint.setDither(true);
                paint.setStyle(Paint$Style.STROKE);
                paint.setStrokeWidth(I4y.LIZIZ(super.LJIILIIL, 0.5f));
                final int ljiilliil2 = this.LJIILLIIL;
                canvas.drawRoundRect(lizj3, (float)ljiilliil2, (float)ljiilliil2, paint);
            }
        }
        if (this.LIZJ) {
            final Bitmap ljjil = this.LJJIL;
            if (ljjil != null && !ljjil.isRecycled()) {
                int top;
                if (this.LJJIJIIJIL) {
                    top = 0;
                }
                else {
                    top = (this.LIZ() - this.LJIJJLI) / 2;
                }
                final Rect lizlll = this.LIZLLL();
                if (this.LIZIZ) {
                    lizlll.left = super.LJIIIIZZ - this.LJJIJIL - this.LJJIFFI - this.LJIJJ;
                    lizlll.right = super.LJIIIIZZ - this.LJJIJIL - this.LJJIFFI;
                }
                else {
                    lizlll.left = this.LJJIJIL + this.LJJIFFI;
                    lizlll.right = this.LJJIJIL + this.LJJIFFI + this.LJIJJ;
                }
                lizlll.top = top;
                lizlll.bottom = this.LJIJJLI + top;
                this.LIZ(canvas, this.LJJIL, new RectF(this.LIZLLL()), this.LIZIZ && this.LJJ, (float)(super.LJIIIIZZ + this.LIZLLL().left - this.LJJIJIL - this.LJJIFFI), (SRT<? super Canvas, ? super RectF, 2P9>)new 2HE(this), (SRT<? super Canvas, ? super RectF, 2P9>)new 2HF(this));
            }
        }
        if (this.LIZLLL) {
            0fd.LIZ(super.LJIILIIL, paint, super.LJIIJ, this.LJIJI);
            final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            paint.setColor(this.LJIILL);
            paint.setStyle(Paint$Style.FILL);
            int n2;
            if (this.LIZIZ) {
                n2 = super.LJIIIIZZ - this.LJIJJ - this.LJJIIJZLJL - this.LJIIZILJ - this.LJJIFFI - this.LJJIJLIJ;
            }
            else {
                final int right = this.LIZLLL().right;
                final int ljjiijzljl = this.LJJIIJZLJL;
                int ljiizilj = n;
                if (!this.LIZJ) {
                    ljiizilj = this.LJIIZILJ;
                }
                n2 = right + ljjiijzljl + ljiizilj;
            }
            canvas.drawText(String.valueOf(this.LJFF()), (float)n2, (this.LIZ() - fontMetricsInt.bottom - fontMetricsInt.top) / 2.0f, paint);
        }
        if (this.LJ) {
            final Bitmap ljjiiz = this.LJJIIZ;
            if (ljjiiz != null && !ljjiiz.isRecycled()) {
                final int liz = this.LIZ();
                final int height = this.LJJIIZ.getHeight();
                final Rect rect = new Rect();
                if (this.LIZIZ) {
                    rect.left = this.LJIJ + this.LJJII;
                    rect.right = this.LJIJ + this.LJJII + this.LJJIIZ.getWidth();
                }
                else {
                    rect.left = super.LJIIIIZZ - this.LJIJ - this.LJJII - this.LJJIIZ.getWidth();
                    rect.right = super.LJIIIIZZ - this.LJIJ - this.LJJII;
                }
                final int top2 = (liz - height) / 2;
                rect.top = top2;
                rect.bottom = this.LJJIIZ.getHeight() + top2;
                LIZ(this, canvas, this.LJJIIZ, new RectF(rect), this.LIZIZ, (float)(rect.right - rect.left + this.LJIJ * 2));
            }
        }
        paint.reset();
    }
    
    public void LIZ(final Canvas canvas, final RectF rectF) {
        CTM.LIZ((Object)canvas, (Object)rectF);
    }
    
    public int LIZIZ() {
        int n;
        if (this.LIZ == 0 && this.LJJIJIIJIL) {
            n = this.LJJIJIIJI;
        }
        else {
            n = super.LJIIIZ;
        }
        return n;
    }
    
    public void LIZIZ(final Canvas canvas, final RectF rectF) {
        CTM.LIZ((Object)canvas, (Object)rectF);
    }
    
    public String LJFF() {
        return this.LJJJ;
    }
}
