// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/UpdateResponse;", "", "success", "", "errorMessage", "", "(ZLjava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UpdateResponse
{
    private final String errorMessage;
    private final boolean success;
    
    public UpdateResponse(final boolean success, final String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }
    
    public final boolean component1() {
        return this.success;
    }
    
    public final String component2() {
        return this.errorMessage;
    }
    
    public final UpdateResponse copy(final boolean b, final String s) {
        return new UpdateResponse(b, s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResponse)) {
            return false;
        }
        final UpdateResponse updateResponse = (UpdateResponse)o;
        return this.success == updateResponse.success && f.a((Object)this.errorMessage, (Object)updateResponse.errorMessage);
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    public final boolean getSuccess() {
        return this.success;
    }
    
    @Override
    public int hashCode() {
        int success;
        if ((success = (this.success ? 1 : 0)) != 0) {
            success = 1;
        }
        final String errorMessage = this.errorMessage;
        int hashCode;
        if (errorMessage == null) {
            hashCode = 0;
        }
        else {
            hashCode = errorMessage.hashCode();
        }
        return success * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("UpdateResponse(success=");
        k.append(this.success);
        k.append(", errorMessage=");
        return b.k(k, this.errorMessage, ')');
    }
}
