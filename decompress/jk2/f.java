// 
// Decompiled by Procyon v0.6.0
// 

package jk2;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.IOException;
import okio.ByteString;
import java.nio.channels.ReadableByteChannel;

public interface f extends g0, ReadableByteChannel
{
    ByteString C1() throws IOException;
    
    c S0();
    
    void S1(final c p0, final long p1) throws IOException;
    
    ByteString U0(final long p0) throws IOException;
    
    String V0(final Charset p0) throws IOException;
    
    long W0() throws IOException;
    
    String Z0(final long p0) throws IOException;
    
    long a2() throws IOException;
    
    String b1() throws IOException;
    
    void c1(final long p0) throws IOException;
    
    boolean e1() throws IOException;
    
    c getBuffer();
    
    long h1(final ByteString p0) throws IOException;
    
    long j1(final ByteString p0) throws IOException;
    
    int j2() throws IOException;
    
    int m1(final w p0) throws IOException;
    
    boolean n1(final long p0, final ByteString p1) throws IOException;
    
    long p1() throws IOException;
    
    b0 peek();
    
    InputStream r2();
    
    byte readByte() throws IOException;
    
    void readFully(final byte[] p0) throws IOException;
    
    int readInt() throws IOException;
    
    long readLong() throws IOException;
    
    short readShort() throws IOException;
    
    boolean request(final long p0) throws IOException;
    
    long s2(final e0 p0) throws IOException;
    
    void skip(final long p0) throws IOException;
    
    byte[] w1() throws IOException;
}
