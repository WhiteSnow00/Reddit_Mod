// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

import ad.c0;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public interface AudioProcessor
{
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    
    void a(final ByteBuffer p0);
    
    boolean b();
    
    void c();
    
    a d(final a p0) throws UnhandledAudioFormatException;
    
    void flush();
    
    ByteBuffer getOutput();
    
    boolean isActive();
    
    void reset();
    
    public static final class UnhandledAudioFormatException extends Exception
    {
        public UnhandledAudioFormatException(final a a) {
            final String value = String.valueOf(a);
            super(b.d(value.length() + 18, "Unhandled format: ", value));
        }
    }
    
    public static final class a
    {
        public static final a e;
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        
        static {
            e = new a(-1, -1, -1);
        }
        
        public a(int x, final int b, final int c) {
            this.a = x;
            this.b = b;
            this.c = c;
            if (c0.H(c)) {
                x = c0.x(c, b);
            }
            else {
                x = -1;
            }
            this.d = x;
        }
        
        @Override
        public final String toString() {
            final int a = this.a;
            final int b = this.b;
            final int c = this.c;
            final StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(a);
            sb.append(", channelCount=");
            sb.append(b);
            sb.append(", encoding=");
            sb.append(c);
            sb.append(']');
            return sb.toString();
        }
    }
}
