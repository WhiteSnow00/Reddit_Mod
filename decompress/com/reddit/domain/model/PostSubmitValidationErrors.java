// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/PostSubmitValidationErrors;", "", "Lcom/reddit/domain/model/ErrorField;", "errorField", "Lhg2/j;", "hideValidationError", "hideAllValidationErrors", "Lcom/reddit/domain/model/ValidationError;", "component1", "component2", "component3", "titleError", "flairError", "contentError", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/reddit/domain/model/ValidationError;", "getTitleError", "()Lcom/reddit/domain/model/ValidationError;", "getFlairError", "getContentError", "<init>", "(Lcom/reddit/domain/model/ValidationError;Lcom/reddit/domain/model/ValidationError;Lcom/reddit/domain/model/ValidationError;)V", "model_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostSubmitValidationErrors
{
    private final ValidationError contentError;
    private final ValidationError flairError;
    private final ValidationError titleError;
    
    public PostSubmitValidationErrors(final ValidationError titleError, final ValidationError flairError, final ValidationError contentError) {
        this.titleError = titleError;
        this.flairError = flairError;
        this.contentError = contentError;
    }
    
    public final ValidationError component1() {
        return this.titleError;
    }
    
    public final ValidationError component2() {
        return this.flairError;
    }
    
    public final ValidationError component3() {
        return this.contentError;
    }
    
    public final PostSubmitValidationErrors copy(final ValidationError validationError, final ValidationError validationError2, final ValidationError validationError3) {
        return new PostSubmitValidationErrors(validationError, validationError2, validationError3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostSubmitValidationErrors)) {
            return false;
        }
        final PostSubmitValidationErrors postSubmitValidationErrors = (PostSubmitValidationErrors)o;
        return e.a((Object)this.titleError, (Object)postSubmitValidationErrors.titleError) && e.a((Object)this.flairError, (Object)postSubmitValidationErrors.flairError) && e.a((Object)this.contentError, (Object)postSubmitValidationErrors.contentError);
    }
    
    public final ValidationError getContentError() {
        return this.contentError;
    }
    
    public final ValidationError getFlairError() {
        return this.flairError;
    }
    
    public final ValidationError getTitleError() {
        return this.titleError;
    }
    
    @Override
    public int hashCode() {
        final ValidationError titleError = this.titleError;
        int hashCode = 0;
        int hashCode2;
        if (titleError == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = titleError.hashCode();
        }
        final ValidationError flairError = this.flairError;
        int hashCode3;
        if (flairError == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = flairError.hashCode();
        }
        final ValidationError contentError = this.contentError;
        if (contentError != null) {
            hashCode = contentError.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void hideAllValidationErrors() {
        this.hideValidationError(ErrorField.TITLE);
        this.hideValidationError(ErrorField.FLAIR);
        this.hideValidationError(ErrorField.BODY);
    }
    
    public final void hideValidationError(final ErrorField errorField) {
        e.f((Object)errorField, "errorField");
        final int n = PostSubmitValidationErrors.PostSubmitValidationErrors$WhenMappings.$EnumSwitchMapping$0[((Enum)errorField).ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3 || n == 4) {
                    final ValidationError contentError = this.contentError;
                    if (contentError != null) {
                        contentError.setVisible(false);
                    }
                }
            }
            else {
                final ValidationError flairError = this.flairError;
                if (flairError != null) {
                    flairError.setVisible(false);
                }
            }
        }
        else {
            final ValidationError titleError = this.titleError;
            if (titleError != null) {
                titleError.setVisible(false);
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("PostSubmitValidationErrors(titleError=");
        r.append(this.titleError);
        r.append(", flairError=");
        r.append(this.flairError);
        r.append(", contentError=");
        r.append(this.contentError);
        r.append(')');
        return r.toString();
    }
}
