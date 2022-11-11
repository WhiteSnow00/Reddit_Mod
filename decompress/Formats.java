// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import ak0.n;
import android.media.MediaFormat;
import java.util.Arrays;
import java.nio.ByteBuffer;

class Formats
{
    private static final byte[] NAL_START_CODE;
    private static final int NAL_UNIT_TYPE_AUD = 9;
    private static final int NAL_UNIT_TYPE_IDR = 5;
    private static final int NAL_UNIT_TYPE_PPS = 8;
    private static final int NAL_UNIT_TYPE_SEI = 6;
    private static final int NAL_UNIT_TYPE_SLICE = 1;
    private static final int NAL_UNIT_TYPE_SPS = 7;
    
    static {
        NAL_START_CODE = new byte[] { 0, 0, 0, 1 };
    }
    
    private Formats() {
    }
    
    private static ByteBuffer addNALStartCodes(ByteBuffer allocateDirect) {
        ByteBuffer allocateDirect2 = allocateDirect;
        if (allocateDirect == null) {
            allocateDirect2 = ByteBuffer.allocateDirect(4);
        }
        if (allocateDirect2.remaining() > 4) {
            final byte[] array = new byte[4];
            allocateDirect2.get(array);
            allocateDirect2.rewind();
            if (Arrays.equals(array, Formats.NAL_START_CODE)) {
                return allocateDirect2;
            }
        }
        allocateDirect = ByteBuffer.allocateDirect(allocateDirect2.remaining() + 4);
        allocateDirect.put(Formats.NAL_START_CODE);
        allocateDirect.put(allocateDirect2);
        allocateDirect.rewind();
        return allocateDirect;
    }
    
    public static void avcDiscardToSPS(final MediaSample mediaSample) {
        final ByteBuffer buffer = mediaSample.buffer;
        int n;
        int n4;
        for (int i = n = 0; i < mediaSample.size; ++i, n = n4) {
            final int n2 = buffer.get(i) & 0xFF;
            boolean b = true;
            if (n != 3 || n2 != 1) {
                b = false;
            }
            if (b) {
                final int n3 = i + 1;
                if (n3 >= mediaSample.size) {
                    return;
                }
                n4 = n;
                if ((buffer.get(n3) & 0x1F) == 0x7) {
                    final ByteBuffer duplicate = buffer.duplicate();
                    duplicate.position(i - n);
                    buffer.rewind();
                    buffer.limit(duplicate.remaining());
                    buffer.put(duplicate);
                    buffer.position(0);
                    return;
                }
            }
            else if (n2 == 0) {
                n4 = n + 1;
            }
            else {
                n4 = 0;
            }
        }
    }
    
    public static MediaFormat createAudioFormat(String removeParameters, final ByteBuffer[] array, int i, final int n, final ByteBuffer[] array2) {
        if ("audio/aac".equals(removeParameters = MediaType.removeParameters(removeParameters))) {
            removeParameters = "audio/mp4a-latm";
        }
        final MediaFormat audioFormat = MediaFormat.createAudioFormat(removeParameters, i, n);
        if (array != null) {
            for (i = 0; i < array.length; ++i) {
                audioFormat.setByteBuffer(n.k("csd-", i), array[i]);
            }
        }
        setProtectionData(audioFormat, array2);
        return audioFormat;
    }
    
    public static MediaFormat createTextFormat(final String s) {
        return MediaFormat.createSubtitleFormat(MediaType.removeParameters(s), (String)null);
    }
    
    public static MediaFormat createVideoFormat(final String s, final ByteBuffer[] array, int i, final int n, final ByteBuffer[] array2) {
        final MediaFormat videoFormat = MediaFormat.createVideoFormat(MediaType.removeParameters(s), i, n);
        i = 0;
        videoFormat.setInteger("max-input-size", 0);
        if (array != null) {
            while (i < array.length) {
                final ByteBuffer addNALStartCodes = addNALStartCodes(array[i]);
                array[i] = addNALStartCodes;
                if (addNALStartCodes.remaining() > 4) {
                    videoFormat.setByteBuffer(n.k("csd-", i), array[i]);
                }
                ++i;
            }
        }
        setProtectionData(videoFormat, array2);
        return videoFormat;
    }
    
    private static void setProtectionData(final MediaFormat mediaFormat, final ByteBuffer[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                mediaFormat.setByteBuffer(n.k("drm-", i), array[i]);
            }
        }
    }
}
