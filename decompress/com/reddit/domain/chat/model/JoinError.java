// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/JoinError;", "", "code", "", "detail", "Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;", "reason", "", "(Ljava/lang/Integer;Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetail", "()Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;Ljava/lang/String;)Lcom/reddit/domain/chat/model/JoinError;", "equals", "", "other", "hashCode", "toString", "JoinErrorDetails", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class JoinError
{
    private final Integer code;
    private final JoinErrorDetails detail;
    private final String reason;
    
    public JoinError(@n(name = "code") final Integer code, @n(name = "detail") final JoinErrorDetails detail, @n(name = "reason") final String reason) {
        this.code = code;
        this.detail = detail;
        this.reason = reason;
    }
    
    public final Integer component1() {
        return this.code;
    }
    
    public final JoinErrorDetails component2() {
        return this.detail;
    }
    
    public final String component3() {
        return this.reason;
    }
    
    public final JoinError copy(@n(name = "code") final Integer n, @n(name = "detail") final JoinErrorDetails joinErrorDetails, @n(name = "reason") final String s) {
        return new JoinError(n, joinErrorDetails, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JoinError)) {
            return false;
        }
        final JoinError joinError = (JoinError)o;
        return e.a((Object)this.code, (Object)joinError.code) && e.a((Object)this.detail, (Object)joinError.detail) && e.a((Object)this.reason, (Object)joinError.reason);
    }
    
    public final Integer getCode() {
        return this.code;
    }
    
    public final JoinErrorDetails getDetail() {
        return this.detail;
    }
    
    public final String getReason() {
        return this.reason;
    }
    
    @Override
    public int hashCode() {
        final Integer code = this.code;
        int hashCode = 0;
        int hashCode2;
        if (code == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = code.hashCode();
        }
        final JoinErrorDetails detail = this.detail;
        int hashCode3;
        if (detail == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = detail.hashCode();
        }
        final String reason = this.reason;
        if (reason != null) {
            hashCode = reason.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("JoinError(code=");
        r.append(this.code);
        r.append(", detail=");
        r.append(this.detail);
        r.append(", reason=");
        return f0.n(r, this.reason, ')');
    }
    
    @o(generateAdapter = true)
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;", "", "message", "", "code", "", "error", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/reddit/domain/chat/model/JoinError$JoinErrorDetails;", "equals", "other", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class JoinErrorDetails
    {
        private final Integer code;
        private final Boolean error;
        private final String message;
        
        public JoinErrorDetails(@n(name = "message") final String message, @n(name = "code") final Integer code, @n(name = "error") final Boolean error) {
            this.message = message;
            this.code = code;
            this.error = error;
        }
        
        public final String component1() {
            return this.message;
        }
        
        public final Integer component2() {
            return this.code;
        }
        
        public final Boolean component3() {
            return this.error;
        }
        
        public final JoinErrorDetails copy(@n(name = "message") final String s, @n(name = "code") final Integer n, @n(name = "error") final Boolean b) {
            return new JoinErrorDetails(s, n, b);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof JoinErrorDetails)) {
                return false;
            }
            final JoinErrorDetails joinErrorDetails = (JoinErrorDetails)o;
            return e.a((Object)this.message, (Object)joinErrorDetails.message) && e.a((Object)this.code, (Object)joinErrorDetails.code) && e.a((Object)this.error, (Object)joinErrorDetails.error);
        }
        
        public final Integer getCode() {
            return this.code;
        }
        
        public final Boolean getError() {
            return this.error;
        }
        
        public final String getMessage() {
            return this.message;
        }
        
        @Override
        public int hashCode() {
            final String message = this.message;
            int hashCode = 0;
            int hashCode2;
            if (message == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = message.hashCode();
            }
            final Integer code = this.code;
            int hashCode3;
            if (code == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = code.hashCode();
            }
            final Boolean error = this.error;
            if (error != null) {
                hashCode = error.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder r = a.r("JoinErrorDetails(message=");
            r.append(this.message);
            r.append(", code=");
            r.append(this.code);
            r.append(", error=");
            return android.support.v4.media.a.j(r, this.error, ')');
        }
    }
}
