// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

import com.google.protobuf.c1;
import java.io.ByteArrayInputStream;
import cf2.a;
import rg.f$a;
import rg.f;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class MethodDescriptor<ReqT, RespT>
{
    public final MethodType a;
    public final String b;
    public final b<ReqT> c;
    public final b<RespT> d;
    public final Object e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    
    public MethodDescriptor(final MethodType a, final String b, final b c, final b d, final boolean h) {
        new AtomicReferenceArray(2);
        if (a == null) {
            throw new NullPointerException("type");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("fullMethodName");
        }
        this.b = b;
        final int lastIndex = b.lastIndexOf(47);
        if (lastIndex != -1) {
            b.substring(0, lastIndex);
        }
        if (c == null) {
            throw new NullPointerException("requestMarshaller");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            this.e = null;
            this.f = false;
            this.g = false;
            this.h = h;
            return;
        }
        throw new NullPointerException("responseMarshaller");
    }
    
    @Override
    public final String toString() {
        final f$a b = rg.f.b((Object)this);
        b.b((Object)this.b, "fullMethodName");
        b.b((Object)this.a, "type");
        b.c(String.valueOf(this.f), "idempotent");
        b.c(String.valueOf(this.g), "safe");
        b.c(String.valueOf(this.h), "sampledToLocalTracing");
        b.b((Object)this.c, "requestMarshaller");
        b.b((Object)this.d, "responseMarshaller");
        b.b(this.e, "schemaDescriptor");
        b.d = true;
        return b.toString();
    }
    
    public enum MethodType
    {
        BIDI_STREAMING, 
        CLIENT_STREAMING, 
        SERVER_STREAMING, 
        UNARY, 
        UNKNOWN;
        
        public final boolean clientSendsOneMessage() {
            return this == MethodType.UNARY || this == MethodType.SERVER_STREAMING;
        }
        
        public final boolean serverSendsOneMessage() {
            return this == MethodType.UNARY || this == MethodType.CLIENT_STREAMING;
        }
    }
    
    public static final class a<ReqT, RespT>
    {
        public b<ReqT> a;
        public MethodType b;
        public String c;
        public boolean d;
    }
    
    public interface b<T>
    {
        cf2.a a(final Object p0);
        
        c1 b(final ByteArrayInputStream p0);
    }
}
