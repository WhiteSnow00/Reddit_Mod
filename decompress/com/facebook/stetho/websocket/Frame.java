// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import ak0.n;
import java.io.InputStream;

class Frame
{
    public static final byte OPCODE_BINARY_FRAME = 2;
    public static final byte OPCODE_CONNECTION_CLOSE = 8;
    public static final byte OPCODE_CONNECTION_PING = 9;
    public static final byte OPCODE_CONNECTION_PONG = 10;
    public static final byte OPCODE_TEXT_FRAME = 1;
    public boolean fin;
    public boolean hasMask;
    public byte[] maskingKey;
    public byte opcode;
    public byte[] payloadData;
    public long payloadLen;
    public boolean rsv1;
    public boolean rsv2;
    public boolean rsv3;
    
    public Frame() {
    }
    
    private void decodeFirstByte(final byte b) {
        final boolean b2 = true;
        this.fin = ((b & 0x80) != 0x0);
        this.rsv1 = ((b & 0x40) != 0x0);
        this.rsv2 = ((b & 0x20) != 0x0);
        this.rsv3 = ((b & 0x10) != 0x0 && b2);
        this.opcode = (byte)(b & 0xF);
    }
    
    private long decodeLength(final byte b, final InputStream inputStream) throws IOException {
        if (b <= 125) {
            return b;
        }
        if (b == 126) {
            return (readByteOrThrow(inputStream) & 0xFF) << 8 | (readByteOrThrow(inputStream) & 0xFF);
        }
        if (b == 127) {
            long n = 0L;
            for (int i = 0; i < 8; ++i) {
                n = (n << 8 | (long)(readByteOrThrow(inputStream) & 0xFF));
            }
            return n;
        }
        throw new IOException(n.k("Unexpected length byte: ", (int)b));
    }
    
    private static byte[] decodeMaskingKey(final InputStream inputStream) throws IOException {
        final byte[] array = new byte[4];
        readBytesOrThrow(inputStream, array, 0, 4);
        return array;
    }
    
    private byte encodeFirstByte() {
        byte b;
        if (this.fin) {
            b = (byte)128;
        }
        else {
            b = 0;
        }
        byte b2 = b;
        if (this.rsv1) {
            b2 = (byte)(b | 0x40);
        }
        byte b3 = b2;
        if (this.rsv2) {
            b3 = (byte)(b2 | 0x20);
        }
        byte b4 = b3;
        if (this.rsv3) {
            b4 = (byte)(b3 | 0x10);
        }
        return (byte)(b4 | (this.opcode & 0xF));
    }
    
    private static byte[] encodeLength(final long n) {
        if (n <= 125L) {
            return new byte[] { (byte)n };
        }
        if (n <= 65535L) {
            return new byte[] { 126, (byte)(n >> 8 & 0xFFL), (byte)(n & 0xFFL) };
        }
        return new byte[] { 127, (byte)(n >> 56 & 0xFFL), (byte)(n >> 48 & 0xFFL), (byte)(n >> 40 & 0xFFL), (byte)(n >> 32 & 0xFFL), (byte)(n >> 24 & 0xFFL), (byte)(n >> 16 & 0xFFL), (byte)(n >> 8 & 0xFFL), (byte)(n & 0xFFL) };
    }
    
    private static byte readByteOrThrow(final InputStream inputStream) throws IOException {
        final int read = inputStream.read();
        if (read != -1) {
            return (byte)read;
        }
        throw new EOFException();
    }
    
    private static void readBytesOrThrow(final InputStream inputStream, final byte[] array, int n, int i) throws IOException {
        while (i > 0) {
            final int read = inputStream.read(array, n, i);
            if (read == -1) {
                throw new EOFException();
            }
            i -= read;
            n += read;
        }
    }
    
    public void readFrom(final BufferedInputStream bufferedInputStream) throws IOException {
        this.decodeFirstByte(readByteOrThrow(bufferedInputStream));
        final byte byteOrThrow = readByteOrThrow(bufferedInputStream);
        this.hasMask = ((byteOrThrow & 0x80) != 0x0);
        this.payloadLen = this.decodeLength((byte)(byteOrThrow & 0xFFFFFF7F), bufferedInputStream);
        byte[] decodeMaskingKey;
        if (this.hasMask) {
            decodeMaskingKey = decodeMaskingKey(bufferedInputStream);
        }
        else {
            decodeMaskingKey = null;
        }
        this.maskingKey = decodeMaskingKey;
        final long payloadLen = this.payloadLen;
        readBytesOrThrow(bufferedInputStream, this.payloadData = new byte[(int)payloadLen], 0, (int)payloadLen);
        MaskingHelper.unmask(this.maskingKey, this.payloadData, 0, (int)this.payloadLen);
    }
    
    public void writeTo(final BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write(this.encodeFirstByte());
        final byte[] encodeLength = encodeLength(this.payloadLen);
        if (this.hasMask) {
            encodeLength[0] |= (byte)128;
        }
        bufferedOutputStream.write(encodeLength, 0, encodeLength.length);
        if (!this.hasMask) {
            bufferedOutputStream.write(this.payloadData, 0, (int)this.payloadLen);
            return;
        }
        throw new UnsupportedOperationException("Writing masked data not implemented");
    }
}
