// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import java.util.Iterator;
import pj.g;
import android.media.MediaFormat;
import android.media.MediaExtractor;
import java.io.IOException;
import com.reddit.video.creation.video.render.decoder.DecoderFactory;
import android.media.MediaCodec;
import android.util.Size;
import java.io.File;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.TextureView;
import android.app.Activity;
import com.reddit.video.creation.video.utils.CameraUtils;

public final class VideoDecoder
{
    private static final String TRACK_IDENTIFIER_VIDEO = "vide";
    
    private VideoDecoder() {
    }
    
    public static int adjustFrameHeight(final int n) {
        int n2;
        if (CameraUtils.supportsNonMultipleOf16()) {
            n2 = n;
            if (n % 2 == 1) {
                n2 = n + 1;
            }
        }
        else {
            n2 = n - n % 16;
        }
        return n2;
    }
    
    public static Matrix configurePreviewTransformation(final Activity activity, final TextureView textureView, final int n, final int n2, final int n3, final int n4) {
        return configurePreviewTransformation(activity, textureView, n, n2, n3, n4, false);
    }
    
    public static Matrix configurePreviewTransformation(final Activity activity, final TextureView textureView, int min, final int n, int max, final int n2, final boolean b) {
        if (max != 0 && n2 != 0 && textureView != null) {
            int rotation;
            if (activity == null) {
                rotation = 0;
            }
            else {
                rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            }
            final Matrix transform = new Matrix();
            final float n3 = (float)min;
            final float n4 = (float)n;
            float n5 = 0.0f;
            final RectF rectF = new RectF(0.0f, 0.0f, n3, n4);
            min = Math.min(max, n2);
            max = Math.max(max, n2);
            final float centerX = rectF.centerX();
            final float centerY = rectF.centerY();
            final float n6 = (float)min;
            final float n7 = (float)max;
            final float n8 = n6 * 1.0f / n7;
            final float n9 = n3 * 1.0f / n4;
            final float n10 = n3 * n7 / (min * n);
            if (!b || n8 <= n9) {
                n5 = centerY;
            }
            transform.postScale(1.0f, n10, centerX, n5);
            if (rotation || 3 == rotation) {
                transform.postRotate((float)((rotation - 2) * 90), centerX, centerY);
            }
            textureView.setTransform(transform);
            return transform;
        }
        return null;
    }
    
    public static Matrix configurePreviewTransformation(final Activity activity, final TextureView textureView, final int n, final int n2, final File file) {
        if (textureView == null) {
            return null;
        }
        final Size videoDimensions = getVideoDimensions(file);
        return configurePreviewTransformation(activity, textureView, n, n2, videoDimensions.getWidth(), videoDimensions.getHeight());
    }
    
    public static MediaCodec createDecoder(final String s) throws IOException {
        return DecoderFactory.createDecoder(s);
    }
    
    public static void encodePlanar(final byte[] array, final byte[] array2, final int n, final int n2) {
        int n3 = n * n2;
        int n4 = n3 / 4 + n3;
        int i = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < n2) {
            int n15;
            int n16;
            for (int j = 0; j < n; ++j, ++n5, n3 = n15, n4 = n16) {
                final byte b = array[n6];
                final int n7 = 255;
                final int n8 = b & 0xFF;
                final int n9 = array[n6 + 1] & 0xFF;
                final int n10 = array[n6 + 2] & 0xFF;
                final byte b2 = array[n6 + 3];
                final int n11 = (a.B(n10, 25, n9 * 129 + n8 * 66, 128) >> 8) + 16;
                final int n12 = (a.B(n10, 112, n8 * -38 - n9 * 74, 128) >> 8) + 128;
                final int n13 = (d.e(n10, 18, n8 * 112 - n9 * 94, 128) >> 8) + 128;
                int n14;
                if (n11 < 0) {
                    n14 = 0;
                }
                else if ((n14 = n11) > 255) {
                    n14 = 255;
                }
                array2[n5] = (byte)n14;
                n15 = n3;
                n16 = n4;
                if (i % 2 == 0) {
                    n15 = n3;
                    n16 = n4;
                    if (n6 % 8 == 0) {
                        int n17;
                        if (n12 < 0) {
                            n17 = 0;
                        }
                        else if ((n17 = n12) > 255) {
                            n17 = 255;
                        }
                        array2[n3] = (byte)n17;
                        int n18;
                        if (n13 < 0) {
                            n18 = 0;
                        }
                        else if (n13 > 255) {
                            n18 = n7;
                        }
                        else {
                            n18 = n13;
                        }
                        array2[n4] = (byte)n18;
                        n16 = n4 + 1;
                        n15 = n3 + 1;
                    }
                }
                n6 += 4;
            }
            ++i;
        }
    }
    
    public static void encodeSemiPlanar(final byte[] array, final byte[] array2, final int n, final int n2) {
        int n3 = n * n2;
        int i = 0;
        int n5;
        int n4 = n5 = i;
        while (i < n2) {
            int j;
            int n6;
            int n15;
            for (j = 0, n6 = n4; j < n; ++j, ++n6, n3 = n15) {
                final byte b = array[n5];
                final int n7 = 255;
                final int n8 = b & 0xFF;
                final int n9 = array[n5 + 1] & 0xFF;
                final int n10 = array[n5 + 2] & 0xFF;
                final byte b2 = array[n5 + 3];
                final int n11 = (a.B(n10, 25, n9 * 129 + n8 * 66, 128) >> 8) + 16;
                final int n12 = (a.B(n10, 112, n8 * -38 - n9 * 74, 128) >> 8) + 128;
                final int n13 = (d.e(n10, 18, n8 * 112 - n9 * 94, 128) >> 8) + 128;
                int n14;
                if (n11 < 0) {
                    n14 = 0;
                }
                else if ((n14 = n11) > 255) {
                    n14 = 255;
                }
                array2[n6] = (byte)n14;
                n15 = n3;
                if (i % 2 == 0) {
                    n15 = n3;
                    if (n5 % 8 == 0) {
                        final int n16 = n3 + 1;
                        int n17;
                        if (n12 < 0) {
                            n17 = 0;
                        }
                        else if ((n17 = n12) > 255) {
                            n17 = 255;
                        }
                        array2[n3] = (byte)n17;
                        final int n18 = n16 + 1;
                        int n19;
                        if (n13 < 0) {
                            n19 = 0;
                        }
                        else if (n13 > 255) {
                            n19 = n7;
                        }
                        else {
                            n19 = n13;
                        }
                        array2[n16] = (byte)n19;
                        n15 = n18;
                    }
                }
                n5 += 4;
            }
            ++i;
            n4 = n6;
        }
    }
    
    public static Size getVideoDimensions(final File file) {
        Label_0076: {
            if (file == null || !file.exists()) {
                break Label_0076;
            }
            try {
                final MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(file.getAbsolutePath());
                final int selectTrackFromMediaExtractor = selectTrackFromMediaExtractor(mediaExtractor, "video/");
                if (selectTrackFromMediaExtractor < 0) {
                    return new Size(0, 0);
                }
                final MediaFormat trackFormat = mediaExtractor.getTrackFormat(selectTrackFromMediaExtractor);
                return new Size(trackFormat.getInteger("width"), trackFormat.getInteger("height"));
                return new Size(0, 0);
            }
            catch (final IOException ex) {
                return new Size(0, 0);
            }
        }
    }
    
    public static long getVideoDurationMs(final String s) {
        try {
            for (final g g : qj.a.b(s).b) {
                if (g.getHandler().equals("vide")) {
                    return (long)(g.getDuration() * 1000.0f / g.x1().g);
                }
            }
            return 0L;
        }
        catch (final Exception ex) {
            return 0L;
        }
    }
    
    public static VideoTimingInfo getVideoTimingInfo(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dstore_1       
        //     4: lconst_1       
        //     5: lstore_3       
        //     6: aload_0        
        //     7: invokestatic    qj/a.b:(Ljava/lang/String;)Lpj/d;
        //    10: getfield        pj/d.b:Ljava/util/List;
        //    13: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    18: astore          5
        //    20: dload_1        
        //    21: dstore          6
        //    23: lload_3        
        //    24: lstore          8
        //    26: aload           5
        //    28: invokeinterface java/util/Iterator.hasNext:()Z
        //    33: ifeq            177
        //    36: aload           5
        //    38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    43: checkcast       Lpj/g;
        //    46: astore_0       
        //    47: aload_0        
        //    48: invokeinterface pj/g.getHandler:()Ljava/lang/String;
        //    53: ldc             "vide"
        //    55: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    58: ifeq            20
        //    61: lconst_0       
        //    62: lstore          8
        //    64: aload_0        
        //    65: invokeinterface pj/g.c2:()[J
        //    70: astore          5
        //    72: aload           5
        //    74: arraylength    
        //    75: istore          10
        //    77: iconst_0       
        //    78: istore          11
        //    80: iconst_0       
        //    81: istore          12
        //    83: iload           11
        //    85: iload           10
        //    87: if_icmpge       115
        //    90: lload           8
        //    92: aload           5
        //    94: iload           11
        //    96: laload         
        //    97: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   100: invokevirtual   java/lang/Long.longValue:()J
        //   103: ladd           
        //   104: lstore          8
        //   106: iinc            12, 1
        //   109: iinc            11, 1
        //   112: goto            83
        //   115: lload           8
        //   117: l2d            
        //   118: iload           12
        //   120: i2d            
        //   121: ddiv           
        //   122: dstore          6
        //   124: aload_0        
        //   125: invokeinterface pj/g.x1:()Lpj/h;
        //   130: getfield        pj/h.g:J
        //   133: lstore          8
        //   135: dconst_1       
        //   136: dload           6
        //   138: lload           8
        //   140: l2d            
        //   141: ddiv           
        //   142: ddiv           
        //   143: dstore          6
        //   145: aload_0        
        //   146: invokeinterface pj/g.x1:()Lpj/h;
        //   151: getfield        pj/h.g:J
        //   154: lstore          8
        //   156: new             Lcom/reddit/video/creation/video/render/VideoTimingInfo;
        //   159: dup            
        //   160: lload           8
        //   162: dload           6
        //   164: invokespecial   com/reddit/video/creation/video/render/VideoTimingInfo.<init>:(JD)V
        //   167: astore_0       
        //   168: aload_0        
        //   169: areturn        
        //   170: astore_0       
        //   171: lload           8
        //   173: lstore_3       
        //   174: lload_3        
        //   175: lstore          8
        //   177: new             Lcom/reddit/video/creation/video/render/VideoTimingInfo;
        //   180: dup            
        //   181: lload           8
        //   183: dload           6
        //   185: invokespecial   com/reddit/video/creation/video/render/VideoTimingInfo.<init>:(JD)V
        //   188: areturn        
        //   189: astore_0       
        //   190: dload_1        
        //   191: dstore          6
        //   193: lload_3        
        //   194: lstore          8
        //   196: goto            177
        //   199: astore_0       
        //   200: goto            174
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  6      20     189    199    Ljava/io/FileNotFoundException;
        //  6      20     189    199    Ljava/lang/Exception;
        //  26     61     189    199    Ljava/io/FileNotFoundException;
        //  26     61     189    199    Ljava/lang/Exception;
        //  64     77     189    199    Ljava/io/FileNotFoundException;
        //  64     77     189    199    Ljava/lang/Exception;
        //  90     106    189    199    Ljava/io/FileNotFoundException;
        //  90     106    189    199    Ljava/lang/Exception;
        //  124    135    189    199    Ljava/io/FileNotFoundException;
        //  124    135    189    199    Ljava/lang/Exception;
        //  145    156    199    203    Ljava/io/FileNotFoundException;
        //  145    156    199    203    Ljava/lang/Exception;
        //  156    168    170    174    Ljava/io/FileNotFoundException;
        //  156    168    170    174    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0174:
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
    
    public static boolean isMediaCodecBufferIndexValid(final int n) {
        return n != -1 && n != -2 && n != -3 && n >= 0;
    }
    
    public static int selectTrackFromMediaExtractor(final MediaExtractor mediaExtractor, final String s) {
        for (int trackCount = mediaExtractor.getTrackCount(), i = 0; i < trackCount; ++i) {
            final MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            if (trackFormat.getString("mime").contains(s)) {
                trackFormat.toString();
                mediaExtractor.selectTrack(i);
                return i;
            }
        }
        return -1;
    }
}
