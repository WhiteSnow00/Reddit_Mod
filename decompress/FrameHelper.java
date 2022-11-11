// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.websocket;

import com.facebook.stetho.common.Utf8Charset;

class FrameHelper
{
    public FrameHelper() {
    }
    
    public static Frame createBinaryFrame(final byte[] array) {
        return createSimpleFrame((byte)2, array);
    }
    
    public static Frame createCloseFrame(final int n, final String s) {
        byte[] encodeUTF8;
        int n2;
        if (s != null) {
            encodeUTF8 = Utf8Charset.encodeUTF8(s);
            n2 = encodeUTF8.length + 2;
        }
        else {
            encodeUTF8 = null;
            n2 = 2;
        }
        final byte[] array = new byte[n2];
        array[0] = (byte)(n >> 8 & 0xFF);
        array[1] = (byte)(n & 0xFF);
        if (encodeUTF8 != null) {
            System.arraycopy(encodeUTF8, 0, array, 2, encodeUTF8.length);
        }
        return createSimpleFrame((byte)8, array);
    }
    
    public static Frame createPingFrame(final byte[] array, final int n) {
        return createSimpleFrame((byte)9, array, n);
    }
    
    public static Frame createPongFrame(final byte[] array, final int n) {
        return createSimpleFrame((byte)10, array, n);
    }
    
    private static Frame createSimpleFrame(final byte b, final byte[] array) {
        return createSimpleFrame(b, array, array.length);
    }
    
    private static Frame createSimpleFrame(final byte b, final byte[] payloadData, final int n) {
        final Frame frame = new Frame();
        frame.fin = true;
        frame.hasMask = false;
        frame.opcode = b;
        frame.payloadLen = n;
        frame.payloadData = payloadData;
        return frame;
    }
    
    public static Frame createTextFrame(final String s) {
        return createSimpleFrame((byte)1, Utf8Charset.encodeUTF8(s));
    }
}
