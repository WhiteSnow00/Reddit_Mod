// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.appcompat.widget.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/ValidationError;", "", "errorMessage", "", "isVisible", "", "(Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "()Z", "setVisible", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ValidationError
{
    private final String errorMessage;
    private boolean isVisible;
    
    public ValidationError(final String errorMessage, final boolean isVisible) {
        f.f((Object)errorMessage, "errorMessage");
        this.errorMessage = errorMessage;
        this.isVisible = isVisible;
    }
    
    public final String component1() {
        return this.errorMessage;
    }
    
    public final boolean component2() {
        return this.isVisible;
    }
    
    public final ValidationError copy(final String s, final boolean b) {
        f.f((Object)s, "errorMessage");
        return new ValidationError(s, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationError)) {
            return false;
        }
        final ValidationError validationError = (ValidationError)o;
        return f.a((Object)this.errorMessage, (Object)validationError.errorMessage) && this.isVisible == validationError.isVisible;
    }
    
    public final String getErrorMessage() {
        return this.errorMessage;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.errorMessage.hashCode();
        int isVisible;
        if ((isVisible = (this.isVisible ? 1 : 0)) != 0) {
            isVisible = 1;
        }
        return hashCode * 31 + isVisible;
    }
    
    public final boolean isVisible() {
        return this.isVisible;
    }
    
    public final void setVisible(final boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ValidationError(errorMessage=");
        k.append(this.errorMessage);
        k.append(", isVisible=");
        return s0.o(k, this.isVisible, ')');
    }
}
