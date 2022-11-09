// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/communitycreation/SubredditNameValidationResult;", "", "isValid", "", "errorMessage", "", "errorCode", "(ZLjava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getErrorMessage", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditNameValidationResult
{
    private final String errorCode;
    private final String errorMessage;
    private final boolean isValid;
    
    public SubredditNameValidationResult(final boolean isValid, final String errorMessage, final String errorCode) {
        this.isValid = isValid;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
    
    public final boolean component1() {
        return this.isValid;
    }
    
    public final String component2() {
        return this.errorMessage;
    }
    
    public final String component3() {
        return this.errorCode;
    }
    
    public final SubredditNameValidationResult copy(final boolean b, final String s, final String s2) {
        return new SubredditNameValidationResult(b, s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditNameValidationResult)) {
            return false;
        }
        final SubredditNameValidationResult subredditNameValidationResult = (SubredditNameValidationResult)o;
        return this.isValid == subredditNameValidationResult.isValid && f.a((Object)this.errorMessage, (Object)subredditNameValidationResult.errorMessage) && f.a((Object)this.errorCode, (Object)subredditNameValidationResult.errorCode);
    }
    
    public final String getErrorCode() {
        return this.errorCode;
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    @Override
    public int hashCode() {
        int isValid;
        if ((isValid = (this.isValid ? 1 : 0)) != 0) {
            isValid = 1;
        }
        final String errorMessage = this.errorMessage;
        int hashCode = 0;
        int hashCode2;
        if (errorMessage == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = errorMessage.hashCode();
        }
        final String errorCode = this.errorCode;
        if (errorCode != null) {
            hashCode = errorCode.hashCode();
        }
        return (isValid * 31 + hashCode2) * 31 + hashCode;
    }
    
    public final boolean isValid() {
        return this.isValid;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditNameValidationResult(isValid=");
        k.append(this.isValid);
        k.append(", errorMessage=");
        k.append(this.errorMessage);
        k.append(", errorCode=");
        return b.k(k, this.errorCode, ')');
    }
}
