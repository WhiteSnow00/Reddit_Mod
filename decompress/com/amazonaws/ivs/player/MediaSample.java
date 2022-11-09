// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import android.media.MediaCodec$CryptoInfo;
import java.nio.ByteBuffer;

class MediaSample
{
    public final ByteBuffer buffer;
    public final MediaCodec$CryptoInfo cryptoInfo;
    public final long decodeTimeUs;
    public final long durationUs;
    public final boolean isDecodeOnly;
    public final boolean isSyncSample;
    public final long presentationTimeUs;
    public final int size;
    
    public MediaSample(final ByteBuffer buffer, final int size, final long decodeTimeUs, final long presentationTimeUs, final long durationUs, final boolean isSyncSample, final boolean isDecodeOnly) {
        if (buffer != null) {
            this.buffer = buffer;
            this.size = size;
            this.decodeTimeUs = decodeTimeUs;
            this.presentationTimeUs = presentationTimeUs;
            this.durationUs = durationUs;
            this.isSyncSample = isSyncSample;
            this.isDecodeOnly = isDecodeOnly;
            this.cryptoInfo = null;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public MediaSample(final ByteBuffer buffer, final int size, final long decodeTimeUs, final long presentationTimeUs, final long durationUs, final boolean isSyncSample, final boolean isDecodeOnly, final byte[] iv, final byte[] key, final int[] numBytesOfClearData, final int[] numBytesOfEncryptedData, final int numSubSamples, final int mode) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        if (iv == null || iv.length == 0) {
            throw new IllegalArgumentException("Invalid initialization vector");
        }
        if (key != null && key.length != 0) {
            this.buffer = buffer;
            this.size = size;
            this.decodeTimeUs = decodeTimeUs;
            this.presentationTimeUs = presentationTimeUs;
            this.durationUs = durationUs;
            this.isSyncSample = isSyncSample;
            this.isDecodeOnly = isDecodeOnly;
            final MediaCodec$CryptoInfo cryptoInfo = new MediaCodec$CryptoInfo();
            this.cryptoInfo = cryptoInfo;
            cryptoInfo.iv = iv;
            cryptoInfo.key = key;
            cryptoInfo.numBytesOfClearData = numBytesOfClearData;
            cryptoInfo.numBytesOfEncryptedData = numBytesOfEncryptedData;
            cryptoInfo.numSubSamples = numSubSamples;
            cryptoInfo.mode = mode;
            return;
        }
        throw new IllegalArgumentException("Invalid key id");
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Sample: , size=");
        k.append(this.size);
        k.append(", decodeTimeUs=");
        k.append(this.decodeTimeUs);
        k.append(", presentationTimeUs=");
        k.append(this.presentationTimeUs);
        k.append(", durationUs=");
        k.append(this.durationUs);
        k.append(", isSyncSample=");
        k.append(this.isSyncSample);
        k.append(", isDecodeOnly=");
        k.append(this.isDecodeOnly);
        k.append(", cryptoInfo=");
        final MediaCodec$CryptoInfo cryptoInfo = this.cryptoInfo;
        String string;
        if (cryptoInfo == null) {
            string = "";
        }
        else {
            string = cryptoInfo.toString();
        }
        k.append(string);
        return k.toString();
    }
}
