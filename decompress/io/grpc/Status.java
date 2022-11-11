// 
// Decompiled by Procyon v0.6.0
// 

package io.grpc;

import java.io.Serializable;
import rg.f$a;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import rg.k;
import rg.f;
import lw0.b;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;

public final class Status
{
    public static final List<Status> d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public final Code a;
    public final String b;
    public final Throwable c;
    
    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        final TreeMap treeMap = new TreeMap();
        for (final Code code : Code.values()) {
            final Status status = treeMap.put(code.value(), new Status(code, null, null));
            if (status != null) {
                final StringBuilder r = a.r("Code value duplication between ");
                r.append(status.a.name());
                r.append(" & ");
                r.append(code.name());
                throw new IllegalStateException(r.toString());
            }
        }
        d = Collections.unmodifiableList((List<?>)new ArrayList<Object>(treeMap.values()));
        e = Code.OK.toStatus();
        f = Code.CANCELLED.toStatus();
        g = Code.UNKNOWN.toStatus();
        Code.INVALID_ARGUMENT.toStatus();
        Code.DEADLINE_EXCEEDED.toStatus();
        Code.NOT_FOUND.toStatus();
        Code.ALREADY_EXISTS.toStatus();
        Code.PERMISSION_DENIED.toStatus();
        Code.UNAUTHENTICATED.toStatus();
        Code.RESOURCE_EXHAUSTED.toStatus();
        Code.FAILED_PRECONDITION.toStatus();
        Code.ABORTED.toStatus();
        Code.OUT_OF_RANGE.toStatus();
        Code.UNIMPLEMENTED.toStatus();
        h = Code.INTERNAL.toStatus();
        Code.UNAVAILABLE.toStatus();
        Code.DATA_LOSS.toStatus();
        new a$g("grpc-status", (io.grpc.a.h)new Status.Status$a());
        new a$g("grpc-message", (io.grpc.a.h)new Status.Status$b());
    }
    
    public Status(final Code a, final String b, final Throwable c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("code");
    }
    
    public static String a(final Status status) {
        if (status.b == null) {
            return status.a.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(status.a);
        sb.append(": ");
        sb.append(status.b);
        return sb.toString();
    }
    
    public final Status b(final String s) {
        if (lw0.b.n0((Object)this.b, (Object)s)) {
            return this;
        }
        return new Status(this.a, s, this.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public final String toString() {
        final f$a b = rg.f.b((Object)this);
        b.b((Object)this.a.name(), "code");
        b.b((Object)this.b, "description");
        Serializable s;
        final Throwable t = (Throwable)(s = this.c);
        if (t != null) {
            final Object a = k.a;
            final StringWriter stringWriter = new StringWriter();
            t.printStackTrace(new PrintWriter(stringWriter));
            s = stringWriter.toString();
        }
        b.b((Object)s, "cause");
        return b.toString();
    }
    
    public enum Code
    {
        ABORTED(10), 
        ALREADY_EXISTS(6), 
        CANCELLED(1), 
        DATA_LOSS(15), 
        DEADLINE_EXCEEDED(4), 
        FAILED_PRECONDITION(9), 
        INTERNAL(13), 
        INVALID_ARGUMENT(3), 
        NOT_FOUND(5), 
        OK(0), 
        OUT_OF_RANGE(11), 
        PERMISSION_DENIED(7), 
        RESOURCE_EXHAUSTED(8), 
        UNAUTHENTICATED(16), 
        UNAVAILABLE(14), 
        UNIMPLEMENTED(12), 
        UNKNOWN(2);
        
        private final int value;
        private final byte[] valueAscii;
        
        private Code(final int value) {
            this.value = value;
            this.valueAscii = Integer.toString(value).getBytes(rg.b.a);
        }
        
        private byte[] valueAscii() {
            return this.valueAscii;
        }
        
        public Status toStatus() {
            return Status.d.get(this.value);
        }
        
        public int value() {
            return this.value;
        }
    }
}
